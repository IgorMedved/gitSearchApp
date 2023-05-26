package com.example.core.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "repo_entity")
data class RepoEntity(
    @PrimaryKey
    val id: Int,
    val userId: Int,
    val name : String,
    val description : String,
    val updated_at : String,
    val stargazers_count: Int,
    val forks : Int
)
