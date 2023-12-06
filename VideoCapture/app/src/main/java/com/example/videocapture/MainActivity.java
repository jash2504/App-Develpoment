package com.example.videocapture;

import androidx.appcompat.app.AppCompatActivity;

import static android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE_VIDEO;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {



        private Button btnCapture;
        private VideoView vidCapture;
        private static final int Video_Capture_Code = 1;

        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            btnCapture = (Button) findViewById(R.id.btnTakeVideo);
            vidCapture = (VideoView) findViewById(R.id.capturedVideo);
            btnCapture.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent cInt = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                    //noinspection deprecation
                    startActivityForResult(cInt, Video_Capture_Code);
                }
            });
        }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
            super.onActivityResult(requestCode, resultCode, intent);
            if (requestCode == Video_Capture_Code && resultCode == RESULT_OK) {
                Uri videoUri = intent.getData();
                vidCapture.setVideoURI(videoUri);
                MediaStore.Video.Media.getContentUri("demo");
            }
        }
    }

