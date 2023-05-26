package com.example.core.data.remote.response

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class UserResponse (
    @field:SerializedName("name")
    val name: String,
    @field:SerializedName("avatar_url")
    val avatarUrl: String
)