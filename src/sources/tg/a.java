package tg;

import d0.b1;
import l1.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52245a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f52246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.f f52248d;

    public a(j0 j0Var, z1.r rVar, fz.f fVar) {
        this.f52247c = j0Var;
        this.f52246b = rVar;
        this.f52248d = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f52245a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar = (l1.s) nVar;
                    if (sVar.F()) {
                        sVar.W();
                    } else {
                        k0.a((j0) this.f52247c, t1.e.d(-1594352936, new b1(5, this.f52246b, this.f52248d), nVar), nVar, 384);
                    }
                } else {
                    k0.a((j0) this.f52247c, t1.e.d(-1594352936, new b1(5, this.f52246b, this.f52248d), nVar), nVar, 384);
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l1.b1 b1Var = (l1.b1) this.f52247c;
                    Object objQ = sVar2.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = new mt.p(27, b1Var);
                        sVar2.o0(objQ);
                    }
                    z1.r rVarM = w2.a0.m(this.f52246b, (fz.c) objQ);
                    t1.d dVar = (t1.d) this.f52248d;
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
                    hh.p0.x(0, dVar, sVar2, true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public a(z1.r rVar, l1.b1 b1Var, t1.d dVar) {
        this.f52246b = rVar;
        this.f52247c = b1Var;
        this.f52248d = dVar;
    }
}
