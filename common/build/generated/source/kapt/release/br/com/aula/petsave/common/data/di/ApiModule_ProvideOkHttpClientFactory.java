// Generated by Dagger (https://dagger.dev).
package br.com.aula.petsave.common.data.di;

import br.com.aula.petsave.common.data.api.interceptors.AuthenticationInterceptor;
import br.com.aula.petsave.common.data.api.interceptors.NetworkStatusInterceptor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider;

  private final Provider<NetworkStatusInterceptor> networkStatusInterceptorProvider;

  private final Provider<AuthenticationInterceptor> authenticationInterceptorProvider;

  public ApiModule_ProvideOkHttpClientFactory(
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider,
      Provider<NetworkStatusInterceptor> networkStatusInterceptorProvider,
      Provider<AuthenticationInterceptor> authenticationInterceptorProvider) {
    this.httpLoggingInterceptorProvider = httpLoggingInterceptorProvider;
    this.networkStatusInterceptorProvider = networkStatusInterceptorProvider;
    this.authenticationInterceptorProvider = authenticationInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(httpLoggingInterceptorProvider.get(), networkStatusInterceptorProvider.get(), authenticationInterceptorProvider.get());
  }

  public static ApiModule_ProvideOkHttpClientFactory create(
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider,
      Provider<NetworkStatusInterceptor> networkStatusInterceptorProvider,
      Provider<AuthenticationInterceptor> authenticationInterceptorProvider) {
    return new ApiModule_ProvideOkHttpClientFactory(httpLoggingInterceptorProvider, networkStatusInterceptorProvider, authenticationInterceptorProvider);
  }

  public static OkHttpClient provideOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor,
      NetworkStatusInterceptor networkStatusInterceptor,
      AuthenticationInterceptor authenticationInterceptor) {
    return Preconditions.checkNotNullFromProvides(ApiModule.INSTANCE.provideOkHttpClient(httpLoggingInterceptor, networkStatusInterceptor, authenticationInterceptor));
  }
}
