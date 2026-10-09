package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yb f30706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f30707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f30708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0.d f30709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0.o1 f30710e = new d0.o1();

    public n(yb ybVar) {
        this.f30706a = ybVar;
        this.f30707b = ((ybVar.h() % 12) * 0.5235988f) - 1.5707964f;
        this.f30708c = (ybVar.d() * 0.10471976f) - 1.5707964f;
        this.f30709d = b0.e.a(this.f30707b);
    }

    public static float k(float f5) {
        double d5 = ((double) f5) % 6.283185307179586d;
        if (d5 < 0.0d) {
            d5 += 6.283185307179586d;
        }
        return (float) d5;
    }

    @Override // h1.yb
    public final void a(boolean z11) {
        this.f30706a.a(z11);
    }

    @Override // h1.yb
    public final void b(int i11) {
        this.f30707b = ((i11 % 12) * 0.5235988f) - 1.5707964f;
        yb ybVar = this.f30706a;
        ybVar.b(i11);
        if (ybVar.f() == 0) {
            this.f30709d = b0.e.a(this.f30707b);
        }
    }

    @Override // h1.yb
    public final void c(int i11) {
        this.f30708c = (i11 * 0.10471976f) - 1.5707964f;
        yb ybVar = this.f30706a;
        ybVar.c(i11);
        if (ybVar.f() == 1) {
            this.f30709d = b0.e.a(this.f30708c);
        }
        x1.f fVarN = re.q.n();
        fz.c cVarE = fVarN != null ? fVarN.e() : null;
        x1.f fVarR = re.q.r(fVarN);
        try {
            ybVar.c(ybVar.d());
        } finally {
            re.q.t(fVarN, fVarR, cVarE);
        }
    }

    @Override // h1.yb
    public final int d() {
        return this.f30706a.d();
    }

    @Override // h1.yb
    public final void e(int i11) {
        this.f30706a.e(i11);
    }

    @Override // h1.yb
    public final int f() {
        return this.f30706a.f();
    }

    @Override // h1.yb
    public final boolean g() {
        return this.f30706a.g();
    }

    @Override // h1.yb
    public final int h() {
        return this.f30706a.h();
    }

    @Override // h1.yb
    public final boolean i() {
        return this.f30706a.i();
    }

    public final float j(float f5) {
        float fFloatValue = ((Number) this.f30709d.d()).floatValue() - f5;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return ((Number) this.f30709d.d()).floatValue() - fFloatValue;
    }
}
