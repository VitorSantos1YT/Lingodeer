package com.lingo.lingoskill.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class UnitBgVerticalDashLine extends BaseUnitBgDashLine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f22191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f22192b;

    public UnitBgVerticalDashLine(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f22191a = paint;
        this.f22192b = new Path();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        paint.setStrokeWidth(j3.Z(2, context2));
        paint.setAntiAlias(true);
        Context context3 = getContext();
        m.e(context3, "getContext(...)");
        paint.setColor(context3.getColor(R.color.colorAccent));
        Context context4 = getContext();
        m.e(context4, "getContext(...)");
        float fZ = j3.Z(6, context4);
        Context context5 = getContext();
        m.e(context5, "getContext(...)");
        float[] fArr = {fZ, j3.Z(6, context5)};
        Context context6 = getContext();
        m.e(context6, "getContext(...)");
        paint.setPathEffect(new DashPathEffect(fArr, j3.Z(1, context6)));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        m.f(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.f22192b;
        path.reset();
        float f5 = 2;
        path.moveTo(getWidth() / f5, CropImageView.DEFAULT_ASPECT_RATIO);
        path.lineTo(getWidth() / f5, getHeight());
        canvas.drawPath(path, this.f22191a);
    }

    @Override // com.lingo.lingoskill.widget.BaseUnitBgDashLine
    public void setColor(int i11) {
        this.f22191a.setColor(i11);
        invalidate();
    }

    public UnitBgVerticalDashLine(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f22191a = paint;
        this.f22192b = new Path();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        paint.setStrokeWidth(j3.Z(2, context2));
        paint.setAntiAlias(true);
        Context context3 = getContext();
        m.e(context3, "getContext(...)");
        paint.setColor(context3.getColor(R.color.colorAccent));
        Context context4 = getContext();
        m.e(context4, "getContext(...)");
        float fZ = j3.Z(6, context4);
        Context context5 = getContext();
        m.e(context5, "getContext(...)");
        float[] fArr = {fZ, j3.Z(6, context5)};
        Context context6 = getContext();
        m.e(context6, "getContext(...)");
        paint.setPathEffect(new DashPathEffect(fArr, j3.Z(1, context6)));
    }

    public UnitBgVerticalDashLine(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Paint paint = new Paint();
        this.f22191a = paint;
        this.f22192b = new Path();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        paint.setStrokeWidth(j3.Z(2, context2));
        paint.setAntiAlias(true);
        Context context3 = getContext();
        m.e(context3, "getContext(...)");
        paint.setColor(context3.getColor(R.color.colorAccent));
        Context context4 = getContext();
        m.e(context4, "getContext(...)");
        float fZ = j3.Z(6, context4);
        Context context5 = getContext();
        m.e(context5, "getContext(...)");
        float[] fArr = {fZ, j3.Z(6, context5)};
        Context context6 = getContext();
        m.e(context6, "getContext(...)");
        paint.setPathEffect(new DashPathEffect(fArr, j3.Z(1, context6)));
    }
}
