package yx;

import java.util.concurrent.atomic.AtomicReference;
import qx.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends AtomicReference implements qx.c, rx.b, Runnable {
    private static final long serialVersionUID = 8571289934935992137L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f58362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f58363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f58364c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(qx.c cVar, o oVar) {
        this.f58362a = (AtomicReference) cVar;
        this.f58363b = oVar;
    }

    @Override // rx.b
    public final boolean b() {
        return ((rx.b) get()) == ux.b.DISPOSED;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.atomic.AtomicReference, qx.c] */
    @Override // qx.c
    public final void c(rx.b bVar) {
        if (ux.b.e(this, bVar)) {
            this.f58362a.c(this);
        }
    }

    @Override // rx.b
    public final void dispose() {
        ux.b.a(this);
    }

    @Override // qx.c
    public final void onComplete() {
        ux.b.c(this, this.f58363b.b(this));
    }

    @Override // qx.c
    public final void onError(Throwable th2) {
        this.f58364c = th2;
        ux.b.c(this, this.f58363b.b(this));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.atomic.AtomicReference, qx.c] */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable th2 = this.f58364c;
        ?? r9 = this.f58362a;
        if (th2 == null) {
            r9.onComplete();
        } else {
            this.f58364c = null;
            r9.onError(th2);
        }
    }
}
