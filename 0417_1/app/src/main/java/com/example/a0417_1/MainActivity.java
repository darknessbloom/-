package com.example.a0417_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.DriverManager;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private TimePicker tp1;
    private Button b1;
    private TextView time;
    private Calendar calendar1;
    private String format="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tp1=(TimePicker) findViewById(R.id.tp1);
        b1=(Button) findViewById(R.id.set_b1);
        time=(TextView)findViewById(R.id.t3);
        calendar1= Calendar.getInstance();
        int hour=calendar1.get(Calendar.HOUR_OF_DAY);
        int min=calendar1.get(Calendar.MINUTE);
        showTime(hour,min);

    }
    public void displayTime(View v){
        int hour=tp1.getHour();
        int min=tp1.getMinute();
        showTime(hour,min);
    }
    public void showTime(int hour, int min){
        if(hour==0){
            hour+=12;
            format="AM";

        }else if(hour==12){
            format="PM";
        }else if(hour>12){
            hour-=12;
            format="PM";

        }else{
            format="AM";
        }
        time.setText(new StringBuilder().append(hour).append(":").append(min).append(" ").append(format));


    }
}