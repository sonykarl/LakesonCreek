package com.example.lakesoncreek.app.authentication.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lakesoncreek.data.repository.LakesonRepositoryImp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ForgotPasswordViewModel @Inject constructor(val repositoryImp: LakesonRepositoryImp): ViewModel() {

    fun forgotpassword(email:String , navigation: Unit){
        viewModelScope.launch {
            repositoryImp.forgotPassword(email, navigation)
        }
    }
}