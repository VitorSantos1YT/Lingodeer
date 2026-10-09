package ay;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends AtomicReference implements rx.b, Runnable {
    private static final long serialVersionUID = 346773832286157679L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.k f3274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3275b;

    public c0(qx.k kVar) {
        this.f3274a = kVar;
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
        if (get() != ux.b.DISPOSED) {
            long j11 = this.f3275b;
            this.f3275b = 1 + j11;
            this.f3274a.onNext(Long.valueOf(j11));
        }
    }
}
