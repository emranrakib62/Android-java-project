package com.example.ictbookpdf;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {
    PDFView pdfView;

    @SuppressLint("UnsafeDynamicallyLoadedCode")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        pdfView = findViewById(R.id.pdfView);


        pdfView.fromAsset("boook.pdf")
                .load();
    }
}
