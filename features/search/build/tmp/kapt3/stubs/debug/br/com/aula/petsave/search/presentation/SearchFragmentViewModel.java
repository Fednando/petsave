package br.com.aula.petsave.search.presentation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010#\u001a\u00020$H\u0002J\u0016\u0010%\u001a\u00020$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'H\u0002J\b\u0010)\u001a\u00020$H\u0014J\u0010\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020,H\u0002J\u000e\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020/J\u0010\u00100\u001a\u00020$2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020$2\u0006\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u00020$2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00107\u001a\u00020$2\u0006\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020$H\u0002J\b\u0010;\u001a\u00020$H\u0002J\u0010\u0010<\u001a\u00020$2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010=\u001a\u00020$H\u0002J\b\u0010>\u001a\u00020$H\u0002J\b\u0010?\u001a\u00020$H\u0002J\u0010\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020\u0014H\u0002J\u0010\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020\u0014H\u0002J$\u0010D\u001a\u00020$2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00140\'2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00140\'H\u0002J\u0010\u0010G\u001a\u00020$2\u0006\u0010H\u001a\u00020\u0014H\u0002R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006I"}, d2 = {"Lbr/com/aula/petsave/search/presentation/SearchFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "searchAnimalsRemotely", "Lbr/com/aula/petsave/search/domain/usecases/SearchAnimalsRemotely;", "searchAnimals", "Lbr/com/aula/petsave/petsave/search/domain/usecases/SearchAnimals;", "getSearchFilters", "Lbr/com/aula/petsave/search/domain/usecases/GetSearchFilters;", "uiAnimalMapper", "Lbr/com/aula/petsave/common/presentation/model/mappers/UiAnimalMapper;", "dispatchersProvider", "Lbr/com/aula/petsave/common/utils/DispatchersProvider;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lbr/com/aula/petsave/search/domain/usecases/SearchAnimalsRemotely;Lbr/com/aula/petsave/petsave/search/domain/usecases/SearchAnimals;Lbr/com/aula/petsave/search/domain/usecases/GetSearchFilters;Lbr/com/aula/petsave/common/presentation/model/mappers/UiAnimalMapper;Lbr/com/aula/petsave/common/utils/DispatchersProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lbr/com/aula/petsave/search/presentation/SearchViewState;", "ageSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "currentPage", "", "querySubject", "remoteSearchJob", "Lkotlinx/coroutines/Job;", "state", "Landroidx/lifecycle/LiveData;", "getState", "()Landroidx/lifecycle/LiveData;", "typeSubject", "createExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "message", "loadFilterValues", "", "onAnimalList", "animals", "", "Lbr/com/aula/petsave/common/domain/model/animal/Animal;", "onCleared", "onEmptyCacheResults", "searchParameters", "Lbr/com/aula/petsave/common/domain/model/search/SearchParameters;", "onEvent", "event", "Lbr/com/aula/petsave/search/presentation/SearchEvent;", "onFailure", "throwable", "", "onPaginationInfoObtained", "pagination", "Lbr/com/aula/petsave/common/domain/model/pagination/Pagination;", "onSearchParametersUpdate", "onSearchResults", "searchResults", "Lbr/com/aula/petsave/common/domain/model/search/SearchResults;", "prepareForSearch", "resetPagination", "searchRemotely", "setNoSearchQueryState", "setSearchingState", "setupSearchSubscription", "updateAgeValue", "age", "updateQuery", "input", "updateStateWithFilterValues", "ages", "types", "updateTypeValue", "type", "search_debug"})
public final class SearchFragmentViewModel extends androidx.lifecycle.ViewModel {
    private final br.com.aula.petsave.search.domain.usecases.SearchAnimalsRemotely searchAnimalsRemotely = null;
    private final br.com.aula.petsave.petsave.search.domain.usecases.SearchAnimals searchAnimals = null;
    private final br.com.aula.petsave.search.domain.usecases.GetSearchFilters getSearchFilters = null;
    private final br.com.aula.petsave.common.presentation.model.mappers.UiAnimalMapper uiAnimalMapper = null;
    private final br.com.aula.petsave.common.utils.DispatchersProvider dispatchersProvider = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final androidx.lifecycle.MutableLiveData<br.com.aula.petsave.search.presentation.SearchViewState> _state = null;
    private final io.reactivex.subjects.BehaviorSubject<java.lang.String> querySubject = null;
    private final io.reactivex.subjects.BehaviorSubject<java.lang.String> ageSubject = null;
    private final io.reactivex.subjects.BehaviorSubject<java.lang.String> typeSubject = null;
    private kotlinx.coroutines.Job remoteSearchJob;
    private int currentPage = 0;
    
    @javax.inject.Inject
    public SearchFragmentViewModel(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.search.domain.usecases.SearchAnimalsRemotely searchAnimalsRemotely, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.petsave.search.domain.usecases.SearchAnimals searchAnimals, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.search.domain.usecases.GetSearchFilters getSearchFilters, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.presentation.model.mappers.UiAnimalMapper uiAnimalMapper, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.utils.DispatchersProvider dispatchersProvider, @org.jetbrains.annotations.NotNull
    io.reactivex.disposables.CompositeDisposable compositeDisposable) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<br.com.aula.petsave.search.presentation.SearchViewState> getState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.search.presentation.SearchEvent event) {
    }
    
    private final void onSearchParametersUpdate(br.com.aula.petsave.search.presentation.SearchEvent event) {
    }
    
    private final void prepareForSearch() {
    }
    
    private final void loadFilterValues() {
    }
    
    private final kotlinx.coroutines.CoroutineExceptionHandler createExceptionHandler(java.lang.String message) {
        return null;
    }
    
    private final void updateStateWithFilterValues(java.util.List<java.lang.String> ages, java.util.List<java.lang.String> types) {
    }
    
    private final void setupSearchSubscription() {
    }
    
    private final void onSearchResults(br.com.aula.petsave.common.domain.model.search.SearchResults searchResults) {
    }
    
    private final void onEmptyCacheResults(br.com.aula.petsave.common.domain.model.search.SearchParameters searchParameters) {
    }
    
    private final void searchRemotely(br.com.aula.petsave.common.domain.model.search.SearchParameters searchParameters) {
    }
    
    private final void updateQuery(java.lang.String input) {
    }
    
    private final void updateAgeValue(java.lang.String age) {
    }
    
    private final void updateTypeValue(java.lang.String type) {
    }
    
    private final void setSearchingState() {
    }
    
    private final void setNoSearchQueryState() {
    }
    
    private final void onAnimalList(java.util.List<br.com.aula.petsave.common.domain.model.animal.Animal> animals) {
    }
    
    private final void resetPagination() {
    }
    
    private final void onPaginationInfoObtained(br.com.aula.petsave.common.domain.model.pagination.Pagination pagination) {
    }
    
    private final void onFailure(java.lang.Throwable throwable) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}