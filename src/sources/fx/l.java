package fx;

import fb.g0;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends uw.h implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable f28252a;

    public l(Callable callable) {
        this.f28252a = callable;
    }

    @Override // uw.h
    public final void c(uw.i iVar) {
        ww.d dVar = new ww.d(ax.d.f3261b);
        iVar.b(dVar);
        if (dVar.a()) {
            return;
        }
        try {
            Object objCall = this.f28252a.call();
            if (dVar.a()) {
                return;
            }
            if (objCall == null) {
                iVar.onComplete();
            } else {
                iVar.onSuccess(objCall);
            }
        } catch (Throwable th2) {
            g0.D(th2);
            if (dVar.a()) {
                qx.b.B(th2);
            } else {
                iVar.onError(th2);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f28252a.call();
    }
}
