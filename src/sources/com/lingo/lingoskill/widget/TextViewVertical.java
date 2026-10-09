package com.lingo.lingoskill.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TextViewVertical extends View {
    public int H;
    public int K;
    public int L;
    public int M;
    public String N;
    public Handler O;
    public final Matrix P;
    public final Paint.Align Q;
    public final BitmapDrawable R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f22161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22166f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f22167t;

    public TextViewVertical(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f22162b = 0;
        this.f22163c = 0;
        this.f22164d = 0;
        this.f22165e = 0;
        this.f22166f = 0;
        this.f22167t = 24.0f;
        this.H = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = BuildConfig.VERSION_NAME;
        this.O = null;
        this.Q = Paint.Align.RIGHT;
        this.R = (BitmapDrawable) getBackground();
    }

    public final void a() {
        float f5 = this.f22167t;
        Paint paint = this.f22161a;
        paint.setTextSize(f5);
        if (this.K == 0) {
            float[] fArr = new float[1];
            paint.getTextWidths("正", fArr);
            this.K = (int) Math.ceil((((double) fArr[0]) * 1.1d) + 2.0d);
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.f22166f = (int) (Math.ceil(fontMetrics.descent - fontMetrics.top) * 0.9d);
        this.H = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.L) {
            if (this.N.charAt(i11) == '\n') {
                this.H++;
            } else {
                i12 += this.f22166f;
                if (i12 > this.f22165e) {
                    this.H++;
                    i11--;
                } else if (i11 == this.L - 1) {
                    this.H++;
                }
                i11++;
            }
            i12 = 0;
            i11++;
        }
        int i13 = this.H + 1;
        this.H = i13;
        int i14 = this.K * i13;
        this.f22164d = i14;
        measure(i14, getHeight());
        layout(getLeft(), getTop(), getLeft() + this.f22164d, getBottom());
    }

    public int getTextWidth() {
        return this.f22164d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f22161a;
        BitmapDrawable bitmapDrawable = this.R;
        if (bitmapDrawable != null) {
            canvas.drawBitmap(Bitmap.createBitmap(bitmapDrawable.getBitmap(), 0, 0, this.f22164d, this.f22165e), this.P, paint);
        }
        String str = this.N;
        this.f22163c = 0;
        Paint.Align align = Paint.Align.LEFT;
        Paint.Align align2 = this.Q;
        this.f22162b = align2 == align ? this.K : this.f22164d - this.K;
        int i11 = 0;
        while (i11 < this.L) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\n') {
                if (align2 == Paint.Align.LEFT) {
                    this.f22162b += this.K;
                } else {
                    this.f22162b -= this.K;
                }
                this.f22163c = 0;
            } else {
                int i12 = this.f22163c + this.f22166f;
                this.f22163c = i12;
                if (i12 > this.f22165e) {
                    if (align2 == Paint.Align.LEFT) {
                        this.f22162b += this.K;
                    } else {
                        this.f22162b -= this.K;
                    }
                    i11--;
                    this.f22163c = 0;
                } else {
                    canvas.drawText(String.valueOf(cCharAt), this.f22162b, this.f22163c, paint);
                }
            }
            i11++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            size = 500;
        }
        this.f22165e = size;
        if (this.f22164d == 0) {
            a();
        }
        setMeasuredDimension(this.f22164d, size);
        if (this.M != getWidth()) {
            this.M = getWidth();
            Handler handler = this.O;
            if (handler != null) {
                handler.sendEmptyMessage(1);
            }
        }
    }

    public void setHandler(Handler handler) {
        this.O = handler;
    }

    public void setLineWidth(int i11) {
        this.K = i11;
    }

    public final void setText(String str) {
        this.N = str;
        this.L = str.length();
        if (this.f22165e > 0) {
            a();
        }
    }

    public final void setTextColor(int i11) {
        this.f22161a.setColor(i11);
    }

    public final void setTextSize(float f5) {
        if (f5 != this.f22161a.getTextSize()) {
            this.f22167t = f5;
            if (this.f22165e > 0) {
                a();
            }
        }
    }

    public void setTypeface(Typeface typeface) {
        Paint paint = this.f22161a;
        if (paint.getTypeface() != typeface) {
            paint.setTypeface(typeface);
        }
    }

    public TextViewVertical(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22162b = 0;
        this.f22163c = 0;
        this.f22164d = 0;
        this.f22165e = 0;
        this.f22166f = 0;
        this.f22167t = 24.0f;
        this.H = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = BuildConfig.VERSION_NAME;
        this.O = null;
        this.Q = Paint.Align.RIGHT;
        this.R = (BitmapDrawable) getBackground();
        this.P = new Matrix();
        Paint paint = new Paint();
        this.f22161a = paint;
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        paint.setColor(-16777216);
        try {
            this.f22167t = Float.parseFloat(attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "textSize"));
        } catch (Exception unused) {
        }
    }
}
