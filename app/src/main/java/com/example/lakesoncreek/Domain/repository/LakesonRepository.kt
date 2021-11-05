package com.example.lakesoncreek.Domain.repository

import androidx.navigation.Navigation

interface LakesonRepository {
    suspend fun loginuser(email: String, password: String, navigation: Unit)
    suspend fun signupuser(email: String, password: String, navigation: Unit)
}