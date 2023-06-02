package br.com.aula.petsave.onboarding.presentation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u0016H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006#"}, d2 = {"Lbr/com/aula/petsave/onboarding/presentation/OnboardingFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "storeOnboardingData", "Lbr/com/aula/petsave/onboarding/domain/usecases/StoreOnboardingData;", "dispatchersProvider", "Lbr/com/aula/petsave/common/utils/DispatchersProvider;", "(Lbr/com/aula/petsave/onboarding/domain/usecases/StoreOnboardingData;Lbr/com/aula/petsave/common/utils/DispatchersProvider;)V", "_viewEffects", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lbr/com/aula/petsave/onboarding/presentation/OnboardingViewEffect;", "_viewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lbr/com/aula/petsave/onboarding/presentation/OnboardingViewState;", "viewEffects", "Lkotlinx/coroutines/flow/SharedFlow;", "getViewEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "viewState", "Lkotlinx/coroutines/flow/StateFlow;", "getViewState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEvent", "", "event", "Lbr/com/aula/petsave/onboarding/presentation/OnboardingEvent;", "onFailure", "throwable", "", "validateNewDistanceValue", "newDistance", "", "validateNewPostcodeValue", "newPostcode", "wrapUpOnboarding", "Companion", "onboarding_debug"})
public final class OnboardingFragmentViewModel extends androidx.lifecycle.ViewModel {
    private final br.com.aula.petsave.onboarding.domain.usecases.StoreOnboardingData storeOnboardingData = null;
    private final br.com.aula.petsave.common.utils.DispatchersProvider dispatchersProvider = null;
    @org.jetbrains.annotations.NotNull
    public static final br.com.aula.petsave.onboarding.presentation.OnboardingFragmentViewModel.Companion Companion = null;
    private static final int MAX_POSTCODE_LENGTH = 5;
    private final kotlinx.coroutines.flow.MutableStateFlow<br.com.aula.petsave.onboarding.presentation.OnboardingViewState> _viewState = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<br.com.aula.petsave.onboarding.presentation.OnboardingViewEffect> _viewEffects = null;
    
    @javax.inject.Inject
    public OnboardingFragmentViewModel(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.onboarding.domain.usecases.StoreOnboardingData storeOnboardingData, @org.jetbrains.annotations.NotNull
    br.com.aula.petsave.common.utils.DispatchersProvider dispatchersProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<br.com.aula.petsave.onboarding.presentation.OnboardingViewState> getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<br.com.aula.petsave.onboarding.presentation.OnboardingViewEffect> getViewEffects() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    br.com.aula.petsave.onboarding.presentation.OnboardingEvent event) {
    }
    
    private final void validateNewPostcodeValue(java.lang.String newPostcode) {
    }
    
    private final void validateNewDistanceValue(java.lang.String newDistance) {
    }
    
    private final void wrapUpOnboarding() {
    }
    
    private final void onFailure(java.lang.Throwable throwable) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbr/com/aula/petsave/onboarding/presentation/OnboardingFragmentViewModel$Companion;", "", "()V", "MAX_POSTCODE_LENGTH", "", "onboarding_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}