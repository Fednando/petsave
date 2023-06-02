package br.com.aula.petsave.common.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00120\u0017H\u0016J\u0011\u0010\u0019\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ)\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00172\u0006\u0010!\u001a\u00020\"H\u0016J\u001f\u0010&\u001a\u00020\'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J!\u0010+\u001a\u00020\'2\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006/"}, d2 = {"Lbr/com/aula/petsave/common/data/PetFinderAnimalRepository;", "Lbr/com/aula/petsave/common/domain/repository/AnimalRepository;", "api", "Lbr/com/aula/petsave/common/data/api/PetFinderApi;", "cache", "Lbr/com/aula/petsave/common/data/cache/Cache;", "preferences", "Lbr/com/aula/petsave/common/data/preferences/Preferences;", "apiAnimalMapper", "Lbr/com/aula/petsave/common/data/api/model/mappers/ApiAnimalMapper;", "apiPaginationMapper", "Lbr/com/aula/petsave/common/data/api/model/mappers/ApiPaginationMapper;", "(Lbr/com/aula/petsave/common/data/api/PetFinderApi;Lbr/com/aula/petsave/common/data/cache/Cache;Lbr/com/aula/petsave/common/data/preferences/Preferences;Lbr/com/aula/petsave/common/data/api/model/mappers/ApiAnimalMapper;Lbr/com/aula/petsave/common/data/api/model/mappers/ApiPaginationMapper;)V", "maxDistanceMiles", "", "postalCode", "", "getAnimalAges", "", "Lbr/com/aula/petsave/common/domain/model/animal/details/Age;", "getAnimalTypes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAnimals", "Lio/reactivex/Flowable;", "Lbr/com/aula/petsave/common/domain/model/animal/Animal;", "onboardingIsComplete", "", "requestMoreAnimals", "Lbr/com/aula/petsave/common/domain/model/pagination/PaginatedAnimals;", "pageToLoad", "numberOfItems", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchAnimalsRemotely", "searchParameters", "Lbr/com/aula/petsave/common/domain/model/search/SearchParameters;", "(ILbr/com/aula/petsave/common/domain/model/search/SearchParameters;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchCachedAnimalsBy", "Lbr/com/aula/petsave/common/domain/model/search/SearchResults;", "storeAnimals", "", "animals", "Lbr/com/aula/petsave/common/domain/model/animal/details/AnimalWithDetails;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeOnboardingData", "postcode", "distance", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_debug"})
public final class PetFinderAnimalRepository implements br.com.aula.petsave.common.domain.repository.AnimalRepository {
    private final br.com.aula.petsave.common.data.api.PetFinderApi api = null;
    private final br.com.aula.petsave.common.data.cache.Cache cache = null;
    private final br.com.aula.petsave.common.data.preferences.Preferences preferences = null;
    private final br.com.aula.petsave.common.data.api.model.mappers.ApiAnimalMapper apiAnimalMapper = null;
    private final br.com.aula.petsave.common.data.api.model.mappers.ApiPaginationMapper apiPaginationMapper = null;
    private final java.lang.String postalCode = "07097";
    private final int maxDistanceMiles = 100;
    
    @javax.inject.Inject
    public PetFinderAnimalRepository(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.api.PetFinderApi api, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.cache.Cache cache, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.preferences.Preferences preferences, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.api.model.mappers.ApiAnimalMapper apiAnimalMapper, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.api.model.mappers.ApiPaginationMapper apiPaginationMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Flowable<java.util.List<br.com.aula.petsave.common.domain.model.animal.Animal>> getAnimals() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object requestMoreAnimals(int pageToLoad, int numberOfItems, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super br.com.aula.petsave.common.domain.model.pagination.PaginatedAnimals> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object storeAnimals(@org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.domain.model.animal.details.AnimalWithDetails> animals, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAnimalTypes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<br.com.aula.petsave.common.domain.model.animal.details.Age> getAnimalAges() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Flowable<br.com.aula.petsave.common.domain.model.search.SearchResults> searchCachedAnimalsBy(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.search.SearchParameters searchParameters) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object searchAnimalsRemotely(int pageToLoad, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.search.SearchParameters searchParameters, int numberOfItems, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super br.com.aula.petsave.common.domain.model.pagination.PaginatedAnimals> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object storeOnboardingData(@org.jetbrains.annotations.NotNull
    java.lang.String postcode, int distance, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object onboardingIsComplete(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}