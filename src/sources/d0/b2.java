package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends z1.q implements y2.z, y2.b2 {
    public d2 Q;
    public boolean R;

    @Override // y2.z
    public final int E(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        if (this.R) {
            i11 = Integer.MAX_VALUE;
        }
        return p0Var.p(i11);
    }

    @Override // y2.z
    public final int L(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        if (this.R) {
            i11 = Integer.MAX_VALUE;
        }
        return p0Var.t(i11);
    }

    @Override // y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        n.l(j11, this.R ? f0.h1.Vertical : f0.h1.Horizontal);
        w2.g1 g1VarB = p0Var.B(v3.a.a(0, this.R ? v3.a.h(j11) : Integer.MAX_VALUE, 0, this.R ? Integer.MAX_VALUE : v3.a.g(j11), 5, j11));
        int i11 = g1VarB.f54501a;
        int iH = v3.a.h(j11);
        if (i11 > iH) {
            i11 = iH;
        }
        int i12 = g1VarB.f54502b;
        int iG = v3.a.g(j11);
        if (i12 > iG) {
            i12 = iG;
        }
        int i13 = g1VarB.f54502b - i12;
        int i14 = g1VarB.f54501a - i11;
        if (!this.R) {
            i13 = i14;
        }
        d2 d2Var = this.Q;
        l1.h1 h1Var = d2Var.f22662d;
        l1.h1 h1Var2 = d2Var.f22659a;
        h1Var.m(i13);
        x1.f fVarN = re.q.n();
        fz.c cVarE = fVarN != null ? fVarN.e() : null;
        x1.f fVarR = re.q.r(fVarN);
        try {
            if (h1Var2.l() > i13) {
                h1Var2.m(i13);
            }
            re.q.t(fVarN, fVarR, cVarE);
            this.Q.f22660b.m(this.R ? i12 : i11);
            return s0Var.q0(i11, i12, ry.s.f50855a, new au.k(this, i13, 1, g1VarB));
        } catch (Throwable th2) {
            re.q.t(fVarN, fVarR, cVarE);
            throw th2;
        }
    }

    @Override // y2.b2
    public final void i0(g3.b0 b0Var) {
        g3.z.f(b0Var);
        final int i11 = 0;
        final int i12 = 1;
        g3.l lVar = new g3.l(new fz.a(this) { // from class: d0.a2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b2 f22632b;

            {
                this.f22632b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                int iL;
                switch (i11) {
                    case 0:
                        iL = this.f22632b.Q.f22659a.l();
                        break;
                    default:
                        iL = this.f22632b.Q.f22662d.l();
                        break;
                }
                return Float.valueOf(iL);
            }
        }, new fz.a(this) { // from class: d0.a2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b2 f22632b;

            {
                this.f22632b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                int iL;
                switch (i12) {
                    case 0:
                        iL = this.f22632b.Q.f22659a.l();
                        break;
                    default:
                        iL = this.f22632b.Q.f22662d.l();
                        break;
                }
                return Float.valueOf(iL);
            }
        });
        if (this.R) {
            g3.a0 a0Var = g3.x.f28730v;
            mz.j jVar = g3.z.f28737a[13];
            b0Var.b(a0Var, lVar);
        } else {
            g3.a0 a0Var2 = g3.x.f28729u;
            mz.j jVar2 = g3.z.f28737a[12];
            b0Var.b(a0Var2, lVar);
        }
    }

    @Override // y2.z
    public final int p(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        if (!this.R) {
            i11 = Integer.MAX_VALUE;
        }
        return p0Var.W(i11);
    }

    @Override // y2.z
    public final int t(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        if (!this.R) {
            i11 = Integer.MAX_VALUE;
        }
        return p0Var.b(i11);
    }
}
