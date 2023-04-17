package com.example.a0417_5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class CoustomView extends View {

    public CoustomView (Context context){
        super(context);
        setBackgroundColor(Color.BLUE);
    }
    @Override
    protected void onDraw(Canvas canvas){
        Paint paint =new Paint();
        paint.setColor(Color.YELLOW);
//            paint.setStrokeWidth(20);
//            canvas.drawLine(100,100,700,100,paint);
//            canvas.drawRect(100,300,700,700,paint);
//            canvas.drawCircle(300,1200,200,paint);
//            paint.setTextSize(80);
//            canvas.drawText("this is a text",100,900,paint);
        canvas.drawColor(Color.BLUE);
        canvas.drawRoundRect(new RectF(30,50,330,550),15,15,paint);
        canvas.drawOval(new RectF(450,50,750,550),paint);
        paint.setColor(Color.RED);
        canvas.drawArc(new RectF(30,600,330,1100),360,1000,true,paint);
        paint.setColor(Color.YELLOW);
        float[] pts={30,1250,300,1350,300,1350,60,1450,60,1450,360,1500};
        paint.setStrokeWidth(10);
        canvas.drawLines(pts,paint);

        canvas.drawArc(new RectF(600,1250,900,1550),45,320,true,paint);


    }
}

