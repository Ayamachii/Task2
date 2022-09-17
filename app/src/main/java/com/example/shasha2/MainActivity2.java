package com.example.shasha2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    AppCompatButton plus_btn;
    AppCompatButton minus_btn;
    TextView cnt;
    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        plus_btn = findViewById(R.id.plus);
        minus_btn = findViewById(R.id.minus);
        cnt = findViewById(R.id.textView);

        plus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                cnt.setText(String.valueOf(count));
            }
        });

        minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                cnt.setText(String.valueOf(count));
            }
        });

    }
}