package gy;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import qx.k;
import qx.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends AtomicReference {
    private static final long serialVersionUID = 3949248817947090603L;

    public final Throwable a() {
        e eVar = f.f29893a;
        Throwable th2 = (Throwable) get();
        e eVar2 = f.f29893a;
        return th2 != eVar2 ? (Throwable) getAndSet(eVar2) : th2;
    }

    public final boolean b(Throwable th2) {
        e eVar = f.f29893a;
        while (true) {
            Throwable th3 = (Throwable) get();
            if (th3 == f.f29893a) {
                p.u(th2);
                return false;
            }
            Throwable compositeException = th3 == null ? th2 : new CompositeException(th3, th2);
            while (!compareAndSet(th3, compositeException)) {
                if (get() != th3) {
                }
            }
            return true;
        }
    }

    public final void c(n20.b bVar) {
        Throwable thA = a();
        if (thA == null) {
            bVar.onComplete();
        } else if (thA != f.f29893a) {
            bVar.onError(thA);
        }
    }

    public final void d(k kVar) {
        Throwable thA = a();
        if (thA == null) {
            kVar.onComplete();
        } else if (thA != f.f29893a) {
            kVar.onError(thA);
        }
    }
}
