package com.example.layoutinflater;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button buttonadd,buttonr;
LinearLayout main,layout;
LayoutInflater layoutInflater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
     buttonadd=findViewById(R.id.buttonadd);
     buttonr=findViewById(R.id.buttonr);
     main=findViewById(R.id.main);
     layout=findViewById(R.id.layout);
layoutInflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

buttonadd.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
layoutInflater.inflate(R.layout.new_layout,layout);
    }
});

buttonr.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        layout.removeAllViews();
    }
});

    }
}