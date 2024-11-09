package com.example.userinputinandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button button;
EditText edittext;
TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        edittext=findViewById(R.id.edittext);
        textview=findViewById(R.id.textview);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=edittext.getText().toString();
                textview.setText("Hello "+username+"\nGreat Work");
            }
        });
    }
}