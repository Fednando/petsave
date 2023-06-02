package br.com.aula.petsave.common.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lbr/com/aula/petsave/common/data/di/PreferencesModule;", "", "()V", "providePreferences", "Lbr/com/aula/petsave/common/data/preferences/Preferences;", "preferences", "Lbr/com/aula/petsave/common/data/preferences/PetSavePreferences;", "common_debug"})
@dagger.Module
public abstract class PreferencesModule {
    
    public PreferencesModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract br.com.aula.petsave.common.data.preferences.Preferences providePreferences(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.preferences.PetSavePreferences preferences);
}