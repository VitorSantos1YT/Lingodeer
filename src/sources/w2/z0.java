package w2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class z0 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f54618a;

    public z0(fz.c cVar) {
        this.f54618a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z0) {
            return this.f54618a == ((z0) obj).f54618a;
        }
        return false;
    }

    @Override // y2.d1
    public final z1.q f() {
        a1 a1Var = new a1();
        a1Var.Q = this.f54618a;
        return a1Var;
    }

    public final int hashCode() {
        return this.f54618a.hashCode();
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        ((a1) qVar).Q = this.f54618a;
    }
}
