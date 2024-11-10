package com.example.factorialofanynumber;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {

    EditText numberInput;
    Button calculateButton;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = findViewById(R.id.numberInput);
        calculateButton = findViewById(R.id.calculateButton);
        resultText = findViewById(R.id.resultText);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numStr = numberInput.getText().toString();

                if (!numStr.isEmpty()) {
                    int num = Integer.parseInt(numStr);

                    if (num >= 0) {
                        BigInteger factorial = calculateFactorial(num);
                        resultText.setText("Factorial of " + num + " is: " + factorial);
                    } else {
                        resultText.setText("Please enter a non-negative number.");
                    }
                } else {
                    resultText.setText("Please enter a number.");
                }
            }
        });
    }


    private BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
