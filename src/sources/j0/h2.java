package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements x2.c, x2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.k1 f35301a = l1.t.B(new g0());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2 f35302b;

    public h2(n2 n2Var) {
        this.f35302b = n2Var;
    }

    @Override // x2.f
    public final n2 d() {
        return (n2) this.f35301a.getValue();
    }

    @Override // x2.c
    public final void e(x2.g gVar) {
        this.f35301a.setValue(new g2(this.f35302b, (n2) gVar.a(c.f35256c)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h2) {
            return kotlin.jvm.internal.m.a(((h2) obj).f35302b, this.f35302b);
        }
        return false;
    }

    @Override // x2.f
    public final x2.h getKey() {
        return c.f35256c;
    }

    public final int hashCode() {
        return this.f35302b.hashCode();
    }
}
