package fx;

import fb.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements uw.i, ww.b, uw.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw.i f28237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yw.d f28238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ww.b f28239d;

    public /* synthetic */ f(uw.i iVar, yw.d dVar, int i11) {
        this.f28236a = i11;
        this.f28237b = iVar;
        this.f28238c = dVar;
    }

    @Override // uw.i
    public final void b(ww.b bVar) {
        switch (this.f28236a) {
            case 0:
                if (zw.a.g(this.f28239d, bVar)) {
                    this.f28239d = bVar;
                    this.f28237b.b(this);
                }
                break;
            default:
                if (zw.a.g(this.f28239d, bVar)) {
                    this.f28239d = bVar;
                    this.f28237b.b(this);
                }
                break;
        }
    }

    @Override // ww.b
    public final void dispose() {
        switch (this.f28236a) {
            case 0:
                ww.b bVar = this.f28239d;
                this.f28239d = zw.a.DISPOSED;
                bVar.dispose();
                break;
            default:
                ww.b bVar2 = this.f28239d;
                this.f28239d = zw.a.DISPOSED;
                bVar2.dispose();
                break;
        }
    }

    @Override // uw.i
    public void onComplete() {
        this.f28237b.onComplete();
    }

    @Override // uw.i
    public final void onError(Throwable th2) {
        switch (this.f28236a) {
            case 0:
                this.f28237b.onError(th2);
                break;
            default:
                this.f28237b.onError(th2);
                break;
        }
    }

    @Override // uw.i
    public final void onSuccess(Object obj) {
        switch (this.f28236a) {
            case 0:
                uw.i iVar = this.f28237b;
                try {
                    if (!this.f28238c.test(obj)) {
                        iVar.onComplete();
                    } else {
                        iVar.onSuccess(obj);
                    }
                } catch (Throwable th2) {
                    g0.D(th2);
                    iVar.onError(th2);
                    return;
                }
                break;
            default:
                uw.i iVar2 = this.f28237b;
                try {
                    if (!this.f28238c.test(obj)) {
                        iVar2.onComplete();
                    } else {
                        iVar2.onSuccess(obj);
                    }
                } catch (Throwable th3) {
                    g0.D(th3);
                    iVar2.onError(th3);
                }
                break;
        }
    }
}
