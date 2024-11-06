package com.example.toastandvisibility;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
     ImageView imageView;
     Button bshow,bgone,button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       imageView=findViewById(R.id.imageview);
       bshow=findViewById(R.id.bshow);
       bgone=findViewById(R.id.bgone);
       button=findViewById(R.id.button);

       bshow.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imageView.setVisibility(View.VISIBLE);
           }
       });


      bgone.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              imageView.setVisibility(View.GONE);
          }
      });
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Toast.makeText(MainActivity.this,"you are welcome",Toast.LENGTH_LONG).show();
          }
      });
    }
}