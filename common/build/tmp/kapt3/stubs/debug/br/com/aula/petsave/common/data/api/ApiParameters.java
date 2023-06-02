package br.com.aula.petsave.common.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lbr/com/aula/petsave/common/data/api/ApiParameters;", "", "()V", "AGE", "", "AUTH_HEADER", "CLIENT_ID", "CLIENT_SECRET", "DISTANCE", "GRANT_TYPE_KEY", "GRANT_TYPE_VALUE", "LIMIT", "LOCATION", "NAME", "PAGE", "TOKEN_TYPE", "TYPE", "common_debug"})
public final class ApiParameters {
    @org.jetbrains.annotations.NotNull
    public static final br.com.aula.petsave.common.data.api.ApiParameters INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TOKEN_TYPE = "Bearer ";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String AUTH_HEADER = "Authorization";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GRANT_TYPE_KEY = "grant_type";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GRANT_TYPE_VALUE = "client_credentials";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CLIENT_ID = "client_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CLIENT_SECRET = "client_secret";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PAGE = "page";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LIMIT = "limit";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LOCATION = "location";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DISTANCE = "distance";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String NAME = "name";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String AGE = "age";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TYPE = "type";
    
    private ApiParameters() {
        super();
    }
}