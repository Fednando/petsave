package br.com.aula.petsave.common.data.api.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lbr/com/aula/petsave/common/data/api/model/ApiContact;", "", "email", "", "phone", "address", "Lbr/com/aula/petsave/common/data/api/model/ApiAddress;", "(Ljava/lang/String;Ljava/lang/String;Lbr/com/aula/petsave/common/data/api/model/ApiAddress;)V", "getAddress", "()Lbr/com/aula/petsave/common/data/api/model/ApiAddress;", "getEmail", "()Ljava/lang/String;", "getPhone", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ApiContact {
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "email")
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "phone")
    private final java.lang.String phone = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "address")
    private final br.com.aula.petsave.common.data.api.model.ApiAddress address = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.data.api.model.ApiContact copy(@org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String phone, @org.jetbrains.annotations.Nullable
    br.com.aula.petsave.common.data.api.model.ApiAddress address) {
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
    
    public ApiContact(@org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String phone, @org.jetbrains.annotations.Nullable
    br.com.aula.petsave.common.data.api.model.ApiAddress address) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.aula.petsave.common.data.api.model.ApiAddress component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.aula.petsave.common.data.api.model.ApiAddress getAddress() {
        return null;
    }
}