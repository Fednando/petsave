package br.com.aula.petsave.common.presentation.search

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.common.truth.Truth.assertThat
import br.com.aula.petsave.common.RxImmediateSchedulerRule
import br.com.aula.petsave.common.TestCoroutineRule
import br.com.aula.petsave.common.data.FakeRepository
import br.com.aula.petsave.common.presentation.Event
import br.com.aula.petsave.common.presentation.model.mappers.UiAnimalMapper
import br.com.aula.petsave.common.presentation.search.domain.GetSearchFilters
import br.com.aula.petsave.common.presentation.search.domain.SearchAnimals
import br.com.aula.petsave.common.presentation.search.domain.SearchAnimalsRemotely
import br.com.aula.petsave.common.utils.DispatchersProvider
import com.google.common.truth.Truth
import io.reactivex.disposables.CompositeDisposable
import kotlinx.coroutines.Dispatchers
import org.junit.*

class SearchFragmentViewModelTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    val testCoroutineRule = TestCoroutineRule()

    @get:Rule
    val rxImmediateThinScheduler = RxImmediateSchedulerRule()

    private lateinit var viewModel: SearchFragmentViewModel
    private lateinit var repository: FakeRepository
    private lateinit var getSearchFilters: GetSearchFilters

    private val uiAnimalsMapper = UiAnimalMapper()

    @Before
    fun setUp() {

        val dispatchersProvider = object : DispatchersProvider {
            override fun io() = Dispatchers.Main
        }

        repository = FakeRepository()
        getSearchFilters = GetSearchFilters(repository)

        viewModel = SearchFragmentViewModel(
            uiAnimalMapper = uiAnimalsMapper,
            searchAnimalsRemotely = SearchAnimalsRemotely(repository),
            searchAnimals = SearchAnimals(repository),
            getSearchFilters = getSearchFilters,
            dispatchersProvider = dispatchersProvider,
            compositeDisposable = CompositeDisposable()
        )
    }

    @Test
    fun `SearchFragmentViewModel remote search with success`() = testCoroutineRule.runBlockingTest {
        // Given
        val (name, age, type) = repository.remotelySearchableAnimal
        val (ages, types) = getSearchFilters()

        val expectedRemoteAnimals = repository.remoteAnimals.map {
            uiAnimalsMapper.mapToView(it)
        }

        viewModel.state.observeForever{}

        val expectedViewState = SearchViewState(
            noSearchQuery = false,
            searchResults = expectedRemoteAnimals,
            ageFilterValues = Event(ages),
            typeFilterValues = Event(types),
            searchingRemotely = false,
            noRemoteResults = false
        )

        // When
        viewModel.onEvent(SearchEvent.PrepareForSearch)
        viewModel.onEvent(SearchEvent.TypeValueSelected(type))
        viewModel.onEvent(SearchEvent.AgeValueSelected(age))
        viewModel.onEvent(SearchEvent.QueryInput(name))

        // Then
        val viewState = viewModel.state.value!!

        assertThat(viewState.noRemoteResults).isEqualTo(expectedViewState.noRemoteResults)
    }

    @After
    fun tearDown() {
    }
}