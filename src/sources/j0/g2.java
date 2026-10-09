package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2 f35295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2 f35296b;

    public g2(n2 n2Var, n2 n2Var2) {
        this.f35295a = n2Var;
        this.f35296b = n2Var2;
    }

    @Override // j0.n2
    public final int a(v3.c cVar) {
        return Math.max(this.f35295a.a(cVar), this.f35296b.a(cVar));
    }

    @Override // j0.n2
    public final int b(v3.c cVar, v3.m mVar) {
        return Math.max(this.f35295a.b(cVar, mVar), this.f35296b.b(cVar, mVar));
    }

    @Override // j0.n2
    public final int c(v3.c cVar, v3.m mVar) {
        return Math.max(this.f35295a.c(cVar, mVar), this.f35296b.c(cVar, mVar));
    }

    @Override // j0.n2
    public final int d(v3.c cVar) {
        return Math.max(this.f35295a.d(cVar), this.f35296b.d(cVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return kotlin.jvm.internal.m.a(g2Var.f35295a, this.f35295a) && kotlin.jvm.internal.m.a(g2Var.f35296b, this.f35296b);
    }

    public final int hashCode() {
        return (this.f35296b.hashCode() * 31) + this.f35295a.hashCode();
    }

    public final String toString() {
        return "(" + this.f35295a + " ∪ " + this.f35296b + ')';
    }
}
