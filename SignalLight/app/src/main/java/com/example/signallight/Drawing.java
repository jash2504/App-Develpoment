package com.example.signallight;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Drawing extends View {


    Paint redbrush,greenbrush,yellowbrush,blackbrush;
    public Drawing(Context context) {
        super(context);
        init();
    }

    private void init() {

        redbrush=new Paint(Paint.ANTI_ALIAS_FLAG);
        greenbrush=new Paint(Paint.ANTI_ALIAS_FLAG);
        yellowbrush=new Paint(Paint.ANTI_ALIAS_FLAG);
        blackbrush=new Paint(Paint.ANTI_ALIAS_FLAG);
        redbrush.setColor(Color.parseColor("Red"));
        greenbrush.setColor(Color.parseColor("Green"));
        yellowbrush.setColor(Color.parseColor("Yellow"));
        blackbrush.setColor(Color.parseColor("Black"));
        blackbrush.setStrokeWidth(500);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawLine(getMeasuredWidth()/2,200,getMeasuredWidth()/2,1500,blackbrush);
        canvas.drawCircle(getMeasuredWidth()/2,500,150f,greenbrush);

        canvas.drawCircle(getMeasuredWidth()/2,850,150f,yellowbrush);
        canvas.drawCircle(getMeasuredWidth()/2,1200,150f,redbrush);



        canvas.save();
        super.onDraw(canvas);
    }
}
