package bp;

import android.content.res.Resources;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.splash.SplashIndexActivity;
import com.lingodeer.data.model.CourseACK;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.SyllableWriteLesson;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import com.lingodeer.syllable_ko.model.KOSyllableLesson;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.i9;
import java.util.List;
import mt.k6;
import rt.ae;
import rt.ja;
import rt.mb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b2 implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4504d;

    public /* synthetic */ b2(j9.v vVar, l1.b1 b1Var, l1.b1 b1Var2) {
        this.f4501a = 15;
        this.f4502b = vVar;
        this.f4503c = b1Var;
        this.f4504d = b1Var2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        o9.b bVar = (o9.b) this.f4503c;
        fz.c cVar = (fz.c) this.f4504d;
        fz.c cVar2 = (fz.c) this.f4502b;
        l0.c items = (l0.c) obj;
        int iIntValue = ((Integer) obj2).intValue();
        l1.n nVar = (l1.n) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        kotlin.jvm.internal.m.f(items, "$this$items");
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= ((l1.s) nVar).d(iIntValue) ? 32 : 16;
        }
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            mh.i iVar = (mh.i) bVar.b(iIntValue);
            if (iVar != null) {
                sVar.d0(-1249016793);
                boolean zF = sVar.f(cVar) | sVar.f(iVar);
                Object objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                if (zF || objQ == gVar) {
                    objQ = new nh.b(cVar, iVar, 1);
                    sVar.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                boolean zF2 = sVar.f(cVar2) | sVar.f(iVar);
                Object objQ2 = sVar.Q();
                if (zF2 || objQ2 == gVar) {
                    objQ2 = new nh.b(cVar2, iVar, 2);
                    sVar.o0(objQ2);
                }
                ew.a.d(iVar, aVar, (fz.a) objQ2, j0.e2.p(z1.o.f58481a, 162, 191), false, sVar, 3072, 16);
            } else {
                sVar.d0(-1257729312);
            }
            sVar.p(false);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }

    private final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        sv.h hVar = (sv.h) this.f4503c;
        j9.v vVar = (j9.v) this.f4502b;
        fz.c cVar = (fz.c) this.f4504d;
        l1.n nVar = (l1.n) obj3;
        ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
        sv.e eVar = hVar.f51808d;
        if (eVar == null) {
            l1.s sVar = (l1.s) nVar;
            sVar.d0(-1517077613);
            sVar.p(false);
        } else {
            KOSyllableLesson kOSyllableLesson = eVar.f51801a;
            l1.s sVar2 = (l1.s) nVar;
            sVar2.d0(-1517077612);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.TRUE);
                sVar2.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            if (!((Boolean) b1Var.getValue()).booleanValue() || oz.x.s0(kOSyllableLesson.getLessonID(), "Test", false)) {
                sVar2.d0(-1732496275);
                i9.a(null, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(1909554558, new k6(eVar, vVar, cVar, 6), sVar2), sVar2, 12582912, 127);
                sVar2 = sVar2;
                sVar2.p(false);
            } else {
                sVar2.d0(-1733604773);
                int i11 = nv.l.f44156a[kOSyllableLesson.getType().ordinal()];
                if (i11 == 1) {
                    sVar2.d0(1745195700);
                    int i12 = Integer.parseInt(oz.x.q0(kOSyllableLesson.getLessonID(), "L", BuildConfig.VERSION_NAME));
                    boolean zH = sVar2.h(vVar);
                    Object objQ2 = sVar2.Q();
                    if (zH || objQ2 == gVar) {
                        objQ2 = new j9.g(vVar, 16);
                        sVar2.o0(objQ2);
                    }
                    fz.a aVar = (fz.a) objQ2;
                    Object objQ3 = sVar2.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new mt.n4(19, b1Var);
                        sVar2.o0(objQ3);
                    }
                    nv.a.h(i12, null, aVar, (fz.a) objQ3, sVar2, 3072);
                    sVar2.p(false);
                } else {
                    if (i11 != 2) {
                        throw nv.p.x(sVar2, 1745193486, false);
                    }
                    sVar2.d0(1745212025);
                    int i13 = Integer.parseInt(oz.x.q0(kOSyllableLesson.getLessonID(), "L", BuildConfig.VERSION_NAME));
                    boolean zH2 = sVar2.h(vVar);
                    Object objQ4 = sVar2.Q();
                    if (zH2 || objQ4 == gVar) {
                        objQ4 = new j9.g(vVar, 17);
                        sVar2.o0(objQ4);
                    }
                    fz.a aVar2 = (fz.a) objQ4;
                    Object objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        objQ5 = new mt.n4(20, b1Var);
                        sVar2.o0(objQ5);
                    }
                    nv.r.m(i13, null, aVar2, (fz.a) objQ5, sVar2, 3072);
                    sVar2.p(false);
                }
                sVar2.p(false);
            }
            sVar2.p(false);
        }
        return qy.b0.f48488a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        l1.b3 b3Var = (l1.b3) this.f4503c;
        j9.v vVar = (j9.v) this.f4502b;
        fz.e eVar = (fz.e) this.f4504d;
        a0.r composable = (a0.r) obj;
        j9.e it = (j9.e) obj2;
        l1.n nVar = (l1.n) obj3;
        ((Integer) obj4).getClass();
        kotlin.jvm.internal.m.f(composable, "$this$composable");
        kotlin.jvm.internal.m.f(it, "it");
        qv.c cVar = (qv.c) b3Var.getValue();
        if (kotlin.jvm.internal.m.a(cVar, qv.a.f48424a)) {
            l1.s sVar = (l1.s) nVar;
            sVar.d0(-542497153);
            sVar.p(false);
        } else {
            if (!(cVar instanceof qv.b)) {
                throw nv.p.x((l1.s) nVar, -542499539, false);
            }
            l1.s sVar2 = (l1.s) nVar;
            sVar2.d0(362541360);
            qv.c cVar2 = (qv.c) b3Var.getValue();
            kotlin.jvm.internal.m.d(cVar2, "null cannot be cast to non-null type com.lingodeer.syllable_ko.syllablewrite.viewmodels.SyllableWriteIndexUiState.Success");
            SyllableWriteLesson syllableWriteLesson = ((qv.b) cVar2).f48426b;
            if (syllableWriteLesson == null) {
                sVar2.d0(362646263);
            } else {
                sVar2.d0(362646264);
                boolean zH = sVar2.h(vVar);
                Object objQ = sVar2.Q();
                l1.g gVar = l1.m.f39353a;
                if (zH || objQ == gVar) {
                    objQ = new j9.g(vVar, 15);
                    sVar2.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                boolean zF = sVar2.f(eVar) | sVar2.h(syllableWriteLesson);
                Object objQ2 = sVar2.Q();
                if (zF || objQ2 == gVar) {
                    objQ2 = new n0.w0(5, eVar, syllableWriteLesson);
                    sVar2.o0(objQ2);
                }
                pv.a.e(syllableWriteLesson, aVar, (fz.c) objQ2, null, sVar2, 0);
            }
            sVar2.p(false);
            sVar2.p(false);
        }
        return qy.b0.f48488a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        j9.v vVar = (j9.v) this.f4502b;
        l1.b1 b1Var = (l1.b1) this.f4503c;
        l1.b1 b1Var2 = (l1.b1) this.f4504d;
        a0.r composable = (a0.r) obj;
        j9.e it = (j9.e) obj2;
        ((Integer) obj4).getClass();
        kotlin.jvm.internal.m.f(composable, "$this$composable");
        kotlin.jvm.internal.m.f(it, "it");
        l1.s sVar = (l1.s) ((l1.n) obj3);
        boolean zH = sVar.h(vVar);
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (zH || objQ == gVar) {
            objQ = new j9.g(vVar, 21);
            sVar.o0(objQ);
        }
        fz.a aVar = (fz.a) objQ;
        Object objQ2 = sVar.Q();
        if (objQ2 == gVar) {
            objQ2 = new i2(b1Var, b1Var2, 20);
            sVar.o0(objQ2);
        }
        xu.h1.c(aVar, (fz.c) objQ2, null, sVar, 48);
        return qy.b0.f48488a;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        l1.s sVar;
        boolean z11;
        l1.b1 b1VarO;
        l1.b1 b1Var;
        boolean z12;
        boolean z13;
        int i11 = this.f4501a;
        z1.o oVar = z1.o.f58481a;
        l1.g gVar = l1.m.f39353a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj5 = this.f4502b;
        Object obj6 = this.f4504d;
        Object obj7 = this.f4503c;
        switch (i11) {
            case 0:
                Resources resources = (Resources) obj7;
                LoginActivity loginActivity = (LoginActivity) obj6;
                j9.v vVar = (j9.v) obj5;
                a0.r composable = (a0.r) obj;
                j9.e it = (j9.e) obj2;
                ((Integer) obj4).getClass();
                int i12 = LoginActivity.Q;
                kotlin.jvm.internal.m.f(composable, "$this$composable");
                kotlin.jvm.internal.m.f(it, "it");
                kotlin.jvm.internal.m.c(resources);
                l1.s sVar2 = (l1.s) ((l1.n) obj3);
                boolean zH = sVar2.h(loginActivity);
                Object objQ = sVar2.Q();
                if (zH || objQ == gVar) {
                    objQ = new w1(loginActivity, 4);
                    sVar2.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                boolean zH2 = sVar2.h(loginActivity);
                Object objQ2 = sVar2.Q();
                if (zH2 || objQ2 == gVar) {
                    objQ2 = new w1(loginActivity, 5);
                    sVar2.o0(objQ2);
                }
                fz.a aVar2 = (fz.a) objQ2;
                boolean zH3 = sVar2.h(loginActivity);
                Object objQ3 = sVar2.Q();
                if (zH3 || objQ3 == gVar) {
                    objQ3 = new w1(loginActivity, 6);
                    sVar2.o0(objQ3);
                }
                fz.a aVar3 = (fz.a) objQ3;
                boolean zH4 = sVar2.h(vVar);
                Object objQ4 = sVar2.Q();
                if (zH4 || objQ4 == gVar) {
                    objQ4 = new z1(vVar, 0);
                    sVar2.o0(objQ4);
                }
                fz.a aVar4 = (fz.a) objQ4;
                boolean zH5 = sVar2.h(loginActivity);
                Object objQ5 = sVar2.Q();
                if (zH5 || objQ5 == gVar) {
                    objQ5 = new w1(loginActivity, 7);
                    sVar2.o0(objQ5);
                }
                fz.a aVar5 = (fz.a) objQ5;
                boolean zH6 = sVar2.h(loginActivity);
                Object objQ6 = sVar2.Q();
                if (zH6 || objQ6 == gVar) {
                    objQ6 = new w1(loginActivity, 8);
                    sVar2.o0(objQ6);
                }
                uu.a.g(resources, aVar, aVar2, aVar3, aVar4, aVar5, (fz.a) objQ6, sVar2, 0);
                return b0Var;
            case 1:
                js.i iVar = (js.i) obj7;
                j9.v vVar2 = (j9.v) obj5;
                fz.a aVar6 = (fz.a) obj6;
                ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
                l1.s sVar3 = (l1.s) ((l1.n) obj3);
                boolean zH7 = sVar3.h(iVar) | sVar3.h(vVar2);
                Object objQ7 = sVar3.Q();
                if (zH7 || objQ7 == gVar) {
                    objQ7 = new cs.d(iVar, vVar2, 1);
                    sVar3.o0(objQ7);
                }
                es.j.c((fz.c) objQ7, aVar6, null, sVar3, 0);
                return b0Var;
            case 2:
                js.r rVar = (js.r) obj7;
                fz.a aVar7 = (fz.a) obj6;
                fz.c cVar = (fz.c) obj5;
                l1.n nVar = (l1.n) obj3;
                ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
                l1.b1 b1VarO2 = l1.t.o(rVar.f36831v0, nVar);
                l1.b1 b1VarO3 = l1.t.o(rVar.T, nVar);
                l1.s sVar4 = (l1.s) nVar;
                Object objQ8 = sVar4.Q();
                if (objQ8 == gVar) {
                    objQ8 = l1.t.q(sVar4);
                    sVar4.o0(objQ8);
                }
                rz.b0 b0Var2 = (rz.b0) objQ8;
                CoursePracticeType coursePracticeType = CoursePracticeType.SYLLABLE;
                CourseTestFinishSummaryUiState courseTestFinishSummaryUiState = (CourseTestFinishSummaryUiState) b1VarO2.getValue();
                long jLongValue = ((Number) b1VarO3.getValue()).longValue();
                boolean zH8 = sVar4.h(b0Var2) | sVar4.h(rVar) | sVar4.f(aVar7);
                Object objQ9 = sVar4.Q();
                if (zH8 || objQ9 == gVar) {
                    objQ9 = new androidx.lifecycle.compose.a(b0Var2, rVar, aVar7, 15);
                    sVar4.o0(objQ9);
                }
                ys.y0.c(coursePracticeType, courseTestFinishSummaryUiState, jLongValue, true, (fz.a) objQ9, cVar, false, null, null, null, null, null, null, null, sVar4, 3078, 16320);
                return b0Var;
            case 3:
                j9.v vVar3 = (j9.v) obj5;
                SplashIndexActivity splashIndexActivity = (SplashIndexActivity) obj6;
                a0.r composable2 = (a0.r) obj;
                j9.e it2 = (j9.e) obj2;
                ((Integer) obj4).getClass();
                int i13 = SplashIndexActivity.M;
                kotlin.jvm.internal.m.f(composable2, "$this$composable");
                kotlin.jvm.internal.m.f(it2, "it");
                boolean z14 = ((hr.b) ((hr.c) obj7)).f33691a;
                l1.s sVar5 = (l1.s) ((l1.n) obj3);
                boolean zH9 = sVar5.h(vVar3);
                Object objQ10 = sVar5.Q();
                if (zH9 || objQ10 == gVar) {
                    objQ10 = new z1(vVar3, 20);
                    sVar5.o0(objQ10);
                }
                fz.a aVar8 = (fz.a) objQ10;
                boolean zH10 = sVar5.h(splashIndexActivity);
                Object objQ11 = sVar5.Q();
                if (zH10 || objQ11 == gVar) {
                    objQ11 = new gr.t(splashIndexActivity, 3);
                    sVar5.o0(objQ11);
                }
                fz.a aVar9 = (fz.a) objQ11;
                boolean zH11 = sVar5.h(splashIndexActivity);
                Object objQ12 = sVar5.Q();
                if (zH11 || objQ12 == gVar) {
                    objQ12 = new gr.t(splashIndexActivity, 4);
                    sVar5.o0(objQ12);
                }
                gr.n.j(z14, aVar8, aVar9, (fz.a) objQ12, sVar5, 0);
                return b0Var;
            case 4:
                j9.v vVar4 = (j9.v) obj5;
                fz.c cVar2 = (fz.c) obj6;
                a0.r composable3 = (a0.r) obj;
                j9.e it3 = (j9.e) obj2;
                l1.n nVar2 = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(composable3, "$this$composable");
                kotlin.jvm.internal.m.f(it3, "it");
                kv.g0 g0Var = ((iv.f0) obj7).f34724e;
                if (g0Var == null) {
                    sVar = (l1.s) nVar2;
                    sVar.d0(-187202066);
                    z11 = false;
                } else {
                    kv.i0 i0Var = g0Var.f38743a;
                    sVar = (l1.s) nVar2;
                    sVar.d0(-187202065);
                    boolean zF = sVar.f(i0Var.f38748a);
                    Object objQ13 = sVar.Q();
                    if (zF || objQ13 == gVar) {
                        objQ13 = ep.a.s(g0Var.f38744b, sVar);
                    }
                    l1.b1 b1Var2 = (l1.b1) objQ13;
                    if (((Boolean) b1Var2.getValue()).booleanValue()) {
                        sVar.d0(-1415454724);
                        boolean zH12 = sVar.h(vVar4);
                        Object objQ14 = sVar.Q();
                        if (zH12 || objQ14 == gVar) {
                            objQ14 = new z1(vVar4, 23);
                            sVar.o0(objQ14);
                        }
                        fz.a aVar10 = (fz.a) objQ14;
                        boolean zF2 = sVar.f(b1Var2);
                        Object objQ15 = sVar.Q();
                        if (zF2 || objQ15 == gVar) {
                            objQ15 = new dt.h2(15, b1Var2);
                            sVar.o0(objQ15);
                        }
                        iv.a.m(i0Var, null, aVar10, (fz.a) objQ15, sVar, 0);
                        z11 = false;
                        sVar.p(false);
                    } else {
                        sVar.d0(-1414978905);
                        i9.a(null, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(1371660469, new fp.e(vVar4, g0Var, cVar2, 6), sVar), sVar, 12582912, 127);
                        z11 = false;
                        sVar.p(false);
                    }
                }
                sVar.p(z11);
                return b0Var;
            case 5:
                mv.k0 k0Var = (mv.k0) obj7;
                fz.c cVar3 = (fz.c) obj5;
                l1.n nVar3 = (l1.n) obj3;
                ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
                ys.y0.c(CoursePracticeType.SYLLABLE, (CourseTestFinishSummaryUiState) l1.t.o(k0Var.f42239v0, nVar3).getValue(), ((Number) l1.t.o(k0Var.T, nVar3).getValue()).longValue(), true, (fz.a) obj6, cVar3, false, null, null, null, null, null, null, null, nVar3, 3078, 16320);
                return b0Var;
            case 6:
                o0.o HorizontalPager = (o0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ((Integer) obj4).intValue();
                kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                mt.g.l((CourseACK) ((List) obj7).get(iIntValue), (fz.a) obj6, (fz.e) obj5, (l1.n) obj3, 0);
                return b0Var;
            case 7:
                rt.b4 b4Var = (rt.b4) obj7;
                l1.b1 b1Var3 = (l1.b1) obj6;
                j9.v vVar5 = (j9.v) obj5;
                a0.r composable4 = (a0.r) obj;
                j9.e it4 = (j9.e) obj2;
                l1.n nVar4 = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(composable4, "$this$composable");
                kotlin.jvm.internal.m.f(it4, "it");
                l1.b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(b4Var.f49490c0, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, nVar4, 0, 7);
                vy.d dVar = null;
                if (!((ae) b3VarCollectAsStateWithLifecycle.getValue()).f49466a) {
                    l1.s sVar6 = (l1.s) nVar4;
                    sVar6.d0(-1706312013);
                    tv.a.d(0, 1, sVar6, null);
                    sVar6.p(false);
                } else if (((ae) b3VarCollectAsStateWithLifecycle.getValue()).f49467b.isEmpty()) {
                    l1.s sVar7 = (l1.s) nVar4;
                    sVar7.d0(-1355992681);
                    boolean zH13 = sVar7.h(b4Var) | sVar7.f(b1Var3) | sVar7.h(vVar5);
                    Object objQ16 = sVar7.Q();
                    if (zH13 || objQ16 == gVar) {
                        objQ16 = new ad.y(b4Var, vVar5, b1Var3, dVar, 21);
                        sVar7.o0(objQ16);
                    }
                    l1.t.f((fz.e) objQ16, b0Var, sVar7);
                    sVar7.p(false);
                } else {
                    l1.s sVar8 = (l1.s) nVar4;
                    sVar8.d0(-1706304044);
                    ae aeVar = (ae) b3VarCollectAsStateWithLifecycle.getValue();
                    boolean zH14 = sVar8.h(b4Var) | sVar8.f(b1Var3) | sVar8.h(vVar5);
                    Object objQ17 = sVar8.Q();
                    if (zH14 || objQ17 == gVar) {
                        objQ17 = new mt.n2(b4Var, vVar5, b1Var3, 0);
                        sVar8.o0(objQ17);
                    }
                    fz.a aVar11 = (fz.a) ((mz.e) objQ17);
                    boolean zH15 = sVar8.h(b4Var);
                    Object objQ18 = sVar8.Q();
                    if (zH15 || objQ18 == gVar) {
                        objQ18 = new bt.a3(1, b4Var, rt.b4.class, "toggleCustomizeReviewSuggestion", "toggleCustomizeReviewSuggestion(Ljava/lang/String;)V", 0, 23);
                        sVar8.o0(objQ18);
                    }
                    fz.c cVar4 = (fz.c) ((mz.e) objQ18);
                    boolean zH16 = sVar8.h(b4Var);
                    Object objQ19 = sVar8.Q();
                    if (zH16 || objQ19 == gVar) {
                        objQ19 = new bt.y2(0, b4Var, rt.b4.class, "toggleAllCustomizeReviewSuggestions", "toggleAllCustomizeReviewSuggestions()V", 0, 16);
                        sVar8.o0(objQ19);
                    }
                    fz.a aVar12 = (fz.a) ((mz.e) objQ19);
                    boolean zH17 = sVar8.h(b4Var);
                    Object objQ20 = sVar8.Q();
                    if (zH17 || objQ20 == gVar) {
                        objQ20 = new bt.a3(1, b4Var, rt.b4.class, "editCustomizeReviewSuggestion", "editCustomizeReviewSuggestion(Ljava/lang/String;)V", 0, 24);
                        sVar8.o0(objQ20);
                    }
                    fz.c cVar5 = (fz.c) ((mz.e) objQ20);
                    boolean zH18 = sVar8.h(b4Var);
                    Object objQ21 = sVar8.Q();
                    if (zH18 || objQ21 == gVar) {
                        objQ21 = new d0.m0(2, b4Var, rt.b4.class, "updateCustomizeReviewSuggestionDay", "updateCustomizeReviewSuggestionDay(Ljava/lang/String;I)V", 0, 3);
                        sVar8.o0(objQ21);
                    }
                    fz.e eVar = (fz.e) ((mz.e) objQ21);
                    boolean zH19 = sVar8.h(b4Var);
                    Object objQ22 = sVar8.Q();
                    if (zH19 || objQ22 == gVar) {
                        objQ22 = new bt.y2(0, b4Var, rt.b4.class, "applyCustomizeReviewSuggestions", "applyCustomizeReviewSuggestions()V", 0, 17);
                        sVar8.o0(objQ22);
                    }
                    fz.a aVar13 = (fz.a) ((mz.e) objQ22);
                    boolean zH20 = sVar8.h(b4Var) | sVar8.f(b1Var3) | sVar8.h(vVar5);
                    Object objQ23 = sVar8.Q();
                    if (zH20 || objQ23 == gVar) {
                        objQ23 = new mt.n2(b4Var, vVar5, b1Var3, 1);
                        sVar8.o0(objQ23);
                    }
                    mt.y3.t(aeVar, aVar11, cVar4, aVar12, cVar5, eVar, aVar13, (fz.a) ((mz.e) objQ23), sVar8, 0);
                    sVar8.p(false);
                }
                return b0Var;
            case 8:
                rt.j2 j2Var = (rt.j2) obj7;
                j9.v vVar6 = (j9.v) obj5;
                fz.a aVar14 = (fz.a) obj6;
                a0.r composable5 = (a0.r) obj;
                j9.e it5 = (j9.e) obj2;
                l1.n nVar5 = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(composable5, "$this$composable");
                kotlin.jvm.internal.m.f(it5, "it");
                l1.b3 b3VarCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(j2Var.U, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, nVar5, 0, 7);
                l1.s sVar9 = (l1.s) nVar5;
                boolean zH21 = sVar9.h(j2Var);
                Object objQ24 = sVar9.Q();
                if (zH21 || objQ24 == gVar) {
                    objQ24 = new mt.k2(j2Var, null, 0);
                    sVar9.o0(objQ24);
                }
                l1.t.f((fz.e) objQ24, b0Var, sVar9);
                boolean zH22 = sVar9.h(j2Var);
                Object objQ25 = sVar9.Q();
                if (zH22 || objQ25 == gVar) {
                    objQ25 = new mt.i2(j2Var, 0);
                    sVar9.o0(objQ25);
                }
                l1.t.c(j2Var, (fz.c) objQ25, sVar9);
                rt.l1 l1Var = (rt.l1) b3VarCollectAsStateWithLifecycle2.getValue();
                if (l1Var instanceof rt.k1) {
                    sVar9.d0(-921510107);
                    List list = ((rt.k1) l1Var).f49955a;
                    boolean zH23 = sVar9.h(vVar6) | sVar9.f(aVar14);
                    Object objQ26 = sVar9.Q();
                    if (zH23 || objQ26 == gVar) {
                        objQ26 = new gr.p(vVar6, aVar14, 1);
                        sVar9.o0(objQ26);
                    }
                    mt.n1.a(list, (fz.a) objQ26, null, sVar9, 0);
                    sVar9.p(false);
                } else if (kotlin.jvm.internal.m.a(l1Var, rt.i1.f49859a)) {
                    sVar9.d0(1632856175);
                    boolean zH24 = sVar9.h(j2Var);
                    Object objQ27 = sVar9.Q();
                    if (zH24 || objQ27 == gVar) {
                        objQ27 = new bt.y2(0, j2Var, rt.j2.class, "loadFutureReviewItems", "loadFutureReviewItems()V", 0, 15);
                        sVar9.o0(objQ27);
                    }
                    mt.p2.e((fz.a) ((mz.e) objQ27), sVar9, 0);
                    sVar9.p(false);
                } else {
                    if (!kotlin.jvm.internal.m.a(l1Var, rt.j1.f49903a)) {
                        throw nv.p.x(sVar9, 1632838610, false);
                    }
                    sVar9.d0(1632862028);
                    tv.a.d(0, 1, sVar9, null);
                    sVar9.p(false);
                }
                return b0Var;
            case 9:
                rt.e3 e3Var = (rt.e3) obj7;
                l1.b1 b1Var4 = (l1.b1) obj6;
                j9.v vVar7 = (j9.v) obj5;
                a0.r composable6 = (a0.r) obj;
                j9.e it6 = (j9.e) obj2;
                l1.n nVar6 = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(composable6, "$this$composable");
                kotlin.jvm.internal.m.f(it6, "it");
                l1.b1 b1VarO4 = l1.t.o(e3Var.B0, nVar6);
                l1.s sVar10 = (l1.s) nVar6;
                boolean zH25 = sVar10.h(e3Var);
                Object objQ28 = sVar10.Q();
                vy.d dVar2 = null;
                if (zH25 || objQ28 == gVar) {
                    objQ28 = new km.s0(e3Var, dVar2, 5);
                    sVar10.o0(objQ28);
                }
                l1.t.f((fz.e) objQ28, e3Var, sVar10);
                if (!((ae) b1VarO4.getValue()).f49466a) {
                    sVar10.d0(509271766);
                    tv.a.d(0, 1, sVar10, null);
                    sVar10.p(false);
                } else if (((ae) b1VarO4.getValue()).f49467b.isEmpty()) {
                    sVar10.d0(-1392372268);
                    boolean zH26 = sVar10.h(e3Var) | sVar10.f(b1Var4) | sVar10.h(vVar7);
                    Object objQ29 = sVar10.Q();
                    if (zH26 || objQ29 == gVar) {
                        objQ29 = new ad.y(e3Var, vVar7, b1Var4, dVar2, 22);
                        sVar10.o0(objQ29);
                    }
                    l1.t.f((fz.e) objQ29, b0Var, sVar10);
                    sVar10.p(false);
                } else {
                    sVar10.d0(509279750);
                    ae aeVar2 = (ae) b1VarO4.getValue();
                    boolean zH27 = sVar10.h(e3Var) | sVar10.f(b1Var4) | sVar10.h(vVar7);
                    Object objQ30 = sVar10.Q();
                    if (zH27 || objQ30 == gVar) {
                        objQ30 = new mt.b4(e3Var, vVar7, b1Var4, 0);
                        sVar10.o0(objQ30);
                    }
                    fz.a aVar15 = (fz.a) ((mz.e) objQ30);
                    boolean zH28 = sVar10.h(e3Var);
                    Object objQ31 = sVar10.Q();
                    if (zH28 || objQ31 == gVar) {
                        objQ31 = new bt.a3(1, e3Var, rt.e3.class, "toggleCustomizeReviewSuggestion", "toggleCustomizeReviewSuggestion(Ljava/lang/String;)V", 0, 29);
                        sVar10.o0(objQ31);
                    }
                    fz.c cVar6 = (fz.c) ((mz.e) objQ31);
                    boolean zH29 = sVar10.h(e3Var);
                    Object objQ32 = sVar10.Q();
                    if (zH29 || objQ32 == gVar) {
                        objQ32 = new bt.y2(0, e3Var, rt.e3.class, "toggleAllCustomizeReviewSuggestions", "toggleAllCustomizeReviewSuggestions()V", 0, 24);
                        sVar10.o0(objQ32);
                    }
                    fz.a aVar16 = (fz.a) ((mz.e) objQ32);
                    boolean zH30 = sVar10.h(e3Var);
                    Object objQ33 = sVar10.Q();
                    if (zH30 || objQ33 == gVar) {
                        objQ33 = new mt.c4(1, e3Var, rt.e3.class, "editCustomizeReviewSuggestion", "editCustomizeReviewSuggestion(Ljava/lang/String;)V", 0, 0);
                        sVar10.o0(objQ33);
                    }
                    fz.c cVar7 = (fz.c) ((mz.e) objQ33);
                    boolean zH31 = sVar10.h(e3Var);
                    Object objQ34 = sVar10.Q();
                    if (zH31 || objQ34 == gVar) {
                        objQ34 = new d0.m0(2, e3Var, rt.e3.class, "updateCustomizeReviewSuggestionDay", "updateCustomizeReviewSuggestionDay(Ljava/lang/String;I)V", 0, 7);
                        sVar10.o0(objQ34);
                    }
                    fz.e eVar2 = (fz.e) ((mz.e) objQ34);
                    boolean zH32 = sVar10.h(e3Var);
                    Object objQ35 = sVar10.Q();
                    if (zH32 || objQ35 == gVar) {
                        objQ35 = new bt.y2(0, e3Var, rt.e3.class, "applyCustomizeReviewSuggestions", "applyCustomizeReviewSuggestions()V", 0, 25);
                        sVar10.o0(objQ35);
                    }
                    fz.a aVar17 = (fz.a) ((mz.e) objQ35);
                    boolean zH33 = sVar10.h(e3Var) | sVar10.f(b1Var4) | sVar10.h(vVar7);
                    Object objQ36 = sVar10.Q();
                    if (zH33 || objQ36 == gVar) {
                        objQ36 = new mt.b4(e3Var, vVar7, b1Var4, 1);
                        sVar10.o0(objQ36);
                    }
                    mt.y3.t(aeVar2, aVar15, cVar6, aVar16, cVar7, eVar2, aVar17, (fz.a) ((mz.e) objQ36), sVar10, 0);
                    sVar10.p(false);
                }
                return b0Var;
            case 10:
                o9.b bVar = (o9.b) obj7;
                fz.c cVar8 = (fz.c) obj6;
                ph.k kVar = (ph.k) obj5;
                l0.c items = (l0.c) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.n nVar7 = (l1.n) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                kotlin.jvm.internal.m.f(items, "$this$items");
                int i14 = 16;
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= ((l1.s) nVar7).d(iIntValue2) ? 32 : 16;
                }
                l1.s sVar11 = (l1.s) nVar7;
                if (sVar11.T(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    mh.i iVar2 = (mh.i) bVar.b(iIntValue2);
                    if (iVar2 != null) {
                        sVar11.d0(1323808298);
                        z1.r rVarG = j0.e2.g(oVar, 126);
                        boolean zF3 = sVar11.f(cVar8) | sVar11.f(iVar2);
                        Object objQ37 = sVar11.Q();
                        if (zF3 || objQ37 == gVar) {
                            objQ37 = new nh.b(cVar8, iVar2, 0);
                            sVar11.o0(objQ37);
                        }
                        fz.a aVar18 = (fz.a) objQ37;
                        boolean zH34 = sVar11.h(kVar) | sVar11.f(iVar2);
                        Object objQ38 = sVar11.Q();
                        if (zH34 || objQ38 == gVar) {
                            objQ38 = new l1.z1(i14, kVar, iVar2);
                            sVar11.o0(objQ38);
                        }
                        ew.a.d(iVar2, aVar18, (fz.a) objQ38, rVarG, true, sVar11, 27648, 0);
                        sVar11.p(false);
                    } else {
                        sVar11.d0(1324260340);
                        tv.a.e(sVar11, 0);
                        sVar11.p(false);
                    }
                } else {
                    sVar11.W();
                }
                return b0Var;
            case 11:
                return a(obj, obj2, obj3, obj4);
            case 12:
                return c(obj, obj2, obj3, obj4);
            case 13:
                return d(obj, obj2, obj3, obj4);
            case 14:
                sv.o oVar2 = (sv.o) obj7;
                fz.a aVar19 = (fz.a) obj6;
                fz.c cVar9 = (fz.c) obj5;
                l1.n nVar8 = (l1.n) obj3;
                ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
                l1.b1 b1VarO5 = l1.t.o(oVar2.f51837v0, nVar8);
                l1.b1 b1VarO6 = l1.t.o(oVar2.T, nVar8);
                CoursePracticeType coursePracticeType2 = CoursePracticeType.SYLLABLE;
                CourseTestFinishSummaryUiState courseTestFinishSummaryUiState2 = (CourseTestFinishSummaryUiState) b1VarO5.getValue();
                long jLongValue2 = ((Number) b1VarO6.getValue()).longValue();
                l1.s sVar12 = (l1.s) nVar8;
                boolean zF4 = sVar12.f(aVar19);
                Object objQ39 = sVar12.Q();
                if (zF4 || objQ39 == gVar) {
                    objQ39 = new nv.d(29, aVar19);
                    sVar12.o0(objQ39);
                }
                ys.y0.c(coursePracticeType2, courseTestFinishSummaryUiState2, jLongValue2, true, (fz.a) objQ39, cVar9, false, null, null, null, null, null, null, null, sVar12, 3078, 16320);
                return b0Var;
            case 15:
                return e(obj, obj2, obj3, obj4);
            default:
                mb mbVar = (mb) obj7;
                fz.a aVar20 = (fz.a) obj6;
                fz.c cVar10 = (fz.c) obj5;
                l1.n nVar9 = (l1.n) obj3;
                ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
                l1.b1 b1VarO7 = l1.t.o(mbVar.f50082z0, nVar9);
                l1.b1 b1VarO8 = l1.t.o(mbVar.T, nVar9);
                l1.b1 b1VarO9 = l1.t.o(mbVar.f50716j0, nVar9);
                l1.s sVar13 = (l1.s) nVar9;
                Object objQ40 = sVar13.Q();
                if (objQ40 == gVar) {
                    objQ40 = l1.t.B(null);
                    sVar13.o0(objQ40);
                }
                l1.b1 b1Var5 = (l1.b1) objQ40;
                Object objQ41 = sVar13.Q();
                if (objQ41 == gVar) {
                    objQ41 = l1.t.B(null);
                    sVar13.o0(objQ41);
                }
                l1.b1 b1Var6 = (l1.b1) objQ41;
                Object objQ42 = sVar13.Q();
                if (objQ42 == gVar) {
                    objQ42 = l1.t.B(Boolean.FALSE);
                    sVar13.o0(objQ42);
                }
                l1.b1 b1Var7 = (l1.b1) objQ42;
                Object objQ43 = sVar13.Q();
                if (objQ43 == gVar) {
                    objQ43 = l1.t.B(Boolean.FALSE);
                    sVar13.o0(objQ43);
                }
                l1.b1 b1Var8 = (l1.b1) objQ43;
                boolean zF5 = sVar13.f((ja) b1Var5.getValue());
                Object objQ44 = sVar13.Q();
                if (zF5 || objQ44 == gVar) {
                    ja jaVar = (ja) b1Var5.getValue();
                    objQ44 = jaVar != null ? mbVar.y(jaVar) : null;
                    sVar13.o0(objQ44);
                }
                uz.g1 g1Var = (uz.g1) objQ44;
                if (g1Var == null) {
                    sVar13.d0(-1334836928);
                    sVar13.p(false);
                    b1VarO = null;
                } else {
                    sVar13.d0(788224737);
                    b1VarO = l1.t.o(g1Var, sVar13);
                    sVar13.p(false);
                }
                if (b1VarO == null) {
                    sVar13.d0(-1334815475);
                    Object objQ45 = sVar13.Q();
                    if (objQ45 == gVar) {
                        objQ45 = l1.t.B(ry.r.f50854a);
                        sVar13.o0(objQ45);
                    }
                    b1Var = (l1.b1) objQ45;
                    sVar13.p(false);
                } else {
                    sVar13.d0(788218640);
                    sVar13.p(false);
                    b1Var = b1VarO;
                }
                ja jaVar2 = (ja) b1Var5.getValue();
                List list2 = (List) b1Var.getValue();
                rt.p pVar = (rt.p) b1VarO9.getValue();
                boolean zBooleanValue = ((Boolean) b1Var8.getValue()).booleanValue();
                boolean zH35 = sVar13.h(mbVar);
                Object objQ46 = sVar13.Q();
                if (zH35 || objQ46 == gVar) {
                    objQ46 = new d0.m0(2, mbVar, mb.class, "createFolder", "createFolder(Lcom/lingodeer/course/viewmodels/CourseTestBookmarkTarget;Ljava/lang/String;)V", 0, 16);
                    sVar13.o0(objQ46);
                }
                fz.e eVar3 = (fz.e) ((mz.e) objQ46);
                boolean zH36 = sVar13.h(mbVar);
                Object objQ47 = sVar13.Q();
                if (zH36 || objQ47 == gVar) {
                    objQ47 = new d0.m0(2, mbVar, mb.class, "addBookmarkToFolder", "addBookmarkToFolder(Lcom/lingodeer/course/viewmodels/CourseTestBookmarkTarget;Ljava/lang/String;)V", 0, 17);
                    sVar13.o0(objQ47);
                }
                fz.e eVar4 = (fz.e) ((mz.e) objQ47);
                Object objQ48 = sVar13.Q();
                if (objQ48 == gVar) {
                    objQ48 = new ch.h0(b1Var5, b1Var8, 13);
                    sVar13.o0(objQ48);
                }
                fz.a aVar21 = (fz.a) objQ48;
                Object objQ49 = sVar13.Q();
                if (objQ49 == gVar) {
                    objQ49 = new i2(b1Var6, b1Var7, 24);
                    sVar13.o0(objQ49);
                }
                fz.c cVar11 = (fz.c) objQ49;
                boolean zH37 = sVar13.h(mbVar);
                Object objQ50 = sVar13.Q();
                if (zH37 || objQ50 == gVar) {
                    objQ50 = new mt.j5(0, mbVar, mb.class, "clearBookmarkFolderOperationResult", "clearBookmarkFolderOperationResult()V", 0, 11);
                    sVar13.o0(objQ50);
                }
                mt.g.i(jaVar2, list2, pVar, zBooleanValue, null, eVar3, eVar4, aVar21, cVar11, (fz.a) ((mz.e) objQ50), sVar13, 113246208, 16);
                if (((Boolean) b1Var7.getValue()).booleanValue()) {
                    sVar13.d0(-1333877911);
                    ja jaVar3 = (ja) b1Var6.getValue();
                    Object objQ51 = sVar13.Q();
                    if (objQ51 == gVar) {
                        objQ51 = new fu.y(b1Var7, b1Var6, null, 8);
                        sVar13.o0(objQ51);
                    }
                    l1.t.f((fz.e) objQ51, jaVar3, sVar13);
                    z12 = false;
                } else {
                    b1VarO7 = b1VarO7;
                    z12 = false;
                    sVar13.d0(-1351124079);
                }
                sVar13.p(z12);
                boolean zF6 = sVar13.f(b1VarO8);
                Object objQ52 = sVar13.Q();
                if (zF6 || objQ52 == gVar) {
                    objQ52 = new ys.k0(b1VarO8, null, 1);
                    sVar13.o0(objQ52);
                }
                l1.t.f((fz.e) objQ52, b0Var, sVar13);
                Object objQ53 = sVar13.Q();
                if (objQ53 == gVar) {
                    objQ53 = new ju.d(25);
                    sVar13.o0(objQ53);
                }
                se.i.a(false, (fz.a) objQ53, sVar13, 48, 1);
                CourseTestFinishSummaryUiState courseTestFinishSummaryUiState3 = (CourseTestFinishSummaryUiState) b1VarO7.getValue();
                if (kotlin.jvm.internal.m.a(courseTestFinishSummaryUiState3, CourseTestFinishSummaryUiState.Loading.INSTANCE)) {
                    sVar13.d0(788270848);
                    tv.a.d(0, 1, sVar13, null);
                    sVar13.p(false);
                } else {
                    if (!(courseTestFinishSummaryUiState3 instanceof CourseTestFinishSummaryUiState.Success)) {
                        throw nv.p.x(sVar13, 788271183, false);
                    }
                    sVar13.d0(788276098);
                    z1.r rVarD = j0.e2.d(oVar, 1.0f);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar13.T);
                    l1.q1 q1VarL = sVar13.l();
                    z1.r rVarC = z1.a.c(sVar13, rVarD);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar13.h0();
                    if (sVar13.S) {
                        sVar13.k(iVar3);
                    } else {
                        sVar13.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar13);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar13);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar13.S || !kotlin.jvm.internal.m.a(sVar13.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar13, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar13);
                    CoursePracticeType coursePracticeType3 = CoursePracticeType.COURSE_REVIEW_5_MIN_QUIZ;
                    CourseTestFinishSummaryUiState courseTestFinishSummaryUiState4 = (CourseTestFinishSummaryUiState) b1VarO7.getValue();
                    long jLongValue3 = ((Number) b1VarO8.getValue()).longValue();
                    boolean zF7 = sVar13.f(aVar20);
                    Object objQ54 = sVar13.Q();
                    if (zF7 || objQ54 == gVar) {
                        objQ54 = new xu.r1(29, aVar20);
                        sVar13.o0(objQ54);
                    }
                    fz.a aVar22 = (fz.a) objQ54;
                    boolean zH38 = sVar13.h(mbVar);
                    Object objQ55 = sVar13.Q();
                    if (zH38 || objQ55 == gVar) {
                        objQ55 = new ys.b2(mbVar, 2);
                        sVar13.o0(objQ55);
                    }
                    fz.e eVar5 = (fz.e) objQ55;
                    boolean zH39 = sVar13.h(mbVar);
                    Object objQ56 = sVar13.Q();
                    if (zH39 || objQ56 == gVar) {
                        objQ56 = new pr.t(mbVar, b1Var7, b1Var6, b1Var5, 11);
                        sVar13.o0(objQ56);
                    }
                    fz.e eVar6 = (fz.e) objQ56;
                    boolean zH40 = sVar13.h(mbVar);
                    Object objQ57 = sVar13.Q();
                    if (zH40 || objQ57 == gVar) {
                        objQ57 = new ys.b2(mbVar, 3);
                        sVar13.o0(objQ57);
                    }
                    fz.e eVar7 = (fz.e) objQ57;
                    boolean zH41 = sVar13.h(mbVar);
                    Object objQ58 = sVar13.Q();
                    if (zH41 || objQ58 == gVar) {
                        objQ58 = new qu.s(mbVar, 10);
                        sVar13.o0(objQ58);
                    }
                    ys.y0.c(coursePracticeType3, courseTestFinishSummaryUiState4, jLongValue3, true, aVar22, cVar10, false, null, null, eVar5, eVar6, eVar7, (fz.f) objQ58, null, sVar13, 3078, 8640);
                    if (((Boolean) b1Var7.getValue()).booleanValue()) {
                        sVar13.d0(1565987451);
                        Object objQ59 = sVar13.Q();
                        if (objQ59 == gVar) {
                            objQ59 = new mt.i3(5, b1Var6, b1Var7, b1Var5, b1Var8);
                            sVar13.o0(objQ59);
                        }
                        mt.g.a(54, (fz.a) objQ59, sVar13, null);
                        z13 = false;
                    } else {
                        z13 = false;
                        sVar13.d0(1545954104);
                    }
                    sVar13.p(z13);
                    sVar13.p(true);
                    sVar13.p(z13);
                }
                return b0Var;
        }
    }

    public /* synthetic */ b2(Object obj, j9.v vVar, Object obj2, int i11) {
        this.f4501a = i11;
        this.f4503c = obj;
        this.f4502b = vVar;
        this.f4504d = obj2;
    }

    public /* synthetic */ b2(Object obj, Object obj2, Object obj3, int i11) {
        this.f4501a = i11;
        this.f4503c = obj;
        this.f4504d = obj2;
        this.f4502b = obj3;
    }
}
