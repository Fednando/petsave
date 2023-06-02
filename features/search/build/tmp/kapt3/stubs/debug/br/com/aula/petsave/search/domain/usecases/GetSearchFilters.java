package br.com.aula.petsave.search.domain.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lbr/com/aula/petsave/search/domain/usecases/GetSearchFilters;", "", "animalRepository", "Lbr/com/aula/petsave/common/domain/repository/AnimalRepository;", "(Lbr/com/aula/petsave/common/domain/repository/AnimalRepository;)V", "invoke", "Lbr/com/aula/petsave/common/domain/model/search/SearchFilters;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "search_debug"})
public final class GetSearchFilters {
    private final br.com.aula.petsave.common.domain.repository.AnimalRepository animalRepository = null;
    @org.jetbrains.annotations.NotNull
    public static final br.com.aula.petsave.search.domain.usecases.GetSearchFilters.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String NO_FILTER_SELECTED = "Any";
    
    @javax.inject.Inject
    public GetSearchFilters(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.repository.AnimalRepository animalRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super br.com.aula.petsave.common.domain.model.search.SearchFilters> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbr/com/aula/petsave/search/domain/usecases/GetSearchFilters$Companion;", "", "()V", "NO_FILTER_SELECTED", "", "search_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}