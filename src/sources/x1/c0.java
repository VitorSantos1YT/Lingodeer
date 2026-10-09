package x1;

import y.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f55654o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f55655p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f55656q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public fz.c f55657r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public fz.c f55658s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f55659t;

    /* JADX WARN: Illegal instructions before constructor call */
    public c0(b bVar, fz.c cVar, fz.c cVar2, boolean z11, boolean z12) {
        fz.c cVarI;
        fz.c cVarE;
        vr.a aVar = l.f55689a;
        super(0L, j.f55681e, l.k(cVar, (bVar == null || (cVarE = bVar.e()) == null) ? l.f55698j.f55640e : cVarE, z11), l.l(cVar2, (bVar == null || (cVarI = bVar.i()) == null) ? l.f55698j.f55641f : cVarI));
        this.f55654o = bVar;
        this.f55655p = z11;
        this.f55656q = z12;
        this.f55657r = this.f55640e;
        this.f55658s = this.f55641f;
        this.f55659t = t1.e.c();
    }

    @Override // x1.b
    public final void B(j0 j0Var) {
        q.h();
        throw null;
    }

    @Override // x1.b
    public final b C(fz.c cVar, fz.c cVar2) {
        fz.c cVarK = l.k(cVar, this.f55657r, true);
        fz.c cVarL = l.l(cVar2, this.f55658s);
        return !this.f55655p ? new c0(D().C(null, cVarL), cVarK, cVarL, false, true) : D().C(cVarK, cVarL);
    }

    public final b D() {
        b bVar = this.f55654o;
        return bVar == null ? l.f55698j : bVar;
    }

    @Override // x1.b, x1.f
    public final void c() {
        b bVar;
        this.f55671c = true;
        if (!this.f55656q || (bVar = this.f55654o) == null) {
            return;
        }
        bVar.c();
    }

    @Override // x1.f
    public final j d() {
        return D().d();
    }

    @Override // x1.b, x1.f
    public final fz.c e() {
        return this.f55657r;
    }

    @Override // x1.b, x1.f
    public final boolean f() {
        return D().f();
    }

    @Override // x1.f
    public final long g() {
        return D().g();
    }

    @Override // x1.b, x1.f
    public final int h() {
        return D().h();
    }

    @Override // x1.b, x1.f
    public final fz.c i() {
        return this.f55658s;
    }

    @Override // x1.b, x1.f
    public final void k() {
        q.h();
        throw null;
    }

    @Override // x1.b, x1.f
    public final void l() {
        q.h();
        throw null;
    }

    @Override // x1.b, x1.f
    public final void m() {
        D().m();
    }

    @Override // x1.b, x1.f
    public final void n(y yVar) {
        D().n(yVar);
    }

    @Override // x1.f
    public final void r(j jVar) {
        q.h();
        throw null;
    }

    @Override // x1.f
    public final void s(long j11) {
        q.h();
        throw null;
    }

    @Override // x1.b, x1.f
    public final void t(int i11) {
        D().t(i11);
    }

    @Override // x1.b, x1.f
    public final f u(fz.c cVar) {
        fz.c cVarK = l.k(cVar, this.f55657r, true);
        return !this.f55655p ? l.g(D().u(null), cVarK, true) : D().u(cVarK);
    }

    @Override // x1.b
    public final q w() {
        return D().w();
    }

    @Override // x1.b
    public final j0 x() {
        return D().x();
    }

    @Override // x1.b
    /* JADX INFO: renamed from: y */
    public final fz.c e() {
        return this.f55657r;
    }
}
