package br.com.aula.petsave.common.presentation.model.mappers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lbr/com/aula/petsave/common/presentation/model/mappers/UiMapper;", "E", "V", "", "mapToView", "input", "(Ljava/lang/Object;)Ljava/lang/Object;", "common_release"})
public abstract interface UiMapper<E extends java.lang.Object, V extends java.lang.Object> {
    
    public abstract V mapToView(E input);
}