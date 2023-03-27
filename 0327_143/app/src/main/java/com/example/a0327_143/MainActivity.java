package com.example.a0327_143;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.v1);
        t2=(TextView) findViewById(R.id.v2);
        t3=(TextView) findViewById(R.id.v3);
    }
    public void onClick(View view){
        t1.setVisibility(View.INVISIBLE);
        t2.setVisibility(View.INVISIBLE);
        t3.setVisibility(View.INVISIBLE);
        switch (view.getId()){
            case R.id.b1:
                t1.setVisibility(View.VISIBLE);
                break;
            case R.id.b2:
                t2.setVisibility(View.VISIBLE);
                break;
            case R.id.b3:
                t3.setVisibility(View.VISIBLE);
                break;
        }
    }
}