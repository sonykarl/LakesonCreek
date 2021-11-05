package com.example.lakesoncreek.Domain.repository

interface LakesonRepository {
    suspend fun loginuser()
    suspend fun signupuser()
}