package br.com.aula.petsave.common.data.cache;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\fH\u0016J,\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\f2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u001f\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lbr/com/aula/petsave/common/data/cache/RoomCache;", "Lbr/com/aula/petsave/common/data/cache/Cache;", "animalsDao", "Lcom/raywenderlich/android/petsave/common/data/cache/daos/AnimalsDao;", "organizationsDao", "Lbr/com/aula/petsave/common/data/cache/daos/OrganizationsDao;", "(Lcom/raywenderlich/android/petsave/common/data/cache/daos/AnimalsDao;Lbr/com/aula/petsave/common/data/cache/daos/OrganizationsDao;)V", "getAllTypes", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNearbyAnimals", "Lio/reactivex/Flowable;", "Lcom/raywenderlich/android/petsave/common/data/cache/model/cachedanimal/CachedAnimalAggregate;", "searchAnimalsBy", "name", "age", "type", "storeNearbyAnimals", "", "animals", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeOrganizations", "organizations", "Lbr/com/aula/petsave/common/data/cache/model/cachedorganization/CachedOrganization;", "common_release"})
public final class RoomCache implements br.com.aula.petsave.common.data.cache.Cache {
    private final com.raywenderlich.android.petsave.common.data.cache.daos.AnimalsDao animalsDao = null;
    private final br.com.aula.petsave.common.data.cache.daos.OrganizationsDao organizationsDao = null;
    
    @javax.inject.Inject
    public RoomCache(@org.jetbrains.annotations.NotNull
    com.raywenderlich.android.petsave.common.data.cache.daos.AnimalsDao animalsDao, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.cache.daos.OrganizationsDao organizationsDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object storeOrganizations(@org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedorganization.CachedOrganization> organizations, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Flowable<java.util.List<com.raywenderlich.android.petsave.common.data.cache.model.cachedanimal.CachedAnimalAggregate>> getNearbyAnimals() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object storeNearbyAnimals(@org.jetbrains.annotations.NotNull
    java.util.List<com.raywenderlich.android.petsave.common.data.cache.model.cachedanimal.CachedAnimalAggregate> animals, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAllTypes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Flowable<java.util.List<com.raywenderlich.android.petsave.common.data.cache.model.cachedanimal.CachedAnimalAggregate>> searchAnimalsBy(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String age, @org.jetbrains.annotations.NotNull
    java.lang.String type) {
        return null;
    }
}