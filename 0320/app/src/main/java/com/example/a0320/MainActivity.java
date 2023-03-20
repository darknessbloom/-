package com.example.a0320;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn=(Button) findViewById(R.id.button2);
        //btn.setOnClickListener(new View.OnClickListener() {
        btn.setOnClickListener((e)-> {
                Toast.makeText(getApplicationContext(),"리스너로 만든 버튼이 눌렸습니다",Toast.LENGTH_SHORT).show();

        });
    }
    public void onClick(View view){

        Toast.makeText(getApplicationContext(),"버튼이 눌러졌습니다",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cnsu.ac.kr/main.do"));
        startActivity(intent);
    }

}