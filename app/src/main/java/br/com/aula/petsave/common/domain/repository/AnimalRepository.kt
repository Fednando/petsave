package br.com.aula.petsave.common.domain.repository

import br.com.aula.petsave.common.domain.model.animal.Animal
import br.com.aula.petsave.common.domain.model.animal.details.AnimalWithDetails
import br.com.aula.petsave.common.domain.model.pagination.PaginatedAnimals
import io.reactivex.Flowable

interface AnimalRepository {
    fun getAnimals() : Flowable<List<Animal>>
    suspend fun requestMoreAnimals(pageToLoad: Int, numberOfItems : Int) : PaginatedAnimals
    suspend fun storeAnimals(animals: List<AnimalWithDetails>)
}