package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1.c3 f30604a = new l1.c3(t1.O);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l1.d0 f30605b = new l1.d0(t1.N);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m7 f30606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m7 f30607d;

    static {
        long j11 = g2.x.f28622i;
        f30606c = new m7(Float.NaN, j11, true);
        f30607d = new m7(Float.NaN, j11, false);
    }

    public static final d0.z0 a(boolean z11, float f5, long j11, l1.n nVar, int i11, int i12) {
        d0.z0 m7Var;
        boolean z12 = true;
        if ((i12 & 1) != 0) {
            z11 = true;
        }
        if ((i12 & 2) != 0) {
            f5 = Float.NaN;
        }
        if ((i12 & 4) != 0) {
            j11 = g2.x.f28622i;
        }
        l1.s sVar = (l1.s) nVar;
        sVar.d0(-1280632857);
        if (((Boolean) sVar.j(f30604a)).booleanValue()) {
            b0.i2 i2Var = g1.h.f28524a;
            l1.b1 b1VarH = l1.t.H(new g2.x(j11), sVar);
            boolean z13 = (((i11 & 14) ^ 6) > 4 && sVar.g(z11)) || (i11 & 6) == 4;
            if ((((i11 & 112) ^ 48) <= 32 || !sVar.c(f5)) && (i11 & 48) != 32) {
                z12 = false;
            }
            boolean z14 = z13 | z12;
            Object objQ = sVar.Q();
            if (z14 || objQ == l1.m.f39353a) {
                objQ = new g1.d(z11, f5, b1VarH);
                sVar.o0(objQ);
            }
            m7Var = (g1.d) objQ;
        } else if (v3.f.b(f5, Float.NaN) && g2.x.d(j11, g2.x.f28622i)) {
            m7Var = z11 ? f30606c : f30607d;
        } else {
            m7Var = new m7(f5, j11, z11);
        }
        sVar.p(false);
        return m7Var;
    }
}
