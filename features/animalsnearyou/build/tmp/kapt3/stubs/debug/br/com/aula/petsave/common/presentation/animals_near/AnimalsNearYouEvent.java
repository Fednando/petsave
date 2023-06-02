package br.com.aula.petsave.common.presentation.animals_near;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lbr/com/aula/petsave/common/presentation/animals_near/AnimalsNearYouEvent;", "", "()V", "RequestInitialAnimalList", "RequestMoreAnimals", "Lbr/com/aula/petsave/common/presentation/animals_near/AnimalsNearYouEvent$RequestInitialAnimalList;", "Lbr/com/aula/petsave/common/presentation/animals_near/AnimalsNearYouEvent$RequestMoreAnimals;", "animalsnearyou_debug"})
public abstract class AnimalsNearYouEvent {
    
    private AnimalsNearYouEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/aula/petsave/common/presentation/animals_near/AnimalsNearYouEvent$RequestInitialAnimalList;", "Lbr/com/aula/petsave/common/presentation/animals_near/AnimalsNearYouEvent;", "()V", "animalsnearyou_debug"})
    public static final class RequestInitialAnimalList extends br.com.aula.petsave.common.presentation.animals_near.AnimalsNearYouEvent {
        @org.jetbrains.annotations.NotNull
        public static final br.com.aula.petsave.common.presentation.animals_near.AnimalsNearYouEvent.RequestInitialAnimalList INSTANCE = null;
        
        private RequestInitialAnimalList() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/aula/petsave/common/presentation/animals_near/AnimalsNearYouEvent$RequestMoreAnimals;", "Lbr/com/aula/petsave/common/presentation/animals_near/AnimalsNearYouEvent;", "()V", "animalsnearyou_debug"})
    public static final class RequestMoreAnimals extends br.com.aula.petsave.common.presentation.animals_near.AnimalsNearYouEvent {
        @org.jetbrains.annotations.NotNull
        public static final br.com.aula.petsave.common.presentation.animals_near.AnimalsNearYouEvent.RequestMoreAnimals INSTANCE = null;
        
        private RequestMoreAnimals() {
            super();
        }
    }
}