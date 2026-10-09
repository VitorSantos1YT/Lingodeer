package zx;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends qx.d implements tx.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable f59593b;

    public c(Callable callable) {
        this.f59593b = callable;
    }

    @Override // qx.d
    public final void e(n20.b bVar) {
        fy.b bVar2 = new fy.b(bVar);
        bVar.c(bVar2);
        try {
            Object objCall = this.f59593b.call();
            Objects.requireNonNull(objCall, "The callable returned a null value");
            int i11 = bVar2.get();
            do {
                n20.b bVar3 = bVar2.f28278a;
                if (i11 == 8) {
                    bVar2.f28279b = objCall;
                    bVar2.lazySet(16);
                    bVar3.onNext(null);
                    if (bVar2.get() != 4) {
                        bVar3.onComplete();
                        return;
                    }
                    return;
                }
                if ((i11 & (-3)) != 0) {
                    return;
                }
                if (i11 == 2) {
                    bVar2.lazySet(3);
                    bVar3.onNext(objCall);
                    if (bVar2.get() != 4) {
                        bVar3.onComplete();
                        return;
                    }
                    return;
                }
                bVar2.f28279b = objCall;
                if (bVar2.compareAndSet(0, 1)) {
                    return;
                } else {
                    i11 = bVar2.get();
                }
            } while (i11 != 4);
            bVar2.f28279b = null;
        } catch (Throwable th2) {
            ef.e.E(th2);
            if (bVar2.get() == 4) {
                qx.p.u(th2);
            } else {
                bVar.onError(th2);
            }
        }
    }

    @Override // tx.f
    public final Object get() throws Exception {
        Object objCall = this.f59593b.call();
        Objects.requireNonNull(objCall, "The callable returned a null value");
        return objCall;
    }
}
