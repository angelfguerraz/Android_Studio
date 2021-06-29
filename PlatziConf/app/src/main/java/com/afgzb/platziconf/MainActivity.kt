package com.afgzb.platziconf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.afgzb.platziconf.model.Conference
import com.afgzb.platziconf.model.Speaker
import com.google.firebase.firestore.FirebaseFirestore
import org.json.JSONArray
import org.json.JSONObject
import java.util.*

/*
* var is like general variable and it's known as a mutable variable in kotlin and can be assigned multiple times.

val is like Final variable and it's known as immutable in kotlin and can be initialized only single time.
* */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}