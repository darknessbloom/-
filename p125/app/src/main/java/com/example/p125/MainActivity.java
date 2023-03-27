package com.example.p125;
import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView d1,d2,d3,d4,d5,d6;
    Button b1;
    Random r = new Random();
    int random_n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d1=(ImageView) findViewById(R.id.dice1);
        d2=(ImageView) findViewById(R.id.dice2);
        d3=(ImageView) findViewById(R.id.dice3);
        d4=(ImageView) findViewById(R.id.dice4);
        d5=(ImageView) findViewById(R.id.dice5);
        d6=(ImageView) findViewById(R.id.dice6);
        b1=(Button) findViewById(R.id.roll);


    }
    public void onClick(View v){

        random_n=r.nextInt(5)+1;
        switch (random_n){
            case 1:
                d1.setVisibility(View.VISIBLE);
                d2.setVisibility(View.INVISIBLE);
                d3.setVisibility(View.INVISIBLE);
                d4.setVisibility(View.INVISIBLE);
                d5.setVisibility(View.INVISIBLE);
                d6.setVisibility(View.INVISIBLE);
                break;
            case 2:
                d1.setVisibility(View.INVISIBLE);
                d2.setVisibility(View.VISIBLE);
                d3.setVisibility(View.INVISIBLE);
                d4.setVisibility(View.INVISIBLE);
                d5.setVisibility(View.INVISIBLE);
                d6.setVisibility(View.INVISIBLE);
                break;
            case 3:
                d1.setVisibility(View.INVISIBLE);
                d2.setVisibility(View.INVISIBLE);
                d3.setVisibility(View.VISIBLE);
                d4.setVisibility(View.INVISIBLE);
                d5.setVisibility(View.INVISIBLE);
                d6.setVisibility(View.INVISIBLE);
                break;
            case 4:
                d1.setVisibility(View.INVISIBLE);
                d2.setVisibility(View.INVISIBLE);
                d3.setVisibility(View.INVISIBLE);
                d4.setVisibility(View.VISIBLE);
                d5.setVisibility(View.INVISIBLE);
                d6.setVisibility(View.INVISIBLE);
                break;
            case 5:
                d1.setVisibility(View.INVISIBLE);
                d2.setVisibility(View.INVISIBLE);
                d3.setVisibility(View.INVISIBLE);
                d4.setVisibility(View.INVISIBLE);
                d5.setVisibility(View.VISIBLE);
                d6.setVisibility(View.INVISIBLE);
                break;
            case 6:
                d1.setVisibility(View.INVISIBLE);
                d2.setVisibility(View.INVISIBLE);
                d3.setVisibility(View.INVISIBLE);
                d4.setVisibility(View.INVISIBLE);
                d5.setVisibility(View.INVISIBLE);
                d6.setVisibility(View.VISIBLE);
                break;

        }



    }
}