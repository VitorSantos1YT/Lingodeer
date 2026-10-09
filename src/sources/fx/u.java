package fx;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends AtomicReference implements uw.i, ww.b {
    private static final long serialVersionUID = -2223459372976438024L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw.i f28269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw.h f28270b;

    public u(uw.i iVar, uw.h hVar) {
        this.f28269a = iVar;
        this.f28270b = hVar;
    }

    @Override // uw.i
    public final void b(ww.b bVar) {
        if (zw.a.f(this, bVar)) {
            this.f28269a.b(this);
        }
    }

    @Override // ww.b
    public final void dispose() {
        zw.a.a(this);
    }

    @Override // uw.i
    public final void onComplete() {
        ww.b bVar = (ww.b) get();
        if (bVar == zw.a.DISPOSED || !compareAndSet(bVar, null)) {
            return;
        }
        this.f28270b.b(new ob.l(9, this.f28269a, this));
    }

    @Override // uw.i
    public final void onError(Throwable th2) {
        this.f28269a.onError(th2);
    }

    @Override // uw.i
    public final void onSuccess(Object obj) {
        this.f28269a.onSuccess(obj);
    }
}
