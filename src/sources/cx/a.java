package cx;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;
import uw.c;
import ww.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends AtomicReference implements c, b {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // uw.c, uw.p
    public final void b(b bVar) {
        zw.a.f(this, bVar);
    }

    @Override // ww.b
    public final void dispose() {
        zw.a.a(this);
    }

    @Override // uw.c
    public final void onComplete() {
        lazySet(zw.a.DISPOSED);
    }

    @Override // uw.c, uw.p
    public final void onError(Throwable th2) {
        lazySet(zw.a.DISPOSED);
        qx.b.B(new OnErrorNotImplementedException(th2));
    }
}
