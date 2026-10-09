package xx;

import java.util.concurrent.atomic.AtomicReference;
import qx.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends AtomicReference implements qx.c, rx.b {
    private static final long serialVersionUID = -4361286194466301354L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tx.c f56638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tx.a f56639b;

    public d(tx.c cVar, tx.a aVar) {
        this.f56638a = cVar;
        this.f56639b = aVar;
    }

    @Override // rx.b
    public final boolean b() {
        return get() == ux.b.DISPOSED;
    }

    @Override // qx.c
    public final void c(rx.b bVar) {
        ux.b.e(this, bVar);
    }

    @Override // rx.b
    public final void dispose() {
        ux.b.a(this);
    }

    @Override // qx.c
    public final void onComplete() {
        try {
            this.f56639b.run();
        } catch (Throwable th2) {
            ef.e.E(th2);
            p.u(th2);
        }
        lazySet(ux.b.DISPOSED);
    }

    @Override // qx.c
    public final void onError(Throwable th2) {
        try {
            this.f56638a.accept(th2);
        } catch (Throwable th3) {
            ef.e.E(th3);
            p.u(th3);
        }
        lazySet(ux.b.DISPOSED);
    }
}
