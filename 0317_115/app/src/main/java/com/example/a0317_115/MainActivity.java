package com.example.a0317_115;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton iButton;
    ImageView iView;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iButton=(ImageButton) findViewById(R.id.imageButton2);
        iView=(ImageView) findViewById(R.id.imageview);
        t1= (TextView)findViewById(R.id.text);

        iButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("자동차보이기");
                iView.setImageResource(R.drawable.car1);

            }
        });


    }
    
}