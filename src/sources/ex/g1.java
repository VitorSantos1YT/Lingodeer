package ex;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g1 extends mx.c implements uw.g, n20.c {
    private static final long serialVersionUID = -8134157938864266736L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n20.c f26012c;

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (mx.g.e(this.f26012c, cVar)) {
            this.f26012c = cVar;
            this.f42879a.c(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // n20.c
    public final void cancel() {
        set(4);
        this.f42880b = null;
        this.f26012c.cancel();
    }

    @Override // n20.b
    public final void onComplete() {
        e(this.f42880b);
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        this.f42880b = null;
        this.f42879a.onError(th2);
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        Collection collection = (Collection) this.f42880b;
        if (collection != null) {
            collection.add(obj);
        }
    }
}
