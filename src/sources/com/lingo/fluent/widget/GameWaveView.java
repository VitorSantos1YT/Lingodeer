package com.lingo.fluent.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class GameWaveView extends View {
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
    private ValueAnimator tallerAnimator;
    private float tallerOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameWaveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.f(context, "context");
        this.cycleHeight1 = j3.Z(15, context);
        this.cycleHeight2 = j3.Z(18, context);
        this.cycleHeight3 = j3.Z(12, context);
        initPaint();
        initAnimator();
    }

    private final void drawRipple(Canvas canvas) {
        initPath();
        Path path = this.pathRipple3;
        m.c(path);
        Paint paint = this.paintRipple3;
        m.c(paint);
        canvas.drawPath(path, paint);
        canvas.save();
        Path path2 = this.pathRipple2;
        m.c(path2);
        Paint paint2 = this.paintRipple2;
        m.c(paint2);
        canvas.drawPath(path2, paint2);
        canvas.save();
        Path path3 = this.pathRipple1;
        m.c(path3);
        Paint paint3 = this.paintRipple1;
        m.c(paint3);
        canvas.drawPath(path3, paint3);
    }

    private final void initAnimator() {
        int i11 = 1;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, getMeasuredWidth());
        this.animator = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setRepeatCount(-1);
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.setDuration(8000L);
        }
        ValueAnimator valueAnimator2 = this.animator;
        if (valueAnimator2 != null) {
            valueAnimator2.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator3 = this.animator;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new a(this, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAnimator$lambda$0(GameWaveView gameWaveView, ValueAnimator valueAnimator) {
        m.f(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        m.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        gameWaveView.moveSet = ((Float) animatedValue).floatValue();
        gameWaveView.invalidate();
    }

    private final void initPaint() {
        Paint paint = new Paint();
        this.paintRipple1 = paint;
        paint.setStrokeWidth(2.0f);
        Paint paint2 = this.paintRipple1;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.FILL);
        }
        Paint paint3 = this.paintRipple1;
        if (paint3 != null) {
            paint3.setAntiAlias(true);
        }
        Context context = getContext();
        m.e(context, "getContext(...)");
        float fZ = j3.Z(140, context) - this.cycleHeight3;
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        LinearGradient linearGradient = new LinearGradient(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (j3.Z(30, context2) + fZ) - this.cycleHeight1, Color.parseColor("#FFCE94"), Color.parseColor("#FF8C5B"), Shader.TileMode.CLAMP);
        Paint paint4 = this.paintRipple1;
        if (paint4 != null) {
            paint4.setShader(linearGradient);
        }
        Paint paint5 = new Paint();
        this.paintRipple2 = paint5;
        paint5.setStrokeWidth(4.0f);
        Paint paint6 = this.paintRipple2;
        if (paint6 != null) {
            paint6.setStyle(Paint.Style.FILL);
        }
        Paint paint7 = this.paintRipple2;
        if (paint7 != null) {
            paint7.setColor(Color.parseColor("#80FFC094"));
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
            paint10.setStyle(Paint.Style.FILL);
        }
        Paint paint11 = this.paintRipple3;
        if (paint11 != null) {
            paint11.setColor(Color.parseColor("#33FFC094"));
        }
        Paint paint12 = this.paintRipple3;
        if (paint12 != null) {
            paint12.setAntiAlias(true);
        }
    }

    private final void initPath() {
        float fZ;
        float fZ2;
        Path path = new Path();
        this.pathRipple1 = path;
        float f5 = ((-12) * this.cycleWidth1) + this.moveSet;
        float f11 = this.cycleHeight3;
        Context context = getContext();
        m.e(context, "getContext(...)");
        path.moveTo(f5, j3.Z(30, context) + f11);
        for (int i11 = -6; i11 < 6; i11++) {
            if (i11 % 2 == 0) {
                float f12 = this.cycleHeight3;
                Context context2 = getContext();
                m.e(context2, "getContext(...)");
                fZ2 = j3.Z(30, context2) + f12 + this.cycleHeight1;
            } else {
                float f13 = this.cycleHeight3;
                Context context3 = getContext();
                m.e(context3, "getContext(...)");
                fZ2 = (j3.Z(30, context3) + f13) - this.cycleHeight1;
            }
            Path path2 = this.pathRipple1;
            if (path2 != null) {
                int i12 = i11 * 2;
                float f14 = this.cycleWidth1;
                float f15 = this.moveSet;
                float f16 = ((i12 + 1) * f14) + f15;
                float f17 = ((i12 + 2) * f14) + f15;
                float f18 = this.cycleHeight3;
                Context context4 = getContext();
                m.e(context4, "getContext(...)");
                path2.quadTo(f16, fZ2, f17, j3.Z(30, context4) + f18);
            }
        }
        Path path3 = this.pathRipple1;
        if (path3 != null) {
            float f19 = (12 * this.cycleWidth1) + this.moveSet;
            float measuredHeight = getMeasuredHeight();
            Context context5 = getContext();
            m.e(context5, "getContext(...)");
            path3.lineTo(f19, j3.Z(30, context5) + measuredHeight);
        }
        Path path4 = this.pathRipple1;
        if (path4 != null) {
            float f21 = ((-12) * this.cycleWidth1) + this.moveSet;
            float measuredHeight2 = getMeasuredHeight();
            Context context6 = getContext();
            m.e(context6, "getContext(...)");
            path4.lineTo(f21, j3.Z(30, context6) + measuredHeight2);
        }
        Path path5 = this.pathRipple1;
        if (path5 != null) {
            float f22 = ((-12) * this.cycleWidth1) + this.moveSet;
            float f23 = this.cycleHeight3;
            Context context7 = getContext();
            m.e(context7, "getContext(...)");
            path5.lineTo(f22, j3.Z(30, context7) + f23);
        }
        Path path6 = this.pathRipple1;
        if (path6 != null) {
            path6.close();
        }
        Path path7 = this.pathRipple1;
        if (path7 != null) {
            path7.setFillType(Path.FillType.WINDING);
        }
        Path path8 = new Path();
        this.pathRipple2 = path8;
        float f24 = ((-12) * this.cycleWidth2) + this.moveSet;
        float f25 = this.cycleHeight3;
        Context context8 = getContext();
        m.e(context8, "getContext(...)");
        path8.moveTo(f24, j3.Z(12, context8) + f25);
        for (int i13 = -6; i13 < 6; i13++) {
            if (i13 % 2 == 0) {
                float f26 = this.cycleHeight3;
                Context context9 = getContext();
                m.e(context9, "getContext(...)");
                fZ = j3.Z(12, context9) + f26 + this.cycleHeight2;
            } else {
                float f27 = this.cycleHeight3;
                Context context10 = getContext();
                m.e(context10, "getContext(...)");
                fZ = (j3.Z(12, context10) + f27) - this.cycleHeight2;
            }
            Path path9 = this.pathRipple2;
            if (path9 != null) {
                int i14 = i13 * 2;
                float f28 = this.cycleWidth2;
                float f29 = this.moveSet;
                float f30 = ((i14 + 1) * f28) + f29;
                float f31 = ((i14 + 2) * f28) + f29;
                float f32 = this.cycleHeight3;
                Context context11 = getContext();
                m.e(context11, "getContext(...)");
                path9.quadTo(f30, fZ, f31, j3.Z(12, context11) + f32);
            }
        }
        Path path10 = this.pathRipple2;
        if (path10 != null) {
            float f33 = (12 * this.cycleWidth2) + this.moveSet;
            float measuredHeight3 = getMeasuredHeight();
            Context context12 = getContext();
            m.e(context12, "getContext(...)");
            path10.lineTo(f33, j3.Z(12, context12) + measuredHeight3);
        }
        Path path11 = this.pathRipple2;
        if (path11 != null) {
            float f34 = ((-12) * this.cycleWidth2) + this.moveSet;
            float measuredHeight4 = getMeasuredHeight();
            Context context13 = getContext();
            m.e(context13, "getContext(...)");
            path11.lineTo(f34, j3.Z(12, context13) + measuredHeight4);
        }
        Path path12 = this.pathRipple2;
        if (path12 != null) {
            float f35 = ((-12) * this.cycleWidth2) + this.moveSet;
            float f36 = this.cycleHeight3;
            Context context14 = getContext();
            m.e(context14, "getContext(...)");
            path12.lineTo(f35, j3.Z(12, context14) + f36);
        }
        Path path13 = this.pathRipple2;
        if (path13 != null) {
            path13.close();
        }
        Path path14 = this.pathRipple2;
        if (path14 != null) {
            path14.setFillType(Path.FillType.WINDING);
        }
        Path path15 = new Path();
        this.pathRipple3 = path15;
        path15.moveTo(((-12) * this.cycleWidth3) + this.moveSet, this.cycleHeight3);
        for (int i15 = -6; i15 < 6; i15++) {
            float f37 = i15 % 2 == 0 ? CropImageView.DEFAULT_ASPECT_RATIO : 2.0f * this.cycleHeight3;
            Path path16 = this.pathRipple3;
            if (path16 != null) {
                int i16 = i15 * 2;
                float f38 = this.cycleWidth3;
                float f39 = this.moveSet;
                path16.quadTo(((i16 + 1) * f38) + f39, f37, ((i16 + 2) * f38) + f39, this.cycleHeight3);
            }
        }
        Path path17 = this.pathRipple3;
        if (path17 != null) {
            path17.lineTo((12 * this.cycleWidth3) + this.moveSet, getMeasuredHeight());
        }
        Path path18 = this.pathRipple3;
        if (path18 != null) {
            path18.lineTo(((-12) * this.cycleWidth3) + this.moveSet, getMeasuredHeight());
        }
        Path path19 = this.pathRipple3;
        if (path19 != null) {
            path19.lineTo(((-12) * this.cycleWidth3) + this.moveSet, this.cycleHeight3);
        }
        Path path20 = this.pathRipple3;
        if (path20 != null) {
            path20.close();
        }
        Path path21 = this.pathRipple3;
        if (path21 != null) {
            path21.setFillType(Path.FillType.WINDING);
        }
    }

    private final void initTallerAnimation() {
        float f5 = this.mHeight;
        Context context = getContext();
        m.e(context, "getContext(...)");
        float fZ = f5 - j3.Z(140, context);
        int i11 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, fZ);
        this.tallerAnimator = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(2000L);
        }
        ValueAnimator valueAnimator = this.tallerAnimator;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator2 = this.tallerAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new a(this, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTallerAnimation$lambda$1(GameWaveView gameWaveView, ValueAnimator valueAnimator) {
        m.f(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        m.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        gameWaveView.tallerOffset = ((Float) animatedValue).floatValue();
        gameWaveView.invalidate();
    }

    public final void beginSmaller() {
        ValueAnimator valueAnimator = this.tallerAnimator;
        if (valueAnimator != null) {
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator2 = this.tallerAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
        this.tallerOffset = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final void beginTaller() {
        ValueAnimator valueAnimator = this.tallerAnimator;
        if (valueAnimator != null) {
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator2 = this.tallerAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
        initTallerAnimation();
        ValueAnimator valueAnimator3 = this.tallerAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m.f(canvas, "canvas");
        super.onDraw(canvas);
        float f5 = this.mHeight;
        Context context = getContext();
        m.e(context, "getContext(...)");
        canvas.translate(CropImageView.DEFAULT_ASPECT_RATIO, (f5 - j3.Z(140, context)) - this.tallerOffset);
        drawRipple(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.mHeight = i12;
        this.mWidth = i11;
        this.cycleWidth1 = i11 / 12;
        this.cycleWidth2 = i11 / 12;
        this.cycleWidth3 = i11 / 12;
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
            ValueAnimator valueAnimator2 = this.tallerAnimator;
            if (valueAnimator2 != null) {
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator3 = this.tallerAnimator;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
            }
        }
    }
}
