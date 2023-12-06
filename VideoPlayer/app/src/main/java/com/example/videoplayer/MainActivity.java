package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView=(VideoView) findViewById(R.id.vi);


        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);// use for pop pop window

//        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.np);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.video);

        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
}