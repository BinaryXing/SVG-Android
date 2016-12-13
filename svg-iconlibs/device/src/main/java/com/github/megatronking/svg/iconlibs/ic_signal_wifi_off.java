package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_signal_wifi_off extends SVGRenderer {

    public ic_signal_wifi_off(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(23.64f, 7.0f);
        mPath.rCubicTo(-0.45f, -0.34f, -4.93f, -4.0f, -11.64f, -4.0f);
        mPath.rCubicTo(-1.5f, 0.0f, -2.89f, 0.19f, -4.15f, 0.48f);
        mPath.lineTo(18.18f, 13.8f);
        mPath.lineTo(23.64f, 7.0f);
        mPath.close();
        mPath.moveTo(23.64f, 7.0f);
        mPath.rMoveTo(-6.6f, 8.22f);
        mPath.lineTo(3.27f, 1.44f);
        mPath.lineTo(2.0f, 2.72f);
        mPath.rLineTo(2.05f, 2.06f);
        mPath.cubicTo(1.91f, 5.76f, 0.59f, 6.82f, 0.36f, 7.0f);
        mPath.rLineTo(11.63f, 14.49f);
        mPath.rLineTo(0.01f, 0.01f);
        mPath.rLineTo(0.01f, -0.01f);
        mPath.rLineTo(3.9f, -4.86f);
        mPath.rLineTo(3.32f, 3.32f);
        mPath.rLineTo(1.27f, -1.27f);
        mPath.rLineTo(-3.46f, -3.46f);
        mPath.close();
        mPath.moveTo(17.039999f, 15.22f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}