package com.example.digitaltajbih;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
TextView tvdisplay;
Button badd,bsub,breset;
int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tvdisplay=findViewById(R.id.tvdisplay);
      badd=findViewById(R.id.badd);
      bsub=findViewById(R.id.bsub);
      breset=findViewById(R.id.breset);

      badd.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
        count++;
        tvdisplay.setText(""+count);
          }
      });


        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count--;
                tvdisplay.setText(""+count);
            }
        });


      breset.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              count=00;
              tvdisplay.setText(""+count);
          }
      });


    }
}