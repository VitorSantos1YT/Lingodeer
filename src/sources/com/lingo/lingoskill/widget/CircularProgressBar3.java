package com.lingo.lingoskill.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import ff.h;
import vh.c;
import vq.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CircularProgressBar3 extends View {
    public Paint H;
    public float K;
    public final b L;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f22091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f22092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f22093f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f22094t;

    public CircularProgressBar3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22088a = h.l(6.0f);
        this.f22089b = 100L;
        this.f22090c = -90;
        setLayerType(1, null);
        this.f22091d = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c.f54061b, 0, 0);
        try {
            this.f22088a = typedArrayObtainStyledAttributes.getDimension(3, this.f22088a);
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint(1);
            this.f22092e = paint;
            paint.setColor(context.getColor(R.color.color_E1E9F6));
            Paint paint2 = this.f22092e;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            this.f22092e.setStrokeWidth(this.f22088a);
            Paint paint3 = new Paint(1);
            this.f22093f = paint3;
            paint3.setColor(context.getColor(R.color.color_B8E986));
            this.f22093f.setStyle(style);
            this.f22093f.setStrokeCap(Paint.Cap.ROUND);
            this.f22093f.setStrokeWidth(this.f22088a);
            Paint paint4 = new Paint(1);
            this.f22094t = paint4;
            paint4.setColor(context.getColor(R.color.color_B8E986));
            this.f22094t.setStyle(Paint.Style.FILL);
            b bVar = new b(this);
            this.L = bVar;
            bVar.setDuration(1500L);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public b getAnim() {
        return this.L;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.H == null) {
            Paint paint = new Paint();
            this.H = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawPaint(this.H);
            this.H.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }
        canvas.drawOval(this.f22091d, this.f22092e);
        long j11 = this.f22089b;
        if (j11 == 0) {
            return;
        }
        float f5 = (((long) (this.M * 360)) / j11) * this.K;
        float f11 = f5 % 360.0f;
        canvas.drawArc(this.f22091d, this.f22090c, f11 == CropImageView.DEFAULT_ASPECT_RATIO ? f5 : f11, false, this.f22093f);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int iMin = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i11), View.getDefaultSize(getSuggestedMinimumHeight(), i12));
        setMeasuredDimension(iMin, iMin);
        float fL = h.l(6.0f) + this.f22088a;
        float fL2 = h.l(6.0f);
        float f5 = this.f22088a;
        float f11 = iMin;
        this.f22091d.set(fL, fL2 + f5, (f11 - f5) - h.l(6.0f), (f11 - this.f22088a) - h.l(6.0f));
    }

    public void setProgress(int i11) {
        this.M = i11;
        startAnimation(this.L);
    }
}
