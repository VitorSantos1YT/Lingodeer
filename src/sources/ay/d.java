package ay;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements qx.k, rx.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qx.q f3277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tx.e f3278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rx.b f3279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3280e;

    public /* synthetic */ d(qx.q qVar, tx.e eVar, int i11) {
        this.f3276a = i11;
        this.f3277b = qVar;
        this.f3278c = eVar;
    }

    @Override // rx.b
    public final boolean b() {
        switch (this.f3276a) {
            case 0:
                break;
        }
        return this.f3279d.b();
    }

    @Override // qx.k
    public final void c(rx.b bVar) {
        switch (this.f3276a) {
            case 0:
                if (ux.b.f(this.f3279d, bVar)) {
                    this.f3279d = bVar;
                    this.f3277b.c(this);
                }
                break;
            default:
                if (ux.b.f(this.f3279d, bVar)) {
                    this.f3279d = bVar;
                    this.f3277b.c(this);
                }
                break;
        }
    }

    @Override // rx.b
    public final void dispose() {
        switch (this.f3276a) {
            case 0:
                this.f3279d.dispose();
                break;
            default:
                this.f3279d.dispose();
                break;
        }
    }

    @Override // qx.k
    public final void onComplete() {
        switch (this.f3276a) {
            case 0:
                if (!this.f3280e) {
                    this.f3280e = true;
                    this.f3277b.onSuccess(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (!this.f3280e) {
                    this.f3280e = true;
                    this.f3277b.onSuccess(Boolean.FALSE);
                }
                break;
        }
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        switch (this.f3276a) {
            case 0:
                if (!this.f3280e) {
                    this.f3280e = true;
                    this.f3277b.onError(th2);
                } else {
                    qx.p.u(th2);
                }
                break;
            default:
                if (!this.f3280e) {
                    this.f3280e = true;
                    this.f3277b.onError(th2);
                } else {
                    qx.p.u(th2);
                }
                break;
        }
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        switch (this.f3276a) {
            case 0:
                if (!this.f3280e) {
                    try {
                        if (!this.f3278c.test(obj)) {
                            this.f3280e = true;
                            this.f3279d.dispose();
                            this.f3277b.onSuccess(Boolean.FALSE);
                        }
                    } catch (Throwable th2) {
                        ef.e.E(th2);
                        this.f3279d.dispose();
                        onError(th2);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!this.f3280e) {
                    try {
                        if (this.f3278c.test(obj)) {
                            this.f3280e = true;
                            this.f3279d.dispose();
                            this.f3277b.onSuccess(Boolean.TRUE);
                        }
                    } catch (Throwable th3) {
                        ef.e.E(th3);
                        this.f3279d.dispose();
                        onError(th3);
                    }
                    break;
                }
                break;
        }
    }
}
