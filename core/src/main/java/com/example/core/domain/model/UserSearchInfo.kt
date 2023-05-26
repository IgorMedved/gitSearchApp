package com.example.core.domain.model

data class UserSearchInfo (
        val userName: String,
        val avatar_url: String,
        val repoArray: Array<Repo>
    ) {
        override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as UserSearchInfo

                if (userName != other.userName) return false
                if (avatar_url != other.avatar_url) return false
                if (!repoArray.contentEquals(other.repoArray)) return false

                return true
        }

        override fun hashCode(): Int {
                var result = userName.hashCode()
                result = 31 * result + avatar_url.hashCode()
                result = 31 * result + repoArray.contentHashCode()
                return result
        }
}