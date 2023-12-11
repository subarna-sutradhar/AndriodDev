package com.example.explicitintensapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn:Button = findViewById(R.id.btn)

        btn.setOnClickListener(){
            //Explicit Intent

            var i:Intent = Intent(this,Activity2::class.java)

            //Passing Data btw Activities
            i.putExtra("age",20)

            startActivity(i)
        }

    }
}