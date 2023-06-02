package br.com.aula.petsave.common.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lbr/com/aula/petsave/common/data/di/CacheModule;", "", "()V", "bindCache", "Lbr/com/aula/petsave/common/data/cache/Cache;", "cache", "Lbr/com/aula/petsave/common/data/cache/RoomCache;", "Companion", "common_release"})
@dagger.Module
public abstract class CacheModule {
    @org.jetbrains.annotations.NotNull
    public static final br.com.aula.petsave.common.data.di.CacheModule.Companion Companion = null;
    
    public CacheModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract br.com.aula.petsave.common.data.cache.Cache bindCache(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.cache.RoomCache cache);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\f"}, d2 = {"Lbr/com/aula/petsave/common/data/di/CacheModule$Companion;", "", "()V", "provideAnimalsDao", "Lcom/raywenderlich/android/petsave/common/data/cache/daos/AnimalsDao;", "petSaveDatabase", "Lbr/com/aula/petsave/common/data/cache/PetSaveDatabase;", "provideDatabase", "context", "Landroid/content/Context;", "provideOrganizationsDao", "Lbr/com/aula/petsave/common/data/cache/daos/OrganizationsDao;", "common_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @javax.inject.Singleton
        @dagger.Provides
        public final br.com.aula.petsave.common.data.cache.PetSaveDatabase provideDatabase(@org.jetbrains.annotations.NotNull
        @dagger.hilt.android.qualifiers.ApplicationContext
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @dagger.Provides
        public final com.raywenderlich.android.petsave.common.data.cache.daos.AnimalsDao provideAnimalsDao(@org.jetbrains.annotations.NotNull
        br.com.aula.petsave.common.data.cache.PetSaveDatabase petSaveDatabase) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @dagger.Provides
        public final br.com.aula.petsave.common.data.cache.daos.OrganizationsDao provideOrganizationsDao(@org.jetbrains.annotations.NotNull
        br.com.aula.petsave.common.data.cache.PetSaveDatabase petSaveDatabase) {
            return null;
        }
    }
}