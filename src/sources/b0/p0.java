package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.k1 f3632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.k1 f3633d;

    public p0(Object obj) {
        super(0);
        this.f3632c = l1.t.B(obj);
        this.f3633d = l1.t.B(obj);
    }

    @Override // b0.h2
    public final Object Y() {
        return this.f3632c.getValue();
    }

    @Override // b0.h2
    public final Object a0() {
        return this.f3633d.getValue();
    }

    @Override // b0.h2
    public final void o0(Object obj) {
        this.f3632c.setValue(obj);
    }

    @Override // b0.h2
    public final void q0() {
    }

    @Override // b0.h2
    public final void p0(c2 c2Var) {
    }
}
