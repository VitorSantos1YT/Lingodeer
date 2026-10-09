package w2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class z extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f54617a;

    public z(Object obj) {
        this.f54617a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && kotlin.jvm.internal.m.a(this.f54617a, ((z) obj).f54617a);
    }

    @Override // y2.d1
    public final z1.q f() {
        b0 b0Var = new b0();
        b0Var.Q = this.f54617a;
        return b0Var;
    }

    public final int hashCode() {
        return this.f54617a.hashCode();
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        ((b0) qVar).Q = this.f54617a;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f54617a + ')';
    }
}
