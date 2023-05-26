package com.example.gitsearch
import android.app.Application
import com.example.gitsearch.di.DaggerPresentationComponent
import com.example.gitsearch.di.PresentationComponent
import com.example.core.DaggerModelComponent
import com.example.core.ModelComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class GitSearchApplication: Application(), HasAndroidInjector {
    @Inject
    lateinit var androidInjector : DispatchingAndroidInjector<Any>
    override fun androidInjector(): AndroidInjector<Any> = androidInjector

    val modelComponent: ModelComponent by lazy {
        DaggerModelComponent.factory().create(applicationContext)
    }
    val presentationComponent: PresentationComponent by lazy {
        DaggerPresentationComponent.factory().create(modelComponent)
    }
}


