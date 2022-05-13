package br.com.aula.petsave.onboarding.presentation

sealed class OnboardingViewEffect {
  object NavigateToAnimalsNearYou : OnboardingViewEffect()
}