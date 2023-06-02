package br.com.aula.petsave.onboarding.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lbr/com/aula/petsave/onboarding/presentation/OnboardingEvent;", "", "()V", "DistanceChanged", "PostcodeChanged", "SubmitButtonClicked", "Lbr/com/aula/petsave/onboarding/presentation/OnboardingEvent$PostcodeChanged;", "Lbr/com/aula/petsave/onboarding/presentation/OnboardingEvent$DistanceChanged;", "Lbr/com/aula/petsave/onboarding/presentation/OnboardingEvent$SubmitButtonClicked;", "onboarding_debug"})
public abstract class OnboardingEvent {
    
    private OnboardingEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lbr/com/aula/petsave/onboarding/presentation/OnboardingEvent$PostcodeChanged;", "Lbr/com/aula/petsave/onboarding/presentation/OnboardingEvent;", "newPostcode", "", "(Ljava/lang/String;)V", "getNewPostcode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onboarding_debug"})
    public static final class PostcodeChanged extends br.com.aula.petsave.onboarding.presentation.OnboardingEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String newPostcode = null;
        
        @org.jetbrains.annotations.NotNull
        public final br.com.aula.petsave.onboarding.presentation.OnboardingEvent.PostcodeChanged copy(@org.jetbrains.annotations.NotNull
        java.lang.String newPostcode) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public PostcodeChanged(@org.jetbrains.annotations.NotNull
        java.lang.String newPostcode) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getNewPostcode() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lbr/com/aula/petsave/onboarding/presentation/OnboardingEvent$DistanceChanged;", "Lbr/com/aula/petsave/onboarding/presentation/OnboardingEvent;", "newDistance", "", "(Ljava/lang/String;)V", "getNewDistance", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onboarding_debug"})
    public static final class DistanceChanged extends br.com.aula.petsave.onboarding.presentation.OnboardingEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String newDistance = null;
        
        @org.jetbrains.annotations.NotNull
        public final br.com.aula.petsave.onboarding.presentation.OnboardingEvent.DistanceChanged copy(@org.jetbrains.annotations.NotNull
        java.lang.String newDistance) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public DistanceChanged(@org.jetbrains.annotations.NotNull
        java.lang.String newDistance) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getNewDistance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/aula/petsave/onboarding/presentation/OnboardingEvent$SubmitButtonClicked;", "Lbr/com/aula/petsave/onboarding/presentation/OnboardingEvent;", "()V", "onboarding_debug"})
    public static final class SubmitButtonClicked extends br.com.aula.petsave.onboarding.presentation.OnboardingEvent {
        @org.jetbrains.annotations.NotNull
        public static final br.com.aula.petsave.onboarding.presentation.OnboardingEvent.SubmitButtonClicked INSTANCE = null;
        
        private SubmitButtonClicked() {
            super();
        }
    }
}