package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class e1 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.i f22674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f22675b;

    public e1(h0.i iVar, g1 g1Var) {
        this.f22674a = iVar;
        this.f22675b = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return kotlin.jvm.internal.m.a(this.f22674a, e1Var.f22674a) && kotlin.jvm.internal.m.a(this.f22675b, e1Var.f22675b);
    }

    @Override // y2.d1
    public final z1.q f() {
        y2.m mVarB = this.f22675b.b(this.f22674a);
        f1 f1Var = new f1();
        f1Var.S = mVarB;
        f1Var.T0(mVarB);
        return f1Var;
    }

    public final int hashCode() {
        return this.f22675b.hashCode() + (this.f22674a.hashCode() * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        f1 f1Var = (f1) qVar;
        y2.m mVarB = this.f22675b.b(this.f22674a);
        f1Var.U0(f1Var.S);
        f1Var.S = mVarB;
        f1Var.T0(mVarB);
    }
}
