package br.com.aula.petsave.common.data.api.model.mappers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B?\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u001dH\u0002J\u0012\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u001dH\u0002J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lbr/com/aula/petsave/common/data/api/model/mappers/ApiAnimalMapper;", "Lbr/com/aula/petsave/common/data/api/model/mappers/ApiMapper;", "Lbr/com/aula/petsave/common/data/api/model/ApiAnimal;", "Lbr/com/aula/petsave/common/domain/model/animal/details/AnimalWithDetails;", "apiBreedsMapper", "Lbr/com/aula/petsave/common/data/api/model/mappers/ApiBreedsMapper;", "apiColorsMapper", "Lbr/com/aula/petsave/common/data/api/model/mappers/ApiColorsMapper;", "apiHealthDetailsMapper", "Lbr/com/aula/petsave/common/data/api/model/mappers/ApiHealthDetailsMapper;", "apiHabitatAdaptationMapper", "Lbr/com/aula/petsave/common/data/api/model/mappers/ApiHabitatAdaptationMapper;", "apiPhotoMapper", "Lbr/com/aula/petsave/common/data/api/model/mappers/ApiPhotoMapper;", "apiVideoMapper", "Lbr/com/aula/petsave/common/data/api/model/mappers/ApiVideoMapper;", "apiContactMapper", "Lbr/com/aula/petsave/common/data/api/model/mappers/ApiContactMapper;", "(Lbr/com/aula/petsave/common/data/api/model/mappers/ApiBreedsMapper;Lbr/com/aula/petsave/common/data/api/model/mappers/ApiColorsMapper;Lbr/com/aula/petsave/common/data/api/model/mappers/ApiHealthDetailsMapper;Lbr/com/aula/petsave/common/data/api/model/mappers/ApiHabitatAdaptationMapper;Lbr/com/aula/petsave/common/data/api/model/mappers/ApiPhotoMapper;Lbr/com/aula/petsave/common/data/api/model/mappers/ApiVideoMapper;Lbr/com/aula/petsave/common/data/api/model/mappers/ApiContactMapper;)V", "mapMedia", "Lbr/com/aula/petsave/common/domain/model/animal/Media;", "apiAnimal", "mapOrganization", "Lbr/com/aula/petsave/common/domain/model/organization/Organization;", "mapToDomain", "apiEntity", "parseAdoptionStatus", "Lbr/com/aula/petsave/common/domain/model/animal/AdoptionStatus;", "status", "", "parseAge", "Lbr/com/aula/petsave/common/domain/model/animal/details/Age;", "age", "parseAnimalDetails", "Lbr/com/aula/petsave/common/domain/model/animal/details/Details;", "parseCoat", "Lbr/com/aula/petsave/common/domain/model/animal/details/Coat;", "coat", "parseSize", "Lbr/com/aula/petsave/common/domain/model/animal/details/Size;", "size", "parserGender", "Lbr/com/aula/petsave/common/domain/model/animal/details/Gender;", "gender", "common_debug"})
public final class ApiAnimalMapper implements br.com.aula.petsave.common.data.api.model.mappers.ApiMapper<br.com.aula.petsave.common.data.api.model.ApiAnimal, br.com.aula.petsave.common.domain.model.animal.details.AnimalWithDetails> {
    private final br.com.aula.petsave.common.data.api.model.mappers.ApiBreedsMapper apiBreedsMapper = null;
    private final br.com.aula.petsave.common.data.api.model.mappers.ApiColorsMapper apiColorsMapper = null;
    private final br.com.aula.petsave.common.data.api.model.mappers.ApiHealthDetailsMapper apiHealthDetailsMapper = null;
    private final br.com.aula.petsave.common.data.api.model.mappers.ApiHabitatAdaptationMapper apiHabitatAdaptationMapper = null;
    private final br.com.aula.petsave.common.data.api.model.mappers.ApiPhotoMapper apiPhotoMapper = null;
    private final br.com.aula.petsave.common.data.api.model.mappers.ApiVideoMapper apiVideoMapper = null;
    private final br.com.aula.petsave.common.data.api.model.mappers.ApiContactMapper apiContactMapper = null;
    
    @javax.inject.Inject
    public ApiAnimalMapper(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.api.model.mappers.ApiBreedsMapper apiBreedsMapper, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.api.model.mappers.ApiColorsMapper apiColorsMapper, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.api.model.mappers.ApiHealthDetailsMapper apiHealthDetailsMapper, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.api.model.mappers.ApiHabitatAdaptationMapper apiHabitatAdaptationMapper, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.api.model.mappers.ApiPhotoMapper apiPhotoMapper, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.api.model.mappers.ApiVideoMapper apiVideoMapper, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.api.model.mappers.ApiContactMapper apiContactMapper) {
        super();
    }
    
    private final br.com.aula.petsave.common.domain.model.animal.details.Details parseAnimalDetails(br.com.aula.petsave.common.data.api.model.ApiAnimal apiAnimal) {
        return null;
    }
    
    private final br.com.aula.petsave.common.domain.model.animal.details.Age parseAge(java.lang.String age) {
        return null;
    }
    
    private final br.com.aula.petsave.common.domain.model.animal.details.Gender parserGender(java.lang.String gender) {
        return null;
    }
    
    private final br.com.aula.petsave.common.domain.model.animal.details.Size parseSize(java.lang.String size) {
        return null;
    }
    
    private final br.com.aula.petsave.common.domain.model.animal.details.Coat parseCoat(java.lang.String coat) {
        return null;
    }
    
    private final br.com.aula.petsave.common.domain.model.animal.Media mapMedia(br.com.aula.petsave.common.data.api.model.ApiAnimal apiAnimal) {
        return null;
    }
    
    private final br.com.aula.petsave.common.domain.model.animal.AdoptionStatus parseAdoptionStatus(java.lang.String status) {
        return null;
    }
    
    private final br.com.aula.petsave.common.domain.model.organization.Organization mapOrganization(br.com.aula.petsave.common.data.api.model.ApiAnimal apiAnimal) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public br.com.aula.petsave.common.domain.model.animal.details.AnimalWithDetails mapToDomain(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.data.api.model.ApiAnimal apiEntity) {
        return null;
    }
}