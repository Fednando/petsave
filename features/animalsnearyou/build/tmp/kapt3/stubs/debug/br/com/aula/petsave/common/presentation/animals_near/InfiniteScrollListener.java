package br.com.aula.petsave.common.presentation.animals_near;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u000bH&J \u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lbr/com/aula/petsave/common/presentation/animals_near/InfiniteScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "pageSize", "", "(Landroidx/recyclerview/widget/GridLayoutManager;I)V", "isLastPage", "", "isLoading", "loadMoreItems", "", "onScrolled", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "animalsnearyou_debug"})
public abstract class InfiniteScrollListener extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    private final androidx.recyclerview.widget.GridLayoutManager layoutManager = null;
    private final int pageSize = 0;
    
    public InfiniteScrollListener(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.GridLayoutManager layoutManager, int pageSize) {
        super();
    }
    
    @java.lang.Override
    public void onScrolled(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, int dx, int dy) {
    }
    
    public abstract void loadMoreItems();
    
    public abstract boolean isLastPage();
    
    public abstract boolean isLoading();
}