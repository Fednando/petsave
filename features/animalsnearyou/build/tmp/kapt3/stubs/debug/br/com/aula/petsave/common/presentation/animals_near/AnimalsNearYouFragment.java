package br.com.aula.petsave.common.presentation.animals_near;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u000fH\u0002J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u0015H\u0016J\u001a\u0010\'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010)\u001a\u00020\u0015H\u0002J\b\u0010*\u001a\u00020\u0015H\u0002J\u0010\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u000fH\u0002J\b\u0010-\u001a\u00020\u0015H\u0002J\u0018\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u0002002\u0006\u0010\u001d\u001a\u00020\u000fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u00062"}, d2 = {"Lbr/com/aula/petsave/common/presentation/animals_near/AnimalsNearYouFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lbr/com/aula/petsave/animalsnearyou/databinding/FragmentAnimalsNearYouBinding;", "binding", "getBinding", "()Lbr/com/aula/petsave/animalsnearyou/databinding/FragmentAnimalsNearYouBinding;", "viewModel", "Lbr/com/aula/petsave/common/presentation/animals_near/AnimalNearYourFragmentViewModel;", "getViewModel", "()Lbr/com/aula/petsave/common/presentation/animals_near/AnimalNearYourFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "createAdapter", "Lbr/com/aula/petsave/common/presentation/AnimalsAdapter;", "createInfiniteScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "handleFailures", "", "failure", "Lbr/com/aula/petsave/common/presentation/Event;", "", "handleNoMoreAnimalsNearby", "noMoreAnimalsNearby", "", "observeViewStateUpdates", "adapter", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "requestInitialAnimalsList", "requestMoreAnimals", "setupRecyclerView", "animalsNearYouAdapter", "setupUI", "updateScreenState", "state", "Lbr/com/aula/petsave/common/presentation/animals_near/AnimalsNearYouViewState;", "Companion", "animalsnearyou_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class AnimalsNearYouFragment extends androidx.fragment.app.Fragment {
    private br.com.aula.petsave.animalsnearyou.databinding.FragmentAnimalsNearYouBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final br.com.aula.petsave.common.presentation.animals_near.AnimalsNearYouFragment.Companion Companion = null;
    private static final int ITEMS_PER_ROW = 2;
    
    public AnimalsNearYouFragment() {
        super();
    }
    
    private final br.com.aula.petsave.animalsnearyou.databinding.FragmentAnimalsNearYouBinding getBinding() {
        return null;
    }
    
    private final br.com.aula.petsave.common.presentation.animals_near.AnimalNearYourFragmentViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void requestInitialAnimalsList() {
    }
    
    private final void setupUI() {
    }
    
    private final br.com.aula.petsave.common.presentation.AnimalsAdapter createAdapter() {
        return null;
    }
    
    private final void updateScreenState(br.com.aula.petsave.common.presentation.animals_near.AnimalsNearYouViewState state, br.com.aula.petsave.common.presentation.AnimalsAdapter adapter) {
    }
    
    private final void observeViewStateUpdates(br.com.aula.petsave.common.presentation.AnimalsAdapter adapter) {
    }
    
    private final void handleNoMoreAnimalsNearby(boolean noMoreAnimalsNearby) {
    }
    
    private final void handleFailures(br.com.aula.petsave.common.presentation.Event<? extends java.lang.Throwable> failure) {
    }
    
    private final void setupRecyclerView(br.com.aula.petsave.common.presentation.AnimalsAdapter animalsNearYouAdapter) {
    }
    
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener createInfiniteScrollListener(androidx.recyclerview.widget.GridLayoutManager layoutManager) {
        return null;
    }
    
    private final void requestMoreAnimals() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbr/com/aula/petsave/common/presentation/animals_near/AnimalsNearYouFragment$Companion;", "", "()V", "ITEMS_PER_ROW", "", "animalsnearyou_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}