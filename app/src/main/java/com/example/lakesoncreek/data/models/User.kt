package com.example.lakesoncreek.data.models

data class User(
    val id: String = "",
    val firstName: String = "",
    val lastName: String = "",
    val image: String = "",
    val mobile: Long = "",
    val profileCompleted: Int = 0
)