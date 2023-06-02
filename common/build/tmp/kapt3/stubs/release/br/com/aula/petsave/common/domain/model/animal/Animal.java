package br.com.aula.petsave.common.domain.model.animal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017\u00a8\u0006\u001d"}, d2 = {"Lbr/com/aula/petsave/common/domain/model/animal/Animal;", "", "id", "", "name", "", "type", "media", "Lbr/com/aula/petsave/common/domain/model/animal/Media;", "tags", "", "adoptionStatus", "Lbr/com/aula/petsave/common/domain/model/animal/AdoptionStatus;", "publishedAt", "Lorg/threeten/bp/LocalDateTime;", "(JLjava/lang/String;Ljava/lang/String;Lbr/com/aula/petsave/common/domain/model/animal/Media;Ljava/util/List;Lbr/com/aula/petsave/common/domain/model/animal/AdoptionStatus;Lorg/threeten/bp/LocalDateTime;)V", "getAdoptionStatus", "()Lbr/com/aula/petsave/common/domain/model/animal/AdoptionStatus;", "getId", "()J", "getMedia", "()Lbr/com/aula/petsave/common/domain/model/animal/Media;", "getName", "()Ljava/lang/String;", "getPublishedAt", "()Lorg/threeten/bp/LocalDateTime;", "getTags", "()Ljava/util/List;", "getType", "common_release"})
public final class Animal {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.aula.petsave.common.domain.model.animal.Media media = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> tags = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.aula.petsave.common.domain.model.animal.AdoptionStatus adoptionStatus = null;
    @org.jetbrains.annotations.NotNull
    private final org.threeten.bp.LocalDateTime publishedAt = null;
    
    public Animal(long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.Media media, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> tags, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.AdoptionStatus adoptionStatus, @org.jetbrains.annotations.NotNull
    org.threeten.bp.LocalDateTime publishedAt) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.Media getMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.AdoptionStatus getAdoptionStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.threeten.bp.LocalDateTime getPublishedAt() {
        return null;
    }
}