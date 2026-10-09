package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class u1 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f35423a;

    public u1(t1 t1Var) {
        this.f35423a = t1Var;
    }

    public final boolean equals(Object obj) {
        u1 u1Var = obj instanceof u1 ? (u1) obj : null;
        if (u1Var == null) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f35423a, u1Var.f35423a);
    }

    @Override // y2.d1
    public final z1.q f() {
        w1 w1Var = new w1();
        w1Var.Q = this.f35423a;
        return w1Var;
    }

    public final int hashCode() {
        return this.f35423a.hashCode();
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        ((w1) qVar).Q = this.f35423a;
    }
}
