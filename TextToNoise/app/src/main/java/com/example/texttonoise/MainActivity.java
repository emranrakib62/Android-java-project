package com.example.texttonoise;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText editText;
Button button;
TextToSpeech textToSpeech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edittext);
        button=findViewById(R.id.button);
textToSpeech=new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
    @Override
    public void onInit(int status) {

    }
});
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



if(editText.getText().toString().length()>0){
    textToSpeech.speak(""+ editText.getText().toString(),textToSpeech.QUEUE_FLUSH,null,null);
}else {
    editText.setError("please Enter the Speech!!");
}

            }
        });
    }
}