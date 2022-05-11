package br.com.aula.petsave.common.presentation.search.domain.model

import br.com.aula.petsave.common.domain.model.animal.Animal


data class SearchResults(
    val animals: List<Animal>,
    val searchParameters: SearchParameters
)