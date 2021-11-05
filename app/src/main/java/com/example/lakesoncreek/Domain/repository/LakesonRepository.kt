package com.example.lakesoncreek.Domain.repository

interface LakesonRepository {

    suspend fun registerUser()
    suspend fun loginUser()

}