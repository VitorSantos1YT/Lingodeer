package com.lingo.lingoskill.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;
import vh.c;
import vq.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SummaryProgressBar extends View {
    public final Paint H;
    public final Paint K;
    public float L;
    public final o M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f22156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f22158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f22159f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f22160t;

    public SummaryProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22154a = 12.0f;
        this.f22155b = 100L;
        this.f22156c = 100L;
        this.f22157d = -90;
        this.f22158e = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c.f54061b, 0, 0);
        try {
            this.f22154a = typedArrayObtainStyledAttributes.getDimension(3, this.f22154a);
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint(1);
            this.f22159f = paint;
            paint.setColor(Color.parseColor("#E8EAEA"));
            Paint paint2 = this.f22159f;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            this.f22159f.setStrokeWidth(this.f22154a);
            Paint paint3 = new Paint(1);
            this.f22160t = paint3;
            paint3.setColor(Color.parseColor("#95ca52"));
            this.f22160t.setStyle(style);
            this.f22160t.setStrokeWidth(this.f22154a);
            Paint paint4 = new Paint(1);
            this.H = paint4;
            paint4.setColor(Color.parseColor("#f9ce08"));
            this.H.setStyle(style);
            this.H.setStrokeWidth(this.f22154a);
            Paint paint5 = new Paint(1);
            this.K = paint5;
            paint5.setColor(Color.parseColor("#f29c70"));
            this.K.setStyle(style);
            this.K.setStrokeWidth(this.f22154a);
            o oVar = new o(this);
            this.M = oVar;
            oVar.setDuration(2000L);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public o getAnim() {
        return this.M;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(this.f22158e, this.f22159f);
        long j11 = this.f22155b * 360;
        long j12 = this.f22156c;
        float f5 = j11 / j12;
        float f11 = 0 / j12;
        float f12 = this.L;
        float f13 = f5 * f12;
        int i11 = this.f22157d;
        if (f13 <= f11) {
            canvas.drawArc(this.f22158e, i11, f11 * f12, false, this.f22160t);
            return;
        }
        if (f13 <= f11 + f11) {
            float f14 = i11;
            canvas.drawArc(this.f22158e, f14, f11 * f12, false, this.f22160t);
            canvas.drawArc(this.f22158e, f14 + f11, f11 * this.L, false, this.H);
            return;
        }
        float f15 = i11;
        canvas.drawArc(this.f22158e, f15, f11 * f12, false, this.f22160t);
        float f16 = f15 + f11;
        canvas.drawArc(this.f22158e, f16, f11 * this.L, false, this.H);
        canvas.drawArc(this.f22158e, f16 + f11, f11 * this.L, false, this.K);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int iMin = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i11), View.getDefaultSize(getSuggestedMinimumHeight(), i12));
        setMeasuredDimension(iMin, iMin);
        float f5 = this.f22154a;
        float f11 = iMin;
        this.f22158e.set(f5 + CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO + f5, f11 - f5, f11 - f5);
    }

    public void setMax(int i11) {
        this.f22156c = i11;
        invalidate();
    }
}
