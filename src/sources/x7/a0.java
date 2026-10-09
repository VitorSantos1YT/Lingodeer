package x7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f55842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e0 f55843g;

    public a0(int i11, int i12, String str) {
        this.f55837a = i11;
        this.f55838b = i12;
        this.f55839c = str;
    }

    @Override // x7.m
    public final boolean c(n nVar) {
        int i11 = this.f55838b;
        int i12 = this.f55837a;
        b7.a.j((i12 == -1 || i11 == -1) ? false : true);
        b7.w wVar = new b7.w(i11);
        ((j) nVar).f(wVar.f4039a, 0, i11, false);
        return wVar.C() == i12;
    }

    @Override // x7.m
    public final void e(o oVar) {
        this.f55842f = oVar;
        e0 e0VarV = oVar.v(1024, 4);
        this.f55843g = e0VarV;
        y6.o oVar2 = new y6.o();
        String str = this.f55839c;
        oVar2.f57264l = y6.d0.o(str);
        oVar2.m = y6.d0.o(str);
        nv.p.D(oVar2, e0VarV);
        this.f55842f.o();
        this.f55842f.q(new b0());
        this.f55841e = 1;
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        if (j11 == 0 || this.f55841e == 1) {
            this.f55841e = 1;
            this.f55840d = 0;
        }
    }

    @Override // x7.m
    public final int g(n nVar, kw.b bVar) {
        int i11 = this.f55841e;
        if (i11 != 1) {
            if (i11 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        e0 e0Var = this.f55843g;
        e0Var.getClass();
        int iC = e0Var.c(nVar, 1024, true);
        if (iC != -1) {
            this.f55840d += iC;
            return 0;
        }
        this.f55841e = 2;
        this.f55843g.d(0L, 1, this.f55840d, 0, null);
        this.f55840d = 0;
        return 0;
    }

    @Override // x7.m
    public final void release() {
    }
}
