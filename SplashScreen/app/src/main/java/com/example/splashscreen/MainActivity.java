package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        ImageView gf=findViewById(R.id.image);
        gf.setImageResource(R.drawable.png_transparent_mickey_mouse_illustration_the_talking_mickey_mouse_minnie_mouse_the_walt_disney_company_television_show_mickey_mouse_heroes_computer_wallpaper_cartoon_thumbna);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(in);
                finish();
            }
        },5000);
    }
}