package com.example.camera;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn;
    private ImageView img;
//    private VideoView vidCapture;
    private  static final int Image_Capture_Code=1;
//    private  static final int Video_Capture_Code=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(ImageButton) findViewById(R.id.imgbutton);
        img=(ImageView) findViewById(R.id.imageView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,Image_Capture_Code);
            }


        });

    }

    protected void onActivityResult(int requestCode,int resultCode,Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);

        if(resultCode==Image_Capture_Code)
        {
            Bitmap bp=(Bitmap) data.getExtras().get("data");
            img.setImageBitmap(bp);
            MediaStore.Images.Media.insertImage(getContentResolver(),bp,"Image","Image info");
            
        } else if (resultCode == RESULT_CANCELED) {
            Toast.makeText(this, "Canceled", Toast.LENGTH_SHORT).show();
        }

    }
}