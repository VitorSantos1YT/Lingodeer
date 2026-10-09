package ei;

import b0.o1;
import bt.g7;
import com.lingo.lingoskill.object.ARChar;
import com.lingodeer.R;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.CoursePracticeTypeKt;
import com.lingodeer.data.model.DayStreakStatus;
import com.lingodeer.data.model.SyllableLessonStatus;
import com.lingodeer.data.model.uistate.DailyGoalUiState;
import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import com.lingodeer.data.model.uistate.MasteryUiState;
import com.lingodeer.syllable_ko.model.KOSyllableLesson;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import e6.p0;
import g2.f0;
import h1.e8;
import h1.fa;
import h1.k7;
import h1.s1;
import j0.a2;
import j0.b2;
import j0.e2;
import j0.i1;
import j0.o2;
import j0.t1;
import j0.v1;
import j0.z1;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kr.c1;
import kr.d1;
import l1.b1;
import l1.q1;
import mt.i5;
import mt.l5;
import ot.j1;
import qy.b0;
import rt.b5;
import rt.f9;
import rt.fc;
import rt.g9;
import rt.gc;
import rt.h9;
import rt.qc;
import rt.rc;
import rt.t4;
import rt.v4;
import w2.q0;
import ys.k2;
import ys.p2;
import z2.g1;
import zu.y0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements fz.f {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25623f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f25624t;

    public /* synthetic */ l(CoursePracticeType coursePracticeType, rc rcVar, h9 h9Var, fz.a aVar, gc gcVar, b1 b1Var, b1 b1Var2) {
        this.f25618a = 7;
        this.f25619b = coursePracticeType;
        this.f25622e = rcVar;
        this.f25623f = h9Var;
        this.f25624t = aVar;
        this.H = gcVar;
        this.f25620c = b1Var;
        this.f25621d = b1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:198:0x0619  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z11;
        boolean z12;
        Integer num;
        Integer num2;
        Integer num3;
        z1.o oVar;
        ht.o oVarA;
        int i11 = this.f25618a;
        z1.o oVar2 = z1.o.f58481a;
        Object obj4 = l1.m.f39353a;
        b0 b0Var = b0.f48488a;
        Object obj5 = this.f25621d;
        Object obj6 = this.f25620c;
        Object obj7 = this.H;
        Object obj8 = this.f25624t;
        Object obj9 = this.f25623f;
        Object obj10 = this.f25622e;
        Object obj11 = this.f25619b;
        switch (i11) {
            case 0:
                Integer num4 = (Integer) obj;
                int iIntValue = num4.intValue();
                Integer num5 = (Integer) obj2;
                int iIntValue2 = num5.intValue();
                ARChar item = (ARChar) obj3;
                kotlin.jvm.internal.m.f(item, "item");
                ((b1) obj6).setValue(num4);
                ((b1) obj5).setValue(num5);
                ((b1) obj10).setValue(null);
                ((b1) obj9).setValue(null);
                ((b1) obj8).setValue(null);
                ((gi.d) obj11).b(iIntValue, iIntValue2, item);
                ((b1) obj7).setValue(Boolean.TRUE);
                return b0Var;
            case 1:
                d1 d1Var = (d1) obj11;
                fz.c cVar = (fz.c) obj6;
                fz.c cVar2 = (fz.c) obj5;
                fz.c cVar3 = (fz.c) obj10;
                fz.c cVar4 = (fz.c) obj9;
                fz.c cVar5 = (fz.c) obj8;
                fz.a aVar = (fz.a) obj7;
                t1 paddingValues = (t1) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(paddingValues, "paddingValues");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((l1.s) nVar).f(paddingValues) ? 4 : 2;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    z1.r rVarZ = j0.c.z(e2.d(oVar2, 1.0f), paddingValues);
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarZ);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    y2.h hVar = y2.j.f56917f;
                    l1.t.J(hVar, q0VarD, sVar);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar);
                    if (((Boolean) sVar.j(ju.f.f37376j)).booleanValue()) {
                        sVar.d0(1292070525);
                        z1.r rVarD = e2.d(oVar2, 1.0f);
                        a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
                        int iHashCode2 = Long.hashCode(sVar.T);
                        q1 q1VarL2 = sVar.l();
                        z1.r rVarC2 = z1.a.c(sVar, rVarD);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(hVar, a2VarA, sVar);
                        l1.t.J(hVar2, q1VarL2, sVar);
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                        }
                        l1.t.J(hVar4, rVarC2, sVar);
                        c1 c1Var = (c1) d1Var;
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        jr.a.o(c1Var, new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), sVar, 0, 0);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        jr.a.p(c1Var, new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), cVar, cVar2, cVar3, cVar4, cVar5, aVar, sVar, 0, 0);
                        sVar.p(true);
                        sVar.p(false);
                        z11 = true;
                    } else {
                        sVar.d0(1292966394);
                        z1.r rVarD2 = e2.d(oVar2, 1.0f);
                        j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                        int iHashCode3 = Long.hashCode(sVar.T);
                        q1 q1VarL3 = sVar.l();
                        z1.r rVarC3 = z1.a.c(sVar, rVarD2);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(hVar, uVarA, sVar);
                        l1.t.J(hVar2, q1VarL3, sVar);
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                        }
                        l1.t.J(hVar4, rVarC3, sVar);
                        c1 c1Var2 = (c1) d1Var;
                        jr.a.o(c1Var2, null, sVar, 0, 2);
                        jr.a.p(c1Var2, null, cVar, cVar2, cVar3, cVar4, cVar5, aVar, sVar, 0, 2);
                        z11 = true;
                        sVar.p(true);
                        sVar.p(false);
                    }
                    sVar.p(z11);
                } else {
                    sVar.W();
                }
                return b0Var;
            case 2:
                l0.w wVar = (l0.w) obj11;
                List list = (List) obj6;
                String str = (String) obj5;
                fz.c cVar6 = (fz.c) obj10;
                rz.b0 b0Var2 = (rz.b0) obj9;
                e8 e8Var = (e8) obj8;
                fz.a aVar2 = (fz.a) obj7;
                j0.v ModalBottomSheet = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    float f5 = 16;
                    float f11 = 22;
                    v1 v1Var = new v1(f5, f11, f5, f11);
                    boolean zH = sVar2.h(list) | sVar2.f(str) | sVar2.f(cVar6) | sVar2.h(b0Var2) | sVar2.f(e8Var) | sVar2.f(aVar2);
                    Object objQ = sVar2.Q();
                    if (zH || objQ == obj4) {
                        objQ = new g7(list, str, cVar6, b0Var2, e8Var, aVar2);
                        sVar2.o0(objQ);
                    }
                    ue.f.a(null, wVar, v1Var, null, null, null, false, null, (fz.c) objQ, sVar2, 384, 505);
                } else {
                    sVar2.W();
                }
                return b0Var;
            case 3:
                final b5 b5Var = (b5) obj11;
                l0.w wVar2 = (l0.w) obj9;
                final x1.s sVar3 = (x1.s) obj8;
                b1 b1Var = (b1) obj6;
                b1 b1Var2 = (b1) obj5;
                b1 b1Var3 = (b1) obj10;
                final fz.c cVar7 = (fz.c) obj7;
                j0.s BoxWithConstraints = (j0.s) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((l1.s) nVar3).f(BoxWithConstraints) ? 4 : 2;
                }
                l1.s sVar4 = (l1.s) nVar3;
                if (!sVar4.T(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    sVar4.W();
                    return b0Var;
                }
                v3.c cVar8 = (v3.c) sVar4.j(g1.f58547h);
                float f12 = l5.f41629c;
                sVar4.d0(637153000);
                WeakHashMap weakHashMap = o2.f35353v;
                float fQ = cVar8.Q(j0.b.e(sVar4).f35358e.e().f48796d);
                sVar4.p(false);
                float f13 = fQ + f12;
                v3.f fVar = new v3.f(BoxWithConstraints.b() - f13);
                v3.f fVar2 = new v3.f(0);
                if (fVar.compareTo(fVar2) < 0) {
                    fVar = fVar2;
                }
                float f14 = fVar.f53489a;
                int iN0 = cVar8.n0(f14);
                float f15 = l5.f41630d;
                int iN1 = cVar8.n0(f15);
                int iN2 = cVar8.n0(l5.f41631e);
                int iN3 = cVar8.n0(l5.f41627a);
                List list2 = b5Var.f49513f;
                int i12 = b5Var.f49514g;
                t4 t4Var = (t4) ry.m.s0(list2);
                int iIntValue6 = (t4Var == null || (num3 = (Integer) sVar3.get(t4Var.f50421a)) == null) ? iN3 : num3.intValue();
                t4 t4Var2 = (t4) ry.m.A0(list2);
                int iIntValue7 = (t4Var2 == null || (num2 = (Integer) sVar3.get(t4Var2.f50421a)) == null) ? iN3 : num2.intValue();
                int i13 = iIntValue6 - iN2;
                if (i13 < 0) {
                    i13 = 0;
                }
                int i14 = iN0 / 2;
                int i15 = (i14 - (i13 / 2)) - iN1;
                final float fQ2 = cVar8.Q(i15 < 0 ? 0 : i15);
                int i16 = iIntValue7 - iN2;
                if (i16 < 0) {
                    i16 = 0;
                }
                int i17 = ((i14 - (i16 / 2)) - (iN2 < 0 ? 0 : iN2)) - iN1;
                if (i17 < 0) {
                    i17 = 0;
                }
                final float fQ3 = cVar8.Q(i17);
                t4 t4Var3 = (t4) ry.m.t0(i12, list2);
                Integer num6 = t4Var3 != null ? (Integer) sVar3.get(t4Var3.f50421a) : null;
                Integer numValueOf = Integer.valueOf(i12);
                v4 v4Var = b5Var.f49515h;
                Integer num7 = (v4Var == v4.PLAYING || v4Var == v4.PREPARING || v4Var == v4.PAUSED) ? numValueOf : null;
                if (v4Var != v4.FINISHED) {
                    int size = list2.size();
                    if (i12 < 0 || i12 >= size) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                } else {
                    z12 = false;
                }
                Object[] objArr = {wVar2, Integer.valueOf(list2.size()), num7, Integer.valueOf(iN0), Integer.valueOf(iN2)};
                boolean zF = sVar4.f(wVar2) | sVar4.h(b5Var) | sVar4.d(iN2) | sVar4.d(iN0) | sVar4.f(num7);
                Object objQ2 = sVar4.Q();
                if (zF || objQ2 == obj4) {
                    Integer num8 = num7;
                    objQ2 = new p0(wVar2, b5Var, iN2, iN0, b1Var, b1Var2, b1Var3, num8, null);
                    num = num8;
                    sVar4.o0(objQ2);
                } else {
                    num = num7;
                }
                l1.t.i(objArr, (fz.e) objQ2, sVar4);
                final Integer num9 = num;
                Object[] objArr2 = {Integer.valueOf(i12), Integer.valueOf(list2.size()), Boolean.valueOf(z12), new v3.f(f14), num6};
                boolean zG = sVar4.g(z12) | sVar4.f(num6) | sVar4.f(cVar8) | sVar4.d(iN2) | sVar4.d(iN0) | sVar4.f(wVar2) | sVar4.h(b5Var);
                Object objQ3 = sVar4.Q();
                if (zG || objQ3 == obj4) {
                    objQ3 = new i5(z12, num6, cVar8, iN2, iN0, wVar2, b5Var, b1Var3, b1Var2, null);
                    b1Var3 = b1Var3;
                    sVar4.o0(objQ3);
                }
                l1.t.i(objArr2, (fz.e) objQ3, sVar4);
                z1.r rVarD3 = e2.d(oVar2, 1.0f);
                q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                int iHashCode4 = Long.hashCode(sVar4.T);
                q1 q1VarL4 = sVar4.l();
                z1.r rVarC4 = z1.a.c(sVar4, rVarD3);
                y2.k.J.getClass();
                fz.a aVar3 = y2.j.f56913b;
                sVar4.h0();
                if (sVar4.S) {
                    sVar4.k(aVar3);
                } else {
                    sVar4.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD2, sVar4);
                l1.t.J(y2.j.f56916e, q1VarL4, sVar4);
                y2.h hVar5 = y2.j.f56918g;
                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode4))) {
                    defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar5);
                }
                l1.t.J(y2.j.f56915d, rVarC4, sVar4);
                z1.r rVarE = j0.c.E(e2.d(oVar2, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f13, 7);
                j0.g gVarG = j0.i.g(f15);
                boolean zC = sVar4.c(fQ2) | sVar4.h(b5Var) | sVar4.f(num9) | sVar4.f(cVar7) | sVar4.c(fQ3);
                Object objQ4 = sVar4.Q();
                if (zC || objQ4 == obj4) {
                    final b1 b1Var4 = b1Var3;
                    objQ4 = new fz.c() { // from class: mt.c5
                        @Override // fz.c
                        public final Object invoke(Object obj12) {
                            l0.h LazyColumn = (l0.h) obj12;
                            kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                            l0.h.p(LazyColumn, null, new t1.d(new d5(1, fQ2), true, -1905987221), 3);
                            rt.b5 b5Var2 = b5Var;
                            List list3 = b5Var2.f49513f;
                            LazyColumn.q(list3.size(), null, new bp.p0(19, list3), new t1.d(new et.e0(list3, b5Var2, num9, cVar7, b1Var4, sVar3, 1), true, 2039820996));
                            l0.h.p(LazyColumn, null, new t1.d(new d5(2, fQ3), true, -850514910), 3);
                            return qy.b0.f48488a;
                        }
                    };
                    sVar4.o0(objQ4);
                }
                ue.f.a(rVarE, wVar2, null, gVarG, null, null, false, null, (fz.c) objQ4, sVar4, 24576, 492);
                l5.a(e2.g(e2.e(j0.r.f35391a.a(oVar2, z1.c.f58464b), 1.0f), 96), sVar4, 6);
                sVar4.p(true);
                return b0Var;
            case 4:
                final sv.h hVar6 = (sv.h) obj11;
                final fz.a aVar4 = (fz.a) obj6;
                final fz.a aVar5 = (fz.a) obj5;
                final fz.c cVar9 = (fz.c) obj10;
                final fz.a aVar6 = (fz.a) obj9;
                final qv.c cVar10 = (qv.c) obj8;
                final fz.c cVar11 = (fz.c) obj7;
                t1 paddingValues2 = (t1) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(paddingValues2, "paddingValues");
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((l1.s) nVar4).f(paddingValues2) ? 4 : 2;
                }
                l1.s sVar5 = (l1.s) nVar4;
                if (sVar5.T(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    z1.r rVarZ2 = j0.c.z(d0.n.h(oVar2, ((s1) sVar5.j(h1.v1.f31180a)).f31031n, f0.f28556b), paddingValues2);
                    j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                    int iHashCode5 = Long.hashCode(sVar5.T);
                    q1 q1VarL5 = sVar5.l();
                    z1.r rVarC5 = z1.a.c(sVar5, rVarZ2);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar2);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA2, sVar5);
                    l1.t.J(y2.j.f56916e, q1VarL5, sVar5);
                    y2.h hVar7 = y2.j.f56918g;
                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar5, iHashCode5, hVar7);
                    }
                    l1.t.J(y2.j.f56915d, rVarC5, sVar5);
                    Object objQ5 = sVar5.Q();
                    if (objQ5 == obj4) {
                        objQ5 = new hh.y(10);
                        sVar5.o0(objQ5);
                    }
                    o0.b bVarB = o0.w.b(0, 384, 3, (fz.a) objQ5, sVar5);
                    Object objQ6 = sVar5.Q();
                    if (objQ6 == obj4) {
                        objQ6 = l1.t.q(sVar5);
                        sVar5.o0(objQ6);
                    }
                    fa.a(bVarB.k(), null, 0L, 0L, null, null, t1.e.d(-1818391302, new k9.p(21, bVarB, (rz.b0) objQ6), sVar5), sVar5, 1572864, 62);
                    ve.i.d(bVarB, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-304615439, new fz.g() { // from class: nv.g
                        /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
                        /* JADX WARN: Code duplicated, block: B:33:0x0106  */
                        /* JADX WARN: Code duplicated, block: B:35:0x013d  */
                        /* JADX WARN: Code duplicated, block: B:36:0x0141  */
                        /* JADX WARN: Code duplicated, block: B:41:0x015c  */
                        /* JADX WARN: Code duplicated, block: B:44:0x018f  */
                        @Override // fz.g
                        public final Object f(Object obj12, Object obj13, Object obj14, Object obj15) {
                            String str2;
                            y2.h hVar8;
                            boolean zF2;
                            Object objQ7;
                            boolean z13;
                            boolean z14;
                            int iHashCode6;
                            sv.h hVar9 = hVar6;
                            String str3 = hVar9.f51809e;
                            ArrayList arrayList = hVar9.f51807c;
                            o0.o HorizontalPager = (o0.o) obj12;
                            int iIntValue9 = ((Integer) obj13).intValue();
                            l1.n nVar5 = (l1.n) obj14;
                            ((Integer) obj15).getClass();
                            kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                            fz.a aVar7 = aVar5;
                            fz.c cVar12 = cVar9;
                            b0 b0Var3 = b0.f48488a;
                            l1.g gVar = l1.m.f39353a;
                            if (iIntValue9 == 0) {
                                l1.s sVar6 = (l1.s) nVar5;
                                sVar6.d0(467452277);
                                ArrayList arrayList2 = hVar9.f51806b;
                                boolean zF3 = sVar6.f(cVar12);
                                Object objQ8 = sVar6.Q();
                                if (zF3 || objQ8 == gVar) {
                                    objQ8 = new o1(cVar12, 25);
                                    sVar6.o0(objQ8);
                                }
                                a.f(arrayList2, str3, aVar4, aVar7, (fz.c) objQ8, sVar6, 0);
                                sVar6.p(false);
                                return b0Var3;
                            }
                            if (iIntValue9 != 1) {
                                if (iIntValue9 != 2) {
                                    l1.s sVar7 = (l1.s) nVar5;
                                    sVar7.d0(453145777);
                                    sVar7.p(false);
                                    return b0Var3;
                                }
                                l1.s sVar8 = (l1.s) nVar5;
                                sVar8.d0(472566037);
                                fz.a aVar8 = aVar6;
                                boolean zF4 = sVar8.f(aVar8);
                                Object objQ9 = sVar8.Q();
                                if (zF4 || objQ9 == gVar) {
                                    objQ9 = new fs.h(aVar8, null, 4);
                                    sVar8.o0(objQ9);
                                }
                                l1.t.f((fz.e) objQ9, b0Var3, sVar8);
                                pv.a.b(cVar10, aVar7, cVar11, sVar8, 0);
                                sVar8.p(false);
                                return b0Var3;
                            }
                            l1.s sVar9 = (l1.s) nVar5;
                            sVar9.d0(468206445);
                            z1.o oVar3 = z1.o.f58481a;
                            z1.r rVarD4 = e2.d(oVar3, 1.0f);
                            q0 q0VarD3 = j0.o.d(z1.c.f58463a, false);
                            int iHashCode7 = Long.hashCode(sVar9.T);
                            q1 q1VarL6 = sVar9.l();
                            z1.r rVarC6 = z1.a.c(sVar9, rVarD4);
                            y2.k.J.getClass();
                            y2.i iVar3 = y2.j.f56913b;
                            sVar9.h0();
                            if (sVar9.S) {
                                sVar9.k(iVar3);
                            } else {
                                sVar9.r0();
                            }
                            y2.h hVar10 = y2.j.f56917f;
                            l1.t.J(hVar10, q0VarD3, sVar9);
                            y2.h hVar11 = y2.j.f56916e;
                            l1.t.J(hVar11, q1VarL6, sVar9);
                            y2.h hVar12 = y2.j.f56918g;
                            if (!sVar9.S) {
                                str2 = str3;
                                if (!kotlin.jvm.internal.m.a(sVar9.Q(), Integer.valueOf(iHashCode7))) {
                                }
                                hVar8 = y2.j.f56915d;
                                l1.t.J(hVar8, rVarC6, sVar9);
                                zF2 = sVar9.f(cVar12);
                                objQ7 = sVar9.Q();
                                if (zF2 || objQ7 == gVar) {
                                    objQ7 = new o1(cVar12, 26);
                                    sVar9.o0(objQ7);
                                }
                                a.m(arrayList, str2, aVar7, (fz.c) objQ7, sVar9, 0);
                                if (((KOSyllableLesson) ry.m.q0(arrayList)).getStatus() == SyllableLessonStatus.LOCKED) {
                                    sVar9.d0(-1701349682);
                                    z1.r rVarH = d0.n.h(e2.d(oVar3, 1.0f), f0.e(2147483648L), f0.f28556b);
                                    q0 q0VarD4 = j0.o.d(z1.c.f58467e, false);
                                    iHashCode6 = Long.hashCode(sVar9.T);
                                    q1 q1VarL7 = sVar9.l();
                                    z1.r rVarC7 = z1.a.c(sVar9, rVarH);
                                    sVar9.h0();
                                    if (sVar9.S) {
                                        sVar9.k(iVar3);
                                    } else {
                                        sVar9.r0();
                                    }
                                    l1.t.J(hVar10, q0VarD4, sVar9);
                                    l1.t.J(hVar11, q1VarL7, sVar9);
                                    if (sVar9.S || !kotlin.jvm.internal.m.a(sVar9.Q(), Integer.valueOf(iHashCode6))) {
                                        defpackage.e.A(iHashCode6, sVar9, iHashCode6, hVar12);
                                    }
                                    l1.t.J(hVar8, rVarC7, sVar9);
                                    k7.d(j0.c.A(oVar3, 22), null, null, null, null, t1.e.d(863586039, new at.p(24, cVar12, hVar9), sVar9), sVar9, 196614, 30);
                                    z13 = true;
                                    sVar9.p(true);
                                    z14 = false;
                                } else {
                                    z13 = true;
                                    z14 = false;
                                    sVar9.d0(-1717109896);
                                }
                                sVar9.p(z14);
                                sVar9.p(z13);
                                sVar9.p(z14);
                                return b0Var3;
                            }
                            str2 = str3;
                            defpackage.e.A(iHashCode7, sVar9, iHashCode7, hVar12);
                            hVar8 = y2.j.f56915d;
                            l1.t.J(hVar8, rVarC6, sVar9);
                            zF2 = sVar9.f(cVar12);
                            objQ7 = sVar9.Q();
                            if (zF2) {
                                objQ7 = new o1(cVar12, 26);
                                sVar9.o0(objQ7);
                            } else {
                                objQ7 = new o1(cVar12, 26);
                                sVar9.o0(objQ7);
                            }
                            a.m(arrayList, str2, aVar7, (fz.c) objQ7, sVar9, 0);
                            if (((KOSyllableLesson) ry.m.q0(arrayList)).getStatus() == SyllableLessonStatus.LOCKED) {
                                sVar9.d0(-1701349682);
                                z1.r rVarH2 = d0.n.h(e2.d(oVar3, 1.0f), f0.e(2147483648L), f0.f28556b);
                                q0 q0VarD5 = j0.o.d(z1.c.f58467e, false);
                                iHashCode6 = Long.hashCode(sVar9.T);
                                q1 q1VarL8 = sVar9.l();
                                z1.r rVarC8 = z1.a.c(sVar9, rVarH2);
                                sVar9.h0();
                                if (sVar9.S) {
                                    sVar9.k(iVar3);
                                } else {
                                    sVar9.r0();
                                }
                                l1.t.J(hVar10, q0VarD5, sVar9);
                                l1.t.J(hVar11, q1VarL8, sVar9);
                                if (sVar9.S) {
                                    defpackage.e.A(iHashCode6, sVar9, iHashCode6, hVar12);
                                } else {
                                    defpackage.e.A(iHashCode6, sVar9, iHashCode6, hVar12);
                                }
                                l1.t.J(hVar8, rVarC8, sVar9);
                                k7.d(j0.c.A(oVar3, 22), null, null, null, null, t1.e.d(863586039, new at.p(24, cVar12, hVar9), sVar9), sVar9, 196614, 30);
                                z13 = true;
                                sVar9.p(true);
                                z14 = false;
                            } else {
                                z13 = true;
                                z14 = false;
                                sVar9.d0(-1717109896);
                            }
                            sVar9.p(z14);
                            sVar9.p(z13);
                            sVar9.p(z14);
                            return b0Var3;
                        }
                    }, sVar5), sVar5, 0, 16382);
                    sVar5.p(true);
                } else {
                    sVar5.W();
                }
                return b0Var;
            case 5:
                hu.j jVar = (hu.j) obj11;
                b1 b1Var5 = (b1) obj6;
                b1 b1Var6 = (b1) obj5;
                fz.a aVar7 = (fz.a) obj10;
                fz.a aVar8 = (fz.a) obj9;
                fz.a aVar9 = (fz.a) obj8;
                fz.a aVar10 = (fz.a) obj7;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f((l0.c) obj, "$this$item");
                l1.s sVar6 = (l1.s) nVar5;
                if (sVar6.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    j0.u uVarA3 = j0.t.a(j0.i.f35305c, z1.c.O, sVar6, 0);
                    int iHashCode6 = Long.hashCode(sVar6.T);
                    q1 q1VarL6 = sVar6.l();
                    z1.o oVar3 = z1.o.f58481a;
                    z1.r rVarC6 = z1.a.c(sVar6, oVar3);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar3);
                    } else {
                        sVar6.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA3, sVar6);
                    l1.t.J(y2.j.f56916e, q1VarL6, sVar6);
                    y2.h hVar8 = y2.j.f56918g;
                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode6))) {
                        defpackage.e.A(iHashCode6, sVar6, iHashCode6, hVar8);
                    }
                    l1.t.J(y2.j.f56915d, rVarC6, sVar6);
                    hu.i iVar4 = (hu.i) jVar;
                    fu.a.a(iVar4, b1Var5, b1Var6, aVar7, aVar8, sVar6, 440);
                    DayStreakStatus dayStreakStatus = iVar4.f33787a;
                    z1.r rVarE2 = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                    int usedShieldCount = dayStreakStatus.getUsedShieldCount();
                    int totalShieldCount = dayStreakStatus.getTotalShieldCount();
                    int totalFreezeCount = dayStreakStatus.getTotalFreezeCount();
                    boolean z13 = iVar4.f33790d;
                    boolean zH2 = sVar6.h(jVar) | sVar6.f(aVar10);
                    Object objQ7 = sVar6.Q();
                    if (zH2 || objQ7 == obj4) {
                        objQ7 = new pv.c(23, jVar, aVar10);
                        sVar6.o0(objQ7);
                    }
                    fu.a.f(rVarE2, usedShieldCount, totalShieldCount, totalFreezeCount, z13, aVar9, (fz.a) objQ7, sVar6, 6);
                    ep.a.C(oVar3, 32, sVar6, true);
                } else {
                    sVar6.W();
                }
                return b0Var;
            case 6:
                y0 y0Var = (y0) obj11;
                zu.t tVar = (zu.t) obj6;
                fz.c cVar12 = (fz.c) obj5;
                LeaderBoardUiState leaderBoardUiState = (LeaderBoardUiState) obj10;
                zu.b0 b0Var3 = (zu.b0) obj9;
                DailyGoalUiState dailyGoalUiState = (DailyGoalUiState) obj8;
                MasteryUiState masteryUiState = (MasteryUiState) obj7;
                j0.v Card = (j0.v) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar7 = (l1.s) nVar6;
                if (sVar7.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    a0.o.b(y0Var, null, null, null, BuildConfig.VERSION_NAME, null, t1.e.d(-248503900, new iv.b0(tVar, cVar12, leaderBoardUiState, b0Var3, dailyGoalUiState, masteryUiState, 5), sVar7), sVar7, 1597440, 46);
                } else {
                    sVar7.W();
                }
                return b0Var;
            default:
                CoursePracticeType coursePracticeType = (CoursePracticeType) obj11;
                rc rcVar = (rc) obj10;
                h9 h9Var = (h9) obj9;
                fz.a aVar11 = (fz.a) obj8;
                gc gcVar = (gc) obj7;
                b1 b1Var7 = (b1) obj6;
                b1 b1Var8 = (b1) obj5;
                b2 CourseTestProgressBar = (b2) obj;
                l1.n nVar7 = (l1.n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(CourseTestProgressBar, "$this$CourseTestProgressBar");
                l1.s sVar8 = (l1.s) nVar7;
                if (sVar8.T(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    boolean zIsTestOut = CoursePracticeTypeKt.isTestOut(coursePracticeType);
                    z1.o oVar4 = z1.o.f58481a;
                    if (zIsTestOut) {
                        sVar8.d0(623528644);
                        z1.i iVar5 = z1.c.M;
                        z1.r rVarC7 = j0.c.C(oVar4, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        a2 a2VarA2 = z1.a(j0.i.g(5), iVar5, sVar8, 54);
                        int iHashCode7 = Long.hashCode(sVar8.T);
                        q1 q1VarL7 = sVar8.l();
                        z1.r rVarC8 = z1.a.c(sVar8, rVarC7);
                        y2.k.J.getClass();
                        y2.i iVar6 = y2.j.f56913b;
                        sVar8.h0();
                        if (sVar8.S) {
                            sVar8.k(iVar6);
                        } else {
                            sVar8.r0();
                        }
                        l1.t.J(y2.j.f56917f, a2VarA2, sVar8);
                        l1.t.J(y2.j.f56916e, q1VarL7, sVar8);
                        y2.h hVar9 = y2.j.f56918g;
                        if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode7))) {
                            defpackage.e.A(iHashCode7, sVar8, iHashCode7, hVar9);
                        }
                        l1.t.J(y2.j.f56915d, rVarC8, sVar8);
                        sVar8.d0(528180364);
                        int i18 = 0;
                        while (i18 < 4) {
                            d0.n.c(se.k.y(i18 < 4 - ((fc) gcVar).f49764c ? R.drawable.ic_game_life : R.drawable.ic_game_life_grey, sVar8, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar8, 48, 124);
                            i18++;
                        }
                        com.google.android.material.datepicker.d.B(sVar8, false, true, false);
                    } else {
                        boolean z14 = false;
                        sVar8.d0(625005019);
                        qc qcVar = (qc) rcVar;
                        if (qcVar.f50302b) {
                            sVar8.d0(625010661);
                            k2.b bVarY = se.k.y(R.drawable.ic_lesson_tips_btn, sVar8, 0);
                            Object objQ8 = sVar8.Q();
                            if (objQ8 == obj4) {
                                objQ8 = new ys.d1(16, b1Var7);
                                sVar8.o0(objQ8);
                            }
                            oVar = oVar4;
                            d0.n.c(bVarY, null, e2.n(iu.k.q(24582, 7, (fz.a) objQ8, sVar8, oVar4, false), 22), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar8, 48, 120);
                            sVar8 = sVar8;
                            z14 = false;
                        } else {
                            oVar = oVar4;
                            sVar8.d0(590018915);
                        }
                        sVar8.p(z14);
                        if (qcVar.f50304d) {
                            sVar8.d0(625781383);
                            k2.b bVarY2 = se.k.y(R.drawable.ic_lesson_setting_btn, sVar8, z14 ? 1 : 0);
                            Object objQ9 = sVar8.Q();
                            if (objQ9 == obj4) {
                                objQ9 = new ys.d1(17, b1Var8);
                                sVar8.o0(objQ9);
                            }
                            l1.s sVar9 = sVar8;
                            d0.n.c(bVarY2, null, e2.n(iu.k.q(24582, 7, (fz.a) objQ9, sVar9, oVar, false), 22), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar9, 48, 120);
                            sVar8 = sVar9;
                            z14 = false;
                        } else {
                            sVar8.d0(590018915);
                        }
                        sVar8.p(z14);
                        int i19 = -1;
                        if (!kotlin.jvm.internal.m.a(h9Var, f9.f49754a)) {
                            if (!(h9Var instanceof g9)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            j1 j1Var = qcVar.f50301a;
                            if (j1Var == null || (oVarA = j1Var.a()) == null || oVarA.f33753a != 2) {
                                i19 = ((g9) h9Var).f49787b.f50784c;
                            }
                        }
                        boolean zF2 = sVar8.f(aVar11);
                        Object objQ10 = sVar8.Q();
                        if (zF2 || objQ10 == obj4) {
                            objQ10 = new k2(2, aVar11);
                            sVar8.o0(objQ10);
                        }
                        p2.a(i19, 0, (fz.a) objQ10, sVar8);
                        j0.c.g(sVar8, e2.s(oVar, 8));
                        sVar8.p(false);
                    }
                } else {
                    sVar8.W();
                }
                return b0Var;
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i11) {
        this.f25618a = i11;
        this.f25619b = obj;
        this.f25620c = obj2;
        this.f25621d = obj3;
        this.f25622e = obj4;
        this.f25623f = obj5;
        this.f25624t = obj6;
        this.H = obj7;
    }

    public /* synthetic */ l(b5 b5Var, l0.w wVar, x1.s sVar, b1 b1Var, b1 b1Var2, b1 b1Var3, fz.c cVar) {
        this.f25618a = 3;
        this.f25619b = b5Var;
        this.f25623f = wVar;
        this.f25624t = sVar;
        this.f25620c = b1Var;
        this.f25621d = b1Var2;
        this.f25622e = b1Var3;
        this.H = cVar;
    }
}
