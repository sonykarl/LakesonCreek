package com.example.lakesoncreek.Domain.repository

import android.net.Uri
import androidx.navigation.Navigation

interface LakesonRepository {
    suspend fun loginuser(email: String, password: String, navigation: Unit)
    suspend fun signupuser(email: String, password: String, navigation: Unit,firstName: String,lastName:String)
    suspend fun retrieveDrinks()
    suspend fun forgotPassword(email:String, navigation: Unit)
}