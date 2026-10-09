package br;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import b0.p1;
import bp.i2;
import bp.z1;
import com.lingo.main.ui.MainComposeActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import com.yalantis.ucrop.view.CropImageView;
import dt.b2;
import dt.h2;
import h1.a6;
import h1.e8;
import h1.k7;
import j0.e2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import l1.b1;
import l1.b3;
import mt.l0;
import mt.q2;
import mt.w1;
import rt.bb;
import rt.f2;
import rt.g2;
import rt.j2;
import rt.l9;
import rt.n1;
import rt.s2;
import xu.h1;
import xu.r1;
import ys.k0;
import ys.o3;
import ys.p2;
import ys.y0;
import zu.j1;
import zu.k1;
import zu.l1;
import zu.m1;
import zu.o0;
import zu.p0;
import zu.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5095e;

    public /* synthetic */ u(j9.v vVar, sv.j jVar, sv.h hVar, b1 b1Var) {
        this.f5091a = 8;
        this.f5092b = vVar;
        this.f5093c = jVar;
        this.f5095e = hVar;
        this.f5094d = b1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        MainComposeActivity mainComposeActivity;
        int i11;
        int i12;
        qy.b0 b0Var;
        l1.s sVar;
        b1 b1Var;
        s2 s2Var;
        int i13 = this.f5091a;
        z1.o oVar = z1.o.f58481a;
        Object[] objArr = 0;
        final int i14 = 1;
        l1.g gVar = l1.m.f39353a;
        qy.b0 b0Var2 = qy.b0.f48488a;
        final int i15 = 0;
        Object obj5 = this.f5092b;
        Object obj6 = this.f5095e;
        Object obj7 = this.f5094d;
        Object obj8 = this.f5093c;
        switch (i13) {
            case 0:
                MainComposeActivity mainComposeActivity2 = (MainComposeActivity) obj8;
                b1 b1Var2 = (b1) obj7;
                j9.v vVar = (j9.v) obj5;
                b1 b1Var3 = (b1) obj6;
                a0.r composable = (a0.r) obj;
                j9.e it = (j9.e) obj2;
                ((Integer) obj4).getClass();
                int i16 = MainComposeActivity.U;
                kotlin.jvm.internal.m.f(composable, "$this$composable");
                kotlin.jvm.internal.m.f(it, "it");
                l1.s sVar2 = (l1.s) ((l1.n) obj3);
                boolean zF = sVar2.f(b1Var2) | sVar2.h(vVar) | sVar2.h(mainComposeActivity2);
                Object objQ = sVar2.Q();
                if (zF || objQ == gVar) {
                    mainComposeActivity = mainComposeActivity2;
                    v vVar2 = new v(vVar, mainComposeActivity, b1Var2, b1Var3, 0);
                    sVar2.o0(vVar2);
                    objQ = vVar2;
                } else {
                    mainComposeActivity = mainComposeActivity2;
                }
                e.g(mainComposeActivity, (fz.a) objQ, sVar2, 0);
                return b0Var2;
            case 1:
                js.r rVar = (js.r) obj8;
                l9 l9Var = (l9) obj7;
                fz.a aVar = (fz.a) obj6;
                j9.v vVar3 = (j9.v) obj5;
                l1.n nVar = (l1.n) obj3;
                ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
                b1 b1VarO = l1.t.o(rVar.f36829t0, nVar);
                b1 b1VarO2 = l1.t.o(rVar.f36830u0, nVar);
                b1 b1VarO3 = l1.t.o(l9Var.f50024d, nVar);
                b1 b1VarO4 = l1.t.o(rVar.f50719m0, nVar);
                b1 b1VarO5 = l1.t.o(rVar.L, nVar);
                l1.s sVar3 = (l1.s) nVar;
                Object objQ2 = sVar3.Q();
                if (objQ2 == gVar) {
                    objQ2 = l1.t.B(Boolean.FALSE);
                    sVar3.o0(objQ2);
                }
                b1 b1Var4 = (b1) objQ2;
                Object objQ3 = sVar3.Q();
                if (objQ3 == gVar) {
                    objQ3 = l1.t.B(Boolean.FALSE);
                    sVar3.o0(objQ3);
                }
                b1 b1Var5 = (b1) objQ3;
                if (((Boolean) b1Var4.getValue()).booleanValue()) {
                    sVar3.d0(-1445850549);
                    if (((Boolean) b1Var5.getValue()).booleanValue()) {
                        i11 = -1445814682;
                        i12 = R.string.skip_speaking_title;
                    } else {
                        i11 = -1445725371;
                        i12 = R.string.skip_listening_title;
                    }
                    String strM = ep.a.m(sVar3, i11, i12, sVar3, false);
                    Object objQ4 = sVar3.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new h2(7, b1Var4);
                        sVar3.o0(objQ4);
                    }
                    fz.a aVar2 = (fz.a) objQ4;
                    boolean zH = sVar3.h(rVar);
                    Object objQ5 = sVar3.Q();
                    if (zH || objQ5 == gVar) {
                        objQ5 = new fs.a(rVar, 2);
                        sVar3.o0(objQ5);
                    }
                    p2.b(strM, aVar2, (fz.a) objQ5, sVar3, 48);
                } else {
                    sVar3.d0(-1449037318);
                }
                sVar3.p(false);
                boolean zH2 = sVar3.h(rVar);
                Object objQ6 = sVar3.Q();
                if (zH2 || objQ6 == gVar) {
                    objQ6 = new fs.d(rVar, 1);
                    sVar3.o0(objQ6);
                }
                o3.a((fz.c) objQ6, null, t1.e.d(2018337196, new fs.g(rVar, aVar, l9Var, vVar3, b1VarO, b1VarO3, b1VarO4, b1VarO5, b1VarO2, b1Var5, b1Var4), sVar3), sVar3, 384);
                return b0Var2;
            case 2:
                final o0.t tVar = (o0.t) obj8;
                fz.a aVar3 = (fz.a) obj7;
                fz.c cVar = (fz.c) obj6;
                fz.c cVar2 = (fz.c) obj5;
                o0.o HorizontalPager = (o0.o) obj;
                final int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj4).intValue();
                kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                z1.r rVarD = e2.d(j0.c.C(oVar, 8, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
                l1.s sVar4 = (l1.s) ((l1.n) obj3);
                boolean zF2 = sVar4.f(tVar);
                if ((((iIntValue2 & 112) ^ 48) <= 32 || !sVar4.d(iIntValue)) && (iIntValue2 & 48) != 32) {
                    i14 = 0;
                }
                int i17 = (zF2 ? 1 : 0) | i14;
                Object objQ7 = sVar4.Q();
                if (i17 != 0 || objQ7 == gVar) {
                    objQ7 = new fz.c() { // from class: iv.j
                        @Override // fz.c
                        public final Object invoke(Object obj9) {
                            g2.t0 graphicsLayer = (g2.t0) obj9;
                            switch (i15) {
                                case 0:
                                    kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                                    o0.t tVar2 = tVar;
                                    graphicsLayer.i(android.support.v4.media.session.a.A(0.95f, 1.0f, 1.0f - hz.b.k(Math.abs(((l1.g1) tVar2.f44435d.f7511d).l() + (tVar2.k() - iIntValue)), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f)));
                                    break;
                                default:
                                    kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                                    o0.t tVar3 = tVar;
                                    graphicsLayer.i(android.support.v4.media.session.a.A(0.95f, 1.0f, 1.0f - hz.b.k(Math.abs(((l1.g1) tVar3.f44435d.f7511d).l() + (tVar3.k() - iIntValue)), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f)));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar4.o0(objQ7);
                }
                k7.d(g2.f0.q(rVarD, (fz.c) objQ7), null, null, null, null, t1.e.d(711515507, new fu.v(iIntValue, aVar3, cVar, cVar2, 1), sVar4), sVar4, 196608, 30);
                return b0Var2;
            case 3:
                mv.d0 d0Var = (mv.d0) obj7;
                j9.v vVar4 = (j9.v) obj5;
                mv.g0 g0Var = (mv.g0) obj6;
                a0.r composable2 = (a0.r) obj;
                j9.e it2 = (j9.e) obj2;
                l1.n nVar2 = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(composable2, "$this$composable");
                kotlin.jvm.internal.m.f(it2, "it");
                if (((kv.i0) ry.m.s0(((iv.f0) obj8).f34721b)) == null) {
                    l1.s sVar5 = (l1.s) nVar2;
                    sVar5.d0(-2090859916);
                    sVar5.p(false);
                    b0Var = null;
                } else {
                    l1.s sVar6 = (l1.s) nVar2;
                    sVar6.d0(-2090859915);
                    kv.j0 j0Var = (kv.j0) ry.m.s0(d0Var.f42196b);
                    boolean zH3 = sVar6.h(vVar4);
                    Object objQ8 = sVar6.Q();
                    if (zH3 || objQ8 == gVar) {
                        objQ8 = new z1(vVar4, 25);
                        sVar6.o0(objQ8);
                    }
                    fz.a aVar4 = (fz.a) objQ8;
                    boolean zH4 = sVar6.h(j0Var) | sVar6.h(vVar4) | sVar6.h(g0Var);
                    Object objQ9 = sVar6.Q();
                    if (zH4 || objQ9 == gVar) {
                        objQ9 = new androidx.lifecycle.compose.a(j0Var, vVar4, g0Var, 17);
                        sVar6.o0(objQ9);
                    }
                    iv.o.j(aVar4, (fz.a) objQ9, null, sVar6, 0);
                    sVar6.p(false);
                    b0Var = b0Var2;
                }
                if (b0Var == null) {
                    l1.s sVar7 = (l1.s) nVar2;
                    sVar7.d0(-2089617559);
                    boolean zH5 = sVar7.h(vVar4);
                    Object objQ10 = sVar7.Q();
                    if (zH5 || objQ10 == gVar) {
                        objQ10 = new av.p(vVar4, null, 22);
                        sVar7.o0(objQ10);
                    }
                    l1.t.f((fz.e) objQ10, b0Var2, sVar7);
                    sVar7.p(false);
                } else {
                    l1.s sVar8 = (l1.s) nVar2;
                    sVar8.d0(-1037279604);
                    sVar8.p(false);
                }
                return b0Var2;
            case 4:
                iv.f0 f0Var = (iv.f0) obj8;
                fz.a aVar5 = (fz.a) obj7;
                fz.a aVar6 = (fz.a) obj6;
                fz.e eVar = (fz.e) obj5;
                o0.o HorizontalPager2 = (o0.o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.n nVar3 = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(HorizontalPager2, "$this$HorizontalPager");
                if (iIntValue3 == 0) {
                    l1.s sVar9 = (l1.s) nVar3;
                    sVar9.d0(-2144212776);
                    ArrayList arrayList = f0Var.f34721b;
                    String str = f0Var.f34725f;
                    boolean zF3 = sVar9.f(eVar);
                    Object objQ11 = sVar9.Q();
                    if (zF3 || objQ11 == gVar) {
                        objQ11 = new p1(18, eVar);
                        sVar9.o0(objQ11);
                    }
                    iv.a.k(arrayList, true, str, false, aVar5, aVar6, (fz.c) objQ11, sVar9, 48, 8);
                    sVar9.p(false);
                } else if (iIntValue3 != 1) {
                    if (iIntValue3 != 2) {
                        sVar = (l1.s) nVar3;
                        sVar.d0(-2065569122);
                    } else {
                        sVar = (l1.s) nVar3;
                        sVar.d0(-2144183060);
                        ArrayList arrayList2 = f0Var.f34723d;
                        String str2 = f0Var.f34725f;
                        boolean zF4 = sVar.f(eVar);
                        Object objQ12 = sVar.Q();
                        if (zF4 || objQ12 == gVar) {
                            objQ12 = new p1(20, eVar);
                            sVar.o0(objQ12);
                        }
                        iv.a.k(arrayList2, false, str2, false, aVar5, aVar6, (fz.c) objQ12, sVar, 3120, 0);
                    }
                    sVar.p(false);
                } else {
                    l1.s sVar10 = (l1.s) nVar3;
                    sVar10.d0(-2144197959);
                    ArrayList arrayList3 = f0Var.f34722c;
                    String str3 = f0Var.f34725f;
                    boolean zF5 = sVar10.f(eVar);
                    Object objQ13 = sVar10.Q();
                    if (zF5 || objQ13 == gVar) {
                        objQ13 = new p1(19, eVar);
                        sVar10.o0(objQ13);
                    }
                    iv.a.k(arrayList3, false, str3, false, aVar5, aVar6, (fz.c) objQ13, sVar10, 48, 8);
                    sVar10.p(false);
                }
                return b0Var2;
            case 5:
                j2 j2Var = (j2) obj8;
                j9.v vVar5 = (j9.v) obj5;
                b1 b1Var6 = (b1) obj7;
                b1 b1Var7 = (b1) obj6;
                l1.n nVar4 = (l1.n) obj3;
                ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
                b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(j2Var.T, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, nVar4, 0, 7);
                l1.s sVar11 = (l1.s) nVar4;
                Object objQ14 = sVar11.Q();
                if (objQ14 == gVar) {
                    objQ14 = l1.t.B(Boolean.FALSE);
                    sVar11.o0(objQ14);
                }
                b1 b1Var8 = (b1) objQ14;
                Object objQ15 = sVar11.Q();
                if (objQ15 == gVar) {
                    objQ15 = l1.t.B(q2.FLASHCARD);
                    sVar11.o0(objQ15);
                }
                b1 b1Var9 = (b1) objQ15;
                Object objQ16 = sVar11.Q();
                if (objQ16 == gVar) {
                    objQ16 = l1.t.B(ry.r.f50854a);
                    sVar11.o0(objQ16);
                }
                b1 b1Var10 = (b1) objQ16;
                g2 g2Var = (g2) b3VarCollectAsStateWithLifecycle.getValue();
                if (kotlin.jvm.internal.m.a(g2Var, rt.e2.f49665a)) {
                    sVar11.d0(-1407695760);
                    tv.a.d(0, 1, sVar11, null);
                    sVar11.p(false);
                } else {
                    if (!(g2Var instanceof f2)) {
                        throw nv.p.x(sVar11, -1407695829, false);
                    }
                    sVar11.d0(-688738769);
                    if (((Boolean) b1Var8.getValue()).booleanValue()) {
                        sVar11.d0(-688701786);
                        e8 e8VarF = a6.f(6, 2, null, sVar11);
                        Object objQ17 = sVar11.Q();
                        if (objQ17 == gVar) {
                            objQ17 = new w1(6, b1Var8);
                            sVar11.o0(objQ17);
                        }
                        b1Var = b1Var8;
                        a6.a((fz.a) objQ17, null, e8VarF, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(515831080, new mt.h2((f2) g2Var, j2Var, vVar5, b1Var9, b1Var8, b1Var6, b1Var10, b1Var7, 0), sVar11), sVar11, 6, 384, 4090);
                    } else {
                        b1Var = b1Var8;
                        sVar11.d0(-702117439);
                    }
                    sVar11.p(false);
                    int i18 = ((f2) g2Var).f49718i;
                    Object objQ18 = sVar11.Q();
                    if (objQ18 == gVar) {
                        objQ18 = new i2(b1Var10, b1Var, 12);
                        sVar11.o0(objQ18);
                    }
                    fz.c cVar3 = (fz.c) objQ18;
                    boolean zH6 = sVar11.h(vVar5);
                    Object objQ19 = sVar11.Q();
                    if (zH6 || objQ19 == gVar) {
                        objQ19 = new j9.g(vVar5, 6);
                        sVar11.o0(objQ19);
                    }
                    fz.a aVar7 = (fz.a) objQ19;
                    boolean zH7 = sVar11.h(vVar5);
                    Object objQ20 = sVar11.Q();
                    if (zH7 || objQ20 == gVar) {
                        objQ20 = new j9.g(vVar5, 7);
                        sVar11.o0(objQ20);
                    }
                    mt.g.t(i18, cVar3, aVar7, (fz.a) objQ20, null, sVar11, 48);
                    sVar11.p(false);
                }
                return b0Var2;
            case 6:
                j2 j2Var2 = (j2) obj8;
                fz.c cVar4 = (fz.c) obj7;
                fz.c cVar5 = (fz.c) obj6;
                j9.v vVar6 = (j9.v) obj5;
                a0.r composable3 = (a0.r) obj;
                j9.e it3 = (j9.e) obj2;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(composable3, "$this$composable");
                kotlin.jvm.internal.m.f(it3, "it");
                List reviews = j2Var2.M;
                boolean z11 = j2Var2.N;
                l1.s sVar12 = (l1.s) ((l1.n) obj3);
                boolean zF6 = sVar12.f(reviews) | sVar12.g(z11);
                Object objQ21 = sVar12.Q();
                if (zF6 || objQ21 == gVar) {
                    if (z11) {
                        s2Var = new s2(reviews, ry.s.f50855a);
                    } else {
                        kotlin.jvm.internal.m.f(reviews, "reviews");
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it4 = reviews.iterator();
                        while (it4.hasNext()) {
                            linkedHashSet.add(Long.valueOf(((SRSStatus) it4.next()).getUnitId()));
                        }
                        n1 n1Var = j2Var2.f49910t;
                        Map map = n1Var != null ? n1Var.f50115c : null;
                        if (map == null) {
                            map = ry.s.f50855a;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (linkedHashSet.contains(Long.valueOf(((Number) entry.getKey()).longValue()))) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        s2Var = new s2(reviews, linkedHashMap);
                    }
                    objQ21 = s2Var;
                    sVar12.o0(objQ21);
                }
                s2 s2Var2 = (s2) objQ21;
                boolean zH8 = sVar12.h(vVar6);
                Object objQ22 = sVar12.Q();
                if (zH8 || objQ22 == gVar) {
                    objQ22 = new j9.g(vVar6, 5);
                    sVar12.o0(objQ22);
                }
                mt.p2.d(s2Var2, z11, cVar4, cVar5, (fz.a) objQ22, null, sVar12, 0);
                return b0Var2;
            case 7:
                final o0.t tVar2 = (o0.t) obj8;
                fz.c cVar6 = (fz.c) obj7;
                sv.b bVar = (sv.b) obj6;
                fz.a aVar8 = (fz.a) obj5;
                o0.o HorizontalPager3 = (o0.o) obj;
                final int iIntValue4 = ((Integer) obj2).intValue();
                int iIntValue5 = ((Integer) obj4).intValue();
                kotlin.jvm.internal.m.f(HorizontalPager3, "$this$HorizontalPager");
                z1.r rVarD2 = e2.d(j0.c.C(oVar, 8, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
                l1.s sVar13 = (l1.s) ((l1.n) obj3);
                int i19 = (sVar13.f(tVar2) ? 1 : 0) | (((((iIntValue5 & 112) ^ 48) > 32 && sVar13.d(iIntValue4)) || (iIntValue5 & 48) == 32) ? 1 : 0);
                Object objQ23 = sVar13.Q();
                if (i19 != 0 || objQ23 == gVar) {
                    objQ23 = new fz.c() { // from class: iv.j
                        @Override // fz.c
                        public final Object invoke(Object obj9) {
                            g2.t0 graphicsLayer = (g2.t0) obj9;
                            switch (i14) {
                                case 0:
                                    kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                                    o0.t tVar3 = tVar2;
                                    graphicsLayer.i(android.support.v4.media.session.a.A(0.95f, 1.0f, 1.0f - hz.b.k(Math.abs(((l1.g1) tVar3.f44435d.f7511d).l() + (tVar3.k() - iIntValue4)), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f)));
                                    break;
                                default:
                                    kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                                    o0.t tVar4 = tVar2;
                                    graphicsLayer.i(android.support.v4.media.session.a.A(0.95f, 1.0f, 1.0f - hz.b.k(Math.abs(((l1.g1) tVar4.f44435d.f7511d).l() + (tVar4.k() - iIntValue4)), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f)));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar13.o0(objQ23);
                }
                k7.d(g2.f0.q(rVarD2, (fz.c) objQ23), null, null, null, null, t1.e.d(-833847410, new fu.v(iIntValue4, cVar6, bVar, aVar8), sVar13), sVar13, 196608, 30);
                return b0Var2;
            case 8:
                j9.v vVar7 = (j9.v) obj5;
                sv.j jVar = (sv.j) obj8;
                sv.h hVar = (sv.h) obj6;
                b1 b1Var11 = (b1) obj7;
                a0.r composable4 = (a0.r) obj;
                j9.e it5 = (j9.e) obj2;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(composable4, "$this$composable");
                kotlin.jvm.internal.m.f(it5, "it");
                l1.s sVar14 = (l1.s) ((l1.n) obj3);
                boolean zH9 = sVar14.h(vVar7);
                Object objQ24 = sVar14.Q();
                if (zH9 || objQ24 == gVar) {
                    objQ24 = new j9.g(vVar7, 18);
                    sVar14.o0(objQ24);
                }
                fz.a aVar9 = (fz.a) objQ24;
                boolean zH10 = sVar14.h(vVar7) | sVar14.h(jVar) | sVar14.h(hVar);
                Object objQ25 = sVar14.Q();
                if (zH10 || objQ25 == gVar) {
                    objQ25 = new l0(vVar7, jVar, hVar, 11);
                    sVar14.o0(objQ25);
                }
                nv.a.h(0, null, aVar9, (fz.a) objQ25, sVar14, 6);
                Object objQ26 = sVar14.Q();
                if (objQ26 == gVar) {
                    objQ26 = new b2(b1Var11, (vy.d) (objArr == true ? 1 : 0), 6);
                    sVar14.o0(objQ26);
                }
                l1.t.f((fz.e) objQ26, b0Var2, sVar14);
                return b0Var2;
            case 9:
                q0 q0Var = (q0) obj8;
                fz.c cVar7 = (fz.c) obj7;
                fz.c cVar8 = (fz.c) obj6;
                fz.c cVar9 = (fz.c) obj5;
                a0.r AnimatedContent = (a0.r) obj;
                m1 searchStatus = (m1) obj2;
                l1.n nVar5 = (l1.n) obj3;
                ((Integer) obj4).intValue();
                kotlin.jvm.internal.m.f(AnimatedContent, "$this$AnimatedContent");
                kotlin.jvm.internal.m.f(searchStatus, "searchStatus");
                if (searchStatus.equals(j1.f59457a)) {
                    l1.s sVar15 = (l1.s) nVar5;
                    sVar15.d0(-1331894976);
                    if (kotlin.jvm.internal.m.a(q0Var, o0.f59509a)) {
                        sVar15.d0(95585557);
                        tv.a.d(0, 1, sVar15, null);
                        sVar15.p(false);
                    } else {
                        if (!(q0Var instanceof p0)) {
                            throw nv.p.x(sVar15, 95582978, false);
                        }
                        sVar15.d0(95588501);
                        h1.a(((p0) q0Var).f59522a, cVar7, cVar8, cVar9, sVar15, 0);
                        sVar15.p(false);
                    }
                    sVar15.p(false);
                } else if (searchStatus.equals(k1.f59465a)) {
                    l1.s sVar16 = (l1.s) nVar5;
                    sVar16.d0(95600405);
                    tv.a.d(0, 1, sVar16, null);
                    sVar16.p(false);
                } else {
                    if (!(searchStatus instanceof l1)) {
                        throw nv.p.x((l1.s) nVar5, 95581317, false);
                    }
                    l1.s sVar17 = (l1.s) nVar5;
                    sVar17.d0(-1331276371);
                    h1.e(((l1) searchStatus).f59489a, cVar7, cVar8, cVar9, sVar17, 0);
                    sVar17.p(false);
                }
                return b0Var2;
            default:
                bb bbVar = (bb) obj8;
                CoursePracticeType coursePracticeType = (CoursePracticeType) obj7;
                fz.a aVar10 = (fz.a) obj6;
                fz.c cVar10 = (fz.c) obj5;
                a0.r composable5 = (a0.r) obj;
                j9.e it6 = (j9.e) obj2;
                l1.n nVar6 = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(composable5, "$this$composable");
                kotlin.jvm.internal.m.f(it6, "it");
                b1 b1VarO6 = l1.t.o(bbVar.T, nVar6);
                b1 b1VarO7 = l1.t.o(bbVar.P, nVar6);
                l1.s sVar18 = (l1.s) nVar6;
                boolean zF7 = sVar18.f(b1VarO7);
                Object objQ27 = sVar18.Q();
                if (zF7 || objQ27 == gVar) {
                    objQ27 = new k0(b1VarO7, null, 0);
                    sVar18.o0(objQ27);
                }
                l1.t.f((fz.e) objQ27, b0Var2, sVar18);
                Object objQ28 = sVar18.Q();
                if (objQ28 == gVar) {
                    objQ28 = new ju.d(25);
                    sVar18.o0(objQ28);
                }
                se.i.a(false, (fz.a) objQ28, sVar18, 48, 1);
                CourseTestFinishSummaryUiState courseTestFinishSummaryUiState = (CourseTestFinishSummaryUiState) b1VarO6.getValue();
                if (kotlin.jvm.internal.m.a(courseTestFinishSummaryUiState, CourseTestFinishSummaryUiState.Loading.INSTANCE)) {
                    sVar18.d0(-218393887);
                    tv.a.d(0, 1, sVar18, null);
                    sVar18.p(false);
                } else {
                    if (!(courseTestFinishSummaryUiState instanceof CourseTestFinishSummaryUiState.Success)) {
                        throw nv.p.x(sVar18, -218396000, false);
                    }
                    sVar18.d0(1819810959);
                    CourseTestFinishSummaryUiState courseTestFinishSummaryUiState2 = (CourseTestFinishSummaryUiState) b1VarO6.getValue();
                    long jLongValue = ((Number) b1VarO7.getValue()).longValue();
                    boolean zF8 = sVar18.f(aVar10);
                    Object objQ29 = sVar18.Q();
                    if (zF8 || objQ29 == gVar) {
                        objQ29 = new r1(18, aVar10);
                        sVar18.o0(objQ29);
                    }
                    y0.c(coursePracticeType, courseTestFinishSummaryUiState2, jLongValue, false, (fz.a) objQ29, cVar10, false, null, null, null, null, null, null, null, sVar18, 3072, 16320);
                    sVar18.p(false);
                }
                return b0Var2;
        }
    }

    public /* synthetic */ u(Object obj, Object obj2, j9.v vVar, Object obj3, int i11) {
        this.f5091a = i11;
        this.f5093c = obj;
        this.f5094d = obj2;
        this.f5092b = vVar;
        this.f5095e = obj3;
    }

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f5091a = i11;
        this.f5093c = obj;
        this.f5094d = obj2;
        this.f5095e = obj3;
        this.f5092b = obj4;
    }

    public /* synthetic */ u(j2 j2Var, j9.v vVar, b1 b1Var, b1 b1Var2) {
        this.f5091a = 5;
        this.f5093c = j2Var;
        this.f5092b = vVar;
        this.f5094d = b1Var;
        this.f5095e = b1Var2;
    }
}
