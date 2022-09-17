package com.example.shasha2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button plus1;
    Button minus1;
    TextView txt1;

    Button plus2;
    Button minus2;
    TextView txt2;

    Button plus3;
    Button minus3;
    TextView txt3;

    Button plus4;
    Button minus4;
    TextView txt4;

    public int counter1 =0;
    public int counter2 =0;
    public int counter3 =0;
    public int counter4 =0;
    public int counter5 =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//first item
        plus1 = findViewById(R.id.plus1);
        minus1 = findViewById(R.id.minus1);
        txt1 = findViewById(R.id.textView1);
        txt1.setText(String.valueOf(counter1));

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter1++;
                txt1.setText(String.valueOf(counter1));
            }
        });
        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter1--;
                txt1.setText(String.valueOf(counter1));
            }
        });
//2nd item
        plus2 = findViewById(R.id.plus2);
        minus2 = findViewById(R.id.minus2);
        txt2 = findViewById(R.id.textView2);
        txt2.setText(String.valueOf(counter2));

        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter2++;
                txt2.setText(String.valueOf(counter2));
            }
        });
        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter2--;
                txt2.setText(String.valueOf(counter2));
            }
        });
//3rd item
        plus3 = findViewById(R.id.plus3);
        minus3 = findViewById(R.id.minus3);
        txt3 = findViewById(R.id.textView3);
        txt3.setText(String.valueOf(counter3));

        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter3++;
                txt3.setText(String.valueOf(counter3));
            }
        });
        minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter3--;
                txt3.setText(String.valueOf(counter3));
            }
        });
//4th item
        plus4 = findViewById(R.id.plus4);
        minus4 = findViewById(R.id.minus4);
        txt4 = findViewById(R.id.textView4);
        txt4.setText(String.valueOf(counter4));

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter4++;
                txt4.setText(String.valueOf(counter4));
            }
        });
        minus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter4--;
                txt4.setText(String.valueOf(counter4));
            }
        });
//DONE


    }
}