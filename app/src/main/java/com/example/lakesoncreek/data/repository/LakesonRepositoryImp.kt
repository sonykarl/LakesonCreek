package com.example.lakesoncreek.data.repository

import com.example.lakesoncreek.Domain.repository.LakesonRepository
import com.example.lakesoncreek.Domain.usescase.Authentication.LogInUser
import com.example.lakesoncreek.Domain.usescase.Authentication.SignUpUser


class LakesonRepositoryImp(): LakesonRepository{

    override suspend fun loginuser(email: String, password: String, navigation: Unit) {
        val login = LogInUser()
        return login.loginUser(email, password, navigation)
    }

    override suspend fun signupuser(email: String, password: String, navigation: Unit) {
        val signup = SignUpUser()
        return signup.signUpUser(email, password, navigation)
    }
}