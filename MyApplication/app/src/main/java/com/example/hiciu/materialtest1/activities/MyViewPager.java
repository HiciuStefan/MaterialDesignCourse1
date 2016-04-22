package com.example.hiciu.materialtest1.activities;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.TextView;

import com.example.hiciu.materialtest1.R;

/**
 * Created by hiciu on 4/22/2016.
 */
public class MyViewPager extends ViewPager {

    private Paint rectColor = new Paint();

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        rectColor.setColor(getResources().getColor(R.color.blue));
    }

    public MyViewPager(Context context) {
        super(context);
        rectColor.setColor(getResources().getColor(R.color.blue));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(new Rect(150, 150, 150, 150), rectColor);
        TextView textView = new TextView(getContext());
        textView.setText("adsfasdfadsfsdaf");
        this.addView(textView);
    }


}
