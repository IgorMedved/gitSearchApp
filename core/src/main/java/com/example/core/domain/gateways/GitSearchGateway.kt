package com.example.core.domain.gateways

import com.example.core.data.remote.network.ApiResponse
import com.example.core.domain.model.UserSearchInfo

interface GitSearchGateway {
    fun getSearchResponse (userName: String?): ApiResponse<UserSearchInfo>
}