package com.example.lakesoncreek.app.authentication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lakesoncreek.data.repository.LakesonRepositoryImp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val repositoryImp: LakesonRepositoryImp
    ): ViewModel() {

        fun signUpuser(email: String, password: String, navigation: Unit,firstName:String,lastName:String,mobile:Long){
            viewModelScope.launch {
                repositoryImp.signupuser(email, password, navigation,firstName,lastName,mobile)
            }
        }
}