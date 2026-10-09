package a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends r1 {
    public b0.c2 R;
    public b0.v1 S;
    public b0.v1 T;
    public b0.v1 U;
    public l1 V;
    public m1 W;
    public fz.a X;
    public x0 Y;
    public long Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public z1.e f121a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final j1 f122b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final j1 f123c0;

    public k1(b0.c2 c2Var, b0.v1 v1Var, b0.v1 v1Var2, b0.v1 v1Var3, l1 l1Var, m1 m1Var, fz.a aVar, x0 x0Var) {
        super(0);
        this.R = c2Var;
        this.S = v1Var;
        this.T = v1Var2;
        this.U = v1Var3;
        this.V = l1Var;
        this.W = m1Var;
        this.X = aVar;
        this.Y = x0Var;
        this.Z = m0.f140a;
        v3.b.b(0, 0, 15);
        this.f122b0 = new j1(this, 0);
        this.f123c0 = new j1(this, 1);
    }

    @Override // z1.q
    public final void L0() {
        this.Z = m0.f140a;
    }

    public final z1.e V0() {
        if (this.R.f().b(v0.PreEnter, v0.Visible)) {
            n0 n0Var = this.V.f132a.f55c;
            if (n0Var != null) {
                return n0Var.f147a;
            }
            n0 n0Var2 = this.W.f143a.f55c;
            if (n0Var2 != null) {
                return n0Var2.f147a;
            }
            return null;
        }
        n0 n0Var3 = this.W.f143a.f55c;
        if (n0Var3 != null) {
            return n0Var3.f147a;
        }
        n0 n0Var4 = this.V.f132a.f55c;
        if (n0Var4 != null) {
            return n0Var4.f147a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    @Override // a0.r1, y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        g2.z0 z0Var;
        b0.u1 u1VarA;
        long j12;
        if (this.R.f3458a.Y() == this.R.f3461d.getValue()) {
            this.f121a0 = null;
        } else if (this.f121a0 == null) {
            z1.e eVarV0 = V0();
            if (eVarV0 == null) {
                eVarV0 = z1.c.f58463a;
            }
            this.f121a0 = eVarV0;
        }
        boolean zC0 = s0Var.c0();
        ry.s sVar = ry.s.f50855a;
        if (zC0) {
            w2.g1 g1VarB = p0Var.B(j11);
            long j13 = (((long) g1VarB.f54501a) << 32) | (((long) g1VarB.f54502b) & 4294967295L);
            this.Z = j13;
            return s0Var.q0((int) (j13 >> 32), (int) (4294967295L & j13), sVar, new h0(g1VarB, 1));
        }
        if (!((Boolean) this.X.invoke()).booleanValue()) {
            w2.g1 g1VarB2 = p0Var.B(j11);
            return s0Var.q0(g1VarB2.f54501a, g1VarB2.f54502b, sVar, new h0(g1VarB2, 2));
        }
        x0 x0Var = this.Y;
        b0.v1 v1Var = x0Var.f223a;
        b0.v1 v1Var2 = x0Var.f224b;
        b0.c2 c2Var = x0Var.f225c;
        l1 l1Var = x0Var.f226d;
        d2 d2Var = l1Var.f132a;
        m1 m1Var = x0Var.f227e;
        b0.v1 v1Var3 = x0Var.f228f;
        b0.u1 u1VarA2 = v1Var != null ? v1Var.a(new y0(l1Var, m1Var, 0), new y0(l1Var, m1Var, 1)) : null;
        b0.u1 u1VarA3 = v1Var2 != null ? v1Var2.a(new y0(l1Var, m1Var, 2), new y0(l1Var, m1Var, 3)) : null;
        if (c2Var.f3458a.Y() == v0.PreEnter) {
            s1 s1Var = d2Var.f56d;
            if (s1Var != null) {
                z0Var = new g2.z0(s1Var.f183b);
            } else {
                s1 s1Var2 = m1Var.f143a.f56d;
                if (s1Var2 != null) {
                    z0Var = new g2.z0(s1Var2.f183b);
                } else {
                    z0Var = null;
                }
            }
        } else {
            s1 s1Var3 = m1Var.f143a.f56d;
            if (s1Var3 != null) {
                z0Var = new g2.z0(s1Var3.f183b);
            } else {
                s1 s1Var4 = d2Var.f56d;
                if (s1Var4 != null) {
                    z0Var = new g2.z0(s1Var4.f183b);
                } else {
                    z0Var = null;
                }
            }
        }
        j jVar = new j(u1VarA2, u1VarA3, v1Var3 != null ? v1Var3.a(c.M, new j(z0Var, l1Var, m1Var, 2)) : null, 1);
        w2.g1 g1VarB3 = p0Var.B(j11);
        long j14 = (((long) g1VarB3.f54501a) << 32) | (((long) g1VarB3.f54502b) & 4294967295L);
        long j15 = !v3.l.a(this.Z, m0.f140a) ? this.Z : j14;
        b0.v1 v1Var4 = this.S;
        if (v1Var4 != null) {
            u1VarA = v1Var4.a(this.f122b0, new i1(this, j15, 0));
        } else {
            u1VarA = null;
        }
        if (u1VarA != null) {
            j14 = ((v3.l) u1VarA.getValue()).f53498a;
        }
        long jD = v3.b.d(j11, j14);
        b0.v1 v1Var5 = this.T;
        long jA = 0;
        long j16 = v1Var5 != null ? ((v3.j) v1Var5.a(c.T, new i1(this, j15, 1)).getValue()).f53492a : 0L;
        b0.v1 v1Var6 = this.U;
        if (v1Var6 != null) {
            j12 = ((v3.j) v1Var6.a(this.f123c0, new i1(this, j15, 2)).getValue()).f53492a;
        } else {
            j12 = 0;
        }
        z1.e eVar = this.f121a0;
        if (eVar != null) {
            jA = eVar.a(j15, jD, v3.m.Ltr);
        }
        return s0Var.q0((int) (jD >> 32), (int) (jD & 4294967295L), sVar, new h1(g1VarB3, v3.j.e(jA, j12), j16, jVar));
    }
}
