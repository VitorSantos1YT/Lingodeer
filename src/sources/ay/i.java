package ay;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements qx.k, rx.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tx.b f3322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rx.b f3324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3326f;

    public /* synthetic */ i(Object obj, Object obj2, tx.b bVar, int i11) {
        this.f3321a = i11;
        this.f3326f = obj;
        this.f3322b = bVar;
        this.f3323c = obj2;
    }

    @Override // rx.b
    public final boolean b() {
        switch (this.f3321a) {
            case 0:
                break;
        }
        return this.f3324d.b();
    }

    @Override // qx.k
    public final void c(rx.b bVar) {
        switch (this.f3321a) {
            case 0:
                if (ux.b.f(this.f3324d, bVar)) {
                    this.f3324d = bVar;
                    ((qx.k) this.f3326f).c(this);
                }
                break;
            default:
                if (ux.b.f(this.f3324d, bVar)) {
                    this.f3324d = bVar;
                    ((qx.q) this.f3326f).c(this);
                }
                break;
        }
    }

    @Override // rx.b
    public final void dispose() {
        switch (this.f3321a) {
            case 0:
                this.f3324d.dispose();
                break;
            default:
                this.f3324d.dispose();
                break;
        }
    }

    @Override // qx.k
    public final void onComplete() {
        switch (this.f3321a) {
            case 0:
                qx.k kVar = (qx.k) this.f3326f;
                if (!this.f3325e) {
                    this.f3325e = true;
                    kVar.onNext(this.f3323c);
                    kVar.onComplete();
                    break;
                }
                break;
            default:
                if (!this.f3325e) {
                    this.f3325e = true;
                    ((qx.q) this.f3326f).onSuccess(this.f3323c);
                    break;
                }
                break;
        }
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        switch (this.f3321a) {
            case 0:
                if (!this.f3325e) {
                    this.f3325e = true;
                    ((qx.k) this.f3326f).onError(th2);
                } else {
                    qx.p.u(th2);
                }
                break;
            default:
                if (!this.f3325e) {
                    this.f3325e = true;
                    ((qx.q) this.f3326f).onError(th2);
                } else {
                    qx.p.u(th2);
                }
                break;
        }
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        switch (this.f3321a) {
            case 0:
                if (!this.f3325e) {
                    try {
                        this.f3322b.accept(this.f3323c, obj);
                    } catch (Throwable th2) {
                        ef.e.E(th2);
                        this.f3324d.dispose();
                        onError(th2);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!this.f3325e) {
                    try {
                        this.f3322b.accept(this.f3323c, obj);
                    } catch (Throwable th3) {
                        ef.e.E(th3);
                        this.f3324d.dispose();
                        onError(th3);
                    }
                    break;
                }
                break;
        }
    }
}
