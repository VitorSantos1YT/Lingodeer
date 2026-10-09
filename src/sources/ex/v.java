package ex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends mx.c implements uw.g {
    private static final long serialVersionUID = 4066607327284737757L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n20.c f26080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26082e;

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (mx.g.e(this.f26080c, cVar)) {
            this.f26080c = cVar;
            this.f42879a.c(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // n20.c
    public final void cancel() {
        set(4);
        this.f42880b = null;
        this.f26080c.cancel();
    }

    @Override // n20.b
    public final void onComplete() {
        if (this.f26082e) {
            return;
        }
        this.f26082e = true;
        this.f42879a.onComplete();
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        if (this.f26082e) {
            qx.b.B(th2);
        } else {
            this.f26082e = true;
            this.f42879a.onError(th2);
        }
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (this.f26082e) {
            return;
        }
        long j11 = this.f26081d;
        if (j11 != 0) {
            this.f26081d = j11 + 1;
            return;
        }
        this.f26082e = true;
        this.f26080c.cancel();
        e(obj);
    }
}
