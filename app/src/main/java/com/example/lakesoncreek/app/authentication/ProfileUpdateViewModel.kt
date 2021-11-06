package com.example.lakesoncreek.app.authentication

import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lakesoncreek.data.repository.LakesonRepositoryImp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileUpdateViewModel @Inject
constructor(val repositoryImp: LakesonRepositoryImp): ViewModel(){

    fun updateProfile(fullname:String, photo: Uri?, navigation: Unit){
        viewModelScope.launch {
            repositoryImp.updateProfile(fullname, photo, navigation)
        }
    }
}