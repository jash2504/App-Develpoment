package com.example.sharedpreferences1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sharedpreferences1.R;


public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;

    SharedPreferences pref;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.txtName);
        button = (Button)findViewById(R.id.btn);

        pref = getSharedPreferences("data",MODE_PRIVATE);
        intent = new Intent(MainActivity.this, next.class);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String data = editText.getText().toString();




                    SharedPreferences.Editor editor = pref.edit();
                    editor.putString("data",data);

                    editor.commit();


                    startActivity(intent);

            }
        });
    }
}

