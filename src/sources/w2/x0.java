package w2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class x0 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f54602a;

    public x0(fz.c cVar) {
        this.f54602a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            return this.f54602a == ((x0) obj).f54602a;
        }
        return false;
    }

    @Override // y2.d1
    public final z1.q f() {
        y0 y0Var = new y0();
        y0Var.Q = this.f54602a;
        return y0Var;
    }

    public final int hashCode() {
        return this.f54602a.hashCode();
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        ((y0) qVar).Q = this.f54602a;
    }
}
