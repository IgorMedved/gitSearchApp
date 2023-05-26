package com.example.core.data.remote.network

import com.example.core.data.remote.response.RepoResponse
import com.example.core.data.remote.response.UserResponse
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Path

interface GitRepoApiService {
    @GET("/{user_id}")
    suspend fun getUser(
        @Path("user_id") userId: String
    ): Flowable<UserResponse>

    @GET("/{user_id}/repos")
    suspend fun getRepos(
        @Path("user_id") userId: String
    ): Flowable<RepoResponse>
}