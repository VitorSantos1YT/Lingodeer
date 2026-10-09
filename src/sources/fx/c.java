package fx;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends AtomicReference implements ww.b {
    private static final long serialVersionUID = -2467358622224974244L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw.i f28232a;

    public c(uw.i iVar) {
        this.f28232a = iVar;
    }

    public final void a() {
        ww.b bVar;
        Object obj = get();
        zw.a aVar = zw.a.DISPOSED;
        if (obj == aVar || (bVar = (ww.b) getAndSet(aVar)) == aVar) {
            return;
        }
        try {
            this.f28232a.onComplete();
        } finally {
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    public final void b(Throwable th2) {
        ww.b bVar;
        Throwable nullPointerException = th2 == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th2;
        Object obj = get();
        zw.a aVar = zw.a.DISPOSED;
        if (obj == aVar || (bVar = (ww.b) getAndSet(aVar)) == aVar) {
            qx.b.B(th2);
            return;
        }
        try {
            this.f28232a.onError(nullPointerException);
        } finally {
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    @Override // ww.b
    public final void dispose() {
        zw.a.a(this);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return nv.p.r(c.class.getSimpleName(), "{", super.toString(), "}");
    }
}
