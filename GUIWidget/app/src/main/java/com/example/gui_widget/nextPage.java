package com.example.gui_widget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import  java.io.*;

public class nextPage extends AppCompatActivity {

    TextView tv;
    Button b;
    SharedPreferences pre;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        tv=(TextView)findViewById(R.id.textView6);
        b=(Button) findViewById(R.id.button3);

        pre=getSharedPreferences("User_details",MODE_PRIVATE);
        intent=new Intent(nextPage.this,MainActivity.class);




        tv.setText("Hello "+pre.getString("name",null));


        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = pre.edit();
                editor.clear();
                editor.commit();
                startActivity(intent);

            }
        });





    }
}