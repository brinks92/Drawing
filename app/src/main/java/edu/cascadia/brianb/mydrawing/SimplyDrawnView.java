package edu.cascadia.brianb.mydrawing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;

/**
 * Edited by Brian Bansenauer on 10/18/15.
 */
public class SimplyDrawnView extends View {

    private Paint mPaint;
    private Path mPath;
    private float mWidth, mHeight;
    private float thing [] = new float[10];



    public SimplyDrawnView(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
        mPaint = new Paint();
        mPath = new Path();
     }
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;

        thing[0] = 0;
        thing[1] = 120 ;
        thing[2] = mWidth;
        thing[3] = 120;

        thing[4] = 90;
        thing[5] = 0;
        thing[6] = 90;
        thing[7] = mHeight;
    }
// beginning (x , y) end (x,y)


    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.WHITE); //draw background

        //Draw line
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(16.0f);
        canvas.drawLine(mWidth, 0, 200, mHeight, mPaint);

        //TODO: Finish drawing red line
        mPaint.setColor(Color.RED); mPaint.setStrokeWidth(10);
        canvas.drawLine(mWidth, 20,30,mHeight,mPaint);
        //TODO: Draw green lines
            mPaint.setColor(Color.GREEN);
           canvas.drawLines(thing, mPaint);

        //TODO: Draw Text
         mPaint.setColor(Color.RED);
         mPaint.setTextSize(80);
        canvas.drawText("i am the text", 30, 80,mPaint);

        //TODO: Draw Text on a Path
mPath.addArc(50 ,200,600, 600,180,270);

            canvas.drawTextOnPath("I am the Other Text",mPath, 0, 0,mPaint);
        //TODO: Draw filled, opaque, and open ovals

        //TODO: Draw bee bitmap
        //     HINT: since b is a Drawable, you can use its .draw method, but .setBounds on it first
        Drawable b = getResources().getDrawable(R.drawable.bee,null);

        //TODO: Add another image to the project (copy and paste to Android Studio res/drawable folder)
        //     and draw it on the screen

    }
}
