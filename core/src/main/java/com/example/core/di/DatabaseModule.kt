package com.example.core.di

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.util.Log
import androidx.room.Room
import com.example.core.data.local.room.GitSearchDao
import com.example.core.data.local.room.GitSearchDataBase
import dagger.Module
import dagger.Provides
import java.util.concurrent.Executors
import javax.inject.Singleton

@Module
class DatabaseModule {

    private val passphrase: ByteArray = SQLiteDatabase.getBytes("GitSearchDataBase".toCharArray())
    val factory = SupportFactory(passphrase)

    @Singleton
    @Provides
    fun provideDatabase(context: Context): GitSearchDataBase = Room.databaseBuilder(
        context,
        GitSearchDataBase::class.java, "GitSearchDataBase.db"
    )
        .fallbackToDestructiveMigration()
        .setQueryCallback({ sqlQuery, bindArgs ->
            Log.e("TMDBDataBase", "provideDatabase: SQL Query: $sqlQuery SQL Args: $bindArgs")
        }, Executors.newSingleThreadExecutor())
        .openHelperFactory(factory)
        .build()

    @Provides
    fun provideGitSearchDao(database: GitSearchDataBase): GitSearchDao = database.gitSearchDao()

}
