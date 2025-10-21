package com.example.kotlinpurestudy.object_keyword_study

import android.content.Context
import android.content.SharedPreferences

fun main(){
    // no matter how many times Logger.log is called it will share the same instance
    Logger.log("club data message")
    PreferencesManager.saveTheme(isDark = true)
}

// instantiate an object to only 1 class
object  Logger{
    fun log(message: String) {
        println("Club Scene App Logs:: $message")
    }
}

object PreferencesManager{
    private lateinit var prefs: SharedPreferences

    fun init(context: Context) {
        prefs = context.getSharedPreferences("settings", Context.MODE_PRIVATE)
    }

    fun saveTheme(isDark: Boolean) {
        prefs.edit().putBoolean("dark_mode", isDark).apply()
    }

    fun isDarkMode() = prefs.getBoolean("dark_mode", false)

}