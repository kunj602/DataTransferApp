
package com.example.datatransferapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        val textViewFinalData: TextView = findViewById(R.id.textViewFinalData)

        // Receive data from Activity1
        val modifiedData = intent.getStringExtra("EXTRA_MODIFIED_DATA")
        textViewFinalData.text = modifiedData
    }
}
