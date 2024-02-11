package com.example.databindingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText:EditText = findViewById(R.id.editText)
        val btn:Button = findViewById(R.id.btn)
        val text:TextView = findViewById(R.id.textView)

        btn.setOnClickListener(){
            var enteredText:String = editText.text.toString()

            text.setText(enteredText)
        }
    }
}