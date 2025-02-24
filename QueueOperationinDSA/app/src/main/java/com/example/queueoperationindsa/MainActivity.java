package com.example.queueoperationindsa;



import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.LinkedList;
import java.util.Queue;

public class MainActivity extends AppCompatActivity {

    private Queue<Integer> queue = new LinkedList<>();
    private EditText inputNumber;
    private TextView queueDisplay;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNumber = findViewById(R.id.inputNumber);
        queueDisplay = findViewById(R.id.queueDisplay);
        Button enqueueBtn = findViewById(R.id.enqueueBtn);
        Button dequeueBtn = findViewById(R.id.dequeueBtn);
        Button clearBtn = findViewById(R.id.clearBtn);

        enqueueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enqueue();
            }
        });

        dequeueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dequeue();
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearQueue();
            }
        });
    }

    private void enqueue() {
        String numStr = inputNumber.getText().toString().trim();
        if (!numStr.isEmpty()) {
            int num = Integer.parseInt(numStr);
            queue.add(num);
            inputNumber.setText("");
            updateQueueDisplay();
        } else {
            Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();
        }
    }

    private void dequeue() {
        if (!queue.isEmpty()) {
            queue.poll();
            updateQueueDisplay();
        } else {
            Toast.makeText(this, "Queue is empty", Toast.LENGTH_SHORT).show();
        }
    }

    private void clearQueue() {
        queue.clear();
        updateQueueDisplay();
    }

    private void updateQueueDisplay() {
        queueDisplay.setText(queue.toString());
    }
}
