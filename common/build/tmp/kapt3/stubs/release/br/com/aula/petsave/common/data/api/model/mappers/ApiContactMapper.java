package br.com.aula.petsave.common.data.api.model.mappers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lbr/com/aula/petsave/common/data/api/model/mappers/ApiContactMapper;", "Lbr/com/aula/petsave/common/data/api/model/mappers/ApiMapper;", "Lbr/com/aula/petsave/common/data/api/model/ApiContact;", "Lbr/com/aula/petsave/common/domain/model/organization/Organization$Contact;", "apiAddressMapper", "Lbr/com/aula/petsave/common/data/api/model/mappers/ApiAddressMapper;", "(Lbr/com/aula/petsave/common/data/api/model/mappers/ApiAddressMapper;)V", "mapToDomain", "apiEntity", "common_release"})
public final class ApiContactMapper implements br.com.aula.petsave.common.data.api.model.mappers.ApiMapper<br.com.aula.petsave.common.data.api.model.ApiContact, br.com.aula.petsave.common.domain.model.organization.Organization.Contact> {
    private final br.com.aula.petsave.common.data.api.model.mappers.ApiAddressMapper apiAddressMapper = null;
    
    @javax.inject.Inject
    public ApiContactMapper(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.api.model.mappers.ApiAddressMapper apiAddressMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public br.com.aula.petsave.common.domain.model.organization.Organization.Contact mapToDomain(@org.jetbrains.annotations.Nullable
    br.com.aula.petsave.common.data.api.model.ApiContact apiEntity) {
        return null;
    }
}