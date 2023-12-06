package com.example.gui_widget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button2;
    EditText name,pw;
    SharedPreferences sp;
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.editTextText);
        pw=(EditText)findViewById(R.id.editTextTextPassword);
        button2 = (Button) findViewById(R.id.button2);


        sp=getSharedPreferences("User_details",MODE_PRIVATE);
        in =new Intent(MainActivity.this, nextPage.class);


        if(sp.contains("name") && sp.contains("password"))
        {
            startActivity(in);
        }


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uname=name.getText().toString();
                String password=pw.getText().toString();


                if (uname.equals("jash") && password.equals("jash"))
                {
                    SharedPreferences.Editor editor= sp.edit();
                    editor.putString("name",uname);
                    editor.putString("password",password);
                    editor.commit();

                    Toast.makeText(getApplicationContext(),"Succesfully login!!",Toast.LENGTH_SHORT).show();
//                    startActivity(in);

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong Password!!",Toast.LENGTH_SHORT).show();
                }


            }
        });

    }


}