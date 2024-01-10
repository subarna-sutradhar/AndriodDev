package com.example.vaccinesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1 Adapterview: RecyclerView
        val recyclerView:RecyclerView = findViewById(R.id.recyclerView)
        //showing the view in many forms- grids,list ,etc
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)

        //2 Data source: list of vaccine models
        var vaccinesList: ArrayList<VaccineModel> = ArrayList()

        val v1 = VaccineModel("COVID-19",R.drawable.vaccine1)
        val v2 = VaccineModel("Hepatitis B Vaccine",R.drawable.vaccine2)
        val v3 = VaccineModel("Tetanus Vaccine",R.drawable.vaccine3)
        val v4 = VaccineModel("Pneumococcal Vaccine",R.drawable.vaccine4)
        val v5 = VaccineModel("Rotavirus Vaccine",R.drawable.vaccine5)
        val v6 = VaccineModel("Measles Vaccine",R.drawable.vaccine6)
        val v7 = VaccineModel("Chickenpox vaccine",R.drawable.vaccine7)

        vaccinesList.add(v1)
        vaccinesList.add(v2)
        vaccinesList.add(v3)
        vaccinesList.add(v4)
        vaccinesList.add(v5)
        vaccinesList.add(v6)
        vaccinesList.add(v7)


        //3 Adapter
        val adapter = MyAdapter(vaccinesList)

        recyclerView.adapter=adapter






    }
}