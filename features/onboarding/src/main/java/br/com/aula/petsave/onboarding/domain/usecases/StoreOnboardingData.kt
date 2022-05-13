package br.com.aula.petsave.onboarding.domain.usecases

import br.com.aula.petsave.common.domain.repository.AnimalRepository
import javax.inject.Inject

class StoreOnboardingData @Inject constructor(
    private val repository: AnimalRepository
) {

  suspend operator fun invoke(postcode: String, distance: String) {
    repository.storeOnboardingData(postcode, distance.toInt())
  }
}
