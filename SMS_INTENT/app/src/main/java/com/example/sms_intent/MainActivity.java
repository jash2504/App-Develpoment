package com.example.sms_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sms_intent.R;

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
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("smsto:"));
                    i.setType("vnd.android-dir/mms-sms");
                    i.putExtra("address", new String(cn.getText().toString()));
                    i.putExtra("sms_body",msg.getText().toString());
                    startActivity(Intent.createChooser(i, "Send sms via:"));

                    Toast.makeText(getApplicationContext(), "SMS Sending", Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
