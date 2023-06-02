// Generated by Dagger (https://dagger.dev).
package br.com.aula.petsave.search.domain.usecases;

import br.com.aula.petsave.common.domain.repository.AnimalRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchAnimalsRemotely_Factory implements Factory<SearchAnimalsRemotely> {
  private final Provider<AnimalRepository> animalRepositoryProvider;

  public SearchAnimalsRemotely_Factory(Provider<AnimalRepository> animalRepositoryProvider) {
    this.animalRepositoryProvider = animalRepositoryProvider;
  }

  @Override
  public SearchAnimalsRemotely get() {
    return newInstance(animalRepositoryProvider.get());
  }

  public static SearchAnimalsRemotely_Factory create(
      Provider<AnimalRepository> animalRepositoryProvider) {
    return new SearchAnimalsRemotely_Factory(animalRepositoryProvider);
  }

  public static SearchAnimalsRemotely newInstance(AnimalRepository animalRepository) {
    return new SearchAnimalsRemotely(animalRepository);
  }
}
