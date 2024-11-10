package com.example.findlcmgcdoftwonumber;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    Button calculateButton;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        calculateButton = findViewById(R.id.calculateButton);
        resultText = findViewById(R.id.resultText);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = number1.getText().toString();
                String num2Str = number2.getText().toString();

                if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
                    int num1 = Integer.parseInt(num1Str);
                    int num2 = Integer.parseInt(num2Str);

                    int gcd = findGCD(num1, num2);
                    int lcm = findLCM(num1, num2, gcd);

                    resultText.setText("GCD: " + gcd + "\nLCM: " + lcm);
                } else {
                    resultText.setText("Please enter both numbers:");
                }
            }
        });
    }


    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }


    private int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
