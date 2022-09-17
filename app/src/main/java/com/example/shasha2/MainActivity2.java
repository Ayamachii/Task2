package com.example.shasha2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.shasha2.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    ActivityMain2Binding basketbinding;

    TextView cnt;
    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        basketbinding = DataBindingUtil.setContentView(this, R.layout.activity_main2);


        basketbinding.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                basketbinding.textView.setText(String.valueOf(count));
            }
        });

        basketbinding.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;

                basketbinding.textView.setText(String.valueOf(count));
            }
        });

    }
}