package com.example.profitcalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editTextText, editTextText2;
    Button button;
    TextView tv;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the views
        editTextText = findViewById(R.id.editTextText);
        editTextText2 = findViewById(R.id.editTextText2);
        button = findViewById(R.id.button);
        tv = findViewById(R.id.tv);

        // Set up button click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Error handling to prevent crashes
                if (editTextText.getText().toString().isEmpty() || editTextText2.getText().toString().isEmpty()) {
                    tv.setText("Please enter both values.");
                    return;
                }

                try {
                    // Convert the input values to Float
                    Float buyPrice = Float.parseFloat(editTextText.getText().toString());
                    Float sellPrice = Float.parseFloat(editTextText2.getText().toString());

                    // Calculate the profit
                    Float profit = sellPrice - buyPrice;

                    // Display the result
                    tv.setText("Profit is: " + profit);
                } catch (NumberFormatException e) {
                    // Handle invalid input (non-numeric values)
                    tv.setText("Please enter valid numbers.");
                }
            }
        });
    }
}
