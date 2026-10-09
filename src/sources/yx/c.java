package yx;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends AtomicReference implements qx.c, rx.b, Runnable {
    private static final long serialVersionUID = 7000911171163930287L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f58365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ux.d f58366b = new ux.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qx.b f58367c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(qx.c cVar, qx.b bVar) {
        this.f58365a = (AtomicReference) cVar;
        this.f58367c = bVar;
    }

    @Override // rx.b
    public final boolean b() {
        return ((rx.b) get()) == ux.b.DISPOSED;
    }

    @Override // qx.c
    public final void c(rx.b bVar) {
        ux.b.e(this, bVar);
    }

    @Override // rx.b
    public final void dispose() {
        ux.b.a(this);
        ux.d dVar = this.f58366b;
        dVar.getClass();
        ux.b.a(dVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicReference, qx.c] */
    @Override // qx.c
    public final void onComplete() {
        this.f58365a.onComplete();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicReference, qx.c] */
    @Override // qx.c
    public final void onError(Throwable th2) {
        this.f58365a.onError(th2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f58367c.K(this);
    }
}
