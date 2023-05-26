package com.example.gitsearch.common

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<V: ViewBinding>: AppCompatActivity() {
    private lateinit var _binding : V
    val binding: V get() {
        if(::_binding.isInitialized) return _binding
        else _binding = getViewBinding()
        return _binding
    }

    abstract fun getViewBinding(): V

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = getViewBinding()
        setContentView(binding.root)
    }
}
