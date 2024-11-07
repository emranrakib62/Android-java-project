package com.example.embededvideoplayer;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class VedioPlayerActivity extends AppCompatActivity {
WebView web;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.vedio_player);
        web=findViewById(R.id.web);
       web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("https://www.youtube.com/embed/HVU_8YTp6j4");


    }
}