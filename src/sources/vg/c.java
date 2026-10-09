package vg;

import l1.b1;
import l1.q1;
import l1.s;
import l1.t;
import qy.b0;
import w2.q0;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f54020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f54021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v3.c f54022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f54023d;

    public c(long j11, a aVar, v3.c cVar, b1 b1Var) {
        this.f54020a = j11;
        this.f54021b = aVar;
        this.f54022c = cVar;
        this.f54023d = b1Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s sVar;
        long j11;
        boolean zE;
        Object objQ;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        String alternateText = (String) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Number) obj3).intValue();
        kotlin.jvm.internal.m.f(alternateText, "alternateText");
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((s) nVar).f(alternateText) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18) {
            s sVar2 = (s) nVar;
            if (sVar2.F()) {
                sVar2.W();
            } else {
                sVar = (s) nVar;
                sVar.d0(243502826);
                j11 = this.f54020a;
                zE = sVar.e(j11);
                objQ = sVar.Q();
                if (zE || objQ == l1.m.f39353a) {
                    objQ = new b(j11, this.f54023d);
                    sVar.o0(objQ);
                }
                q0 q0Var = (q0) objQ;
                sVar.p(false);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                r rVarC = z1.a.c(sVar, o.f58481a);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(y2.j.f56917f, q0Var, sVar);
                t.J(y2.j.f56916e, q1VarL, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                t.J(y2.j.f56915d, rVarC, sVar);
                this.f54021b.f54017b.f(this.f54022c, alternateText, sVar, Integer.valueOf((iIntValue << 3) & 112));
                sVar.p(true);
            }
        } else {
            sVar = (s) nVar;
            sVar.d0(243502826);
            j11 = this.f54020a;
            zE = sVar.e(j11);
            objQ = sVar.Q();
            if (zE) {
                objQ = new b(j11, this.f54023d);
                sVar.o0(objQ);
            } else {
                objQ = new b(j11, this.f54023d);
                sVar.o0(objQ);
            }
            q0 q0Var2 = (q0) objQ;
            sVar.p(false);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, o.f58481a);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, q0Var2, sVar);
            t.J(y2.j.f56916e, q1VarL2, sVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC2, sVar);
            this.f54021b.f54017b.f(this.f54022c, alternateText, sVar, Integer.valueOf((iIntValue << 3) & 112));
            sVar.p(true);
        }
        return b0.f48488a;
    }
}
