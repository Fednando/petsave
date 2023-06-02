package br.com.aula.petsave.design_patterns.builder.preference_example


import android.content.Context
import android.content.SharedPreferences
//import androidx.security.crypto.EncryptedSharedPreferences
//import androidx.security.crypto.MasterKey
//import br.com.cronosbank.old.Utils.PrefUtil

class EncryptPrefUtils {

    constructor()

    constructor(context: Context) {
//        val masterKey = MasterKey.Builder(context).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build()
//        preferences = EncryptedSharedPreferences.create(
//            context,
//            PrefUtil.SHARED_PREFERENCE_NAME,
//            masterKey,
//            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
//            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
//        )
//
//        editor = preferences.edit()
    }

    companion object {

        const val MY_SLUG = "MY_SLUG"
        const val SLUG = "SLUG"


        private var singleton: EncryptPrefUtils? = null
        private lateinit var preferences: SharedPreferences
        private lateinit var editor: SharedPreferences.Editor

        @JvmStatic
        fun with(context: Context) : EncryptPrefUtils {
            if (null == singleton) {
                singleton = Builder(context).build()
            }
            return singleton as EncryptPrefUtils
        }
    }

    private class Builder(val context: Context) {
        fun build() : EncryptPrefUtils {
            return EncryptPrefUtils(context)
        }
    }

    fun getString(key: String, default: String): String? {
        return preferences.getString(key, default)
    }

    fun apply(key: String, value: Any?) {
        when (value) {
            is String -> {
                editor.putString(key, value).apply()
            }
            is Boolean -> editor.putBoolean(key, value).apply()
            is Int -> editor.putInt(key, value).apply()
            is Float -> editor.putFloat(key, value).apply()
            is Long -> editor.putLong(key, value).apply()
        }
    }

    fun clean() {
        editor.clear().commit()
    }
}