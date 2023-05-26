package com.example.core.domain.usecase

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface UseCaseModule {
    @Singleton
    @Binds
    fun provideUseCase (gitSearchUseCase: GitSearchUseCase): GitSearchUseCaseApi
}