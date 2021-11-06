package com.example.lakesoncreek.Domain.usescase.homepage

import com.example.lakesoncreek.data.models.Drinks
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase

class RetrieveDrinks {
    fun getDrinks(){

        val getdrinkscollectionref = Firebase.firestore.collection("Drinks").get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    val drinks = document.toObject<Drinks>()
                }
            }


    }

}