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
public final class UnitBgLeftDashLine extends BaseUnitBgDashLine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f22176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f22177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f22179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f22180e;

    public UnitBgLeftDashLine(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f22176a = paint;
        this.f22177b = new Path();
        this.f22178c = 0.5522848f;
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        this.f22179d = j3.Z(41, context2);
        Double dValueOf = Double.valueOf(17.5d);
        Context context3 = getContext();
        m.e(context3, "getContext(...)");
        this.f22180e = j3.Z(dValueOf, context3);
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
        return this.f22180e;
    }

    public final float getStartOffset() {
        return this.f22179d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        m.f(canvas, "canvas");
        super.onDraw(canvas);
        if (getLayoutDirection() == 1) {
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        float f5 = this.f22180e;
        float f11 = this.f22179d;
        float f12 = (2 * f5) + f11;
        Path path = this.f22177b;
        path.reset();
        float f13 = f5 + f11;
        Context context = getContext();
        m.e(context, "getContext(...)");
        float fZ = f11 - j3.Z(16, context);
        float f14 = fZ + f13;
        float f15 = f12 - f13;
        path.moveTo(fZ, f12);
        float f16 = this.f22178c * f13;
        this.f22177b.cubicTo(fZ, f12 - f16, f14 - f16, f15, f14, f15);
        float width = (getWidth() - fZ) - f13;
        float f17 = width + f13;
        float f18 = f15 - f13;
        path.lineTo(width, f15);
        this.f22177b.cubicTo(width + f16, f15, f17, f18 + f16, f17, f18);
        canvas.drawPath(path, this.f22176a);
    }

    @Override // com.lingo.lingoskill.widget.BaseUnitBgDashLine
    public void setColor(int i11) {
        this.f22176a.setColor(i11);
        invalidate();
    }

    public UnitBgLeftDashLine(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f22176a = paint;
        this.f22177b = new Path();
        this.f22178c = 0.5522848f;
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        this.f22179d = j3.Z(41, context2);
        Double dValueOf = Double.valueOf(17.5d);
        Context context3 = getContext();
        m.e(context3, "getContext(...)");
        this.f22180e = j3.Z(dValueOf, context3);
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

    public UnitBgLeftDashLine(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Paint paint = new Paint();
        this.f22176a = paint;
        this.f22177b = new Path();
        this.f22178c = 0.5522848f;
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        this.f22179d = j3.Z(41, context2);
        Double dValueOf = Double.valueOf(17.5d);
        Context context3 = getContext();
        m.e(context3, "getContext(...)");
        this.f22180e = j3.Z(dValueOf, context3);
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
