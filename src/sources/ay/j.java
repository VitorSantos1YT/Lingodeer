package ay;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vx.a f3329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tx.b f3330c;

    public j(g0 g0Var, vx.a aVar, tx.b bVar) {
        super(g0Var);
        this.f3329b = aVar;
        this.f3330c = bVar;
    }

    @Override // qx.h
    public final void j(qx.k kVar) {
        try {
            ((qx.h) this.f3265a).i(new i(kVar, this.f3329b.f54311a, this.f3330c, 0));
        } catch (Throwable th2) {
            ef.e.E(th2);
            ux.c.e(th2, kVar);
        }
    }
}
