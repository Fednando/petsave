package br.com.aula.petsave.search.domain.usecases

import br.com.aula.petsave.common.domain.model.animal.details.Age
import br.com.aula.petsave.common.domain.model.search.SearchFilters
import java.util.*
import javax.inject.Inject
import br.com.aula.petsave.common.domain.repository.AnimalRepository

class GetSearchFilters @Inject constructor(private val animalRepository: AnimalRepository) {

  companion object {
    const val NO_FILTER_SELECTED = "Any"
  }

  suspend operator fun invoke(): SearchFilters {
    val unknown = Age.UNKNOWN.name

    val types = listOf(NO_FILTER_SELECTED) + animalRepository.getAnimalTypes()

    val ages = animalRepository.getAnimalAges()
        .map {
          if (it.name == unknown) {
            NO_FILTER_SELECTED
          }
          else {
            it.name.toLowerCase(Locale.ROOT).capitalize(Locale.ROOT)
          }
        }

    return SearchFilters(ages, types)
  }
}