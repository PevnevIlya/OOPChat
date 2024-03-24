package com.example.data.models

data class ChatModel(
    val chatId: String,
    var messageList: MutableList<MessageModel> = mutableListOf()
)
