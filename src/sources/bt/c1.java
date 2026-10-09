package bt;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import rt.ac;
import rt.bc;
import rt.gc;
import rt.h9;
import rt.l9;
import rt.rc;
import rt.y9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c1 implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5256f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5257t;

    public /* synthetic */ c1(CourseSentence courseSentence, List list, ys.d0 d0Var, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, rz.b0 b0Var, l1.b1 b1Var4, l1.a1 a1Var) {
        this.f5251a = 0;
        this.f5253c = courseSentence;
        this.f5254d = list;
        this.f5255e = d0Var;
        this.f5252b = b1Var;
        this.f5256f = b1Var2;
        this.f5257t = b1Var3;
        this.K = b0Var;
        this.H = b1Var4;
        this.L = a1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5251a) {
            case 0:
                final CourseSentence courseSentence = (CourseSentence) this.f5253c;
                List list = (List) this.f5254d;
                final ys.d0 d0Var = (ys.d0) this.f5255e;
                final l1.b1 b1Var = (l1.b1) this.f5252b;
                final l1.b1 b1Var2 = (l1.b1) this.f5256f;
                final l1.b1 b1Var3 = (l1.b1) this.f5257t;
                final rz.b0 b0Var = (rz.b0) this.K;
                l1.b1 b1Var4 = (l1.b1) this.H;
                final l1.a1 a1Var = (l1.a1) this.L;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) sVar.j(ju.f.f37373g)).booleanValue();
                    l1.g gVar = l1.m.f39353a;
                    if (zBooleanValue) {
                        sVar.d0(-1872263997);
                        ht.q qVar = (ht.q) b1Var4.getValue();
                        ht.l lVar = (ht.l) b1Var.getValue();
                        List<CourseWord> displayCourseWords = courseSentence.getDisplayCourseWords();
                        String translation = courseSentence.getTranslation();
                        int iL = ((l1.h1) a1Var).l();
                        boolean zH = sVar.h(d0Var);
                        Object objQ = sVar.Q();
                        if (zH || objQ == gVar) {
                            objQ = new l(d0Var, 7);
                            sVar.o0(objQ);
                        }
                        fz.a aVar = (fz.a) objQ;
                        Object objQ2 = sVar.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new ju.d(25);
                            sVar.o0(objQ2);
                        }
                        fz.a aVar2 = (fz.a) objQ2;
                        boolean zF = sVar.f(b1Var) | sVar.f(b1Var2) | sVar.f(b1Var3) | sVar.h(d0Var) | sVar.h(b0Var) | sVar.h(courseSentence);
                        Object objQ3 = sVar.Q();
                        if (zF || objQ3 == gVar) {
                            final int i11 = 0;
                            fz.c cVar = new fz.c() { // from class: bt.a1
                                @Override // fz.c
                                public final Object invoke(Object obj3) {
                                    CourseWord wordItem = (CourseWord) obj3;
                                    switch (i11) {
                                        case 0:
                                            kotlin.jvm.internal.m.f(wordItem, "wordItem");
                                            ht.a aVar3 = ht.a.f33722e;
                                            l1.b1 b1Var5 = b1Var;
                                            b1Var5.setValue(aVar3);
                                            b.k(d0Var, b1Var2, b1Var3, b0Var, courseSentence, a1Var, b1Var5, ns.o.K(wordItem.getAudioUri().toString()), new ht.e(wordItem.getVisemedMap()));
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.f(wordItem, "wordItem");
                                            ht.a aVar4 = ht.a.f33722e;
                                            l1.b1 b1Var6 = b1Var;
                                            b1Var6.setValue(aVar4);
                                            b.k(d0Var, b1Var2, b1Var3, b0Var, courseSentence, a1Var, b1Var6, ns.o.K(wordItem.getAudioUri().toString()), new ht.e(wordItem.getVisemedMap()));
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar.o0(cVar);
                            objQ3 = cVar;
                        }
                        dt.e.p(qVar, lVar, null, displayCourseWords, translation, false, null, false, true, false, false, list, iL, 0, null, 0L, null, null, aVar, aVar2, (fz.c) objQ3, null, sVar, 906166656, 805306368, 0, 2352320);
                        sVar.p(false);
                    } else {
                        sVar.d0(-1871124964);
                        float f5 = 26;
                        z1.o oVar = z1.o.f58481a;
                        j0.c.g(sVar, j0.e2.g(oVar, f5));
                        List<CourseWord> displayCourseWords2 = courseSentence.getDisplayCourseWords();
                        boolean z11 = (((ht.l) b1Var.getValue()) instanceof ht.c) || (((ht.l) b1Var.getValue()) instanceof ht.i);
                        int iL2 = ((l1.h1) a1Var).l();
                        boolean zF2 = sVar.f(b1Var) | sVar.f(b1Var2) | sVar.f(b1Var3) | sVar.h(d0Var) | sVar.h(b0Var) | sVar.h(courseSentence);
                        Object objQ4 = sVar.Q();
                        if (zF2 || objQ4 == gVar) {
                            final int i12 = 1;
                            fz.c cVar2 = new fz.c() { // from class: bt.a1
                                @Override // fz.c
                                public final Object invoke(Object obj3) {
                                    CourseWord wordItem = (CourseWord) obj3;
                                    switch (i12) {
                                        case 0:
                                            kotlin.jvm.internal.m.f(wordItem, "wordItem");
                                            ht.a aVar3 = ht.a.f33722e;
                                            l1.b1 b1Var5 = b1Var;
                                            b1Var5.setValue(aVar3);
                                            b.k(d0Var, b1Var2, b1Var3, b0Var, courseSentence, a1Var, b1Var5, ns.o.K(wordItem.getAudioUri().toString()), new ht.e(wordItem.getVisemedMap()));
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.f(wordItem, "wordItem");
                                            ht.a aVar4 = ht.a.f33722e;
                                            l1.b1 b1Var6 = b1Var;
                                            b1Var6.setValue(aVar4);
                                            b.k(d0Var, b1Var2, b1Var3, b0Var, courseSentence, a1Var, b1Var6, ns.o.K(wordItem.getAudioUri().toString()), new ht.e(wordItem.getVisemedMap()));
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar.o0(cVar2);
                            objQ4 = cVar2;
                        }
                        dt.d4.a(displayCourseWords2, null, list, false, false, null, null, z11, false, iL2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, (fz.c) objQ4, sVar, 0, 0, 0, 2096506);
                        ep.a.C(oVar, f5, sVar, false);
                    }
                } else {
                    sVar.W();
                }
                break;
            case 1:
                final mv.k0 k0Var = (mv.k0) this.f5253c;
                fz.a aVar3 = (fz.a) this.f5254d;
                l9 l9Var = (l9) this.f5255e;
                j9.v vVar = (j9.v) this.f5256f;
                l1.b3 b3Var = (l1.b3) this.f5257t;
                l1.b3 b3Var2 = (l1.b3) this.H;
                l1.b3 b3Var3 = (l1.b3) this.K;
                l1.b3 b3Var4 = (l1.b3) this.L;
                l1.b1 b1Var5 = (l1.b1) this.f5252b;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rc rcVar = (rc) b3Var.getValue();
                    h9 h9Var = (h9) b3Var2.getValue();
                    gc gcVar = (gc) b3Var3.getValue();
                    int iIntValue3 = ((Number) b3Var4.getValue()).intValue();
                    boolean zH2 = sVar2.h(k0Var);
                    Object objQ5 = sVar2.Q();
                    l1.g gVar2 = l1.m.f39353a;
                    if (zH2 || objQ5 == gVar2) {
                        objQ5 = new iv.e1(k0Var, 2);
                        sVar2.o0(objQ5);
                    }
                    fz.a aVar4 = (fz.a) objQ5;
                    boolean zH3 = sVar2.h(l9Var);
                    Object objQ6 = sVar2.Q();
                    if (zH3 || objQ6 == gVar2) {
                        objQ6 = new fs.b(l9Var, 1);
                        sVar2.o0(objQ6);
                    }
                    fz.c cVar3 = (fz.c) objQ6;
                    boolean zH4 = sVar2.h(k0Var);
                    Object objQ7 = sVar2.Q();
                    if (zH4 || objQ7 == gVar2) {
                        final int i13 = 0;
                        objQ7 = new fz.e() { // from class: iv.c1
                            @Override // fz.e
                            public final Object invoke(Object obj3, Object obj4) {
                                int i14 = i13;
                                ht.o oVar2 = (ht.o) obj3;
                                long jLongValue = ((Long) obj4).longValue();
                                switch (i14) {
                                    case 0:
                                        kotlin.jvm.internal.m.f(oVar2, "<unused var>");
                                        k0Var.t(new ac(jLongValue, -1L, false));
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.f(oVar2, "<unused var>");
                                        k0Var.t(new bc(jLongValue, -1L, false));
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar2.o0(objQ7);
                    }
                    fz.e eVar = (fz.e) objQ7;
                    boolean zH5 = sVar2.h(k0Var);
                    Object objQ8 = sVar2.Q();
                    if (zH5 || objQ8 == gVar2) {
                        final int i14 = 1;
                        objQ8 = new fz.e() { // from class: iv.c1
                            @Override // fz.e
                            public final Object invoke(Object obj3, Object obj4) {
                                int i15 = i14;
                                ht.o oVar2 = (ht.o) obj3;
                                long jLongValue = ((Long) obj4).longValue();
                                switch (i15) {
                                    case 0:
                                        kotlin.jvm.internal.m.f(oVar2, "<unused var>");
                                        k0Var.t(new ac(jLongValue, -1L, false));
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.f(oVar2, "<unused var>");
                                        k0Var.t(new bc(jLongValue, -1L, false));
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar2.o0(objQ8);
                    }
                    fz.e eVar2 = (fz.e) objQ8;
                    boolean zH6 = sVar2.h(k0Var);
                    Object objQ9 = sVar2.Q();
                    if (zH6 || objQ9 == gVar2) {
                        objQ9 = new iv.d1(k0Var, 0);
                        sVar2.o0(objQ9);
                    }
                    fz.c cVar4 = (fz.c) objQ9;
                    boolean zH7 = sVar2.h(k0Var);
                    Object objQ10 = sVar2.Q();
                    if (zH7 || objQ10 == gVar2) {
                        objQ10 = new iv.e1(k0Var, 0);
                        sVar2.o0(objQ10);
                    }
                    fz.a aVar5 = (fz.a) objQ10;
                    boolean zH8 = sVar2.h(k0Var);
                    Object objQ11 = sVar2.Q();
                    if (zH8 || objQ11 == gVar2) {
                        objQ11 = new com.google.accompanist.permissions.a(25, k0Var, b1Var5);
                        sVar2.o0(objQ11);
                    }
                    fz.c cVar5 = (fz.c) objQ11;
                    boolean zH9 = sVar2.h(vVar);
                    Object objQ12 = sVar2.Q();
                    if (zH9 || objQ12 == gVar2) {
                        objQ12 = new bp.z1(vVar, 29);
                        sVar2.o0(objQ12);
                    }
                    iv.a.E(rcVar, h9Var, gcVar, iIntValue3, aVar4, aVar3, cVar3, eVar, eVar2, cVar4, aVar5, cVar5, (fz.a) objQ12, sVar2, 0);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                sv.o oVar2 = (sv.o) this.f5253c;
                fz.a aVar6 = (fz.a) this.f5254d;
                l9 l9Var2 = (l9) this.f5255e;
                j9.v vVar2 = (j9.v) this.f5256f;
                l1.b3 b3Var5 = (l1.b3) this.f5257t;
                l1.b3 b3Var6 = (l1.b3) this.H;
                l1.b3 b3Var7 = (l1.b3) this.K;
                l1.b3 b3Var8 = (l1.b3) this.L;
                l1.b1 b1Var6 = (l1.b1) this.f5252b;
                l1.n nVar3 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    rc rcVar2 = (rc) b3Var5.getValue();
                    h9 h9Var2 = (h9) b3Var6.getValue();
                    gc gcVar2 = (gc) b3Var7.getValue();
                    int iIntValue5 = ((Number) b3Var8.getValue()).intValue();
                    boolean zH10 = sVar3.h(oVar2);
                    Object objQ13 = sVar3.Q();
                    l1.g gVar3 = l1.m.f39353a;
                    if (zH10 || objQ13 == gVar3) {
                        objQ13 = new nv.z(oVar2, 0);
                        sVar3.o0(objQ13);
                    }
                    fz.a aVar7 = (fz.a) objQ13;
                    boolean zH11 = sVar3.h(l9Var2);
                    Object objQ14 = sVar3.Q();
                    if (zH11 || objQ14 == gVar3) {
                        objQ14 = new fs.b(l9Var2, 4);
                        sVar3.o0(objQ14);
                    }
                    fz.c cVar6 = (fz.c) objQ14;
                    boolean zH12 = sVar3.h(oVar2);
                    Object objQ15 = sVar3.Q();
                    if (zH12 || objQ15 == gVar3) {
                        objQ15 = new mt.r(oVar2, 8);
                        sVar3.o0(objQ15);
                    }
                    fz.e eVar3 = (fz.e) objQ15;
                    boolean zH13 = sVar3.h(oVar2);
                    Object objQ16 = sVar3.Q();
                    if (zH13 || objQ16 == gVar3) {
                        objQ16 = new nv.a0(oVar2, 0);
                        sVar3.o0(objQ16);
                    }
                    fz.c cVar7 = (fz.c) objQ16;
                    boolean zH14 = sVar3.h(oVar2);
                    Object objQ17 = sVar3.Q();
                    if (zH14 || objQ17 == gVar3) {
                        objQ17 = new nv.z(oVar2, 1);
                        sVar3.o0(objQ17);
                    }
                    fz.a aVar8 = (fz.a) objQ17;
                    boolean zH15 = sVar3.h(oVar2);
                    Object objQ18 = sVar3.Q();
                    if (zH15 || objQ18 == gVar3) {
                        objQ18 = new n0.w0(6, oVar2, b1Var6);
                        sVar3.o0(objQ18);
                    }
                    fz.c cVar8 = (fz.c) objQ18;
                    boolean zH16 = sVar3.h(vVar2);
                    Object objQ19 = sVar3.Q();
                    if (zH16 || objQ19 == gVar3) {
                        objQ19 = new j9.g(vVar2, 20);
                        sVar3.o0(objQ19);
                    }
                    nv.r.w(rcVar2, h9Var2, gcVar2, iIntValue5, aVar7, aVar6, cVar6, eVar3, cVar7, aVar8, cVar8, (fz.a) objQ19, sVar3, 0);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f5253c;
                String str = (String) this.f5254d;
                String str2 = (String) this.f5255e;
                l1.b1 b1Var7 = (l1.b1) this.f5252b;
                l1.b1 b1Var8 = (l1.b1) this.f5256f;
                l1.b1 b1Var9 = (l1.b1) this.f5257t;
                l1.b1 b1Var10 = (l1.b1) this.H;
                l1.b1 b1Var11 = (l1.b1) this.K;
                l1.b1 b1Var12 = (l1.b1) this.L;
                l1.n nVar4 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    j0.u uVarA = j0.t.a(j0.i.g(8), z1.c.O, sVar4, 6);
                    int iHashCode = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL = sVar4.l();
                    z1.r rVarC = z1.a.c(sVar4, z1.o.f58481a);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar4);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar4);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar4);
                    String str3 = (String) b1Var7.getValue();
                    Object objQ20 = sVar4.Q();
                    l1.g gVar4 = l1.m.f39353a;
                    if (objQ20 == gVar4) {
                        objQ20 = new bp.i2(b1Var7, b1Var8, 19);
                        sVar4.o0(objQ20);
                    }
                    xu.c.d(str3, (fz.c) objQ20, null, xu.c.m, ((Boolean) b1Var8.getValue()).booleanValue(), (String) yVar.f38361a, sVar4, 3120);
                    String str4 = (String) b1Var9.getValue();
                    Object objQ21 = sVar4.Q();
                    if (objQ21 == gVar4) {
                        objQ21 = new bp.i2(b1Var9, b1Var10, 17);
                        sVar4.o0(objQ21);
                    }
                    xu.c.d(str4, (fz.c) objQ21, null, xu.c.f56361n, ((Boolean) b1Var10.getValue()).booleanValue(), str, sVar4, 3120);
                    String str5 = (String) b1Var11.getValue();
                    Object objQ22 = sVar4.Q();
                    if (objQ22 == gVar4) {
                        objQ22 = new bp.i2(b1Var11, b1Var12, 18);
                        sVar4.o0(objQ22);
                    }
                    xu.c.d(str5, (fz.c) objQ22, null, xu.c.f56363o, ((Boolean) b1Var12.getValue()).booleanValue(), str2, sVar4, 3120);
                    sVar4.p(true);
                } else {
                    sVar4.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ys.p1.a((CourseTestFinishSummaryUiState) this.f5253c, (h9) this.f5254d, (z1.r) this.f5255e, (fz.a) this.f5252b, (fz.a) this.f5256f, (fz.e) this.f5257t, (fz.e) this.H, (fz.e) this.K, (fz.f) this.L, (l1.n) obj, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ c1(CourseTestFinishSummaryUiState courseTestFinishSummaryUiState, h9 h9Var, z1.r rVar, fz.a aVar, fz.a aVar2, fz.e eVar, fz.e eVar2, fz.e eVar3, fz.f fVar, int i11) {
        this.f5251a = 4;
        this.f5253c = courseTestFinishSummaryUiState;
        this.f5254d = h9Var;
        this.f5255e = rVar;
        this.f5252b = aVar;
        this.f5256f = aVar2;
        this.f5257t = eVar;
        this.H = eVar2;
        this.K = eVar3;
        this.L = fVar;
    }

    public /* synthetic */ c1(kotlin.jvm.internal.y yVar, String str, String str2, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, l1.b1 b1Var5, l1.b1 b1Var6) {
        this.f5251a = 3;
        this.f5253c = yVar;
        this.f5254d = str;
        this.f5255e = str2;
        this.f5252b = b1Var;
        this.f5256f = b1Var2;
        this.f5257t = b1Var3;
        this.H = b1Var4;
        this.K = b1Var5;
        this.L = b1Var6;
    }

    public /* synthetic */ c1(y9 y9Var, fz.a aVar, l9 l9Var, j9.v vVar, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, l1.b1 b1Var5, int i11) {
        this.f5251a = i11;
        this.f5253c = y9Var;
        this.f5254d = aVar;
        this.f5255e = l9Var;
        this.f5256f = vVar;
        this.f5257t = b1Var;
        this.H = b1Var2;
        this.K = b1Var3;
        this.L = b1Var4;
        this.f5252b = b1Var5;
    }
}
