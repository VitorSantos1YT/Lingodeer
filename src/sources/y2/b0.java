package y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends k1 {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final a.a f56824v0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public z f56825t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public a0 f56826u0;

    static {
        a.a aVarH = g2.f0.h();
        aVarH.N(g2.x.f28620g);
        aVarH.U(1.0f);
        aVarH.V(1);
        f56824v0 = aVarH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(i0 i0Var, z zVar) {
        super(i0Var);
        this.f56825t0 = zVar;
        this.f56826u0 = i0Var.K != null ? new a0(this) : null;
        if ((((z1.q) zVar).f58482a.f58484c & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // w2.p0
    public final w2.g1 B(long j11) {
        m0(j11);
        z zVar = this.f56825t0;
        k1 k1Var = this.R;
        kotlin.jvm.internal.m.c(k1Var);
        v1(zVar.b(this, k1Var, j11));
        m1();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D1(z zVar) {
        if (!zVar.equals(this.f56825t0) && (((z1.q) zVar).f58482a.f58484c & 512) != 0) {
            throw new ClassCastException();
        }
        this.f56825t0 = zVar;
    }

    @Override // w2.p0
    public final int W(int i11) {
        z zVar = this.f56825t0;
        k1 k1Var = this.R;
        kotlin.jvm.internal.m.c(k1Var);
        return zVar.p(this, k1Var, i11);
    }

    @Override // y2.k1
    public final void X0() {
        if (this.f56826u0 == null) {
            this.f56826u0 = new a0(this);
        }
    }

    @Override // y2.k1
    public final r0 a1() {
        return this.f56826u0;
    }

    @Override // w2.p0
    public final int b(int i11) {
        z zVar = this.f56825t0;
        k1 k1Var = this.R;
        kotlin.jvm.internal.m.c(k1Var);
        return zVar.t(this, k1Var, i11);
    }

    @Override // y2.k1
    public final z1.q c1() {
        return ((z1.q) this.f56825t0).f58482a;
    }

    @Override // w2.g1
    public final void i0(long j11, float f5, fz.c cVar) {
        s1(j11, f5, cVar);
        if (this.L) {
            return;
        }
        n1();
        k1 k1Var = this.R;
        kotlin.jvm.internal.m.c(k1Var);
        k1Var.M = this.M;
        K0().b();
        k1Var.M = false;
    }

    @Override // w2.p0
    public final int p(int i11) {
        z zVar = this.f56825t0;
        k1 k1Var = this.R;
        kotlin.jvm.internal.m.c(k1Var);
        return zVar.E(this, k1Var, i11);
    }

    @Override // y2.k1
    public final void r1(g2.v vVar, j2.c cVar) {
        k1 k1Var;
        k1 k1Var2 = this.R;
        kotlin.jvm.internal.m.c(k1Var2);
        k1Var2.V0(vVar, cVar);
        if (!l0.a(this.Q).getShowLayoutBounds() || (k1Var = this.R) == null) {
            return;
        }
        if (v3.l.a(this.f54503c, k1Var.f54503c) && v3.j.c(k1Var.f56945b0, 0L)) {
            return;
        }
        long j11 = this.f54503c;
        vVar.o(0.5f, 0.5f, ((int) (j11 >> 32)) - 0.5f, ((int) (j11 & 4294967295L)) - 0.5f, f56824v0);
    }

    @Override // w2.p0
    public final int t(int i11) {
        z zVar = this.f56825t0;
        k1 k1Var = this.R;
        kotlin.jvm.internal.m.c(k1Var);
        return zVar.L(this, k1Var, i11);
    }

    @Override // y2.q0
    public final int x0(w2.n nVar) {
        a0 a0Var = this.f56826u0;
        if (a0Var == null) {
            return f.c(this, nVar);
        }
        y.d0 d0Var = a0Var.V;
        int iD = d0Var.d(nVar);
        if (iD >= 0) {
            return d0Var.f56679c[iD];
        }
        return Integer.MIN_VALUE;
    }
}
