package com.example.nevigationbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        ImageView iv=(ImageView) findViewById(R.id.gi);
        iv.setImageResource(R.drawable.ad);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in =new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(in);
            }
        },5000);

    }
}