package br.com.aula.petsave.common.presentation.animals_near;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;
import java.lang.String;

@OriginatingElement(
    topLevelClass = AnimalNearYourFragmentViewModel.class
)
public final class AnimalNearYourFragmentViewModel_HiltModules {
  private AnimalNearYourFragmentViewModel_HiltModules() {
  }

  @Module
  @InstallIn(ViewModelComponent.class)
  public abstract static class BindsModule {
    private BindsModule() {
    }

    @Binds
    @IntoMap
    @StringKey("br.com.aula.petsave.common.presentation.animals_near.AnimalNearYourFragmentViewModel")
    @HiltViewModelMap
    public abstract ViewModel binds(AnimalNearYourFragmentViewModel vm);
  }

  @Module
  @InstallIn(ActivityRetainedComponent.class)
  public static final class KeyModule {
    private KeyModule() {
    }

    @Provides
    @IntoSet
    @HiltViewModelMap.KeySet
    public static String provide() {
      return "br.com.aula.petsave.common.presentation.animals_near.AnimalNearYourFragmentViewModel";
    }
  }
}
