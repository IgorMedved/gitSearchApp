package com.example.gitsearch.di

import com.example.core.ModelComponent
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Scope


@AppScope
@Component(
    dependencies = [ModelComponent::class],
    modules = [
        AndroidInjectionModule::class,
        PresentationModule::class,
        MainActivityModule::class
    ]
)
interface PresentationComponent : ModelComponent {
    @Component.Factory
    interface Factory {
        fun create(modelComponent: ModelComponent): PresentationComponent
    }
}

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope