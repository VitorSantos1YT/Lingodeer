package n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class f1 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f42940a;

    public f1(l0 l0Var) {
        this.f42940a = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && kotlin.jvm.internal.m.a(this.f42940a, ((f1) obj).f42940a);
    }

    @Override // y2.d1
    public final z1.q f() {
        g1 g1Var = new g1();
        g1Var.Q = this.f42940a;
        return g1Var;
    }

    public final int hashCode() {
        return this.f42940a.hashCode();
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        ((g1) qVar).Q = this.f42940a;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f42940a + ')';
    }
}
