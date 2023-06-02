package br.com.aula.petsave.common.domain.model.animal.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0002\u0010\u0017J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0014H\u00c6\u0003J\t\u0010/\u001a\u00020\u0016H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\bH\u00c6\u0003J\t\u00103\u001a\u00020\nH\u00c6\u0003J\t\u00104\u001a\u00020\fH\u00c6\u0003J\t\u00105\u001a\u00020\u000eH\u00c6\u0003J\t\u00106\u001a\u00020\u0010H\u00c6\u0003J\t\u00107\u001a\u00020\u0012H\u00c6\u0003Jw\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u00c6\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020=H\u00d6\u0001J\t\u0010>\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010!\u00a8\u0006?"}, d2 = {"Lbr/com/aula/petsave/common/domain/model/animal/details/Details;", "", "description", "", "age", "Lbr/com/aula/petsave/common/domain/model/animal/details/Age;", "species", "breed", "Lbr/com/aula/petsave/common/domain/model/animal/details/Breed;", "colors", "Lbr/com/aula/petsave/common/domain/model/animal/details/Colors;", "gender", "Lbr/com/aula/petsave/common/domain/model/animal/details/Gender;", "size", "Lbr/com/aula/petsave/common/domain/model/animal/details/Size;", "coat", "Lbr/com/aula/petsave/common/domain/model/animal/details/Coat;", "healthDetails", "Lbr/com/aula/petsave/common/domain/model/animal/details/HealthDetails;", "habitatAdaptation", "Lbr/com/aula/petsave/common/domain/model/animal/details/HabitatAdaptation;", "organization", "Lbr/com/aula/petsave/common/domain/model/organization/Organization;", "(Ljava/lang/String;Lbr/com/aula/petsave/common/domain/model/animal/details/Age;Ljava/lang/String;Lbr/com/aula/petsave/common/domain/model/animal/details/Breed;Lbr/com/aula/petsave/common/domain/model/animal/details/Colors;Lbr/com/aula/petsave/common/domain/model/animal/details/Gender;Lbr/com/aula/petsave/common/domain/model/animal/details/Size;Lbr/com/aula/petsave/common/domain/model/animal/details/Coat;Lbr/com/aula/petsave/common/domain/model/animal/details/HealthDetails;Lbr/com/aula/petsave/common/domain/model/animal/details/HabitatAdaptation;Lbr/com/aula/petsave/common/domain/model/organization/Organization;)V", "getAge", "()Lbr/com/aula/petsave/common/domain/model/animal/details/Age;", "getBreed", "()Lbr/com/aula/petsave/common/domain/model/animal/details/Breed;", "getCoat", "()Lbr/com/aula/petsave/common/domain/model/animal/details/Coat;", "getColors", "()Lbr/com/aula/petsave/common/domain/model/animal/details/Colors;", "getDescription", "()Ljava/lang/String;", "getGender", "()Lbr/com/aula/petsave/common/domain/model/animal/details/Gender;", "getHabitatAdaptation", "()Lbr/com/aula/petsave/common/domain/model/animal/details/HabitatAdaptation;", "getHealthDetails", "()Lbr/com/aula/petsave/common/domain/model/animal/details/HealthDetails;", "getOrganization", "()Lbr/com/aula/petsave/common/domain/model/organization/Organization;", "getSize", "()Lbr/com/aula/petsave/common/domain/model/animal/details/Size;", "getSpecies", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "common_debug"})
public final class Details {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.aula.petsave.common.domain.model.animal.details.Age age = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String species = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.aula.petsave.common.domain.model.animal.details.Breed breed = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.aula.petsave.common.domain.model.animal.details.Colors colors = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.aula.petsave.common.domain.model.animal.details.Gender gender = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.aula.petsave.common.domain.model.animal.details.Size size = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.aula.petsave.common.domain.model.animal.details.Coat coat = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.aula.petsave.common.domain.model.animal.details.HealthDetails healthDetails = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.aula.petsave.common.domain.model.animal.details.HabitatAdaptation habitatAdaptation = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.aula.petsave.common.domain.model.organization.Organization organization = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.Details copy(@org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.Age age, @org.jetbrains.annotations.NotNull
    java.lang.String species, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.Breed breed, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.Colors colors, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.Gender gender, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.Size size, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.Coat coat, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.HealthDetails healthDetails, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.HabitatAdaptation habitatAdaptation, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.organization.Organization organization) {
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
    
    public Details(@org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.Age age, @org.jetbrains.annotations.NotNull
    java.lang.String species, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.Breed breed, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.Colors colors, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.Gender gender, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.Size size, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.Coat coat, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.HealthDetails healthDetails, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.animal.details.HabitatAdaptation habitatAdaptation, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.domain.model.organization.Organization organization) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.Age component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.Age getAge() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSpecies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.Breed component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.Breed getBreed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.Colors component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.Colors getColors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.Gender component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.Gender getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.Size component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.Size getSize() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.Coat component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.Coat getCoat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.HealthDetails component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.HealthDetails getHealthDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.HabitatAdaptation component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.HabitatAdaptation getHabitatAdaptation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.organization.Organization component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.organization.Organization getOrganization() {
        return null;
    }
}