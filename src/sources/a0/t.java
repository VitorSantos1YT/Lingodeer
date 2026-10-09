package a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class t<S> extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0.v1 f185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.b1 f186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f187c;

    public t(b0.v1 v1Var, l1.b1 b1Var, y yVar) {
        this.f185a = v1Var;
        this.f186b = b1Var;
        this.f187c = yVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.m.a(tVar.f185a, this.f185a) && tVar.f186b.equals(this.f186b);
    }

    @Override // y2.d1
    public final z1.q f() {
        w wVar = new w(0);
        wVar.R = this.f185a;
        wVar.S = this.f186b;
        wVar.T = this.f187c;
        wVar.U = o.f151a;
        return wVar;
    }

    public final int hashCode() {
        int iHashCode = this.f187c.hashCode() * 31;
        b0.v1 v1Var = this.f185a;
        return this.f186b.hashCode() + ((iHashCode + (v1Var != null ? v1Var.hashCode() : 0)) * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        w wVar = (w) qVar;
        wVar.R = this.f185a;
        wVar.S = this.f186b;
        wVar.T = this.f187c;
    }
}
