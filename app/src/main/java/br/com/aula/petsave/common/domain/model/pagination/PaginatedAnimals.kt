package br.com.aula.petsave.common.domain.model.pagination

import br.com.aula.petsave.common.domain.model.animal.details.AnimalWithDetails

data class PaginatedAnimals(
    val animals: List<AnimalWithDetails>,
    val pagination: Pagination
)
