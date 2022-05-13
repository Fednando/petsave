package br.com.aula.petsave.common.presentation.model.mappers

import br.com.aula.petsave.common.domain.model.animal.Animal
import br.com.aula.petsave.common.presentation.model.UIAnimal
import javax.inject.Inject

class UiAnimalMapper @Inject constructor(): UiMapper<Animal, UIAnimal> {
    override fun mapToView(input: Animal): UIAnimal {
        return UIAnimal(
            id = input.id,
            name = input.name,
            photo = input.media.getFirstSmallestAvailablePhoto()
        )
    }
}