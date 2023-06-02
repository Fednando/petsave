-if class br.com.aula.petsave.common.data.api.model.ApiToken
-keepnames class br.com.aula.petsave.common.data.api.model.ApiToken
-if class br.com.aula.petsave.common.data.api.model.ApiToken
-keep class br.com.aula.petsave.common.data.api.model.ApiTokenJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class br.com.aula.petsave.common.data.api.model.ApiToken
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class br.com.aula.petsave.common.data.api.model.ApiToken
-keepclassmembers class br.com.aula.petsave.common.data.api.model.ApiToken {
    public synthetic <init>(java.lang.String,java.lang.Integer,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
