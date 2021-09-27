package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView counterResultTV;
    Button counterBtn;
    Button resetBtn;
    Button deCounterBtn;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterResultTV = (TextView)findViewById(R.id.counterResultTV);
        resetBtn = (Button)findViewById(R.id.resetBtn);
        counterBtn = (Button)findViewById(R.id.counterBtn);
        deCounterBtn = (Button)findViewById(R.id.deCounterBtn);

        counterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                counterResultTV.setText(Integer.toString(count));
            }
        });

        deCounterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count<=0){
                    Toast.makeText(MainActivity.this, "The Count cannot be reduced", Toast.LENGTH_SHORT).show();
                } else {
                    count--;
                    counterResultTV.setText(Integer.toString(count));
                }
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                counterResultTV.setText(Integer.toString(count));
            }
        });
    }
}