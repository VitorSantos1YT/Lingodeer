package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends y2.n implements y2.l, y2.o1 {
    public f0.c2 S;
    public f0.h1 T;
    public boolean U;
    public f0.t0 V;
    public h0.i W;
    public f0.d X;
    public boolean Y;
    public i Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public f0.b2 f22697a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public y2.m f22698b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public j f22699c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public i f22700d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f22701e0;

    @Override // z1.q
    public final boolean I0() {
        return false;
    }

    @Override // z1.q
    public final void L0() {
        this.f22701e0 = X0();
        W0();
        if (this.f22697a0 == null) {
            f0.c2 c2Var = this.S;
            i iVar = this.Y ? this.f22700d0 : this.Z;
            f0.b2 b2Var = new f0.b2(iVar, this.X, this.V, this.T, c2Var, this.W, this.U, this.f22701e0);
            T0(b2Var);
            this.f22697a0 = b2Var;
        }
    }

    @Override // z1.q
    public final void M0() {
        y2.m mVar = this.f22698b0;
        if (mVar != null) {
            U0(mVar);
        }
    }

    @Override // y2.m
    public final void S() {
        boolean zX0 = X0();
        if (this.f22701e0 != zX0) {
            this.f22701e0 = zX0;
            f0.c2 c2Var = this.S;
            f0.h1 h1Var = this.T;
            boolean z11 = this.Y;
            i iVar = z11 ? this.f22700d0 : this.Z;
            Y0(iVar, this.X, this.V, h1Var, c2Var, this.W, z11, this.U);
        }
    }

    public final void W0() {
        y2.m mVar = this.f22698b0;
        if (mVar != null) {
            if (((z1.q) mVar).f58482a.P) {
                return;
            }
            T0(mVar);
            return;
        }
        if (this.Y) {
            y2.f.t(this, new cr.n(this, 2));
        }
        i iVar = this.Y ? this.f22700d0 : this.Z;
        if (iVar != null) {
            y2.n nVar = iVar.f22728i;
            if (nVar.f58482a.P) {
                return;
            }
            T0(nVar);
            this.f22698b0 = nVar;
        }
    }

    public final boolean X0() {
        v3.m mVar = v3.m.Ltr;
        if (this.P) {
            mVar = y2.f.x(this).f56883c0;
        }
        return mVar != v3.m.Rtl || this.T == f0.h1.Vertical;
    }

    public final void Y0(i iVar, f0.d dVar, f0.t0 t0Var, f0.h1 h1Var, f0.c2 c2Var, h0.i iVar2, boolean z11, boolean z12) {
        boolean z13;
        this.S = c2Var;
        this.T = h1Var;
        boolean z14 = true;
        if (this.Y != z11) {
            this.Y = z11;
            z13 = true;
        } else {
            z13 = false;
        }
        if (kotlin.jvm.internal.m.a(this.Z, iVar)) {
            z14 = false;
        } else {
            this.Z = iVar;
        }
        if (z13 || (z14 && !z11)) {
            y2.m mVar = this.f22698b0;
            if (mVar != null) {
                U0(mVar);
            }
            this.f22698b0 = null;
            W0();
        }
        this.U = z12;
        this.V = t0Var;
        this.W = iVar2;
        this.X = dVar;
        boolean zX0 = X0();
        this.f22701e0 = zX0;
        f0.b2 b2Var = this.f22697a0;
        if (b2Var != null) {
            b2Var.f1(this.Y ? this.f22700d0 : this.Z, dVar, t0Var, h1Var, c2Var, iVar2, z12, zX0);
        }
    }

    @Override // y2.o1
    public final void m0() {
        j jVar = (j) y2.f.i(this, s1.f22800a);
        if (kotlin.jvm.internal.m.a(jVar, this.f22699c0)) {
            return;
        }
        this.f22699c0 = jVar;
        this.f22700d0 = null;
        y2.m mVar = this.f22698b0;
        if (mVar != null) {
            U0(mVar);
        }
        this.f22698b0 = null;
        W0();
        f0.b2 b2Var = this.f22697a0;
        if (b2Var != null) {
            f0.c2 c2Var = this.S;
            f0.h1 h1Var = this.T;
            i iVar = this.Y ? this.f22700d0 : this.Z;
            b2Var.f1(iVar, this.X, this.V, h1Var, c2Var, this.W, this.U, this.f22701e0);
        }
    }
}
