package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0.v1 f30447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0.v1 f30448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f30449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f30450d;

    static {
        float f5 = 24;
        float f11 = 8;
        f30447a = new j0.v1(f5, f11, f5, f11);
        float f12 = 16;
        j0.c.e(f12, f11, f5, f11);
        float f13 = 12;
        f30448b = new j0.v1(f13, f11, f13, f11);
        j0.c.e(f13, f11, f12, f11);
        f30449c = 58;
        f30450d = 40;
        k1.c cVar = k1.l.f37602a;
    }

    public static i0 a(long j11, long j12, l1.n nVar, int i11) {
        if ((i11 & 1) != 0) {
            j11 = g2.x.f28622i;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = g2.x.f28622i;
        }
        long j14 = g2.x.f28622i;
        return c((s1) ((l1.s) nVar).j(v1.f31180a)).a(j13, j12, j14, j14);
    }

    public static n0 b(float f5, float f11, int i11) {
        if ((i11 & 1) != 0) {
            f5 = k1.l.f37603b;
        }
        float f12 = f5;
        if ((i11 & 2) != 0) {
            f11 = k1.l.f37611j;
        }
        return new n0(f12, f11, k1.l.f37608g, k1.l.f37609h, k1.l.f37606e);
    }

    public static i0 c(s1 s1Var) {
        i0 i0Var = s1Var.K;
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0(v1.c(s1Var, k1.l.f37602a), v1.c(s1Var, k1.l.f37610i), g2.x.c(v1.c(s1Var, k1.l.f37605d), 0.12f), g2.x.c(v1.c(s1Var, k1.l.f37607f), 0.38f));
        s1Var.K = i0Var2;
        return i0Var2;
    }

    public static i0 d(s1 s1Var) {
        i0 i0Var = s1Var.L;
        if (i0Var != null) {
            return i0Var;
        }
        long j11 = g2.x.f28621h;
        i0 i0Var2 = new i0(j11, v1.c(s1Var, k1.u.f37768c), j11, g2.x.c(v1.c(s1Var, k1.u.f37767b), 0.38f));
        s1Var.L = i0Var2;
        return i0Var2;
    }

    public static i0 e(s1 s1Var) {
        i0 i0Var = s1Var.M;
        if (i0Var != null) {
            return i0Var;
        }
        long j11 = g2.x.f28621h;
        i0 i0Var2 = new i0(j11, v1.c(s1Var, k1.i0.f37567c), j11, g2.x.c(v1.c(s1Var, k1.i0.f37566b), 0.38f));
        s1Var.M = i0Var2;
        return i0Var2;
    }

    public static i0 f(long j11, long j12, l1.n nVar, int i11) {
        if ((i11 & 1) != 0) {
            j11 = g2.x.f28622i;
        }
        long j13 = j11;
        long j14 = g2.x.f28622i;
        return d((s1) ((l1.s) nVar).j(v1.f31180a)).a(j13, j12, j14, j14);
    }

    public static i0 g(long j11, long j12, l1.n nVar, int i11) {
        if ((i11 & 1) != 0) {
            j11 = g2.x.f28622i;
        }
        long j13 = j11;
        long j14 = g2.x.f28622i;
        return e((s1) ((l1.s) nVar).j(v1.f31180a)).a(j13, j12, j14, j14);
    }
}
