package uw;

import fb.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public final dx.f a(yw.a aVar) {
        return new dx.f(this, ax.d.f3263d, aVar);
    }

    public final void b() {
        c(new cx.a());
    }

    public final void c(c cVar) {
        try {
            d(cVar);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            g0.D(th2);
            qx.b.B(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void d(c cVar);

    public final h e() {
        return new fx.d(this, 1);
    }
}
