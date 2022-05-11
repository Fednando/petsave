package br.com.aula.petsave.common.presentation.search.domain

import br.com.aula.petsave.common.domain.model.animal.details.Age
import br.com.aula.petsave.common.domain.repository.AnimalRepository
import br.com.aula.petsave.common.presentation.search.domain.model.SearchFilters
import java.util.*
import javax.inject.Inject

class GetSearchFilters @Inject constructor(
    private val animalRepository: AnimalRepository
) {

    companion object {
        const val NO_FILTER_SELECTED = "Any"
    }

    suspend operator fun invoke() : SearchFilters {
        val unknown = Age.UNKNOWN.name

        val types = listOf(NO_FILTER_SELECTED) + animalRepository.getAnimalTypes()

        val ages = animalRepository.getAnimalAges()
            .map {
                if(it.name == unknown){
                    NO_FILTER_SELECTED
                } else {
                    it.name.toLowerCase(Locale.ROOT).capitalize(Locale.ROOT)
                }
            }
        return SearchFilters(ages, types)
    }
}