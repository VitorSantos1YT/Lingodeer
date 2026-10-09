package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class f1 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f35290a;

    public f1(e1 e1Var) {
        this.f35290a = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        f1 f1Var = obj instanceof f1 ? (f1) obj : null;
        return f1Var != null && this.f35290a == f1Var.f35290a;
    }

    @Override // y2.d1
    public final z1.q f() {
        g1 g1Var = new g1(1);
        g1Var.R = this.f35290a;
        g1Var.S = true;
        return g1Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f35290a.hashCode() * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        g1 g1Var = (g1) qVar;
        g1Var.R = this.f35290a;
        g1Var.S = true;
    }
}
