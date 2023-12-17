package com.example.frenchapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun SayTheColor(view: View){
        //casting the view as button
        val clickedbtn:Button = view as Button
        var mediaPlayer:MediaPlayer = MediaPlayer.create(this,
            resources.getIdentifier(clickedbtn.tag.toString(),"raw",packageName))
        mediaPlayer.start()
    }
}