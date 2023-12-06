package com.example.datapersistence_filesexternalstorage;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Environment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText uname, pwd;
    Button saveBtn;

    private String filename = "file.txt";
    private String filepath = "files";
    File file;
    FileOutputStream fstream;
    Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = (EditText)findViewById(R.id.txtName);
        pwd = (EditText)findViewById(R.id.txtPwd);
        saveBtn = (Button)findViewById(R.id.btnSave);


        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = uname.getText().toString()+"\n";
                String password = pwd.getText().toString();

                try {
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{android.Manifest.permission.READ_EXTERNAL_STORAGE},23);

                    if (!isExternalStorageAvailable() || isExternalStorageReadOnly()) {

                        Toast.makeText(MainActivity.this, "External storage not available on the device..", Toast.LENGTH_SHORT).show();
                    } else {

                        Toast.makeText(MainActivity.this, "External storage is available on the device..", Toast.LENGTH_SHORT).show();
                        file= new File(getExternalFilesDir(filepath), filename);

                    }



                    fstream = new FileOutputStream(file);
                    fstream.write(username.getBytes());
                    fstream.write(password.getBytes());
                    fstream.close();
//                    Toast.makeText(getApplicationContext(), "Details Saved in "+externalFile.getAbsolutePath(),Toast.LENGTH_SHORT).show();

                    intent = new Intent(MainActivity.this,detail.class);
                    startActivity(intent);

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private static boolean isExternalStorageReadOnly() {

        String extStorageState = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(extStorageState)) {
            return true;
        }
        return false;
    }


    private static boolean isExternalStorageAvailable() {

        String extStorageState = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(extStorageState)) {
            return true;
        }
        return false;
    }
}