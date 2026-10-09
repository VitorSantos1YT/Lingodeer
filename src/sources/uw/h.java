package uw;

import fb.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {
    public static h a(Object obj) {
        ax.d.a(obj, "item is null");
        return new fx.p(obj);
    }

    public final void b(i iVar) {
        ax.d.a(iVar, "observer is null");
        try {
            c(iVar);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            g0.D(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void c(i iVar);

    public final h d(h hVar) {
        ax.d.a(hVar, "other is null");
        return new fx.g(this, hVar, 2);
    }
}
