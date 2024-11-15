package com.example.stackindatastructure;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    private Stack<String> stack;
    private EditText inputElement;
    private TextView stackStatus;
    private ListView stackListView;
    private ArrayAdapter<String> stackAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stack = new Stack<>();


        inputElement = findViewById(R.id.inputElement);
        stackStatus = findViewById(R.id.stackStatus);
        stackListView = findViewById(R.id.stackListView);


        stackAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, stack);
        stackListView.setAdapter(stackAdapter);


        Button buttonPush = findViewById(R.id.buttonPush);
        Button buttonPop = findViewById(R.id.buttonPop);
        Button buttonPeek = findViewById(R.id.buttonPeek);
        Button buttonClear = findViewById(R.id.buttonClear);


        buttonPush.setOnClickListener(v -> {
            String element = inputElement.getText().toString();
            if (!element.isEmpty()) {
                stack.push(element);
                inputElement.setText("");  // Clear input field
                updateStackStatus();
            }
        });


        buttonPop.setOnClickListener(v -> {
            if (!stack.isEmpty()) {
                stack.pop();
                updateStackStatus();
            } else {
                stackStatus.setText("Stack is empty");
            }
        });


        buttonPeek.setOnClickListener(v -> {
            if (!stack.isEmpty()) {
                stackStatus.setText("Top element: " + stack.peek());
            } else {
                stackStatus.setText("Stack is empty");
            }
        });


        buttonClear.setOnClickListener(v -> {
            stack.clear();
            updateStackStatus();
        });
    }


    private void updateStackStatus() {
        stackAdapter.notifyDataSetChanged();
        if (stack.isEmpty()) {
            stackStatus.setText("Stack is empty");
        } else {
            stackStatus.setText("Top element: " + stack.peek());
        }
    }
}
