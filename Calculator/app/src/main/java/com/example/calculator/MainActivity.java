package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button plus,minus,multiply,divide;
    EditText result;
    EditText n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus=(Button) findViewById(R.id.plus);
        minus=(Button) findViewById(R.id.minus);
        multiply=(Button) findViewById(R.id.multiply);
        divide=(Button) findViewById(R.id.divide);
        n1=(EditText) findViewById(R.id.n1);
        n2=(EditText) findViewById(R.id.n2);
        result=(EditText) findViewById(R.id.result);
        plus.setOnClickListener(e ->{
            float number1=Float.parseFloat(n1.getText().toString());
            float number2=Float.parseFloat(n2.getText().toString());
            float re=number1+number2;
            result.setText(""+re);

        });
        minus.setOnClickListener(e ->{
            float number1=Float.parseFloat(n1.getText().toString());
            float number2=Float.parseFloat(n2.getText().toString());
            float re=number1-number2;
            result.setText(""+re);

        });
        multiply.setOnClickListener(e ->{
            float number1=Float.parseFloat(n1.getText().toString());
            float number2=Float.parseFloat(n2.getText().toString());
            float re=number1*number2;
            result.setText(""+re);

        });
        divide.setOnClickListener(e ->{
            float number1=Float.parseFloat(n1.getText().toString());
            float number2=Float.parseFloat(n2.getText().toString());
            float re= number1/number2;

            result.setText(""+re);

        });

    }
}