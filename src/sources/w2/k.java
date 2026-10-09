package w2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f54532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Enum f54533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Enum f54534d;

    public /* synthetic */ k(p0 p0Var, Enum r9, Enum r11, int i11) {
        this.f54531a = i11;
        this.f54532b = p0Var;
        this.f54533c = r9;
        this.f54534d = r11;
    }

    @Override // w2.p0
    public final g1 B(long j11) {
        switch (this.f54531a) {
            case 0:
                t tVar = (t) this.f54533c;
                u uVar = (u) this.f54534d;
                u uVar2 = u.Width;
                p0 p0Var = this.f54532b;
                if (uVar == uVar2) {
                    return new m(tVar == t.Max ? p0Var.t(v3.a.g(j11)) : p0Var.p(v3.a.g(j11)), v3.a.c(j11) ? v3.a.g(j11) : 32767, 0);
                }
                return new m(v3.a.d(j11) ? v3.a.h(j11) : 32767, tVar == t.Max ? p0Var.b(v3.a.h(j11)) : p0Var.W(v3.a.h(j11)), 0);
            case 1:
                t0 t0Var = (t0) this.f54533c;
                u0 u0Var = (u0) this.f54534d;
                u0 u0Var2 = u0.Width;
                p0 p0Var2 = this.f54532b;
                if (u0Var == u0Var2) {
                    return new m(t0Var == t0.Max ? p0Var2.t(v3.a.g(j11)) : p0Var2.p(v3.a.g(j11)), v3.a.c(j11) ? v3.a.g(j11) : 32767, 1);
                }
                return new m(v3.a.d(j11) ? v3.a.h(j11) : 32767, t0Var == t0.Max ? p0Var2.b(v3.a.h(j11)) : p0Var2.W(v3.a.h(j11)), 1);
            default:
                y2.m1 m1Var = (y2.m1) this.f54533c;
                y2.n1 n1Var = (y2.n1) this.f54534d;
                y2.n1 n1Var2 = y2.n1.Width;
                p0 p0Var3 = this.f54532b;
                if (n1Var == n1Var2) {
                    return new m(m1Var == y2.m1.Max ? p0Var3.t(v3.a.g(j11)) : p0Var3.p(v3.a.g(j11)), v3.a.c(j11) ? v3.a.g(j11) : 32767, 2);
                }
                return new m(v3.a.d(j11) ? v3.a.h(j11) : 32767, m1Var == y2.m1.Max ? p0Var3.b(v3.a.h(j11)) : p0Var3.W(v3.a.h(j11)), 2);
        }
    }

    @Override // w2.p0
    public final Object G() {
        switch (this.f54531a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f54532b.G();
    }

    @Override // w2.p0
    public final int W(int i11) {
        switch (this.f54531a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f54532b.W(i11);
    }

    @Override // w2.p0
    public final int b(int i11) {
        switch (this.f54531a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f54532b.b(i11);
    }

    @Override // w2.p0
    public final int p(int i11) {
        switch (this.f54531a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f54532b.p(i11);
    }

    @Override // w2.p0
    public final int t(int i11) {
        switch (this.f54531a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f54532b.t(i11);
    }
}
