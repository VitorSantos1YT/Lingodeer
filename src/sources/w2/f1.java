package w2;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1 implements v3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f54492a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(f1 f1Var, g1 g1Var) {
        f1Var.getClass();
        if (g1Var instanceof y2.e1) {
            ((y2.e1) g1Var).J(f1Var.f54492a);
        }
    }

    public static void i(f1 f1Var, g1 g1Var, long j11) {
        f1Var.getClass();
        a(f1Var, g1Var);
        g1Var.i0(v3.j.e(j11, g1Var.f54505e), CropImageView.DEFAULT_ASPECT_RATIO, null);
    }

    public static void k(f1 f1Var, g1 g1Var, int i11, int i12) {
        long j11 = (((long) i11) << 32) | (((long) i12) & 4294967295L);
        if (f1Var.c() == v3.m.Ltr || f1Var.e() == 0) {
            a(f1Var, g1Var);
            g1Var.i0(v3.j.e(j11, g1Var.f54505e), CropImageView.DEFAULT_ASPECT_RATIO, null);
        } else {
            int iE = (f1Var.e() - g1Var.f54501a) - ((int) (j11 >> 32));
            a(f1Var, g1Var);
            g1Var.i0(v3.j.e((((long) iE) << 32) | (((long) ((int) (j11 & 4294967295L))) & 4294967295L), g1Var.f54505e), CropImageView.DEFAULT_ASPECT_RATIO, null);
        }
    }

    public static void l(f1 f1Var, g1 g1Var, int i11, int i12, iv.m mVar, int i13) {
        fz.c cVar = mVar;
        if ((i13 & 8) != 0) {
            int i14 = i1.f54527b;
            cVar = h1.f54511b;
        }
        long j11 = (((long) i11) << 32) | (((long) i12) & 4294967295L);
        if (f1Var.c() == v3.m.Ltr || f1Var.e() == 0) {
            a(f1Var, g1Var);
            g1Var.i0(v3.j.e(j11, g1Var.f54505e), CropImageView.DEFAULT_ASPECT_RATIO, cVar);
        } else {
            a(f1Var, g1Var);
            g1Var.i0(v3.j.e((((long) ((f1Var.e() - g1Var.f54501a) - ((int) (j11 >> 32)))) << 32) | (((long) ((int) (j11 & 4294967295L))) & 4294967295L), g1Var.f54505e), CropImageView.DEFAULT_ASPECT_RATIO, cVar);
        }
    }

    public static void m(f1 f1Var, g1 g1Var, long j11) {
        int i11 = i1.f54527b;
        h1 h1Var = h1.f54511b;
        if (f1Var.c() == v3.m.Ltr || f1Var.e() == 0) {
            a(f1Var, g1Var);
            g1Var.i0(v3.j.e(j11, g1Var.f54505e), CropImageView.DEFAULT_ASPECT_RATIO, h1Var);
        } else {
            int iE = (f1Var.e() - g1Var.f54501a) - ((int) (j11 >> 32));
            a(f1Var, g1Var);
            g1Var.i0(v3.j.e((((long) ((int) (j11 & 4294967295L))) & 4294967295L) | (((long) iE) << 32), g1Var.f54505e), CropImageView.DEFAULT_ASPECT_RATIO, h1Var);
        }
    }

    public static void p(f1 f1Var, g1 g1Var, int i11, int i12, fz.c cVar, int i13) {
        if ((i13 & 8) != 0) {
            int i14 = i1.f54527b;
            cVar = h1.f54511b;
        }
        f1Var.getClass();
        a(f1Var, g1Var);
        g1Var.i0(v3.j.e((((long) i12) & 4294967295L) | (((long) i11) << 32), g1Var.f54505e), CropImageView.DEFAULT_ASPECT_RATIO, cVar);
    }

    public static void q(f1 f1Var, g1 g1Var, long j11) {
        int i11 = i1.f54527b;
        h1 h1Var = h1.f54511b;
        f1Var.getClass();
        a(f1Var, g1Var);
        g1Var.i0(v3.j.e(j11, g1Var.f54505e), CropImageView.DEFAULT_ASPECT_RATIO, h1Var);
    }

    public float b(p pVar) {
        return Float.NaN;
    }

    public abstract v3.m c();

    public abstract int e();

    public final void f(g1 g1Var, int i11, int i12, float f5) {
        a(this, g1Var);
        g1Var.i0(v3.j.e((((long) i12) & 4294967295L) | (((long) i11) << 32), g1Var.f54505e), f5, null);
    }
}
