package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class c1 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f35265a;

    public c1(e1 e1Var) {
        this.f35265a = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        c1 c1Var = obj instanceof c1 ? (c1) obj : null;
        return c1Var != null && this.f35265a == c1Var.f35265a;
    }

    @Override // y2.d1
    public final z1.q f() {
        d1 d1Var = new d1(1);
        d1Var.R = this.f35265a;
        d1Var.S = true;
        return d1Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f35265a.hashCode() * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        d1 d1Var = (d1) qVar;
        d1Var.R = this.f35265a;
        d1Var.S = true;
    }
}
