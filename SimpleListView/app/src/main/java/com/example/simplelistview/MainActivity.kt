package com.example.simplelistview

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
            android.R.layout.simple_list_item_1,
            world_cup_array
        )

        //connect listview to the array adapter
        listview.adapter = arrayAdapter
    }
}