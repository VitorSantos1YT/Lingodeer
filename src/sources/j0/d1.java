package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends a0.r1 {
    public e1 R;
    public boolean S;

    @Override // a0.r1
    public final long T0(w2.p0 p0Var, long j11) {
        int iW = this.R == e1.Min ? p0Var.W(v3.a.h(j11)) : p0Var.b(v3.a.h(j11));
        if (iW < 0) {
            iW = 0;
        }
        if (iW < 0) {
            v3.i.a("height must be >= 0");
        }
        return v3.b.h(0, Integer.MAX_VALUE, iW, iW);
    }

    @Override // a0.r1
    public final boolean U0() {
        return this.S;
    }

    @Override // a0.r1, y2.z
    public final int p(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        return this.R == e1.Min ? p0Var.W(i11) : p0Var.b(i11);
    }

    @Override // a0.r1, y2.z
    public final int t(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        return this.R == e1.Min ? p0Var.W(i11) : p0Var.b(i11);
    }
}
