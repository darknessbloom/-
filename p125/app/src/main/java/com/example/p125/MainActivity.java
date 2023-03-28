package com.example.p125;
import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView d1,d2,d3,d4,d5,d6;
    ImageView d11,d21,d31,d41,d51,d61;
    EditText r1;
    int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;
    Button b1,b2,b3;
    Random r = new Random();
    int random_n=0;int random_n1=0;
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

        d11=(ImageView) findViewById(R.id.dice11);
        d21=(ImageView) findViewById(R.id.dice21);
        d31=(ImageView) findViewById(R.id.dice31);
        d41=(ImageView) findViewById(R.id.dice41);
        d51=(ImageView) findViewById(R.id.dice51);
        d61=(ImageView) findViewById(R.id.dice61);

        b1=(Button) findViewById(R.id.roll);
        b2=(Button)findViewById(R.id.result);
        b3=(Button)findViewById(R.id.reset);
        r1=(EditText) findViewById(R.id.resultview);


    }
    public void reset(View v){
        n1=0;n2=0;n3=0;n4=0;n5=0;n6=0;
        r1.setText("1번:"+n1+" 2번:"+n2+" 3번:"+n3+" 4번:"+n4+" 5번:"+n5+" 6번:"+n6);


    }
    public void anlayize(View v){
        r1.setText("1번:"+n1+" 2번:"+n2+" 3번:"+n3+" 4번:"+n4+" 5번:"+n5+" 6번:"+n6);
    }
    public void onClick(View v){

        random_n=r.nextInt(5)+1;
        random_n1=r.nextInt(5)+1;
        switch (random_n){
            case 1:
                d1.setVisibility(View.VISIBLE);
                d2.setVisibility(View.INVISIBLE);
                d3.setVisibility(View.INVISIBLE);
                d4.setVisibility(View.INVISIBLE);
                d5.setVisibility(View.INVISIBLE);
                d6.setVisibility(View.INVISIBLE);
                n1+=1;
                break;
            case 2:
                d1.setVisibility(View.INVISIBLE);
                d2.setVisibility(View.VISIBLE);
                d3.setVisibility(View.INVISIBLE);
                d4.setVisibility(View.INVISIBLE);
                d5.setVisibility(View.INVISIBLE);
                d6.setVisibility(View.INVISIBLE);
                n2+=1;
                break;
            case 3:
                d1.setVisibility(View.INVISIBLE);
                d2.setVisibility(View.INVISIBLE);
                d3.setVisibility(View.VISIBLE);
                d4.setVisibility(View.INVISIBLE);
                d5.setVisibility(View.INVISIBLE);
                d6.setVisibility(View.INVISIBLE);
                n3+=1;
                break;
            case 4:
                d1.setVisibility(View.INVISIBLE);
                d2.setVisibility(View.INVISIBLE);
                d3.setVisibility(View.INVISIBLE);
                d4.setVisibility(View.VISIBLE);
                d5.setVisibility(View.INVISIBLE);
                d6.setVisibility(View.INVISIBLE);
                n4+=1;
                break;
            case 5:
                d1.setVisibility(View.INVISIBLE);
                d2.setVisibility(View.INVISIBLE);
                d3.setVisibility(View.INVISIBLE);
                d4.setVisibility(View.INVISIBLE);
                d5.setVisibility(View.VISIBLE);
                d6.setVisibility(View.INVISIBLE);
                n5+=1;
                break;
            case 6:
                d1.setVisibility(View.INVISIBLE);
                d2.setVisibility(View.INVISIBLE);
                d3.setVisibility(View.INVISIBLE);
                d4.setVisibility(View.INVISIBLE);
                d5.setVisibility(View.INVISIBLE);
                d6.setVisibility(View.VISIBLE);
                n6+=1;
                break;

        }
        switch (random_n1){
            case 1:
                d11.setVisibility(View.VISIBLE);
                d21.setVisibility(View.INVISIBLE);
                d31.setVisibility(View.INVISIBLE);
                d41.setVisibility(View.INVISIBLE);
                d51.setVisibility(View.INVISIBLE);
                d61.setVisibility(View.INVISIBLE);
                n1+=1;
                break;
            case 2:
                d11.setVisibility(View.INVISIBLE);
                d21.setVisibility(View.VISIBLE);
                d31.setVisibility(View.INVISIBLE);
                d41.setVisibility(View.INVISIBLE);
                d51.setVisibility(View.INVISIBLE);
                d61.setVisibility(View.INVISIBLE);
                n2+=1;
                break;
            case 3:
                d11.setVisibility(View.INVISIBLE);
                d21.setVisibility(View.INVISIBLE);
                d31.setVisibility(View.VISIBLE);
                d41.setVisibility(View.INVISIBLE);
                d51.setVisibility(View.INVISIBLE);
                d61.setVisibility(View.INVISIBLE);
                n3+=1;
                break;
            case 4:
                d11.setVisibility(View.INVISIBLE);
                d21.setVisibility(View.INVISIBLE);
                d31.setVisibility(View.INVISIBLE);
                d41.setVisibility(View.VISIBLE);
                d51.setVisibility(View.INVISIBLE);
                d61.setVisibility(View.INVISIBLE);
                n4+=1;
                break;
            case 5:
                d11.setVisibility(View.INVISIBLE);
                d21.setVisibility(View.INVISIBLE);
                d31.setVisibility(View.INVISIBLE);
                d41.setVisibility(View.INVISIBLE);
                d51.setVisibility(View.VISIBLE);
                d61.setVisibility(View.INVISIBLE);
                n5+=1;
                break;
            case 6:
                d11.setVisibility(View.INVISIBLE);
                d21.setVisibility(View.INVISIBLE);
                d31.setVisibility(View.INVISIBLE);
                d41.setVisibility(View.INVISIBLE);
                d51.setVisibility(View.INVISIBLE);
                d61.setVisibility(View.VISIBLE);
                n6+=1;
                break;

        }



    }
}