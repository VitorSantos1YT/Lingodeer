package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class r2 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f35403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.e f35404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f35405c;

    public r2(b0 b0Var, fz.e eVar, Object obj) {
        this.f35403a = b0Var;
        this.f35404b = eVar;
        this.f35405c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r2.class != obj.getClass()) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return this.f35403a == r2Var.f35403a && kotlin.jvm.internal.m.a(this.f35405c, r2Var.f35405c);
    }

    @Override // y2.d1
    public final z1.q f() {
        s2 s2Var = new s2();
        s2Var.Q = this.f35403a;
        s2Var.R = this.f35404b;
        return s2Var;
    }

    public final int hashCode() {
        return this.f35405c.hashCode() + defpackage.e.e(this.f35403a.hashCode() * 31, 31, false);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        s2 s2Var = (s2) qVar;
        s2Var.Q = this.f35403a;
        s2Var.R = this.f35404b;
    }
}
