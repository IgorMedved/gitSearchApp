package com.example.core.data.remote.response

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class RepoResponse(
    @field:SerializedName("name")
    val repoName: String,
    @field:SerializedName("description")
    val description: String,
    @field:SerializedName("updated_at")
    val updated: String,
    @field:SerializedName("stargazers_count")
    val stargazers: Int,
    @field:SerializedName("forks")
    val forks: Int
)
