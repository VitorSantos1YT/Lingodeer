package uw;

import fb.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o {
    public final void a(p pVar) {
        try {
            b(pVar);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            g0.D(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void b(p pVar);
}
