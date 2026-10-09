package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class i2 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f35315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f35316b;

    public i2(float f5, float f11) {
        this.f35315a = f5;
        this.f35316b = f11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return v3.f.b(this.f35315a, i2Var.f35315a) && v3.f.b(this.f35316b, i2Var.f35316b);
    }

    @Override // y2.d1
    public final z1.q f() {
        j2 j2Var = new j2();
        j2Var.Q = this.f35315a;
        j2Var.R = this.f35316b;
        return j2Var;
    }

    public final int hashCode() {
        return Float.hashCode(this.f35316b) + (Float.hashCode(this.f35315a) * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        j2 j2Var = (j2) qVar;
        j2Var.Q = this.f35315a;
        j2Var.R = this.f35316b;
    }
}
