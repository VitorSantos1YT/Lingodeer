package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class d0 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f35268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f35269b;

    public d0(b0 b0Var, float f5) {
        this.f35268a = b0Var;
        this.f35269b = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f35268a == d0Var.f35268a && this.f35269b == d0Var.f35269b;
    }

    @Override // y2.d1
    public final z1.q f() {
        e0 e0Var = new e0();
        e0Var.Q = this.f35268a;
        e0Var.R = this.f35269b;
        return e0Var;
    }

    public final int hashCode() {
        return Float.hashCode(this.f35269b) + (this.f35268a.hashCode() * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        e0 e0Var = (e0) qVar;
        e0Var.Q = this.f35268a;
        e0Var.R = this.f35269b;
    }
}
