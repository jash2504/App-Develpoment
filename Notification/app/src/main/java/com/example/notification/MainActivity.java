package com.example.notification;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private static final String CHANNEL_ID="notification_channel";
    private static final int NOTIFICATION_ID=1;

    private EditText text;
    private Button button_send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=(EditText)findViewById(R.id.text);
        button_send=(Button)findViewById(R.id.send);

        button_send.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View v) {
                String message=text.getText().toString();
                sendNotification(message);

            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void sendNotification(String message)
    {
        createNotificationchannel();

        Intent intent =  new Intent(this,MassageActivity.class);
//        (key,String)
        intent.putExtra("message",message);
//        FLAG_ACTIVITY_CLEAR_TASK used in conjunction with FLAG_ACTIVITY_NEW_TASK
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        //        PendingIntent is particularly useful for scenarios where you want to perform an action
        //        from a different context or at a later time, such as from a notification or a widget.
        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_MUTABLE);
//        requestCode is an integer that you can use to differentiate between different
//        PendingIntents that may be created with the same Intent and flags.
//        you can change the Intent's properties, such as its extras, action, or data, after the PendingIntent is created

        Notification.Builder builder = new Notification.Builder(this,CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_launcher_background)
                    .setContentTitle("DEMO")
                    .setContentText(message)
                    .setContentIntent(pendingIntent)
                    .setAutoCancel(true);


        NotificationManager nm1=getSystemService(NotificationManager.class);
        nm1.notify(NOTIFICATION_ID,builder.build());

    }

    private void createNotificationchannel()
    {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            CharSequence channelName ="Message Channle";
            String channelDiscription = "This is a message channel";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;

            NotificationChannel nc=new NotificationChannel(CHANNEL_ID,channelName,importance);
            nc.enableVibration(false);
            nc.setDescription(channelDiscription);

            NotificationManager nm=getSystemService(NotificationManager.class);
            nm.createNotificationChannel(nc);
        }

    }
}