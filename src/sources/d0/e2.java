package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class e2 extends y2.d1 {
    public final i H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0.c2 f22676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.h1 f22677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0.t0 f22679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0.i f22680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f0.d f22681f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f22682t;

    public e2(i iVar, f0.d dVar, f0.t0 t0Var, f0.h1 h1Var, f0.c2 c2Var, h0.i iVar2, boolean z11, boolean z12) {
        this.f22676a = c2Var;
        this.f22677b = h1Var;
        this.f22678c = z11;
        this.f22679d = t0Var;
        this.f22680e = iVar2;
        this.f22681f = dVar;
        this.f22682t = z12;
        this.H = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e2.class != obj.getClass()) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return kotlin.jvm.internal.m.a(this.f22676a, e2Var.f22676a) && this.f22677b == e2Var.f22677b && this.f22678c == e2Var.f22678c && kotlin.jvm.internal.m.a(this.f22679d, e2Var.f22679d) && kotlin.jvm.internal.m.a(this.f22680e, e2Var.f22680e) && kotlin.jvm.internal.m.a(this.f22681f, e2Var.f22681f) && this.f22682t == e2Var.f22682t && kotlin.jvm.internal.m.a(this.H, e2Var.H);
    }

    @Override // y2.d1
    public final z1.q f() {
        f2 f2Var = new f2();
        f2Var.S = this.f22676a;
        f2Var.T = this.f22677b;
        f2Var.U = this.f22678c;
        f2Var.V = this.f22679d;
        f2Var.W = this.f22680e;
        f2Var.X = this.f22681f;
        f2Var.Y = this.f22682t;
        f2Var.Z = this.H;
        return f2Var;
    }

    public final int hashCode() {
        int iE = defpackage.e.e(defpackage.e.e((this.f22677b.hashCode() + (this.f22676a.hashCode() * 31)) * 31, 31, this.f22678c), 31, false);
        f0.t0 t0Var = this.f22679d;
        int iHashCode = (iE + (t0Var != null ? t0Var.hashCode() : 0)) * 31;
        h0.i iVar = this.f22680e;
        int iHashCode2 = (iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        f0.d dVar = this.f22681f;
        int iE2 = defpackage.e.e((iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31, this.f22682t);
        i iVar2 = this.H;
        return iE2 + (iVar2 != null ? iVar2.hashCode() : 0);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        h0.i iVar = this.f22680e;
        ((f2) qVar).Y0(this.H, this.f22681f, this.f22679d, this.f22677b, this.f22676a, iVar, this.f22682t, this.f22678c);
    }
}
