package com.example.databindingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databindingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //create a binding obj
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //remove this
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.apply{
            btn.setOnClickListener(){
                var enteredText:String = editText.text.toString()
                textView.setText("Hello $enteredText")
            }

            //instead of writing binding always use the above code
//        binding.btn.setOnClickListener(){
//            var enteredText:String = binding.editText.text.toString()
//            binding.textView.setText("Hello $enteredText")

        }
    }
}