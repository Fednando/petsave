package br.com.aula.petsave.common.domain.model.animal.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\bH\u00c6\u0003J\t\u0010%\u001a\u00020\nH\u00c6\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000eH\u00c6\u0003J\t\u0010(\u001a\u00020\u0010H\u00c6\u0003J_\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020.H\u00d6\u0001J\t\u0010/\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001b\u00a8\u00060"}, d2 = {"Lbr/com/aula/petsave/common/domain/model/animal/details/AnimalWithDetails;", "", "id", "", "name", "", "type", "details", "Lbr/com/aula/petsave/common/domain/model/animal/details/Details;", "media", "Lbr/com/aula/petsave/common/domain/model/animal/Media;", "tags", "", "adoptionStatus", "Lbr/com/aula/petsave/common/domain/model/animal/AdoptionStatus;", "publishedAt", "Lorg/threeten/bp/LocalDateTime;", "(JLjava/lang/String;Ljava/lang/String;Lbr/com/aula/petsave/common/domain/model/animal/details/Details;Lbr/com/aula/petsave/common/domain/model/animal/Media;Ljava/util/List;Lbr/com/aula/petsave/common/domain/model/animal/AdoptionStatus;Lorg/threeten/bp/LocalDateTime;)V", "getAdoptionStatus", "()Lbr/com/aula/petsave/common/domain/model/animal/AdoptionStatus;", "getDetails", "()Lbr/com/aula/petsave/common/domain/model/animal/details/Details;", "getId", "()J", "getMedia", "()Lbr/com/aula/petsave/common/domain/model/animal/Media;", "getName", "()Ljava/lang/String;", "getPublishedAt", "()Lorg/threeten/bp/LocalDateTime;", "getTags", "()Ljava/util/List;", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "common_debug"})
public final class AnimalWithDetails {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.aula.petsave.common.domain.model.animal.details.Details details = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.aula.petsave.common.domain.model.animal.Media media = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> tags = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.aula.petsave.common.domain.model.animal.AdoptionStatus adoptionStatus = null;
    @org.jetbrains.annotations.NotNull
    private final org.threeten.bp.LocalDateTime publishedAt = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.AnimalWithDetails copy(long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.Details details, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.Media media, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> tags, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.AdoptionStatus adoptionStatus, @org.jetbrains.annotations.NotNull
    org.threeten.bp.LocalDateTime publishedAt) {
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
    
    public AnimalWithDetails(long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.Details details, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.Media media, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> tags, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.AdoptionStatus adoptionStatus, @org.jetbrains.annotations.NotNull
    org.threeten.bp.LocalDateTime publishedAt) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.Details component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.Details getDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.Media component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.Media getMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.AdoptionStatus component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.AdoptionStatus getAdoptionStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.threeten.bp.LocalDateTime component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.threeten.bp.LocalDateTime getPublishedAt() {
        return null;
    }
}