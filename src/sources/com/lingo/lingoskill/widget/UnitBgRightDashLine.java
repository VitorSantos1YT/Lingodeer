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
public final class UnitBgRightDashLine extends BaseUnitBgDashLine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f22181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f22182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f22184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f22185e;

    public UnitBgRightDashLine(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f22181a = paint;
        this.f22182b = new Path();
        this.f22183c = 0.5522848f;
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        this.f22184d = j3.Z(41, context2);
        Double dValueOf = Double.valueOf(17.5d);
        Context context3 = getContext();
        m.e(context3, "getContext(...)");
        this.f22185e = j3.Z(dValueOf, context3);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Context context4 = getContext();
        m.e(context4, "getContext(...)");
        paint.setStrokeWidth(j3.Z(2, context4));
        paint.setAntiAlias(true);
        Context context5 = getContext();
        m.e(context5, "getContext(...)");
        paint.setColor(context5.getColor(R.color.colorAccent));
        Context context6 = getContext();
        m.e(context6, "getContext(...)");
        float fZ = j3.Z(6, context6);
        Context context7 = getContext();
        m.e(context7, "getContext(...)");
        float[] fArr = {fZ, j3.Z(5, context7)};
        Context context8 = getContext();
        m.e(context8, "getContext(...)");
        paint.setPathEffect(new DashPathEffect(fArr, j3.Z(0, context8)));
    }

    public final float getMarginBtm() {
        return this.f22185e;
    }

    public final float getStartOffset() {
        return this.f22184d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        m.f(canvas, "canvas");
        super.onDraw(canvas);
        if (getLayoutDirection() == 1) {
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        Path path = this.f22182b;
        path.reset();
        float f5 = this.f22185e;
        float f11 = this.f22184d;
        float f12 = f5 + f11;
        float width = getWidth() - f11;
        Context context = getContext();
        m.e(context, "getContext(...)");
        float fZ = j3.Z(16, context) + width;
        float height = getHeight() + f11;
        float f13 = fZ - f12;
        float f14 = height - f12;
        path.moveTo(fZ, height);
        float f15 = this.f22183c * f12;
        this.f22182b.cubicTo(fZ, height - f15, f13 + f15, f14, f13, f14);
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        float fZ2 = (f11 - j3.Z(16, context2)) + f12;
        float f16 = fZ2 - f12;
        float f17 = f14 - f12;
        path.lineTo(fZ2, f14);
        this.f22182b.cubicTo(fZ2 - f15, f14, f16, f17 + f15, f16, f17);
        canvas.drawPath(path, this.f22181a);
    }

    @Override // com.lingo.lingoskill.widget.BaseUnitBgDashLine
    public void setColor(int i11) {
        this.f22181a.setColor(i11);
        invalidate();
    }

    public UnitBgRightDashLine(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f22181a = paint;
        this.f22182b = new Path();
        this.f22183c = 0.5522848f;
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        this.f22184d = j3.Z(41, context2);
        Double dValueOf = Double.valueOf(17.5d);
        Context context3 = getContext();
        m.e(context3, "getContext(...)");
        this.f22185e = j3.Z(dValueOf, context3);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Context context4 = getContext();
        m.e(context4, "getContext(...)");
        paint.setStrokeWidth(j3.Z(2, context4));
        paint.setAntiAlias(true);
        Context context5 = getContext();
        m.e(context5, "getContext(...)");
        paint.setColor(context5.getColor(R.color.colorAccent));
        Context context6 = getContext();
        m.e(context6, "getContext(...)");
        float fZ = j3.Z(6, context6);
        Context context7 = getContext();
        m.e(context7, "getContext(...)");
        float[] fArr = {fZ, j3.Z(5, context7)};
        Context context8 = getContext();
        m.e(context8, "getContext(...)");
        paint.setPathEffect(new DashPathEffect(fArr, j3.Z(0, context8)));
    }

    public UnitBgRightDashLine(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Paint paint = new Paint();
        this.f22181a = paint;
        this.f22182b = new Path();
        this.f22183c = 0.5522848f;
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        this.f22184d = j3.Z(41, context2);
        Double dValueOf = Double.valueOf(17.5d);
        Context context3 = getContext();
        m.e(context3, "getContext(...)");
        this.f22185e = j3.Z(dValueOf, context3);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Context context4 = getContext();
        m.e(context4, "getContext(...)");
        paint.setStrokeWidth(j3.Z(2, context4));
        paint.setAntiAlias(true);
        Context context5 = getContext();
        m.e(context5, "getContext(...)");
        paint.setColor(context5.getColor(R.color.colorAccent));
        Context context6 = getContext();
        m.e(context6, "getContext(...)");
        float fZ = j3.Z(6, context6);
        Context context7 = getContext();
        m.e(context7, "getContext(...)");
        float[] fArr = {fZ, j3.Z(5, context7)};
        Context context8 = getContext();
        m.e(context8, "getContext(...)");
        paint.setPathEffect(new DashPathEffect(fArr, j3.Z(0, context8)));
    }
}
