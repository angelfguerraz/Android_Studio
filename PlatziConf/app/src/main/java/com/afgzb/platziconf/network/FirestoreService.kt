package com.afgzb.platziconf.network

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings

class FirestoreService {
    // Direct connection to our database
    val firebaseFirestore = FirebaseFirestore.getInstance()
    val settings = FirebaseFirestoreSettings.Builder().setPersistenceEnabled(true).build()

    init {
        // Data is persistence offline
        firebaseFirestore.firestoreSettings = settings
    }

    fun getSpeakers(callback: Callback<list<Speaker>>) {

    }

    fun getSchedule() {

    }
}