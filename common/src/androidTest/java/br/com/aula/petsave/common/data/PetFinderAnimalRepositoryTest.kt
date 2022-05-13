package br.com.aula.petsave.common.data

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import br.com.aula.petsave.common.data.api.PetFinderApi
import br.com.aula.petsave.common.data.api.model.mappers.ApiAnimalMapper
import br.com.aula.petsave.common.data.api.model.mappers.ApiPaginationMapper
import br.com.aula.petsave.common.data.api.utils.FakeServer
import br.com.aula.petsave.common.data.cache.Cache
import br.com.aula.petsave.common.data.cache.PetSaveDatabase
import br.com.aula.petsave.common.data.cache.RoomCache
import br.com.aula.petsave.common.data.di.CacheModule
import br.com.aula.petsave.common.data.di.PreferencesModule
import br.com.aula.petsave.common.data.di.TestPreferencesModule
import br.com.aula.petsave.common.data.preferences.FakePreferences
import br.com.aula.petsave.common.data.preferences.Preferences
import br.com.aula.petsave.common.domain.repository.AnimalRepository
import com.google.common.truth.Truth
import dagger.hilt.android.testing.BindValue
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.UninstallModules
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.threeten.bp.Instant
import retrofit2.Retrofit
import javax.inject.Inject

@HiltAndroidTest
@UninstallModules(PreferencesModule::class, TestPreferencesModule::class, CacheModule::class)
class PetFinderAnimalRepositoryTest {
    private val fakeServer = FakeServer()
    private lateinit var repository: AnimalRepository
    private lateinit var api: PetFinderApi

    @BindValue
    @JvmField
    val preference: Preferences = FakePreferences()

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    lateinit var cache: Cache

    @Inject
    lateinit var database: PetSaveDatabase

    @Inject
    lateinit var retrofitBuilder: Retrofit.Builder

    @Inject
    lateinit var apiAnimalMapper: ApiAnimalMapper

    @Inject
    lateinit var apiPaginationMapper: ApiPaginationMapper


    @Before
    fun setup() {
        fakeServer.start() // This will start the MockWebServer instance

        // Replece the original Preferences binding.
        preference.deleteTokenInfo()
        preference.putToken("validToken")
        preference.putTokenExpirationTime(
            Instant.now().plusSeconds(3600).epochSecond
        )

        preference.putTokenType("Bearer")

        // You've configured all the dependencies, so you're ready for Hilt to inject them
        hiltRule.inject()

        // Creatint PetFinderApi with endpoint
        api = retrofitBuilder
            .baseUrl(fakeServer.baseEndpoint)
            .build()
            .create(PetFinderApi::class.java)

        cache = RoomCache(database.animalsDao(), database.organizationsDao())

        // Creating repository instance
        repository = PetFinderAnimalRepository(
            api,
            cache,
            apiAnimalMapper,
            apiPaginationMapper
        )
    }

    @After // This just shuts off the server
    fun teardown() {
        fakeServer.shutdown()
    }

    @Test
    fun requestMoreAnimals_success() = runBlocking {

        // Given
        val expectedAnimalId = 124L
        fakeServer.setHappyPathDispatcher()

        //When
        val paginatedAnimals = repository.requestMoreAnimals(1, 100)

        //Then
        val animal = paginatedAnimals.animals.first()
        Truth.assertThat(animal.id).isEqualTo(expectedAnimalId)
    }

    @Test
    fun insertAnimals_success() {
        // Give
        val expectedAnimalId = 124L

        runBlocking {
            fakeServer.setHappyPathDispatcher()

            // The code uses the mocked data that MockWebServer returns
            val paginatedAnimals = repository.requestMoreAnimals(1, 100) // 1

            val animal = paginatedAnimals.animals.first()

            // When
            repository.storeAnimals(listOf(animal)) // You store the animal
        }

        //Then
        //Subscribe to the getAnimals stream. Calling test() on it returns special TestObserver
        // that allows you to assess both its state and the streams
        val testObserver = repository.getAnimals().test() // 3

        // Using the test observer, you assert that there were no errors on the stream and it didn't
        // complete.
        testObserver.assertNoErrors() // 4
        testObserver.assertNotComplete()
        testObserver.assertValue { it.first().id == expectedAnimalId }

    }
}