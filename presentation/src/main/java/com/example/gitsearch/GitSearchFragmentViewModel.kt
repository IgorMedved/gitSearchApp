package com.example.gitsearch.di

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.bumptech.glide.load.engine.Resource
import com.example.core.domain.usecase.GitSearchUseCase
import com.example.gitsearch.common.BaseViewModel
import kotlinx.coroutines.delay
import javax.inject.Inject
import javax.inject.Named

class GitSearchFragmentViewModel @Inject constructor(private val gitSearchUseCase: GitSearchUseCase) : BaseViewModel() {
    private val _movies = MutableLiveData<Resource<List<SearchResults>>>()
    val movies = _movies as LiveData<Resource<List<SearchResults>>>
    fun search(repoName: String){
        gitSearchUseCase.search(repoName)
    }

    fun getMoviesByQuery(query: String){
        collect(
            useCase.getMoviesByQuery(query)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ response ->
                    _movies.postValue(response)
                }, { error ->
                    _movies.postValue(Resource.Error(error.localizedMessage ?: ""))
                })
        )
    }
}