package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.shadow.ShadowRenderer;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ShapePath {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f15282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f15283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f15287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f15288g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f15289h = new ArrayList();

    /* JADX INFO: renamed from: com.google.android.material.shape.ShapePath$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends ShadowCompatOperation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Matrix f15291d;

        public AnonymousClass1(ArrayList arrayList, Matrix matrix) {
            this.f15290c = arrayList;
            this.f15291d = matrix;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public final void a(Matrix matrix, ShadowRenderer shadowRenderer, int i11, Canvas canvas) {
            ArrayList arrayList = this.f15290c;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                ((ShadowCompatOperation) obj).a(this.f15291d, shadowRenderer, i11, canvas);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ArcShadowOperation extends ShadowCompatOperation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PathArcOperation f15292c;

        public ArcShadowOperation(PathArcOperation pathArcOperation) {
            this.f15292c = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public final void a(Matrix matrix, ShadowRenderer shadowRenderer, int i11, Canvas canvas) {
            PathArcOperation pathArcOperation = this.f15292c;
            shadowRenderer.a(canvas, matrix, new RectF(pathArcOperation.f15301b, pathArcOperation.f15302c, pathArcOperation.f15303d, pathArcOperation.f15304e), i11, pathArcOperation.f15305f, pathArcOperation.f15306g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class InnerCornerShadowOperation extends ShadowCompatOperation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PathLineOperation f15293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final PathLineOperation f15294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f15295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f15296f;

        public InnerCornerShadowOperation(PathLineOperation pathLineOperation, PathLineOperation pathLineOperation2, float f5, float f11) {
            this.f15293c = pathLineOperation;
            this.f15294d = pathLineOperation2;
            this.f15295e = f5;
            this.f15296f = f11;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public final void a(Matrix matrix, ShadowRenderer shadowRenderer, int i11, Canvas canvas) {
            float f5;
            float f11;
            float f12;
            float fB = ((b() - c()) + 360.0f) % 360.0f;
            if (fB > 180.0f) {
                fB -= 360.0f;
            }
            if (fB > CropImageView.DEFAULT_ASPECT_RATIO) {
                return;
            }
            PathLineOperation pathLineOperation = this.f15293c;
            float f13 = pathLineOperation.f15307b;
            float f14 = this.f15295e;
            double d5 = f13 - f14;
            float f15 = pathLineOperation.f15308c;
            float f16 = this.f15296f;
            double dHypot = Math.hypot(d5, f15 - f16);
            PathLineOperation pathLineOperation2 = this.f15294d;
            double dHypot2 = Math.hypot(pathLineOperation2.f15307b - pathLineOperation.f15307b, pathLineOperation2.f15308c - pathLineOperation.f15308c);
            float fMin = (float) Math.min(i11, Math.min(dHypot, dHypot2));
            double d11 = fMin;
            float f17 = -fB;
            float f18 = fB;
            double dTan = Math.tan(Math.toRadians(f17 / 2.0f)) * d11;
            Matrix matrix2 = this.f15311a;
            if (dHypot > dTan) {
                f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                RectF rectF = new RectF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (float) (dHypot - dTan), CropImageView.DEFAULT_ASPECT_RATIO);
                matrix2.set(matrix);
                matrix2.preTranslate(f14, f16);
                matrix2.preRotate(c());
                shadowRenderer.b(canvas, matrix2, rectF, i11);
            } else {
                f5 = CropImageView.DEFAULT_ASPECT_RATIO;
            }
            float f19 = fMin * 2.0f;
            RectF rectF2 = new RectF(f5, f5, f19, f19);
            matrix2.set(matrix);
            matrix2.preTranslate(pathLineOperation.f15307b, pathLineOperation.f15308c);
            matrix2.preRotate(c());
            matrix2.preTranslate((float) ((-dTan) - d11), (-2.0f) * fMin);
            int i12 = (int) fMin;
            float[] fArr = {(float) (d11 + dTan), f19};
            shadowRenderer.getClass();
            if (fB > CropImageView.DEFAULT_ASPECT_RATIO) {
                f11 = f17;
                f12 = 450.0f + f18;
            } else {
                f11 = f18;
                f12 = 450.0f;
            }
            shadowRenderer.a(canvas, matrix2, rectF2, i12, f12, f11);
            Path path = shadowRenderer.f15188g;
            path.rewind();
            path.moveTo(fArr[0], fArr[1]);
            path.arcTo(rectF2, f12, f11);
            path.close();
            canvas.save();
            canvas.concat(matrix2);
            canvas.scale(1.0f, rectF2.height() / rectF2.width());
            canvas.drawPath(path, shadowRenderer.f15189h);
            canvas.drawPath(path, shadowRenderer.f15182a);
            canvas.restore();
            if (dHypot2 > dTan) {
                RectF rectF3 = new RectF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (float) (dHypot2 - dTan), CropImageView.DEFAULT_ASPECT_RATIO);
                matrix2.set(matrix);
                matrix2.preTranslate(pathLineOperation.f15307b, pathLineOperation.f15308c);
                matrix2.preRotate(b());
                matrix2.preTranslate((float) dTan, CropImageView.DEFAULT_ASPECT_RATIO);
                shadowRenderer.b(canvas, matrix2, rectF3, i11);
            }
        }

        public final float b() {
            PathLineOperation pathLineOperation = this.f15294d;
            float f5 = pathLineOperation.f15308c;
            PathLineOperation pathLineOperation2 = this.f15293c;
            return (float) Math.toDegrees(Math.atan((f5 - pathLineOperation2.f15308c) / (pathLineOperation.f15307b - pathLineOperation2.f15307b)));
        }

        public final float c() {
            PathLineOperation pathLineOperation = this.f15293c;
            return (float) Math.toDegrees(Math.atan((pathLineOperation.f15308c - this.f15296f) / (pathLineOperation.f15307b - this.f15295e)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class LineShadowOperation extends ShadowCompatOperation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PathLineOperation f15297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f15298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f15299e;

        public LineShadowOperation(PathLineOperation pathLineOperation, float f5, float f11) {
            this.f15297c = pathLineOperation;
            this.f15298d = f5;
            this.f15299e = f11;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public final void a(Matrix matrix, ShadowRenderer shadowRenderer, int i11, Canvas canvas) {
            PathLineOperation pathLineOperation = this.f15297c;
            float f5 = pathLineOperation.f15308c;
            float f11 = this.f15299e;
            float f12 = pathLineOperation.f15307b;
            float f13 = this.f15298d;
            RectF rectF = new RectF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (float) Math.hypot(f5 - f11, f12 - f13), CropImageView.DEFAULT_ASPECT_RATIO);
            Matrix matrix2 = this.f15311a;
            matrix2.set(matrix);
            matrix2.preTranslate(f13, f11);
            matrix2.preRotate(b());
            shadowRenderer.b(canvas, matrix2, rectF, i11);
        }

        public final float b() {
            PathLineOperation pathLineOperation = this.f15297c;
            return (float) Math.toDegrees(Math.atan((pathLineOperation.f15308c - this.f15299e) / (pathLineOperation.f15307b - this.f15298d)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class PathArcOperation extends PathOperation {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final RectF f15300h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f15301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f15302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f15303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f15304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f15305f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f15306g;

        public PathArcOperation(float f5, float f11, float f12, float f13) {
            this.f15301b = f5;
            this.f15302c = f11;
            this.f15303d = f12;
            this.f15304e = f13;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f15309a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            float f5 = this.f15303d;
            float f11 = this.f15304e;
            RectF rectF = f15300h;
            rectF.set(this.f15301b, this.f15302c, f5, f11);
            path.arcTo(rectF, this.f15305f, this.f15306g, false);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class PathCubicOperation extends PathOperation {
        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f15309a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class PathLineOperation extends PathOperation {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f15307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f15308c;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f15309a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f15307b, this.f15308c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class PathOperation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f15309a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class PathQuadOperation extends PathOperation {
        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f15309a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class ShadowCompatOperation {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Matrix f15310b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f15311a = new Matrix();

        public abstract void a(Matrix matrix, ShadowRenderer shadowRenderer, int i11, Canvas canvas);
    }

    public ShapePath() {
        f(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 270.0f, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public final void a(float f5, float f11, float f12, float f13, float f14, float f15) {
        PathArcOperation pathArcOperation = new PathArcOperation(f5, f11, f12, f13);
        pathArcOperation.f15305f = f14;
        pathArcOperation.f15306g = f15;
        this.f15288g.add(pathArcOperation);
        ArcShadowOperation arcShadowOperation = new ArcShadowOperation(pathArcOperation);
        float f16 = f14 + f15;
        boolean z11 = f15 < CropImageView.DEFAULT_ASPECT_RATIO;
        if (z11) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        float f17 = z11 ? (180.0f + f16) % 360.0f : f16;
        b(f14);
        this.f15289h.add(arcShadowOperation);
        this.f15286e = f17;
        double d5 = f16;
        this.f15284c = (((f12 - f5) / 2.0f) * ((float) Math.cos(Math.toRadians(d5)))) + ((f5 + f12) * 0.5f);
        this.f15285d = (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d5)))) + ((f11 + f13) * 0.5f);
    }

    public final void b(float f5) {
        float f11 = this.f15286e;
        if (f11 == f5) {
            return;
        }
        float f12 = ((f5 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f15284c;
        float f14 = this.f15285d;
        PathArcOperation pathArcOperation = new PathArcOperation(f13, f14, f13, f14);
        pathArcOperation.f15305f = this.f15286e;
        pathArcOperation.f15306g = f12;
        this.f15289h.add(new ArcShadowOperation(pathArcOperation));
        this.f15286e = f5;
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f15288g;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((PathOperation) arrayList.get(i11)).a(matrix, path);
        }
    }

    public final void d(float f5, float f11) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f15307b = f5;
        pathLineOperation.f15308c = f11;
        this.f15288g.add(pathLineOperation);
        LineShadowOperation lineShadowOperation = new LineShadowOperation(pathLineOperation, this.f15284c, this.f15285d);
        float fB = lineShadowOperation.b() + 270.0f;
        float fB2 = lineShadowOperation.b() + 270.0f;
        b(fB);
        this.f15289h.add(lineShadowOperation);
        this.f15286e = fB2;
        this.f15284c = f5;
        this.f15285d = f11;
    }

    public final void e(float f5, float f11, float f12) {
        if ((Math.abs(f5 - this.f15284c) < 0.001f && Math.abs(CropImageView.DEFAULT_ASPECT_RATIO - this.f15285d) < 0.001f) || (Math.abs(f5 - f11) < 0.001f && Math.abs(CropImageView.DEFAULT_ASPECT_RATIO - f12) < 0.001f)) {
            d(f11, f12);
            return;
        }
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f15307b = f5;
        pathLineOperation.f15308c = CropImageView.DEFAULT_ASPECT_RATIO;
        ArrayList arrayList = this.f15288g;
        arrayList.add(pathLineOperation);
        PathLineOperation pathLineOperation2 = new PathLineOperation();
        pathLineOperation2.f15307b = f11;
        pathLineOperation2.f15308c = f12;
        arrayList.add(pathLineOperation2);
        InnerCornerShadowOperation innerCornerShadowOperation = new InnerCornerShadowOperation(pathLineOperation, pathLineOperation2, this.f15284c, this.f15285d);
        float fB = ((innerCornerShadowOperation.b() - innerCornerShadowOperation.c()) + 360.0f) % 360.0f;
        if (fB > 180.0f) {
            fB -= 360.0f;
        }
        if (fB > CropImageView.DEFAULT_ASPECT_RATIO) {
            d(f5, CropImageView.DEFAULT_ASPECT_RATIO);
            d(f11, f12);
            return;
        }
        float fC = innerCornerShadowOperation.c() + 270.0f;
        float fB2 = innerCornerShadowOperation.b() + 270.0f;
        b(fC);
        this.f15289h.add(innerCornerShadowOperation);
        this.f15286e = fB2;
        this.f15284c = f11;
        this.f15285d = f12;
    }

    public final void f(float f5, float f11, float f12, float f13) {
        this.f15282a = f5;
        this.f15283b = f11;
        this.f15284c = f5;
        this.f15285d = f11;
        this.f15286e = f12;
        this.f15287f = (f12 + f13) % 360.0f;
        this.f15288g.clear();
        this.f15289h.clear();
    }
}
