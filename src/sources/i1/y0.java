package i1;

import b0.y1;
import l1.b3;
import l1.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.n implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b3 f34102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f34103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j3.y0 f34104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.e f34105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(y1 y1Var, long j11, j3.y0 y0Var, fz.e eVar) {
        super(3);
        this.f34102a = y1Var;
        this.f34103b = j11;
        this.f34104c = y0Var;
        this.f34105d = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l1.s sVar;
        b3 b3Var;
        boolean zF;
        Object objQ;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        z1.r rVar = (z1.r) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((l1.s) nVar).f(rVar) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18) {
            l1.s sVar2 = (l1.s) nVar;
            if (sVar2.F()) {
                sVar2.W();
            } else {
                sVar = (l1.s) nVar;
                b3Var = this.f34102a;
                zF = sVar.f(b3Var);
                objQ = sVar.Q();
                if (zF || objQ == l1.m.f39353a) {
                    objQ = new a0.r0(b3Var, 2);
                    sVar.o0(objQ);
                }
                z1.r rVarQ = g2.f0.q(rVar, (fz.c) objQ);
                w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(sVar, rVarQ);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, sVar);
                l1.t.J(y2.j.f56916e, q1VarL, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar);
                d1.b(this.f34103b, this.f34104c, this.f34105d, sVar, 0);
                sVar.p(true);
            }
        } else {
            sVar = (l1.s) nVar;
            b3Var = this.f34102a;
            zF = sVar.f(b3Var);
            objQ = sVar.Q();
            if (zF) {
                objQ = new a0.r0(b3Var, 2);
                sVar.o0(objQ);
            } else {
                objQ = new a0.r0(b3Var, 2);
                sVar.o0(objQ);
            }
            z1.r rVarQ2 = g2.f0.q(rVar, (fz.c) objQ);
            w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarQ2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD2, sVar);
            l1.t.J(y2.j.f56916e, q1VarL2, sVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            d1.b(this.f34103b, this.f34104c, this.f34105d, sVar, 0);
            sVar.p(true);
        }
        return qy.b0.f48488a;
    }
}
