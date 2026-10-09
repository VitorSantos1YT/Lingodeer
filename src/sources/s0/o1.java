package s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.u0 f51124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w2.x f51125b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w2.x f51126c;

    public o1(j3.u0 u0Var, w2.x xVar) {
        this.f51124a = u0Var;
        this.f51126c = xVar;
    }

    public final long a(long j11) {
        f2.c cVarE;
        w2.x xVar = this.f51125b;
        f2.c cVar = f2.c.f26571e;
        if (xVar != null) {
            if (xVar.k()) {
                w2.x xVar2 = this.f51126c;
                cVarE = xVar2 != null ? xVar2.E(xVar, true) : null;
            } else {
                cVarE = cVar;
            }
            if (cVarE != null) {
                cVar = cVarE;
            }
        }
        int i11 = (int) (j11 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        float fIntBitsToFloat2 = cVar.f26572a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i11);
            fIntBitsToFloat2 = cVar.f26574c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i11);
            }
        }
        int i12 = (int) (j11 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i12);
        float fIntBitsToFloat5 = cVar.f26573b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i12);
            fIntBitsToFloat5 = cVar.f26575d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i12);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j11, boolean z11) {
        if (z11) {
            j11 = a(j11);
        }
        return this.f51124a.f35798b.g(d(j11));
    }

    public final boolean c(long j11) {
        long jD = d(a(j11));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        j3.u0 u0Var = this.f51124a;
        int iE = u0Var.f35798b.e(fIntBitsToFloat);
        int i11 = (int) (jD >> 32);
        return Float.intBitsToFloat(i11) >= u0Var.e(iE) && Float.intBitsToFloat(i11) <= u0Var.f(iE);
    }

    public final long d(long j11) {
        w2.x xVar;
        w2.x xVar2 = this.f51125b;
        if (xVar2 == null) {
            return j11;
        }
        if (!xVar2.k()) {
            xVar2 = null;
        }
        if (xVar2 == null || (xVar = this.f51126c) == null) {
            return j11;
        }
        w2.x xVar3 = xVar.k() ? xVar : null;
        return xVar3 == null ? j11 : xVar2.f(xVar3, j11);
    }

    public final long e(long j11) {
        w2.x xVar;
        w2.x xVar2 = this.f51125b;
        if (xVar2 == null) {
            return j11;
        }
        if (!xVar2.k()) {
            xVar2 = null;
        }
        if (xVar2 == null || (xVar = this.f51126c) == null) {
            return j11;
        }
        w2.x xVar3 = xVar.k() ? xVar : null;
        return xVar3 == null ? j11 : xVar3.f(xVar2, j11);
    }
}
