package com.example.nestedforloop;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);

        // Using StringBuilder for efficient string concatenation
        StringBuilder sb = new StringBuilder();

        // Nested for loop to create the star pattern
        for (int i = 1; i <=200; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("i Love You");
            }
            sb.append("\n");
        }

        // Set the final text to the TextView
        tv.setText(sb.toString());
    }
}
