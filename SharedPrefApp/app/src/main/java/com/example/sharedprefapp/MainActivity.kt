package com.example.sharedprefapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var name_textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText:EditText = findViewById(R.id.editText)
        name_textView = findViewById(R.id.textViewName)
        val btn:Button = findViewById(R.id.btn)

        btn.setOnClickListener(){
            val enteredText:String = editText.text.toString()
            SaveName(enteredText)
        }
        DisplaySavedName()
    }

    private fun SaveName(enteredText: String) {
        //Openning the shared preferences
        val sharedPreferences:SharedPreferences = getSharedPreferences(
            "UserName",
            MODE_PRIVATE
        )

        //writing data to shared preferences

        val editor:SharedPreferences.Editor = sharedPreferences.edit()

        editor.putString("name",enteredText)
        editor.commit()
    }

    //reading data from shared pref

    fun DisplaySavedName(){
        val sharedPreferences:SharedPreferences = getSharedPreferences("UserName", MODE_PRIVATE)

        val s1:String? = sharedPreferences.getString("name","")

        name_textView.setText(s1)
    }

}