package com.example.core.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_entity")
data class UserEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    val avatarUrl: String
)
