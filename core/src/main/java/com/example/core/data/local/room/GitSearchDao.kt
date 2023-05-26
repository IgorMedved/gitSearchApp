package com.example.core.data.local.room

import androidx.room.*
import com.example.core.data.local.entity.RepoEntity
import com.example.core.data.local.entity.UserEntity
import io.reactivex.Completable
import io.reactivex.Single

@Dao
interface GitSearchDao {
    @Query("SELECT * from user_entity WHERE name = :name")
    fun getUserEntity (name: String): Single<UserEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUserEntity(userEntity: UserEntity): Completable

    @Query("SELECT * from repo_entity WHERE userId = :userId")
    fun getRepoEntity(userId: Int): List<RepoEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRepos (result: List<RepoEntity>): Completable

    @Transaction
    fun insertAll (userEntity: UserEntity, repos: List<RepoEntity>) {
        insertUserEntity(userEntity)
        insertRepos(repos)
    }

}