package com.example.shasha2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.shasha2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainbinding;

    public int counter1 =0;
    public int counter2 =0;
    public int counter3 =0;
    public int counter4 =0;
    public int counter5 =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainbinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Market market = new Market(getDrawable(R.drawable.img),
                "Red Bell Peppers",
                "1 kg, price",
                4.99f);
        mainbinding.setMarket(market);

//first item
        mainbinding.textView1.setText(String.valueOf(counter1));

        mainbinding.plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter1++;
                mainbinding.textView1.setText(String.valueOf(counter1));
            }
        });
        mainbinding.minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter1--;
                mainbinding.textView1.setText(String.valueOf(counter1));
            }
        });
//2nd item
        mainbinding.textView2.setText(String.valueOf(counter2));

        mainbinding.plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter2++;
                mainbinding.textView2.setText(String.valueOf(counter2));
            }
        });
        mainbinding.minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter2--;
                mainbinding.textView2.setText(String.valueOf(counter2));
            }
        });
//3rd item
        mainbinding.textView3.setText(String.valueOf(counter3));

        mainbinding.plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter3++;
                mainbinding.textView3.setText(String.valueOf(counter3));
            }
        });
        mainbinding.minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter3--;
                mainbinding.textView3.setText(String.valueOf(counter3));
            }
        });
//4th item
        mainbinding.textView4.setText(String.valueOf(counter4));

        mainbinding.plus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter4++;
                mainbinding.textView4.setText(String.valueOf(counter4));
            }
        });
        mainbinding.minus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter4--;
                mainbinding.textView4.setText(String.valueOf(counter4));
            }
        });
//DONE


    }
}