package br.com.aula.petsave.common.domain.model.search

data class SearchFilters(
    val ages: List<String>,
    val types: List<String>
)