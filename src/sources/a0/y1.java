package a0;

import b0.i2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends r1 {
    public i2 R;
    public long S;
    public long T;
    public boolean U;
    public final l1.k1 V;

    public y1(i2 i2Var) {
        super(0);
        this.R = i2Var;
        this.S = m0.f140a;
        this.T = v3.b.b(0, 0, 15);
        this.V = l1.t.B(null);
    }

    @Override // z1.q
    public final void L0() {
        this.S = m0.f140a;
        this.U = false;
    }

    @Override // z1.q
    public final void N0() {
        this.V.setValue(null);
    }

    @Override // a0.r1, y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        w2.g1 g1VarB;
        char c11;
        v1 v1Var;
        long jD;
        v1 v1Var2;
        if (s0Var.c0()) {
            this.T = j11;
            this.U = true;
            g1VarB = p0Var.B(j11);
        } else {
            g1VarB = p0Var.B(this.U ? this.T : j11);
        }
        w2.g1 g1Var = g1VarB;
        long j12 = (((long) g1Var.f54502b) & 4294967295L) | (((long) g1Var.f54501a) << 32);
        if (s0Var.c0()) {
            this.S = j12;
            c11 = ' ';
            jD = j12;
            j12 = jD;
        } else {
            long j13 = !v3.l.a(this.S, m0.f140a) ? this.S : j12;
            l1.k1 k1Var = this.V;
            v1 v1Var3 = (v1) k1Var.getValue();
            if (v1Var3 != null) {
                b0.d dVar = v1Var3.f207a;
                c11 = ' ';
                boolean z11 = (v3.l.a(j13, ((v3.l) dVar.d()).f53498a) || ((Boolean) dVar.f3473d.getValue()).booleanValue()) ? false : true;
                if (!v3.l.a(j13, ((v3.l) dVar.f3474e.getValue()).f53498a) || z11) {
                    v1Var3.f208b = ((v3.l) dVar.d()).f53498a;
                    v1Var2 = v1Var3;
                    rz.e0.B(H0(), null, null, new w1(v1Var2, j13, this, (vy.d) null, 0), 3);
                } else {
                    v1Var2 = v1Var3;
                }
                v1Var = v1Var2;
            } else {
                c11 = ' ';
                long j14 = j13;
                long j15 = 1;
                v1Var = new v1(new b0.d(new v3.l(j14), b0.e.f3502q, new v3.l((j15 << 32) | (j15 & 4294967295L)), 8), j14);
            }
            k1Var.setValue(v1Var);
            jD = v3.b.d(j11, ((v3.l) v1Var.f207a.d()).f53498a);
        }
        int i11 = (int) (jD >> c11);
        int i12 = (int) (jD & 4294967295L);
        return s0Var.q0(i11, i12, ry.s.f50855a, new x1(this, j12, i11, i12, s0Var, g1Var));
    }
}
