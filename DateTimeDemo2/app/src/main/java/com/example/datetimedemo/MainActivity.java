package com.example.datetimedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.datetimedemo.fragments.DatePickerFragment;
import com.example.datetimedemo.fragments.TimePickerFragment;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    EditText e1;
    EditText e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b2=(Button) findViewById(R.id.b2);
        b1=(Button) findViewById(R.id.b1);

        e1=(EditText) findViewById(R.id.time);
        e2= (EditText) findViewById(R.id.date);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerFragment timePickerFragment=new TimePickerFragment(e1);
                timePickerFragment.show(getSupportFragmentManager(),"DATE PICKER");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerFragment datePickerFragment=new DatePickerFragment((e2));
                datePickerFragment.show(getSupportFragmentManager(),"TIME PICKER");
            }
        });
    }
}