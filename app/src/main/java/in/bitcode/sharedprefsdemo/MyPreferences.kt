package `in`.bitcode.sharedprefsdemo

import android.app.Activity
import android.content.Context

object MyPreferences {

    private val USER_PREF_NAME = "user_preferences"

    private val KEY_USERNAME = "username"

    fun putUsername(context: Context, username : String) : Boolean{
        context.getSharedPreferences(USER_PREF_NAME, Activity.MODE_PRIVATE)
            .edit()
            .putString(KEY_USERNAME, username)
            .commit()

        return true
    }

    fun getUsername(context: Context) : String {
        return context.getSharedPreferences(USER_PREF_NAME, Activity.MODE_PRIVATE)
            .getString(KEY_USERNAME, "Not found!")!!
    }
}

