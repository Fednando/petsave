package br.com.aula.petsave.search.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\b\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\bH\u00c6\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\bH\u00c6\u0003Ju\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020\tH\u00d6\u0001J\u000e\u0010\'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u000eJ\u0014\u0010)\u001a\u00020\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010+\u001a\u00020\u0000J\u0006\u0010,\u001a\u00020\u0000J\"\u0010-\u001a\u00020\u00002\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\u0005J\u0006\u00100\u001a\u00020\u0000J\u0006\u00101\u001a\u00020\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011\u00a8\u00062"}, d2 = {"Lbr/com/aula/petsave/search/presentation/SearchViewState;", "", "noSearchQuery", "", "searchResults", "", "Lbr/com/aula/petsave/common/presentation/model/UIAnimal;", "ageFilterValues", "Lbr/com/aula/petsave/common/presentation/Event;", "", "typeFilterValues", "searchingRemotely", "noRemoteResults", "failure", "", "(ZLjava/util/List;Lbr/com/aula/petsave/common/presentation/Event;Lbr/com/aula/petsave/common/presentation/Event;ZZLbr/com/aula/petsave/common/presentation/Event;)V", "getAgeFilterValues", "()Lbr/com/aula/petsave/common/presentation/Event;", "getFailure", "getNoRemoteResults", "()Z", "getNoSearchQuery", "getSearchResults", "()Ljava/util/List;", "getSearchingRemotely", "getTypeFilterValues", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "updateToHasFailure", "throwable", "updateToHasSearchResults", "animals", "updateToNoResultsAvailable", "updateToNoSearchQuery", "updateToReadyToSearch", "ages", "types", "updateToSearching", "updateToSearchingRemotely", "search_debug"})
public final class SearchViewState {
    private final boolean noSearchQuery = false;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<br.com.aula.petsave.common.presentation.model.UIAnimal> searchResults = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.aula.petsave.common.presentation.Event<java.util.List<java.lang.String>> ageFilterValues = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.aula.petsave.common.presentation.Event<java.util.List<java.lang.String>> typeFilterValues = null;
    private final boolean searchingRemotely = false;
    private final boolean noRemoteResults = false;
    @org.jetbrains.annotations.Nullable
    private final br.com.aula.petsave.common.presentation.Event<java.lang.Throwable> failure = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.search.presentation.SearchViewState copy(boolean noSearchQuery, @org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.presentation.model.UIAnimal> searchResults, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.presentation.Event<? extends java.util.List<java.lang.String>> ageFilterValues, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.presentation.Event<? extends java.util.List<java.lang.String>> typeFilterValues, boolean searchingRemotely, boolean noRemoteResults, @org.jetbrains.annotations.Nullable
    br.com.aula.petsave.common.presentation.Event<? extends java.lang.Throwable> failure) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public SearchViewState() {
        super();
    }
    
    public SearchViewState(boolean noSearchQuery, @org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.presentation.model.UIAnimal> searchResults, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.presentation.Event<? extends java.util.List<java.lang.String>> ageFilterValues, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.presentation.Event<? extends java.util.List<java.lang.String>> typeFilterValues, boolean searchingRemotely, boolean noRemoteResults, @org.jetbrains.annotations.Nullable
    br.com.aula.petsave.common.presentation.Event<? extends java.lang.Throwable> failure) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getNoSearchQuery() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<br.com.aula.petsave.common.presentation.model.UIAnimal> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<br.com.aula.petsave.common.presentation.model.UIAnimal> getSearchResults() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.presentation.Event<java.util.List<java.lang.String>> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.presentation.Event<java.util.List<java.lang.String>> getAgeFilterValues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.presentation.Event<java.util.List<java.lang.String>> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.presentation.Event<java.util.List<java.lang.String>> getTypeFilterValues() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getSearchingRemotely() {
        return false;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getNoRemoteResults() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.aula.petsave.common.presentation.Event<java.lang.Throwable> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.aula.petsave.common.presentation.Event<java.lang.Throwable> getFailure() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.search.presentation.SearchViewState updateToReadyToSearch(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> ages, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> types) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.search.presentation.SearchViewState updateToNoSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.search.presentation.SearchViewState updateToSearching() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.search.presentation.SearchViewState updateToSearchingRemotely() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.search.presentation.SearchViewState updateToHasSearchResults(@org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.presentation.model.UIAnimal> animals) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.search.presentation.SearchViewState updateToNoResultsAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.search.presentation.SearchViewState updateToHasFailure(@org.jetbrains.annotations.NotNull
    java.lang.Throwable throwable) {
        return null;
    }
}