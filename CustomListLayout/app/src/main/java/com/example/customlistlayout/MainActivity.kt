package com.example.customlistlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //step1: Adapter View: Listview
        var listview: ListView = findViewById(R.id.listview)

        //step2: Data Source: Array of Strings
        val world_cup_array = arrayOf(
            "Germany","Brazil","England","Spain","Qatar"
        )

        //step3: Adapter
        val arrayAdapter: ArrayAdapter<*>//all types *

        arrayAdapter = ArrayAdapter(
            this,
            R.layout.list_item,
            R.id.textView,//just pass a new arg to take from textView
            world_cup_array
        )

        //connect listview to the array adapter
        listview.adapter = arrayAdapter
    }
}