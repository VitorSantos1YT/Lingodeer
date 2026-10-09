package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import ue.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f14968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f14969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f14970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f14971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f14972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f14973k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14974l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14975n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f14976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RectF f14977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Pair f14978q;

    public CircularDrawingDelegate(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f14977p = new RectF();
        this.f14978q = new Pair(new DrawingDelegate.PathPoint(), new DrawingDelegate.PathPoint());
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void a(Canvas canvas, Rect rect, float f5, boolean z11, boolean z12) {
        float fWidth = rect.width() / k();
        float fHeight = rect.height() / k();
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f15022a;
        float f11 = (circularProgressIndicatorSpec.f15008p / 2.0f) + circularProgressIndicatorSpec.f15009q;
        canvas.translate((f11 * fWidth) + rect.left, (f11 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (circularProgressIndicatorSpec.f15010r != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        int i11 = circularProgressIndicatorSpec.f14955a;
        this.f14968f = i11 * f5;
        this.f14969g = Math.min(i11 / 2, circularProgressIndicatorSpec.a()) * f5;
        this.f14970h = circularProgressIndicatorSpec.f14966l * f5;
        int i12 = circularProgressIndicatorSpec.f15008p;
        int i13 = circularProgressIndicatorSpec.f14955a;
        float f13 = (i12 - i13) / 2.0f;
        this.f14971i = f13;
        if (z11 || z12) {
            float f14 = ((1.0f - f5) * i13) / 2.0f;
            if ((z11 && circularProgressIndicatorSpec.f14961g == 2) || (z12 && circularProgressIndicatorSpec.f14962h == 1)) {
                this.f14971i = f13 + f14;
            } else if ((z11 && circularProgressIndicatorSpec.f14961g == 1) || (z12 && circularProgressIndicatorSpec.f14962h == 2)) {
                this.f14971i = f13 - f14;
            }
        }
        if (z12 && circularProgressIndicatorSpec.f14962h == 3) {
            this.f14976o = f5;
        } else {
            this.f14976o = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void c(Canvas canvas, Paint paint, DrawingDelegate.ActiveIndicator activeIndicator, int i11) {
        int iA = MaterialColors.a(activeIndicator.f15029c, i11);
        canvas.save();
        canvas.rotate(activeIndicator.f15033g);
        this.f14975n = activeIndicator.f15034h;
        float f5 = activeIndicator.f15027a;
        float f11 = activeIndicator.f15028b;
        int i12 = activeIndicator.f15030d;
        i(canvas, paint, f5, f11, iA, i12, i12, activeIndicator.f15031e, activeIndicator.f15032f, true);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void d(Canvas canvas, Paint paint, float f5, float f11, int i11, int i12, int i13) {
        int iA = MaterialColors.a(i11, i12);
        this.f14975n = false;
        i(canvas, paint, f5, f11, iA, i13, i13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final int e() {
        return k();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final int f() {
        return k();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void g() {
        Path path = this.f15023b;
        path.rewind();
        path.moveTo(1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        for (int i11 = 0; i11 < 2; i11++) {
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        Matrix matrix = this.f15026e;
        matrix.reset();
        float f5 = this.f14971i;
        matrix.setScale(f5, f5);
        path.transform(matrix);
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f15022a;
        boolean zB = circularProgressIndicatorSpec.b(this.f14975n);
        PathMeasure pathMeasure = this.f15025d;
        if (zB) {
            pathMeasure.setPath(path, false);
            float f11 = this.f14973k;
            path.rewind();
            float length = pathMeasure.getLength();
            int iMax = Math.max(3, (int) ((length / (this.f14975n ? circularProgressIndicatorSpec.f14964j : circularProgressIndicatorSpec.f14965k)) / 2.0f)) * 2;
            this.f14972j = length / iMax;
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < iMax; i12++) {
                DrawingDelegate.PathPoint pathPoint = new DrawingDelegate.PathPoint();
                float f12 = i12;
                pathMeasure.getPosTan(this.f14972j * f12, pathPoint.f15035a, pathPoint.f15036b);
                DrawingDelegate.PathPoint pathPoint2 = new DrawingDelegate.PathPoint();
                float f13 = this.f14972j;
                pathMeasure.getPosTan((f13 / 2.0f) + (f12 * f13), pathPoint2.f15035a, pathPoint2.f15036b);
                arrayList.add(pathPoint);
                pathPoint2.a(f11 * 2.0f);
                arrayList.add(pathPoint2);
            }
            arrayList.add((DrawingDelegate.PathPoint) arrayList.get(0));
            DrawingDelegate.PathPoint pathPoint3 = (DrawingDelegate.PathPoint) arrayList.get(0);
            float[] fArr = pathPoint3.f15035a;
            path.moveTo(fArr[0], fArr[1]);
            int i13 = 1;
            while (i13 < arrayList.size()) {
                DrawingDelegate.PathPoint pathPoint4 = (DrawingDelegate.PathPoint) arrayList.get(i13);
                float f14 = (this.f14972j / 2.0f) * 0.48f;
                DrawingDelegate.PathPoint pathPoint5 = new DrawingDelegate.PathPoint(pathPoint3.f15035a, pathPoint3.f15036b);
                DrawingDelegate.PathPoint pathPoint6 = new DrawingDelegate.PathPoint(pathPoint4.f15035a, pathPoint4.f15036b);
                pathPoint5.b(f14);
                pathPoint6.b(-f14);
                float[] fArr2 = pathPoint5.f15035a;
                float f15 = fArr2[0];
                float f16 = fArr2[1];
                float[] fArr3 = pathPoint6.f15035a;
                float f17 = fArr3[0];
                float f18 = fArr3[1];
                float[] fArr4 = pathPoint4.f15035a;
                path.cubicTo(f15, f16, f17, f18, fArr4[0], fArr4[1]);
                i13++;
                pathPoint3 = pathPoint4;
            }
        }
        pathMeasure.setPath(path, false);
    }

    public final void i(Canvas canvas, Paint paint, float f5, float f11, int i11, int i12, int i13, float f12, float f13, boolean z11) {
        float f14;
        Canvas canvas2;
        float f15 = f11 >= f5 ? f11 - f5 : (f11 + 1.0f) - f5;
        float f16 = f5 % 1.0f;
        if (f16 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f16 += 1.0f;
        }
        if (this.f14976o < 1.0f) {
            float f17 = f16 + f15;
            if (f17 > 1.0f) {
                i(canvas, paint, f16, 1.0f, i11, i12, 0, f12, f13, z11);
                i(canvas, paint, 1.0f, f17, i11, 0, i13, f12, f13, z11);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f14969g / this.f14971i);
        float f18 = f15 - 0.99f;
        if (f18 >= CropImageView.DEFAULT_ASPECT_RATIO) {
            float f19 = ((f18 * degrees) / 180.0f) / 0.01f;
            f15 += f19;
            if (!z11) {
                f16 -= f19 / 2.0f;
            }
        }
        float fC = MathUtils.c(1.0f - this.f14976o, 1.0f, f16);
        float fC2 = MathUtils.c(CropImageView.DEFAULT_ASPECT_RATIO, this.f14976o, f15);
        float degrees2 = (float) Math.toDegrees(i12 / this.f14971i);
        float degrees3 = ((fC2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i13 / this.f14971i));
        float f21 = (fC * 360.0f) + degrees2;
        if (degrees3 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f15022a;
        boolean z12 = circularProgressIndicatorSpec.b(this.f14975n) && z11 && f12 > CropImageView.DEFAULT_ASPECT_RATIO;
        paint.setAntiAlias(true);
        paint.setColor(i11);
        paint.setStrokeWidth(this.f14968f);
        float f22 = this.f14969g * 2.0f;
        float f23 = degrees * 2.0f;
        PathMeasure pathMeasure = this.f15025d;
        if (degrees3 < f23) {
            float f24 = degrees3 / f23;
            float f25 = (degrees * f24) + f21;
            DrawingDelegate.PathPoint pathPoint = new DrawingDelegate.PathPoint();
            if (z12) {
                float length = (pathMeasure.getLength() * (f25 / 360.0f)) / 2.0f;
                float f26 = this.f14970h * f12;
                float f27 = this.f14971i;
                if (f27 != this.m || f26 != this.f14973k) {
                    this.f14973k = f26;
                    this.m = f27;
                    g();
                }
                pathMeasure.getPosTan(length, pathPoint.f15035a, pathPoint.f15036b);
            } else {
                pathPoint.d(f25 + 90.0f);
                pathPoint.a(-this.f14971i);
            }
            paint.setStyle(Paint.Style.FILL);
            j(canvas, paint, pathPoint, f22, this.f14968f, f24);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(circularProgressIndicatorSpec.c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f28 = f21 + degrees;
        float f29 = degrees3 - f23;
        Pair pair = this.f14978q;
        ((DrawingDelegate.PathPoint) pair.first).c();
        ((DrawingDelegate.PathPoint) pair.second).c();
        if (z12) {
            float f30 = f28 / 360.0f;
            float f31 = f29 / 360.0f;
            float f32 = this.f14970h * f12;
            int i14 = this.f14975n ? circularProgressIndicatorSpec.f14964j : circularProgressIndicatorSpec.f14965k;
            float f33 = this.f14971i;
            if (f33 != this.m || f32 != this.f14973k || i14 != this.f14974l) {
                this.f14973k = f32;
                this.f14974l = i14;
                this.m = f33;
                g();
            }
            Path path = this.f15024c;
            path.rewind();
            float fM = f.m(f31, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            if (circularProgressIndicatorSpec.b(this.f14975n)) {
                float f34 = f13 / ((float) ((((double) this.f14971i) * 6.283185307179586d) / ((double) this.f14972j)));
                f30 += f34;
                f14 = CropImageView.DEFAULT_ASPECT_RATIO - (f34 * 360.0f);
            } else {
                f14 = 0.0f;
            }
            float f35 = f30 % 1.0f;
            float length2 = (pathMeasure.getLength() * f35) / 2.0f;
            float length3 = (pathMeasure.getLength() * (f35 + fM)) / 2.0f;
            pathMeasure.getSegment(length2, length3, path, true);
            DrawingDelegate.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair.first;
            pathPoint2.c();
            pathMeasure.getPosTan(length2, pathPoint2.f15035a, pathPoint2.f15036b);
            DrawingDelegate.PathPoint pathPoint3 = (DrawingDelegate.PathPoint) pair.second;
            pathPoint3.c();
            pathMeasure.getPosTan(length3, pathPoint3.f15035a, pathPoint3.f15036b);
            Matrix matrix = this.f15026e;
            matrix.reset();
            matrix.setRotate(f14);
            pathPoint2.d(f14);
            pathPoint3.d(f14);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((DrawingDelegate.PathPoint) pair.first).d(f28 + 90.0f);
            ((DrawingDelegate.PathPoint) pair.first).a(-this.f14971i);
            ((DrawingDelegate.PathPoint) pair.second).d(f28 + f29 + 90.0f);
            ((DrawingDelegate.PathPoint) pair.second).a(-this.f14971i);
            float f36 = this.f14971i;
            float f37 = -f36;
            RectF rectF = this.f14977p;
            rectF.set(f37, f37, f36, f36);
            canvas.drawArc(rectF, f28, f29, false, paint);
            canvas2 = canvas;
        }
        if (circularProgressIndicatorSpec.c() || this.f14969g <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        j(canvas2, paint, (DrawingDelegate.PathPoint) pair.first, f22, this.f14968f, 1.0f);
        j(canvas, paint, (DrawingDelegate.PathPoint) pair.second, f22, this.f14968f, 1.0f);
    }

    public final void j(Canvas canvas, Paint paint, DrawingDelegate.PathPoint pathPoint, float f5, float f11, float f12) {
        float fMin = Math.min(f11, this.f14968f);
        float f13 = f5 / 2.0f;
        float fMin2 = Math.min(f13, (this.f14969g * fMin) / this.f14968f);
        RectF rectF = new RectF((-f5) / 2.0f, (-fMin) / 2.0f, f13, fMin / 2.0f);
        canvas.save();
        float[] fArr = pathPoint.f15035a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(DrawingDelegate.h(pathPoint.f15036b));
        canvas.scale(f12, f12);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    public final int k() {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f15022a;
        return (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).f15009q * 2) + ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).f15008p;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void b(int i11, int i12, Canvas canvas, Paint paint) {
    }
}
