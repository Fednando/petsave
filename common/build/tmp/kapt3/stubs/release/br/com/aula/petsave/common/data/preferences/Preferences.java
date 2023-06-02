package br.com.aula.petsave.common.data.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005H&\u00a8\u0006\u000f"}, d2 = {"Lbr/com/aula/petsave/common/data/preferences/Preferences;", "", "deleteTokenInfo", "", "getToken", "", "getTokenExpirationTime", "", "getTokenType", "putToken", "token", "putTokenExpirationTime", "time", "putTokenType", "tokenType", "common_release"})
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
}