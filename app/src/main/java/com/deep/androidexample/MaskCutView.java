package com.deep.androidexample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.DimenRes;
import android.util.AttributeSet;
import android.view.View;

public class MaskCutView extends View {

    /**
     * 抠图部分圆角矩形的圆角半径
     */
    private float radius = 50;
    /**
     * 抠图部分圆角矩形的高度
     */
    private float height = 400;
    /**
     * 抠图部分圆角矩形距离整个图上边的padding距离
     */
    private float paddingTop = 0;
    /**
     * 抠图部分圆角矩形距离整个图左边的padding距离
     */
    private float paddingLeft = 0;
    /**
     * 抠图部分圆角矩形距离整个图右边的padding距离
     */
    private float paddingRight = 0;

    public MaskCutView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.parseColor("#b3000000"));
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);

        RectF rect = new RectF(0, 0, getWidth(), getHeight());
        path.addRect(rect, Path.Direction.CCW);
        RectF roundRect = new RectF(paddingLeft, paddingTop, getWidth() - paddingRight, paddingTop + height);
        path.addRoundRect(roundRect, radius, radius, Path.Direction.CCW);
        canvas.drawPath(path, paint);
    }

    /**
     * 设置抠图部分圆角矩形的圆角半径
     * @param id
     */
    public void setRadius(@DimenRes int id) {
        this.radius = getResources().getDimensionPixelSize(id);
    }

    /**
     * 设置抠图部分圆角矩形的高度
     * @param id
     */
    public void setHeight(@DimenRes int id) {
        this.height = getResources().getDimensionPixelSize(id);
    }

    /**
     * 设置抠图部分圆角矩形距离整个图上边的padding距离
     * @param id
     */
    public void setPaddingTop(@DimenRes int id) {
        this.paddingTop = getResources().getDimensionPixelSize(id);
    }

    /**
     * 设置抠图部分圆角矩形距离整个图左边的padding距离
     * @param id
     */
    public void setPaddingLeft(@DimenRes int id) {
        this.paddingLeft = getResources().getDimensionPixelSize(id);
    }

    /**
     * 设置抠图部分圆角矩形距离整个图右边的padding距离
     * @param id
     */
    public void setPaddingRight(@DimenRes int id) {
        this.paddingRight = getResources().getDimensionPixelSize(id);
    }

    /**
     * 设置抠图部分圆角矩形距离整个图上边的padding距离
     * @param px
     */
    public void setPaddingTopPixel(float px) {
        this.paddingTop = px;
    }

    /**
     * 设置抠图部分圆角矩形距离整个图左边的padding距离
     * @param px
     */
    public void setPaddingLeftPixel(float px) {
        this.paddingLeft = px;
    }

    /**
     * 设置抠图部分圆角矩形距离整个图右边的padding距离
     * @param px
     */
    public void setPaddingRightPixel(float px) {
        this.paddingRight = px;
    }
}
