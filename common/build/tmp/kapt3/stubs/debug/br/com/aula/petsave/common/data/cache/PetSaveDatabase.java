package br.com.aula.petsave.common.data.cache;

import java.lang.System;

@androidx.room.Database(entities = {br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedPhoto.class, br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedVideo.class, br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedTag.class, br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalWithDetails.class, br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalTagCrossRef.class, br.com.aula.petsave.common.data.cache.model.cachedorganization.CachedOrganization.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lbr/com/aula/petsave/common/data/cache/PetSaveDatabase;", "Landroidx/room/RoomDatabase;", "()V", "animalsDao", "Lcom/raywenderlich/android/petsave/common/data/cache/daos/AnimalsDao;", "organizationsDao", "Lbr/com/aula/petsave/common/data/cache/daos/OrganizationsDao;", "common_debug"})
public abstract class PetSaveDatabase extends androidx.room.RoomDatabase {
    
    public PetSaveDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract br.com.aula.petsave.common.data.cache.daos.OrganizationsDao organizationsDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.raywenderlich.android.petsave.common.data.cache.daos.AnimalsDao animalsDao();
}