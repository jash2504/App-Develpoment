package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MassageActivity extends AppCompatActivity {

    private TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_massage);

        t1=(TextView) findViewById(R.id.show);
        handleIntent(getIntent());
    }

    @Override
    protected  void  onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        handleIntent(intent);
    }
    private void handleIntent(Intent intent) {
        if(intent != null)
        {
            String message = intent.getStringExtra("message");
            if(message != null)
            {
                t1.setText((message));
            }
        }
    }
}