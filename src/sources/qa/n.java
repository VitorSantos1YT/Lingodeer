package qa;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends ns.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f47649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f47650d;

    public n(Path path) {
        Path path2 = new Path();
        this.f47649c = path2;
        Matrix matrix = new Matrix();
        this.f47650d = matrix;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f5 = fArr[0];
        float f11 = fArr[1];
        pathMeasure.getPosTan(CropImageView.DEFAULT_ASPECT_RATIO, fArr, null);
        float f12 = fArr[0];
        float f13 = fArr[1];
        if (f12 == f5 && f13 == f11) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        matrix.setTranslate(-f12, -f13);
        float f14 = f5 - f12;
        float f15 = f11 - f13;
        float fSqrt = 1.0f / ((float) Math.sqrt((f15 * f15) + (f14 * f14)));
        matrix.postScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f15, f14)));
        path.transform(matrix, path2);
    }

    @Override // ns.o
    public final Path B(float f5, float f11, float f12, float f13) {
        float f14 = f12 - f5;
        float f15 = f13 - f11;
        float fSqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
        double dAtan2 = Math.atan2(f15, f14);
        Matrix matrix = this.f47650d;
        matrix.setScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(dAtan2));
        matrix.postTranslate(f5, f11);
        Path path = new Path();
        this.f47649c.transform(matrix, path);
        return path;
    }
}
