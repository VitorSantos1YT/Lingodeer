package br;

import bp.m2;
import com.lingo.lingoskill.object.MergedBillingThemeBillingPage;
import com.lingodeer.R;
import fr.j3;
import h1.k7;
import h1.r4;
import h1.ua;
import j0.b2;
import j0.e2;
import j3.y0;
import java.util.Iterator;
import java.util.List;
import l1.b1;
import l1.q1;
import l1.z1;
import mt.f6;
import mt.w1;
import rt.y8;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5004f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5005t;

    public /* synthetic */ b0(List list, String str, boolean z11, MergedBillingThemeBillingPage mergedBillingThemeBillingPage, fz.c cVar, boolean z12) {
        this.f4999a = 0;
        this.f5002d = list;
        this.f5003e = str;
        this.f5000b = z11;
        this.f5004f = mergedBillingThemeBillingPage;
        this.f5005t = cVar;
        this.f5001c = z12;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:102:0x0300  */
    /* JADX WARN: Code duplicated, block: B:107:0x031b  */
    /* JADX WARN: Code duplicated, block: B:114:0x037e  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jW;
        fz.c cVar;
        int iHashCode;
        l1.s sVar;
        boolean z11;
        switch (this.f4999a) {
            case 0:
                List list = (List) this.f5002d;
                String str = (String) this.f5003e;
                MergedBillingThemeBillingPage mergedBillingThemeBillingPage = (MergedBillingThemeBillingPage) this.f5004f;
                fz.c cVar2 = (fz.c) this.f5005t;
                b2 NavigationBar = (b2) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(NavigationBar, "$this$NavigationBar");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((l1.s) nVar).f(NavigationBar) ? 4 : 2;
                }
                boolean z12 = false;
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        h0 h0Var = (h0) it.next();
                        String str2 = h0Var.f5039a;
                        if (kotlin.jvm.internal.m.a(str, str2)) {
                            sVar2.d0(538660047);
                            if (this.f5000b) {
                                sVar2.d0(538702145);
                                sVar2.p(z12);
                                jW = j3.w(mergedBillingThemeBillingPage.getMembershipTabSelectedTintColor());
                            } else {
                                sVar2.d0(538810490);
                                jW = se.i.k(sVar2, R.color.colorAccent);
                                sVar2.p(z12);
                            }
                            sVar2.p(z12);
                        } else {
                            sVar2.d0(538913813);
                            sVar2.p(z12);
                            jW = str2.equals("premium") ? j3.w(mergedBillingThemeBillingPage.getMembershipTabTintColor()) : g2.f0.e(4291809231L);
                        }
                        z1.o oVar = z1.o.f58481a;
                        z1.r rVarC = e2.c(NavigationBar.a(oVar, 1.0f), 1.0f);
                        boolean zF = sVar2.f(cVar2) | sVar2.f(h0Var);
                        Object objQ = sVar2.Q();
                        if (zF || objQ == l1.m.f39353a) {
                            objQ = new at.f(9, cVar2, h0Var);
                            sVar2.o0(objQ);
                        }
                        z1.r rVarQ = iu.k.q(0, 7, (fz.a) objQ, sVar2, rVarC, false);
                        j0.u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, sVar2, 54);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        q1 q1VarL = sVar2.l();
                        z1.r rVarC2 = z1.a.c(sVar2, rVarQ);
                        y2.k.J.getClass();
                        Iterator it2 = it;
                        y2.i iVar = y2.j.f56913b;
                        sVar2.h0();
                        String str3 = str;
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        y2.h hVar = y2.j.f56917f;
                        l1.t.J(hVar, uVarA, sVar2);
                        y2.h hVar2 = y2.j.f56916e;
                        l1.t.J(hVar2, q1VarL, sVar2);
                        y2.h hVar3 = y2.j.f56918g;
                        MergedBillingThemeBillingPage mergedBillingThemeBillingPage2 = mergedBillingThemeBillingPage;
                        if (sVar2.S) {
                            cVar = cVar2;
                        } else {
                            cVar = cVar2;
                            if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                            }
                            y2.h hVar4 = y2.j.f56915d;
                            l1.t.J(hVar4, rVarC2, sVar2);
                            z1.r rVarW = e2.w(oVar, null, 3);
                            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                            long j11 = jW;
                            iHashCode = Long.hashCode(sVar2.T);
                            q1 q1VarL2 = sVar2.l();
                            z1.r rVarC3 = z1.a.c(sVar2, rVarW);
                            sVar2.h0();
                            if (sVar2.S) {
                                sVar2.k(iVar);
                            } else {
                                sVar2.r0();
                            }
                            l1.t.J(hVar, q0VarD, sVar2);
                            l1.t.J(hVar2, q1VarL2, sVar2);
                            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
                            }
                            l1.t.J(hVar4, rVarC3, sVar2);
                            sVar = sVar2;
                            r4.b(se.k.y(h0Var.f5041c, sVar2, 0), null, null, j11, sVar, 56, 4);
                            if (str2.equals("review") || !this.f5001c) {
                                z11 = false;
                                sVar.d0(-133477307);
                            } else {
                                sVar.d0(-129866489);
                                z11 = false;
                                j0.o.a(d0.n.h(j0.c.x(j0.r.f35391a.a(e2.n(oVar, 8), z1.c.f58465c), 6, -4), g2.f0.e(4294923091L), r0.f.f48733a), sVar, 0);
                            }
                            sVar.p(z11);
                            sVar.p(true);
                            ua.b(ub.a.e0(sVar, h0Var.f5040b), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, new y0(j11, j3.A(10), n3.s.H, null, 0L, 0, 0L, 16777208), sVar, 0, 0, 65534);
                            sVar2 = sVar;
                            sVar2.p(true);
                            z12 = z11;
                            str = str3;
                            mergedBillingThemeBillingPage = mergedBillingThemeBillingPage2;
                            cVar2 = cVar;
                            it = it2;
                        }
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                        y2.h hVar5 = y2.j.f56915d;
                        l1.t.J(hVar5, rVarC2, sVar2);
                        z1.r rVarW2 = e2.w(oVar, null, 3);
                        q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                        long j12 = jW;
                        iHashCode = Long.hashCode(sVar2.T);
                        q1 q1VarL3 = sVar2.l();
                        z1.r rVarC4 = z1.a.c(sVar2, rVarW2);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(hVar, q0VarD2, sVar2);
                        l1.t.J(hVar2, q1VarL3, sVar2);
                        if (sVar2.S) {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
                        } else {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
                        }
                        l1.t.J(hVar5, rVarC4, sVar2);
                        sVar = sVar2;
                        r4.b(se.k.y(h0Var.f5041c, sVar2, 0), null, null, j12, sVar, 56, 4);
                        if (str2.equals("review")) {
                            z11 = false;
                            sVar.d0(-133477307);
                        } else {
                            z11 = false;
                            sVar.d0(-133477307);
                        }
                        sVar.p(z11);
                        sVar.p(true);
                        ua.b(ub.a.e0(sVar, h0Var.f5040b), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, new y0(j12, j3.A(10), n3.s.H, null, 0L, 0, 0L, 16777208), sVar, 0, 0, 65534);
                        sVar2 = sVar;
                        sVar2.p(true);
                        z12 = z11;
                        str = str3;
                        mergedBillingThemeBillingPage = mergedBillingThemeBillingPage2;
                        cVar2 = cVar;
                        it = it2;
                    }
                } else {
                    sVar2.W();
                }
                break;
            case 1:
                fz.a aVar = (fz.a) this.f5002d;
                fz.a aVar2 = (fz.a) this.f5003e;
                b1 b1Var = (b1) this.f5004f;
                b1 b1Var2 = (b1) this.f5005t;
                b2 AppTopAppBar = (b2) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppTopAppBar, "$this$AppTopAppBar");
                l1.s sVar3 = (l1.s) nVar2;
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean z13 = this.f5000b;
                    l1.g gVar = l1.m.f39353a;
                    if (z13) {
                        sVar3.d0(273491026);
                        boolean zF2 = sVar3.f(aVar);
                        Object objQ2 = sVar3.Q();
                        if (zF2 || objQ2 == gVar) {
                            objQ2 = new mt.e2(0, aVar);
                            sVar3.o0(objQ2);
                        }
                        k7.h((fz.a) objQ2, null, false, null, mt.g.f41440l0, sVar3, 196608, 30);
                    } else {
                        sVar3.d0(245429299);
                    }
                    sVar3.p(false);
                    Object objQ3 = sVar3.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new w1(2, b1Var);
                        sVar3.o0(objQ3);
                    }
                    k7.h((fz.a) objQ3, null, false, null, mt.g.f41441m0, sVar3, 196614, 30);
                    if (this.f5001c) {
                        sVar3.d0(245429299);
                    } else {
                        sVar3.d0(274327189);
                        Object objQ4 = sVar3.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new w1(3, b1Var2);
                            sVar3.o0(objQ4);
                        }
                        k7.h((fz.a) objQ4, null, false, null, mt.g.f41443n0, sVar3, 196614, 30);
                    }
                    sVar3.p(false);
                    boolean zF3 = sVar3.f(aVar2);
                    Object objQ5 = sVar3.Q();
                    if (zF3 || objQ5 == gVar) {
                        objQ5 = new mt.e2(1, aVar2);
                        sVar3.o0(objQ5);
                    }
                    k7.h((fz.a) objQ5, null, false, null, mt.g.f41445o0, sVar3, 196608, 30);
                } else {
                    sVar3.W();
                }
                break;
            default:
                y8 y8Var = (y8) this.f5002d;
                fz.e eVar = (fz.e) this.f5003e;
                fz.a aVar3 = (fz.a) this.f5004f;
                fz.c cVar3 = (fz.c) this.f5005t;
                l0.c item = (l0.c) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar4 = (l1.s) nVar3;
                if (sVar4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean z14 = !this.f5001c;
                    boolean zF4 = sVar4.f(eVar) | sVar4.f(aVar3);
                    Object objQ6 = sVar4.Q();
                    l1.g gVar2 = l1.m.f39353a;
                    if (zF4 || objQ6 == gVar2) {
                        objQ6 = new m2(eVar, aVar3, 1);
                        sVar4.o0(objQ6);
                    }
                    fz.e eVar2 = (fz.e) objQ6;
                    boolean zF5 = sVar4.f(cVar3) | sVar4.h(y8Var);
                    Object objQ7 = sVar4.Q();
                    if (zF5 || objQ7 == gVar2) {
                        objQ7 = new z1(11, cVar3, y8Var);
                        sVar4.o0(objQ7);
                    }
                    f6.g(this.f5000b, y8Var, z14, eVar2, (fz.a) objQ7, sVar4, 0, 0);
                } else {
                    sVar4.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ b0(boolean z11, Object obj, boolean z12, qy.e eVar, Object obj2, Object obj3, int i11) {
        this.f4999a = i11;
        this.f5000b = z11;
        this.f5002d = obj;
        this.f5001c = z12;
        this.f5003e = eVar;
        this.f5004f = obj2;
        this.f5005t = obj3;
    }
}
