package s0;

import java.util.List;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qy.l f51025a;

    static {
        ry.r rVar = ry.r.f50854a;
        f51025a = new qy.l(rVar, rVar);
    }

    public static final void a(j3.h hVar, List list, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1794596951);
        int i12 = (i11 & 6) == 0 ? (sVar.f(hVar) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(list) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                j3.f fVar = (j3.f) list.get(i13);
                fz.f fVar2 = (fz.f) fVar.f35689a;
                int i14 = fVar.f35690b;
                int i15 = fVar.f35691c;
                Object objQ = sVar.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = e.f51016b;
                    sVar.o0(objQ);
                }
                w2.q0 q0Var = (w2.q0) objQ;
                int iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(sVar, z1.o.f58481a);
                y2.k.J.getClass();
                y2.i iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0Var, sVar);
                l1.t.J(y2.j.f56916e, q1VarL, sVar);
                y2.h hVar2 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar);
                fVar2.invoke(hVar.subSequence(i14, i15).f35700b, sVar, 0);
                sVar.p(true);
            }
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.t1(hVar, i11, 21, list);
        }
    }
}
