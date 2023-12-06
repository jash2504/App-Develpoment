package com.example.sharedpreferences1;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class next extends AppCompatActivity{
    SharedPreferences prf;


    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

         result = (TextView)findViewById(R.id.resultView);


        prf = getSharedPreferences("data",MODE_PRIVATE);


        result.setText(prf.getString("data",null));


    }
}


