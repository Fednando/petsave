package br.com.aula.petsave.common.domain.repository

import br.com.aula.petsave.common.domain.model.animal.Animal
import br.com.aula.petsave.common.domain.model.animal.details.Age
import br.com.aula.petsave.common.domain.model.animal.details.AnimalWithDetails
import br.com.aula.petsave.common.domain.model.pagination.PaginatedAnimals
import br.com.aula.petsave.common.domain.model.search.SearchParameters
import br.com.aula.petsave.common.domain.model.search.SearchResults
import io.reactivex.Flowable
import java.util.*

interface AnimalRepository {
    fun getAnimals(): Flowable<List<Animal>>
    suspend fun requestMoreAnimals(pageToLoad: Int, numberOfItems: Int): PaginatedAnimals
    suspend fun storeAnimals(animals: List<AnimalWithDetails>)
    suspend fun getAnimalTypes(): List<String>
    fun getAnimalAges(): List<Age>
    fun searchCachedAnimalsBy(searchParameters: SearchParameters): Flowable<SearchResults>
    suspend fun searchAnimalsRemotely(
        pageToLoad: Int,
        searchParameters: SearchParameters,
        numberOfItems: Int
    ): PaginatedAnimals

    suspend fun storeOnboardingData(postcode: String, distance: Int)
    suspend fun onboardingIsComplete(): Boolean
}