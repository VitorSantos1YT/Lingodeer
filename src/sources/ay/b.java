package ay;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements qx.k, rx.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rx.b f3269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3270e;

    public /* synthetic */ b(qx.k kVar, tx.e eVar, int i11) {
        this.f3266a = i11;
        this.f3267b = kVar;
        this.f3268c = eVar;
    }

    @Override // rx.b
    public final boolean b() {
        switch (this.f3266a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f3269d.b();
    }

    @Override // qx.k
    public final void c(rx.b bVar) {
        switch (this.f3266a) {
            case 0:
                if (ux.b.f(this.f3269d, bVar)) {
                    this.f3269d = bVar;
                    ((qx.k) this.f3267b).c(this);
                }
                break;
            case 1:
                if (ux.b.f(this.f3269d, bVar)) {
                    this.f3269d = bVar;
                    ((qx.k) this.f3267b).c(this);
                }
                break;
            default:
                if (ux.b.f(this.f3269d, bVar)) {
                    this.f3269d = bVar;
                    ((qx.q) this.f3267b).c(this);
                }
                break;
        }
    }

    @Override // rx.b
    public final void dispose() {
        switch (this.f3266a) {
            case 0:
                this.f3269d.dispose();
                break;
            case 1:
                this.f3269d.dispose();
                break;
            default:
                this.f3269d.dispose();
                break;
        }
    }

    @Override // qx.k
    public final void onComplete() {
        switch (this.f3266a) {
            case 0:
                qx.k kVar = (qx.k) this.f3267b;
                if (!this.f3270e) {
                    this.f3270e = true;
                    kVar.onNext(Boolean.TRUE);
                    kVar.onComplete();
                    break;
                }
                break;
            case 1:
                qx.k kVar2 = (qx.k) this.f3267b;
                if (!this.f3270e) {
                    this.f3270e = true;
                    kVar2.onNext(Boolean.FALSE);
                    kVar2.onComplete();
                }
                break;
            default:
                qx.q qVar = (qx.q) this.f3267b;
                if (!this.f3270e) {
                    this.f3270e = true;
                    Object obj = this.f3268c;
                    this.f3268c = null;
                    if (obj == null) {
                        obj = null;
                    }
                    if (obj == null) {
                        qVar.onError(new NoSuchElementException());
                    } else {
                        qVar.onSuccess(obj);
                    }
                    break;
                }
                break;
        }
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        switch (this.f3266a) {
            case 0:
                if (!this.f3270e) {
                    this.f3270e = true;
                    ((qx.k) this.f3267b).onError(th2);
                } else {
                    qx.p.u(th2);
                }
                break;
            case 1:
                if (!this.f3270e) {
                    this.f3270e = true;
                    ((qx.k) this.f3267b).onError(th2);
                } else {
                    qx.p.u(th2);
                }
                break;
            default:
                if (!this.f3270e) {
                    this.f3270e = true;
                    ((qx.q) this.f3267b).onError(th2);
                } else {
                    qx.p.u(th2);
                }
                break;
        }
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        switch (this.f3266a) {
            case 0:
                qx.k kVar = (qx.k) this.f3267b;
                if (!this.f3270e) {
                    try {
                        if (!((tx.e) this.f3268c).test(obj)) {
                            this.f3270e = true;
                            this.f3269d.dispose();
                            kVar.onNext(Boolean.FALSE);
                            kVar.onComplete();
                        }
                    } catch (Throwable th2) {
                        ef.e.E(th2);
                        this.f3269d.dispose();
                        onError(th2);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                qx.k kVar2 = (qx.k) this.f3267b;
                if (!this.f3270e) {
                    try {
                        if (((tx.e) this.f3268c).test(obj)) {
                            this.f3270e = true;
                            this.f3269d.dispose();
                            kVar2.onNext(Boolean.TRUE);
                            kVar2.onComplete();
                        }
                    } catch (Throwable th3) {
                        ef.e.E(th3);
                        this.f3269d.dispose();
                        onError(th3);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!this.f3270e) {
                    if (this.f3268c == null) {
                        this.f3268c = obj;
                    } else {
                        this.f3270e = true;
                        this.f3269d.dispose();
                        ((qx.q) this.f3267b).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    }
                    break;
                }
                break;
        }
    }

    public b(qx.q qVar) {
        this.f3266a = 2;
        this.f3267b = qVar;
    }
}
