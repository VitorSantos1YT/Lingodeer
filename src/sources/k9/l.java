package k9;

import fu.j0;
import l1.b1;
import l1.q1;
import qy.b0;
import w2.a0;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f37995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f37996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f37997f;

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f37992a = i11;
        this.f37993b = obj;
        this.f37994c = obj2;
        this.f37995d = obj3;
        this.f37996e = obj4;
        this.f37997f = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.s sVar;
        boolean zH;
        x1.p pVar;
        Object objQ;
        switch (this.f37992a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                o oVar = (o) this.f37994c;
                j9.e eVar = (j9.e) this.f37993b;
                if ((iIntValue & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        sVar = (l1.s) nVar;
                        zH = sVar.h(eVar) | sVar.h(oVar);
                        pVar = (x1.p) this.f37996e;
                        objQ = sVar.Q();
                        if (zH || objQ == l1.m.f39353a) {
                            objQ = new j0(pVar, eVar, oVar, 12);
                            sVar.o0(objQ);
                        }
                        l1.t.c(eVar, (fz.c) objQ, sVar);
                        android.support.v4.media.session.a.c(eVar, (w1.b) this.f37995d, t1.e.d(-497631156, new es.c(2, (n) this.f37997f, eVar), sVar), sVar, 384);
                    }
                } else {
                    sVar = (l1.s) nVar;
                    zH = sVar.h(eVar) | sVar.h(oVar);
                    pVar = (x1.p) this.f37996e;
                    objQ = sVar.Q();
                    if (zH) {
                        objQ = new j0(pVar, eVar, oVar, 12);
                        sVar.o0(objQ);
                    } else {
                        objQ = new j0(pVar, eVar, oVar, 12);
                        sVar.o0(objQ);
                    }
                    l1.t.c(eVar, (fz.c) objQ, sVar);
                    android.support.v4.media.session.a.c(eVar, (w1.b) this.f37995d, t1.e.d(-497631156, new es.c(2, (n) this.f37997f, eVar), sVar), sVar, 384);
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar2;
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z1.r rVar = (z1.r) this.f37993b;
                    b1 b1Var = (b1) this.f37994c;
                    Object objQ2 = sVar3.Q();
                    if (objQ2 == l1.m.f39353a) {
                        objQ2 = new mt.p(28, b1Var);
                        sVar3.o0(objQ2);
                    }
                    z1.r rVarM = a0.m(rVar, (fz.c) objQ2);
                    t1.d dVar = (t1.d) this.f37995d;
                    z0.c cVar = (z0.c) this.f37996e;
                    fz.a aVar = (fz.a) this.f37997f;
                    q0 q0VarD = j0.o.d(z1.c.f58463a, true);
                    int iHashCode = Long.hashCode(sVar3.T);
                    q1 q1VarL = sVar3.l();
                    z1.r rVarC = z1.a.c(sVar3, rVarM);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar3);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar3);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar3);
                    dVar.invoke(sVar3, 0);
                    cVar.b(aVar, sVar3, 6);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                break;
        }
        return b0.f48488a;
    }
}
