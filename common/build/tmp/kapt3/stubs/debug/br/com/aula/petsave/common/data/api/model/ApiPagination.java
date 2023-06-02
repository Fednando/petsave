package br.com.aula.petsave.common.data.api.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ>\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lbr/com/aula/petsave/common/data/api/model/ApiPagination;", "", "countPerPage", "", "totalCount", "currentPage", "totalPages", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCountPerPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrentPage", "getTotalCount", "getTotalPages", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lbr/com/aula/petsave/common/data/api/model/ApiPagination;", "equals", "", "other", "hashCode", "toString", "", "common_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ApiPagination {
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "count_per_page")
    private final java.lang.Integer countPerPage = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "total_count")
    private final java.lang.Integer totalCount = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "current_page")
    private final java.lang.Integer currentPage = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "total_pages")
    private final java.lang.Integer totalPages = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.data.api.model.ApiPagination copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer countPerPage, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalCount, @org.jetbrains.annotations.Nullable
    java.lang.Integer currentPage, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalPages) {
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
    
    public ApiPagination(@org.jetbrains.annotations.Nullable
    java.lang.Integer countPerPage, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalCount, @org.jetbrains.annotations.Nullable
    java.lang.Integer currentPage, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalPages) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCountPerPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCurrentPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalPages() {
        return null;
    }
}