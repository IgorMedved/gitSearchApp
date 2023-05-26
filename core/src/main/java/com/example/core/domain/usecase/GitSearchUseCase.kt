package com.example.core.domain.usecase

import com.example.core.domain.gateways.GitSearchGateway
import javax.inject.Inject

class GitSearchUseCase @Inject constructor(val gitSearchGateway: GitSearchGateway) :GitSearchUseCaseApi{
    override suspend fun obtainSearchResults (userName: String?) = gitSearchGateway.getSearchResponse(userName)
}