// Generated by Dagger (https://dagger.dev).
package br.com.aula.petsave.common.data.api.model.mappers;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiPaginationMapper_Factory implements Factory<ApiPaginationMapper> {
  @Override
  public ApiPaginationMapper get() {
    return newInstance();
  }

  public static ApiPaginationMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ApiPaginationMapper newInstance() {
    return new ApiPaginationMapper();
  }

  private static final class InstanceHolder {
    private static final ApiPaginationMapper_Factory INSTANCE = new ApiPaginationMapper_Factory();
  }
}
