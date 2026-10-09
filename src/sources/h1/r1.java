package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends y2.n implements y2.y1, y2.l, y2.y {
    public n S;
    public boolean T;
    public int U;
    public float V;
    public float W;
    public long X = 0;
    public final s2.m0 Y;
    public final s2.m0 Z;

    public r1(n nVar, boolean z11, int i11) {
        this.S = nVar;
        this.T = z11;
        this.U = i11;
        vy.d dVar = null;
        p1 p1Var = new p1(this, dVar, 1);
        s2.l lVar = s2.g0.f51302a;
        s2.h0 h0Var = s2.h0.f51304a;
        s2.m0 m0Var = new s2.m0(null, null, null, h0Var);
        m0Var.T = p1Var;
        T0(m0Var);
        this.Y = m0Var;
        p1 p1Var2 = new p1(this, dVar, 0);
        s2.m0 m0Var2 = new s2.m0(null, null, null, h0Var);
        m0Var2.T = p1Var2;
        T0(m0Var2);
        this.Z = m0Var2;
    }

    @Override // y2.y1
    public final void G() {
        this.Y.G();
        this.Z.G();
    }

    @Override // y2.y
    public final void l(long j11) {
        this.X = ff.h.q(j11);
    }

    @Override // y2.y1
    public final void q(s2.l lVar, s2.m mVar, long j11) {
        this.Y.q(lVar, mVar, j11);
        this.Z.q(lVar, mVar, j11);
    }
}
