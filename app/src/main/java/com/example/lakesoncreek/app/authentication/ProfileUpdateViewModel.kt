package com.example.lakesoncreek.app.authentication

import com.example.lakesoncreek.data.repository.LakesonRepositoryImp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileUpdateViewModel @Inject
constructor(val repositoryImp: LakesonRepositoryImp){

    fun updateProfile(){}
}