package a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r1 extends z1.q implements y2.z {
    public final /* synthetic */ int Q;

    public /* synthetic */ r1(int i11) {
        this.Q = i11;
    }

    @Override // y2.z
    public int E(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        switch (this.Q) {
            case 0:
                break;
        }
        return p0Var.p(i11);
    }

    @Override // y2.z
    public int L(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        switch (this.Q) {
            case 0:
                break;
        }
        return p0Var.t(i11);
    }

    public abstract long T0(w2.p0 p0Var, long j11);

    public abstract boolean U0();

    public w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        long jT0 = T0(p0Var, j11);
        if (U0()) {
            jT0 = v3.b.e(j11, jT0);
        }
        w2.g1 g1VarB = p0Var.B(jT0);
        return s0Var.q0(g1VarB.f54501a, g1VarB.f54502b, ry.s.f50855a, new c1.i(g1VarB, 5));
    }

    @Override // y2.z
    public int p(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        switch (this.Q) {
            case 0:
                break;
        }
        return p0Var.W(i11);
    }

    @Override // y2.z
    public int t(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        switch (this.Q) {
            case 0:
                break;
        }
        return p0Var.b(i11);
    }
}
