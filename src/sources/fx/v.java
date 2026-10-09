package fx;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends mx.c implements uw.i {
    private static final long serialVersionUID = 7603343402964826922L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ww.b f28271c;

    @Override // uw.i
    public final void b(ww.b bVar) {
        if (zw.a.g(this.f28271c, bVar)) {
            this.f28271c = bVar;
            this.f42879a.c(this);
        }
    }

    @Override // n20.c
    public final void cancel() {
        set(4);
        this.f42880b = null;
        this.f28271c.dispose();
    }

    @Override // uw.i
    public final void onComplete() {
        this.f42879a.onComplete();
    }

    @Override // uw.i
    public final void onError(Throwable th2) {
        this.f42879a.onError(th2);
    }
}
