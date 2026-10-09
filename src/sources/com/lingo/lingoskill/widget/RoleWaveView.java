package com.lingo.lingoskill.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.motion.c;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RoleWaveView extends View {
    public static final /* synthetic */ int T = 0;
    public final float H;
    public Path K;
    public Path L;
    public Path M;
    public final Paint N;
    public final Paint O;
    public final Paint P;
    public float Q;
    public ValueAnimator R;
    public boolean S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f22133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f22134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f22136f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f22137t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoleWaveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.f(context, "context");
        this.f22134d = 90.0f;
        this.f22136f = 180.0f;
        this.H = 60.0f;
        Paint paint = new Paint();
        this.N = paint;
        paint.setStrokeWidth(2.0f);
        Paint paint2 = this.N;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.STROKE);
        }
        Paint paint3 = this.N;
        if (paint3 != null) {
            Context context2 = getContext();
            m.e(context2, "getContext(...)");
            paint3.setColor(context2.getColor(R.color.colorAccent));
        }
        Paint paint4 = this.N;
        if (paint4 != null) {
            paint4.setAntiAlias(true);
        }
        Paint paint5 = new Paint();
        this.O = paint5;
        paint5.setStrokeWidth(4.0f);
        Paint paint6 = this.O;
        if (paint6 != null) {
            paint6.setStyle(Paint.Style.STROKE);
        }
        Paint paint7 = this.O;
        if (paint7 != null) {
            Context context3 = getContext();
            m.e(context3, "getContext(...)");
            paint7.setColor(context3.getColor(R.color.colorAccent));
        }
        Paint paint8 = this.O;
        if (paint8 != null) {
            paint8.setAntiAlias(true);
        }
        Paint paint9 = new Paint();
        this.P = paint9;
        paint9.setStrokeWidth(1.0f);
        Paint paint10 = this.P;
        if (paint10 != null) {
            paint10.setStyle(Paint.Style.STROKE);
        }
        Paint paint11 = this.P;
        if (paint11 != null) {
            Context context4 = getContext();
            m.e(context4, "getContext(...)");
            paint11.setColor(context4.getColor(R.color.colorAccent));
        }
        Paint paint12 = this.P;
        if (paint12 != null) {
            paint12.setAntiAlias(true);
        }
        a();
    }

    public final void a() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, getMeasuredWidth());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new c(this, 8));
        this.R = valueAnimatorOfFloat;
    }

    public final void b() {
        if (this.S) {
            return;
        }
        this.S = true;
        if (this.R == null) {
            a();
        }
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public final void c() {
        if (this.S) {
            this.S = false;
            this.Q = CropImageView.DEFAULT_ASPECT_RATIO;
            ValueAnimator valueAnimator = this.R;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.R = null;
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        m.f(canvas, "canvas");
        super.onDraw(canvas);
        canvas.translate(this.f22131a / 2, this.f22132b / 2);
        Path path = new Path();
        this.K = path;
        float f5 = -6;
        path.moveTo((this.f22133c * f5) + this.Q, CropImageView.DEFAULT_ASPECT_RATIO);
        Path path2 = this.K;
        float f11 = this.f22134d;
        if (path2 != null) {
            float f12 = this.f22133c;
            float f13 = this.Q;
            path2.quadTo(((-5) * f12) + f13, f11, ((-4) * f12) + f13, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path3 = this.K;
        if (path3 != null) {
            float f14 = this.f22133c;
            float f15 = this.Q;
            path3.quadTo(((-3) * f14) + f15, -f11, ((-2) * f14) + f15, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path4 = this.K;
        if (path4 != null) {
            float f16 = -this.f22133c;
            float f17 = this.Q;
            path4.quadTo(f16 + f17, f11, f17, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path5 = this.K;
        if (path5 != null) {
            float f18 = this.f22133c;
            float f19 = this.Q;
            path5.quadTo(f18 + f19, -f11, (2 * f18) + f19, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path6 = new Path();
        this.L = path6;
        path6.moveTo((this.f22135e * f5) + this.Q, CropImageView.DEFAULT_ASPECT_RATIO);
        Path path7 = this.L;
        float f21 = this.f22136f;
        if (path7 != null) {
            float f22 = this.f22135e;
            float f23 = this.Q;
            path7.quadTo(((-5) * f22) + f23, f21, ((-4) * f22) + f23, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path8 = this.L;
        if (path8 != null) {
            float f24 = this.f22135e;
            float f25 = this.Q;
            path8.quadTo(((-3) * f24) + f25, -f21, ((-2) * f24) + f25, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path9 = this.L;
        if (path9 != null) {
            float f26 = -this.f22135e;
            float f27 = this.Q;
            path9.quadTo(f26 + f27, f21, f27, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path10 = this.L;
        if (path10 != null) {
            float f28 = this.f22135e;
            float f29 = this.Q;
            path10.quadTo(f28 + f29, -f21, (2 * f28) + f29, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path11 = new Path();
        this.M = path11;
        path11.moveTo((f5 * this.f22137t) + this.Q, CropImageView.DEFAULT_ASPECT_RATIO);
        Path path12 = this.M;
        float f30 = this.H;
        if (path12 != null) {
            float f31 = this.f22137t;
            float f32 = this.Q;
            path12.quadTo(((-5) * f31) + f32, -f30, ((-4) * f31) + f32, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path13 = this.M;
        if (path13 != null) {
            float f33 = this.f22137t;
            float f34 = this.Q;
            path13.quadTo(((-3) * f33) + f34, f30, ((-2) * f33) + f34, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path14 = this.M;
        if (path14 != null) {
            float f35 = -this.f22137t;
            float f36 = this.Q;
            path14.quadTo(f35 + f36, -f30, f36, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path15 = this.M;
        if (path15 != null) {
            float f37 = this.f22137t;
            float f38 = this.Q;
            path15.quadTo(f37 + f38, f30, (2 * f37) + f38, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Path path16 = this.K;
        m.c(path16);
        Paint paint = this.N;
        m.c(paint);
        canvas.drawPath(path16, paint);
        canvas.save();
        Path path17 = this.L;
        m.c(path17);
        Paint paint2 = this.O;
        m.c(paint2);
        canvas.drawPath(path17, paint2);
        canvas.save();
        Path path18 = this.M;
        m.c(path18);
        Paint paint3 = this.P;
        m.c(paint3);
        canvas.drawPath(path18, paint3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f22132b = i12;
        this.f22131a = i11;
        this.f22133c = i11 / 4;
        this.f22135e = i11 / 4;
        this.f22137t = i11 / 4;
        a();
    }
}
