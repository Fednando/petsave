package br.com.aula.petsave.common.presentation.animals_near

sealed class AnimalsNearYouEvent {
    object RequestInitialAnimalList: AnimalsNearYouEvent()
    object RequestMoreAnimals: AnimalsNearYouEvent()
}