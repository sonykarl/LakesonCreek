package com.example.lakesoncreek.data.repository

import android.net.Uri
import com.example.lakesoncreek.Domain.repository.LakesonRepository
import com.example.lakesoncreek.Domain.usescase.Authentication.LogInUser
import com.example.lakesoncreek.Domain.usescase.Authentication.SignUpUser
import com.example.lakesoncreek.Domain.usescase.Authentication.UpdateUserProfile


class LakesonRepositoryImp(): LakesonRepository{

    override suspend fun loginuser(email: String, password: String, navigation: Unit) {
        val login = LogInUser()
        return login.loginUser(email, password, navigation)
    }

    override suspend fun signupuser(email: String, password: String, navigation: Unit) {
        val signup = SignUpUser()
        return signup.signUpUser(email, password, navigation)
    }

    override suspend fun updateProfile(fullname: String, photo: Uri?, navigation: Unit) {
        val updateUserProfile = UpdateUserProfile()
        return updateUserProfile.updateUser(fullname, photo, navigation)
    }
}