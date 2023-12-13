package com.example.luckynumapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1: Button = findViewById(R.id.btn)
        val txt: TextView = findViewById(R.id.textView)
        val editTxt:EditText = findViewById(R.id.editText)

        b1.setOnClickListener(){
            //getting user name
            var username = editTxt.text

            //explicit Intent
            var i = Intent(this,LuckyNumberActivity::class.java)

            //pass the data
            i.putExtra("name",username)

            startActivity(i)
        }
    }
}