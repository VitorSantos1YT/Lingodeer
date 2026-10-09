package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class l1 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f35338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f35339b;

    public l1(float f5, float f11) {
        this.f35338a = f5;
        this.f35339b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        l1 l1Var = obj instanceof l1 ? (l1) obj : null;
        return l1Var != null && v3.f.b(this.f35338a, l1Var.f35338a) && v3.f.b(this.f35339b, l1Var.f35339b);
    }

    @Override // y2.d1
    public final z1.q f() {
        m1 m1Var = new m1();
        m1Var.Q = this.f35338a;
        m1Var.R = this.f35339b;
        m1Var.S = true;
        return m1Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + defpackage.e.a(Float.hashCode(this.f35338a) * 31, this.f35339b, 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        m1 m1Var = (m1) qVar;
        float f5 = m1Var.Q;
        float f11 = this.f35338a;
        boolean zB = v3.f.b(f5, f11);
        float f12 = this.f35339b;
        if (!zB || !v3.f.b(m1Var.R, f12) || !m1Var.S) {
            y2.f.x(m1Var).X(false);
        }
        m1Var.Q = f11;
        m1Var.R = f12;
        m1Var.S = true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OffsetModifierElement(x=");
        com.google.android.material.datepicker.d.s(this.f35338a, ", y=", sb2);
        sb2.append((Object) v3.f.c(this.f35339b));
        sb2.append(", rtlAware=true)");
        return sb2.toString();
    }
}
