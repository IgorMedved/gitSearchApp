package com.example.core.domain.gateways

import com.example.core.data.PrefsImpl

interface PrefsGateway {
    fun getLastPreference(): String?
    fun saveLastPreference(value: String?)
    fun isValid():Boolean

}
