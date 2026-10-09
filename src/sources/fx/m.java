package fx;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements uw.c, ww.b, uw.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f28254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ww.b f28255c;

    public /* synthetic */ m(Object obj, int i11) {
        this.f28253a = i11;
        this.f28254b = obj;
    }

    @Override // uw.c, uw.p
    public final void b(ww.b bVar) {
        switch (this.f28253a) {
            case 0:
                if (zw.a.g(this.f28255c, bVar)) {
                    this.f28255c = bVar;
                    ((uw.i) this.f28254b).b(this);
                }
                break;
            case 1:
                if (zw.a.g(this.f28255c, bVar)) {
                    this.f28255c = bVar;
                    ((uw.i) this.f28254b).b(this);
                }
                break;
            default:
                if (zw.a.g(this.f28255c, bVar)) {
                    this.f28255c = bVar;
                    ((uw.p) this.f28254b).b(this);
                }
                break;
        }
    }

    @Override // ww.b
    public final void dispose() {
        switch (this.f28253a) {
            case 0:
                this.f28255c.dispose();
                this.f28255c = zw.a.DISPOSED;
                break;
            case 1:
                this.f28255c.dispose();
                break;
            default:
                this.f28255c.dispose();
                this.f28255c = zw.a.DISPOSED;
                break;
        }
    }

    @Override // uw.c
    public final void onComplete() {
        switch (this.f28253a) {
            case 0:
                this.f28255c = zw.a.DISPOSED;
                ((uw.i) this.f28254b).onComplete();
                break;
            case 1:
                ((uw.i) this.f28254b).onSuccess(Boolean.TRUE);
                break;
            default:
                this.f28255c = zw.a.DISPOSED;
                ((uw.p) this.f28254b).onSuccess(Boolean.TRUE);
                break;
        }
    }

    @Override // uw.c, uw.p
    public final void onError(Throwable th2) {
        switch (this.f28253a) {
            case 0:
                this.f28255c = zw.a.DISPOSED;
                ((uw.i) this.f28254b).onError(th2);
                break;
            case 1:
                ((uw.i) this.f28254b).onError(th2);
                break;
            default:
                this.f28255c = zw.a.DISPOSED;
                ((uw.p) this.f28254b).onError(th2);
                break;
        }
    }

    @Override // uw.i
    public void onSuccess(Object obj) {
        switch (this.f28253a) {
            case 1:
                ((uw.i) this.f28254b).onSuccess(Boolean.FALSE);
                break;
            default:
                this.f28255c = zw.a.DISPOSED;
                ((uw.p) this.f28254b).onSuccess(Boolean.FALSE);
                break;
        }
    }
}
