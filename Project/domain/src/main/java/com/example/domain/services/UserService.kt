package com.example.domain.services

interface UserService {
    suspend fun changeUserInfo(email: String,name: String?, status: String?, photoUrl: String?)

    suspend fun getUserInfo(email: String): Any?

    suspend fun addCompanion(email: String, companionEmail: String): String
}