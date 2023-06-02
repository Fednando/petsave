package br.com.aula.petsave.common.data.cache;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0007H&J,\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H&J\u001f\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lbr/com/aula/petsave/common/data/cache/Cache;", "", "getAllTypes", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNearbyAnimals", "Lio/reactivex/Flowable;", "Lcom/raywenderlich/android/petsave/common/data/cache/model/cachedanimal/CachedAnimalAggregate;", "searchAnimalsBy", "name", "age", "type", "storeNearbyAnimals", "", "animals", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeOrganizations", "organizations", "Lbr/com/aula/petsave/common/data/cache/model/cachedorganization/CachedOrganization;", "common_debug"})
public abstract interface Cache {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object storeOrganizations(@org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedorganization.CachedOrganization> organizations, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Flowable<java.util.List<com.raywenderlich.android.petsave.common.data.cache.model.cachedanimal.CachedAnimalAggregate>> getNearbyAnimals();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object storeNearbyAnimals(@org.jetbrains.annotations.NotNull
    java.util.List<com.raywenderlich.android.petsave.common.data.cache.model.cachedanimal.CachedAnimalAggregate> animals, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllTypes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Flowable<java.util.List<com.raywenderlich.android.petsave.common.data.cache.model.cachedanimal.CachedAnimalAggregate>> searchAnimalsBy(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String age, @org.jetbrains.annotations.NotNull
    java.lang.String type);
}