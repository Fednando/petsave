package br.com.aula.petsave.common.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\fH\u0016J\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0#H\u0016J\u0011\u0010$\u001a\u00020%H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J!\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J)\u0010,\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u0002000#2\u0006\u0010-\u001a\u00020\u001aH\u0016J\u001f\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J!\u00105\u001a\u0002022\u0006\u00106\u001a\u00020 2\u0006\u00107\u001a\u00020)H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J\f\u00109\u001a\u00020\r*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006:"}, d2 = {"Lbr/com/aula/petsave/common/data/FakeRepository;", "Lbr/com/aula/petsave/common/domain/repository/AnimalRepository;", "()V", "habitatAdaptation", "Lbr/com/aula/petsave/common/domain/model/animal/details/HabitatAdaptation;", "healthDetails", "Lbr/com/aula/petsave/common/domain/model/animal/details/HealthDetails;", "localAnimal", "Lbr/com/aula/petsave/common/domain/model/animal/details/AnimalWithDetails;", "localAnimalDetails", "Lbr/com/aula/petsave/common/domain/model/animal/details/Details;", "localAnimals", "", "Lbr/com/aula/petsave/common/domain/model/animal/Animal;", "getLocalAnimals", "()Ljava/util/List;", "mutableLocalAnimals", "", "mutableRemoteAnimals", "organization", "Lbr/com/aula/petsave/common/domain/model/organization/Organization;", "remoteAnimal", "remoteAnimalDetails", "remoteAnimals", "getRemoteAnimals", "remotelySearchableAnimal", "Lbr/com/aula/petsave/common/domain/model/search/SearchParameters;", "getRemotelySearchableAnimal", "()Lbr/com/aula/petsave/common/domain/model/search/SearchParameters;", "getAnimalAges", "Lbr/com/aula/petsave/common/domain/model/animal/details/Age;", "getAnimalTypes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAnimals", "Lio/reactivex/Flowable;", "onboardingIsComplete", "", "requestMoreAnimals", "Lbr/com/aula/petsave/common/domain/model/pagination/PaginatedAnimals;", "pageToLoad", "", "numberOfItems", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchAnimalsRemotely", "searchParameters", "(ILbr/com/aula/petsave/common/domain/model/search/SearchParameters;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchCachedAnimalsBy", "Lbr/com/aula/petsave/common/domain/model/search/SearchResults;", "storeAnimals", "", "animals", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeOnboardingData", "postcode", "distance", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toAnimal", "common_debug"})
public final class FakeRepository implements br.com.aula.petsave.common.domain.repository.AnimalRepository {
    private final br.com.aula.petsave.common.domain.model.organization.Organization organization = null;
    private final br.com.aula.petsave.common.domain.model.animal.details.HealthDetails healthDetails = null;
    private final br.com.aula.petsave.common.domain.model.animal.details.HabitatAdaptation habitatAdaptation = null;
    private final br.com.aula.petsave.common.domain.model.animal.details.Details localAnimalDetails = null;
    private final br.com.aula.petsave.common.domain.model.animal.details.AnimalWithDetails localAnimal = null;
    private final br.com.aula.petsave.common.domain.model.animal.details.Details remoteAnimalDetails = null;
    private final br.com.aula.petsave.common.domain.model.animal.details.AnimalWithDetails remoteAnimal = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.aula.petsave.common.domain.model.search.SearchParameters remotelySearchableAnimal = null;
    private final java.util.List<br.com.aula.petsave.common.domain.model.animal.details.AnimalWithDetails> mutableLocalAnimals = null;
    private final java.util.List<br.com.aula.petsave.common.domain.model.animal.details.AnimalWithDetails> mutableRemoteAnimals = null;
    
    @javax.inject.Inject
    public FakeRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.search.SearchParameters getRemotelySearchableAnimal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<br.com.aula.petsave.common.domain.model.animal.Animal> getLocalAnimals() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<br.com.aula.petsave.common.domain.model.animal.Animal> getRemoteAnimals() {
        return null;
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
    
    private final br.com.aula.petsave.common.domain.model.animal.Animal toAnimal(br.com.aula.petsave.common.domain.model.animal.details.AnimalWithDetails $this$toAnimal) {
        return null;
    }
}