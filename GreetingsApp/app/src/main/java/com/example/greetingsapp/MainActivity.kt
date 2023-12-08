package com.example.greetingsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //step2
        val edt:EditText = findViewById(R.id.edt)
        val btn:Button = findViewById(R.id.btn)


        //step3: adding functionalities

        btn.setOnClickListener(){
            var enteredtxt = edt.text
            Toast.makeText(
                this,
                "Hello "+enteredtxt,
                Toast.LENGTH_LONG
            ).show()
        }
    }
}