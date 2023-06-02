package br.com.aula.petsave.common.data.api.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00f5\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0010\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0014\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0002\u0010#J\u0010\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00107J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u00c6\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\u0013\u0010O\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\"H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00aa\u0002\u0010[\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0012\b\u0002\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00142\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u00c6\u0001\u00a2\u0006\u0002\u0010\\J\u0013\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010`\u001a\u00020aH\u00d6\u0001J\t\u0010b\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u001a\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010%R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010%R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010%R \u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010<R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010%R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010%R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010<\u00a8\u0006c"}, d2 = {"Lbr/com/aula/petsave/common/data/api/model/ApiAnimal;", "", "id", "", "organizationId", "", "url", "type", "species", "breeds", "Lbr/com/aula/petsave/common/data/api/model/ApiBreeds;", "colors", "Lbr/com/aula/petsave/common/data/api/model/ApiColors;", "age", "gender", "size", "coat", "name", "description", "photos", "", "Lbr/com/aula/petsave/common/data/api/model/ApiPhotoSizes;", "videos", "Lbr/com/aula/petsave/common/data/api/model/ApiVideoLink;", "status", "attributes", "Lbr/com/aula/petsave/common/data/api/model/ApiAttributes;", "environment", "Lbr/com/aula/petsave/common/data/api/model/ApiEnvironment;", "tags", "contact", "Lbr/com/aula/petsave/common/data/api/model/ApiContact;", "publishedAt", "distance", "", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbr/com/aula/petsave/common/data/api/model/ApiBreeds;Lbr/com/aula/petsave/common/data/api/model/ApiColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lbr/com/aula/petsave/common/data/api/model/ApiAttributes;Lbr/com/aula/petsave/common/data/api/model/ApiEnvironment;Ljava/util/List;Lbr/com/aula/petsave/common/data/api/model/ApiContact;Ljava/lang/String;Ljava/lang/Float;)V", "getAge", "()Ljava/lang/String;", "getAttributes", "()Lbr/com/aula/petsave/common/data/api/model/ApiAttributes;", "getBreeds", "()Lbr/com/aula/petsave/common/data/api/model/ApiBreeds;", "getCoat", "getColors", "()Lbr/com/aula/petsave/common/data/api/model/ApiColors;", "getContact", "()Lbr/com/aula/petsave/common/data/api/model/ApiContact;", "getDescription", "getDistance", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getEnvironment", "()Lbr/com/aula/petsave/common/data/api/model/ApiEnvironment;", "getGender", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "getOrganizationId", "getPhotos", "()Ljava/util/List;", "getPublishedAt", "getSize", "getSpecies", "getStatus", "getTags", "getType", "getUrl", "getVideos", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbr/com/aula/petsave/common/data/api/model/ApiBreeds;Lbr/com/aula/petsave/common/data/api/model/ApiColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lbr/com/aula/petsave/common/data/api/model/ApiAttributes;Lbr/com/aula/petsave/common/data/api/model/ApiEnvironment;Ljava/util/List;Lbr/com/aula/petsave/common/data/api/model/ApiContact;Ljava/lang/String;Ljava/lang/Float;)Lbr/com/aula/petsave/common/data/api/model/ApiAnimal;", "equals", "", "other", "hashCode", "", "toString", "common_release"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ApiAnimal {
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "id")
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "organization_id")
    private final java.lang.String organizationId = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "url")
    private final java.lang.String url = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "type")
    private final java.lang.String type = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "species")
    private final java.lang.String species = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "breeds")
    private final br.com.aula.petsave.common.data.api.model.ApiBreeds breeds = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "colors")
    private final br.com.aula.petsave.common.data.api.model.ApiColors colors = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "age")
    private final java.lang.String age = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "gender")
    private final java.lang.String gender = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "size")
    private final java.lang.String size = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "coat")
    private final java.lang.String coat = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "photos")
    private final java.util.List<br.com.aula.petsave.common.data.api.model.ApiPhotoSizes> photos = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "videos")
    private final java.util.List<br.com.aula.petsave.common.data.api.model.ApiVideoLink> videos = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "status")
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "attributes")
    private final br.com.aula.petsave.common.data.api.model.ApiAttributes attributes = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "environment")
    private final br.com.aula.petsave.common.data.api.model.ApiEnvironment environment = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "tags")
    private final java.util.List<java.lang.String> tags = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "contact")
    private final br.com.aula.petsave.common.data.api.model.ApiContact contact = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "published_at")
    private final java.lang.String publishedAt = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "distance")
    private final java.lang.Float distance = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.data.api.model.ApiAnimal copy(@org.jetbrains.annotations.Nullable
    java.lang.Long id, @org.jetbrains.annotations.Nullable
    java.lang.String organizationId, @org.jetbrains.annotations.Nullable
    java.lang.String url, @org.jetbrains.annotations.Nullable
    java.lang.String type, @org.jetbrains.annotations.Nullable
    java.lang.String species, @org.jetbrains.annotations.Nullable
    br.com.aula.petsave.common.data.api.model.ApiBreeds breeds, @org.jetbrains.annotations.Nullable
    br.com.aula.petsave.common.data.api.model.ApiColors colors, @org.jetbrains.annotations.Nullable
    java.lang.String age, @org.jetbrains.annotations.Nullable
    java.lang.String gender, @org.jetbrains.annotations.Nullable
    java.lang.String size, @org.jetbrains.annotations.Nullable
    java.lang.String coat, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.util.List<br.com.aula.petsave.common.data.api.model.ApiPhotoSizes> photos, @org.jetbrains.annotations.Nullable
    java.util.List<br.com.aula.petsave.common.data.api.model.ApiVideoLink> videos, @org.jetbrains.annotations.Nullable
    java.lang.String status, @org.jetbrains.annotations.Nullable
    br.com.aula.petsave.common.data.api.model.ApiAttributes attributes, @org.jetbrains.annotations.Nullable
    br.com.aula.petsave.common.data.api.model.ApiEnvironment environment, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> tags, @org.jetbrains.annotations.Nullable
    br.com.aula.petsave.common.data.api.model.ApiContact contact, @org.jetbrains.annotations.Nullable
    java.lang.String publishedAt, @org.jetbrains.annotations.Nullable
    java.lang.Float distance) {
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
    
    public ApiAnimal(@org.jetbrains.annotations.Nullable
    java.lang.Long id, @org.jetbrains.annotations.Nullable
    java.lang.String organizationId, @org.jetbrains.annotations.Nullable
    java.lang.String url, @org.jetbrains.annotations.Nullable
    java.lang.String type, @org.jetbrains.annotations.Nullable
    java.lang.String species, @org.jetbrains.annotations.Nullable
    br.com.aula.petsave.common.data.api.model.ApiBreeds breeds, @org.jetbrains.annotations.Nullable
    br.com.aula.petsave.common.data.api.model.ApiColors colors, @org.jetbrains.annotations.Nullable
    java.lang.String age, @org.jetbrains.annotations.Nullable
    java.lang.String gender, @org.jetbrains.annotations.Nullable
    java.lang.String size, @org.jetbrains.annotations.Nullable
    java.lang.String coat, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.util.List<br.com.aula.petsave.common.data.api.model.ApiPhotoSizes> photos, @org.jetbrains.annotations.Nullable
    java.util.List<br.com.aula.petsave.common.data.api.model.ApiVideoLink> videos, @org.jetbrains.annotations.Nullable
    java.lang.String status, @org.jetbrains.annotations.Nullable
    br.com.aula.petsave.common.data.api.model.ApiAttributes attributes, @org.jetbrains.annotations.Nullable
    br.com.aula.petsave.common.data.api.model.ApiEnvironment environment, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> tags, @org.jetbrains.annotations.Nullable
    br.com.aula.petsave.common.data.api.model.ApiContact contact, @org.jetbrains.annotations.Nullable
    java.lang.String publishedAt, @org.jetbrains.annotations.Nullable
    java.lang.Float distance) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOrganizationId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSpecies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.aula.petsave.common.data.api.model.ApiBreeds component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.aula.petsave.common.data.api.model.ApiBreeds getBreeds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.aula.petsave.common.data.api.model.ApiColors component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.aula.petsave.common.data.api.model.ApiColors getColors() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAge() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSize() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCoat() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<br.com.aula.petsave.common.data.api.model.ApiPhotoSizes> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<br.com.aula.petsave.common.data.api.model.ApiPhotoSizes> getPhotos() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<br.com.aula.petsave.common.data.api.model.ApiVideoLink> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<br.com.aula.petsave.common.data.api.model.ApiVideoLink> getVideos() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.aula.petsave.common.data.api.model.ApiAttributes component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.aula.petsave.common.data.api.model.ApiAttributes getAttributes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.aula.petsave.common.data.api.model.ApiEnvironment component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.aula.petsave.common.data.api.model.ApiEnvironment getEnvironment() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.aula.petsave.common.data.api.model.ApiContact component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.aula.petsave.common.data.api.model.ApiContact getContact() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPublishedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getDistance() {
        return null;
    }
}