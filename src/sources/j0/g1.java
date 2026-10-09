package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends a0.r1 {
    public e1 R;
    public boolean S;

    @Override // a0.r1, y2.z
    public final int E(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        return this.R == e1.Min ? p0Var.p(i11) : p0Var.t(i11);
    }

    @Override // a0.r1, y2.z
    public final int L(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        return this.R == e1.Min ? p0Var.p(i11) : p0Var.t(i11);
    }

    @Override // a0.r1
    public final long T0(w2.p0 p0Var, long j11) {
        int iP = this.R == e1.Min ? p0Var.p(v3.a.g(j11)) : p0Var.t(v3.a.g(j11));
        if (iP < 0) {
            iP = 0;
        }
        if (iP < 0) {
            v3.i.a("width must be >= 0");
        }
        return v3.b.h(iP, iP, 0, Integer.MAX_VALUE);
    }

    @Override // a0.r1
    public final boolean U0() {
        return this.S;
    }
}
