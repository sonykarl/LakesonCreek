package com.example.lakesoncreek.app.homepage

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lakesoncreek.data.repository.LakesonRepositoryImp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomepageViewModel @Inject constructor( val repositoryImp: LakesonRepositoryImp): ViewModel() {
    fun retrievedrinks(){
        viewModelScope.launch {
            repositoryImp.retrieveDrinks()
        }
    }
}