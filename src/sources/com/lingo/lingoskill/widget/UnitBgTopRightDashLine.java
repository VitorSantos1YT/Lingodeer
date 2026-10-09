package com.lingo.lingoskill.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.lingodeer.R;
import fr.j3;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class UnitBgTopRightDashLine extends BaseUnitBgDashLine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f22186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f22187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f22189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f22190e;

    public UnitBgTopRightDashLine(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f22186a = paint;
        this.f22187b = new Path();
        this.f22188c = 0.5522848f;
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        this.f22189d = j3.Z(36, context2);
        Double dValueOf = Double.valueOf(22.5d);
        Context context3 = getContext();
        m.e(context3, "getContext(...)");
        this.f22190e = j3.Z(dValueOf, context3);
        paint.setStyle(Paint.Style.STROKE);
        Context context4 = getContext();
        m.e(context4, "getContext(...)");
        paint.setStrokeWidth(j3.Z(2, context4));
        paint.setAntiAlias(true);
        Context context5 = getContext();
        m.e(context5, "getContext(...)");
        paint.setColor(context5.getColor(R.color.colorAccent));
        Context context6 = getContext();
        m.e(context6, "getContext(...)");
        float fZ = j3.Z(4, context6);
        Context context7 = getContext();
        m.e(context7, "getContext(...)");
        float[] fArr = {fZ, j3.Z(4, context7)};
        Context context8 = getContext();
        m.e(context8, "getContext(...)");
        paint.setPathEffect(new DashPathEffect(fArr, j3.Z(2, context8)));
    }

    public final float getMarginBtm() {
        return this.f22190e;
    }

    public final float getStartOffset() {
        return this.f22189d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        m.f(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.f22187b;
        path.reset();
        canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        float f5 = this.f22189d;
        float f11 = this.f22190e;
        float f12 = f5 + f11;
        path.moveTo(f5 - (f11 / 2.0f), getHeight() / 2.0f);
        float f13 = this.f22188c * f12;
        float width = getWidth();
        float f14 = this.f22189d;
        float f15 = (width - (f14 - (f11 / 2.0f))) - f12;
        path.lineTo(f15, f14);
        float f16 = f15 + f12;
        float f17 = f14 + f12;
        path.lineTo(f15, f14);
        this.f22187b.cubicTo(f15 + f13, f14, f16, f17 - f13, f16, f17);
        canvas.drawPath(path, this.f22186a);
    }

    @Override // com.lingo.lingoskill.widget.BaseUnitBgDashLine
    public void setColor(int i11) {
        this.f22186a.setColor(i11);
        invalidate();
    }

    public UnitBgTopRightDashLine(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f22186a = paint;
        this.f22187b = new Path();
        this.f22188c = 0.5522848f;
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        this.f22189d = j3.Z(36, context2);
        Double dValueOf = Double.valueOf(22.5d);
        Context context3 = getContext();
        m.e(context3, "getContext(...)");
        this.f22190e = j3.Z(dValueOf, context3);
        paint.setStyle(Paint.Style.STROKE);
        Context context4 = getContext();
        m.e(context4, "getContext(...)");
        paint.setStrokeWidth(j3.Z(2, context4));
        paint.setAntiAlias(true);
        Context context5 = getContext();
        m.e(context5, "getContext(...)");
        paint.setColor(context5.getColor(R.color.colorAccent));
        Context context6 = getContext();
        m.e(context6, "getContext(...)");
        float fZ = j3.Z(4, context6);
        Context context7 = getContext();
        m.e(context7, "getContext(...)");
        float[] fArr = {fZ, j3.Z(4, context7)};
        Context context8 = getContext();
        m.e(context8, "getContext(...)");
        paint.setPathEffect(new DashPathEffect(fArr, j3.Z(2, context8)));
    }

    public UnitBgTopRightDashLine(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Paint paint = new Paint();
        this.f22186a = paint;
        this.f22187b = new Path();
        this.f22188c = 0.5522848f;
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        this.f22189d = j3.Z(36, context2);
        Double dValueOf = Double.valueOf(22.5d);
        Context context3 = getContext();
        m.e(context3, "getContext(...)");
        this.f22190e = j3.Z(dValueOf, context3);
        paint.setStyle(Paint.Style.STROKE);
        Context context4 = getContext();
        m.e(context4, "getContext(...)");
        paint.setStrokeWidth(j3.Z(2, context4));
        paint.setAntiAlias(true);
        Context context5 = getContext();
        m.e(context5, "getContext(...)");
        paint.setColor(context5.getColor(R.color.colorAccent));
        Context context6 = getContext();
        m.e(context6, "getContext(...)");
        float fZ = j3.Z(4, context6);
        Context context7 = getContext();
        m.e(context7, "getContext(...)");
        float[] fArr = {fZ, j3.Z(4, context7)};
        Context context8 = getContext();
        m.e(context8, "getContext(...)");
        paint.setPathEffect(new DashPathEffect(fArr, j3.Z(2, context8)));
    }
}
