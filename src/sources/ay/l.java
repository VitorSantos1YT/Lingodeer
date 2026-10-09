package ay;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends AtomicReference implements qx.k {
    private static final long serialVersionUID = 2620149119579502636L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.k f3338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f3339b;

    public l(qx.k kVar, m mVar) {
        this.f3338a = kVar;
        this.f3339b = mVar;
    }

    @Override // qx.k
    public final void c(rx.b bVar) {
        ux.b.c(this, bVar);
    }

    @Override // qx.k
    public final void onComplete() {
        m mVar = this.f3339b;
        mVar.K = false;
        mVar.a();
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        m mVar = this.f3339b;
        if (mVar.f3345d.b(th2)) {
            if (!mVar.f3347f) {
                mVar.H.dispose();
            }
            mVar.K = false;
            mVar.a();
        }
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        this.f3338a.onNext(obj);
    }
}
