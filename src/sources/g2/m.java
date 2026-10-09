package g2;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f28582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f28583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f28584c;

    public m(PathMeasure pathMeasure) {
        this.f28582a = pathMeasure;
    }

    public final long a(float f5) {
        if (this.f28583b == null) {
            this.f28583b = new float[2];
        }
        if (this.f28584c == null) {
            this.f28584c = new float[2];
        }
        if (!this.f28582a.getPosTan(f5, this.f28583b, this.f28584c)) {
            return 9205357640488583168L;
        }
        float[] fArr = this.f28583b;
        kotlin.jvm.internal.m.c(fArr);
        float f11 = fArr[0];
        float[] fArr2 = this.f28583b;
        kotlin.jvm.internal.m.c(fArr2);
        float f12 = fArr2[1];
        return (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L);
    }

    public final boolean b(float f5, float f11, p0 p0Var) {
        if (!(p0Var instanceof k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f28582a.getSegment(f5, f11, ((k) p0Var).f28575a, true);
    }

    public final void c(p0 p0Var) {
        Path path;
        if (p0Var == null) {
            path = null;
        } else {
            if (!(p0Var instanceof k)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            path = ((k) p0Var).f28575a;
        }
        this.f28582a.setPath(path, false);
    }
}
