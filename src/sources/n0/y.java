package n0;

import mt.n4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.b f43029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n4 f43030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y.i0 f43031c;

    public y(w1.b bVar, n4 n4Var) {
        this.f43029a = bVar;
        this.f43030b = n4Var;
        long[] jArr = y.r0.f56756a;
        this.f43031c = new y.i0();
    }

    public final fz.e a(int i11, Object obj, Object obj2) {
        y.i0 i0Var = this.f43031c;
        x xVar = (x) i0Var.g(obj);
        if (xVar != null && xVar.f43023c == i11 && kotlin.jvm.internal.m.a(xVar.f43022b, obj2)) {
            t1.d dVar = xVar.f43024d;
            if (dVar != null) {
                return dVar;
            }
            t1.d dVar2 = new t1.d(new es.c(5, xVar.f43025e, xVar), true, 818252804);
            xVar.f43024d = dVar2;
            return dVar2;
        }
        x xVar2 = new x(this, i11, obj, obj2);
        i0Var.m(obj, xVar2);
        t1.d dVar3 = xVar2.f43024d;
        if (dVar3 != null) {
            return dVar3;
        }
        t1.d dVar4 = new t1.d(new es.c(5, this, xVar2), true, 818252804);
        xVar2.f43024d = dVar4;
        return dVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        x xVar = (x) this.f43031c.g(obj);
        if (xVar != null) {
            return xVar.f43022b;
        }
        a0 a0Var = (a0) this.f43030b.invoke();
        int iD = a0Var.d(obj);
        if (iD != -1) {
            return a0Var.b(iD);
        }
        return null;
    }
}
