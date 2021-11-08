package com.example.lakesoncreek.Domain.usescase.Authentication

import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class ForgotPasswordUsecase {

    fun resetpassword(email: String, navigation: Unit){
        val auth = FirebaseAuth.getInstance()
        auth.sendPasswordResetEmail(email).addOnCompleteListener { task ->
            if (task.isSuccessful){
                navigation
            }
        }
    }
}