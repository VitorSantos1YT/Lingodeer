package ay;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends qx.p implements wx.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f3333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vx.a f3334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tx.b f3335d;

    public k(g0 g0Var, vx.a aVar, tx.b bVar) {
        this.f3333b = g0Var;
        this.f3334c = aVar;
        this.f3335d = bVar;
    }

    @Override // qx.p
    public final void I(qx.q qVar) {
        try {
            this.f3333b.i(new i(qVar, this.f3334c.f54311a, this.f3335d, 1));
        } catch (Throwable th2) {
            ef.e.E(th2);
            qVar.c(ux.c.INSTANCE);
            qVar.onError(th2);
        }
    }

    @Override // wx.a
    public final qx.h a() {
        return new j(this.f3333b, this.f3334c, this.f3335d);
    }
}
