package com.example.fullyfunctionalembededvedioplayer;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout laySong1, laySong2, laySong3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        laySong1 = findViewById(R.id.laySong1);
        laySong2 = findViewById(R.id.laySong2);
        laySong3 = findViewById(R.id.laySong3);

        // Click listener for Song 1
        laySong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/BYFl_DD8I6g";
                Intent intent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(intent);
            }
        });

        // Click listener for Song 2
        laySong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/8bTaJ3PMGR4";
                Intent intent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(intent);
            }
        });

        // Click listener for Song 3
        laySong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/wgRJCQNxZ_M";
                Intent intent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(intent);
            }
        });
    }
}
