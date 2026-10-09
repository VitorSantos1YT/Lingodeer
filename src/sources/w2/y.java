package w2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class y extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.f f54605a;

    public y(fz.f fVar) {
        this.f54605a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f54605a == ((y) obj).f54605a;
        }
        return false;
    }

    @Override // y2.d1
    public final z1.q f() {
        d0 d0Var = new d0();
        d0Var.Q = this.f54605a;
        return d0Var;
    }

    public final int hashCode() {
        return this.f54605a.hashCode();
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        ((d0) qVar).Q = this.f54605a;
    }
}
