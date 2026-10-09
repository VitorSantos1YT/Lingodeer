package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f22711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22712b;

    public g2(d2 d2Var, boolean z11) {
        this.f22711a = d2Var;
        this.f22712b = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return kotlin.jvm.internal.m.a(this.f22711a, g2Var.f22711a) && this.f22712b == g2Var.f22712b;
    }

    @Override // y2.d1
    public final z1.q f() {
        b2 b2Var = new b2();
        b2Var.Q = this.f22711a;
        b2Var.R = this.f22712b;
        return b2Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22712b) + defpackage.e.e(this.f22711a.hashCode() * 31, 31, false);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        b2 b2Var = (b2) qVar;
        b2Var.Q = this.f22711a;
        b2Var.R = this.f22712b;
    }
}
