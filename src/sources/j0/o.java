package j0;

import dt.c3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y.i0 f35346a = c(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y.i0 f35347b = c(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f35348c = new p(z1.c.f58463a, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f35349d = n.f35341b;

    public static final void a(z1.r rVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-211209833);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            int iHashCode = Long.hashCode(sVar.T);
            z1.r rVarC = z1.a.c(sVar, rVar);
            l1.q1 q1VarL = sVar.l();
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, f35349d, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c3(rVar, i11, 2, (byte) 0);
        }
    }

    public static final void b(w2.f1 f1Var, w2.g1 g1Var, w2.p0 p0Var, v3.m mVar, int i11, int i12, z1.e eVar) {
        z1.j jVar;
        Object objG = p0Var.G();
        m mVar2 = objG instanceof m ? (m) objG : null;
        w2.f1.i(f1Var, g1Var, ((mVar2 == null || (jVar = mVar2.Q) == null) ? eVar : jVar).a((((long) g1Var.f54501a) << 32) | (((long) g1Var.f54502b) & 4294967295L), (((long) i11) << 32) | (((long) i12) & 4294967295L), mVar));
    }

    public static final y.i0 c(boolean z11) {
        y.i0 i0Var = new y.i0(9);
        z1.j jVar = z1.c.f58463a;
        i0Var.m(jVar, new p(jVar, z11));
        z1.j jVar2 = z1.c.f58464b;
        i0Var.m(jVar2, new p(jVar2, z11));
        z1.j jVar3 = z1.c.f58465c;
        i0Var.m(jVar3, new p(jVar3, z11));
        z1.j jVar4 = z1.c.f58466d;
        i0Var.m(jVar4, new p(jVar4, z11));
        z1.j jVar5 = z1.c.f58467e;
        i0Var.m(jVar5, new p(jVar5, z11));
        z1.j jVar6 = z1.c.f58468f;
        i0Var.m(jVar6, new p(jVar6, z11));
        z1.j jVar7 = z1.c.f58469t;
        i0Var.m(jVar7, new p(jVar7, z11));
        z1.j jVar8 = z1.c.H;
        i0Var.m(jVar8, new p(jVar8, z11));
        z1.j jVar9 = z1.c.K;
        i0Var.m(jVar9, new p(jVar9, z11));
        return i0Var;
    }

    public static final w2.q0 d(z1.e eVar, boolean z11) {
        w2.q0 q0Var = (w2.q0) (z11 ? f35346a : f35347b).g(eVar);
        return q0Var == null ? new p(eVar, z11) : q0Var;
    }
}
