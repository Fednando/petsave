// Generated by Dagger (https://dagger.dev).
package br.com.aula.petsave.common.presentation.animals_near.domain;

import br.com.aula.petsave.common.domain.repository.AnimalRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetAnimals_Factory implements Factory<GetAnimals> {
  private final Provider<AnimalRepository> animalRepositoryProvider;

  public GetAnimals_Factory(Provider<AnimalRepository> animalRepositoryProvider) {
    this.animalRepositoryProvider = animalRepositoryProvider;
  }

  @Override
  public GetAnimals get() {
    return newInstance(animalRepositoryProvider.get());
  }

  public static GetAnimals_Factory create(Provider<AnimalRepository> animalRepositoryProvider) {
    return new GetAnimals_Factory(animalRepositoryProvider);
  }

  public static GetAnimals newInstance(AnimalRepository animalRepository) {
    return new GetAnimals(animalRepository);
  }
}
