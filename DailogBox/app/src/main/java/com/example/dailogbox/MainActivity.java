package com.example.dailogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=(Button) findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDailog();
            }
        });
    }

    private void openDailog() {

        MyDialogbox myDialogbox=new MyDialogbox();
        myDialogbox.show(getSupportFragmentManager(),"My Dialogbox");
    }
}