package br.com.aula.petsave.common.data.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\"\u0010\n\u001a\u00020\t2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f\u00a2\u0006\u0002\b\u000eH\u0082\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0012H\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lbr/com/aula/petsave/common/data/preferences/PetSavePreferences;", "Lbr/com/aula/petsave/common/data/preferences/Preferences;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "preferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "deleteTokenInfo", "", "edit", "block", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Lkotlin/ExtensionFunctionType;", "getMaxDistanceAllowedToGetAnimals", "", "getPostcode", "", "getToken", "getTokenExpirationTime", "", "getTokenType", "putMaxDistanceAllowedToGetAnimals", "distance", "putPostcode", "postcode", "putToken", "token", "putTokenExpirationTime", "time", "putTokenType", "tokenType", "Companion", "common_debug"})
@javax.inject.Singleton
public final class PetSavePreferences implements br.com.aula.petsave.common.data.preferences.Preferences {
    @org.jetbrains.annotations.NotNull
    public static final br.com.aula.petsave.common.data.preferences.PetSavePreferences.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREFERENCES_NAME = "PET_SAVE_PREFERENCES";
    private final android.content.SharedPreferences preferences = null;
    
    @javax.inject.Inject
    public PetSavePreferences(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override
    public void putToken(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
    }
    
    @java.lang.Override
    public void putTokenExpirationTime(long time) {
    }
    
    @java.lang.Override
    public void putTokenType(@org.jetbrains.annotations.NotNull
    java.lang.String tokenType) {
    }
    
    private final void edit(kotlin.jvm.functions.Function1<? super android.content.SharedPreferences.Editor, kotlin.Unit> block) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getToken() {
        return null;
    }
    
    @java.lang.Override
    public long getTokenExpirationTime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getTokenType() {
        return null;
    }
    
    @java.lang.Override
    public void deleteTokenInfo() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getPostcode() {
        return null;
    }
    
    @java.lang.Override
    public void putPostcode(@org.jetbrains.annotations.NotNull
    java.lang.String postcode) {
    }
    
    @java.lang.Override
    public int getMaxDistanceAllowedToGetAnimals() {
        return 0;
    }
    
    @java.lang.Override
    public void putMaxDistanceAllowedToGetAnimals(int distance) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbr/com/aula/petsave/common/data/preferences/PetSavePreferences$Companion;", "", "()V", "PREFERENCES_NAME", "", "common_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}