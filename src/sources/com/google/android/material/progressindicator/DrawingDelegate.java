package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseProgressIndicatorSpec f15022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f15023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f15024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PathMeasure f15025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix f15026e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ActiveIndicator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f15027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f15028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f15031e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f15032f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f15033g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f15034h;
    }

    public DrawingDelegate(BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        Path path = new Path();
        this.f15023b = path;
        this.f15024c = new Path();
        this.f15025d = new PathMeasure(path, false);
        this.f15022a = baseProgressIndicatorSpec;
        this.f15026e = new Matrix();
    }

    public static float h(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public abstract void a(Canvas canvas, Rect rect, float f5, boolean z11, boolean z12);

    public abstract void b(int i11, int i12, Canvas canvas, Paint paint);

    public abstract void c(Canvas canvas, Paint paint, ActiveIndicator activeIndicator, int i11);

    public abstract void d(Canvas canvas, Paint paint, float f5, float f11, int i11, int i12, int i13);

    public abstract int e();

    public abstract int f();

    public abstract void g();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class PathPoint {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float[] f15035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f15036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Matrix f15037c;

        public PathPoint() {
            this.f15035a = new float[2];
            this.f15036b = new float[]{1.0f, 0.0f};
            this.f15037c = new Matrix();
        }

        public final void a(float f5) {
            float[] fArr = this.f15036b;
            float fAtan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
            float[] fArr2 = this.f15035a;
            double d5 = f5;
            double d11 = fAtan2;
            fArr2[0] = (float) ((Math.cos(d11) * d5) + ((double) fArr2[0]));
            fArr2[1] = (float) ((Math.sin(d11) * d5) + ((double) fArr2[1]));
        }

        public final void b(float f5) {
            float[] fArr = this.f15036b;
            float fAtan2 = (float) Math.atan2(fArr[1], fArr[0]);
            float[] fArr2 = this.f15035a;
            double d5 = f5;
            double d11 = fAtan2;
            fArr2[0] = (float) ((Math.cos(d11) * d5) + ((double) fArr2[0]));
            fArr2[1] = (float) ((Math.sin(d11) * d5) + ((double) fArr2[1]));
        }

        public final void c() {
            Arrays.fill(this.f15035a, CropImageView.DEFAULT_ASPECT_RATIO);
            float[] fArr = this.f15036b;
            Arrays.fill(fArr, CropImageView.DEFAULT_ASPECT_RATIO);
            fArr[0] = 1.0f;
            this.f15037c.reset();
        }

        public final void d(float f5) {
            Matrix matrix = this.f15037c;
            matrix.reset();
            matrix.setRotate(f5);
            matrix.mapPoints(this.f15035a);
            matrix.mapPoints(this.f15036b);
        }

        public final void e(float f5) {
            float[] fArr = this.f15035a;
            fArr[0] = fArr[0] * 1.0f;
            fArr[1] = fArr[1] * f5;
            float[] fArr2 = this.f15036b;
            fArr2[0] = fArr2[0] * 1.0f;
            fArr2[1] = fArr2[1] * f5;
        }

        public final void f(float f5) {
            float[] fArr = this.f15035a;
            fArr[0] = fArr[0] + f5;
            fArr[1] = fArr[1] + CropImageView.DEFAULT_ASPECT_RATIO;
        }

        public PathPoint(float[] fArr, float[] fArr2) {
            float[] fArr3 = new float[2];
            this.f15035a = fArr3;
            float[] fArr4 = new float[2];
            this.f15036b = fArr4;
            System.arraycopy(fArr, 0, fArr3, 0, 2);
            System.arraycopy(fArr2, 0, fArr4, 0, 2);
            this.f15037c = new Matrix();
        }
    }
}
