package com.example.lakesoncreek.app.authentication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.Navigation
import com.example.lakesoncreek.data.repository.LakesonRepositoryImp
import kotlinx.coroutines.launch
import javax.inject.Inject

class LogInViewModel @Inject constructor(val repositoryImp: LakesonRepositoryImp): ViewModel(){

    fun loginUser(email:String, password:String,navigation: Unit){
        viewModelScope.launch {
            repositoryImp.loginuser(email, password, navigation)
        }
    }
}