package com.example.lakesoncreek.Domain.usescase.Uploads

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class UploadDrinks {

    private val drinkscollectionref = Firebase.firestore.collection("drinks")
}