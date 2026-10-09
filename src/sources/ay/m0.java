package ay;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends AtomicReference implements qx.k, rx.b {
    private static final long serialVersionUID = 8094547886072529208L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.k f3349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f3350b = new AtomicReference();

    public m0(qx.k kVar) {
        this.f3349a = kVar;
    }

    @Override // rx.b
    public final boolean b() {
        return ((rx.b) get()) == ux.b.DISPOSED;
    }

    @Override // qx.k
    public final void c(rx.b bVar) {
        ux.b.e(this.f3350b, bVar);
    }

    @Override // rx.b
    public final void dispose() {
        ux.b.a(this.f3350b);
        ux.b.a(this);
    }

    @Override // qx.k
    public final void onComplete() {
        this.f3349a.onComplete();
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        this.f3349a.onError(th2);
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        this.f3349a.onNext(obj);
    }
}
