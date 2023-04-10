package com.example.a0401_3;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.RadioButton;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=(LinearLayout)findViewById(R.id.layout);


    }
    public void radiobuttonclick(View view){
        boolean checked = ( (RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.Radiored:
                if(checked)
                    layout.setBackgroundColor(Color.RED);
                break;
            case R.id.Radioblue:
                if(checked)
                    layout.setBackgroundColor(Color.BLUE);
                break;

        }
    }
}