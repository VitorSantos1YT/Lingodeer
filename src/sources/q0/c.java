package q0;

import d0.c1;
import d0.g1;
import d0.z0;
import g3.k;
import ot.f2;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final r a(r rVar, boolean z11, h0.i iVar, z0 z0Var, boolean z12, k kVar, fz.a aVar) {
        r rVarI;
        if (z0Var instanceof g1) {
            rVarI = new a(z11, iVar, (g1) z0Var, false, z12, kVar, aVar);
        } else if (z0Var == null) {
            rVarI = new a(z11, iVar, null, false, z12, kVar, aVar);
        } else {
            o oVar = o.f58481a;
            rVarI = iVar != null ? c1.a(oVar, iVar, z0Var).i(new a(z11, iVar, null, false, z12, kVar, aVar)) : z1.a.a(oVar, new b(z0Var, z11, z12, kVar, aVar));
        }
        return rVar.i(rVarI);
    }

    public static r b(r rVar, boolean z11, boolean z12, k kVar, fz.a aVar, int i11) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        return rVar.i(new a(z11, null, null, true, z12, kVar, aVar));
    }

    public static final r c(r rVar) {
        return g3.r.b(rVar, false, new f2(14));
    }

    public static final r d(r rVar, boolean z11, h0.i iVar, boolean z12, k kVar, fz.c cVar) {
        return rVar.i(new e(z11, iVar, z12, kVar, cVar));
    }

    public static final r e(z0 z0Var, fz.a aVar, k kVar, i3.a aVar2, boolean z11) {
        if (z0Var instanceof g1) {
            return new h(aVar2, null, (g1) z0Var, z11, kVar, aVar);
        }
        if (z0Var == null) {
            return new h(aVar2, null, null, z11, kVar, aVar);
        }
        return z1.a.a(o.f58481a, new f(z0Var, aVar, kVar, aVar2, z11));
    }
}
