package ex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements uw.k, n20.c, qx.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n20.b f26062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f26063c;

    public /* synthetic */ r0(n20.b bVar, int i11) {
        this.f26061a = i11;
        this.f26062b = bVar;
    }

    @Override // uw.k
    public void b(ww.b bVar) {
        this.f26063c = bVar;
        this.f26062b.c(this);
    }

    @Override // qx.k
    public void c(rx.b bVar) {
        this.f26063c = bVar;
        this.f26062b.c(this);
    }

    @Override // n20.c
    public final void cancel() {
        switch (this.f26061a) {
            case 0:
                ((ww.b) this.f26063c).dispose();
                break;
            default:
                ((rx.b) this.f26063c).dispose();
                break;
        }
    }

    @Override // uw.k
    public final void onComplete() {
        switch (this.f26061a) {
            case 0:
                this.f26062b.onComplete();
                break;
            default:
                this.f26062b.onComplete();
                break;
        }
    }

    @Override // uw.k
    public final void onError(Throwable th2) {
        switch (this.f26061a) {
            case 0:
                this.f26062b.onError(th2);
                break;
            default:
                this.f26062b.onError(th2);
                break;
        }
    }

    @Override // uw.k
    public final void onNext(Object obj) {
        switch (this.f26061a) {
            case 0:
                this.f26062b.onNext(obj);
                break;
            default:
                this.f26062b.onNext(obj);
                break;
        }
    }

    @Override // n20.c
    public final void request(long j11) {
        int i11 = this.f26061a;
    }

    private final void a(long j11) {
    }

    private final void d(long j11) {
    }
}
