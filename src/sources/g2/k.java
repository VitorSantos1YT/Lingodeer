package g2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f28575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f28576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f28577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f28578d;

    public k(Path path) {
        this.f28575a = path;
    }

    public final void d() {
        this.f28575a.close();
    }

    public final f2.c e() {
        if (this.f28576b == null) {
            this.f28576b = new RectF();
        }
        RectF rectF = this.f28576b;
        kotlin.jvm.internal.m.c(rectF);
        this.f28575a.computeBounds(rectF, true);
        return new f2.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void f(float f5, float f11) {
        this.f28575a.lineTo(f5, f11);
    }

    public final void g(float f5, float f11) {
        this.f28575a.moveTo(f5, f11);
    }

    public final boolean h(p0 p0Var, p0 p0Var2, int i11) {
        Path.Op op2;
        if (i11 == 0) {
            op2 = Path.Op.DIFFERENCE;
        } else if (i11 == 1) {
            op2 = Path.Op.INTERSECT;
        } else if (i11 == 4) {
            op2 = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op2 = i11 == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(p0Var instanceof k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((k) p0Var).f28575a;
        if (p0Var2 instanceof k) {
            return this.f28575a.op(path, ((k) p0Var2).f28575a, op2);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void i(float f5, float f11, float f12, float f13) {
        this.f28575a.quadTo(f5, f11, f12, f13);
    }

    public final void j() {
        this.f28575a.reset();
    }

    public final void k(int i11) {
        this.f28575a.setFillType(i11 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void l(float[] fArr) {
        if (this.f28578d == null) {
            this.f28578d = new Matrix();
        }
        Matrix matrix = this.f28578d;
        kotlin.jvm.internal.m.c(matrix);
        f0.y(matrix, fArr);
        Matrix matrix2 = this.f28578d;
        kotlin.jvm.internal.m.c(matrix2);
        this.f28575a.transform(matrix2);
    }

    public final void m(long j11) {
        Matrix matrix = this.f28578d;
        if (matrix == null) {
            this.f28578d = new Matrix();
        } else {
            kotlin.jvm.internal.m.c(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f28578d;
        kotlin.jvm.internal.m.c(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
        Matrix matrix3 = this.f28578d;
        kotlin.jvm.internal.m.c(matrix3);
        this.f28575a.transform(matrix3);
    }
}
