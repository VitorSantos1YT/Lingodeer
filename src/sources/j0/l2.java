package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1.i f35340a;

    public l2(z1.i iVar) {
        this.f35340a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        l2 l2Var = obj instanceof l2 ? (l2) obj : null;
        if (l2Var == null) {
            return false;
        }
        return this.f35340a.equals(l2Var.f35340a);
    }

    @Override // y2.d1
    public final z1.q f() {
        m2 m2Var = new m2();
        m2Var.Q = this.f35340a;
        return m2Var;
    }

    public final int hashCode() {
        return Float.hashCode(this.f35340a.f58473a);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        ((m2) qVar).Q = this.f35340a;
    }
}
