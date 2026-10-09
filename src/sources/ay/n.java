package ay;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends AtomicReference implements qx.k {
    private static final long serialVersionUID = -7449079488798789337L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hy.a f3351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f3352b;

    public n(hy.a aVar, o oVar) {
        this.f3351a = aVar;
        this.f3352b = oVar;
    }

    @Override // qx.k
    public final void c(rx.b bVar) {
        ux.b.c(this, bVar);
    }

    @Override // qx.k
    public final void onComplete() {
        o oVar = this.f3352b;
        oVar.f3363t = false;
        oVar.a();
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        this.f3352b.dispose();
        this.f3351a.onError(th2);
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        this.f3351a.onNext(obj);
    }
}
