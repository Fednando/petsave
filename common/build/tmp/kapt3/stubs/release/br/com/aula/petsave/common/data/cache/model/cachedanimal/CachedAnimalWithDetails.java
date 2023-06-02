package br.com.aula.petsave.common.data.cache.model.cachedanimal;

import java.lang.System;

@androidx.room.Entity(tableName = "animals", foreignKeys = {@androidx.room.ForeignKey(entity = br.com.aula.petsave.common.data.cache.model.cachedorganization.CachedOrganization.class, childColumns = {"organizationId"}, onDelete = 5, parentColumns = {"organizationId"})}, indices = {@androidx.room.Index(value = {"organizationId"})})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b>\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 d2\u00020\u0001:\u0001dB\u00c5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u001dJ\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\u0014H\u00c6\u0003J\t\u0010?\u001a\u00020\u0014H\u00c6\u0003J\t\u0010@\u001a\u00020\u0014H\u00c6\u0003J\t\u0010A\u001a\u00020\u0014H\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\u0014H\u00c6\u0003J\t\u0010D\u001a\u00020\u0014H\u00c6\u0003J\t\u0010E\u001a\u00020\u0014H\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\t\u0010G\u001a\u00020\u0005H\u00c6\u0003J\t\u0010H\u001a\u00020\u0005H\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u0005H\u00c6\u0003J\t\u0010K\u001a\u00020\u0005H\u00c6\u0003J\t\u0010L\u001a\u00020\u0005H\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u0005H\u00c6\u0003J\u00f9\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010P\u001a\u00020\u00142\b\u0010Q\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010R\u001a\u00020SH\u00d6\u0001J\u0010\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0002J0\u0010X\u001a\u00020Y2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\\0[2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020^0[2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020`0[J8\u0010a\u001a\u00020b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\\0[2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020^0[2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020`0[2\u0006\u0010V\u001a\u00020WJ\t\u0010c\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u001b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u0018\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\'R\u0011\u0010\u0019\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\'R\u0011\u0010\u0016\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\'R\u0011\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\'R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\'R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0011\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\'R\u0011\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001f\u00a8\u0006e"}, d2 = {"Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedAnimalWithDetails;", "", "animalId", "", "organizationId", "", "name", "type", "description", "age", "species", "primaryBreed", "secondaryBreed", "primaryColor", "secondaryColor", "tertiaryColor", "gender", "size", "coat", "isSpayedOrNeutered", "", "isDeclawed", "hasSpecialNeeds", "shotsAreCurrent", "goodWithChildren", "goodWithDogs", "goodWithCats", "adoptionStatus", "publishedAt", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;)V", "getAdoptionStatus", "()Ljava/lang/String;", "getAge", "getAnimalId", "()J", "getCoat", "getDescription", "getGender", "getGoodWithCats", "()Z", "getGoodWithChildren", "getGoodWithDogs", "getHasSpecialNeeds", "getName", "getOrganizationId", "getPrimaryBreed", "getPrimaryColor", "getPublishedAt", "getSecondaryBreed", "getSecondaryColor", "getShotsAreCurrent", "getSize", "getSpecies", "getTertiaryColor", "getType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "mapDetails", "Lbr/com/aula/petsave/common/domain/model/animal/details/Details;", "organization", "Lbr/com/aula/petsave/common/data/cache/model/cachedorganization/CachedOrganization;", "toAnimalDomain", "Lbr/com/aula/petsave/common/domain/model/animal/Animal;", "photos", "", "Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedPhoto;", "videos", "Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedVideo;", "tags", "Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedTag;", "toDomain", "Lbr/com/aula/petsave/common/domain/model/animal/details/AnimalWithDetails;", "toString", "Companion", "common_release"})
public final class CachedAnimalWithDetails {
    @androidx.room.PrimaryKey
    private final long animalId = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String organizationId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String age = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String species = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String primaryBreed = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String secondaryBreed = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String primaryColor = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String secondaryColor = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String tertiaryColor = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String gender = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String size = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String coat = null;
    private final boolean isSpayedOrNeutered = false;
    private final boolean isDeclawed = false;
    private final boolean hasSpecialNeeds = false;
    private final boolean shotsAreCurrent = false;
    private final boolean goodWithChildren = false;
    private final boolean goodWithDogs = false;
    private final boolean goodWithCats = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String adoptionStatus = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String publishedAt = null;
    @org.jetbrains.annotations.NotNull
    public static final br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalWithDetails.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalWithDetails copy(long animalId, @org.jetbrains.annotations.NotNull
    java.lang.String organizationId, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String age, @org.jetbrains.annotations.NotNull
    java.lang.String species, @org.jetbrains.annotations.NotNull
    java.lang.String primaryBreed, @org.jetbrains.annotations.NotNull
    java.lang.String secondaryBreed, @org.jetbrains.annotations.NotNull
    java.lang.String primaryColor, @org.jetbrains.annotations.NotNull
    java.lang.String secondaryColor, @org.jetbrains.annotations.NotNull
    java.lang.String tertiaryColor, @org.jetbrains.annotations.NotNull
    java.lang.String gender, @org.jetbrains.annotations.NotNull
    java.lang.String size, @org.jetbrains.annotations.NotNull
    java.lang.String coat, boolean isSpayedOrNeutered, boolean isDeclawed, boolean hasSpecialNeeds, boolean shotsAreCurrent, boolean goodWithChildren, boolean goodWithDogs, boolean goodWithCats, @org.jetbrains.annotations.NotNull
    java.lang.String adoptionStatus, @org.jetbrains.annotations.NotNull
    java.lang.String publishedAt) {
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
    
    public CachedAnimalWithDetails(long animalId, @org.jetbrains.annotations.NotNull
    java.lang.String organizationId, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String age, @org.jetbrains.annotations.NotNull
    java.lang.String species, @org.jetbrains.annotations.NotNull
    java.lang.String primaryBreed, @org.jetbrains.annotations.NotNull
    java.lang.String secondaryBreed, @org.jetbrains.annotations.NotNull
    java.lang.String primaryColor, @org.jetbrains.annotations.NotNull
    java.lang.String secondaryColor, @org.jetbrains.annotations.NotNull
    java.lang.String tertiaryColor, @org.jetbrains.annotations.NotNull
    java.lang.String gender, @org.jetbrains.annotations.NotNull
    java.lang.String size, @org.jetbrains.annotations.NotNull
    java.lang.String coat, boolean isSpayedOrNeutered, boolean isDeclawed, boolean hasSpecialNeeds, boolean shotsAreCurrent, boolean goodWithChildren, boolean goodWithDogs, boolean goodWithCats, @org.jetbrains.annotations.NotNull
    java.lang.String adoptionStatus, @org.jetbrains.annotations.NotNull
    java.lang.String publishedAt) {
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
    public final java.lang.String getOrganizationId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAge() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSpecies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPrimaryBreed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSecondaryBreed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPrimaryColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSecondaryColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTertiaryColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSize() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCoat() {
        return null;
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final boolean isSpayedOrNeutered() {
        return false;
    }
    
    public final boolean component17() {
        return false;
    }
    
    public final boolean isDeclawed() {
        return false;
    }
    
    public final boolean component18() {
        return false;
    }
    
    public final boolean getHasSpecialNeeds() {
        return false;
    }
    
    public final boolean component19() {
        return false;
    }
    
    public final boolean getShotsAreCurrent() {
        return false;
    }
    
    public final boolean component20() {
        return false;
    }
    
    public final boolean getGoodWithChildren() {
        return false;
    }
    
    public final boolean component21() {
        return false;
    }
    
    public final boolean getGoodWithDogs() {
        return false;
    }
    
    public final boolean component22() {
        return false;
    }
    
    public final boolean getGoodWithCats() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdoptionStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPublishedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.details.AnimalWithDetails toDomain(@org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedPhoto> photos, @org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedVideo> videos, @org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedTag> tags, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.cache.model.cachedorganization.CachedOrganization organization) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.domain.model.animal.Animal toAnimalDomain(@org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedPhoto> photos, @org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedVideo> videos, @org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedTag> tags) {
        return null;
    }
    
    private final br.com.aula.petsave.common.domain.model.animal.details.Details mapDetails(br.com.aula.petsave.common.data.cache.model.cachedorganization.CachedOrganization organization) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedAnimalWithDetails$Companion;", "", "()V", "fromDomain", "Lbr/com/aula/petsave/common/data/cache/model/cachedanimal/CachedAnimalWithDetails;", "domainModel", "Lbr/com/aula/petsave/common/domain/model/animal/details/AnimalWithDetails;", "common_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalWithDetails fromDomain(@org.jetbrains.annotations.NotNull
        br.com.aula.petsave.common.domain.model.animal.details.AnimalWithDetails domainModel) {
            return null;
        }
    }
}