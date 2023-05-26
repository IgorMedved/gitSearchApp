package com.example.core.domain.gateways

import com.example.core.data.PrefsImpl
import com.example.core.data.repository.GitSearchRepositoryImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface GatewayModule {
    @Singleton
    @Binds
    fun provideGitSearchGateway (gitSearchGateway: GitSearchRepositoryImpl): GitSearchGateway

    @Singleton
    @Binds
    fun providePrefsGateway (prefsGateway: PrefsImpl): PrefsGateway
}