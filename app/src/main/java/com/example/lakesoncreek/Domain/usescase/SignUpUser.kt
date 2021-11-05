package com.example.lakesoncreek.Domain.usescase

import com.google.firebase.auth.FirebaseAuth

class SignUpUser {

    fun signUpUser(email:String, password:String){
        var auth = FirebaseAuth.getInstance()
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
            if(task.isSuccessful){
            }
        }

    }
}