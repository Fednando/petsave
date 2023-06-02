package br.com.aula.petsave.common.data.api.interceptors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0014\u0010\u0013\u001a\u00020\u0006*\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002J\f\u0010\u0015\u001a\u00020\u0006*\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lbr/com/aula/petsave/common/data/api/interceptors/AuthenticationInterceptor;", "Lokhttp3/Interceptor;", "preferences", "Lbr/com/aula/petsave/common/data/preferences/Preferences;", "(Lbr/com/aula/petsave/common/data/preferences/Preferences;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "mapToken", "Lbr/com/aula/petsave/common/data/api/model/ApiToken;", "tokenRefreshResponse", "storeNewToken", "", "apiToken", "createAuthenticatedRequest", "Lokhttp3/Request;", "token", "", "proceedDeletingTokenIfUnauthorized", "request", "refreshToken", "Companion", "common_release"})
public final class AuthenticationInterceptor implements okhttp3.Interceptor {
    private final br.com.aula.petsave.common.data.preferences.Preferences preferences = null;
    @org.jetbrains.annotations.NotNull
    public static final br.com.aula.petsave.common.data.api.interceptors.AuthenticationInterceptor.Companion Companion = null;
    public static final int UNAUTHORIZED = 401;
    
    @javax.inject.Inject
    public AuthenticationInterceptor(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.preferences.Preferences preferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    private final okhttp3.Request createAuthenticatedRequest(okhttp3.Interceptor.Chain $this$createAuthenticatedRequest, java.lang.String token) {
        return null;
    }
    
    private final okhttp3.Response refreshToken(okhttp3.Interceptor.Chain $this$refreshToken) {
        return null;
    }
    
    private final okhttp3.Response proceedDeletingTokenIfUnauthorized(okhttp3.Interceptor.Chain $this$proceedDeletingTokenIfUnauthorized, okhttp3.Request request) {
        return null;
    }
    
    private final br.com.aula.petsave.common.data.api.model.ApiToken mapToken(okhttp3.Response tokenRefreshResponse) {
        return null;
    }
    
    private final void storeNewToken(br.com.aula.petsave.common.data.api.model.ApiToken apiToken) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbr/com/aula/petsave/common/data/api/interceptors/AuthenticationInterceptor$Companion;", "", "()V", "UNAUTHORIZED", "", "common_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}