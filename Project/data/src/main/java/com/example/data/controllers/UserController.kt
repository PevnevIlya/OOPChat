package com.example.data.controllers

import com.example.domain.services.UserService

class UserController: UserService {
    override suspend fun changeUserInfo(
        email: String,
        name: String?,
        status: String?,
        photoUrl: String?
    ) {
        TODO("Not yet implemented")
    }

    override suspend fun getUserInfo(email: String): Any? {
        TODO("Not yet implemented")
    }

    override suspend fun addCompanion(email: String, companionEmail: String): String {
        TODO("Not yet implemented")
    }
}