package com.example.sms_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private EditText cn, msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        cn = (EditText) findViewById(R.id.cn);
        msg = (EditText) findViewById(R.id.msg);




            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        SmsManager s = SmsManager.getDefault();
                        s.sendTextMessage(cn.getText().toString(), null, msg.getText().toString(), null, null);
                        Toast.makeText(getApplicationContext(), "SMS Sending", Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

        }
    }
