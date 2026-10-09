package qx;

import java.util.Objects;
import zx.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements n20.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f48466a = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    @Override // n20.a
    public final void a(n20.b bVar) {
        if (bVar instanceof e) {
            d((e) bVar);
        } else {
            Objects.requireNonNull(bVar, "subscriber is null");
            d(new ey.b(bVar));
        }
    }

    public final zx.j b(o oVar) {
        int i11 = f48466a;
        vx.b.a(i11, "bufferSize");
        return new zx.j(this, oVar, i11);
    }

    public final rx.b c(tx.c cVar, tx.c cVar2) {
        ey.a aVar = new ey.a(cVar, cVar2, zx.e.INSTANCE);
        d(aVar);
        return aVar;
    }

    public final void d(e eVar) {
        Objects.requireNonNull(eVar, "subscriber is null");
        try {
            e(eVar);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            throw w4.c.d(th2, th2, "Actually not, but can't throw other exceptions due to RS", th2);
        }
    }

    public abstract void e(n20.b bVar);

    public final s f(o oVar) {
        Objects.requireNonNull(oVar, "scheduler is null");
        return new s(this, oVar);
    }
}
