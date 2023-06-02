package br.com.aula.petsave.common.data.cache.model.cachedanimal;

import java.lang.System;

@androidx.room.Entity(primaryKeys = {"animalId", "tag"}, indices = {@androidx.room.Index(value = {"tag"})})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedAnimalTagCrossRef;", "", "animalId", "", "tag", "", "(JLjava/lang/String;)V", "getAnimalId", "()J", "getTag", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_debug"})
public final class CachedAnimalTagCrossRef {
    private final long animalId = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String tag = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalTagCrossRef copy(long animalId, @org.jetbrains.annotations.NotNull
    java.lang.String tag) {
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
    
    public CachedAnimalTagCrossRef(long animalId, @org.jetbrains.annotations.NotNull
    java.lang.String tag) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getAnimalId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTag() {
        return null;
    }
}