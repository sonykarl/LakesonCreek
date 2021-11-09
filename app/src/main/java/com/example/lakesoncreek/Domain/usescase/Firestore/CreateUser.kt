package com.example.lakesoncreek.Domain.usescase.Firestore

import com.example.lakesoncreek.data.models.User
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions

class CreateUser {

    private val db = FirebaseFirestore.getInstance()

    fun createUser(userinfo:User,navigation: Unit){
        db.collection("users")
            .document(userinfo.id)
            .set(userinfo, SetOptions.merge())
            .addOnCompleteListener { task ->
                if (task.isSuccessful){
                    navigation
                }
            }

    }
}