package com.example.checkleafyearornot;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText yearInput;
    Button checkButton,clear;
    TextView resultText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yearInput = findViewById(R.id.yearInput);
        checkButton = findViewById(R.id.checkButton);
        resultText = findViewById(R.id.resultText);
        clear=findViewById(R.id.clear);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yearInput.setText("");
            }
        });


        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yearStr = yearInput.getText().toString();

                if (!yearStr.isEmpty()) {
                    int year = Integer.parseInt(yearStr);
                    if (isLeapYear(year)) {
                        resultText.setText(year + " is a Leap Year.");
                    } else {
                        resultText.setText(year + " is not a Leap Year.");
                    }
                } else {
                    resultText.setText("Please enter a year.");
                }
            }
        });
    }


    private boolean isLeapYear(int year) {
        // Leap year logic
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
