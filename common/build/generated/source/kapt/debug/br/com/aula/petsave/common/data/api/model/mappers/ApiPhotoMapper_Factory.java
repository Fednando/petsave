// Generated by Dagger (https://dagger.dev).
package br.com.aula.petsave.common.data.api.model.mappers;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiPhotoMapper_Factory implements Factory<ApiPhotoMapper> {
  @Override
  public ApiPhotoMapper get() {
    return newInstance();
  }

  public static ApiPhotoMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ApiPhotoMapper newInstance() {
    return new ApiPhotoMapper();
  }

  private static final class InstanceHolder {
    private static final ApiPhotoMapper_Factory INSTANCE = new ApiPhotoMapper_Factory();
  }
}
