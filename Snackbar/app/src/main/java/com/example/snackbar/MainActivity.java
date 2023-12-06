package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button);
        Object myOnClickListenre;
        b1.setOnClickListener(View.OnClickListener myOnClickListenre=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast=  Toast.makeText(getApplicationContext(),"Hello!!!", Toast.LENGTH_SHORT);
//                toast.setGravity(Gravity.CENTER_VERTICAL,0,10);
//                toast.show();

            }
        });

        Snackbar.make(findViewById(R.id.parentview),"Message is Deleted",Snackbar.LENGTH_SHORT)
        .setAction((CharSequence) "Message is Inserted", (View.OnClickListener) myOnClickListenre)
                .show();


    }
}