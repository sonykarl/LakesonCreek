package com.example.lakesoncreek.Domain.usescase

import androidx.navigation.Navigation
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SignUpUser {

    fun signUpUser(email:String, password:String,navigation: Navigation){

        var auth = FirebaseAuth.getInstance()
        GlobalScope.launch {
            auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
                if(task.isSuccessful){
                    navigation
                }
            }
        }
    }
}