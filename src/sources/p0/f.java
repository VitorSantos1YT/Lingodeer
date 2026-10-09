package p0;

import bt.h7;
import f0.i;
import mt.l0;
import qy.b0;
import rz.e0;
import w2.x;
import y2.k1;
import y2.y;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends q implements d3.a, y {
    public i Q;
    public boolean R;

    public static final f2.c T0(f fVar, k1 k1Var, d2.c cVar) {
        f2.c cVar2;
        if (fVar.P && fVar.R) {
            k1 k1VarW = y2.f.w(fVar);
            if (!k1Var.c1().P) {
                k1Var = null;
            }
            if (k1Var != null && (cVar2 = (f2.c) cVar.invoke()) != null) {
                return cVar2.i(k1VarW.E(k1Var, false).d());
            }
        }
        return null;
    }

    @Override // y2.y
    public final void F0(x xVar) {
        this.R = true;
    }

    @Override // d3.a
    public final Object G0(k1 k1Var, d2.c cVar, xy.c cVar2) {
        Object objL = e0.l(new h7(this, k1Var, cVar, new l0(this, k1Var, cVar, 13), null, 3), cVar2);
        return objL == wy.a.COROUTINE_SUSPENDED ? objL : b0.f48488a;
    }

    @Override // z1.q
    public final boolean I0() {
        return false;
    }
}
