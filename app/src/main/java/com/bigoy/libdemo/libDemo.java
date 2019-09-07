package com.bigoy.libdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

@SuppressLint("AppCompatCustomView")
public class libDemo extends TextView {
    public libDemo(Context context) {
        super(context);
    }

    public libDemo(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public libDemo(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public libDemo(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Toast.makeText(getContext(), getText(), Toast.LENGTH_SHORT).show();
    }
}
