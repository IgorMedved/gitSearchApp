package com.example.core.domain.usecase

interface GitSearchUseCaseApi {
    suspend fun obtainSearchResults (userName: String?)
}