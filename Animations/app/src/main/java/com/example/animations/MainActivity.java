package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView img;
    Button fadein,fadeout,zoomin,zoomout,scaleup,scaledown;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fadein=(Button) findViewById(R.id.fadein);
        fadeout=(Button) findViewById(R.id.fadeout);
        zoomin=(Button) findViewById(R.id.zoomin);
        zoomout=(Button) findViewById(R.id.zoomout);
        scaleup=(Button) findViewById(R.id.scaleup);
        scaledown=(Button) findViewById(R.id.scaledown);

        img=(ImageView)findViewById(R.id.imageView2);
        img.setImageResource(R.drawable.pexels_eberhard_grossgasteiger_2310713);

        fadein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation anfi= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein);
                img.startAnimation(anfi);
            }
        });

        fadeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anfi= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadeout);
                img.startAnimation(anfi);
            }
        });

        zoomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anfi= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoomin);
                img.startAnimation(anfi);
            }
        });

        zoomout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anfi= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoomout);
                img.startAnimation(anfi);
            }
        });

        scaleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anfi= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scaleup);
                img.startAnimation(anfi);
            }
        });

        scaledown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anfi= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scaledown);
                img.startAnimation(anfi);
            }
        });

    }
}