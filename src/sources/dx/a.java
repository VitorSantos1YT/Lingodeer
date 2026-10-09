package dx;

import java.util.concurrent.atomic.AtomicReference;
import ob.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends AtomicReference implements uw.c, ww.b {
    private static final long serialVersionUID = -4101678820158072998L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw.c f24534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw.b f24535b;

    public a(uw.c cVar, uw.b bVar) {
        this.f24534a = cVar;
        this.f24535b = bVar;
    }

    @Override // uw.c, uw.p
    public final void b(ww.b bVar) {
        if (zw.a.f(this, bVar)) {
            this.f24534a.b(this);
        }
    }

    @Override // ww.b
    public final void dispose() {
        zw.a.a(this);
    }

    @Override // uw.c
    public final void onComplete() {
        this.f24535b.c(new l(6, this, this.f24534a));
    }

    @Override // uw.c, uw.p
    public final void onError(Throwable th2) {
        this.f24534a.onError(th2);
    }
}
