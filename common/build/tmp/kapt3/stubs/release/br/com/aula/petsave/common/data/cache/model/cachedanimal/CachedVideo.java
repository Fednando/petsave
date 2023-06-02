package br.com.aula.petsave.common.data.cache.model.cachedanimal;

import java.lang.System;

@androidx.room.Entity(tableName = "videos")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedVideo;", "", "videoId", "", "animalId", "video", "", "(JJLjava/lang/String;)V", "getAnimalId", "()J", "getVideo", "()Ljava/lang/String;", "getVideoId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toDomain", "Lbr/com/aula/petsave/common/domain/model/animal/Media$Video;", "toString", "Companion", "common_release"})
public final class CachedVideo {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long videoId = 0L;
    private final long animalId = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String video = null;
    @org.jetbrains.annotations.NotNull
    public static final br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedVideo.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedVideo copy(long videoId, long animalId, @org.jetbrains.annotations.NotNull
    java.lang.String video) {
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
    
    public CachedVideo(long videoId, long animalId, @org.jetbrains.annotations.NotNull
    java.lang.String video) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getVideoId() {
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
    public final java.lang.String getVideo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.Media.Video toDomain() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedVideo$Companion;", "", "()V", "fromDomain", "Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedVideo;", "animalId", "", "video", "Lbr/com/aula/petsave/common/domain/model/animal/Media$Video;", "common_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedVideo fromDomain(long animalId, @org.jetbrains.annotations.NotNull
        br.com.aula.petsave.common.domain.model.animal.Media.Video video) {
            return null;
        }
    }
}