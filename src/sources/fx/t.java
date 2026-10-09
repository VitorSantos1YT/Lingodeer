package fx;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends AtomicReference implements uw.i, ww.b {
    private static final long serialVersionUID = 8571289934935992137L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zw.c f28267a = new zw.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw.i f28268b;

    public t(uw.i iVar) {
        this.f28268b = iVar;
    }

    @Override // uw.i
    public final void b(ww.b bVar) {
        zw.a.f(this, bVar);
    }

    @Override // ww.b
    public final void dispose() {
        zw.a.a(this);
        zw.c cVar = this.f28267a;
        cVar.getClass();
        zw.a.a(cVar);
    }

    @Override // uw.i
    public final void onComplete() {
        this.f28268b.onComplete();
    }

    @Override // uw.i
    public final void onError(Throwable th2) {
        this.f28268b.onError(th2);
    }

    @Override // uw.i
    public final void onSuccess(Object obj) {
        this.f28268b.onSuccess(obj);
    }
}
