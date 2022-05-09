package br.com.aula.petsave.common.data

import br.com.aula.petsave.common.data.api.PetFinderApi
import br.com.aula.petsave.common.data.api.model.mappers.ApiAnimalMapper
import br.com.aula.petsave.common.data.api.model.mappers.ApiPaginationMapper
import br.com.aula.petsave.common.data.cache.Cache
import br.com.aula.petsave.common.data.cache.model.cachedorganization.CachedOrganization
import br.com.aula.petsave.common.domain.model.animal.Animal
import br.com.aula.petsave.common.domain.model.animal.details.AnimalWithDetails
import br.com.aula.petsave.common.domain.model.pagination.PaginatedAnimals
import br.com.aula.petsave.common.domain.repository.AnimalRepository
import com.raywenderlich.android.petsave.common.data.cache.model.cachedanimal.CachedAnimalAggregate
import io.reactivex.Flowable
import javax.inject.Inject

class PetFinderAnimalRepository @Inject constructor(
    private val api: PetFinderApi,
    private val cache: Cache,
    private val apiAnimalMapper: ApiAnimalMapper,
    private val apiPaginationMapper: ApiPaginationMapper
): AnimalRepository {

    private val postalCode = "07097"
    private val maxDistanceMiles = 100


    override fun getAnimals(): Flowable<List<Animal>> {
        return cache.getNearbyAnimals()
            .distinctUntilChanged()
            .map { animalList ->
                animalList.map {
                    it.animal.toAnimalDomain(
                        it.photos,
                        it.videos,
                        it.tags)
                }
            }
    }

    override suspend fun requestMoreAnimals(pageToLoad: Int, numberOfItems: Int): PaginatedAnimals {
        val (apiAnimals, apiPagination) = api.getNearByAnimals(
            pageToLoad,
            numberOfItems,
            postalCode,
            maxDistanceMiles
        )

        return PaginatedAnimals(
            apiAnimals?.map{
                apiAnimalMapper.mapToDomain(it)
            }.orEmpty(),
            apiPaginationMapper.mapToDomain(apiPagination)
        )
    }

    override suspend fun storeAnimals(animals: List<AnimalWithDetails>) {
        val organization = animals.map {
            CachedOrganization.fromDomain(it.details.organization)
        }

        cache.storeOrganizations(organization)
        cache.storeNearbyAnimals(animals.map { CachedAnimalAggregate.fromDomain(it) })
    }
}