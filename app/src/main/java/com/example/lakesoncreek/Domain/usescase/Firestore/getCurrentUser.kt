package com.example.lakesoncreek.Domain.usescase.Firestore

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class getCurrentUser {

    fun getCurrentUserID(): String {
        val currentUser = FirebaseAuth.getInstance().currentUser
        var currentUserID = ""
        if (currentUser != null){
            currentUserID = currentUser.uid
        }
        return currentUserID
    }
}