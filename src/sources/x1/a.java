package x1;

import l1.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    @Override // x1.b
    public final b C(fz.c cVar, fz.c cVar2) {
        return (b) ((f) l.e(new uu.b(new av.r(21, cVar, cVar2), 7)));
    }

    @Override // x1.b, x1.f
    public final void c() {
        synchronized (l.f55691c) {
            o();
        }
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
        l.a();
    }

    @Override // x1.b, x1.f
    public final f u(fz.c cVar) {
        return (e) ((f) l.e(new uu.b(new x0(cVar, 1), 7)));
    }

    @Override // x1.b
    public final q w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
