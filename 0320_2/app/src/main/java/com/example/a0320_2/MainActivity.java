package com.example.a0320_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    private TextView textview;
    EditText eText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eText=(EditText) findViewById(R.id.edittext);
        btn=(Button) findViewById(R.id.btn1);
        textview=(TextView) findViewById(R.id.textview);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=eText.getText().toString();
                textview.setText(str);
            }
        });
    }
}