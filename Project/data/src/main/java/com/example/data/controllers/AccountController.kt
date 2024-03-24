package com.example.data.controllers

import com.example.domain.services.AccountService

class AccountController: AccountService {
    override suspend fun registerUseCase(email: String, password: String) {
        TODO("Not yet implemented")
    }

    override suspend fun loginUser(email: String, password: String) {
        TODO("Not yet implemented")
    }
}