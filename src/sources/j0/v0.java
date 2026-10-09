package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1.h f35425a;

    public v0(z1.h hVar) {
        this.f35425a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        v0 v0Var = obj instanceof v0 ? (v0) obj : null;
        if (v0Var == null) {
            return false;
        }
        return this.f35425a.equals(v0Var.f35425a);
    }

    @Override // y2.d1
    public final z1.q f() {
        w0 w0Var = new w0();
        w0Var.Q = this.f35425a;
        return w0Var;
    }

    public final int hashCode() {
        return Float.hashCode(this.f35425a.f58472a);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        ((w0) qVar).Q = this.f35425a;
    }
}
