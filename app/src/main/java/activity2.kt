package com.example.datatransferapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1)

        val textViewReceived: TextView = findViewById(R.id.textViewReceived)
        val buttonSendToActivity2: Button = findViewById(R.id.buttonSendToActivity2)

        // Receive data from MainActivity
        val data = intent.getStringExtra("EXTRA_DATA")
        textViewReceived.text = data

        buttonSendToActivity2.setOnClickListener {
            val modifiedData = "Modified: $data"
            val intent = Intent(this, activity2::class.java)
            intent.putExtra("EXTRA_MODIFIED_DATA", modifiedData)
            startActivity(intent)
        }
    }
}
