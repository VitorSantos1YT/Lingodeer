package ex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends mx.f implements uw.g {
    private static final long serialVersionUID = 897683679971470653L;
    public final c H;
    public long K;

    public f(c cVar) {
        this.H = cVar;
    }

    @Override // n20.b
    public final void onComplete() {
        long j11 = this.K;
        if (j11 != 0) {
            this.K = 0L;
            e(j11);
        }
        c cVar = this.H;
        cVar.M = false;
        cVar.e();
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        long j11 = this.K;
        if (j11 != 0) {
            this.K = 0L;
            e(j11);
        }
        this.H.b(th2);
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        this.K++;
        this.H.a(obj);
    }
}
