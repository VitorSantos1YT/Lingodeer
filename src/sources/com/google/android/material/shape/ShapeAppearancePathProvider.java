package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ShapeAppearancePathProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShapePath[] f15269a = new ShapePath[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix[] f15270b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix[] f15271c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointF f15272d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f15273e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f15274f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ShapePath f15275g = new ShapePath();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f15276h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f15277i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f15278j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f15279k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f15280l = true;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Lazy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShapeAppearancePathProvider f15281a = new ShapeAppearancePathProvider();

        private Lazy() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface PathListener {
        void a(ShapePath shapePath, Matrix matrix, int i11);

        void b(ShapePath shapePath, Matrix matrix, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ShapeAppearancePathSpec {
    }

    public ShapeAppearancePathProvider() {
        for (int i11 = 0; i11 < 4; i11++) {
            this.f15269a[i11] = new ShapePath();
            this.f15270b[i11] = new Matrix();
            this.f15271c[i11] = new Matrix();
        }
    }

    public static ShapeAppearancePathProvider c() {
        return Lazy.f15281a;
    }

    public final void a(ShapeAppearanceModel shapeAppearanceModel, RectF rectF, Path path) {
        b(shapeAppearanceModel, null, 1.0f, rectF, null, path);
    }

    public final void b(ShapeAppearanceModel shapeAppearanceModel, float[] fArr, float f5, RectF rectF, PathListener pathListener, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i11;
        ShapePath[] shapePathArr;
        Matrix[] matrixArr2;
        EdgeTreatment edgeTreatment;
        CornerSize clampedCornerSize;
        CornerTreatment cornerTreatment;
        path.rewind();
        Path path2 = this.f15273e;
        path2.rewind();
        Path path3 = this.f15274f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i12 = 0;
        while (true) {
            matrixArr = this.f15271c;
            fArr2 = this.f15276h;
            shapePathArr = this.f15269a;
            matrixArr2 = this.f15270b;
            if (i12 >= 4) {
                break;
            }
            if (fArr != null) {
                clampedCornerSize = new ClampedCornerSize(fArr[i12]);
            } else if (i12 == 1) {
                clampedCornerSize = shapeAppearanceModel.f15251g;
            } else if (i12 != 2) {
                clampedCornerSize = i12 != 3 ? shapeAppearanceModel.f15250f : shapeAppearanceModel.f15249e;
            } else {
                clampedCornerSize = shapeAppearanceModel.f15252h;
            }
            if (i12 == 1) {
                cornerTreatment = shapeAppearanceModel.f15247c;
            } else if (i12 != 2) {
                cornerTreatment = i12 != 3 ? shapeAppearanceModel.f15246b : shapeAppearanceModel.f15245a;
            } else {
                cornerTreatment = shapeAppearanceModel.f15248d;
            }
            ShapePath shapePath = shapePathArr[i12];
            cornerTreatment.getClass();
            cornerTreatment.a(shapePath, f5, clampedCornerSize.a(rectF));
            int i13 = i12 + 1;
            float f11 = (i13 % 4) * 90;
            matrixArr2[i12].reset();
            PointF pointF = this.f15272d;
            if (i12 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i12 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i12 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i12].setTranslate(pointF.x, pointF.y);
            matrixArr2[i12].preRotate(f11);
            ShapePath shapePath2 = shapePathArr[i12];
            fArr2[0] = shapePath2.f15284c;
            fArr2[1] = shapePath2.f15285d;
            matrixArr2[i12].mapPoints(fArr2);
            matrixArr[i12].reset();
            matrixArr[i12].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i12].preRotate(f11);
            i12 = i13;
        }
        char c11 = 1;
        int i14 = 0;
        for (i11 = 4; i14 < i11; i11 = 4) {
            ShapePath shapePath3 = shapePathArr[i14];
            fArr2[0] = shapePath3.f15282a;
            fArr2[c11] = shapePath3.f15283b;
            matrixArr2[i14].mapPoints(fArr2);
            if (i14 == 0) {
                path.moveTo(fArr2[0], fArr2[c11]);
            } else {
                path.lineTo(fArr2[0], fArr2[c11]);
            }
            shapePathArr[i14].c(matrixArr2[i14], path);
            if (pathListener != null) {
                pathListener.a(shapePathArr[i14], matrixArr2[i14], i14);
            }
            int i15 = i14 + 1;
            int i16 = i15 % 4;
            ShapePath shapePath4 = shapePathArr[i14];
            fArr2[0] = shapePath4.f15284c;
            fArr2[1] = shapePath4.f15285d;
            matrixArr2[i14].mapPoints(fArr2);
            ShapePath shapePath5 = shapePathArr[i16];
            float f12 = shapePath5.f15282a;
            float[] fArr3 = this.f15277i;
            fArr3[0] = f12;
            fArr3[1] = shapePath5.f15283b;
            matrixArr2[i16].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            double d5 = fArr2[0] - fArr3[0];
            float f13 = fArr2[1] - fArr3[1];
            ShapePath[] shapePathArr2 = shapePathArr;
            float fMax = Math.max(((float) Math.hypot(d5, f13)) - 0.001f, CropImageView.DEFAULT_ASPECT_RATIO);
            ShapePath shapePath6 = shapePathArr2[i14];
            fArr2[0] = shapePath6.f15284c;
            fArr2[1] = shapePath6.f15285d;
            matrixArr2[i14].mapPoints(fArr2);
            float fAbs = (i14 == 1 || i14 == 3) ? Math.abs(rectF.centerX() - fArr2[0]) : Math.abs(rectF.centerY() - fArr2[1]);
            ShapePath shapePath7 = this.f15275g;
            shapePath7.f(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 270.0f, CropImageView.DEFAULT_ASPECT_RATIO);
            if (i14 == 1) {
                edgeTreatment = shapeAppearanceModel.f15255k;
            } else if (i14 != 2) {
                edgeTreatment = i14 != 3 ? shapeAppearanceModel.f15254j : shapeAppearanceModel.f15253i;
            } else {
                edgeTreatment = shapeAppearanceModel.f15256l;
            }
            edgeTreatment.c(fMax, fAbs, f5, shapePath7);
            Path path4 = this.f15278j;
            path4.reset();
            shapePath7.c(matrixArr3[i14], path4);
            if (this.f15280l && (edgeTreatment.a() || d(path4, i14) || d(path4, i16))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = shapePath7.f15282a;
                c11 = 1;
                fArr2[1] = shapePath7.f15283b;
                matrixArr3[i14].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                shapePath7.c(matrixArr3[i14], path2);
            } else {
                c11 = 1;
                shapePath7.c(matrixArr3[i14], path);
            }
            if (pathListener != null) {
                pathListener.b(shapePath7, matrixArr3[i14], i14);
            }
            i14 = i15;
            shapePathArr = shapePathArr2;
            matrixArr = matrixArr3;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean d(Path path, int i11) {
        Path path2 = this.f15279k;
        path2.reset();
        this.f15269a[i11].c(this.f15270b[i11], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
