package com.example.p124;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button plus,minus,reset;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus=(Button) findViewById(R.id.plus);
        minus=(Button) findViewById(R.id.minus);
        reset=(Button) findViewById(R.id.reset);
        e1=(EditText) findViewById(R.id.text);
    }
    public void onClick(View v){
        int r1=Integer.parseInt(e1.getText().toString());
        switch (v.getId()){
            case R.id.plus:
                r1=r1+1;
                e1.setText(""+r1);
                break;
            case R.id.minus:
                r1=r1-1;
                e1.setText(""+r1);
                break;
            case R.id.reset:
                e1.setText("0");
                break;

        }
    }
}