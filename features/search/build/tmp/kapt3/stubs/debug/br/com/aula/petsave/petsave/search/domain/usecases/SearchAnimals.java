package br.com.aula.petsave.petsave.search.domain.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J9\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0086\u0002J6\u0010\u0012\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00070\u0007 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00130\u0013*\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lbr/com/aula/petsave/petsave/search/domain/usecases/SearchAnimals;", "", "animalRepository", "Lbr/com/aula/petsave/common/domain/repository/AnimalRepository;", "(Lbr/com/aula/petsave/common/domain/repository/AnimalRepository;)V", "combiningFunction", "Lio/reactivex/functions/Function3;", "", "Lbr/com/aula/petsave/common/domain/model/search/SearchParameters;", "getCombiningFunction", "()Lio/reactivex/functions/Function3;", "invoke", "Lio/reactivex/Flowable;", "Lbr/com/aula/petsave/common/domain/model/search/SearchResults;", "querySubject", "Lio/reactivex/subjects/BehaviorSubject;", "ageSubject", "typeSubject", "replaceUIEmptyValue", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "search_debug"})
public final class SearchAnimals {
    private final br.com.aula.petsave.common.domain.repository.AnimalRepository animalRepository = null;
    
    @javax.inject.Inject
    public SearchAnimals(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.repository.AnimalRepository animalRepository) {
        super();
    }
    
    private final io.reactivex.functions.Function3<java.lang.String, java.lang.String, java.lang.String, br.com.aula.petsave.common.domain.model.search.SearchParameters> getCombiningFunction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Flowable<br.com.aula.petsave.common.domain.model.search.SearchResults> invoke(@org.jetbrains.annotations.NotNull
    io.reactivex.subjects.BehaviorSubject<java.lang.String> querySubject, @org.jetbrains.annotations.NotNull
    io.reactivex.subjects.BehaviorSubject<java.lang.String> ageSubject, @org.jetbrains.annotations.NotNull
    io.reactivex.subjects.BehaviorSubject<java.lang.String> typeSubject) {
        return null;
    }
    
    private final io.reactivex.Observable<java.lang.String> replaceUIEmptyValue(io.reactivex.subjects.BehaviorSubject<java.lang.String> $this$replaceUIEmptyValue) {
        return null;
    }
}