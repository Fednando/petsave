package br.com.aula.petsave.common.presentation.animals_near

import br.com.aula.petsave.common.presentation.Event
import br.com.aula.petsave.common.presentation.model.UIAnimal

data class AnimalsNearYouViewState (
    val loading: Boolean = true,
    val animals: List<UIAnimal> = emptyList(),
    val noMoreAnimalsNearBy: Boolean = false,
    val failure: Event<Throwable>? = null
)