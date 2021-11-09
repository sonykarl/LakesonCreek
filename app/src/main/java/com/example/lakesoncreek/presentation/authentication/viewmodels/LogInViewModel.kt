package com.example.lakesoncreek.presentation.authentication.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lakesoncreek.data.repository.LakesonRepositoryImp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LogInViewModel @Inject constructor(
    private val repositoryImp: LakesonRepositoryImp
    ): ViewModel(){

    fun loginUser(email:String, password:String,navigation: Unit){
        viewModelScope.launch {
            repositoryImp.loginuser(email, password, navigation)
        }
    }
}