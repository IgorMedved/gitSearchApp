package com.example.gitsearch.di

import com.example.gitsearch.GitSearchFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeGitSearchFragment(): GitSearchFragment
}
