package com.example.a0313_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        Toast.makeText(getApplicationContext(),"세단을 선택하셨습니다",Toast.LENGTH_SHORT).show();
    }
    public void onClick1(View view){
        Toast.makeText(getApplicationContext(),"suv을 선택하셨습니다",Toast.LENGTH_SHORT).show();
    }
}