package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends z2.g0 implements w2.c0, x2.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f35242d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2 f35243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.k1 f35244c;

    public a0(n2 n2Var) {
        this.f35243b = n2Var;
        this.f35244c = l1.t.B(n2Var);
    }

    @Override // w2.c0
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        int iD = ((n2) this.f35244c.getValue()).d(s0Var);
        ry.s sVar = ry.s.f50855a;
        if (iD == 0) {
            return s0Var.q0(0, 0, sVar, new in.c(16));
        }
        w2.g1 g1VarB = p0Var.B(v3.a.a(0, 0, iD, iD, 3, j11));
        return s0Var.q0(g1VarB.f54501a, iD, sVar, new c1.i(g1VarB, 3));
    }

    @Override // x2.c
    public final void e(x2.g gVar) {
        this.f35244c.setValue(new c0(this.f35243b, (n2) gVar.a(c.f35256c)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return kotlin.jvm.internal.m.a(this.f35243b, ((a0) obj).f35243b);
        }
        return false;
    }

    public final int hashCode() {
        return c.f35257d.hashCode() + (this.f35243b.hashCode() * 31);
    }
}
