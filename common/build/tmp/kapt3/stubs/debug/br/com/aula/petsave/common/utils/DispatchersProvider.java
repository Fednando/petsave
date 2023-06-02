package br.com.aula.petsave.common.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"}, d2 = {"Lbr/com/aula/petsave/common/utils/DispatchersProvider;", "", "io", "Lkotlinx/coroutines/CoroutineDispatcher;", "common_debug"})
public abstract interface DispatchersProvider {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.CoroutineDispatcher io();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull
        public static kotlinx.coroutines.CoroutineDispatcher io(@org.jetbrains.annotations.NotNull
        br.com.aula.petsave.common.utils.DispatchersProvider $this) {
            return null;
        }
    }
}