package com.example.lakesoncreek.app.authentication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lakesoncreek.Domain.usescase.Authentication.LogInUser
import com.example.lakesoncreek.data.repository.LakesonRepositoryImp
import kotlinx.coroutines.launch

class LogInViewModel(val repositoryImp: LakesonRepositoryImp): ViewModel(){

    fun logInUser(){

        viewModelScope.launch {
           val logInUser = repositoryImp.loginuser()
            logInUser
        }
    }
}