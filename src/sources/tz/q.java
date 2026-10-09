package tz;

import fa.EQx.nuRcCS;
import hh.p0;
import kotlin.jvm.internal.z;
import qy.b0;
import rz.j2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends h {
    public final a M;

    public final Object K(Object obj, boolean z11) {
        a aVar = this.M;
        a aVar2 = a.DROP_LATEST;
        b0 b0Var = b0.f48488a;
        if (aVar == aVar2) {
            Object objI = super.i(obj);
            return (!(objI instanceof n) || (objI instanceof m)) ? objI : b0Var;
        }
        v5.n nVar = j.f52688d;
        p pVar = (p) h.f52681f.get(this);
        while (true) {
            long andIncrement = h.f52677b.getAndIncrement(this);
            long j11 = 1152921504606846975L & andIncrement;
            boolean zV = v(andIncrement, false);
            int i11 = j.f52686b;
            long j12 = i11;
            long j13 = j11 / j12;
            int i12 = (int) (j11 % j12);
            if (pVar.f55543c != j13) {
                p pVarA = h.a(this, j13, pVar);
                if (pVarA != null) {
                    pVar = pVarA;
                } else if (zV) {
                    return new m(s());
                }
            }
            int iE = h.e(this, pVar, i12, obj, j11, nVar, zV);
            if (iE == 0) {
                pVar.b();
                return b0Var;
            }
            if (iE != 1) {
                if (iE != 2) {
                    if (iE == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iE == 4) {
                        if (j11 < h.f52678c.get(this)) {
                            pVar.b();
                        }
                        return new m(s());
                    }
                    if (iE == 5) {
                        pVar.b();
                    }
                } else {
                    if (zV) {
                        pVar.i();
                        return new m(s());
                    }
                    j2 j2Var = nVar instanceof j2 ? (j2) nVar : null;
                    if (j2Var != null) {
                        j2Var.b(pVar, i12 + i11);
                    }
                    n((pVar.f55543c * j12) + ((long) i12));
                }
            }
            return b0Var;
        }
    }

    @Override // tz.h, tz.w
    public final Object f(Object obj, vy.d dVar) throws Throwable {
        if (K(obj, true) instanceof m) {
            throw s();
        }
        return b0.f48488a;
    }

    @Override // tz.h, tz.w
    public final Object i(Object obj) {
        return K(obj, false);
    }

    @Override // tz.h
    public final boolean y() {
        return this.M == a.DROP_OLDEST;
    }

    public q(int i11, a aVar) {
        super(i11);
        this.M = aVar;
        if (aVar != a.SUSPEND) {
            if (i11 >= 1) {
            } else {
                throw new IllegalArgumentException(p0.h(i11, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException((nuRcCS.TtXh + z.a(h.class).g() + " instead").toString());
        }
    }
}
