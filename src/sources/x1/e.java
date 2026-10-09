package x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fz.c f55667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f55668f;

    public e(long j11, j jVar, fz.c cVar) {
        super(j11, jVar);
        this.f55667e = cVar;
        this.f55668f = 1;
    }

    @Override // x1.f
    public final void c() {
        if (this.f55671c) {
            return;
        }
        l();
        this.f55671c = true;
        synchronized (l.f55691c) {
            o();
        }
    }

    @Override // x1.f
    public final fz.c e() {
        return this.f55667e;
    }

    @Override // x1.f
    public final boolean f() {
        return true;
    }

    @Override // x1.f
    public final fz.c i() {
        return null;
    }

    @Override // x1.f
    public final void k() {
        this.f55668f++;
    }

    @Override // x1.f
    public final void l() {
        int i11 = this.f55668f - 1;
        this.f55668f = i11;
        if (i11 == 0) {
            a();
        }
    }

    @Override // x1.f
    public final void n(y yVar) {
        vr.a aVar = l.f55689a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // x1.f
    public final f u(fz.c cVar) {
        l.c(this);
        return new d(this.f55670b, this.f55669a, l.k(cVar, this.f55667e, true), this);
    }

    @Override // x1.f
    public final void m() {
    }
}
