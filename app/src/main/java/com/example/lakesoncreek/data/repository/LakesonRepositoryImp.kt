package com.example.lakesoncreek.data.repository

import androidx.navigation.Navigation
import com.example.lakesoncreek.Domain.repository.LakesonRepository
import com.example.lakesoncreek.Domain.usescase.Authentication.LogInUser
import com.example.lakesoncreek.Domain.usescase.Authentication.SignUpUser


class LakesonRepositoryImp(): LakesonRepository{
    lateinit var email: String
    lateinit var password: String
    lateinit var navigation: Navigation

    override suspend fun loginuser() {
        val login = LogInUser()
        return login.loginUser(email, password, navigation)

    }

    override suspend fun signupuser() {
        val signUpUser = SignUpUser()
        return signUpUser.signUpUser(email, password, navigation)
    }
}