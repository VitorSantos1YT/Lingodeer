package ay;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements qx.k, rx.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.k f3353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rx.b f3355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3356d;

    public n0(qx.k kVar, long j11) {
        this.f3353a = kVar;
        this.f3356d = j11;
    }

    @Override // rx.b
    public final boolean b() {
        return this.f3355c.b();
    }

    @Override // qx.k
    public final void c(rx.b bVar) {
        if (ux.b.f(this.f3355c, bVar)) {
            this.f3355c = bVar;
            long j11 = this.f3356d;
            qx.k kVar = this.f3353a;
            if (j11 != 0) {
                kVar.c(this);
                return;
            }
            this.f3354b = true;
            bVar.dispose();
            ux.c.c(kVar);
        }
    }

    @Override // rx.b
    public final void dispose() {
        this.f3355c.dispose();
    }

    @Override // qx.k
    public final void onComplete() {
        if (this.f3354b) {
            return;
        }
        this.f3354b = true;
        this.f3355c.dispose();
        this.f3353a.onComplete();
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        if (this.f3354b) {
            qx.p.u(th2);
            return;
        }
        this.f3354b = true;
        this.f3355c.dispose();
        this.f3353a.onError(th2);
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        if (this.f3354b) {
            return;
        }
        long j11 = this.f3356d;
        long j12 = j11 - 1;
        this.f3356d = j12;
        if (j11 > 0) {
            boolean z11 = j12 == 0;
            this.f3353a.onNext(obj);
            if (z11) {
                onComplete();
            }
        }
    }
}
