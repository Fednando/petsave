package br.com.aula.petsave.common.presentation.search.domain.model

data class SearchFilters(
    val ages: List<String>,
    val types: List<String>
)