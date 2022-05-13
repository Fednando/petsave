package br.com.aula.petsave.main.domain.usecases

import br.com.aula.petsave.common.domain.repository.AnimalRepository
import javax.inject.Inject

class OnboardingIsComplete @Inject constructor(
    private val repository: AnimalRepository
) {
  suspend operator fun invoke() = repository.onboardingIsComplete()
}
