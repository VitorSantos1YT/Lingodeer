package dy;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends a implements Callable {
    private static final long serialVersionUID = 1811839108042568751L;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = a.f24552d;
        this.f24556c = Thread.currentThread();
        try {
            try {
                this.f24554a.run();
                return null;
            } finally {
                lazySet(futureTask);
                this.f24556c = null;
            }
        } catch (Throwable th2) {
            qx.p.u(th2);
            throw th2;
        }
    }
}
