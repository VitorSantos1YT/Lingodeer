package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class s0 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.i f22799a;

    public s0(h0.i iVar) {
        this.f22799a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && kotlin.jvm.internal.m.a(((s0) obj).f22799a, this.f22799a);
    }

    @Override // y2.d1
    public final z1.q f() {
        w0 w0Var = new w0();
        w0Var.Q = this.f22799a;
        return w0Var;
    }

    public final int hashCode() {
        return this.f22799a.hashCode() * 31;
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        w0 w0Var = (w0) qVar;
        h0.i iVar = w0Var.Q;
        h0.i iVar2 = this.f22799a;
        if (kotlin.jvm.internal.m.a(iVar, iVar2)) {
            return;
        }
        w0Var.V0();
        w0Var.Q = iVar2;
    }
}
