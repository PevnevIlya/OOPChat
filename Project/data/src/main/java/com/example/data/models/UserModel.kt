package com.example.data.models

data class UserModel(
    val id: String,
    var password: String = "",
    var email: String = "",
    var name: String = "",
    var status: String = "",
    var photoUrl: String? = "",
    var companionsList: MutableList<String> = mutableListOf(),
    var chatList: MutableList<ChatModel> = mutableListOf()
)
