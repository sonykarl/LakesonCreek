package com.example.lakesoncreek.Domain.usescase.Authentication

import androidx.navigation.Navigation
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class LogInUser {

    suspend fun loginUser(email: String,password: String,navigation: Navigation){
        var auth = FirebaseAuth.getInstance()

        auth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                task ->
            if (task.isSuccessful){
                navigation
            }

        }
    }
}