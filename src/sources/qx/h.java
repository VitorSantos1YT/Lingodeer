package qx;

import ay.d0;
import ay.e0;
import ay.g0;
import ay.j0;
import ay.o0;
import ay.q0;
import ay.s;
import ay.w;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h<T> implements i {
    public static d0 d(long j11, long j12, TimeUnit timeUnit, o oVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(oVar, "scheduler is null");
        return new d0(Math.max(0L, j11), Math.max(0L, j12), timeUnit, oVar);
    }

    public static e0 e(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new e0(obj);
    }

    public static q0 m(long j11, TimeUnit timeUnit, o oVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(oVar, "scheduler is null");
        return new q0(Math.max(j11, 0L), timeUnit, oVar);
    }

    public final h a(j jVar) {
        Objects.requireNonNull(jVar, "composer is null");
        i iVarApply = jVar.apply(this);
        Objects.requireNonNull(iVarApply, "source is null");
        return iVarApply instanceof h ? (h) iVarApply : new w(iVarApply, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h b(tx.d dVar, int i11) {
        int i12 = d.f48466a;
        vx.b.a(i11, "maxConcurrency");
        vx.b.a(i12, "bufferSize");
        if (!(this instanceof iy.d)) {
            return new ay.h(this, dVar, i11, i12);
        }
        Object obj = ((iy.d) this).get();
        return obj == null ? s.f3381a : new j0(obj, dVar);
    }

    public final g0 f(tx.d dVar) {
        Objects.requireNonNull(dVar, "mapper is null");
        return new g0(this, dVar, 0);
    }

    public final ay.p g(o oVar) {
        int i11 = d.f48466a;
        vx.b.a(i11, "bufferSize");
        return new ay.p(this, oVar, i11);
    }

    public final xx.f h(tx.c cVar, tx.c cVar2) {
        Objects.requireNonNull(cVar, "onNext is null");
        Objects.requireNonNull(cVar2, "onError is null");
        xx.f fVar = new xx.f(cVar, cVar2);
        i(fVar);
        return fVar;
    }

    public final void i(k kVar) {
        Objects.requireNonNull(kVar, "observer is null");
        try {
            j(kVar);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            throw w4.c.d(th2, th2, "Actually not, but can't throw other exceptions due to RS", th2);
        }
    }

    public abstract void j(k kVar);

    public final g0 k(o oVar) {
        Objects.requireNonNull(oVar, "scheduler is null");
        return new g0(this, oVar, 1);
    }

    public final o0 l(long j11) {
        if (j11 >= 0) {
            return new o0(this, j11);
        }
        throw new IllegalArgumentException(defpackage.e.h(j11, "count >= 0 required but it was "));
    }
}
