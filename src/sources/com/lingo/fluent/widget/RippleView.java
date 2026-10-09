package com.lingo.fluent.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.motion.c;
import com.yalantis.ucrop.view.CropImageView;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RippleView extends View {
    public static final int $stable = 8;
    private ValueAnimator animator;
    private final float cycleHeight1;
    private final float cycleHeight2;
    private final float cycleHeight3;
    private float cycleWidth1;
    private float cycleWidth2;
    private float cycleWidth3;
    private boolean isStart;
    private int mHeight;
    private int mWidth;
    private float moveSet;
    private Paint paintRipple1;
    private Paint paintRipple2;
    private Paint paintRipple3;
    private Path pathRipple1;
    private Path pathRipple2;
    private Path pathRipple3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.f(context, "context");
        this.cycleHeight1 = 90.0f;
        this.cycleHeight2 = 180.0f;
        this.cycleHeight3 = 60.0f;
        initPaint();
        initAnimator();
    }

    private final void drawRipple(Canvas canvas) {
        initPath();
        Path path = this.pathRipple1;
        m.c(path);
        Paint paint = this.paintRipple1;
        m.c(paint);
        canvas.drawPath(path, paint);
        canvas.save();
        Path path2 = this.pathRipple2;
        m.c(path2);
        Paint paint2 = this.paintRipple2;
        m.c(paint2);
        canvas.drawPath(path2, paint2);
        canvas.save();
        Path path3 = this.pathRipple3;
        m.c(path3);
        Paint paint3 = this.paintRipple3;
        m.c(paint3);
        canvas.drawPath(path3, paint3);
    }

    private final void initAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, getMeasuredWidth());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new c(this, 3));
        this.animator = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAnimator$lambda$1$lambda$0(RippleView rippleView, ValueAnimator valueAnimator) {
        m.f(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        m.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        rippleView.moveSet = ((Float) animatedValue).floatValue();
        rippleView.invalidate();
    }

    private final void initPaint() {
        Paint paint = new Paint();
        this.paintRipple1 = paint;
        paint.setStrokeWidth(2.0f);
        Paint paint2 = this.paintRipple1;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.STROKE);
        }
        Paint paint3 = this.paintRipple1;
        if (paint3 != null) {
            paint3.setColor(-6710610);
        }
        Paint paint4 = this.paintRipple1;
        if (paint4 != null) {
            paint4.setAntiAlias(true);
        }
        Paint paint5 = new Paint();
        this.paintRipple2 = paint5;
        paint5.setStrokeWidth(4.0f);
        Paint paint6 = this.paintRipple2;
        if (paint6 != null) {
            paint6.setStyle(Paint.Style.STROKE);
        }
        Paint paint7 = this.paintRipple2;
        if (paint7 != null) {
            paint7.setColor(-3949645);
        }
        Paint paint8 = this.paintRipple2;
        if (paint8 != null) {
            paint8.setAntiAlias(true);
        }
        Paint paint9 = new Paint();
        this.paintRipple3 = paint9;
        paint9.setStrokeWidth(1.0f);
        Paint paint10 = this.paintRipple3;
        if (paint10 != null) {
            paint10.setStyle(Paint.Style.STROKE);
        }
        Paint paint11 = this.paintRipple3;
        if (paint11 != null) {
            paint11.setColor(-6710610);
        }
        Paint paint12 = this.paintRipple3;
        if (paint12 != null) {
            paint12.setAntiAlias(true);
        }
    }

    private final void initPath() {
        Path path = new Path();
        this.pathRipple1 = path;
        path.moveTo(((-6) * this.cycleWidth1) + this.moveSet, CropImageView.DEFAULT_ASPECT_RATIO);
        Path path2 = this.pathRipple1;
        if (path2 != null) {
            float f5 = this.cycleWidth1;
            float f11 = this.moveSet;
            path2.quadTo(((-5) * f5) + f11, this.cycleHeight1, ((-4) * f5) + f11, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path3 = this.pathRipple1;
        if (path3 != null) {
            float f12 = this.cycleWidth1;
            float f13 = this.moveSet;
            path3.quadTo(((-3) * f12) + f13, -this.cycleHeight1, ((-2) * f12) + f13, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path4 = this.pathRipple1;
        if (path4 != null) {
            float f14 = -this.cycleWidth1;
            float f15 = this.moveSet;
            path4.quadTo(f14 + f15, this.cycleHeight1, f15, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path5 = this.pathRipple1;
        if (path5 != null) {
            float f16 = this.cycleWidth1;
            float f17 = this.moveSet;
            path5.quadTo(f16 + f17, -this.cycleHeight1, (2 * f16) + f17, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path6 = new Path();
        this.pathRipple2 = path6;
        path6.moveTo(((-6) * this.cycleWidth2) + this.moveSet, CropImageView.DEFAULT_ASPECT_RATIO);
        Path path7 = this.pathRipple2;
        if (path7 != null) {
            float f18 = this.cycleWidth2;
            float f19 = this.moveSet;
            path7.quadTo(((-5) * f18) + f19, this.cycleHeight2, ((-4) * f18) + f19, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path8 = this.pathRipple2;
        if (path8 != null) {
            float f21 = this.cycleWidth2;
            float f22 = this.moveSet;
            path8.quadTo(((-3) * f21) + f22, -this.cycleHeight2, ((-2) * f21) + f22, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path9 = this.pathRipple2;
        if (path9 != null) {
            float f23 = -this.cycleWidth2;
            float f24 = this.moveSet;
            path9.quadTo(f23 + f24, this.cycleHeight2, f24, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path10 = this.pathRipple2;
        if (path10 != null) {
            float f25 = this.cycleWidth2;
            float f26 = this.moveSet;
            path10.quadTo(f25 + f26, -this.cycleHeight2, (2 * f25) + f26, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path11 = new Path();
        this.pathRipple3 = path11;
        path11.moveTo(((-6) * this.cycleWidth3) + this.moveSet, CropImageView.DEFAULT_ASPECT_RATIO);
        Path path12 = this.pathRipple3;
        if (path12 != null) {
            float f27 = this.cycleWidth3;
            float f28 = this.moveSet;
            path12.quadTo(((-5) * f27) + f28, -this.cycleHeight3, ((-4) * f27) + f28, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path13 = this.pathRipple3;
        if (path13 != null) {
            float f29 = this.cycleWidth3;
            float f30 = this.moveSet;
            path13.quadTo(((-3) * f29) + f30, this.cycleHeight3, ((-2) * f29) + f30, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path14 = this.pathRipple3;
        if (path14 != null) {
            float f31 = -this.cycleWidth3;
            float f32 = this.moveSet;
            path14.quadTo(f31 + f32, -this.cycleHeight3, f32, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path15 = this.pathRipple3;
        if (path15 != null) {
            float f33 = this.cycleWidth3;
            float f34 = this.moveSet;
            path15.quadTo(f33 + f34, this.cycleHeight3, (2 * f33) + f34, CropImageView.DEFAULT_ASPECT_RATIO);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m.f(canvas, "canvas");
        super.onDraw(canvas);
        canvas.translate(this.mWidth / 2, this.mHeight / 2);
        drawRipple(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.mHeight = i12;
        this.mWidth = i11;
        this.cycleWidth1 = i11 / 4;
        this.cycleWidth2 = i11 / 4;
        this.cycleWidth3 = i11 / 4;
        initAnimator();
    }

    public final void start() {
        if (this.isStart) {
            return;
        }
        this.isStart = true;
        if (this.animator == null) {
            initAnimator();
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public final void stop() {
        if (this.isStart) {
            this.isStart = false;
            this.moveSet = CropImageView.DEFAULT_ASPECT_RATIO;
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.animator = null;
            invalidate();
        }
    }
}
