package com.example.photogalaryapp;



import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class FullscreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        ImageView imageView = findViewById(R.id.fullImageView);

        int imageResId = getIntent().getIntExtra("imageResId", -1);
        if (imageResId != -1) {
            imageView.setImageResource(imageResId);
        }
    }
}
