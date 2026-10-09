package e6;

import android.content.Context;
import android.widget.RemoteViews;
import com.lingodeer.R;
import h1.e8;
import j0.e2;
import j0.n2;
import j0.p2;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25028a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25033f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f25034t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(fz.e eVar, b0.d dVar, fz.e eVar2, e8 e8Var, fz.a aVar, rz.b0 b0Var, t1.d dVar2) {
        super(2);
        this.f25029b = eVar;
        this.f25030c = dVar;
        this.f25031d = eVar2;
        this.f25032e = e8Var;
        this.f25033f = aVar;
        this.f25034t = b0Var;
        this.H = dVar2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030  */
    /* JADX WARN: Code duplicated, block: B:13:0x005c  */
    /* JADX WARN: Code duplicated, block: B:16:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:17:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:20:0x00be  */
    /* JADX WARN: Code duplicated, block: B:23:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:29:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:0x012b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0170  */
    /* JADX WARN: Code duplicated, block: B:36:0x0174  */
    /* JADX WARN: Code duplicated, block: B:39:0x0181  */
    /* JADX WARN: Code duplicated, block: B:41:0x018f  */
    /* JADX WARN: Code duplicated, block: B:44:0x019e  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        k6.o oVar;
        l1.s sVar;
        boolean zH;
        Object objQ;
        fz.e eVar;
        e8 e8Var;
        fz.a aVar;
        rz.b0 b0Var;
        t1.d dVar;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        y2.h hVar2;
        y2.h hVar3;
        y2.i iVar2;
        y2.h hVar4;
        boolean z11;
        String strI;
        String strI2;
        String strI3;
        boolean zF;
        Object b1Var;
        y2.h hVar5;
        y2.h hVar6;
        int iHashCode2;
        switch (this.f25028a) {
            case 0:
                c6.k kVar = (c6.k) obj2;
                if (kVar instanceof d6.b) {
                    ((kotlin.jvm.internal.y) this.f25029b).f38361a = kVar;
                } else if (kVar instanceof k6.t) {
                    ((kotlin.jvm.internal.y) this.f25030c).f38361a = kVar;
                } else if (kVar instanceof k6.m) {
                    ((kotlin.jvm.internal.y) this.f25031d).f38361a = kVar;
                } else if (kVar instanceof k6.o) {
                    kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f25032e;
                    k6.o oVar2 = (k6.o) yVar.f38361a;
                    if (oVar2 != null) {
                        k6.o oVar3 = (k6.o) kVar;
                        oVar = new k6.o(oVar2.f37940a.a(oVar3.f37940a), oVar2.f37941b.a(oVar3.f37941b), oVar2.f37942c.a(oVar3.f37942c), oVar2.f37943d.a(oVar3.f37943d), oVar2.f37944e.a(oVar3.f37944e), oVar2.f37945f.a(oVar3.f37945f));
                    } else {
                        oVar = (k6.o) kVar;
                    }
                    yVar.f38361a = oVar;
                } else if (kVar instanceof y) {
                    ((kotlin.jvm.internal.y) this.f25033f).f38361a = ((y) kVar).f25091a;
                } else if (!(kVar instanceof a)) {
                    if (kVar instanceof b0) {
                        ((kotlin.jvm.internal.y) this.f25034t).f38361a = kVar;
                    } else if (kVar instanceof l6.b) {
                        ((kotlin.jvm.internal.y) this.H).f38361a = kVar;
                    } else {
                        Objects.toString(kVar);
                    }
                }
                break;
            default:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                b0.d dVar2 = (b0.d) this.f25030c;
                if ((iIntValue & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        z1.r rVarA = z1.a.a(e2.e(z1.o.f58481a, 1.0f), new p2((n2) ((fz.e) this.f25029b).invoke(nVar, 0), 1));
                        sVar = (l1.s) nVar;
                        zH = sVar.h(dVar2);
                        objQ = sVar.Q();
                        l1.g gVar = l1.m.f39353a;
                        if (zH || objQ == gVar) {
                            objQ = new a0.o0(dVar2, 17);
                            sVar.o0(objQ);
                        }
                        z1.r rVarQ = g2.f0.q(rVarA, (fz.c) objQ);
                        eVar = (fz.e) this.f25031d;
                        e8Var = (e8) this.f25032e;
                        aVar = (fz.a) this.f25033f;
                        b0Var = (rz.b0) this.f25034t;
                        dVar = (t1.d) this.H;
                        j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                        iHashCode = Long.hashCode(sVar.T);
                        l1.q1 q1VarL = sVar.l();
                        z1.r rVarC = z1.a.c(sVar, rVarQ);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        hVar = y2.j.f56917f;
                        l1.t.J(hVar, uVarA, sVar);
                        hVar2 = y2.j.f56916e;
                        l1.t.J(hVar2, q1VarL, sVar);
                        hVar3 = y2.j.f56918g;
                        if (sVar.S) {
                            iVar2 = iVar;
                        } else {
                            iVar2 = iVar;
                            if (!kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                            }
                            hVar4 = y2.j.f56915d;
                            l1.t.J(hVar4, rVarC, sVar);
                            sVar.d0(-1636564008);
                            if (eVar != null) {
                                strI = i1.p.i(sVar, R.string.m3c_bottom_sheet_collapse_description);
                                strI2 = i1.p.i(sVar, R.string.m3c_bottom_sheet_dismiss_description);
                                strI3 = i1.p.i(sVar, R.string.m3c_bottom_sheet_expand_description);
                                j0.v0 v0Var = new j0.v0(z1.c.P);
                                zF = sVar.f(e8Var) | sVar.f(strI2) | sVar.f(aVar) | sVar.f(strI3) | sVar.h(b0Var) | sVar.f(strI);
                                Object objQ2 = sVar.Q();
                                if (!zF || objQ2 == gVar) {
                                    hVar5 = hVar3;
                                    hVar6 = hVar;
                                    b1Var = new h1.b1(e8Var, strI2, strI3, strI, aVar, b0Var, 1);
                                    sVar.o0(b1Var);
                                } else {
                                    b1Var = objQ2;
                                    hVar6 = hVar;
                                    hVar5 = hVar3;
                                }
                                z1.r rVarB = g3.r.b(v0Var, true, (fz.c) b1Var);
                                w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                                iHashCode2 = Long.hashCode(sVar.T);
                                l1.q1 q1VarL2 = sVar.l();
                                z1.r rVarC2 = z1.a.c(sVar, rVarB);
                                sVar.h0();
                                if (sVar.S) {
                                    sVar.k(iVar2);
                                } else {
                                    sVar.r0();
                                }
                                l1.t.J(hVar6, q0VarD, sVar);
                                l1.t.J(hVar2, q1VarL2, sVar);
                                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
                                }
                                l1.t.J(hVar4, rVarC2, sVar);
                                eVar.invoke(sVar, 0);
                                z11 = true;
                                sVar.p(true);
                            } else {
                                dVar = dVar;
                                z11 = true;
                            }
                            sVar.p(false);
                            dVar.invoke(j0.v.f35424a, sVar, 6);
                            sVar.p(z11);
                        }
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                        hVar4 = y2.j.f56915d;
                        l1.t.J(hVar4, rVarC, sVar);
                        sVar.d0(-1636564008);
                        if (eVar != null) {
                            strI = i1.p.i(sVar, R.string.m3c_bottom_sheet_collapse_description);
                            strI2 = i1.p.i(sVar, R.string.m3c_bottom_sheet_dismiss_description);
                            strI3 = i1.p.i(sVar, R.string.m3c_bottom_sheet_expand_description);
                            j0.v0 v0Var2 = new j0.v0(z1.c.P);
                            zF = sVar.f(e8Var) | sVar.f(strI2) | sVar.f(aVar) | sVar.f(strI3) | sVar.h(b0Var) | sVar.f(strI);
                            Object objQ3 = sVar.Q();
                            if (zF) {
                                hVar5 = hVar3;
                                hVar6 = hVar;
                                b1Var = new h1.b1(e8Var, strI2, strI3, strI, aVar, b0Var, 1);
                                sVar.o0(b1Var);
                            } else {
                                hVar5 = hVar3;
                                hVar6 = hVar;
                                b1Var = new h1.b1(e8Var, strI2, strI3, strI, aVar, b0Var, 1);
                                sVar.o0(b1Var);
                            }
                            z1.r rVarB2 = g3.r.b(v0Var2, true, (fz.c) b1Var);
                            w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                            iHashCode2 = Long.hashCode(sVar.T);
                            l1.q1 q1VarL3 = sVar.l();
                            z1.r rVarC3 = z1.a.c(sVar, rVarB2);
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar2);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(hVar6, q0VarD2, sVar);
                            l1.t.J(hVar2, q1VarL3, sVar);
                            if (sVar.S) {
                                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
                            } else {
                                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
                            }
                            l1.t.J(hVar4, rVarC3, sVar);
                            eVar.invoke(sVar, 0);
                            z11 = true;
                            sVar.p(true);
                        } else {
                            dVar = dVar;
                            z11 = true;
                        }
                        sVar.p(false);
                        dVar.invoke(j0.v.f35424a, sVar, 6);
                        sVar.p(z11);
                    }
                } else {
                    z1.r rVarA2 = z1.a.a(e2.e(z1.o.f58481a, 1.0f), new p2((n2) ((fz.e) this.f25029b).invoke(nVar, 0), 1));
                    sVar = (l1.s) nVar;
                    zH = sVar.h(dVar2);
                    objQ = sVar.Q();
                    l1.g gVar2 = l1.m.f39353a;
                    if (zH) {
                        objQ = new a0.o0(dVar2, 17);
                        sVar.o0(objQ);
                    } else {
                        objQ = new a0.o0(dVar2, 17);
                        sVar.o0(objQ);
                    }
                    z1.r rVarQ2 = g2.f0.q(rVarA2, (fz.c) objQ);
                    eVar = (fz.e) this.f25031d;
                    e8Var = (e8) this.f25032e;
                    aVar = (fz.a) this.f25033f;
                    b0Var = (rz.b0) this.f25034t;
                    dVar = (t1.d) this.H;
                    j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                    iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL4 = sVar.l();
                    z1.r rVarC4 = z1.a.c(sVar, rVarQ2);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    hVar = y2.j.f56917f;
                    l1.t.J(hVar, uVarA2, sVar);
                    hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL4, sVar);
                    hVar3 = y2.j.f56918g;
                    if (sVar.S) {
                        iVar2 = iVar;
                        if (!kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        }
                        hVar4 = y2.j.f56915d;
                        l1.t.J(hVar4, rVarC4, sVar);
                        sVar.d0(-1636564008);
                        if (eVar != null) {
                            strI = i1.p.i(sVar, R.string.m3c_bottom_sheet_collapse_description);
                            strI2 = i1.p.i(sVar, R.string.m3c_bottom_sheet_dismiss_description);
                            strI3 = i1.p.i(sVar, R.string.m3c_bottom_sheet_expand_description);
                            j0.v0 v0Var3 = new j0.v0(z1.c.P);
                            zF = sVar.f(e8Var) | sVar.f(strI2) | sVar.f(aVar) | sVar.f(strI3) | sVar.h(b0Var) | sVar.f(strI);
                            Object objQ4 = sVar.Q();
                            if (zF) {
                                hVar5 = hVar3;
                                hVar6 = hVar;
                                b1Var = new h1.b1(e8Var, strI2, strI3, strI, aVar, b0Var, 1);
                                sVar.o0(b1Var);
                            } else {
                                hVar5 = hVar3;
                                hVar6 = hVar;
                                b1Var = new h1.b1(e8Var, strI2, strI3, strI, aVar, b0Var, 1);
                                sVar.o0(b1Var);
                            }
                            z1.r rVarB3 = g3.r.b(v0Var3, true, (fz.c) b1Var);
                            w2.q0 q0VarD3 = j0.o.d(z1.c.f58463a, false);
                            iHashCode2 = Long.hashCode(sVar.T);
                            l1.q1 q1VarL5 = sVar.l();
                            z1.r rVarC5 = z1.a.c(sVar, rVarB3);
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar2);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(hVar6, q0VarD3, sVar);
                            l1.t.J(hVar2, q1VarL5, sVar);
                            if (sVar.S) {
                                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
                            } else {
                                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
                            }
                            l1.t.J(hVar4, rVarC5, sVar);
                            eVar.invoke(sVar, 0);
                            z11 = true;
                            sVar.p(true);
                        } else {
                            dVar = dVar;
                            z11 = true;
                        }
                        sVar.p(false);
                        dVar.invoke(j0.v.f35424a, sVar, 6);
                        sVar.p(z11);
                    } else {
                        iVar2 = iVar;
                    }
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                    hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC4, sVar);
                    sVar.d0(-1636564008);
                    if (eVar != null) {
                        strI = i1.p.i(sVar, R.string.m3c_bottom_sheet_collapse_description);
                        strI2 = i1.p.i(sVar, R.string.m3c_bottom_sheet_dismiss_description);
                        strI3 = i1.p.i(sVar, R.string.m3c_bottom_sheet_expand_description);
                        j0.v0 v0Var4 = new j0.v0(z1.c.P);
                        zF = sVar.f(e8Var) | sVar.f(strI2) | sVar.f(aVar) | sVar.f(strI3) | sVar.h(b0Var) | sVar.f(strI);
                        Object objQ5 = sVar.Q();
                        if (zF) {
                            hVar5 = hVar3;
                            hVar6 = hVar;
                            b1Var = new h1.b1(e8Var, strI2, strI3, strI, aVar, b0Var, 1);
                            sVar.o0(b1Var);
                        } else {
                            hVar5 = hVar3;
                            hVar6 = hVar;
                            b1Var = new h1.b1(e8Var, strI2, strI3, strI, aVar, b0Var, 1);
                            sVar.o0(b1Var);
                        }
                        z1.r rVarB4 = g3.r.b(v0Var4, true, (fz.c) b1Var);
                        w2.q0 q0VarD4 = j0.o.d(z1.c.f58463a, false);
                        iHashCode2 = Long.hashCode(sVar.T);
                        l1.q1 q1VarL6 = sVar.l();
                        z1.r rVarC6 = z1.a.c(sVar, rVarB4);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar2);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(hVar6, q0VarD4, sVar);
                        l1.t.J(hVar2, q1VarL6, sVar);
                        if (sVar.S) {
                            defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
                        } else {
                            defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
                        }
                        l1.t.J(hVar4, rVarC6, sVar);
                        eVar.invoke(sVar, 0);
                        z11 = true;
                        sVar.p(true);
                    } else {
                        dVar = dVar;
                        z11 = true;
                    }
                    sVar.p(false);
                    dVar.invoke(j0.v.f35424a, sVar, 6);
                    sVar.p(z11);
                }
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kotlin.jvm.internal.y yVar, kotlin.jvm.internal.y yVar2, kotlin.jvm.internal.y yVar3, Context context, RemoteViews remoteViews, u0 u0Var, kotlin.jvm.internal.y yVar4, kotlin.jvm.internal.y yVar5, kotlin.jvm.internal.y yVar6, x1 x1Var, kotlin.jvm.internal.y yVar7, kotlin.jvm.internal.y yVar8, kotlin.jvm.internal.y yVar9) {
        super(2);
        this.f25029b = yVar;
        this.f25030c = yVar2;
        this.f25031d = yVar3;
        this.f25032e = yVar4;
        this.f25033f = yVar6;
        this.f25034t = yVar8;
        this.H = yVar9;
    }
}
