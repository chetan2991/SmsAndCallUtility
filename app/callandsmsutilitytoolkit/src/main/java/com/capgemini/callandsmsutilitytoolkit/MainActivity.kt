package com.capgemini.callandsmsutilitytoolkit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.launchfeaturebutton).setOnClickListener {
            val intent = Intent(this, ::class.java)
        }
    }
}

