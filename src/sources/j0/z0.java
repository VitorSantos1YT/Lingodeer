package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements w2.c0, x2.c, x2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2 f35445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.k1 f35446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.k1 f35447c;

    public z0(n2 n2Var) {
        this.f35445a = n2Var;
        this.f35446b = l1.t.B(n2Var);
        this.f35447c = l1.t.B(n2Var);
    }

    @Override // w2.c0
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        l1.k1 k1Var = this.f35446b;
        int iC = ((n2) k1Var.getValue()).c(s0Var, s0Var.getLayoutDirection());
        int iA = ((n2) k1Var.getValue()).a(s0Var);
        int iB = ((n2) k1Var.getValue()).b(s0Var, s0Var.getLayoutDirection()) + iC;
        int iD = ((n2) k1Var.getValue()).d(s0Var) + iA;
        w2.g1 g1VarB = p0Var.B(v3.b.i(j11, -iB, -iD));
        return s0Var.q0(v3.b.g(g1VarB.f54501a + iB, j11), v3.b.f(g1VarB.f54502b + iD, j11), ry.s.f50855a, new y0(g1VarB, iC, iA, 0));
    }

    @Override // x2.f
    public final n2 d() {
        return (n2) this.f35447c.getValue();
    }

    @Override // x2.c
    public final void e(x2.g gVar) {
        n2 n2Var = (n2) gVar.a(c.f35256c);
        n2 n2Var2 = this.f35445a;
        this.f35446b.setValue(new c0(n2Var2, n2Var));
        this.f35447c.setValue(new g2(n2Var, n2Var2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z0) {
            return kotlin.jvm.internal.m.a(((z0) obj).f35445a, this.f35445a);
        }
        return false;
    }

    @Override // x2.f
    public final x2.h getKey() {
        return c.f35256c;
    }

    public final int hashCode() {
        return this.f35445a.hashCode();
    }
}
