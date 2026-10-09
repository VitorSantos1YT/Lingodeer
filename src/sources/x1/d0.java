package x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f55662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f55663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f55664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fz.c f55665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f55666i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f fVar, fz.c cVar, boolean z11, boolean z12) {
        fz.c cVarE;
        super(0L, j.f55681e);
        vr.a aVar = l.f55689a;
        this.f55662e = fVar;
        this.f55663f = z11;
        this.f55664g = z12;
        this.f55665h = l.k(cVar, (fVar == null || (cVarE = fVar.e()) == null) ? l.f55698j.f55640e : cVarE, z11);
        this.f55666i = t1.e.c();
    }

    @Override // x1.f
    public final void c() {
        f fVar;
        this.f55671c = true;
        if (!this.f55664g || (fVar = this.f55662e) == null) {
            return;
        }
        fVar.c();
    }

    @Override // x1.f
    public final j d() {
        return v().d();
    }

    @Override // x1.f
    public final fz.c e() {
        return this.f55665h;
    }

    @Override // x1.f
    public final boolean f() {
        return v().f();
    }

    @Override // x1.f
    public final long g() {
        return v().g();
    }

    @Override // x1.f
    public final fz.c i() {
        return null;
    }

    @Override // x1.f
    public final void k() {
        q.h();
        throw null;
    }

    @Override // x1.f
    public final void l() {
        q.h();
        throw null;
    }

    @Override // x1.f
    public final void m() {
        v().m();
    }

    @Override // x1.f
    public final void n(y yVar) {
        v().n(yVar);
    }

    @Override // x1.f
    public final f u(fz.c cVar) {
        fz.c cVarK = l.k(cVar, this.f55665h, true);
        return !this.f55663f ? l.g(v().u(null), cVarK, true) : v().u(cVarK);
    }

    public final f v() {
        f fVar = this.f55662e;
        return fVar == null ? l.f55698j : fVar;
    }
}
