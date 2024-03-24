package com.example.domain.services

interface ChatService {
    suspend fun getAllMessages(chatId: String): MutableList<Any?>
    suspend fun sendMessage(chatId: String,senderEmail: String, message: String)
}