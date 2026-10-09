package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class c0 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.i f22648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.a f22649b;

    public c0(fz.a aVar, h0.i iVar) {
        this.f22648a = iVar;
        this.f22649b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.m.a(this.f22648a, c0Var.f22648a) && this.f22649b == c0Var.f22649b;
    }

    @Override // y2.d1
    public final z1.q f() {
        return new f0(this.f22649b, this.f22648a);
    }

    public final int hashCode() {
        h0.i iVar = this.f22648a;
        return Boolean.hashCode(true) + ((this.f22649b.hashCode() + defpackage.e.e(defpackage.e.e((iVar != null ? iVar.hashCode() : 0) * 961, 31, false), 29791, true)) * 923521);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        s2.m0 m0Var;
        f0 f0Var = (f0) qVar;
        f0Var.getClass();
        boolean z11 = !f0Var.X;
        f0Var.f1(this.f22648a, null, false, true, null, null, this.f22649b);
        if (!z11 || (m0Var = f0Var.f22685b0) == null) {
            return;
        }
        m0Var.V0();
    }
}
