package com.example.core

import android.content.Context
import com.example.core.di.DatabaseModule
import com.example.core.domain.gateways.GatewayModule
import com.example.core.domain.usecase.UseCaseModule

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [NetworkModule::class,
    GatewayModule::class,
    UseCaseModule::class,
    DatabaseModule::class]
)
interface ModelComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ModelComponent
    }

}