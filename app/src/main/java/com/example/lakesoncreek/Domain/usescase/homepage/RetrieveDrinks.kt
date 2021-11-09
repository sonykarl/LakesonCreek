package com.example.lakesoncreek.Domain.usescase.homepage

import android.content.ContentValues.TAG
import android.util.Log
import com.example.lakesoncreek.data.models.Drinks
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase

class RetrieveDrinks {
    val db = FirebaseFirestore.getInstance()
    fun getDrinks(){
        val docref = db.collection("Drinks").document("KTjCBAjrFMbqiPqEasVH")
        docref.get()
            .addOnSuccessListener { document ->
                if(document != null){
                    Log.d(TAG, "DocumentSnapshot data: ${document.data}")
                }
            }
    }

}