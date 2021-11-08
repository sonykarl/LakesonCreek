package com.example.lakesoncreek.Domain.usescase.Firestore

import com.example.lakesoncreek.data.models.User
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions

class CreateUser {

    fun createUser(userinfo:User){
        val db = FirebaseFirestore.getInstance()
        db.collection("users")
            .document(userinfo.id)
            .set(userinfo, SetOptions.merge())

    }
}