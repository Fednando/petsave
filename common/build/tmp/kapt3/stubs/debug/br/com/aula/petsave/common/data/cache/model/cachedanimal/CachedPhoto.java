package br.com.aula.petsave.common.data.cache.model.cachedanimal;

import java.lang.System;

@androidx.room.Entity(tableName = "photos", foreignKeys = {@androidx.room.ForeignKey(entity = br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalWithDetails.class, childColumns = {"animalId"}, onDelete = 5, parentColumns = {"animalId"})}, indices = {@androidx.room.Index(value = {"animalId"})})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedPhoto;", "", "photoId", "", "animalId", "medium", "", "full", "(JJLjava/lang/String;Ljava/lang/String;)V", "getAnimalId", "()J", "getFull", "()Ljava/lang/String;", "getMedium", "getPhotoId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toDomain", "Lbr/com/aula/petsave/common/domain/model/animal/Media$Photo;", "toString", "Companion", "common_debug"})
public final class CachedPhoto {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long photoId = 0L;
    private final long animalId = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String medium = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String full = null;
    @org.jetbrains.annotations.NotNull
    public static final br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedPhoto.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedPhoto copy(long photoId, long animalId, @org.jetbrains.annotations.NotNull
    java.lang.String medium, @org.jetbrains.annotations.NotNull
    java.lang.String full) {
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
    
    public CachedPhoto(long photoId, long animalId, @org.jetbrains.annotations.NotNull
    java.lang.String medium, @org.jetbrains.annotations.NotNull
    java.lang.String full) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getPhotoId() {
        return 0L;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getAnimalId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMedium() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFull() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.Media.Photo toDomain() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedPhoto$Companion;", "", "()V", "fromDomain", "Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedPhoto;", "animalId", "", "photo", "Lbr/com/aula/petsave/common/domain/model/animal/Media$Photo;", "common_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedPhoto fromDomain(long animalId, @org.jetbrains.annotations.NotNull
        br.com.aula.petsave.common.domain.model.animal.Media.Photo photo) {
            return null;
        }
    }
}