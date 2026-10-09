package ei;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import bt.c0;
import bt.c2;
import bt.g6;
import com.lingo.lingoskill.object.KOCharZhuyin;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.DayStreakFinishedStatus;
import gp.l1;
import h1.dc;
import h1.fc;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.e2;
import java.util.ArrayList;
import java.util.List;
import l1.a1;
import l1.b1;
import l1.b3;
import l1.q1;
import n0.w0;
import pr.f0;
import qy.b0;
import ry.m;
import w2.q0;
import xu.e1;
import ys.o0;
import ys.p0;
import ys.r0;
import ys.s0;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements fz.g {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f25608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25612f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f25613t;

    public /* synthetic */ j(ViewModel viewModel, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, b1 b1Var6, b1 b1Var7, b1 b1Var8, int i11) {
        this.f25607a = i11;
        this.L = viewModel;
        this.f25608b = b1Var;
        this.f25609c = b1Var2;
        this.f25610d = b1Var3;
        this.f25611e = b1Var4;
        this.f25612f = b1Var5;
        this.f25613t = b1Var6;
        this.H = b1Var7;
        this.K = b1Var8;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        l1.s sVar;
        boolean z11;
        dn.c cVar;
        l1.s sVar2;
        boolean z12;
        b1 b1Var;
        final b1 b1Var2;
        final b1 b1Var3;
        final dn.c cVar2;
        l1.s sVar3;
        Object yVar;
        b1 b1Var4;
        b1 b1Var5;
        char c11;
        Object obj5;
        final b1 b1Var6;
        final dn.d dVar;
        l1.s sVar4;
        final b1 b1Var7;
        final b1 b1Var8;
        final b1 b1Var9;
        final b1 b1Var10;
        switch (this.f25607a) {
            case 0:
                gi.d dVar2 = (gi.d) this.L;
                b1 b1Var11 = (b1) this.f25609c;
                b1 b1Var12 = (b1) this.f25610d;
                b1 b1Var13 = (b1) this.f25611e;
                b1 b1Var14 = (b1) this.f25612f;
                b1 b1Var15 = (b1) this.f25613t;
                b1 b1Var16 = (b1) this.H;
                b1 b1Var17 = (b1) this.K;
                o0.o HorizontalPager = (o0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.n nVar = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                z1.o oVar = z1.o.f58481a;
                if (iIntValue == 1) {
                    l1.s sVar5 = (l1.s) nVar;
                    sVar5.d0(765428188);
                    z.a(e2.d(oVar, 1.0f), null, null, sVar5, 6);
                    sVar5.p(false);
                } else {
                    l1.s sVar6 = (l1.s) nVar;
                    sVar6.d0(765853570);
                    dn.d dVar3 = (dn.d) dVar2.f29262t.getValue();
                    z1.r rVarD = e2.d(oVar, 1.0f);
                    q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    int iHashCode = Long.hashCode(sVar6.T);
                    q1 q1VarL = sVar6.l();
                    z1.r rVarC = z1.a.c(sVar6, rVarD);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar);
                    } else {
                        sVar6.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar6);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar6);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar6, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar6);
                    if (dVar3 != null) {
                        sVar6.d0(2075409949);
                        l1.t.a(g1.f58552n.a(v3.m.Ltr), t1.e.d(1809936622, new c0(dVar3, dVar2, this.f25608b, b1Var11, b1Var12, b1Var13, b1Var14, b1Var15, b1Var16, b1Var17), sVar6), sVar6, 56);
                        z11 = false;
                        sVar6.p(false);
                        sVar = sVar6;
                    } else {
                        sVar6.d0(2082373107);
                        ua.b("No data available", null, ((s1) sVar6.j(v1.f31180a)).f31036s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar6.j(fc.f30256a)).f30177j, sVar6, 6, 0, 65530);
                        sVar = sVar6;
                        z11 = false;
                        sVar.p(false);
                    }
                    sVar.p(true);
                    sVar.p(z11);
                }
                return b0.f48488a;
            case 1:
                final gn.e eVar = (gn.e) this.L;
                final b1 b1Var18 = (b1) this.f25609c;
                final b1 b1Var19 = (b1) this.f25610d;
                final b1 b1Var20 = (b1) this.f25611e;
                b1 b1Var21 = (b1) this.f25612f;
                final b1 b1Var22 = (b1) this.f25613t;
                final b1 b1Var23 = (b1) this.H;
                final b1 b1Var24 = (b1) this.K;
                o0.o HorizontalPager2 = (o0.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.n nVar2 = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(HorizontalPager2, "$this$HorizontalPager");
                if (iIntValue2 == 0) {
                    cVar = eVar.K;
                } else if (iIntValue2 == 1) {
                    cVar = eVar.L;
                } else if (iIntValue2 != 2) {
                    cVar = iIntValue2 != 3 ? null : eVar.N;
                } else {
                    cVar = eVar.M;
                }
                dn.c cVar3 = cVar;
                z1.o oVar2 = z1.o.f58481a;
                z1.r rVarD2 = e2.d(oVar2, 1.0f);
                q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                l1.s sVar7 = (l1.s) nVar2;
                int iHashCode2 = Long.hashCode(sVar7.T);
                q1 q1VarL2 = sVar7.l();
                z1.r rVarC2 = z1.a.c(nVar2, rVarD2);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar7.h0();
                if (sVar7.S) {
                    sVar7.k(iVar2);
                } else {
                    sVar7.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD2, nVar2);
                l1.t.J(y2.j.f56916e, q1VarL2, nVar2);
                y2.h hVar2 = y2.j.f56918g;
                if (sVar7.S || !kotlin.jvm.internal.m.a(sVar7.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar7, iHashCode2, hVar2);
                }
                l1.t.J(y2.j.f56915d, rVarC2, nVar2);
                if (cVar3 != null) {
                    sVar7.d0(-1160065790);
                    b1 b1Var25 = this.f25608b;
                    Integer num = (Integer) b1Var25.getValue();
                    Integer num2 = (Integer) b1Var18.getValue();
                    Integer num3 = (Integer) b1Var19.getValue();
                    Integer num4 = (Integer) b1Var20.getValue();
                    z1.r rVarA = j0.c.A(e2.d(oVar2, 1.0f), 8);
                    boolean zH = sVar7.h(eVar);
                    Object objQ = sVar7.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zH || objQ == gVar) {
                        b1Var = b1Var25;
                        b1Var2 = b1Var21;
                        objQ = new bp.y((ViewModel) eVar, b1Var, b1Var18, b1Var2, b1Var22, 4);
                        sVar7.o0(objQ);
                    } else {
                        b1Var = b1Var25;
                        b1Var2 = b1Var21;
                    }
                    fz.f fVar = (fz.f) objQ;
                    boolean zH2 = sVar7.h(eVar) | sVar7.h(cVar3);
                    Object objQ2 = sVar7.Q();
                    if (zH2 || objQ2 == gVar) {
                        final int i11 = 0;
                        b1Var3 = b1Var;
                        cVar2 = cVar3;
                        sVar2 = sVar7;
                        fz.c cVar4 = new fz.c() { // from class: en.b
                            @Override // fz.c
                            public final Object invoke(Object obj6) {
                                Integer num5 = (Integer) obj6;
                                switch (i11) {
                                    case 0:
                                        int iIntValue3 = num5.intValue();
                                        b1 b1Var26 = b1Var23;
                                        Integer num6 = (Integer) b1Var26.getValue();
                                        gn.e eVar2 = eVar;
                                        b1 b1Var27 = b1Var2;
                                        b1 b1Var28 = b1Var24;
                                        b1 b1Var29 = b1Var3;
                                        b1 b1Var30 = b1Var18;
                                        b1 b1Var31 = b1Var19;
                                        b1 b1Var32 = b1Var20;
                                        if (num6 == null || num6.intValue() != iIntValue3 || ((List) b1Var27.getValue()) == null) {
                                            b1Var29.setValue(num5);
                                            b1Var30.setValue(1);
                                            b1Var31.setValue(num5);
                                            b1Var32.setValue(1);
                                            ArrayList arrayList = new ArrayList();
                                            dn.d dVar4 = cVar2;
                                            int iA = dVar4.a();
                                            for (int i12 = 1; i12 < iA; i12++) {
                                                arrayList.add((KOCharZhuyin) dVar4.d(iIntValue3, i12));
                                            }
                                            if (!arrayList.isEmpty()) {
                                                b1Var27.setValue(arrayList);
                                                eVar2.b(iIntValue3, 1, (KOCharZhuyin) m.q0(arrayList));
                                                b1Var26.setValue(num5);
                                                b1Var28.setValue(null);
                                                b1Var22.setValue(Boolean.FALSE);
                                            }
                                        } else {
                                            b1Var27.setValue(null);
                                            b1Var26.setValue(null);
                                            b1Var28.setValue(null);
                                            b1Var29.setValue(null);
                                            b1Var30.setValue(null);
                                            b1Var31.setValue(null);
                                            b1Var32.setValue(null);
                                            eVar2.a();
                                        }
                                        break;
                                    default:
                                        int iIntValue4 = num5.intValue();
                                        b1 b1Var33 = b1Var23;
                                        Integer num7 = (Integer) b1Var33.getValue();
                                        gn.e eVar3 = eVar;
                                        b1 b1Var34 = b1Var2;
                                        b1 b1Var35 = b1Var24;
                                        b1 b1Var36 = b1Var3;
                                        b1 b1Var37 = b1Var18;
                                        b1 b1Var38 = b1Var19;
                                        b1 b1Var39 = b1Var20;
                                        if (num7 == null || num7.intValue() != iIntValue4 || ((List) b1Var34.getValue()) == null) {
                                            b1Var37.setValue(num5);
                                            b1Var36.setValue(1);
                                            b1Var38.setValue(1);
                                            b1Var39.setValue(num5);
                                            ArrayList arrayList2 = new ArrayList();
                                            dn.d dVar5 = cVar2;
                                            int iF = dVar5.f();
                                            for (int i13 = 1; i13 < iF; i13++) {
                                                arrayList2.add((KOCharZhuyin) dVar5.d(i13, iIntValue4));
                                            }
                                            if (!arrayList2.isEmpty()) {
                                                b1Var34.setValue(arrayList2);
                                                eVar3.b(1, iIntValue4, (KOCharZhuyin) m.q0(arrayList2));
                                                b1Var33.setValue(num5);
                                                b1Var35.setValue(null);
                                                b1Var22.setValue(Boolean.FALSE);
                                            }
                                        } else {
                                            b1Var34.setValue(null);
                                            b1Var35.setValue(null);
                                            b1Var33.setValue(null);
                                            b1Var36.setValue(null);
                                            b1Var37.setValue(null);
                                            b1Var38.setValue(null);
                                            b1Var39.setValue(null);
                                            eVar3.a();
                                        }
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar2.o0(cVar4);
                        objQ2 = cVar4;
                    } else {
                        b1Var3 = b1Var;
                        cVar2 = cVar3;
                        sVar2 = sVar7;
                    }
                    fz.c cVar5 = (fz.c) objQ2;
                    boolean zH3 = sVar2.h(eVar) | sVar2.h(cVar2);
                    Object objQ3 = sVar2.Q();
                    if (zH3 || objQ3 == gVar) {
                        final int i12 = 1;
                        fz.c cVar6 = new fz.c() { // from class: en.b
                            @Override // fz.c
                            public final Object invoke(Object obj6) {
                                Integer num5 = (Integer) obj6;
                                switch (i12) {
                                    case 0:
                                        int iIntValue3 = num5.intValue();
                                        b1 b1Var26 = b1Var24;
                                        Integer num6 = (Integer) b1Var26.getValue();
                                        gn.e eVar2 = eVar;
                                        b1 b1Var27 = b1Var2;
                                        b1 b1Var28 = b1Var23;
                                        b1 b1Var29 = b1Var3;
                                        b1 b1Var30 = b1Var18;
                                        b1 b1Var31 = b1Var19;
                                        b1 b1Var32 = b1Var20;
                                        if (num6 == null || num6.intValue() != iIntValue3 || ((List) b1Var27.getValue()) == null) {
                                            b1Var29.setValue(num5);
                                            b1Var30.setValue(1);
                                            b1Var31.setValue(num5);
                                            b1Var32.setValue(1);
                                            ArrayList arrayList = new ArrayList();
                                            dn.d dVar4 = cVar2;
                                            int iA = dVar4.a();
                                            for (int i13 = 1; i13 < iA; i13++) {
                                                arrayList.add((KOCharZhuyin) dVar4.d(iIntValue3, i13));
                                            }
                                            if (!arrayList.isEmpty()) {
                                                b1Var27.setValue(arrayList);
                                                eVar2.b(iIntValue3, 1, (KOCharZhuyin) m.q0(arrayList));
                                                b1Var26.setValue(num5);
                                                b1Var28.setValue(null);
                                                b1Var22.setValue(Boolean.FALSE);
                                            }
                                        } else {
                                            b1Var27.setValue(null);
                                            b1Var26.setValue(null);
                                            b1Var28.setValue(null);
                                            b1Var29.setValue(null);
                                            b1Var30.setValue(null);
                                            b1Var31.setValue(null);
                                            b1Var32.setValue(null);
                                            eVar2.a();
                                        }
                                        break;
                                    default:
                                        int iIntValue4 = num5.intValue();
                                        b1 b1Var33 = b1Var24;
                                        Integer num7 = (Integer) b1Var33.getValue();
                                        gn.e eVar3 = eVar;
                                        b1 b1Var34 = b1Var2;
                                        b1 b1Var35 = b1Var23;
                                        b1 b1Var36 = b1Var3;
                                        b1 b1Var37 = b1Var18;
                                        b1 b1Var38 = b1Var19;
                                        b1 b1Var39 = b1Var20;
                                        if (num7 == null || num7.intValue() != iIntValue4 || ((List) b1Var34.getValue()) == null) {
                                            b1Var37.setValue(num5);
                                            b1Var36.setValue(1);
                                            b1Var38.setValue(1);
                                            b1Var39.setValue(num5);
                                            ArrayList arrayList2 = new ArrayList();
                                            dn.d dVar5 = cVar2;
                                            int iF = dVar5.f();
                                            for (int i14 = 1; i14 < iF; i14++) {
                                                arrayList2.add((KOCharZhuyin) dVar5.d(i14, iIntValue4));
                                            }
                                            if (!arrayList2.isEmpty()) {
                                                b1Var34.setValue(arrayList2);
                                                eVar3.b(1, iIntValue4, (KOCharZhuyin) m.q0(arrayList2));
                                                b1Var33.setValue(num5);
                                                b1Var35.setValue(null);
                                                b1Var22.setValue(Boolean.FALSE);
                                            }
                                        } else {
                                            b1Var34.setValue(null);
                                            b1Var35.setValue(null);
                                            b1Var33.setValue(null);
                                            b1Var36.setValue(null);
                                            b1Var37.setValue(null);
                                            b1Var38.setValue(null);
                                            b1Var39.setValue(null);
                                            eVar3.a();
                                        }
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar2.o0(cVar6);
                        objQ3 = cVar6;
                    }
                    z12 = true;
                    en.a.a(48, cVar2, null, cVar5, (fz.c) objQ3, fVar, num, num2, num3, num4, nVar2, rVarA);
                    sVar2.p(false);
                } else {
                    sVar2 = sVar7;
                    z12 = true;
                    sVar2.d0(-1153734350);
                    l1.s sVar8 = (l1.s) nVar2;
                    ua.b("No data available", null, ((s1) sVar8.j(v1.f31180a)).f31036s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar8.j(fc.f30256a)).f30177j, nVar2, 6, 0, 65530);
                    sVar2.p(false);
                }
                sVar2.p(z12);
                return b0.f48488a;
            case 2:
                ur.a aVar = (ur.a) this.L;
                ni.m mVar = (ni.m) this.f25611e;
                l1 l1Var = (l1) this.f25612f;
                f.n nVar3 = (f.n) this.f25613t;
                fz.a aVar2 = (fz.a) this.H;
                fz.a aVar3 = (fz.a) this.K;
                b1 b1Var26 = (b1) this.f25609c;
                b1 b1Var27 = (b1) this.f25610d;
                l1.n nVar4 = (l1.n) obj3;
                ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
                v3.m mVar2 = kotlin.jvm.internal.m.a((String) this.f25608b.getValue(), "ar") ? v3.m.Rtl : v3.m.Ltr;
                l1.s sVar9 = (l1.s) nVar4;
                boolean zH4 = sVar9.h(aVar);
                Object objQ4 = sVar9.Q();
                if (zH4 || objQ4 == l1.m.f39353a) {
                    objQ4 = new br.p(aVar, null, 1);
                    sVar9.o0(objQ4);
                }
                b0 b0Var = b0.f48488a;
                l1.t.f((fz.e) objQ4, b0Var, sVar9);
                l1.t.a(g1.f58552n.a(mVar2), t1.e.d(1820526800, new g6(mVar, l1Var, aVar, nVar3, aVar2, aVar3, b1Var26, b1Var27, 3), sVar9), sVar9, 56);
                return b0Var;
            case 3:
                final tq.d dVar4 = (tq.d) this.L;
                final b1 b1Var28 = (b1) this.f25609c;
                final b1 b1Var29 = (b1) this.f25610d;
                b1 b1Var30 = (b1) this.f25611e;
                final b1 b1Var31 = (b1) this.f25612f;
                final b1 b1Var32 = (b1) this.f25613t;
                b1 b1Var33 = (b1) this.H;
                b1 b1Var34 = (b1) this.K;
                o0.o HorizontalPager3 = (o0.o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.n nVar5 = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(HorizontalPager3, "$this$HorizontalPager");
                dn.d dVarB = dVar4.b(iIntValue3);
                z1.o oVar3 = z1.o.f58481a;
                z1.r rVarD3 = e2.d(oVar3, 1.0f);
                q0 q0VarD3 = j0.o.d(z1.c.f58467e, false);
                l1.s sVar10 = (l1.s) nVar5;
                int iHashCode3 = Long.hashCode(sVar10.T);
                q1 q1VarL3 = sVar10.l();
                z1.r rVarC3 = z1.a.c(nVar5, rVarD3);
                y2.k.J.getClass();
                y2.i iVar3 = y2.j.f56913b;
                sVar10.h0();
                if (sVar10.S) {
                    sVar10.k(iVar3);
                } else {
                    sVar10.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD3, nVar5);
                l1.t.J(y2.j.f56916e, q1VarL3, nVar5);
                y2.h hVar3 = y2.j.f56918g;
                if (sVar10.S || !kotlin.jvm.internal.m.a(sVar10.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar10, iHashCode3, hVar3);
                }
                l1.t.J(y2.j.f56915d, rVarC3, nVar5);
                if (dVarB != null) {
                    sVar10.d0(-1208985911);
                    boolean zH5 = sVar10.h(dVar4);
                    Object objQ5 = sVar10.Q();
                    b1 b1Var35 = this.f25608b;
                    l1.g gVar2 = l1.m.f39353a;
                    if (zH5 || objQ5 == gVar2) {
                        b1Var4 = b1Var35;
                        b1Var5 = b1Var30;
                        c11 = 0;
                        yVar = new bp.y((ViewModel) dVar4, b1Var4, b1Var28, b1Var29, b1Var5, 10);
                        sVar10.o0(yVar);
                    } else {
                        yVar = objQ5;
                        b1Var4 = b1Var35;
                        b1Var5 = b1Var30;
                        c11 = 0;
                    }
                    fz.f fVar2 = (fz.f) yVar;
                    boolean zH6 = sVar10.h(dVar4) | sVar10.h(dVarB);
                    Object objQ6 = sVar10.Q();
                    if (zH6 || objQ6 == gVar2) {
                        final int i13 = 0;
                        b1Var6 = b1Var4;
                        dVar = dVarB;
                        sVar4 = sVar10;
                        b1Var7 = b1Var5;
                        b1Var8 = b1Var33;
                        b1Var9 = b1Var34;
                        obj5 = new fz.c() { // from class: nq.b
                            @Override // fz.c
                            public final Object invoke(Object obj6) {
                                Integer num5 = (Integer) obj6;
                                switch (i13) {
                                    case 0:
                                        int iIntValue4 = num5.intValue();
                                        b1 b1Var36 = b1Var31;
                                        Integer num6 = (Integer) b1Var36.getValue();
                                        tq.d dVar5 = dVar4;
                                        b1 b1Var37 = b1Var29;
                                        b1 b1Var38 = b1Var32;
                                        b1 b1Var39 = b1Var6;
                                        b1 b1Var40 = b1Var28;
                                        b1 b1Var41 = b1Var8;
                                        b1 b1Var42 = b1Var9;
                                        if (num6 == null || num6.intValue() != iIntValue4 || ((List) b1Var37.getValue()) == null) {
                                            b1Var39.setValue(num5);
                                            b1Var40.setValue(0);
                                            b1Var41.setValue(null);
                                            b1Var42.setValue(null);
                                            b1Var41.setValue(num5);
                                            b1Var42.setValue(0);
                                            ArrayList arrayList = new ArrayList();
                                            dn.d dVar6 = dVar;
                                            int iA = dVar6.a();
                                            for (int i14 = 0; i14 < iA; i14++) {
                                                arrayList.add(dVar6.d(iIntValue4, i14));
                                            }
                                            if (!arrayList.isEmpty()) {
                                                b1Var37.setValue(arrayList);
                                                dVar5.c(iIntValue4, 0, (pq.a) m.q0(arrayList));
                                                b1Var36.setValue(num5);
                                                b1Var38.setValue(null);
                                                b1Var7.setValue(Boolean.FALSE);
                                            }
                                        } else {
                                            b1Var37.setValue(null);
                                            b1Var36.setValue(null);
                                            b1Var38.setValue(null);
                                            b1Var39.setValue(null);
                                            b1Var40.setValue(null);
                                            b1Var41.setValue(null);
                                            b1Var42.setValue(null);
                                            dVar5.a();
                                        }
                                        break;
                                    default:
                                        int iIntValue5 = num5.intValue();
                                        b1 b1Var43 = b1Var31;
                                        Integer num7 = (Integer) b1Var43.getValue();
                                        tq.d dVar7 = dVar4;
                                        b1 b1Var44 = b1Var29;
                                        b1 b1Var45 = b1Var32;
                                        b1 b1Var46 = b1Var6;
                                        b1 b1Var47 = b1Var28;
                                        b1 b1Var48 = b1Var8;
                                        b1 b1Var49 = b1Var9;
                                        if (num7 == null || num7.intValue() != iIntValue5 || ((List) b1Var44.getValue()) == null) {
                                            b1Var47.setValue(num5);
                                            b1Var46.setValue(0);
                                            b1Var48.setValue(null);
                                            b1Var49.setValue(null);
                                            b1Var48.setValue(0);
                                            b1Var49.setValue(num5);
                                            ArrayList arrayList2 = new ArrayList();
                                            dn.d dVar8 = dVar;
                                            int iF = dVar8.f();
                                            for (int i15 = 0; i15 < iF; i15++) {
                                                arrayList2.add(dVar8.d(i15, iIntValue5));
                                            }
                                            if (!arrayList2.isEmpty()) {
                                                b1Var44.setValue(arrayList2);
                                                dVar7.c(0, iIntValue5, (pq.a) m.q0(arrayList2));
                                                b1Var43.setValue(num5);
                                                b1Var45.setValue(null);
                                                b1Var7.setValue(Boolean.FALSE);
                                            }
                                        } else {
                                            b1Var44.setValue(null);
                                            b1Var45.setValue(null);
                                            b1Var43.setValue(null);
                                            b1Var46.setValue(null);
                                            b1Var47.setValue(null);
                                            b1Var48.setValue(null);
                                            b1Var49.setValue(null);
                                            dVar7.a();
                                        }
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        b1Var10 = b1Var32;
                        sVar4.o0(obj5);
                    } else {
                        b1Var6 = b1Var4;
                        obj5 = objQ6;
                        b1Var10 = b1Var32;
                        b1Var8 = b1Var33;
                        dVar = dVarB;
                        b1Var9 = b1Var34;
                        b1Var7 = b1Var5;
                        sVar4 = sVar10;
                    }
                    fz.c cVar7 = (fz.c) obj5;
                    boolean zH7 = sVar4.h(dVar4) | sVar4.h(dVar);
                    Object objQ7 = sVar4.Q();
                    if (zH7 || objQ7 == gVar2) {
                        final int i14 = 1;
                        fz.c cVar8 = new fz.c() { // from class: nq.b
                            @Override // fz.c
                            public final Object invoke(Object obj6) {
                                Integer num5 = (Integer) obj6;
                                switch (i14) {
                                    case 0:
                                        int iIntValue4 = num5.intValue();
                                        b1 b1Var36 = b1Var10;
                                        Integer num6 = (Integer) b1Var36.getValue();
                                        tq.d dVar5 = dVar4;
                                        b1 b1Var37 = b1Var29;
                                        b1 b1Var38 = b1Var31;
                                        b1 b1Var39 = b1Var6;
                                        b1 b1Var40 = b1Var28;
                                        b1 b1Var41 = b1Var8;
                                        b1 b1Var42 = b1Var9;
                                        if (num6 == null || num6.intValue() != iIntValue4 || ((List) b1Var37.getValue()) == null) {
                                            b1Var39.setValue(num5);
                                            b1Var40.setValue(0);
                                            b1Var41.setValue(null);
                                            b1Var42.setValue(null);
                                            b1Var41.setValue(num5);
                                            b1Var42.setValue(0);
                                            ArrayList arrayList = new ArrayList();
                                            dn.d dVar6 = dVar;
                                            int iA = dVar6.a();
                                            for (int i15 = 0; i15 < iA; i15++) {
                                                arrayList.add(dVar6.d(iIntValue4, i15));
                                            }
                                            if (!arrayList.isEmpty()) {
                                                b1Var37.setValue(arrayList);
                                                dVar5.c(iIntValue4, 0, (pq.a) m.q0(arrayList));
                                                b1Var36.setValue(num5);
                                                b1Var38.setValue(null);
                                                b1Var7.setValue(Boolean.FALSE);
                                            }
                                        } else {
                                            b1Var37.setValue(null);
                                            b1Var36.setValue(null);
                                            b1Var38.setValue(null);
                                            b1Var39.setValue(null);
                                            b1Var40.setValue(null);
                                            b1Var41.setValue(null);
                                            b1Var42.setValue(null);
                                            dVar5.a();
                                        }
                                        break;
                                    default:
                                        int iIntValue5 = num5.intValue();
                                        b1 b1Var43 = b1Var10;
                                        Integer num7 = (Integer) b1Var43.getValue();
                                        tq.d dVar7 = dVar4;
                                        b1 b1Var44 = b1Var29;
                                        b1 b1Var45 = b1Var31;
                                        b1 b1Var46 = b1Var6;
                                        b1 b1Var47 = b1Var28;
                                        b1 b1Var48 = b1Var8;
                                        b1 b1Var49 = b1Var9;
                                        if (num7 == null || num7.intValue() != iIntValue5 || ((List) b1Var44.getValue()) == null) {
                                            b1Var47.setValue(num5);
                                            b1Var46.setValue(0);
                                            b1Var48.setValue(null);
                                            b1Var49.setValue(null);
                                            b1Var48.setValue(0);
                                            b1Var49.setValue(num5);
                                            ArrayList arrayList2 = new ArrayList();
                                            dn.d dVar8 = dVar;
                                            int iF = dVar8.f();
                                            for (int i16 = 0; i16 < iF; i16++) {
                                                arrayList2.add(dVar8.d(i16, iIntValue5));
                                            }
                                            if (!arrayList2.isEmpty()) {
                                                b1Var44.setValue(arrayList2);
                                                dVar7.c(0, iIntValue5, (pq.a) m.q0(arrayList2));
                                                b1Var43.setValue(num5);
                                                b1Var45.setValue(null);
                                                b1Var7.setValue(Boolean.FALSE);
                                            }
                                        } else {
                                            b1Var44.setValue(null);
                                            b1Var45.setValue(null);
                                            b1Var43.setValue(null);
                                            b1Var46.setValue(null);
                                            b1Var47.setValue(null);
                                            b1Var48.setValue(null);
                                            b1Var49.setValue(null);
                                            dVar7.a();
                                        }
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar4.o0(cVar8);
                        objQ7 = cVar8;
                    }
                    sVar3 = sVar4;
                    nq.a.a(805306368, dVar, null, cVar7, (fz.c) objQ7, fVar2, (Integer) b1Var6.getValue(), (Integer) b1Var28.getValue(), (Integer) b1Var8.getValue(), (Integer) b1Var9.getValue(), nVar5, j0.c.A(e2.d(oVar3, c11), 8));
                    sVar3.p(false);
                } else {
                    sVar3 = sVar10;
                    sVar3.d0(-1203723506);
                    l1.s sVar11 = (l1.s) nVar5;
                    ua.b("No data available", null, ((s1) sVar11.j(v1.f31180a)).f31036s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar11.j(fc.f30256a)).f30177j, nVar5, 6, 0, 65530);
                    sVar3.p(false);
                }
                sVar3.p(true);
                return b0.f48488a;
            case 4:
                sv.h hVar4 = (sv.h) this.L;
                qv.e eVar2 = (qv.e) this.f25609c;
                fz.a aVar4 = (fz.a) this.f25610d;
                fz.a aVar5 = (fz.a) this.f25611e;
                fz.a aVar6 = (fz.a) this.f25612f;
                sv.j jVar = (sv.j) this.f25613t;
                j9.v vVar = (j9.v) this.H;
                b3 b3Var = (b3) this.K;
                a0.r composable = (a0.r) obj;
                l1.n nVar6 = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(composable, "$this$composable");
                kotlin.jvm.internal.m.f((j9.e) obj2, "it");
                if (!((Boolean) this.f25608b.getValue()).booleanValue()) {
                    qv.c cVar9 = (qv.c) b3Var.getValue();
                    l1.s sVar12 = (l1.s) nVar6;
                    boolean zH8 = sVar12.h(eVar2);
                    Object objQ8 = sVar12.Q();
                    l1.g gVar3 = l1.m.f39353a;
                    if (zH8 || objQ8 == gVar3) {
                        objQ8 = new lt.e(eVar2, 8);
                        sVar12.o0(objQ8);
                    }
                    fz.a aVar7 = (fz.a) objQ8;
                    boolean zF = sVar12.f(aVar5);
                    Object objQ9 = sVar12.Q();
                    if (zF || objQ9 == gVar3) {
                        objQ9 = new nv.d(2, aVar5);
                        sVar12.o0(objQ9);
                    }
                    fz.a aVar8 = (fz.a) objQ9;
                    boolean zH9 = sVar12.h(jVar) | sVar12.h(vVar);
                    Object objQ10 = sVar12.Q();
                    if (zH9 || objQ10 == gVar3) {
                        objQ10 = new w0(3, jVar, vVar);
                        sVar12.o0(objQ10);
                    }
                    fz.c cVar10 = (fz.c) objQ10;
                    boolean zH10 = sVar12.h(eVar2) | sVar12.h(vVar);
                    Object objQ11 = sVar12.Q();
                    if (zH10 || objQ11 == gVar3) {
                        objQ11 = new w0(4, eVar2, vVar);
                        sVar12.o0(objQ11);
                    }
                    nv.a.g(hVar4, cVar9, aVar7, aVar4, aVar8, aVar6, cVar10, (fz.c) objQ11, sVar12, 0);
                }
                return b0.f48488a;
            default:
                fz.a aVar9 = (fz.a) this.L;
                final a1 a1Var = (a1) this.f25610d;
                final fz.a aVar10 = (fz.a) this.f25611e;
                Context context = (Context) this.f25612f;
                rz.b0 b0Var2 = (rz.b0) this.f25613t;
                fz.c cVar11 = (fz.c) this.H;
                t1.d dVar5 = (t1.d) this.K;
                final b1 b1Var36 = (b1) this.f25609c;
                a0.r AnimatedContent = (a0.r) obj;
                s0 it = (s0) obj2;
                l1.n nVar7 = (l1.n) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                kotlin.jvm.internal.m.f(AnimatedContent, "$this$AnimatedContent");
                kotlin.jvm.internal.m.f(it, "it");
                boolean z13 = (((iIntValue4 & 112) ^ 48) > 32 && ((l1.s) nVar7).h(it)) || (iIntValue4 & 48) == 32;
                l1.s sVar13 = (l1.s) nVar7;
                b1 b1Var37 = this.f25608b;
                boolean zF2 = z13 | sVar13.f(b1Var37) | sVar13.f(aVar9) | sVar13.f(a1Var) | sVar13.f(aVar10);
                Object objQ12 = sVar13.Q();
                Object obj6 = l1.m.f39353a;
                if (zF2 || objQ12 == obj6) {
                    Object c2Var = new c2(it, aVar9, b1Var37, aVar10, b1Var36, a1Var);
                    sVar13.o0(c2Var);
                    objQ12 = c2Var;
                }
                se.i.a(false, (fz.a) objQ12, sVar13, 0, 1);
                if (it instanceof o0) {
                    sVar13.d0(-1942006681);
                    AchievementLevel achievementLevel = ((o0) it).f58191a;
                    boolean zF3 = sVar13.f(a1Var) | sVar13.f(aVar10);
                    Object objQ13 = sVar13.Q();
                    if (zF3 || objQ13 == obj6) {
                        final int i15 = 1;
                        objQ13 = new fz.a() { // from class: ys.c
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        a.b(aVar10, b1Var36, a1Var);
                                        break;
                                    case 1:
                                        a.b(aVar10, b1Var36, a1Var);
                                        break;
                                    default:
                                        a.b(aVar10, b1Var36, a1Var);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar13.o0(objQ13);
                    }
                    fz.a aVar11 = (fz.a) objQ13;
                    boolean zH11 = sVar13.h(context);
                    Object objQ14 = sVar13.Q();
                    if (zH11 || objQ14 == obj6) {
                        objQ14 = new fu.f(context, 2);
                        sVar13.o0(objQ14);
                    }
                    fz.f fVar3 = (fz.f) objQ14;
                    boolean zH12 = sVar13.h(context);
                    Object objQ15 = sVar13.Q();
                    if (zH12 || objQ15 == obj6) {
                        objQ15 = new fu.h(context, 4);
                        sVar13.o0(objQ15);
                    }
                    f0.u(achievementLevel, aVar11, fVar3, (fz.c) objQ15, sVar13, 0);
                    sVar13.p(false);
                } else if (it instanceof ys.q0) {
                    sVar13.d0(-1941479185);
                    ys.q0 q0Var = (ys.q0) it;
                    DayStreakFinishedStatus dayStreakFinishedStatus = q0Var.f58220a;
                    List list = q0Var.f58221b;
                    boolean zF4 = sVar13.f(a1Var) | sVar13.f(aVar10);
                    Object objQ16 = sVar13.Q();
                    if (zF4 || objQ16 == obj6) {
                        final int i16 = 2;
                        objQ16 = new fz.a() { // from class: ys.c
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        a.b(aVar10, b1Var36, a1Var);
                                        break;
                                    case 1:
                                        a.b(aVar10, b1Var36, a1Var);
                                        break;
                                    default:
                                        a.b(aVar10, b1Var36, a1Var);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar13.o0(objQ16);
                    }
                    fz.a aVar12 = (fz.a) objQ16;
                    boolean zH13 = sVar13.h(context);
                    Object objQ17 = sVar13.Q();
                    if (zH13 || objQ17 == obj6) {
                        objQ17 = new fu.f(context, 1);
                        sVar13.o0(objQ17);
                    }
                    fz.f fVar4 = (fz.f) objQ17;
                    boolean zH14 = sVar13.h(b0Var2) | sVar13.h(context);
                    Object objQ18 = sVar13.Q();
                    if (zH14 || objQ18 == obj6) {
                        objQ18 = new fu.g(b0Var2, context, 1);
                        sVar13.o0(objQ18);
                    }
                    fz.e eVar3 = (fz.e) objQ18;
                    boolean zH15 = sVar13.h(context);
                    Object objQ19 = sVar13.Q();
                    if (zH15 || objQ19 == obj6) {
                        objQ19 = new fu.h(context, 3);
                        sVar13.o0(objQ19);
                    }
                    fu.a.h(dayStreakFinishedStatus, list, aVar12, fVar4, eVar3, (fz.c) objQ19, sVar13, 0);
                    sVar13.p(false);
                } else if (it instanceof p0) {
                    sVar13.d0(-1940727125);
                    boolean zF5 = sVar13.f(a1Var) | sVar13.f(aVar10);
                    Object objQ20 = sVar13.Q();
                    if (zF5 || objQ20 == obj6) {
                        final int i17 = 0;
                        objQ20 = new fz.a() { // from class: ys.c
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        a.b(aVar10, b1Var36, a1Var);
                                        break;
                                    case 1:
                                        a.b(aVar10, b1Var36, a1Var);
                                        break;
                                    default:
                                        a.b(aVar10, b1Var36, a1Var);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar13.o0(objQ20);
                    }
                    fz.a aVar13 = (fz.a) objQ20;
                    boolean zF6 = sVar13.f(cVar11);
                    Object objQ21 = sVar13.Q();
                    if (zF6 || objQ21 == obj6) {
                        objQ21 = new xu.w0(cVar11, 13);
                        sVar13.o0(objQ21);
                    }
                    ku.a.d(aVar13, (fz.a) objQ21, null, sVar13, 0);
                    sVar13.p(false);
                } else {
                    if (!(it instanceof r0)) {
                        throw nv.p.x(sVar13, -201193584, false);
                    }
                    sVar13.d0(-1940436097);
                    boolean zF7 = sVar13.f(b1Var37) | sVar13.f(aVar9);
                    Object objQ22 = sVar13.Q();
                    if (zF7 || objQ22 == obj6) {
                        objQ22 = new e1(3, aVar9, b1Var37);
                        sVar13.o0(objQ22);
                    }
                    dVar5.invoke((fz.a) objQ22, sVar13, 0);
                    sVar13.p(false);
                }
                return b0.f48488a;
        }
    }

    public /* synthetic */ j(b1 b1Var, fz.a aVar, a1 a1Var, fz.a aVar2, Context context, rz.b0 b0Var, fz.c cVar, t1.d dVar, b1 b1Var2) {
        this.f25607a = 5;
        this.f25608b = b1Var;
        this.L = aVar;
        this.f25610d = a1Var;
        this.f25611e = aVar2;
        this.f25612f = context;
        this.f25613t = b0Var;
        this.H = cVar;
        this.K = dVar;
        this.f25609c = b1Var2;
    }

    public /* synthetic */ j(sv.h hVar, qv.e eVar, fz.a aVar, fz.a aVar2, fz.a aVar3, sv.j jVar, j9.v vVar, b1 b1Var, b3 b3Var) {
        this.f25607a = 4;
        this.L = hVar;
        this.f25609c = eVar;
        this.f25610d = aVar;
        this.f25611e = aVar2;
        this.f25612f = aVar3;
        this.f25613t = jVar;
        this.H = vVar;
        this.f25608b = b1Var;
        this.K = b3Var;
    }

    public /* synthetic */ j(ur.a aVar, b1 b1Var, ni.m mVar, l1 l1Var, f.n nVar, fz.a aVar2, fz.a aVar3, b1 b1Var2, b1 b1Var3) {
        this.f25607a = 2;
        this.L = aVar;
        this.f25608b = b1Var;
        this.f25611e = mVar;
        this.f25612f = l1Var;
        this.f25613t = nVar;
        this.H = aVar2;
        this.K = aVar3;
        this.f25609c = b1Var2;
        this.f25610d = b1Var3;
    }
}
