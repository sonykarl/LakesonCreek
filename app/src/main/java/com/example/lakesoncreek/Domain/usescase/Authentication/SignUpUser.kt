package com.example.lakesoncreek.Domain.usescase.Authentication


import com.example.lakesoncreek.Domain.usescase.Firestore.CreateUser
import com.example.lakesoncreek.data.models.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class SignUpUser {

    fun signUpUser(email:String, password:String,navigation: Unit,firstName:String,lastName:String){

        var auth = FirebaseAuth.getInstance()
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->

            if(task.isSuccessful){
                val firebaseUser: FirebaseUser = task.result!!.user!!

                val user = User(firebaseUser.uid,firstName,lastName,email)
                CreateUser().createUser(user,navigation)
            }
        }
    }
}