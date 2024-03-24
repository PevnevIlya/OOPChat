package com.example.data.controllers

import com.example.domain.services.ChatService

class ChatController: ChatService {
    override suspend fun getAllMessages(chatId: String): MutableList<Any?> {
        TODO("Not yet implemented")
    }

    override suspend fun sendMessage(chatId: String, senderEmail: String, message: String) {
        TODO("Not yet implemented")
    }
}