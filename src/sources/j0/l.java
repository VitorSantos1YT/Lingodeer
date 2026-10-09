package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class l extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1.j f35334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35335b;

    public l(z1.j jVar, boolean z11) {
        this.f35334a = jVar;
        this.f35335b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        l lVar = obj instanceof l ? (l) obj : null;
        return lVar != null && this.f35334a.equals(lVar.f35334a) && this.f35335b == lVar.f35335b;
    }

    @Override // y2.d1
    public final z1.q f() {
        m mVar = new m();
        mVar.Q = this.f35334a;
        mVar.R = this.f35335b;
        return mVar;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35335b) + (this.f35334a.hashCode() * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        m mVar = (m) qVar;
        mVar.Q = this.f35334a;
        mVar.R = this.f35335b;
    }
}
