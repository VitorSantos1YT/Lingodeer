package f7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends p7.q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26675c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f26676d;

    public c1(y6.o0 o0Var, y6.x xVar) {
        super(o0Var);
        this.f26676d = xVar;
    }

    @Override // p7.q, y6.o0
    public y6.m0 f(int i11, y6.m0 m0Var, boolean z11) {
        switch (this.f26675c) {
            case 0:
                y6.o0 o0Var = this.f46450b;
                y6.m0 m0VarF = o0Var.f(i11, m0Var, z11);
                if (o0Var.m(m0VarF.f57230c, (y6.n0) this.f26676d, 0L).a()) {
                    m0VarF.h(m0Var.f57228a, m0Var.f57229b, m0Var.f57230c, m0Var.f57231d, m0Var.f57232e, y6.b.f57174c, true);
                } else {
                    m0VarF.f57233f = true;
                }
                return m0VarF;
            default:
                return super.f(i11, m0Var, z11);
        }
    }

    @Override // p7.q, y6.o0
    public y6.n0 m(int i11, y6.n0 n0Var, long j11) {
        switch (this.f26675c) {
            case 1:
                super.m(i11, n0Var, j11);
                y6.x xVar = (y6.x) this.f26676d;
                n0Var.f57240c = xVar;
                y6.u uVar = xVar.f57373b;
                n0Var.getClass();
                return n0Var;
            default:
                return super.m(i11, n0Var, j11);
        }
    }

    public c1(y6.o0 o0Var) {
        super(o0Var);
        this.f26676d = new y6.n0();
    }
}
