package com.example.core.data

import android.content.Context
import android.content.SharedPreferences
import com.example.core.domain.gateways.PrefsGateway
import javax.inject.Inject

class PrefsImpl @Inject constructor(context: Context): PrefsGateway {
    companion object {
        private const val PREFS_NAME = "git_hub_search_prefs"
        private const val LAST_SEARCH = "search"
        private const val INVALID = "invalid_value"
    }

    private val preferences: SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    override fun getLastPreference() = preferences.getString(LAST_SEARCH, INVALID)
    override fun saveLastPreference(value: String?) = preferences.edit().putString(LAST_SEARCH, value).apply()
    override fun isValid() = getLastPreference() != INVALID
}