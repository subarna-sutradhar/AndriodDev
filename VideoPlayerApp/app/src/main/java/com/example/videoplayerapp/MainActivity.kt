package com.example.videoplayerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  videoView:VideoView = findViewById(R.id.videoview1)

        //video path from local storage
        videoView.setVideoPath("android.resource://" + packageName + "/" + R.raw.video_example)

        //media controllers
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        mediaController.setMediaPlayer(videoView)
        videoView.setMediaController(mediaController)
        videoView.start()

    }
}