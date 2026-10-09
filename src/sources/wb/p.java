package wb;

import a0.b2;
import w2.a0;
import w2.g1;
import w2.k1;
import w2.p0;
import w2.r0;
import w2.s0;
import y2.k0;
import y2.q0;
import y2.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends z1.q implements y2.q, z {
    public i Q;
    public z1.e R;
    public w2.j S;
    public float T;

    @Override // y2.z
    public final int E(q0 q0Var, p0 p0Var, int i11) {
        if (this.Q.h() == 9205357640488583168L) {
            return p0Var.p(i11);
        }
        int iP = p0Var.p(v3.a.g(U0(v3.b.b(0, i11, 7))));
        return Math.max(hz.b.Q(f2.e.d(T0(com.bumptech.glide.g.b(iP, i11)))), iP);
    }

    @Override // z1.q
    public final boolean I0() {
        return false;
    }

    @Override // y2.z
    public final int L(q0 q0Var, p0 p0Var, int i11) {
        if (this.Q.h() == 9205357640488583168L) {
            return p0Var.t(i11);
        }
        int iT = p0Var.t(v3.a.g(U0(v3.b.b(0, i11, 7))));
        return Math.max(hz.b.Q(f2.e.d(T0(com.bumptech.glide.g.b(iT, i11)))), iT);
    }

    public final long T0(long j11) {
        if (f2.e.e(j11)) {
            return 0L;
        }
        long jH = this.Q.h();
        if (jH == 9205357640488583168L) {
            return j11;
        }
        float fD = f2.e.d(jH);
        if (Float.isInfinite(fD) || Float.isNaN(fD)) {
            fD = f2.e.d(j11);
        }
        float fB = f2.e.b(jH);
        if (Float.isInfinite(fB) || Float.isNaN(fB)) {
            fB = f2.e.b(j11);
        }
        long jB = com.bumptech.glide.g.b(fD, fB);
        long jA = this.S.a(jB, j11);
        int i11 = k1.f54535a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
        if (Float.isInfinite(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat)) {
            return j11;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jA));
        return (Float.isInfinite(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat2)) ? j11 : a0.p(jB, jA);
    }

    public final long U0(long j11) {
        float fJ;
        int i11;
        float fK;
        boolean zF = v3.a.f(j11);
        boolean zE = v3.a.e(j11);
        if (!zF || !zE) {
            boolean z11 = v3.a.d(j11) && v3.a.c(j11);
            long jH = this.Q.h();
            if (jH != 9205357640488583168L) {
                if (!z11 || (!zF && !zE)) {
                    float fD = f2.e.d(jH);
                    float fB = f2.e.b(jH);
                    if (Float.isInfinite(fD) || Float.isNaN(fD)) {
                        fJ = v3.a.j(j11);
                    } else {
                        hc.e eVar = t.f54932b;
                        fJ = hz.b.k(fD, v3.a.j(j11), v3.a.h(j11));
                    }
                    if (Float.isInfinite(fB) || Float.isNaN(fB)) {
                        i11 = v3.a.i(j11);
                    } else {
                        hc.e eVar2 = t.f54932b;
                        fK = hz.b.k(fB, v3.a.i(j11), v3.a.g(j11));
                    }
                    long jT0 = T0(com.bumptech.glide.g.b(fJ, fK));
                    return v3.a.a(v3.b.g(hz.b.Q(f2.e.d(jT0)), j11), 0, v3.b.f(hz.b.Q(f2.e.b(jT0)), j11), 0, 10, j11);
                }
                fJ = v3.a.h(j11);
                i11 = v3.a.g(j11);
                fK = i11;
                long jT1 = T0(com.bumptech.glide.g.b(fJ, fK));
                return v3.a.a(v3.b.g(hz.b.Q(f2.e.d(jT1)), j11), 0, v3.b.f(hz.b.Q(f2.e.b(jT1)), j11), 0, 10, j11);
            }
            if (z11) {
                return v3.a.a(v3.a.h(j11), 0, v3.a.g(j11), 0, 10, j11);
            }
        }
        return j11;
    }

    @Override // y2.z
    public final r0 b(s0 s0Var, p0 p0Var, long j11) {
        g1 g1VarB = p0Var.B(U0(j11));
        return s0Var.q0(g1VarB.f54501a, g1VarB.f54502b, ry.s.f50855a, new c1.i(g1VarB, 13));
    }

    @Override // y2.q
    public final void i(k0 k0Var) {
        i2.b bVar = k0Var.f56937a;
        long jT0 = T0(bVar.d());
        z1.e eVar = this.R;
        hc.e eVar2 = t.f54932b;
        long jB = ff.h.b(hz.b.Q(f2.e.d(jT0)), hz.b.Q(f2.e.b(jT0)));
        long jD = bVar.d();
        long jA = eVar.a(jB, ff.h.b(hz.b.Q(f2.e.d(jD)), hz.b.Q(f2.e.b(jD))), k0Var.getLayoutDirection());
        float f5 = (int) (jA >> 32);
        float f11 = (int) (jA & 4294967295L);
        ((b2) bVar.f34121b.f56174b).r(f5, f11);
        this.Q.g(k0Var, jT0, this.T, null);
        ((b2) bVar.f34121b.f56174b).r(-f5, -f11);
        k0Var.a();
    }

    @Override // y2.z
    public final int p(q0 q0Var, p0 p0Var, int i11) {
        if (this.Q.h() == 9205357640488583168L) {
            return p0Var.W(i11);
        }
        int iW = p0Var.W(v3.a.h(U0(v3.b.b(i11, 0, 13))));
        return Math.max(hz.b.Q(f2.e.b(T0(com.bumptech.glide.g.b(i11, iW)))), iW);
    }

    @Override // y2.z
    public final int t(q0 q0Var, p0 p0Var, int i11) {
        if (this.Q.h() == 9205357640488583168L) {
            return p0Var.b(i11);
        }
        int iB = p0Var.b(v3.a.h(U0(v3.b.b(i11, 0, 13))));
        return Math.max(hz.b.Q(f2.e.b(T0(com.bumptech.glide.g.b(i11, iB)))), iB);
    }
}
