package br.com.aula.petsave.common.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\tH&J\u0011\u0010\u000b\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J)\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\t2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u001f\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lbr/com/aula/petsave/common/domain/repository/AnimalRepository;", "", "getAnimalAges", "", "Lbr/com/aula/petsave/common/domain/model/animal/details/Age;", "getAnimalTypes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAnimals", "Lio/reactivex/Flowable;", "Lbr/com/aula/petsave/common/domain/model/animal/Animal;", "onboardingIsComplete", "", "requestMoreAnimals", "Lbr/com/aula/petsave/common/domain/model/pagination/PaginatedAnimals;", "pageToLoad", "", "numberOfItems", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchAnimalsRemotely", "searchParameters", "Lbr/com/aula/petsave/common/domain/model/search/SearchParameters;", "(ILbr/com/aula/petsave/common/domain/model/search/SearchParameters;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchCachedAnimalsBy", "Lbr/com/aula/petsave/common/domain/model/search/SearchResults;", "storeAnimals", "", "animals", "Lbr/com/aula/petsave/common/domain/model/animal/details/AnimalWithDetails;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeOnboardingData", "postcode", "distance", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_debug"})
public abstract interface AnimalRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Flowable<java.util.List<br.com.aula.petsave.common.domain.model.animal.Animal>> getAnimals();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object requestMoreAnimals(int pageToLoad, int numberOfItems, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super br.com.aula.petsave.common.domain.model.pagination.PaginatedAnimals> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object storeAnimals(@org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.domain.model.animal.details.AnimalWithDetails> animals, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAnimalTypes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<br.com.aula.petsave.common.domain.model.animal.details.Age> getAnimalAges();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Flowable<br.com.aula.petsave.common.domain.model.search.SearchResults> searchCachedAnimalsBy(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.search.SearchParameters searchParameters);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object searchAnimalsRemotely(int pageToLoad, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.search.SearchParameters searchParameters, int numberOfItems, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super br.com.aula.petsave.common.domain.model.pagination.PaginatedAnimals> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object storeOnboardingData(@org.jetbrains.annotations.NotNull
    java.lang.String postcode, int distance, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object onboardingIsComplete(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
}