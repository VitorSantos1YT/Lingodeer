package x2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ve.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f55752d;

    @Override // ve.i
    public final boolean n(h hVar) {
        return hVar == this.f55752d.getKey();
    }

    @Override // ve.i
    public final Object q(h hVar) {
        if (hVar != this.f55752d.getKey()) {
            v2.a.b("Check failed.");
        }
        return this.f55752d.d();
    }
}
