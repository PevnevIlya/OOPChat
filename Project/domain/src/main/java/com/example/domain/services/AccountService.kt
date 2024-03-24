package com.example.domain.services

interface AccountService {
    suspend fun registerUseCase(email: String, password: String)

    suspend fun loginUser(email: String, password: String)
}