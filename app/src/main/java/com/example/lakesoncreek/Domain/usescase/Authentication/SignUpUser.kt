package com.example.lakesoncreek.Domain.usescase.Authentication


import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class SignUpUser {

    fun signUpUser(email:String, password:String,navigation: Unit){

        var auth = FirebaseAuth.getInstance()
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
            if(task.isSuccessful){
                val firebaseUser: FirebaseUser = task.result!!.user!!
                navigation
            }
        }
    }
}