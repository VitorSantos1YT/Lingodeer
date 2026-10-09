package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f35313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35314b;

    public i1(float f5, boolean z11) {
        this.f35313a = f5;
        this.f35314b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i1 i1Var = obj instanceof i1 ? (i1) obj : null;
        return i1Var != null && this.f35313a == i1Var.f35313a && this.f35314b == i1Var.f35314b;
    }

    @Override // y2.d1
    public final z1.q f() {
        j1 j1Var = new j1();
        j1Var.Q = this.f35313a;
        j1Var.R = this.f35314b;
        return j1Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35314b) + (Float.hashCode(this.f35313a) * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        j1 j1Var = (j1) qVar;
        j1Var.Q = this.f35313a;
        j1Var.R = this.f35314b;
    }
}
