package com.example.core.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.core.data.local.entity.RepoEntity
import com.example.core.data.local.entity.UserEntity

@Database(entities = [RepoEntity::class, UserEntity::class], version = 1, exportSchema = false)
abstract class GitSearchDataBase: RoomDatabase() {
    abstract fun gitSearchDao():GitSearchDao
}