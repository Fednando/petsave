package br.com.aula.petsave.common.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJW\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lbr/com/aula/petsave/common/data/api/PetFinderApi;", "", "getNearByAnimals", "Lbr/com/aula/petsave/common/data/api/model/ApiPaginatedAnimals;", "pageToLoad", "", "pageSize", "postalCode", "", "maxDistance", "(IILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchAnimalsBy", "name", "age", "type", "postcode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_release"})
public abstract interface PetFinderApi {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "animals")
    public abstract java.lang.Object getNearByAnimals(@retrofit2.http.Query(value = "page")
    int pageToLoad, @retrofit2.http.Query(value = "limit")
    int pageSize, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "location")
    java.lang.String postalCode, @retrofit2.http.Query(value = "distance")
    int maxDistance, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super br.com.aula.petsave.common.data.api.model.ApiPaginatedAnimals> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "animals")
    public abstract java.lang.Object searchAnimalsBy(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "age")
    java.lang.String age, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "type")
    java.lang.String type, @retrofit2.http.Query(value = "page")
    int pageToLoad, @retrofit2.http.Query(value = "limit")
    int pageSize, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "location")
    java.lang.String postcode, @retrofit2.http.Query(value = "distance")
    int maxDistance, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super br.com.aula.petsave.common.data.api.model.ApiPaginatedAnimals> continuation);
}