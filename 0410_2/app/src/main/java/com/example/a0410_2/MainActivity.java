package com.example.a0410_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv1 ,iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv1=(ImageView) findViewById(R.id.imageview);
        iv1.setVisibility(View.INVISIBLE);
        iv2=(ImageView) findViewById(R.id.imageview2);
        iv2.setVisibility(View.INVISIBLE);
    }
    public void oncheckboxclick(View v){
        boolean checked=((CheckBox) v).isChecked();

        switch (v.getId()){
            case R.id.checkbox1:
                //if (checked) iv1.setVisibility(View.VISIBLE);
                if(checked)iv1.setImageResource(R.drawable.meetsandwich);
                else iv1.setImageResource(0);
                //else iv1.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkbox2:
                //if (checked) iv2.setVisibility(View.VISIBLE);
                if(checked)iv2.setImageResource(R.drawable.cheesesandwich);
                else iv2.setImageResource(0);
                //else iv2.setVisibility(View.INVISIBLE);
                break;
        }
    }
}