package com.example.lakesoncreek.Domain.usescase.Authentication

import android.net.Uri
import android.provider.ContactsContract
import androidx.navigation.Navigation
import com.google.firebase.auth.ktx.auth
import com.google.firebase.auth.ktx.userProfileChangeRequest
import com.google.firebase.ktx.Firebase

class UpdateUserProfile {
    fun updateUser(fullname:String, photo: Uri?, navigation: Unit){
        val user = Firebase.auth.currentUser
        val profileUpdates = userProfileChangeRequest {
            displayName = fullname
            photoUri = photo
        }

        user!!.updateProfile(profileUpdates)
            .addOnCompleteListener { task ->
                if (task.isSuccessful){
                    navigation
                }
            }
    }

}