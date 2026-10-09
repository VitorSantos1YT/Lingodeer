package uw;

import ex.c1;
import ex.f1;
import ex.i0;
import fb.g0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements n20.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f53244a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @Override // n20.a
    public final void a(n20.b bVar) {
        if (bVar instanceof g) {
            d((g) bVar);
        } else {
            ax.d.a(bVar, "s is null");
            d(new lx.d(bVar));
        }
    }

    public final i0 b(yw.c cVar) {
        ax.d.a(cVar, "mapper is null");
        ax.d.b(Integer.MAX_VALUE, "maxConcurrency");
        return new i0(this, cVar);
    }

    public final f1 c() {
        int i11 = f53244a;
        ax.d.b(i11, "bufferSize");
        AtomicReference atomicReference = new AtomicReference();
        return new f1(new c1(atomicReference, i11), this, atomicReference, i11);
    }

    public final void d(g gVar) {
        ax.d.a(gVar, "s is null");
        try {
            e(gVar);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            g0.D(th2);
            qx.b.B(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void e(n20.b bVar);
}
