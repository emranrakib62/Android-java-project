package com.example.audioplayer;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;
    MediaPlayer mediaPlayer = null;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // If mediaPlayer is already playing, reset it
                if (mediaPlayer != null) {
                    mediaPlayer.reset();
                } else {
                    mediaPlayer = new MediaPlayer();
                }

                try {
                    // Set data source from URL
                    mediaPlayer.setDataSource("https://file-examples.com/storage/fec85039006734629a992d7/2017/11/file_example_MP3_1MG.mp3");
                    mediaPlayer.prepare(); // Prepare asynchronously if you want to avoid UI blocking
                    mediaPlayer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) {
                    mediaPlayer.reset();
                } else {
                    mediaPlayer = new MediaPlayer();
                }

                // Play a local raw resource audio file
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.naat);
                if (mediaPlayer != null) {
                    mediaPlayer.start();
                }
            }
        });
    }

}
