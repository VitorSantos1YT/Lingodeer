package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class n1 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f35345a;

    public n1(fz.c cVar) {
        this.f35345a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        n1 n1Var = obj instanceof n1 ? (n1) obj : null;
        return n1Var != null && this.f35345a == n1Var.f35345a;
    }

    @Override // y2.d1
    public final z1.q f() {
        o1 o1Var = new o1();
        o1Var.Q = this.f35345a;
        o1Var.R = true;
        return o1Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f35345a.hashCode() * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        o1 o1Var = (o1) qVar;
        fz.c cVar = o1Var.Q;
        fz.c cVar2 = this.f35345a;
        if (cVar != cVar2 || !o1Var.R) {
            y2.f.x(o1Var).X(false);
        }
        o1Var.Q = cVar2;
        o1Var.R = true;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f35345a + ", rtlAware=true)";
    }
}
