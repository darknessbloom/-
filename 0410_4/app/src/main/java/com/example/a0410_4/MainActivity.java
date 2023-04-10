package com.example.a0410_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1= (ImageView) findViewById(R.id.imageView);
    }
    public void onToggleClicked (View v){
        boolean on = ((ToggleButton) v).isChecked();
        if(on){
            i1.setImageResource(R.drawable.meetsandwich);
        }
        else
            i1.setImageResource(0);


    }
}