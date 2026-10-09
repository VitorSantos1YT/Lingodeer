package k6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements c6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c6.l f37936a = c6.j.f6631a;

    @Override // c6.g
    public final c6.g a() {
        l lVar = new l();
        lVar.f37936a = this.f37936a;
        return lVar;
    }

    @Override // c6.g
    public final c6.l b() {
        return this.f37936a;
    }

    @Override // c6.g
    public final void c(c6.l lVar) {
        this.f37936a = lVar;
    }

    public final String toString() {
        return "EmittableSpacer(modifier=" + this.f37936a + ')';
    }
}
