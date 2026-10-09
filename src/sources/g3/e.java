package g3;

import y2.b2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends z1.q implements b2 {
    public boolean Q;
    public final boolean R;
    public fz.c S;

    public e(boolean z11, boolean z12, fz.c cVar) {
        this.Q = z11;
        this.R = z12;
        this.S = cVar;
    }

    @Override // y2.b2
    public final boolean C0() {
        return this.Q;
    }

    @Override // y2.b2
    public final boolean H() {
        return this.R;
    }

    @Override // y2.b2
    public final void i0(b0 b0Var) {
        this.S.invoke(b0Var);
    }
}
