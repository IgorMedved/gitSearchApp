package com.example.core.data.repository

import com.example.core.data.local.room.GitSearchDao
import com.example.core.data.remote.network.ApiResponse
import com.example.core.data.remote.network.GitRepoApiService
import com.example.core.domain.gateways.GitSearchGateway
import com.example.core.domain.model.UserSearchInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GitSearchRepositoryImpl @Inject constructor (
    gitRepoApiService: GitRepoApiService,
    gitSearchDao: GitSearchDao
        ): GitSearchGateway {
    //TODO: finish logic asking for cache in database and then requesting GitRepoService
    // cache the new data in the database after the call
    override fun getSearchResponse(userName: String?): ApiResponse<UserSearchInfo> {
        when (userName){
            null -> ApiResponse.Empty
        }
    }
}