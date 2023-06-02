package br.com.aula.petsave.common.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0013"}, d2 = {"Lbr/com/aula/petsave/common/data/di/ApiModule;", "", "()V", "provideApi", "Lbr/com/aula/petsave/common/data/api/PetFinderApi;", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "loggingInterceptor", "Lbr/com/aula/petsave/common/data/api/interceptors/LoggingInterceptor;", "provideOkHttpClient", "httpLoggingInterceptor", "networkStatusInterceptor", "Lbr/com/aula/petsave/common/data/api/interceptors/NetworkStatusInterceptor;", "authenticationInterceptor", "Lbr/com/aula/petsave/common/data/api/interceptors/AuthenticationInterceptor;", "provideRetrofit", "Lretrofit2/Retrofit$Builder;", "common_debug"})
@dagger.Module
public final class ApiModule {
    @org.jetbrains.annotations.NotNull
    public static final br.com.aula.petsave.common.data.di.ApiModule INSTANCE = null;
    
    private ApiModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final br.com.aula.petsave.common.data.api.PetFinderApi provideApi(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final retrofit2.Retrofit.Builder provideRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull
    okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.api.interceptors.NetworkStatusInterceptor networkStatusInterceptor, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.api.interceptors.AuthenticationInterceptor authenticationInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final okhttp3.logging.HttpLoggingInterceptor provideHttpLoggingInterceptor(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.api.interceptors.LoggingInterceptor loggingInterceptor) {
        return null;
    }
}