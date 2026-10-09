package tg;

import l1.b1;
import l1.q1;
import ys.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52379a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f52380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f52383e;

    public u0(i0 i0Var, j3.y0 y0Var, z1.r rVar, fz.f fVar) {
        this.f52381c = i0Var;
        this.f52382d = y0Var;
        this.f52380b = rVar;
        this.f52383e = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f52379a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar = (l1.s) nVar;
                    if (sVar.F()) {
                        sVar.W();
                    } else {
                        n0.a((i0) this.f52381c, nVar).f((j3.y0) this.f52382d, t1.e.d(545809484, new t0(this.f52380b, (fz.f) this.f52383e, 0), nVar), nVar, 48);
                    }
                } else {
                    n0.a((i0) this.f52381c, nVar).f((j3.y0) this.f52382d, t1.e.d(545809484, new t0(this.f52380b, (fz.f) this.f52383e, 0), nVar), nVar, 48);
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                b1 b1Var = (b1) this.f52381c;
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objQ = sVar2.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (objQ == gVar) {
                        objQ = new xu.v(15, b1Var);
                        sVar2.o0(objQ);
                    }
                    z1.r rVarM = w2.a0.m(this.f52380b, (fz.c) objQ);
                    t1.d dVar = (t1.d) this.f52382d;
                    z0.c cVar = (z0.c) this.f52383e;
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, true);
                    int iHashCode = Long.hashCode(sVar2.T);
                    q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, rVarM);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar2);
                    dVar.invoke(sVar2, 0);
                    Object objQ2 = sVar2.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new d1(20, b1Var);
                        sVar2.o0(objQ2);
                    }
                    cVar.b((fz.a) objQ2, sVar2, 6);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public u0(z1.r rVar, b1 b1Var, t1.d dVar, z0.c cVar) {
        this.f52380b = rVar;
        this.f52381c = b1Var;
        this.f52382d = dVar;
        this.f52383e = cVar;
    }
}
