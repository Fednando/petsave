package br.com.aula.petsave.common.data.api.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010\u001d\u001a\u00020\u001aJ\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\t\u00a8\u0006 "}, d2 = {"Lbr/com/aula/petsave/common/data/api/model/ApiToken;", "", "tokenType", "", "expiresInSeconds", "", "accessToken", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "expiresAt", "", "getExpiresAt", "()J", "getExpiresInSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "requestedAt", "Lorg/threeten/bp/Instant;", "getTokenType", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lbr/com/aula/petsave/common/data/api/model/ApiToken;", "equals", "", "other", "hashCode", "isValid", "toString", "Companion", "common_release"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ApiToken {
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "token_type")
    private final java.lang.String tokenType = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "expires_in")
    private final java.lang.Integer expiresInSeconds = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "access_token")
    private final java.lang.String accessToken = null;
    @org.jetbrains.annotations.NotNull
    public static final br.com.aula.petsave.common.data.api.model.ApiToken.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final br.com.aula.petsave.common.data.api.model.ApiToken INVALID = null;
    @kotlin.jvm.Transient
    private final transient org.threeten.bp.Instant requestedAt = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.aula.petsave.common.data.api.model.ApiToken copy(@org.jetbrains.annotations.Nullable
    java.lang.String tokenType, @org.jetbrains.annotations.Nullable
    java.lang.Integer expiresInSeconds, @org.jetbrains.annotations.Nullable
    java.lang.String accessToken) {
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
    
    public ApiToken(@org.jetbrains.annotations.Nullable
    java.lang.String tokenType, @org.jetbrains.annotations.Nullable
    java.lang.Integer expiresInSeconds, @org.jetbrains.annotations.Nullable
    java.lang.String accessToken) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTokenType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getExpiresInSeconds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    public final long getExpiresAt() {
        return 0L;
    }
    
    public final boolean isValid() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lbr/com/aula/petsave/common/data/api/model/ApiToken$Companion;", "", "()V", "INVALID", "Lbr/com/aula/petsave/common/data/api/model/ApiToken;", "getINVALID", "()Lbr/com/aula/petsave/common/data/api/model/ApiToken;", "common_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final br.com.aula.petsave.common.data.api.model.ApiToken getINVALID() {
            return null;
        }
    }
}