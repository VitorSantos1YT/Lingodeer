package a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends r1 {
    public b0.v1 R;
    public l1.b1 S;
    public y T;
    public long U;

    @Override // z1.q
    public final void N0() {
        this.U = o.f151a;
    }

    @Override // a0.r1, y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        long j12;
        w2.g1 g1VarB = p0Var.B(j11);
        if (s0Var.c0()) {
            j12 = (((long) g1VarB.f54501a) << 32) | (((long) g1VarB.f54502b) & 4294967295L);
        } else {
            b0.v1 v1Var = this.R;
            if (v1Var == null) {
                j12 = (((long) g1VarB.f54501a) << 32) | (((long) g1VarB.f54502b) & 4294967295L);
                this.U = j12;
            } else {
                long j13 = (((long) g1VarB.f54502b) & 4294967295L) | (((long) g1VarB.f54501a) << 32);
                b0.u1 u1VarA = v1Var.a(new v(this, j13, 0), new v(this, j13, 1));
                this.T.f238e = u1VarA;
                j12 = ((v3.l) u1VarA.getValue()).f53498a;
                this.U = ((v3.l) u1VarA.getValue()).f53498a;
            }
        }
        return s0Var.q0((int) (j12 >> 32), (int) (4294967295L & j12), ry.s.f50855a, new u(this, g1VarB, j12));
    }
}
