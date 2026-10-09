package h1;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l3 extends kotlin.jvm.internal.n implements fz.g {
    public final /* synthetic */ t7 H;
    public final /* synthetic */ m2 K;
    public final /* synthetic */ List L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1.x f30588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1.z f30589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f30590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f30591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f30592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i1.w f30593f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p2 f30594t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(i1.x xVar, i1.z zVar, Long l9, Long l11, fz.c cVar, i1.w wVar, p2 p2Var, t7 t7Var, m2 m2Var, List list) {
        super(4);
        this.f30588a = xVar;
        this.f30589b = zVar;
        this.f30590c = l9;
        this.f30591d = l11;
        this.f30592e = cVar;
        this.f30593f = wVar;
        this.f30594t = p2Var;
        this.H = t7Var;
        this.K = m2Var;
        this.L = list;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x0173  */
    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int iV;
        l1.s sVar;
        y2.i iVar;
        y2.h hVar;
        m2 m2Var;
        Long l9;
        m2 m2Var2;
        boolean z11;
        u7 u7Var;
        u7 u7Var2;
        int i12;
        int i13;
        l0.c cVar = (l0.c) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.n nVar = (l1.n) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i11 = (((l1.s) nVar).f(cVar) ? 4 : 2) | iIntValue2;
        } else {
            i11 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i11 |= ((l1.s) nVar).d(iIntValue) ? 32 : 16;
        }
        if ((i11 & 147) == 146) {
            l1.s sVar2 = (l1.s) nVar;
            if (sVar2.F()) {
                sVar2.W();
            } else {
                i1.z zVar = this.f30589b;
                i1.x xVar = this.f30588a;
                i1.z zVarK = xVar.k(zVar, iIntValue);
                z1.r rVarB = l0.c.b(cVar);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, nVar, 0);
                iV = l1.t.v(nVar);
                sVar = (l1.s) nVar;
                l1.q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(nVar, rVarB);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA, nVar);
                l1.t.J(y2.j.f56916e, q1VarL, nVar);
                hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iV))) {
                    defpackage.e.A(iV, sVar, iV, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, nVar);
                j3.y0 y0VarA = fc.a(k1.d.f37483u, nVar);
                p2 p2Var = this.f30594t;
                List list = this.L;
                m2Var = this.K;
                ua.a(y0VarA, t1.e.d(1622100276, new a0.t0(p2Var, zVarK, list, m2Var, 3), nVar), nVar, 48);
                sVar.d0(2125334733);
                l9 = this.f30590c;
                Long l11 = this.f30591d;
                if (l9 != null || l11 == null) {
                    m2Var2 = m2Var;
                    nVar = nVar;
                    z11 = true;
                    u7Var = null;
                } else {
                    boolean zF = sVar.f(l9) | sVar.f(l11);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        z11 = true;
                        i1.w wVarB = xVar.b(l9.longValue());
                        i1.w wVarB2 = xVar.b(l11.longValue());
                        long j11 = wVarB.f34087d;
                        long j12 = zVarK.f34111f;
                        int i14 = zVarK.f34109d;
                        if (j11 <= j12) {
                            m2Var2 = m2Var;
                            long j13 = wVarB2.f34087d;
                            long j14 = zVarK.f34110e;
                            if (j13 >= j14) {
                                boolean z12 = j11 >= j14;
                                boolean z13 = j13 <= j12;
                                if (z12) {
                                    i12 = (i14 + wVarB.f34086c) - 1;
                                }
                                if (z13) {
                                    i12 = i14;
                                    i13 = wVarB2.f34086c;
                                } else {
                                    i12 = i14;
                                    i13 = zVarK.f34108c;
                                }
                                int i15 = (i13 + i14) - 1;
                                u7Var2 = new u7(ew.a.c(i12 % 7, i12 / 7), ew.a.c(i15 % 7, i15 / 7), z12, z13);
                            }
                            sVar.o0(u7Var2);
                            objQ = u7Var2;
                        } else {
                            m2Var2 = m2Var;
                        }
                        u7Var2 = null;
                        sVar.o0(u7Var2);
                        objQ = u7Var2;
                    } else {
                        m2Var2 = m2Var;
                        z11 = true;
                    }
                    u7Var = (u7) objQ;
                }
                sVar.p(false);
                y2.e(zVarK, this.f30592e, this.f30593f.f34087d, l9, l11, u7Var, p2Var, this.H, m2Var2, nVar, 0);
                sVar.p(z11);
            }
        } else {
            i1.z zVar2 = this.f30589b;
            i1.x xVar2 = this.f30588a;
            i1.z zVarK2 = xVar2.k(zVar2, iIntValue);
            z1.r rVarB2 = l0.c.b(cVar);
            j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, nVar, 0);
            iV = l1.t.v(nVar);
            sVar = (l1.s) nVar;
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(nVar, rVarB2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA2, nVar);
            l1.t.J(y2.j.f56916e, q1VarL2, nVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iV, sVar, iV, hVar);
            } else {
                defpackage.e.A(iV, sVar, iV, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, nVar);
            j3.y0 y0VarA2 = fc.a(k1.d.f37483u, nVar);
            p2 p2Var2 = this.f30594t;
            List list2 = this.L;
            m2Var = this.K;
            ua.a(y0VarA2, t1.e.d(1622100276, new a0.t0(p2Var2, zVarK2, list2, m2Var, 3), nVar), nVar, 48);
            sVar.d0(2125334733);
            l9 = this.f30590c;
            Long l12 = this.f30591d;
            if (l9 != null) {
                m2Var2 = m2Var;
                nVar = nVar;
                z11 = true;
                u7Var = null;
            } else {
                m2Var2 = m2Var;
                nVar = nVar;
                z11 = true;
                u7Var = null;
            }
            sVar.p(false);
            y2.e(zVarK2, this.f30592e, this.f30593f.f34087d, l9, l12, u7Var, p2Var2, this.H, m2Var2, nVar, 0);
            sVar.p(z11);
        }
        return qy.b0.f48488a;
    }
}
