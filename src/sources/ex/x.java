package ex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements uw.g, ww.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw.i f26084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n20.c f26085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f26086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26087d;

    public x(uw.i iVar) {
        this.f26084a = iVar;
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (mx.g.e(this.f26085b, cVar)) {
            this.f26085b = cVar;
            this.f26084a.b(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // ww.b
    public final void dispose() {
        this.f26085b.cancel();
        this.f26085b = mx.g.CANCELLED;
    }

    @Override // n20.b
    public final void onComplete() {
        this.f26085b = mx.g.CANCELLED;
        if (this.f26087d) {
            return;
        }
        this.f26087d = true;
        this.f26084a.onComplete();
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        if (this.f26087d) {
            qx.b.B(th2);
            return;
        }
        this.f26087d = true;
        this.f26085b = mx.g.CANCELLED;
        this.f26084a.onError(th2);
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (this.f26087d) {
            return;
        }
        long j11 = this.f26086c;
        if (j11 != 0) {
            this.f26086c = j11 + 1;
            return;
        }
        this.f26087d = true;
        this.f26085b.cancel();
        this.f26085b = mx.g.CANCELLED;
        this.f26084a.onSuccess(obj);
    }
}
