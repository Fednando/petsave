package br.com.aula.petsave.common.presentation.animals_near;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u001eH\u0014J\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0002J\u0016\u0010\'\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u001eH\u0002R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lbr/com/aula/petsave/common/presentation/animals_near/AnimalNearYourFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "uiAnimalMapper", "Lbr/com/aula/petsave/common/presentation/model/mappers/UiAnimalMapper;", "dispatchersProvider", "Lbr/com/aula/petsave/common/utils/DispatchersProvider;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "requestNextPageOfAnimals", "Lbr/com/aula/petsave/common/presentation/animals_near/domain/RequestNextPageOfAnimals;", "getAnimals", "Lbr/com/aula/petsave/common/presentation/animals_near/domain/GetAnimals;", "(Lbr/com/aula/petsave/common/presentation/model/mappers/UiAnimalMapper;Lbr/com/aula/petsave/common/utils/DispatchersProvider;Lio/reactivex/disposables/CompositeDisposable;Lbr/com/aula/petsave/common/presentation/animals_near/domain/RequestNextPageOfAnimals;Lbr/com/aula/petsave/common/presentation/animals_near/domain/GetAnimals;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lbr/com/aula/petsave/common/presentation/animals_near/AnimalsNearYouViewState;", "currentPage", "", "isLastPage", "", "()Z", "setLastPage", "(Z)V", "isLoadingMoreAnimals", "setLoadingMoreAnimals", "state", "Landroidx/lifecycle/LiveData;", "getState", "()Landroidx/lifecycle/LiveData;", "loadAnimals", "", "loadNextAnimalPage", "onCleared", "onEvent", "event", "Lbr/com/aula/petsave/common/presentation/animals_near/AnimalsNearYouEvent;", "onFailure", "failure", "", "onNewAnimalList", "animals", "", "Lbr/com/aula/petsave/common/domain/model/animal/Animal;", "onPaginationInfoObtained", "pagination", "Lbr/com/aula/petsave/common/domain/model/pagination/Pagination;", "subscribeToAnimalUpdates", "Companion", "animalsnearyou_debug"})
public final class AnimalNearYourFragmentViewModel extends androidx.lifecycle.ViewModel {
    private final br.com.aula.petsave.common.presentation.model.mappers.UiAnimalMapper uiAnimalMapper = null;
    private final br.com.aula.petsave.common.utils.DispatchersProvider dispatchersProvider = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final br.com.aula.petsave.common.presentation.animals_near.domain.RequestNextPageOfAnimals requestNextPageOfAnimals = null;
    private final br.com.aula.petsave.common.presentation.animals_near.domain.GetAnimals getAnimals = null;
    private final androidx.lifecycle.MutableLiveData<br.com.aula.petsave.common.presentation.animals_near.AnimalsNearYouViewState> _state = null;
    private int currentPage = 0;
    private boolean isLoadingMoreAnimals = false;
    private boolean isLastPage = false;
    @org.jetbrains.annotations.NotNull
    public static final br.com.aula.petsave.common.presentation.animals_near.AnimalNearYourFragmentViewModel.Companion Companion = null;
    public static final int UI_PAGE_SIZE = 20;
    
    @javax.inject.Inject
    public AnimalNearYourFragmentViewModel(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.presentation.model.mappers.UiAnimalMapper uiAnimalMapper, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.utils.DispatchersProvider dispatchersProvider, @org.jetbrains.annotations.NotNull
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.presentation.animals_near.domain.RequestNextPageOfAnimals requestNextPageOfAnimals, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.presentation.animals_near.domain.GetAnimals getAnimals) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<br.com.aula.petsave.common.presentation.animals_near.AnimalsNearYouViewState> getState() {
        return null;
    }
    
    public final boolean isLoadingMoreAnimals() {
        return false;
    }
    
    public final void setLoadingMoreAnimals(boolean p0) {
    }
    
    public final boolean isLastPage() {
        return false;
    }
    
    public final void setLastPage(boolean p0) {
    }
    
    private final void subscribeToAnimalUpdates() {
    }
    
    private final void onNewAnimalList(java.util.List<br.com.aula.petsave.common.domain.model.animal.Animal> animals) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.presentation.animals_near.AnimalsNearYouEvent event) {
    }
    
    private final void loadAnimals() {
    }
    
    private final void loadNextAnimalPage() {
    }
    
    private final void onPaginationInfoObtained(br.com.aula.petsave.common.domain.model.pagination.Pagination pagination) {
    }
    
    private final void onFailure(java.lang.Throwable failure) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbr/com/aula/petsave/common/presentation/animals_near/AnimalNearYourFragmentViewModel$Companion;", "", "()V", "UI_PAGE_SIZE", "", "animalsnearyou_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}