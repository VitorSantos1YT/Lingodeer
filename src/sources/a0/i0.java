package a0;

import h1.g7;
import j0.e2;
import l1.k2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.n implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f106c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i11, Object obj, Object obj2) {
        super(3);
        this.f104a = i11;
        this.f105b = obj;
        this.f106c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x006a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:37:0x0107  */
    /* JADX WARN: Code duplicated, block: B:38:0x0131  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j11;
        z1.o oVar;
        z1.j jVar;
        kw.b bVar;
        kw.h hVar;
        l1.s sVar;
        boolean zG;
        Object objQ;
        j0.p pVar;
        int iHashCode;
        y2.i iVar;
        y2.h hVar2;
        float f5;
        float f11;
        int i11 = this.f104a;
        Object obj4 = this.f106c;
        Object obj5 = this.f105b;
        switch (i11) {
            case 0:
                w2.s0 s0Var = (w2.s0) obj;
                w2.g1 g1VarB = ((w2.p0) obj2).B(((v3.a) obj3).f53483a);
                if (!s0Var.c0() || ((Boolean) ((fz.c) obj5).invoke(((b0.c2) obj4).f3461d.getValue())).booleanValue()) {
                    j11 = (((long) g1VarB.f54502b) & 4294967295L) | (((long) g1VarB.f54501a) << 32);
                } else {
                    j11 = 0;
                }
                return s0Var.q0((int) (j11 >> 32), (int) (j11 & 4294967295L), ry.s.f50855a, new h0(g1VarB, 0));
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 14) == 0) {
                    iIntValue |= ((l1.s) nVar).g(zBooleanValue) ? 4 : 2;
                }
                if ((iIntValue & 91) == 18) {
                    l1.s sVar2 = (l1.s) nVar;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        oVar = z1.o.f58481a;
                        z1.r rVarD = e2.d(oVar, 1.0f);
                        jVar = z1.c.f58467e;
                        bVar = (kw.b) obj5;
                        hVar = (kw.h) obj4;
                        sVar = (l1.s) nVar;
                        sVar.e0(733328855);
                        y.i0 i0Var = j0.o.f35346a;
                        if (jVar.equals(z1.c.f58463a)) {
                            sVar.d0(244367063);
                            sVar.p(false);
                            pVar = j0.o.f35348c;
                        } else {
                            sVar.d0(244414741);
                            zG = sVar.g(false);
                            objQ = sVar.Q();
                            if (zG || objQ == l1.m.f39353a) {
                                objQ = new j0.p(jVar, false);
                                sVar.o0(objQ);
                            }
                            pVar = (j0.p) objQ;
                            sVar.p(false);
                        }
                        sVar.e0(-1323940314);
                        iHashCode = Long.hashCode(sVar.T);
                        l1.q1 q1VarL = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        t1.d dVar = new t1.d(new f(rVarD, 4), true, -511438721);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, pVar, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar);
                        hVar2 = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
                        }
                        dVar.invoke(new k2(sVar), sVar, 0);
                        sVar.e0(2058660585);
                        float f12 = kw.c.f38848c;
                        f5 = kw.c.f38849d;
                        f11 = (f12 + f5) * 2;
                        if (zBooleanValue) {
                            sVar.e0(815268532);
                            g7.b(f5, 0, 390, 24, ((g2.x) bVar.b(sVar).getValue()).f28624a, 0L, sVar, e2.n(oVar, f11));
                            sVar = sVar;
                            sVar.p(false);
                        } else {
                            sVar.e0(815268830);
                            se.p.J(hVar, ((g2.x) bVar.b(sVar).getValue()).f28624a, e2.n(oVar, f11), sVar, 392);
                            sVar.p(false);
                        }
                        sVar.p(false);
                        sVar.p(true);
                        sVar.p(false);
                        sVar.p(false);
                    }
                } else {
                    oVar = z1.o.f58481a;
                    z1.r rVarD2 = e2.d(oVar, 1.0f);
                    jVar = z1.c.f58467e;
                    bVar = (kw.b) obj5;
                    hVar = (kw.h) obj4;
                    sVar = (l1.s) nVar;
                    sVar.e0(733328855);
                    y.i0 i0Var2 = j0.o.f35346a;
                    if (jVar.equals(z1.c.f58463a)) {
                        sVar.d0(244367063);
                        sVar.p(false);
                        pVar = j0.o.f35348c;
                    } else {
                        sVar.d0(244414741);
                        zG = sVar.g(false);
                        objQ = sVar.Q();
                        if (zG) {
                            objQ = new j0.p(jVar, false);
                            sVar.o0(objQ);
                        } else {
                            objQ = new j0.p(jVar, false);
                            sVar.o0(objQ);
                        }
                        pVar = (j0.p) objQ;
                        sVar.p(false);
                    }
                    sVar.e0(-1323940314);
                    iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL2 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    t1.d dVar2 = new t1.d(new f(rVarD2, 4), true, -511438721);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, pVar, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                    hVar2 = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
                    }
                    dVar2.invoke(new k2(sVar), sVar, 0);
                    sVar.e0(2058660585);
                    float f13 = kw.c.f38848c;
                    f5 = kw.c.f38849d;
                    f11 = (f13 + f5) * 2;
                    if (zBooleanValue) {
                        sVar.e0(815268532);
                        g7.b(f5, 0, 390, 24, ((g2.x) bVar.b(sVar).getValue()).f28624a, 0L, sVar, e2.n(oVar, f11));
                        sVar = sVar;
                        sVar.p(false);
                    } else {
                        sVar.e0(815268830);
                        se.p.J(hVar, ((g2.x) bVar.b(sVar).getValue()).f28624a, e2.n(oVar, f11), sVar, 392);
                        sVar.p(false);
                    }
                    sVar.p(false);
                    sVar.p(true);
                    sVar.p(false);
                    sVar.p(false);
                }
                return qy.b0.f48488a;
        }
    }
}
