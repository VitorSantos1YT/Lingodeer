package xx;

import java.util.concurrent.CountDownLatch;
import qx.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends CountDownLatch implements q, qx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f56634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f56635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rx.b f56636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f56637d;

    @Override // qx.q
    public final void c(rx.b bVar) {
        this.f56636c = bVar;
        if (this.f56637d) {
            bVar.dispose();
        }
    }

    @Override // qx.c
    public final void onComplete() {
        countDown();
    }

    @Override // qx.q
    public final void onError(Throwable th2) {
        this.f56635b = th2;
        countDown();
    }

    @Override // qx.q
    public final void onSuccess(Object obj) {
        this.f56634a = obj;
        countDown();
    }
}
