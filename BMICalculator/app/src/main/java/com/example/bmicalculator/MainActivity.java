
package com.example.bmicalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText kg, feet, inch;
    Button button;
    TextView tv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        kg = findViewById(R.id.kg);
        feet = findViewById(R.id.feet);
        inch = findViewById(R.id.inch);
        button = findViewById(R.id.button);
        tv = findViewById(R.id.tv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sweight = kg.getText().toString();
                String sfeet = feet.getText().toString();
                String sinch = inch.getText().toString();

                if (!sweight.isEmpty() && !sfeet.isEmpty() && !sinch.isEmpty()) {
                    Float weight = Float.parseFloat(sweight);
                    Float ft = Float.parseFloat(sfeet);
                    Float inc = Float.parseFloat(sinch);


                    Float height = (float) (ft * 0.3048 + inc * 0.0254);


                    Float bmiIndex = weight / (height * height);


                    tv.setText("Your BMI Result: " + String.format("%.2f", bmiIndex));
                } else {
                    tv.setText("Please fill all the fields.");
                }
            }
        });
    }
}
