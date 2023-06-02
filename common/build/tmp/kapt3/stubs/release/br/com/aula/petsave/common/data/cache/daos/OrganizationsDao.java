package br.com.aula.petsave.common.data.cache.daos;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'\u00a8\u0006\u0007"}, d2 = {"Lbr/com/aula/petsave/common/data/cache/daos/OrganizationsDao;", "", "insert", "", "organizations", "", "Lbr/com/aula/petsave/common/data/cache/model/cachedorganization/CachedOrganization;", "common_release"})
public abstract interface OrganizationsDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    java.util.List<br.com.aula.petsave.common.data.cache.model.cachedorganization.CachedOrganization> organizations);
}