package br.com.aula.petsave.common.data.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0007H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\nH&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H&\u00a8\u0006\u0016"}, d2 = {"Lbr/com/aula/petsave/common/data/preferences/Preferences;", "", "deleteTokenInfo", "", "getMaxDistanceAllowedToGetAnimals", "", "getPostcode", "", "getToken", "getTokenExpirationTime", "", "getTokenType", "putMaxDistanceAllowedToGetAnimals", "distance", "putPostcode", "postcode", "putToken", "token", "putTokenExpirationTime", "time", "putTokenType", "tokenType", "common_debug"})
public abstract interface Preferences {
    
    public abstract void putToken(@org.jetbrains.annotations.NotNull
    java.lang.String token);
    
    public abstract void putTokenExpirationTime(long time);
    
    public abstract void putTokenType(@org.jetbrains.annotations.NotNull
    java.lang.String tokenType);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getToken();
    
    public abstract long getTokenExpirationTime();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getTokenType();
    
    public abstract void deleteTokenInfo();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getPostcode();
    
    public abstract void putPostcode(@org.jetbrains.annotations.NotNull
    java.lang.String postcode);
    
    public abstract int getMaxDistanceAllowedToGetAnimals();
    
    public abstract void putMaxDistanceAllowedToGetAnimals(int distance);
}