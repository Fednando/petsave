package com.raywenderlich.android.petsave.common.data.cache.daos;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\'J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJC\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J,\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/raywenderlich/android/petsave/common/data/cache/daos/AnimalsDao;", "", "()V", "getAllAnimals", "Lio/reactivex/Flowable;", "", "Lcom/raywenderlich/android/petsave/common/data/cache/model/cachedanimal/CachedAnimalAggregate;", "getAllTypes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAnimalAggregate", "", "animal", "Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedAnimalWithDetails;", "photos", "Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedPhoto;", "videos", "Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedVideo;", "tags", "Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedTag;", "(Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedAnimalWithDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAnimalsWithDetails", "animalAggregates", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchAnimalsBy", "name", "age", "type", "common_debug"})
public abstract class AnimalsDao {
    
    public AnimalsDao() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM animals ORDER BY animalId DESC")
    @androidx.room.Transaction
    public abstract io.reactivex.Flowable<java.util.List<com.raywenderlich.android.petsave.common.data.cache.model.cachedanimal.CachedAnimalAggregate>> getAllAnimals();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertAnimalAggregate(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalWithDetails animal, @org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedPhoto> photos, @org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedVideo> videos, @org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedTag> tags, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertAnimalsWithDetails(@org.jetbrains.annotations.NotNull
    java.util.List<com.raywenderlich.android.petsave.common.data.cache.model.cachedanimal.CachedAnimalAggregate> animalAggregates, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT DISTINCT type FROM animals")
    public abstract java.lang.Object getAllTypes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "\n    SELECT * FROM animals\n      WHERE name LIKE \'%\' || :name || \'%\' AND\n      AGE LIKE \'%\' || :age || \'%\'\n      AND type LIKE \'%\' || :type || \'%\'\n  ")
    @androidx.room.Transaction
    public abstract io.reactivex.Flowable<java.util.List<com.raywenderlich.android.petsave.common.data.cache.model.cachedanimal.CachedAnimalAggregate>> searchAnimalsBy(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String age, @org.jetbrains.annotations.NotNull
    java.lang.String type);
}