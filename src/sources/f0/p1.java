package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class p1 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f26396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f26397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0.i f26400e;

    public p1(c2 c2Var, h1 h1Var, boolean z11, boolean z12, h0.i iVar) {
        this.f26396a = c2Var;
        this.f26397b = h1Var;
        this.f26398c = z11;
        this.f26399d = z12;
        this.f26400e = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return kotlin.jvm.internal.m.a(this.f26396a, p1Var.f26396a) && this.f26397b == p1Var.f26397b && this.f26398c == p1Var.f26398c && this.f26399d == p1Var.f26399d && kotlin.jvm.internal.m.a(this.f26400e, p1Var.f26400e);
    }

    @Override // y2.d1
    public final z1.q f() {
        return new b2(null, null, null, this.f26397b, this.f26396a, this.f26400e, this.f26398c, this.f26399d);
    }

    public final int hashCode() {
        int iE = defpackage.e.e(defpackage.e.e((this.f26397b.hashCode() + (this.f26396a.hashCode() * 31)) * 961, 31, this.f26398c), 961, this.f26399d);
        h0.i iVar = this.f26400e;
        return (iE + (iVar != null ? iVar.hashCode() : 0)) * 31;
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        ((b2) qVar).f1(null, null, null, this.f26397b, this.f26396a, this.f26400e, this.f26398c, this.f26399d);
    }
}
