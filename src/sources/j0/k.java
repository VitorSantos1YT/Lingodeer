package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends z1.q implements y2.z {
    public float Q;

    @Override // y2.z
    public final int E(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        return i11 != Integer.MAX_VALUE ? Math.round(i11 * this.Q) : p0Var.p(i11);
    }

    @Override // y2.z
    public final int L(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        return i11 != Integer.MAX_VALUE ? Math.round(i11 * this.Q) : p0Var.t(i11);
    }

    public final long T0(long j11, boolean z11) {
        int iRound;
        int iG = v3.a.g(j11);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.Q)) <= 0) {
            return 0L;
        }
        if (!z11 || c.s(j11, iRound, iG)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    public final long U0(long j11, boolean z11) {
        int iRound;
        int iH = v3.a.h(j11);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.Q)) <= 0) {
            return 0L;
        }
        if (!z11 || c.s(j11, iH, iRound)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long V0(long j11, boolean z11) {
        int i11 = v3.a.i(j11);
        int iRound = Math.round(i11 * this.Q);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z11 || c.s(j11, iRound, i11)) {
            return (((long) iRound) << 32) | (((long) i11) & 4294967295L);
        }
        return 0L;
    }

    public final long W0(long j11, boolean z11) {
        int iJ = v3.a.j(j11);
        int iRound = Math.round(iJ / this.Q);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z11 || c.s(j11, iJ, iRound)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        long jU0 = U0(j11, true);
        if (v3.l.a(jU0, 0L)) {
            jU0 = T0(j11, true);
            if (v3.l.a(jU0, 0L)) {
                jU0 = W0(j11, true);
                if (v3.l.a(jU0, 0L)) {
                    jU0 = V0(j11, true);
                    if (v3.l.a(jU0, 0L)) {
                        jU0 = U0(j11, false);
                        if (v3.l.a(jU0, 0L)) {
                            jU0 = T0(j11, false);
                            if (v3.l.a(jU0, 0L)) {
                                jU0 = W0(j11, false);
                                if (v3.l.a(jU0, 0L)) {
                                    jU0 = V0(j11, false);
                                    if (v3.l.a(jU0, 0L)) {
                                        jU0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!v3.l.a(jU0, 0L)) {
            int i11 = (int) (jU0 >> 32);
            int i12 = (int) (jU0 & 4294967295L);
            if (!((i12 >= 0) & (i11 >= 0))) {
                v3.i.a("width and height must be >= 0");
            }
            j11 = v3.b.h(i11, i11, i12, i12);
        }
        w2.g1 g1VarB = p0Var.B(j11);
        return s0Var.q0(g1VarB.f54501a, g1VarB.f54502b, ry.s.f50855a, new c1.i(g1VarB, 2));
    }

    @Override // y2.z
    public final int p(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        return i11 != Integer.MAX_VALUE ? Math.round(i11 / this.Q) : p0Var.W(i11);
    }

    @Override // y2.z
    public final int t(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        return i11 != Integer.MAX_VALUE ? Math.round(i11 / this.Q) : p0Var.b(i11);
    }
}
