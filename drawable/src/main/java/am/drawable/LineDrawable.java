/*
 * Copyright (C) 2015 AlexMofer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package am.drawable;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

import am.widget.R;

/**
 * 横线Drawable
 * 支持上下左右
 * Created by Alex on 2015/9/26.
 */
@SuppressWarnings({"NullableProblems", "unused", "WeakerAccess"})
public class LineDrawable extends Drawable {

    private final Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final RectF mLine = new RectF();
    private int mAlpha = 0xFF;
    private ColorStateList mBackgroundColor;
    private ColorStateList mLineColor;
    private float mLineSize;
    private int mGravity;

    public LineDrawable() {
        this(Color.BLACK, 1);
    }

    public LineDrawable(int lineColor, float lineSize) {
        this(0x00000000, lineColor, lineSize);
    }

    public LineDrawable(int backgroundColor, int lineColor, float lineSize) {
        this(backgroundColor, lineColor, lineSize, Gravity.NO_GRAVITY);
    }

    public LineDrawable(int backgroundColor, int lineColor, float lineSize, int gravity) {
        this(ColorStateList.valueOf(backgroundColor), ColorStateList.valueOf(lineColor),
                lineSize, gravity);
    }

    public LineDrawable(ColorStateList backgroundColor, ColorStateList lineColor, float lineSize,
                        int gravity) {
        mBackgroundColor = backgroundColor;
        mLineColor = lineColor;
        mLineSize = lineSize;
        mGravity = gravity;
    }

    @Override
    public void inflate(Resources resources, XmlPullParser parser, AttributeSet attrs,
                        Resources.Theme theme)
            throws XmlPullParserException, IOException {
        super.inflate(resources, parser, attrs, theme);
        final TypedArray custom = DrawableHelper.obtainAttributes(resources, theme, attrs,
                R.styleable.LineDrawable);
        final ColorStateList backgroundColor =
                custom.getColorStateList(R.styleable.LineDrawable_android_background);
        final ColorStateList lineColor =
                custom.getColorStateList(R.styleable.LineDrawable_android_color);
        mLineSize = custom.getDimension(R.styleable.LineDrawable_android_width, 0);
        mGravity = custom.getInt(R.styleable.LineDrawable_android_gravity, Gravity.NO_GRAVITY);
        custom.recycle();
        if (backgroundColor != null)
            mBackgroundColor = backgroundColor;
        if (lineColor != null)
            mLineColor = lineColor;
    }

    @Override
    protected void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        updateLocation(bounds);
    }

    @SuppressLint("RtlHardcoded")
    private void updateLocation(Rect bounds) {
        mLine.setEmpty();
        if (bounds == null)
            return;
        if (mLineSize <= 0)
            return;
        final float half = mLineSize * 0.5f;
        switch (mGravity) {
            default:
            case Gravity.TOP:
                mLine.set(bounds.left, bounds.top, bounds.right, bounds.top + mLineSize);
                break;
            case Gravity.BOTTOM:
                mLine.set(bounds.left, bounds.bottom - mLineSize, bounds.right, bounds.bottom);
                break;
            case Gravity.LEFT:
                mLine.set(bounds.left, bounds.top, bounds.left + mLineSize, bounds.bottom);
                break;
            case Gravity.RIGHT:
                mLine.set(bounds.right - mLineSize, bounds.top, bounds.right, bounds.bottom);
                break;
            case Gravity.CENTER_HORIZONTAL:
                final float y = bounds.exactCenterY();
                mLine.set(bounds.left, y - half, bounds.right, y + half);
                break;
            case Gravity.CENTER_VERTICAL:
                final float x = bounds.exactCenterX();
                mLine.set(x - half, bounds.top, x + half, bounds.bottom);
                break;
        }
    }

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    public boolean onLayoutDirectionChanged(int layoutDirection) {
        super.onLayoutDirectionChanged(layoutDirection);
        updateLocation(getBounds());
        return true;
    }

    @Override
    public void draw(@SuppressWarnings("NullableProblems") Canvas canvas) {
        if (!isVisible())
            return;
        final Rect bounds = getBounds();
        if (bounds.isEmpty())
            return;
        final int[] state = getState();
        if (mBackgroundColor != null) {
            final int backgroundColor = DrawableHelper.getColor(mBackgroundColor, state, mAlpha);
            mPaint.setColor(backgroundColor);
            canvas.drawRect(bounds, mPaint);
        }
        if (mLineColor != null) {
            final int lineColor = DrawableHelper.getColor(mLineColor, state, mAlpha);
            mPaint.setColor(lineColor);
            canvas.drawRect(mLine, mPaint);
        }
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }

    @Override
    public void setAlpha(int alpha) {
        if (mAlpha == alpha)
            return;
        mAlpha = alpha;
        invalidateSelf();
    }

    @Override
    public int getAlpha() {
        return mAlpha;
    }

    @Override
    public void setColorFilter(ColorFilter cf) {
        mPaint.setColorFilter(cf);
        invalidateSelf();
    }

    @Override
    public boolean isStateful() {
        return (mBackgroundColor != null && mBackgroundColor.isStateful()) ||
                (mLineColor != null && mLineColor.isStateful());
    }

    @Override
    protected boolean onStateChange(int[] state) {
        return isStateful();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void getOutline(Outline outline) {
        final int[] state = getState();
        final int backgroundColor = DrawableHelper.getColor(mBackgroundColor, state, mAlpha);
        final int backgroundAlpha = Color.alpha(backgroundColor);
        if (backgroundAlpha != 0) {
            outline.setRect(getBounds());
            outline.setAlpha(backgroundAlpha / 255f);
            return;
        }
        final int lineColor = DrawableHelper.getColor(mLineColor, state, mAlpha);
        final int lineAlpha = Color.alpha(lineColor);
        outline.setRect(Math.round(mLine.left - 0.5f), Math.round(mLine.top - 0.5f),
                Math.round(mLine.right + 0.5f), Math.round(mLine.bottom + 0.5f));
        outline.setAlpha(lineAlpha / 255f);
    }

    /**
     * 获取背景色
     *
     * @return 背景色
     */
    public ColorStateList getBackgroundColor() {
        return mBackgroundColor;
    }

    /**
     * 设置背景色
     *
     * @param background 背景色
     */
    public void setBackgroundColor(ColorStateList background) {
        if (mBackgroundColor == background)
            return;
        mBackgroundColor = background;
        invalidateSelf();
    }

    /**
     * 获取线条色
     *
     * @return 线条色
     */
    public ColorStateList getLineColor() {
        return mLineColor;
    }

    /**
     * 设置线条色
     *
     * @param line 线条色
     */
    public void setLineColor(ColorStateList line) {
        if (mLineColor == line)
            return;
        mLineColor = line;
        invalidateSelf();
    }

    /**
     * 获取线宽
     *
     * @return 线宽
     */
    public float getLineSize() {
        return mLineSize;
    }

    /**
     * 设置线宽
     *
     * @param size 线宽
     */
    public void setLineSize(float size) {
        if (mLineSize == size)
            return;
        mLineSize = size;
        updateLocation(getBounds());
        invalidateSelf();
    }

    /**
     * 获取位置
     *
     * @return 位置
     */
    public int getGravity() {
        return mGravity;
    }

    /**
     * 设置位置
     *
     * @param gravity 位置
     */
    public void setGravity(int gravity) {
        if (mGravity == gravity)
            return;
        mGravity = gravity;
        invalidateSelf();
    }
}