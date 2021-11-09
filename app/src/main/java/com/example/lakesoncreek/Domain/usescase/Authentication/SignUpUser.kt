package com.example.lakesoncreek.Domain.usescase.Authentication


import com.example.lakesoncreek.Domain.usescase.Firestore.CreateUser
import com.example.lakesoncreek.data.models.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SignUpUser {

    fun signUpUser(email:String, password:String,navigation: Unit,firstName:String,lastName: String){

        var auth = FirebaseAuth.getInstance()
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->

            if(task.isSuccessful){
                val firebaseUser: FirebaseUser = task.result!!.user!!
                val user = User(
                    id = firebaseUser.uid,
                    firstName = firstName,
                    lastName = lastName,
                    email = email
                )
                CreateUser().createUser(user,navigation)
            }
        }
    }
}