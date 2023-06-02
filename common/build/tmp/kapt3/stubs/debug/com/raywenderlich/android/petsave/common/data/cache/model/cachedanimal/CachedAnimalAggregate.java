package com.raywenderlich.android.petsave.common.data.cache.model.cachedanimal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u001f"}, d2 = {"Lcom/raywenderlich/android/petsave/common/data/cache/model/cachedanimal/CachedAnimalAggregate;", "", "animal", "Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedAnimalWithDetails;", "photos", "", "Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedPhoto;", "videos", "Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedVideo;", "tags", "Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedTag;", "(Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedAnimalWithDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAnimal", "()Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedAnimalWithDetails;", "getPhotos", "()Ljava/util/List;", "getTags", "getVideos", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "common_debug"})
public final class CachedAnimalAggregate {
    @org.jetbrains.annotations.NotNull
    @androidx.room.Embedded
    private final br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalWithDetails animal = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.Relation(parentColumn = "animalId", entityColumn = "animalId")
    private final java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedPhoto> photos = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.Relation(parentColumn = "animalId", entityColumn = "animalId")
    private final java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedVideo> videos = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.Relation(parentColumn = "animalId", entityColumn = "tag", associateBy = @androidx.room.Junction(value = br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalTagCrossRef.class))
    private final java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedTag> tags = null;
    @org.jetbrains.annotations.NotNull
    public static final com.raywenderlich.android.petsave.common.data.cache.model.cachedanimal.CachedAnimalAggregate.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.raywenderlich.android.petsave.common.data.cache.model.cachedanimal.CachedAnimalAggregate copy(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalWithDetails animal, @org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedPhoto> photos, @org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedVideo> videos, @org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedTag> tags) {
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
    
    public CachedAnimalAggregate(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalWithDetails animal, @org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedPhoto> photos, @org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedVideo> videos, @org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedTag> tags) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalWithDetails component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalWithDetails getAnimal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedPhoto> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedPhoto> getPhotos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedVideo> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedVideo> getVideos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedTag> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedTag> getTags() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/raywenderlich/android/petsave/common/data/cache/model/cachedanimal/CachedAnimalAggregate$Companion;", "", "()V", "fromDomain", "Lcom/raywenderlich/android/petsave/common/data/cache/model/cachedanimal/CachedAnimalAggregate;", "animalWithDetails", "Lbr/com/aula/petsave/common/domain/model/animal/details/AnimalWithDetails;", "common_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.raywenderlich.android.petsave.common.data.cache.model.cachedanimal.CachedAnimalAggregate fromDomain(@org.jetbrains.annotations.NotNull
        br.com.aula.petsave.common.domain.model.animal.details.AnimalWithDetails animalWithDetails) {
            return null;
        }
    }
}