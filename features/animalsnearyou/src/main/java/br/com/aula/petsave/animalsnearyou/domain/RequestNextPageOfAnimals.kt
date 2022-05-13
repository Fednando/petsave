package br.com.aula.petsave.common.presentation.animals_near.domain

import br.com.aula.petsave.common.domain.model.NoMoreAnimalsException
import br.com.aula.petsave.common.domain.model.pagination.Pagination
import br.com.aula.petsave.common.domain.repository.AnimalRepository
import javax.inject.Inject

class RequestNextPageOfAnimals @Inject constructor(
    private val animalRepository: AnimalRepository
) {

    suspend operator fun invoke(
        pageToLoad: Int,
        pageSize: Int = Pagination.DEFAULT_PAGE_SIZE
    ) : Pagination {

        val (animals, pagination) = animalRepository.requestMoreAnimals(pageToLoad, pageSize)
        if(animals.isEmpty()){
            throw  NoMoreAnimalsException("No animals nearby :(")
        }

        animalRepository.storeAnimals(animals)
        return pagination
    }
}