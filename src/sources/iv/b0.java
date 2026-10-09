package iv;

import bp.i2;
import bp.z1;
import bt.g5;
import bt.z7;
import bw.ORXQ.ADSb;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import com.lingodeer.data.model.uistate.DailyGoalUiState;
import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import com.lingodeer.data.model.uistate.MasteryUiState;
import j0.e2;
import java.util.Iterator;
import java.util.List;
import l1.q1;
import mt.a4;
import mt.i3;
import mt.j5;
import mt.m2;
import mt.z3;
import rt.b4;
import rt.bd;
import rt.dd;
import rt.e3;
import rt.ja;
import rt.l9;
import xu.a2;
import xu.s1;
import xu.y1;
import ys.k2;
import ys.o2;
import ys.o3;
import ys.q2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b0 implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f34688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f34689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f34690f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f34691t;

    public /* synthetic */ b0(fz.a aVar, fz.c cVar, b4 b4Var, l1.b1 b1Var, l1.a1 a1Var, l1.b1 b1Var2) {
        this.f34685a = 1;
        this.f34686b = aVar;
        this.f34687c = cVar;
        this.f34688d = b4Var;
        this.f34689e = b1Var;
        this.f34690f = a1Var;
        this.f34691t = b1Var2;
    }

    public /* synthetic */ b0(fz.c cVar, e3 e3Var, l9 l9Var, fz.a aVar, j9.v vVar, fz.c cVar2) {
        this.f34685a = 2;
        this.f34687c = e3Var;
        this.f34688d = cVar;
        this.f34690f = l9Var;
        this.f34686b = aVar;
        this.f34689e = vVar;
        this.f34691t = cVar2;
    }

    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.util.List] */
    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        l1.s sVar;
        l1.b1 b1Var;
        l1.s sVar2;
        l1.g gVar;
        boolean z11;
        l1.s sVar3;
        boolean z12;
        Object tVar;
        l1.b1 b1Var2;
        l1.b1 b1Var3;
        l1.b1 b1Var4;
        boolean z13;
        switch (this.f34685a) {
            case 0:
                f0 f0Var = (f0) this.f34687c;
                fz.a aVar = (fz.a) this.f34686b;
                j9.v vVar = (j9.v) this.f34689e;
                fz.a aVar2 = (fz.a) this.f34688d;
                mv.d0 d0Var = (mv.d0) this.f34690f;
                mv.g0 g0Var = (mv.g0) this.f34691t;
                a0.r composable = (a0.r) obj;
                j9.e it = (j9.e) obj2;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(composable, "$this$composable");
                kotlin.jvm.internal.m.f(it, "it");
                l1.s sVar4 = (l1.s) ((l1.n) obj3);
                boolean zH = sVar4.h(vVar);
                Object objQ = sVar4.Q();
                l1.g gVar2 = l1.m.f39353a;
                if (zH || objQ == gVar2) {
                    objQ = new z1(vVar, 22);
                    sVar4.o0(objQ);
                }
                fz.a aVar3 = (fz.a) objQ;
                boolean zH2 = sVar4.h(d0Var) | sVar4.h(g0Var) | sVar4.h(vVar);
                Object objQ2 = sVar4.Q();
                if (zH2 || objQ2 == gVar2) {
                    objQ2 = new fp.e(d0Var, g0Var, vVar, 5);
                    sVar4.o0(objQ2);
                }
                fz.e eVar = (fz.e) objQ2;
                boolean zH3 = sVar4.h(d0Var) | sVar4.h(g0Var) | sVar4.h(vVar);
                Object objQ3 = sVar4.Q();
                if (zH3 || objQ3 == gVar2) {
                    objQ3 = new fu.j0(d0Var, g0Var, vVar, 10);
                    sVar4.o0(objQ3);
                }
                a.l(f0Var, aVar, aVar3, aVar2, eVar, (fz.c) objQ3, sVar4, 0);
                break;
            case 1:
                fz.a aVar4 = (fz.a) this.f34686b;
                fz.c cVar = (fz.c) this.f34687c;
                b4 b4Var = (b4) this.f34688d;
                l1.b1 b1Var5 = (l1.b1) this.f34689e;
                l1.a1 a1Var = (l1.a1) this.f34690f;
                l1.b1 b1Var6 = (l1.b1) this.f34691t;
                a0.r composable2 = (a0.r) obj;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(composable2, "$this$composable");
                kotlin.jvm.internal.m.f((j9.e) obj2, ADSb.dBJAYJ);
                l1.s sVar5 = (l1.s) ((l1.n) obj3);
                boolean zF = sVar5.f((String) b1Var6.getValue());
                Object objQ4 = sVar5.Q();
                l1.g gVar3 = l1.m.f39353a;
                if (zF || objQ4 == gVar3) {
                    Iterator it2 = oz.q.W0((String) b1Var6.getValue(), new String[]{";"}, 0, 6).iterator();
                    int iIntValue = 0;
                    while (it2.hasNext()) {
                        Integer numT0 = oz.x.t0((String) it2.next());
                        iIntValue += numT0 != null ? numT0.intValue() : 0;
                    }
                    objQ4 = Integer.valueOf(iIntValue);
                    sVar5.o0(objQ4);
                }
                int iIntValue2 = ((Number) objQ4).intValue();
                boolean zBooleanValue = ((Boolean) b1Var5.getValue()).booleanValue();
                boolean zH4 = sVar5.h(b4Var) | sVar5.f(b1Var5) | sVar5.f(a1Var);
                Object objQ5 = sVar5.Q();
                if (zH4 || objQ5 == gVar3) {
                    objQ5 = new m2(b4Var, b1Var5, a1Var);
                    sVar5.o0(objQ5);
                }
                mt.g.w(iIntValue2, aVar4, cVar, zBooleanValue, (fz.a) ((mz.e) objQ5), null, sVar5, 0);
                break;
            case 2:
                e3 e3Var = (e3) this.f34687c;
                fz.c cVar2 = (fz.c) this.f34688d;
                l9 l9Var = (l9) this.f34690f;
                fz.a aVar5 = (fz.a) this.f34686b;
                j9.v vVar2 = (j9.v) this.f34689e;
                fz.c cVar3 = (fz.c) this.f34691t;
                ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
                l1.s sVar6 = (l1.s) ((l1.n) obj3);
                boolean zH5 = sVar6.h(e3Var);
                Object objQ6 = sVar6.Q();
                if (zH5 || objQ6 == l1.m.f39353a) {
                    objQ6 = new z3(e3Var, 0);
                    sVar6.o0(objQ6);
                }
                o3.a((fz.c) objQ6, null, t1.e.d(609690978, new a4(cVar2, e3Var, l9Var, aVar5, vVar2, cVar3), sVar6), sVar6, 384);
                break;
            case 3:
                o0.t tVar2 = (o0.t) this.f34687c;
                AchievementLevel achievementLevel = (AchievementLevel) this.f34686b;
                rz.b0 b0Var = (rz.b0) this.f34688d;
                ur.a aVar6 = (ur.a) this.f34689e;
                l1.b1 b1Var7 = (l1.b1) this.f34690f;
                l1.b1 b1Var8 = (l1.b1) this.f34691t;
                o0.o AchievementLevelViewPager = (o0.o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.n nVar = (l1.n) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                kotlin.jvm.internal.m.f(AchievementLevelViewPager, "$this$AchievementLevelViewPager");
                boolean z14 = iIntValue3 == tVar2.k();
                AchievementLevel achievementLevel2 = (AchievementLevel) ((List) b1Var7.getValue()).get(iIntValue3);
                l1.s sVar7 = (l1.s) nVar;
                int i11 = (iIntValue4 & 112) ^ 48;
                boolean zH6 = ((i11 > 32 && sVar7.d(iIntValue3)) || (iIntValue4 & 48) == 32) | sVar7.h(b0Var) | sVar7.f(tVar2);
                Object objQ7 = sVar7.Q();
                l1.g gVar4 = l1.m.f39353a;
                if (zH6 || objQ7 == gVar4) {
                    objQ7 = new g00.y(b0Var, tVar2, iIntValue3);
                    sVar7.o0(objQ7);
                }
                fz.a aVar7 = (fz.a) objQ7;
                boolean zH7 = ((i11 > 32 && sVar7.d(iIntValue3)) || (iIntValue4 & 48) == 32) | sVar7.h(b0Var) | sVar7.h(aVar6);
                Object objQ8 = sVar7.Q();
                if (zH7 || objQ8 == gVar4) {
                    bp.x xVar = new bp.x(iIntValue3, b0Var, b1Var7, b1Var8, aVar6);
                    sVar7.o0(xVar);
                    objQ8 = xVar;
                }
                pr.f0.v(iIntValue3, z14, achievementLevel, achievementLevel2, aVar7, (fz.a) objQ8, sVar7, (iIntValue4 >> 3) & 14);
                break;
            case 4:
                List list = (List) this.f34687c;
                fz.c cVar4 = (fz.c) this.f34686b;
                fz.c cVar5 = (fz.c) this.f34689e;
                fz.c cVar6 = (fz.c) this.f34690f;
                fz.c cVar7 = (fz.c) this.f34691t;
                o0.o HorizontalPager = (o0.o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.n nVar2 = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                if (iIntValue5 != 0) {
                    if (iIntValue5 != 1) {
                        sVar = (l1.s) nVar2;
                        sVar.d0(1508245474);
                    } else {
                        sVar = (l1.s) nVar2;
                        sVar.d0(1517094083);
                        xu.a0.a(this.f34688d, cVar4, cVar5, cVar6, cVar7, sVar, 0);
                    }
                    sVar.p(false);
                } else {
                    l1.s sVar8 = (l1.s) nVar2;
                    sVar8.d0(1516970238);
                    xu.a0.g(list, cVar4, sVar8, 0);
                    sVar8.p(false);
                }
                return qy.b0.f48488a;
            case 5:
                zu.t tVar3 = (zu.t) this.f34687c;
                fz.c cVar8 = (fz.c) this.f34686b;
                LeaderBoardUiState leaderBoardUiState = (LeaderBoardUiState) this.f34688d;
                zu.b0 b0Var2 = (zu.b0) this.f34689e;
                DailyGoalUiState dailyGoalUiState = (DailyGoalUiState) this.f34690f;
                MasteryUiState masteryUiState = (MasteryUiState) this.f34691t;
                a0.r AnimatedContent = (a0.r) obj;
                zu.y0 value = (zu.y0) obj2;
                l1.n nVar3 = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(AnimatedContent, "$this$AnimatedContent");
                kotlin.jvm.internal.m.f(value, "value");
                boolean zEquals = value.equals(zu.s0.f59553a);
                qy.b0 b0Var3 = qy.b0.f48488a;
                l1.g gVar5 = l1.m.f39353a;
                if (zEquals) {
                    l1.s sVar9 = (l1.s) nVar3;
                    sVar9.d0(1344084252);
                    boolean zF2 = sVar9.f(cVar8);
                    Object objQ9 = sVar9.Q();
                    if (zF2 || objQ9 == gVar5) {
                        objQ9 = new uu.b(cVar8, 16);
                        sVar9.o0(objQ9);
                    }
                    fz.c cVar9 = (fz.c) objQ9;
                    boolean zF3 = sVar9.f(cVar8);
                    Object objQ10 = sVar9.Q();
                    if (zF3 || objQ10 == gVar5) {
                        objQ10 = new uu.b(cVar8, 17);
                        sVar9.o0(objQ10);
                    }
                    fz.c cVar10 = (fz.c) objQ10;
                    boolean zF4 = sVar9.f(cVar8);
                    Object objQ11 = sVar9.Q();
                    if (zF4 || objQ11 == gVar5) {
                        objQ11 = new uu.b(cVar8, 18);
                        sVar9.o0(objQ11);
                    }
                    fz.c cVar11 = (fz.c) objQ11;
                    boolean zF5 = sVar9.f(cVar8);
                    Object objQ12 = sVar9.Q();
                    if (zF5 || objQ12 == gVar5) {
                        objQ12 = new uu.b(cVar8, 19);
                        sVar9.o0(objQ12);
                    }
                    fz.c cVar12 = (fz.c) objQ12;
                    boolean zF6 = sVar9.f(cVar8);
                    Object objQ13 = sVar9.Q();
                    if (zF6 || objQ13 == gVar5) {
                        objQ13 = new uu.b(cVar8, 20);
                        sVar9.o0(objQ13);
                    }
                    xu.c.g(tVar3, cVar9, cVar10, cVar11, cVar12, (fz.c) objQ13, sVar9, 0);
                    sVar9.p(false);
                } else if (value.equals(zu.t0.f59562a)) {
                    l1.s sVar10 = (l1.s) nVar3;
                    sVar10.d0(1345780138);
                    sVar10.p(false);
                } else if (value.equals(zu.u0.f59565a)) {
                    l1.s sVar11 = (l1.s) nVar3;
                    sVar11.d0(1345864644);
                    boolean zF7 = sVar11.f(cVar8);
                    Object objQ14 = sVar11.Q();
                    if (zF7 || objQ14 == gVar5) {
                        objQ14 = new xu.w0(cVar8, 9);
                        sVar11.o0(objQ14);
                    }
                    xu.u.b(null, null, (fz.a) objQ14, sVar11, 0);
                    sVar11.p(false);
                } else if (value.equals(zu.v0.f59568a)) {
                    l1.s sVar12 = (l1.s) nVar3;
                    sVar12.d0(1346119216);
                    boolean zF8 = sVar12.f(cVar8);
                    Object objQ15 = sVar12.Q();
                    if (zF8 || objQ15 == gVar5) {
                        objQ15 = new km.s0(cVar8, null, 16);
                        sVar12.o0(objQ15);
                    }
                    l1.t.f((fz.e) objQ15, b0Var3, sVar12);
                    boolean zF9 = sVar12.f(cVar8);
                    Object objQ16 = sVar12.Q();
                    if (zF9 || objQ16 == gVar5) {
                        objQ16 = new xu.w0(cVar8, 10);
                        sVar12.o0(objQ16);
                    }
                    fz.a aVar8 = (fz.a) objQ16;
                    boolean zF10 = sVar12.f(cVar8);
                    Object objQ17 = sVar12.Q();
                    if (zF10 || objQ17 == gVar5) {
                        objQ17 = new xu.w0(cVar8, 11);
                        sVar12.o0(objQ17);
                    }
                    xu.c.j(leaderBoardUiState, aVar8, (fz.a) objQ17, sVar12, 0);
                    sVar12.p(false);
                } else if (value.equals(zu.w0.f59570a)) {
                    l1.s sVar13 = (l1.s) nVar3;
                    sVar13.d0(1346621943);
                    boolean zF11 = sVar13.f(cVar8);
                    Object objQ18 = sVar13.Q();
                    if (zF11 || objQ18 == gVar5) {
                        objQ18 = new uu.b(cVar8, 21);
                        sVar13.o0(objQ18);
                    }
                    a2.g(b0Var2, dailyGoalUiState, (fz.c) objQ18, sVar13, 0);
                    sVar13.p(false);
                } else if (value.equals(zu.x0.f59575a)) {
                    l1.s sVar14 = (l1.s) nVar3;
                    sVar14.d0(1346868951);
                    xu.c0.b(masteryUiState, sVar14, 0);
                    sVar14.p(false);
                } else {
                    if (!value.equals(zu.r0.f59544a)) {
                        throw nv.p.x((l1.s) nVar3, 1705924663, false);
                    }
                    l1.s sVar15 = (l1.s) nVar3;
                    sVar15.d0(1346997229);
                    boolean zF12 = sVar15.f(cVar8);
                    Object objQ19 = sVar15.Q();
                    if (zF12 || objQ19 == gVar5) {
                        objQ19 = new xu.w0(cVar8, 12);
                        sVar15.o0(objQ19);
                    }
                    xu.b0.a(null, (fz.a) objQ19, sVar15, 0);
                    sVar15.p(false);
                }
                return b0Var3;
            case 6:
                dd ddVar = (dd) this.f34687c;
                l9 l9Var2 = (l9) this.f34688d;
                fz.c cVar13 = (fz.c) this.f34690f;
                q2 q2Var = (q2) this.f34691t;
                fz.a aVar9 = (fz.a) this.f34686b;
                j9.v vVar3 = (j9.v) this.f34689e;
                ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
                l1.s sVar16 = (l1.s) ((l1.n) obj3);
                boolean zH8 = sVar16.h(ddVar);
                Object objQ20 = sVar16.Q();
                if (zH8 || objQ20 == l1.m.f39353a) {
                    objQ20 = new bd(ddVar, 4);
                    sVar16.o0(objQ20);
                }
                o3.a((fz.c) objQ20, null, t1.e.d(630339569, new bp.f0(ddVar, l9Var2, cVar13, q2Var, aVar9, vVar3, 16), sVar16), sVar16, 384);
                break;
            default:
                dd ddVar2 = (dd) this.f34687c;
                fz.c cVar14 = (fz.c) this.f34688d;
                fz.a aVar10 = (fz.a) this.f34686b;
                q2 q2Var2 = (q2) this.f34689e;
                l1.b1 b1Var9 = (l1.b1) this.f34690f;
                l1.b1 b1Var10 = (l1.b1) this.f34691t;
                l1.n nVar4 = (l1.n) obj3;
                ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
                l1.b1 b1VarO = l1.t.o(ddVar2.E0, nVar4);
                l1.b1 b1VarO2 = l1.t.o(ddVar2.F0, nVar4);
                l1.b1 b1VarO3 = l1.t.o(ddVar2.T, nVar4);
                l1.b1 b1VarO4 = l1.t.o(ddVar2.f50716j0, nVar4);
                l1.s sVar17 = (l1.s) nVar4;
                Object objQ21 = sVar17.Q();
                l1.b1 b1VarO5 = null;
                l1.g gVar6 = l1.m.f39353a;
                if (objQ21 == gVar6) {
                    objQ21 = l1.t.B(null);
                    sVar17.o0(objQ21);
                }
                l1.b1 b1Var11 = (l1.b1) objQ21;
                Object objQ22 = sVar17.Q();
                if (objQ22 == gVar6) {
                    objQ22 = l1.t.B(null);
                    sVar17.o0(objQ22);
                }
                l1.b1 b1Var12 = (l1.b1) objQ22;
                Object objQ23 = sVar17.Q();
                if (objQ23 == gVar6) {
                    objQ23 = l1.t.B(Boolean.FALSE);
                    sVar17.o0(objQ23);
                }
                l1.b1 b1Var13 = (l1.b1) objQ23;
                Object objQ24 = sVar17.Q();
                if (objQ24 == gVar6) {
                    objQ24 = l1.t.B(Boolean.FALSE);
                    sVar17.o0(objQ24);
                }
                l1.b1 b1Var14 = (l1.b1) objQ24;
                boolean zF13 = sVar17.f((ja) b1Var11.getValue());
                Object objQ25 = sVar17.Q();
                if (zF13 || objQ25 == gVar6) {
                    ja jaVar = (ja) b1Var11.getValue();
                    objQ25 = jaVar != null ? ddVar2.y(jaVar) : null;
                    sVar17.o0(objQ25);
                }
                uz.g1 g1Var = (uz.g1) objQ25;
                if (g1Var == null) {
                    sVar17.d0(1074836443);
                } else {
                    sVar17.d0(-1350801178);
                    b1VarO5 = l1.t.o(g1Var, sVar17);
                }
                sVar17.p(false);
                if (b1VarO5 == null) {
                    sVar17.d0(1074857896);
                    Object objQ26 = sVar17.Q();
                    if (objQ26 == gVar6) {
                        objQ26 = l1.t.B(ry.r.f50854a);
                        sVar17.o0(objQ26);
                    }
                    b1VarO5 = (l1.b1) objQ26;
                    sVar17.p(false);
                } else {
                    sVar17.d0(-1350807275);
                    sVar17.p(false);
                }
                ja jaVar2 = (ja) b1Var11.getValue();
                List list2 = (List) b1VarO5.getValue();
                rt.p pVar = (rt.p) b1VarO4.getValue();
                boolean zBooleanValue2 = ((Boolean) b1Var14.getValue()).booleanValue();
                boolean zH9 = sVar17.h(ddVar2);
                Object objQ27 = sVar17.Q();
                if (zH9 || objQ27 == gVar6) {
                    b1Var = b1VarO3;
                    sVar2 = sVar17;
                    gVar = gVar6;
                    d0.m0 m0Var = new d0.m0(2, ddVar2, dd.class, "createFolder", "createFolder(Lcom/lingodeer/course/viewmodels/CourseTestBookmarkTarget;Ljava/lang/String;)V", 0, 20);
                    sVar2.o0(m0Var);
                    objQ27 = m0Var;
                } else {
                    b1Var = b1VarO3;
                    sVar2 = sVar17;
                    gVar = gVar6;
                }
                fz.e eVar2 = (fz.e) ((mz.e) objQ27);
                boolean zH10 = sVar2.h(ddVar2);
                Object objQ28 = sVar2.Q();
                if (zH10 || objQ28 == gVar) {
                    d0.m0 m0Var2 = new d0.m0(2, ddVar2, dd.class, "addBookmarkToFolder", "addBookmarkToFolder(Lcom/lingodeer/course/viewmodels/CourseTestBookmarkTarget;Ljava/lang/String;)V", 0, 21);
                    sVar2.o0(m0Var2);
                    objQ28 = m0Var2;
                }
                fz.e eVar3 = (fz.e) ((mz.e) objQ28);
                Object objQ29 = sVar2.Q();
                if (objQ29 == gVar) {
                    objQ29 = new ch.h0(b1Var11, b1Var14, 14);
                    sVar2.o0(objQ29);
                }
                fz.a aVar11 = (fz.a) objQ29;
                Object objQ30 = sVar2.Q();
                if (objQ30 == gVar) {
                    objQ30 = new i2(b1Var12, b1Var13, 25);
                    sVar2.o0(objQ30);
                }
                fz.c cVar15 = (fz.c) objQ30;
                boolean zH11 = sVar2.h(ddVar2);
                Object objQ31 = sVar2.Q();
                if (zH11 || objQ31 == gVar) {
                    j5 j5Var = new j5(0, ddVar2, dd.class, "clearBookmarkFolderOperationResult", "clearBookmarkFolderOperationResult()V", 0, 13);
                    sVar2.o0(j5Var);
                    objQ31 = j5Var;
                }
                mt.g.i(jaVar2, list2, pVar, zBooleanValue2, null, eVar2, eVar3, aVar11, cVar15, (fz.a) ((mz.e) objQ31), sVar2, 113246208, 16);
                if (((Boolean) b1Var13.getValue()).booleanValue()) {
                    sVar2.d0(1075795460);
                    ja jaVar3 = (ja) b1Var12.getValue();
                    Object objQ32 = sVar2.Q();
                    if (objQ32 == gVar) {
                        objQ32 = new fu.y(b1Var13, b1Var12, null, 10);
                        sVar2.o0(objQ32);
                    }
                    l1.t.f((fz.e) objQ32, jaVar3, sVar2);
                    z11 = false;
                } else {
                    z11 = false;
                    sVar2.d0(1054789612);
                }
                sVar2.p(z11);
                Long lValueOf = Long.valueOf(((Number) b1Var.getValue()).longValue());
                l1.b1 b1Var15 = b1Var;
                boolean zF14 = sVar2.f(b1Var15);
                Object objQ33 = sVar2.Q();
                if (zF14 || objQ33 == gVar) {
                    objQ33 = new z7(b1Var15, null, 4);
                    sVar2.o0(objQ33);
                }
                l1.t.f((fz.e) objQ33, lValueOf, sVar2);
                CourseTestFinishSummaryUiState courseTestFinishSummaryUiState = (CourseTestFinishSummaryUiState) b1VarO.getValue();
                if (kotlin.jvm.internal.m.a(courseTestFinishSummaryUiState, CourseTestFinishSummaryUiState.Loading.INSTANCE)) {
                    sVar2.d0(-1350753019);
                    tv.a.d(0, 1, sVar2, null);
                    sVar2.p(false);
                } else {
                    if (!(courseTestFinishSummaryUiState instanceof CourseTestFinishSummaryUiState.Success)) {
                        throw nv.p.x(sVar2, -1350749589, false);
                    }
                    sVar2.d0(1076588068);
                    CourseTestFinishSummaryUiState courseTestFinishSummaryUiState2 = (CourseTestFinishSummaryUiState) b1VarO.getValue();
                    kotlin.jvm.internal.m.d(courseTestFinishSummaryUiState2, "null cannot be cast to non-null type com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState.Success");
                    int i12 = o2.f58199a[((CourseTestFinishSummaryUiState.Success) courseTestFinishSummaryUiState2).getType().ordinal()];
                    if (i12 == 1) {
                        sVar3 = sVar2;
                        l1.g gVar7 = gVar;
                        sVar3.d0(1076590331);
                        CoursePracticeType coursePracticeType = CoursePracticeType.COURSE_TEST_OUT;
                        boolean zF15 = sVar3.f(aVar10);
                        Object objQ34 = sVar3.Q();
                        if (zF15 || objQ34 == gVar7) {
                            objQ34 = new k2(3, aVar10);
                            sVar3.o0(objQ34);
                        }
                        ys.a.a(coursePracticeType, null, null, cVar14, (fz.a) objQ34, false, null, null, t1.e.d(1165561956, new g5(11, b1VarO), sVar3), sVar3, 100663302, 230);
                        z12 = false;
                        sVar3.p(false);
                    } else if (i12 == 2) {
                        sVar3 = sVar2;
                        l1.g gVar8 = gVar;
                        sVar3.d0(1077266255);
                        boolean zF16 = sVar3.f(aVar10);
                        Object objQ35 = sVar3.Q();
                        if (zF16 || objQ35 == gVar8) {
                            objQ35 = new k2(4, aVar10);
                            sVar3.o0(objQ35);
                        }
                        z12 = false;
                        ys.a.t((fz.a) objQ35, sVar3, 0);
                        sVar3.p(false);
                    } else {
                        if (i12 != 3) {
                            throw nv.p.x(sVar2, -1350744010, false);
                        }
                        sVar2.d0(1077628552);
                        z1.r rVarD = e2.d(z1.o.f58481a, 1.0f);
                        w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                        int iHashCode = Long.hashCode(sVar2.T);
                        q1 q1VarL = sVar2.l();
                        z1.r rVarC = z1.a.c(sVar2, rVarD);
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
                        CoursePracticeType coursePracticeType2 = q2Var2.f58225c;
                        CourseTestFinishSummaryUiState courseTestFinishSummaryUiState3 = (CourseTestFinishSummaryUiState) b1VarO.getValue();
                        long jLongValue = ((Number) b1Var15.getValue()).longValue();
                        boolean z15 = q2Var2.f58225c != CoursePracticeType.COURSE_PRACTICE_SPEAKING;
                        boolean zF17 = sVar2.f(b1Var9) | sVar2.f(b1VarO2) | sVar2.f(aVar10);
                        Object objQ36 = sVar2.Q();
                        if (zF17 || objQ36 == gVar) {
                            objQ36 = new y1(aVar10, b1Var9, b1VarO2, 1);
                            sVar2.o0(objQ36);
                        }
                        fz.a aVar12 = (fz.a) objQ36;
                        t1.d dVarD = t1.e.d(-499261447, new s1(b1Var10, b1VarO2, b1Var9, 3), sVar2);
                        boolean zH12 = sVar2.h(ddVar2);
                        Object objQ37 = sVar2.Q();
                        if (zH12 || objQ37 == gVar) {
                            objQ37 = new ys.i2(ddVar2, 1);
                            sVar2.o0(objQ37);
                        }
                        fz.e eVar4 = (fz.e) objQ37;
                        boolean zH13 = sVar2.h(ddVar2);
                        Object objQ38 = sVar2.Q();
                        if (zH13 || objQ38 == gVar) {
                            tVar = new pr.t(ddVar2, b1Var13, b1Var12, b1Var11, 12);
                            b1Var2 = b1Var13;
                            b1Var3 = b1Var12;
                            ddVar2 = ddVar2;
                            b1Var4 = b1Var11;
                            sVar2.o0(tVar);
                        } else {
                            tVar = objQ38;
                            b1Var4 = b1Var11;
                            b1Var2 = b1Var13;
                            b1Var3 = b1Var12;
                        }
                        fz.e eVar5 = (fz.e) tVar;
                        boolean zH14 = sVar2.h(ddVar2);
                        Object objQ39 = sVar2.Q();
                        if (zH14 || objQ39 == gVar) {
                            objQ39 = new ys.i2(ddVar2, 2);
                            sVar2.o0(objQ39);
                        }
                        fz.e eVar6 = (fz.e) objQ39;
                        boolean zH15 = sVar2.h(ddVar2);
                        Object objQ40 = sVar2.Q();
                        if (zH15 || objQ40 == gVar) {
                            objQ40 = new qu.s(ddVar2, 11);
                            sVar2.o0(objQ40);
                        }
                        l1.g gVar9 = gVar;
                        l1.s sVar18 = sVar2;
                        ys.y0.c(coursePracticeType2, courseTestFinishSummaryUiState3, jLongValue, z15, aVar12, cVar14, false, null, dVarD, eVar4, eVar5, eVar6, (fz.f) objQ40, null, sVar18, 100663296, 8384);
                        sVar3 = sVar18;
                        if (((Boolean) b1Var2.getValue()).booleanValue()) {
                            sVar3.d0(1255014862);
                            Object objQ41 = sVar3.Q();
                            if (objQ41 == gVar9) {
                                objQ41 = new i3(6, b1Var3, b1Var2, b1Var4, b1Var14);
                                sVar3.o0(objQ41);
                            }
                            mt.g.a(54, (fz.a) objQ41, sVar3, null);
                            z13 = false;
                        } else {
                            z13 = false;
                            sVar3.d0(1228326931);
                        }
                        sVar3.p(z13);
                        sVar3.p(true);
                        sVar3.p(z13);
                        z12 = z13;
                    }
                    sVar3.p(z12);
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ b0(f0 f0Var, fz.a aVar, j9.v vVar, fz.a aVar2, mv.d0 d0Var, mv.g0 g0Var) {
        this.f34685a = 0;
        this.f34687c = f0Var;
        this.f34686b = aVar;
        this.f34689e = vVar;
        this.f34688d = aVar2;
        this.f34690f = d0Var;
        this.f34691t = g0Var;
    }

    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11) {
        this.f34685a = i11;
        this.f34687c = obj;
        this.f34686b = obj2;
        this.f34688d = obj3;
        this.f34689e = obj4;
        this.f34690f = obj5;
        this.f34691t = obj6;
    }

    public /* synthetic */ b0(dd ddVar, fz.c cVar, fz.a aVar, q2 q2Var, l1.b1 b1Var, l1.b1 b1Var2) {
        this.f34685a = 7;
        this.f34687c = ddVar;
        this.f34688d = cVar;
        this.f34686b = aVar;
        this.f34689e = q2Var;
        this.f34690f = b1Var;
        this.f34691t = b1Var2;
    }

    public /* synthetic */ b0(dd ddVar, l9 l9Var, fz.c cVar, q2 q2Var, fz.a aVar, j9.v vVar) {
        this.f34685a = 6;
        this.f34687c = ddVar;
        this.f34688d = l9Var;
        this.f34690f = cVar;
        this.f34691t = q2Var;
        this.f34686b = aVar;
        this.f34689e = vVar;
    }
}
