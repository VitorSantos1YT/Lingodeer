package y6;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f57278a = new l0();

    static {
        b7.f0.G(0);
        b7.f0.G(1);
        b7.f0.G(2);
    }

    public int a(boolean z11) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z11) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i11, m0 m0Var, n0 n0Var, int i12, boolean z11) {
        int i13 = f(i11, m0Var, false).f57230c;
        if (m(i13, n0Var, 0L).f57251o != i11) {
            return i11 + 1;
        }
        int iE = e(i13, i12, z11);
        if (iE == -1) {
            return -1;
        }
        return m(iE, n0Var, 0L).f57250n;
    }

    public int e(int i11, int i12, boolean z11) {
        if (i12 == 0) {
            if (i11 == c(z11)) {
                return -1;
            }
            return i11 + 1;
        }
        if (i12 == 1) {
            return i11;
        }
        if (i12 == 2) {
            return i11 == c(z11) ? a(z11) : i11 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                if (o0Var.o() == o() && o0Var.h() == h()) {
                    n0 n0Var = new n0();
                    m0 m0Var = new m0();
                    n0 n0Var2 = new n0();
                    m0 m0Var2 = new m0();
                    for (int i11 = 0; i11 < o(); i11++) {
                        if (m(i11, n0Var, 0L).equals(o0Var.m(i11, n0Var2, 0L))) {
                        }
                    }
                    for (int i12 = 0; i12 < h(); i12++) {
                        if (f(i12, m0Var, true).equals(o0Var.f(i12, m0Var2, true))) {
                        }
                    }
                    int iA = a(true);
                    if (iA == o0Var.a(true) && (iC = c(true)) == o0Var.c(true)) {
                        while (iA != iC) {
                            int iE = e(iA, 0, true);
                            if (iE == o0Var.e(iA, 0, true)) {
                                iA = iE;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract m0 f(int i11, m0 m0Var, boolean z11);

    public m0 g(Object obj, m0 m0Var) {
        return f(b(obj), m0Var, true);
    }

    public abstract int h();

    public int hashCode() {
        n0 n0Var = new n0();
        m0 m0Var = new m0();
        int iO = o() + 217;
        for (int i11 = 0; i11 < o(); i11++) {
            iO = (iO * 31) + m(i11, n0Var, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i12 = 0; i12 < h(); i12++) {
            iH = (iH * 31) + f(i12, m0Var, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(n0 n0Var, m0 m0Var, int i11, long j11) {
        Pair pairJ = j(n0Var, m0Var, i11, j11, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(n0 n0Var, m0 m0Var, int i11, long j11, long j12) {
        b7.a.g(i11, o());
        m(i11, n0Var, j12);
        if (j11 == -9223372036854775807L) {
            j11 = n0Var.f57249l;
            if (j11 == -9223372036854775807L) {
                return null;
            }
        }
        int i12 = n0Var.f57250n;
        f(i12, m0Var, false);
        while (i12 < n0Var.f57251o && m0Var.f57232e != j11) {
            int i13 = i12 + 1;
            if (f(i13, m0Var, false).f57232e > j11) {
                break;
            }
            i12 = i13;
        }
        f(i12, m0Var, true);
        long jMin = j11 - m0Var.f57232e;
        long j13 = m0Var.f57231d;
        if (j13 != -9223372036854775807L) {
            jMin = Math.min(jMin, j13 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = m0Var.f57229b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i11, int i12, boolean z11) {
        if (i12 == 0) {
            if (i11 == a(z11)) {
                return -1;
            }
            return i11 - 1;
        }
        if (i12 == 1) {
            return i11;
        }
        if (i12 == 2) {
            return i11 == a(z11) ? c(z11) : i11 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i11);

    public abstract n0 m(int i11, n0 n0Var, long j11);

    public final void n(int i11, n0 n0Var) {
        m(i11, n0Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
