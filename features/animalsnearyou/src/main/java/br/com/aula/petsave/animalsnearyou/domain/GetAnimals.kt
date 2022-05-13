package br.com.aula.petsave.common.presentation.animals_near.domain

import br.com.aula.petsave.common.domain.repository.AnimalRepository
import javax.inject.Inject

class GetAnimals @Inject constructor(
    private val animalRepository: AnimalRepository
){
    operator fun invoke() = animalRepository.getAnimals()
        .filter { it.isNotEmpty() }
}