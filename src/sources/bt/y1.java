package bt;

import android.net.Uri;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;
import java.util.HashMap;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y1 implements fz.f {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6210f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f6211t;

    public /* synthetic */ y1(ht.o oVar, l1.b1 b1Var, Object obj, l1.i1 i1Var, l1.b1 b1Var2, fz.a aVar, boolean z11, int i11) {
        this.f6205a = i11;
        this.f6208d = oVar;
        this.f6207c = b1Var;
        this.f6210f = obj;
        this.f6211t = i1Var;
        this.f6209e = b1Var2;
        this.H = aVar;
        this.f6206b = z11;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0202  */
    /* JADX WARN: Code duplicated, block: B:42:0x022a  */
    /* JADX WARN: Code duplicated, block: B:43:0x022e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0249  */
    /* JADX WARN: Code duplicated, block: B:52:0x0275  */
    /* JADX WARN: Code duplicated, block: B:55:0x0297  */
    /* JADX WARN: Code duplicated, block: B:58:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:65:0x0309  */
    /* JADX WARN: Code duplicated, block: B:69:0x0334  */
    /* JADX WARN: Code duplicated, block: B:72:0x0353  */
    /* JADX WARN: Code duplicated, block: B:75:0x0367  */
    /* JADX WARN: Code duplicated, block: B:78:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:79:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:86:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:89:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:91:0x03e7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v76, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v77 */
    /* JADX WARN: Type inference failed for: r8v81 */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CourseWord courseWord;
        long jX;
        long j11;
        long jT;
        long j12;
        int i11;
        float f5;
        long jW;
        fz.a aVar;
        y2.h hVar;
        float f11;
        y2.h hVar2;
        int iHashCode;
        float f12;
        boolean zF;
        y2.h hVar3;
        Object objQ;
        boolean z11;
        fz.a aVar2;
        boolean zG;
        Object objQ2;
        boolean z12;
        ?? r9;
        int iHashCode2;
        boolean zF2;
        Object objQ3;
        boolean zF3;
        Object objQ4;
        switch (this.f6205a) {
            case 0:
                ht.o oVar = (ht.o) this.f6208d;
                l1.b1 b1Var = (l1.b1) this.f6207c;
                CourseSentence courseSentence = (CourseSentence) this.f6210f;
                l1.i1 i1Var = (l1.i1) this.f6211t;
                l1.b1 b1Var2 = (l1.b1) this.f6209e;
                fz.a aVar3 = (fz.a) this.H;
                j0.q CourseTestModelScreen = (j0.q) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen, "$this$CourseTestModelScreen");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((l1.s) nVar).f(CourseTestModelScreen) ? 4 : 2;
                }
                boolean z13 = false;
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    if (oVar.f33762j && ((Boolean) b1Var.getValue()).booleanValue()) {
                        z13 = true;
                    }
                    Uri videoUri = courseSentence.getVideoUri();
                    Long lValueOf = Long.valueOf(oVar.f33756d);
                    long jLongValue = i1Var.getValue().longValue();
                    boolean zF4 = sVar.f(b1Var2) | sVar.f(aVar3);
                    Object objQ5 = sVar.Q();
                    if (zF4 || objQ5 == l1.m.f39353a) {
                        objQ5 = new b3(1, aVar3, b1Var2);
                        sVar.o0(objQ5);
                    }
                    dt.e.t(CourseTestModelScreen, z13, videoUri, lValueOf, jLongValue, (fz.c) ((mz.e) objQ5), null, this.f6206b, sVar, iIntValue & 14);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                x1.p pVar = (x1.p) this.f6208d;
                jt.i2 i2Var = (jt.i2) this.f6209e;
                fz.c cVar = (fz.c) this.f6210f;
                HashMap map = (HashMap) this.f6211t;
                x1.s sVar2 = (x1.s) this.H;
                l1.b1 b1Var3 = (l1.b1) this.f6207c;
                j0.u0 FlowRow = (j0.u0) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(FlowRow, "$this$FlowRow");
                l1.s sVar3 = (l1.s) nVar2;
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ListIterator listIterator = pVar.listIterator();
                    int i12 = 0;
                    while (true) {
                        sy.a aVar4 = (sy.a) listIterator;
                        if (aVar4.hasNext()) {
                            Object next = aVar4.next();
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                ns.o.V();
                                throw null;
                            }
                            CourseWord courseWord2 = (CourseWord) next;
                            l1.k1 k1Var = i2Var.f36976a;
                            jt.h2 h2Var = (jt.h2) k1Var.getValue();
                            if (kotlin.jvm.internal.m.a(h2Var != null ? h2Var.f36962a : null, courseWord2)) {
                                sVar3.d0(108233558);
                                courseWord = null;
                                j11 = ((h1.s1) sVar3.j(h1.v1.f31180a)).A;
                                sVar3.p(false);
                            } else {
                                courseWord = null;
                                sVar3.d0(108337780);
                                int i14 = d5.f5317a[courseWord2.getSelectedState().ordinal()];
                                if (i14 == 1) {
                                    sVar3.d0(-1104879449);
                                    jX = ob.f.x((h1.s1) sVar3.j(h1.v1.f31180a), sVar3);
                                    sVar3.p(false);
                                } else if (i14 != 2) {
                                    sVar3.d0(-1104873158);
                                    jX = ((h1.s1) sVar3.j(h1.v1.f31180a)).f31033p;
                                    sVar3.p(false);
                                } else {
                                    sVar3.d0(-1104875867);
                                    jX = ob.f.z((h1.s1) sVar3.j(h1.v1.f31180a), sVar3);
                                    sVar3.p(false);
                                }
                                j11 = jX;
                                sVar3.p(false);
                            }
                            jt.h2 h2Var2 = (jt.h2) k1Var.getValue();
                            if (kotlin.jvm.internal.m.a(h2Var2 != null ? h2Var2.f36962a : courseWord, courseWord2)) {
                                sVar3.d0(108827270);
                                sVar3.p(false);
                                j12 = g2.x.f28621h;
                                listIterator = listIterator;
                                i2Var = i2Var;
                            } else {
                                sVar3.d0(108916302);
                                int i15 = d5.f5317a[courseWord2.getSelectedState().ordinal()];
                                if (i15 == 1) {
                                    sVar3.d0(-1104860791);
                                    jT = ob.f.t((h1.s1) sVar3.j(h1.v1.f31180a), sVar3);
                                    sVar3.p(false);
                                } else if (i15 != 2) {
                                    sVar3.d0(-1104854372);
                                    jT = ((h1.s1) sVar3.j(h1.v1.f31180a)).f31034q;
                                    sVar3.p(false);
                                } else {
                                    sVar3.d0(-1104857145);
                                    jT = ob.f.u((h1.s1) sVar3.j(h1.v1.f31180a), sVar3);
                                    sVar3.p(false);
                                }
                                j12 = jT;
                                sVar3.p(false);
                            }
                            long j13 = j12;
                            jt.h2 h2Var3 = (jt.h2) k1Var.getValue();
                            if (kotlin.jvm.internal.m.a(h2Var3 != null ? h2Var3.f36962a : courseWord, courseWord2)) {
                                f5 = 0;
                                i11 = 2;
                            } else {
                                i11 = 2;
                                f5 = 2;
                            }
                            int i16 = d5.f5317a[courseWord2.getSelectedState().ordinal()];
                            if (i16 == 1) {
                                sVar3.d0(-1104837986);
                                jW = ob.f.w((h1.s1) sVar3.j(h1.v1.f31180a), sVar3);
                                sVar3.p(false);
                            } else if (i16 != i11) {
                                sVar3.d0(-1104832262);
                                jW = ((h1.s1) sVar3.j(h1.v1.f31180a)).A;
                                sVar3.p(false);
                            } else {
                                sVar3.d0(-1104834692);
                                jW = ob.f.y((h1.s1) sVar3.j(h1.v1.f31180a), sVar3);
                                sVar3.p(false);
                            }
                            d0.v vVarA = d0.n.a(jW, f5);
                            boolean zF5 = sVar3.f(cVar) | sVar3.h(courseWord2);
                            Object objQ6 = sVar3.Q();
                            l1.g gVar = l1.m.f39353a;
                            if (zF5 || objQ6 == gVar) {
                                objQ6 = new s0(cVar, courseWord2, 7);
                                sVar3.o0(objQ6);
                            }
                            l1.s sVar4 = sVar3;
                            z1.r rVarQ = iu.k.q(6, 6, (fz.a) objQ6, sVar4, z1.o.f58481a, this.f6206b);
                            boolean zH = sVar4.h(map) | sVar4.h(courseWord2);
                            Object objQ7 = sVar4.Q();
                            if (zH || objQ7 == gVar) {
                                objQ7 = new aj.c(map, courseWord2, sVar2, 14);
                                sVar4.o0(objQ7);
                            }
                            h1.k7.d(w2.a0.n(rVarQ, (fz.c) objQ7), null, h1.k7.p(j11, sVar4, 0), null, vVarA, t1.e.d(2036642053, new n2(1, j13, courseWord2, b1Var3), sVar4), sVar4, 196608, 10);
                            listIterator = listIterator;
                            sVar3 = sVar4;
                            i12 = i13;
                            i2Var = i2Var;
                        }
                    }
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
            case 2:
                ht.o oVar2 = (ht.o) this.f6208d;
                l1.b1 b1Var4 = (l1.b1) this.f6207c;
                CourseWord courseWord3 = (CourseWord) this.f6210f;
                l1.i1 i1Var2 = (l1.i1) this.f6211t;
                l1.b1 b1Var5 = (l1.b1) this.f6209e;
                fz.a aVar5 = (fz.a) this.H;
                j0.q CourseTestModelScreen2 = (j0.q) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen2, "$this$CourseTestModelScreen");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((l1.s) nVar3).f(CourseTestModelScreen2) ? 4 : 2;
                }
                boolean z14 = false;
                l1.s sVar5 = (l1.s) nVar3;
                if (sVar5.T(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    if (oVar2.f33762j && ((Boolean) b1Var4.getValue()).booleanValue()) {
                        z14 = true;
                    }
                    Uri videoUri2 = courseWord3.getVideoUri();
                    Long lValueOf2 = Long.valueOf(oVar2.f33756d);
                    long jLongValue2 = i1Var2.getValue().longValue();
                    boolean zF6 = sVar5.f(b1Var5) | sVar5.f(aVar5);
                    Object objQ8 = sVar5.Q();
                    if (zF6 || objQ8 == l1.m.f39353a) {
                        objQ8 = new b3(3, aVar5, b1Var5);
                        sVar5.o0(objQ8);
                    }
                    dt.e.t(CourseTestModelScreen2, z14, videoUri2, lValueOf2, jLongValue2, (fz.c) ((mz.e) objQ8), null, this.f6206b, sVar5, iIntValue3 & 14);
                } else {
                    sVar5.W();
                }
                return qy.b0.f48488a;
            default:
                final kr.a1 a1Var = (kr.a1) this.f6208d;
                final fz.c cVar2 = (fz.c) this.f6207c;
                final fz.c cVar3 = (fz.c) this.f6209e;
                fz.c cVar4 = (fz.c) this.f6210f;
                fz.a aVar6 = (fz.a) this.H;
                final fz.c cVar5 = (fz.c) this.f6211t;
                a0.k0 AnimatedVisibility = (a0.k0) obj;
                l1.n nVar4 = (l1.n) obj2;
                ((Integer) obj3).getClass();
                z1.i iVar = z1.c.M;
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                boolean z15 = a1Var.f38414e;
                CourseSentence courseSentence2 = a1Var.f38410a.f34557a;
                z1.o oVar3 = z1.o.f58481a;
                if (z15) {
                    l1.s sVar6 = (l1.s) nVar4;
                    sVar6.d0(947314437);
                    z1.r rVarG = j0.e2.g(j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 32, CropImageView.DEFAULT_ASPECT_RATIO, 16, 5), 82);
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, iVar, sVar6, 48);
                    int iHashCode3 = Long.hashCode(sVar6.T);
                    l1.q1 q1VarL = sVar6.l();
                    z1.r rVarC = z1.a.c(sVar6, rVarG);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar2);
                    } else {
                        sVar6.r0();
                    }
                    y2.h hVar4 = y2.j.f56917f;
                    l1.t.J(hVar4, a2VarA, sVar6);
                    y2.h hVar5 = y2.j.f56916e;
                    l1.t.J(hVar5, q1VarL, sVar6);
                    y2.h hVar6 = y2.j.f56918g;
                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar6, iHashCode3, hVar6);
                    }
                    y2.h hVar7 = y2.j.f56915d;
                    l1.t.J(hVar7, rVarC, sVar6);
                    z1.r rVarY = j0.c.y(j0.e2.p(oVar3, 42, 24), -8, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode4 = Long.hashCode(sVar6.T);
                    l1.q1 q1VarL2 = sVar6.l();
                    z1.r rVarC2 = z1.a.c(sVar6, rVarY);
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar2);
                    } else {
                        sVar6.r0();
                    }
                    l1.t.J(hVar4, q0VarD, sVar6);
                    l1.t.J(hVar5, q1VarL2, sVar6);
                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar6, iHashCode4, hVar6);
                    }
                    l1.t.J(hVar7, rVarC2, sVar6);
                    tv.a.d(0, 1, sVar6, null);
                    sVar6.p(true);
                    ua.b(ub.a.e0(sVar6, R.string.grading_your_recording_now), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar6.j(ua.f31167a), g2.f0.e(4287861394L), 0L, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777210), sVar6, 0, 0, 65534);
                    sVar6.p(true);
                    sVar6.p(false);
                } else {
                    l1.s sVar7 = (l1.s) nVar4;
                    sVar7.d0(948235385);
                    j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, iVar, sVar7, 48);
                    int iHashCode5 = Long.hashCode(sVar7.T);
                    l1.q1 q1VarL3 = sVar7.l();
                    z1.r rVarC3 = z1.a.c(sVar7, oVar3);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar7.h0();
                    if (sVar7.S) {
                        sVar7.k(iVar3);
                    } else {
                        sVar7.r0();
                    }
                    y2.h hVar8 = y2.j.f56917f;
                    l1.t.J(hVar8, a2VarA2, sVar7);
                    y2.h hVar9 = y2.j.f56916e;
                    l1.t.J(hVar9, q1VarL3, sVar7);
                    y2.h hVar10 = y2.j.f56918g;
                    if (sVar7.S) {
                        aVar = aVar6;
                    } else {
                        aVar = aVar6;
                        if (!kotlin.jvm.internal.m.a(sVar7.Q(), Integer.valueOf(iHashCode5))) {
                        }
                        hVar = y2.j.f56915d;
                        l1.t.J(hVar, rVarC3, sVar7);
                        float f13 = 62;
                        j0.o.a(j0.e2.n(oVar3, f13), sVar7, 6);
                        float f14 = 16;
                        f11 = f13;
                        hVar2 = hVar10;
                        z1.r rVarE = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 32, CropImageView.DEFAULT_ASPECT_RATIO, f14, 5);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        z1.r rVarP = w4.c.p(1.0f, true, rVarE);
                        j0.a2 a2VarA3 = j0.z1.a(j0.i.f35309g, iVar, sVar7, 54);
                        iHashCode = Long.hashCode(sVar7.T);
                        l1.q1 q1VarL4 = sVar7.l();
                        z1.r rVarC4 = z1.a.c(sVar7, rVarP);
                        sVar7.h0();
                        if (sVar7.S) {
                            sVar7.k(iVar3);
                        } else {
                            sVar7.r0();
                        }
                        l1.t.J(hVar8, a2VarA3, sVar7);
                        l1.t.J(hVar9, q1VarL4, sVar7);
                        if (sVar7.S || !kotlin.jvm.internal.m.a(sVar7.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar7, iHashCode, hVar2);
                        }
                        l1.t.J(hVar, rVarC4, sVar7);
                        f12 = 52;
                        z1.r rVarN = j0.e2.n(oVar3, f12);
                        float f15 = 8;
                        boolean z16 = a1Var.f38411b;
                        zF = sVar7.f(cVar2) | sVar7.h(a1Var);
                        hVar3 = hVar9;
                        objQ = sVar7.Q();
                        Object obj4 = l1.m.f39353a;
                        if (zF || objQ == obj4) {
                            final int i17 = 0;
                            objQ = new fz.a() { // from class: jr.e0
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i17) {
                                        case 0:
                                            cVar2.invoke(a1Var);
                                            break;
                                        case 1:
                                            cVar2.invoke(a1Var);
                                            break;
                                        default:
                                            cVar2.invoke(a1Var);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar7.o0(objQ);
                        }
                        dt.a0.f(rVarN, f15, z16, (fz.a) objQ, sVar7, 54, 0);
                        if (a1Var.f38412c) {
                            sVar7.d0(87357913);
                            z1.r rVarN2 = j0.e2.n(oVar3, 72);
                            zF3 = sVar7.f(cVar3) | sVar7.h(a1Var);
                            objQ4 = sVar7.Q();
                            if (zF3 || objQ4 == obj4) {
                                final int i18 = 1;
                                objQ4 = new fz.a() { // from class: jr.e0
                                    @Override // fz.a
                                    public final Object invoke() {
                                        switch (i18) {
                                            case 0:
                                                cVar3.invoke(a1Var);
                                                break;
                                            case 1:
                                                cVar3.invoke(a1Var);
                                                break;
                                            default:
                                                cVar3.invoke(a1Var);
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar7.o0(objQ4);
                            }
                            dt.a0.k(rVarN2, CropImageView.DEFAULT_ASPECT_RATIO, (fz.a) objQ4, sVar7, 6);
                            sVar7.p(false);
                            hVar2 = hVar2;
                            hVar = hVar;
                            f11 = f11;
                            hVar3 = hVar3;
                            r9 = 0;
                        } else {
                            sVar7.d0(87585918);
                            z1.r rVarN3 = j0.e2.n(oVar3, 72);
                            z11 = this.f6206b;
                            aVar2 = aVar;
                            zG = sVar7.g(z11) | sVar7.f(cVar4) | sVar7.h(a1Var) | sVar7.f(aVar2);
                            objQ2 = sVar7.Q();
                            if (!zG || objQ2 == obj4) {
                                z12 = false;
                                objQ2 = new e4(2, cVar4, a1Var, aVar2, z11);
                                sVar7.o0(objQ2);
                            } else {
                                z12 = false;
                            }
                            dt.a0.j(6, 2, (fz.a) objQ2, sVar7, rVarN3, false);
                            sVar7.p(z12);
                            r9 = z12;
                        }
                        if (a1Var.f38415f) {
                            sVar7.d0(88053367);
                            z1.r rVarN4 = j0.e2.n(oVar3, f12);
                            boolean z17 = a1Var.f38413d;
                            zF2 = sVar7.f(cVar5) | sVar7.h(a1Var);
                            objQ3 = sVar7.Q();
                            if (zF2 || objQ3 == obj4) {
                                final int i19 = 2;
                                objQ3 = new fz.a() { // from class: jr.e0
                                    @Override // fz.a
                                    public final Object invoke() {
                                        switch (i19) {
                                            case 0:
                                                cVar5.invoke(a1Var);
                                                break;
                                            case 1:
                                                cVar5.invoke(a1Var);
                                                break;
                                            default:
                                                cVar5.invoke(a1Var);
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar7.o0(objQ3);
                            }
                            dt.a0.i(6, (fz.a) objQ3, sVar7, rVarN4, z17);
                            sVar7.p(r9);
                        } else {
                            sVar7.d0(88428126);
                            dt.a0.s(j0.e2.n(oVar3, f12), sVar7, 6);
                            sVar7.p(r9);
                        }
                        sVar7.p(true);
                        z1.r rVarE2 = j0.c.E(j0.e2.n(oVar3, f11), CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                        w2.q0 q0VarD2 = j0.o.d(z1.c.f58467e, r9);
                        iHashCode2 = Long.hashCode(sVar7.T);
                        l1.q1 q1VarL5 = sVar7.l();
                        z1.r rVarC5 = z1.a.c(sVar7, rVarE2);
                        sVar7.h0();
                        if (sVar7.S) {
                            sVar7.k(iVar3);
                        } else {
                            sVar7.r0();
                        }
                        l1.t.J(hVar8, q0VarD2, sVar7);
                        l1.t.J(hVar3, q1VarL5, sVar7);
                        if (sVar7.S || !kotlin.jvm.internal.m.a(sVar7.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar7, iHashCode2, hVar2);
                        }
                        l1.t.J(hVar, rVarC5, sVar7);
                        if (courseSentence2.getSpeechScore() == -1.0f) {
                            sVar7.d0(-909143316);
                        } else {
                            sVar7.d0(-888072213);
                            jr.a.k(courseSentence2.getSpeechScore(), sVar7, r9);
                        }
                        sVar7.p(r9);
                        com.google.android.material.datepicker.d.B(sVar7, true, true, r9);
                    }
                    defpackage.e.A(iHashCode5, sVar7, iHashCode5, hVar10);
                    hVar = y2.j.f56915d;
                    l1.t.J(hVar, rVarC3, sVar7);
                    float f16 = 62;
                    j0.o.a(j0.e2.n(oVar3, f16), sVar7, 6);
                    float f17 = 16;
                    f11 = f16;
                    hVar2 = hVar10;
                    z1.r rVarE3 = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 32, CropImageView.DEFAULT_ASPECT_RATIO, f17, 5);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    z1.r rVarP2 = w4.c.p(1.0f, true, rVarE3);
                    j0.a2 a2VarA4 = j0.z1.a(j0.i.f35309g, iVar, sVar7, 54);
                    iHashCode = Long.hashCode(sVar7.T);
                    l1.q1 q1VarL6 = sVar7.l();
                    z1.r rVarC6 = z1.a.c(sVar7, rVarP2);
                    sVar7.h0();
                    if (sVar7.S) {
                        sVar7.k(iVar3);
                    } else {
                        sVar7.r0();
                    }
                    l1.t.J(hVar8, a2VarA4, sVar7);
                    l1.t.J(hVar9, q1VarL6, sVar7);
                    if (sVar7.S) {
                        defpackage.e.A(iHashCode, sVar7, iHashCode, hVar2);
                    } else {
                        defpackage.e.A(iHashCode, sVar7, iHashCode, hVar2);
                    }
                    l1.t.J(hVar, rVarC6, sVar7);
                    f12 = 52;
                    z1.r rVarN5 = j0.e2.n(oVar3, f12);
                    float f18 = 8;
                    boolean z18 = a1Var.f38411b;
                    zF = sVar7.f(cVar2) | sVar7.h(a1Var);
                    hVar3 = hVar9;
                    objQ = sVar7.Q();
                    Object obj5 = l1.m.f39353a;
                    if (zF) {
                        final int i110 = 0;
                        objQ = new fz.a() { // from class: jr.e0
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i110) {
                                    case 0:
                                        cVar2.invoke(a1Var);
                                        break;
                                    case 1:
                                        cVar2.invoke(a1Var);
                                        break;
                                    default:
                                        cVar2.invoke(a1Var);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar7.o0(objQ);
                    } else {
                        final int i111 = 0;
                        objQ = new fz.a() { // from class: jr.e0
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i111) {
                                    case 0:
                                        cVar2.invoke(a1Var);
                                        break;
                                    case 1:
                                        cVar2.invoke(a1Var);
                                        break;
                                    default:
                                        cVar2.invoke(a1Var);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar7.o0(objQ);
                    }
                    dt.a0.f(rVarN5, f18, z18, (fz.a) objQ, sVar7, 54, 0);
                    if (a1Var.f38412c) {
                        sVar7.d0(87357913);
                        z1.r rVarN6 = j0.e2.n(oVar3, 72);
                        zF3 = sVar7.f(cVar3) | sVar7.h(a1Var);
                        objQ4 = sVar7.Q();
                        if (zF3) {
                            final int i112 = 1;
                            objQ4 = new fz.a() { // from class: jr.e0
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i112) {
                                        case 0:
                                            cVar3.invoke(a1Var);
                                            break;
                                        case 1:
                                            cVar3.invoke(a1Var);
                                            break;
                                        default:
                                            cVar3.invoke(a1Var);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar7.o0(objQ4);
                        } else {
                            final int i113 = 1;
                            objQ4 = new fz.a() { // from class: jr.e0
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i113) {
                                        case 0:
                                            cVar3.invoke(a1Var);
                                            break;
                                        case 1:
                                            cVar3.invoke(a1Var);
                                            break;
                                        default:
                                            cVar3.invoke(a1Var);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar7.o0(objQ4);
                        }
                        dt.a0.k(rVarN6, CropImageView.DEFAULT_ASPECT_RATIO, (fz.a) objQ4, sVar7, 6);
                        sVar7.p(false);
                        hVar2 = hVar2;
                        hVar = hVar;
                        f11 = f11;
                        hVar3 = hVar3;
                        r9 = 0;
                    } else {
                        sVar7.d0(87585918);
                        z1.r rVarN7 = j0.e2.n(oVar3, 72);
                        z11 = this.f6206b;
                        aVar2 = aVar;
                        zG = sVar7.g(z11) | sVar7.f(cVar4) | sVar7.h(a1Var) | sVar7.f(aVar2);
                        objQ2 = sVar7.Q();
                        if (zG) {
                            z12 = false;
                            objQ2 = new e4(2, cVar4, a1Var, aVar2, z11);
                            sVar7.o0(objQ2);
                        } else {
                            z12 = false;
                            objQ2 = new e4(2, cVar4, a1Var, aVar2, z11);
                            sVar7.o0(objQ2);
                        }
                        dt.a0.j(6, 2, (fz.a) objQ2, sVar7, rVarN7, false);
                        sVar7.p(z12);
                        r9 = z12;
                    }
                    if (a1Var.f38415f) {
                        sVar7.d0(88053367);
                        z1.r rVarN8 = j0.e2.n(oVar3, f12);
                        boolean z19 = a1Var.f38413d;
                        zF2 = sVar7.f(cVar5) | sVar7.h(a1Var);
                        objQ3 = sVar7.Q();
                        if (zF2) {
                            final int i114 = 2;
                            objQ3 = new fz.a() { // from class: jr.e0
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i114) {
                                        case 0:
                                            cVar5.invoke(a1Var);
                                            break;
                                        case 1:
                                            cVar5.invoke(a1Var);
                                            break;
                                        default:
                                            cVar5.invoke(a1Var);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar7.o0(objQ3);
                        } else {
                            final int i115 = 2;
                            objQ3 = new fz.a() { // from class: jr.e0
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i115) {
                                        case 0:
                                            cVar5.invoke(a1Var);
                                            break;
                                        case 1:
                                            cVar5.invoke(a1Var);
                                            break;
                                        default:
                                            cVar5.invoke(a1Var);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar7.o0(objQ3);
                        }
                        dt.a0.i(6, (fz.a) objQ3, sVar7, rVarN8, z19);
                        sVar7.p(r9);
                    } else {
                        sVar7.d0(88428126);
                        dt.a0.s(j0.e2.n(oVar3, f12), sVar7, 6);
                        sVar7.p(r9);
                    }
                    sVar7.p(true);
                    z1.r rVarE4 = j0.c.E(j0.e2.n(oVar3, f11), CropImageView.DEFAULT_ASPECT_RATIO, f17, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                    w2.q0 q0VarD3 = j0.o.d(z1.c.f58467e, r9);
                    iHashCode2 = Long.hashCode(sVar7.T);
                    l1.q1 q1VarL7 = sVar7.l();
                    z1.r rVarC7 = z1.a.c(sVar7, rVarE4);
                    sVar7.h0();
                    if (sVar7.S) {
                        sVar7.k(iVar3);
                    } else {
                        sVar7.r0();
                    }
                    l1.t.J(hVar8, q0VarD3, sVar7);
                    l1.t.J(hVar3, q1VarL7, sVar7);
                    if (sVar7.S) {
                        defpackage.e.A(iHashCode2, sVar7, iHashCode2, hVar2);
                    } else {
                        defpackage.e.A(iHashCode2, sVar7, iHashCode2, hVar2);
                    }
                    l1.t.J(hVar, rVarC7, sVar7);
                    if (courseSentence2.getSpeechScore() == -1.0f) {
                        sVar7.d0(-909143316);
                    } else {
                        sVar7.d0(-888072213);
                        jr.a.k(courseSentence2.getSpeechScore(), sVar7, r9);
                    }
                    sVar7.p(r9);
                    com.google.android.material.datepicker.d.B(sVar7, true, true, r9);
                }
                return qy.b0.f48488a;
        }
    }

    public /* synthetic */ y1(kr.a1 a1Var, fz.c cVar, fz.c cVar2, boolean z11, fz.c cVar3, fz.a aVar, fz.c cVar4) {
        this.f6205a = 3;
        this.f6208d = a1Var;
        this.f6207c = cVar;
        this.f6209e = cVar2;
        this.f6206b = z11;
        this.f6210f = cVar3;
        this.H = aVar;
        this.f6211t = cVar4;
    }

    public /* synthetic */ y1(x1.p pVar, jt.i2 i2Var, boolean z11, fz.c cVar, HashMap map, x1.s sVar, l1.b1 b1Var) {
        this.f6205a = 1;
        this.f6208d = pVar;
        this.f6209e = i2Var;
        this.f6206b = z11;
        this.f6210f = cVar;
        this.f6211t = map;
        this.H = sVar;
        this.f6207c = b1Var;
    }
}
