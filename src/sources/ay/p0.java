package ay;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends AtomicReference implements rx.b, Runnable {
    private static final long serialVersionUID = -2809475196591179431L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.k f3368a;

    public p0(qx.k kVar) {
        this.f3368a = kVar;
    }

    @Override // rx.b
    public final boolean b() {
        return get() == ux.b.DISPOSED;
    }

    @Override // rx.b
    public final void dispose() {
        ux.b.a(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (b()) {
            return;
        }
        qx.k kVar = this.f3368a;
        kVar.onNext(0L);
        lazySet(ux.c.INSTANCE);
        kVar.onComplete();
    }
}
