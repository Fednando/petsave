package br.com.aula.petsave.common.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityRetainedComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\f"}, d2 = {"Lbr/com/aula/petsave/common/di/ActivityRetainedModule;", "", "()V", "bindAnimalRepository", "Lbr/com/aula/petsave/common/domain/repository/AnimalRepository;", "repository", "Lbr/com/aula/petsave/common/data/PetFinderAnimalRepository;", "bindDispatchersProvider", "Lbr/com/aula/petsave/common/utils/DispatchersProvider;", "dispatchersProvider", "Lbr/com/aula/petsave/common/utils/CoroutineDispatchersProvider;", "Companion", "common_release"})
@dagger.Module
public abstract class ActivityRetainedModule {
    @org.jetbrains.annotations.NotNull
    public static final br.com.aula.petsave.common.di.ActivityRetainedModule.Companion Companion = null;
    
    public ActivityRetainedModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.hilt.android.scopes.ActivityRetainedScoped
    @dagger.Binds
    public abstract br.com.aula.petsave.common.domain.repository.AnimalRepository bindAnimalRepository(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.PetFinderAnimalRepository repository);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract br.com.aula.petsave.common.utils.DispatchersProvider bindDispatchersProvider(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.utils.CoroutineDispatchersProvider dispatchersProvider);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lbr/com/aula/petsave/common/di/ActivityRetainedModule$Companion;", "", "()V", "provideCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "common_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @dagger.Provides
        public final io.reactivex.disposables.CompositeDisposable provideCompositeDisposable() {
            return null;
        }
    }
}