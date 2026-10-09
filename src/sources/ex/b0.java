package ex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends lx.b implements bx.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yw.d f25961f;

    public b0(n20.b bVar, yw.d dVar) {
        super(bVar);
        this.f25961f = dVar;
    }

    @Override // bx.a
    public final boolean d(Object obj) {
        if (this.f40505d) {
            return false;
        }
        int i11 = this.f40506e;
        n20.b bVar = this.f40502a;
        if (i11 != 0) {
            bVar.onNext(null);
            return true;
        }
        try {
            boolean zTest = this.f25961f.test(obj);
            if (zTest) {
                bVar.onNext(obj);
            }
            return zTest;
        } catch (Throwable th2) {
            fb.g0.D(th2);
            this.f40503b.cancel();
            onError(th2);
            return true;
        }
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (d(obj)) {
            return;
        }
        this.f40503b.request(1L);
    }

    @Override // bx.g
    public final Object poll() {
        bx.d dVar = this.f40504c;
        while (true) {
            Object objPoll = dVar.poll();
            if (objPoll == null) {
                return null;
            }
            if (this.f25961f.test(objPoll)) {
                return objPoll;
            }
            if (this.f40506e == 2) {
                dVar.request(1L);
            }
        }
    }
}
