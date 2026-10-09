package com.lingo.lingoskill.chineseskill.ui.pinyin.widget;

import aj.h;
import aj.i;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class WaveView extends View {
    public long H;
    public final ArrayList K;
    public final i L;
    public Interpolator M;
    public final Paint N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f21751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f21752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f21753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f21755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21756f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f21757t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaveView(Context context) {
        super(context);
        m.f(context, "context");
        this.f21753c = 2000L;
        this.f21754d = 500;
        this.f21755e = 0.85f;
        this.K = new ArrayList();
        this.L = new i(this, 0);
        this.M = new LinearInterpolator();
        this.N = new Paint(1);
    }

    public final void a() {
        if (this.f21757t) {
            return;
        }
        this.f21757t = true;
        this.L.run();
    }

    public final void b() {
        this.f21757t = false;
        this.K.clear();
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        m.f(canvas, "canvas");
        ArrayList arrayList = this.K;
        Iterator it = arrayList.iterator();
        m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            m.e(next, "next(...)");
            h hVar = (h) next;
            float fA = hVar.a();
            if (System.currentTimeMillis() - hVar.f751a < this.f21753c) {
                float fA2 = hVar.a();
                WaveView waveView = hVar.f752b;
                float f5 = waveView.f21751a;
                float f11 = (fA2 - f5) / (waveView.f21752b - f5);
                float f12 = 255;
                Interpolator interpolator = waveView.M;
                m.c(interpolator);
                int interpolation = (int) (f12 - (interpolator.getInterpolation(f11) * f12));
                Paint paint = this.N;
                paint.setAlpha(interpolation);
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, fA, paint);
            } else {
                it.remove();
            }
        }
        if (arrayList.size() > 0) {
            postInvalidateDelayed(10L);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        if (this.f21756f) {
            return;
        }
        this.f21752b = (Math.min(i11, i12) * this.f21755e) / 2.0f;
    }

    public final void setColor(int i11) {
        this.N.setColor(i11);
    }

    public final void setDuration(long j11) {
        this.f21753c = j11;
    }

    public final void setInitialRadius(float f5) {
        this.f21751a = f5;
    }

    public final void setInterpolator(Interpolator interpolator) {
        m.f(interpolator, "interpolator");
        this.M = interpolator;
    }

    public final void setMaxRadius(float f5) {
        this.f21752b = f5;
        this.f21756f = true;
    }

    public final void setMaxRadiusRate(float f5) {
        this.f21755e = f5;
    }

    public final void setSpeed(int i11) {
        this.f21754d = i11;
    }

    public final void setStyle(Paint.Style style) {
        m.f(style, "style");
        Paint paint = this.N;
        paint.setStyle(style);
        paint.setStrokeWidth(ff.h.l(2.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaveView(Context context, AttributeSet attrs) {
        super(context, attrs);
        m.f(context, "context");
        m.f(attrs, "attrs");
        this.f21753c = 2000L;
        this.f21754d = 500;
        this.f21755e = 0.85f;
        this.K = new ArrayList();
        this.L = new i(this, 0);
        this.M = new LinearInterpolator();
        this.N = new Paint(1);
    }
}
