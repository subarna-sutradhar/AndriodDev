package com.example.luckynumapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import kotlin.random.Random

class LuckyNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)

        val text1:TextView = findViewById(R.id.text1)
        val luckyText:TextView = findViewById(R.id.luckyNumTxt)
        val shareBtn:Button = findViewById(R.id.sharebtn)

        var username = receiveUserName()
        Toast.makeText(this,""+username,Toast.LENGTH_LONG).show()

        var random_num = generateRanNum()
        luckyText.setText(""+random_num)

        shareBtn.setOnClickListener(){
            shareData(username,random_num)
        }



    }

    fun receiveUserName():String{
        var bundle:Bundle?= intent.extras

        var username = bundle?.get("name").toString()
        return username
    }
    fun generateRanNum():Int{
        val random = Random.nextInt(1000)
        return random
    }

    //sharing username and number
    fun shareData(username:String,num:Int){
        //implicit intent
        var i = Intent(Intent.ACTION_SEND)
        i.setType("text/plain")
        i.putExtra(Intent.EXTRA_SUBJECT,"$username is lucky today")
        i.putExtra(Intent.EXTRA_TEXT, "His lucky number is $num")
        startActivity(i)
    }
}