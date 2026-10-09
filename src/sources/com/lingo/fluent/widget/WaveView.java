package com.lingo.fluent.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import fr.j3;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class WaveView extends View {
    public static final int $stable = 8;
    private final ArrayList<Circle> mCircleList;
    private final WaveView$mCreateCircle$1 mCreateCircle;
    private long mDuration;
    private float mInitialRadius;
    private Interpolator mInterpolator;
    private boolean mIsRunning;
    private long mLastCreateTime;
    private float mMaxRadius;
    private float mMaxRadiusRate;
    private boolean mMaxRadiusSet;
    private final Paint mPaint;
    private int mSpeed;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class Circle {
        private final long mCreateTime = System.currentTimeMillis();

        public Circle() {
        }

        public final int getAlpha$app_release() {
            float currentRadius$app_release = (getCurrentRadius$app_release() - WaveView.this.mInitialRadius) / (WaveView.this.mMaxRadius - WaveView.this.mInitialRadius);
            float f5 = 255;
            Interpolator interpolator = WaveView.this.mInterpolator;
            m.c(interpolator);
            return (int) (f5 - (interpolator.getInterpolation(currentRadius$app_release) * f5));
        }

        public final float getCurrentRadius$app_release() {
            float fCurrentTimeMillis = ((System.currentTimeMillis() - this.mCreateTime) * 1.0f) / WaveView.this.mDuration;
            float f5 = WaveView.this.mInitialRadius;
            Interpolator interpolator = WaveView.this.mInterpolator;
            m.c(interpolator);
            return ((WaveView.this.mMaxRadius - WaveView.this.mInitialRadius) * interpolator.getInterpolation(fCurrentTimeMillis)) + f5;
        }

        public final long getMCreateTime() {
            return this.mCreateTime;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaveView(Context context) {
        super(context);
        m.f(context, "context");
        this.mDuration = 2000L;
        this.mSpeed = 500;
        this.mMaxRadiusRate = 0.85f;
        this.mCircleList = new ArrayList<>();
        this.mCreateCircle = new WaveView$mCreateCircle$1(this);
        this.mInterpolator = new LinearInterpolator();
        this.mPaint = new Paint(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void newCircle() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.mLastCreateTime < this.mSpeed) {
            return;
        }
        this.mCircleList.add(new Circle());
        invalidate();
        this.mLastCreateTime = jCurrentTimeMillis;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m.f(canvas, "canvas");
        Iterator<Circle> it = this.mCircleList.iterator();
        m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Circle next = it.next();
            m.e(next, "next(...)");
            Circle circle = next;
            float currentRadius$app_release = circle.getCurrentRadius$app_release();
            if (System.currentTimeMillis() - circle.getMCreateTime() < this.mDuration) {
                this.mPaint.setAlpha(circle.getAlpha$app_release());
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, currentRadius$app_release, this.mPaint);
            } else {
                it.remove();
            }
        }
        if (this.mCircleList.size() > 0) {
            postInvalidateDelayed(10L);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        if (this.mMaxRadiusSet) {
            return;
        }
        this.mMaxRadius = (Math.min(i11, i12) * this.mMaxRadiusRate) / 2.0f;
    }

    public final void setColor(int i11) {
        this.mPaint.setColor(i11);
    }

    public final void setDuration(long j11) {
        this.mDuration = j11;
    }

    public final void setInitialRadius(float f5) {
        this.mInitialRadius = f5;
    }

    public final void setInterpolator(Interpolator interpolator) {
        m.f(interpolator, "interpolator");
        this.mInterpolator = interpolator;
    }

    public final void setMaxRadius(float f5) {
        this.mMaxRadius = f5;
        this.mMaxRadiusSet = true;
    }

    public final void setMaxRadiusRate(float f5) {
        this.mMaxRadiusRate = f5;
    }

    public final void setSpeed(int i11) {
        this.mSpeed = i11;
    }

    public final void setStyle(Paint.Style style) {
        m.f(style, "style");
        this.mPaint.setStyle(style);
        Paint paint = this.mPaint;
        Context context = getContext();
        m.e(context, "getContext(...)");
        paint.setStrokeWidth(j3.Z(2, context));
    }

    public final void start() {
        if (this.mIsRunning) {
            return;
        }
        this.mIsRunning = true;
        this.mCreateCircle.run();
    }

    public final void stop() {
        this.mIsRunning = false;
    }

    public final void stopImmediately() {
        this.mIsRunning = false;
        this.mCircleList.clear();
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaveView(Context context, AttributeSet attrs) {
        super(context, attrs);
        m.f(context, "context");
        m.f(attrs, "attrs");
        this.mDuration = 2000L;
        this.mSpeed = 500;
        this.mMaxRadiusRate = 0.85f;
        this.mCircleList = new ArrayList<>();
        this.mCreateCircle = new WaveView$mCreateCircle$1(this);
        this.mInterpolator = new LinearInterpolator();
        this.mPaint = new Paint(1);
    }
}
