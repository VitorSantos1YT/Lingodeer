package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import com.yalantis.ucrop.view.CropImageView;
import ue.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f15040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f15042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f15043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f15044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f15045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15046l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f15047n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Pair f15048o;

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void a(Canvas canvas, Rect rect, float f5, boolean z11, boolean z12) {
        if (this.f15040f != rect.width()) {
            this.f15040f = rect.width();
            g();
        }
        float fE = e();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(CropImageView.DEFAULT_ASPECT_RATIO, (rect.height() - fE) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f15022a;
        if (linearProgressIndicatorSpec.f15071q) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f11 = this.f15040f / 2.0f;
        float f12 = fE / 2.0f;
        canvas.clipRect(-f11, -f12, f11, f12);
        int i11 = linearProgressIndicatorSpec.f14955a;
        this.f15041g = i11 * f5;
        this.f15042h = Math.min(i11 / 2, linearProgressIndicatorSpec.a()) * f5;
        this.f15044j = linearProgressIndicatorSpec.f14966l * f5;
        this.f15043i = Math.min(linearProgressIndicatorSpec.f14955a / 2.0f, linearProgressIndicatorSpec.e()) * f5;
        if (z11 || z12) {
            if ((z11 && linearProgressIndicatorSpec.f14961g == 2) || (z12 && linearProgressIndicatorSpec.f14962h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z11 || (z12 && linearProgressIndicatorSpec.f14962h != 3)) {
                canvas.translate(CropImageView.DEFAULT_ASPECT_RATIO, ((1.0f - f5) * linearProgressIndicatorSpec.f14955a) / 2.0f);
            }
        }
        if (z12 && linearProgressIndicatorSpec.f14962h == 3) {
            this.f15047n = f5;
        } else {
            this.f15047n = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void b(int i11, int i12, Canvas canvas, Paint paint) {
        int iA = MaterialColors.a(i11, i12);
        this.m = false;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f15022a;
        if (linearProgressIndicatorSpec.f15072r <= 0 || iA == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iA);
        Integer num = linearProgressIndicatorSpec.f15073s;
        DrawingDelegate.PathPoint pathPoint = new DrawingDelegate.PathPoint(new float[]{(this.f15040f / 2.0f) - (num != null ? (linearProgressIndicatorSpec.f15072r / 2.0f) + num.floatValue() : this.f15041g / 2.0f), CropImageView.DEFAULT_ASPECT_RATIO}, new float[]{1.0f, CropImageView.DEFAULT_ASPECT_RATIO});
        int i13 = linearProgressIndicatorSpec.f15072r;
        j(canvas, paint, pathPoint, i13, i13, (this.f15042h * i13) / this.f15041g, null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void c(Canvas canvas, Paint paint, DrawingDelegate.ActiveIndicator activeIndicator, int i11) {
        int iA = MaterialColors.a(activeIndicator.f15029c, i11);
        this.m = activeIndicator.f15034h;
        float f5 = activeIndicator.f15027a;
        float f11 = activeIndicator.f15028b;
        int i12 = activeIndicator.f15030d;
        i(canvas, paint, f5, f11, iA, i12, i12, activeIndicator.f15031e, activeIndicator.f15032f, true);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void d(Canvas canvas, Paint paint, float f5, float f11, int i11, int i12, int i13) {
        int iA = MaterialColors.a(i11, i12);
        this.m = false;
        i(canvas, paint, f5, f11, iA, i13, i13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final int e() {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f15022a;
        return (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f14966l * 2) + ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f14955a;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final int f() {
        return -1;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void g() {
        Path path = this.f15023b;
        path.rewind();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f15022a;
        if (linearProgressIndicatorSpec.b(this.m)) {
            int i11 = this.m ? linearProgressIndicatorSpec.f14964j : linearProgressIndicatorSpec.f14965k;
            float f5 = this.f15040f;
            int i12 = (int) (f5 / i11);
            this.f15045k = f5 / i12;
            for (int i13 = 0; i13 <= i12; i13++) {
                int i14 = i13 * 2;
                float f11 = i14 + 1;
                path.cubicTo(i14 + 0.48f, CropImageView.DEFAULT_ASPECT_RATIO, f11 - 0.48f, 1.0f, f11, 1.0f);
                float f12 = f11 + 0.48f;
                float f13 = i14 + 2;
                path.cubicTo(f12, 1.0f, f13 - 0.48f, CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO);
            }
            Matrix matrix = this.f15026e;
            matrix.reset();
            matrix.setScale(this.f15045k / 2.0f, -2.0f);
            matrix.postTranslate(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.f15040f, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        this.f15025d.setPath(path, false);
    }

    public final void i(Canvas canvas, Paint paint, float f5, float f11, int i11, int i12, int i13, float f12, float f13, boolean z11) {
        float fC;
        float fC2;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec;
        int i14;
        float f14;
        Canvas canvas2;
        Pair pair = this.f15048o;
        float fM = f.m(f5, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        float fM2 = f.m(f11, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        float fC3 = MathUtils.c(1.0f - this.f15047n, 1.0f, fM);
        float fC4 = MathUtils.c(1.0f - this.f15047n, 1.0f, fM2);
        int iM = (int) ((f.m(fC3, CropImageView.DEFAULT_ASPECT_RATIO, 0.01f) * i12) / 0.01f);
        int iM2 = (int) (((1.0f - f.m(fC4, 0.99f, 1.0f)) * i13) / 0.01f);
        float f15 = this.f15040f;
        int i15 = (int) ((fC3 * f15) + iM);
        int i16 = (int) ((fC4 * f15) - iM2);
        float f16 = this.f15042h;
        float f17 = this.f15043i;
        if (f16 != f17) {
            float fMax = Math.max(f16, f17);
            float f18 = this.f15040f;
            float f19 = fMax / f18;
            fC = MathUtils.c(this.f15042h, this.f15043i, f.m(i15 / f18, CropImageView.DEFAULT_ASPECT_RATIO, f19) / f19);
            float f21 = this.f15042h;
            float f22 = this.f15043i;
            float f23 = this.f15040f;
            fC2 = MathUtils.c(f21, f22, f.m((f23 - i16) / f23, CropImageView.DEFAULT_ASPECT_RATIO, f19) / f19);
        } else {
            fC = f16;
            fC2 = fC;
        }
        float f24 = (-this.f15040f) / 2.0f;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec2 = (LinearProgressIndicatorSpec) this.f15022a;
        boolean z12 = linearProgressIndicatorSpec2.b(this.m) && z11 && f12 > CropImageView.DEFAULT_ASPECT_RATIO;
        if (i15 <= i16) {
            float f25 = i15 + fC;
            float f26 = i16 - fC2;
            float f27 = fC * 2.0f;
            float f28 = fC2 * 2.0f;
            paint.setColor(i11);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f15041g);
            ((DrawingDelegate.PathPoint) pair.first).c();
            ((DrawingDelegate.PathPoint) pair.second).c();
            ((DrawingDelegate.PathPoint) pair.first).f(f25 + f24);
            ((DrawingDelegate.PathPoint) pair.second).f(f26 + f24);
            if (i15 == 0 && f26 + fC2 < f25 + fC) {
                DrawingDelegate.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
                float f29 = this.f15041g;
                j(canvas, paint, pathPoint, f27, f29, fC, (DrawingDelegate.PathPoint) pair.second, f28, f29, fC2, true);
                return;
            }
            if (f25 - fC > f26 - fC2) {
                DrawingDelegate.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair.second;
                float f30 = this.f15041g;
                j(canvas, paint, pathPoint2, f28, f30, fC2, (DrawingDelegate.PathPoint) pair.first, f27, f30, fC, false);
                return;
            }
            float f31 = fC2;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(linearProgressIndicatorSpec2.c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z12) {
                float f32 = this.f15040f;
                float f33 = f25 / f32;
                float f34 = f26 / f32;
                if (this.m) {
                    linearProgressIndicatorSpec = linearProgressIndicatorSpec2;
                    i14 = linearProgressIndicatorSpec.f14964j;
                } else {
                    linearProgressIndicatorSpec = linearProgressIndicatorSpec2;
                    i14 = linearProgressIndicatorSpec.f14965k;
                }
                if (i14 != this.f15046l) {
                    this.f15046l = i14;
                    g();
                }
                Path path = this.f15024c;
                path.rewind();
                float f35 = (-this.f15040f) / 2.0f;
                boolean zB = linearProgressIndicatorSpec.b(this.m);
                if (zB) {
                    float f36 = this.f15040f;
                    f14 = 1.0f;
                    float f37 = this.f15045k;
                    float f38 = f36 / f37;
                    float f39 = f13 / f38;
                    float f40 = f38 / (f38 + 1.0f);
                    f33 = (f33 + f39) * f40;
                    f34 = (f34 + f39) * f40;
                    f35 -= f37 * f13;
                } else {
                    f14 = 1.0f;
                }
                PathMeasure pathMeasure = this.f15025d;
                float length = pathMeasure.getLength() * f33;
                float length2 = pathMeasure.getLength() * f34;
                pathMeasure.getSegment(length, length2, path, true);
                DrawingDelegate.PathPoint pathPoint3 = (DrawingDelegate.PathPoint) pair.first;
                pathPoint3.c();
                pathMeasure.getPosTan(length, pathPoint3.f15035a, pathPoint3.f15036b);
                DrawingDelegate.PathPoint pathPoint4 = (DrawingDelegate.PathPoint) pair.second;
                pathPoint4.c();
                pathMeasure.getPosTan(length2, pathPoint4.f15035a, pathPoint4.f15036b);
                Matrix matrix = this.f15026e;
                matrix.reset();
                matrix.setTranslate(f35, CropImageView.DEFAULT_ASPECT_RATIO);
                pathPoint3.f(f35);
                pathPoint4.f(f35);
                if (zB) {
                    float f41 = this.f15044j * f12;
                    matrix.postScale(f14, f41);
                    pathPoint3.e(f41);
                    pathPoint4.e(f41);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                float[] fArr = ((DrawingDelegate.PathPoint) pair.first).f15035a;
                float f42 = fArr[0];
                float f43 = fArr[1];
                float[] fArr2 = ((DrawingDelegate.PathPoint) pair.second).f15035a;
                canvas.drawLine(f42, f43, fArr2[0], fArr2[1], paint);
                canvas2 = canvas;
                linearProgressIndicatorSpec = linearProgressIndicatorSpec2;
            }
            if (linearProgressIndicatorSpec.c()) {
                return;
            }
            if (f25 > CropImageView.DEFAULT_ASPECT_RATIO && fC > CropImageView.DEFAULT_ASPECT_RATIO) {
                j(canvas2, paint, (DrawingDelegate.PathPoint) pair.first, f27, this.f15041g, fC, null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false);
            }
            if (f26 >= this.f15040f || f31 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                return;
            }
            j(canvas, paint, (DrawingDelegate.PathPoint) pair.second, f28, this.f15041g, f31, null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false);
        }
    }

    public final void j(Canvas canvas, Paint paint, DrawingDelegate.PathPoint pathPoint, float f5, float f11, float f12, DrawingDelegate.PathPoint pathPoint2, float f13, float f14, float f15, boolean z11) {
        float f16;
        float fMin = Math.min(f11, this.f15041g);
        float f17 = (-f5) / 2.0f;
        float f18 = (-fMin) / 2.0f;
        float f19 = f5 / 2.0f;
        float f21 = fMin / 2.0f;
        RectF rectF = new RectF(f17, f18, f19, f21);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pathPoint2 != null) {
            float[] fArr = pathPoint2.f15036b;
            float[] fArr2 = pathPoint2.f15035a;
            float fMin2 = Math.min(f14, this.f15041g);
            float fMin3 = Math.min(f13 / 2.0f, (f15 * fMin2) / this.f15041g);
            RectF rectF2 = new RectF();
            if (z11) {
                float f22 = (fArr2[0] - fMin3) - (pathPoint.f15035a[0] - f12);
                if (f22 > CropImageView.DEFAULT_ASPECT_RATIO) {
                    pathPoint2.f((-f22) / 2.0f);
                    f16 = f13 + f22;
                } else {
                    f16 = f13;
                }
                rectF2.set(CropImageView.DEFAULT_ASPECT_RATIO, f18, f19, f21);
            } else {
                float f23 = (fArr2[0] + fMin3) - (pathPoint.f15035a[0] + f12);
                if (f23 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    pathPoint2.f((-f23) / 2.0f);
                    f16 = f13 - f23;
                } else {
                    f16 = f13;
                }
                rectF2.set(f17, f18, CropImageView.DEFAULT_ASPECT_RATIO, f21);
            }
            RectF rectF3 = new RectF((-f16) / 2.0f, (-fMin2) / 2.0f, f16 / 2.0f, fMin2 / 2.0f);
            canvas.translate(fArr2[0], fArr2[1]);
            canvas.rotate(DrawingDelegate.h(fArr));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-DrawingDelegate.h(fArr));
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = pathPoint.f15035a;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(DrawingDelegate.h(pathPoint.f15036b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f12, f12, paint);
        } else {
            float[] fArr4 = pathPoint.f15035a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(DrawingDelegate.h(pathPoint.f15036b));
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        canvas.restore();
    }
}
