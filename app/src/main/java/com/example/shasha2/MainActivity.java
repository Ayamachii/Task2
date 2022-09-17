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

        Market market1 = new Market(getDrawable(R.drawable.img),
                "Red Bell Peppers",
                "1 kg, price",
                4.99f);
        Market market2 = new Market(getDrawable(R.drawable.img_1),
                "Egg Chicken Red",
                "4 pcs, price",
                1.99f);
        Market market3 = new Market(getDrawable(R.drawable.banana),
                "Organic Bananas",
                "12 kg, price",
                3.00f);
        Market market4 = new Market(getDrawable(R.drawable.ginger),
                "Ginger",
                "250gm, price",
                2.99f);
        mainbinding.setMarket1(market1);
        mainbinding.setMarket2(market2);
        mainbinding.setMarket3(market3);
        mainbinding.setMarket4(market4);


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