package com.example.effects;



import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;

//1. Extend View
//2. Crate private Piant ,  LinearGardient , RadialGardient object
//3. Create constructor of Drawing class and call init() method
//4. Initialise Object there
//5. Override OnDraw() method


public class Drawing extends View  {

//    private Bitmap bm;
    private Paint brush;
//    private Paint redbrush;
    private LinearGradient lg;
//    private RadialGradient rg;


    public Drawing(Context context) {
        super(context);
        init();
    }

    public void init() {
//        bm= BitmapFactory.decodeResource(getResources(),R.drawable.baseline_10k_24);


        brush=new Paint(Paint.ANTI_ALIAS_FLAG);
        brush.setColor(Color.BLUE);
//        brush.setStrokeWidth(50f);

        lg=new LinearGradient(0,0,10,10,Color.BLUE,Color.GREEN,Shader.TileMode.MIRROR);
//        rg=new RadialGradient(0,0,20, Color.RED,Color.BLACK, Shader.TileMode.REPEAT);


//        redbrush=new Paint(Paint.ANTI_ALIAS_FLAG);
//        redbrush.setColor(Color.RED);
//        redbrush.setStrokeWidth(53f);

        brush.setShader(lg);



    }



    @Override
    public void onDraw(Canvas canvas) {





//        canvas.drawBitmap(bm,(getMeasuredWidth()/2)-(bm.getWidth()/2)  , (getMeasuredHeight()/2)-(bm.getHeight() / 2),null);


//        canvas.drawCircle(getMeasuredWidth()/2,getMeasuredHeight()/2,300f,brush);
//        canvas.drawRect(100f,100f,100f,100f,brush);


        canvas.save();

        super.onDraw(canvas);


    }
}
