package com.example.clickevent;

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

    Button button;
    TextView textview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textview=findViewById(R.id.textview);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            textview.setText("you are welcome");
            }
        });

textview.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        button.setText("all okay working");
    }
});



    }
}