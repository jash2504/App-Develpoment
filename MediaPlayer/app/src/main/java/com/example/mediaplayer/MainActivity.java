package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.concurrent.TimeUnit;
import android.os.Bundle;

import com.example.mediaplayer.R;

public class MainActivity extends AppCompatActivity {


    private MediaPlayer mediaPlayer;
    private Button playButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        playButton = findViewById(R.id.playButton);


        mediaPlayer = new MediaPlayer();
        mediaPlayer= MediaPlayer.create(MainActivity.this,R.raw.abbu);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()){
                    pauseMusic();
                }
                else{

                    playMusic();
                }
            }
        });
    }

    public void playMusic() {
        if (mediaPlayer != null) {
            mediaPlayer.start();
            playButton.setText(R.string.pause_text);
        }
    }

    public void pauseMusic() {
        if (mediaPlayer != null) {
            mediaPlayer.pause();
            playButton.setText(R.string.play_text);
        }
    }
}