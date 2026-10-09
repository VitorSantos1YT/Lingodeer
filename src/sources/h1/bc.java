package h1;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f30055a = k1.o0.f37677b;

    static {
        int i11 = k1.m0.f37623a;
        int i12 = k1.l0.f37612a;
    }

    public static ac a(long j11, long j12, long j13, long j14, l1.n nVar) {
        return b((s1) ((l1.s) nVar).j(v1.f31180a)).a(j11, g2.x.f28622i, j12, j13, j14);
    }

    public static ac b(s1 s1Var) {
        ac acVar = s1Var.R;
        if (acVar != null) {
            return acVar;
        }
        ac acVar2 = new ac(v1.c(s1Var, k1.n0.f37649a), v1.c(s1Var, k1.n0.f37652d), v1.c(s1Var, k1.n0.f37651c), v1.c(s1Var, k1.n0.f37650b), v1.c(s1Var, k1.n0.f37653e));
        s1Var.R = acVar2;
        return acVar2;
    }

    public static ac c(s1 s1Var) {
        ac acVar = s1Var.Q;
        if (acVar != null) {
            return acVar;
        }
        ac acVar2 = new ac(v1.c(s1Var, k1.o0.f37676a), v1.c(s1Var, k1.o0.f37681f), v1.c(s1Var, k1.o0.f37680e), v1.c(s1Var, k1.o0.f37678c), v1.c(s1Var, k1.o0.f37682g));
        s1Var.Q = acVar2;
        return acVar2;
    }

    public static j0.k1 d(l1.n nVar) {
        WeakHashMap weakHashMap = j0.o2.f35353v;
        return new j0.k1(j0.b.e(nVar).f35360g, j0.c.f35262i | 16);
    }

    public static ac e(l1.n nVar) {
        return c((s1) ((l1.s) nVar).j(v1.f31180a));
    }

    public static ac f(long j11, long j12, l1.n nVar, int i11) {
        long j13 = (i11 & 2) != 0 ? g2.x.f28622i : j12;
        long j14 = g2.x.f28622i;
        return c((s1) ((l1.s) nVar).j(v1.f31180a)).a(j11, j13, j14, j14, j14);
    }
}
