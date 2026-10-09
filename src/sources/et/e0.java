package et;

import b0.x0;
import bt.x2;
import com.lingodeer.R;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseUiState;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.SentenceMFType;
import com.yalantis.ucrop.view.CropImageView;
import d1.e1;
import e6.q0;
import fr.j3;
import g2.f0;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.z1;
import j3.y0;
import java.util.List;
import jr.k0;
import kotlin.NoWhenBranchMatchedException;
import l1.a1;
import l1.b1;
import l1.b3;
import l1.c3;
import l1.h1;
import l1.q1;
import mt.l5;
import rt.b5;
import rt.t4;
import rt.x4;
import w2.w0;
import ys.a3;
import ys.w2;
import ys.y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f25863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25867f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f25868t;

    public /* synthetic */ e0(List list, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f25862a = i11;
        this.f25863b = list;
        this.f25864c = obj;
        this.f25865d = obj2;
        this.f25866e = obj3;
        this.f25867f = obj4;
        this.f25868t = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:96:0x03d0  */
    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        List<CourseWord> displayCourseWords;
        int i12;
        Object obj5;
        o oVar;
        Object x2Var;
        l1.g gVar;
        int i13;
        List<CourseWord> list;
        boolean z11;
        boolean z12;
        int i14;
        Integer num;
        int i15;
        CourseUiState.Success success;
        boolean z13;
        boolean z14;
        boolean z15;
        z1.r rVarP;
        switch (this.f25862a) {
            case 0:
                l0.c cVar = (l0.c) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.n nVar = (l1.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                CoursePracticeType coursePracticeType = (CoursePracticeType) this.f25864c;
                l0.w wVar = (l0.w) this.f25867f;
                rz.b0 b0Var = (rz.b0) this.f25866e;
                jt.v vVar = (jt.v) this.f25865d;
                if ((iIntValue2 & 6) == 0) {
                    i11 = (((l1.s) nVar).f(cVar) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((l1.s) nVar).d(iIntValue) ? 32 : 16;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(i11 & 1, (i11 & 147) != 146)) {
                    o oVar2 = (o) this.f25863b.get(iIntValue);
                    sVar.d0(145387413);
                    if (coursePracticeType == CoursePracticeType.COURSE_DIALOG_SPEAKING) {
                        displayCourseWords = oVar2.a().getSpeechDisplayCourseWords();
                    } else if (oVar2 instanceof h) {
                        displayCourseWords = ((h) oVar2).f25881a.getDisplayCourseWords();
                    } else if (oVar2 instanceof k) {
                        displayCourseWords = ((k) oVar2).f25887b;
                    } else if (oVar2 instanceof i) {
                        displayCourseWords = ((i) oVar2).f25883b.f45762b;
                    } else if (oVar2 instanceof j) {
                        displayCourseWords = ((j) oVar2).f25885b.f45803b;
                    } else if (oVar2 instanceof l) {
                        displayCourseWords = ((l) oVar2).f25890b.f45880c;
                    } else if (oVar2 instanceof m) {
                        displayCourseWords = ((m) oVar2).f25892b;
                    } else {
                        if (!(oVar2 instanceof n)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        displayCourseWords = ((n) oVar2).f25894a.getDisplayCourseWords();
                    }
                    List<CourseWord> list2 = displayCourseWords;
                    Object objQ = sVar.Q();
                    l1.g gVar2 = l1.m.f39353a;
                    if (objQ == gVar2) {
                        objQ = defpackage.e.v(list2.size() - 1, sVar);
                    }
                    a1 a1Var = (a1) objQ;
                    b1 b1Var = vVar.f37219j;
                    b1 b1Var2 = vVar.f37222n;
                    Object value = b1Var.getValue();
                    int i16 = (i11 & 112) ^ 48;
                    boolean zD = sVar.d(coursePracticeType.ordinal()) | sVar.h(vVar) | sVar.h(oVar2) | ((i16 > 32 && sVar.d(iIntValue)) || (i11 & 48) == 32) | sVar.h(b0Var) | sVar.f(wVar);
                    Object objQ2 = sVar.Q();
                    if (zD || objQ2 == gVar2) {
                        i12 = i16;
                        obj5 = value;
                        x0 x0Var = new x0(vVar, oVar2, (CoursePracticeType) this.f25864c, iIntValue, (rz.b0) this.f25866e, (l0.w) this.f25867f, (vy.d) null);
                        oVar = oVar2;
                        vVar = vVar;
                        iIntValue = iIntValue;
                        sVar.o0(x0Var);
                        objQ2 = x0Var;
                    } else {
                        obj5 = value;
                        i12 = i16;
                        oVar = oVar2;
                    }
                    l1.t.f((fz.e) objQ2, obj5, sVar);
                    sVar.d0(1667361442);
                    CourseSentence courseSentenceA = oVar.a();
                    if (courseSentenceA.getSentenceMFType() == SentenceMFType.NORMAL) {
                        sVar.d0(-807307610);
                        ua.b(oz.q.i1(courseSentenceA.getSentence()).toString(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131070);
                        Object value2 = b1Var2.getValue();
                        boolean zH = sVar.h(vVar) | ((i12 > 32 && sVar.d(iIntValue)) || (i11 & 48) == 32) | sVar.h(b0Var) | sVar.f(wVar);
                        Object objQ3 = sVar.Q();
                        if (zH || objQ3 == gVar2) {
                            a0.e0 e0Var = new a0.e0(iIntValue, vVar, (rz.b0) this.f25866e, (l0.w) this.f25867f, (vy.d) null);
                            sVar.o0(e0Var);
                            objQ3 = e0Var;
                        }
                        l1.t.f((fz.e) objQ3, value2, sVar);
                        z12 = false;
                        sVar.p(false);
                    } else {
                        sVar.d0(-805957281);
                        Object value3 = b1Var2.getValue();
                        boolean zH2 = sVar.h(vVar) | ((i12 > 32 && sVar.d(iIntValue)) || (i11 & 48) == 32) | sVar.h(courseSentenceA);
                        Object objQ4 = sVar.Q();
                        if (zH2 || objQ4 == gVar2) {
                            jt.v vVar2 = vVar;
                            int i17 = iIntValue;
                            q0 q0Var = new q0(vVar2, i17, courseSentenceA, null, 5);
                            vVar = vVar2;
                            iIntValue = i17;
                            sVar.o0(q0Var);
                            objQ4 = q0Var;
                        }
                        l1.t.f((fz.e) objQ4, value3, sVar);
                        boolean z16 = ((Number) vVar.f37223o.getValue()).intValue() == iIntValue;
                        boolean z17 = ((Number) vVar.f37224p.getValue()).intValue() == iIntValue;
                        Boolean boolValueOf = Boolean.valueOf(z16);
                        boolean zH3 = sVar.h(b0Var) | sVar.g(z16) | sVar.h(vVar) | sVar.h(list2);
                        Object objQ5 = sVar.Q();
                        if (zH3 || objQ5 == gVar2) {
                            boolean z18 = z16;
                            gVar = gVar2;
                            i13 = 0;
                            x2Var = new x2(2, (rz.b0) this.f25866e, vVar, list2, a1Var, (vy.d) null, z18);
                            list = list2;
                            z11 = z18;
                            sVar.o0(x2Var);
                        } else {
                            list = list2;
                            z11 = z16;
                            gVar = gVar2;
                            x2Var = objQ5;
                            i13 = 0;
                        }
                        l1.t.f((fz.e) x2Var, boolValueOf, sVar);
                        j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, i13);
                        int iHashCode = Long.hashCode(sVar.T);
                        q1 q1VarL = sVar.l();
                        z1.o oVar3 = z1.o.f58481a;
                        z1.r rVarC = z1.a.c(sVar, oVar3);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, uVarA, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar);
                        y2.h hVar = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, sVar);
                        boolean zBooleanValue = ((Boolean) ((b3) this.f25868t).getValue()).booleanValue();
                        int iL = ((h1) a1Var).l();
                        boolean zH4 = sVar.h(vVar) | ((i12 > 32 && sVar.d(iIntValue)) || (i11 & 48) == 32);
                        Object objQ6 = sVar.Q();
                        if (zH4 || objQ6 == gVar) {
                            objQ6 = new d0(vVar, iIntValue, 0);
                            sVar.o0(objQ6);
                        }
                        fz.e eVar = (fz.e) objQ6;
                        boolean zH5 = sVar.h(vVar) | ((i12 > 32 && sVar.d(iIntValue)) || (i11 & 48) == 32);
                        Object objQ7 = sVar.Q();
                        if (zH5 || objQ7 == gVar) {
                            objQ7 = new d0(vVar, iIntValue, 1);
                            sVar.o0(objQ7);
                        }
                        fz.e eVar2 = (fz.e) objQ7;
                        boolean zH6 = sVar.h(vVar);
                        Object objQ8 = sVar.Q();
                        if (zH6 || objQ8 == gVar) {
                            objQ8 = new av.t(vVar, 2);
                            sVar.o0(objQ8);
                        }
                        fz.c cVar2 = (fz.c) objQ8;
                        boolean zH7 = sVar.h(b0Var) | sVar.f(wVar) | ((i12 > 32 && sVar.d(iIntValue)) || (i11 & 48) == 32);
                        Object objQ9 = sVar.Q();
                        if (zH7 || objQ9 == gVar) {
                            objQ9 = new k0(iIntValue, wVar, b0Var);
                            sVar.o0(objQ9);
                        }
                        a.a(courseSentenceA, list, z11, z17, zBooleanValue, iL, eVar, eVar2, cVar2, (fz.a) objQ9, sVar, 0);
                        if ((oVar instanceof n) && coursePracticeType == CoursePracticeType.COURSE_DIALOG_PRACTICE) {
                            sVar.d0(1265100704);
                            k7.d(j0.c.C(e2.e(oVar3, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 8, 1), null, k7.p(f0.e(4294243320L), sVar, 6), null, null, t1.e.d(-240004649, new e1(oVar, 1), sVar), sVar, 196614, 26);
                            z12 = false;
                        } else {
                            z12 = false;
                            sVar.d0(1249209112);
                        }
                        sVar.p(z12);
                        sVar.p(true);
                        sVar.p(z12);
                    }
                    sVar.p(z12);
                    sVar.p(z12);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                l0.c cVar3 = (l0.c) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.n nVar2 = (l1.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                fz.c cVar4 = (fz.c) this.f25866e;
                b1 b1Var3 = (b1) this.f25867f;
                b5 b5Var = (b5) this.f25864c;
                if ((iIntValue4 & 6) == 0) {
                    i14 = (((l1.s) nVar2).f(cVar3) ? 4 : 2) | iIntValue4;
                } else {
                    i14 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i14 |= ((l1.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                boolean z19 = true;
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(i14 & 1, (i14 & 147) != 146)) {
                    t4 t4Var = (t4) this.f25863b.get(iIntValue3);
                    sVar2.d0(-427394201);
                    boolean z20 = iIntValue3 == b5Var.f49514g;
                    Integer num2 = (Integer) b1Var3.getValue();
                    boolean z21 = num2 != null && num2.intValue() == iIntValue3 && ((num = (Integer) this.f25865d) == null || iIntValue3 != num.intValue());
                    int i18 = b5Var.f49508a;
                    x4 x4Var = b5Var.f49512e;
                    boolean zF = sVar2.f(cVar4);
                    if ((((i14 & 112) ^ 48) <= 32 || !sVar2.d(iIntValue3)) && (i14 & 48) != 32) {
                        z19 = false;
                    }
                    boolean z22 = zF | z19;
                    Object objQ10 = sVar2.Q();
                    l1.g gVar3 = l1.m.f39353a;
                    if (z22 || objQ10 == gVar3) {
                        objQ10 = new k0(cVar4, iIntValue3, b1Var3, 1);
                        sVar2.o0(objQ10);
                    }
                    fz.a aVar = (fz.a) objQ10;
                    boolean zH8 = sVar2.h(t4Var);
                    Object objQ11 = sVar2.Q();
                    if (zH8 || objQ11 == gVar3) {
                        objQ11 = new av.r(11, (x1.s) this.f25868t, t4Var);
                        sVar2.o0(objQ11);
                    }
                    l5.g(i18, t4Var, z20, z21, x4Var, aVar, w2.a0.o(z1.o.f58481a, (fz.c) objQ11), sVar2, 0);
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            default:
                l0.c cVar5 = (l0.c) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                l1.n nVar3 = (l1.n) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                fz.a aVar2 = (fz.a) this.f25868t;
                z1.j jVar = z1.c.f58465c;
                fz.a aVar3 = (fz.a) this.f25867f;
                CourseUiState.Success success2 = (CourseUiState.Success) this.f25865d;
                if ((iIntValue6 & 6) == 0) {
                    i15 = (((l1.s) nVar3).f(cVar5) ? 4 : 2) | iIntValue6;
                } else {
                    i15 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i15 |= ((l1.s) nVar3).d(iIntValue5) ? 32 : 16;
                }
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(i15 & 1, (i15 & 147) != 146)) {
                    CourseUnit courseUnit = (CourseUnit) this.f25863b.get(iIntValue5);
                    sVar3.d0(100110261);
                    if (courseUnit.isTestOut()) {
                        sVar3.d0(99985919);
                        a3.e(courseUnit, (fz.c) this.f25864c, sVar3, 0);
                        sVar3.p(false);
                        z15 = false;
                    } else {
                        sVar3.d0(100259215);
                        z1.j jVar2 = z1.c.f58463a;
                        w2.q0 q0VarD = j0.o.d(jVar2, false);
                        int iHashCode2 = Long.hashCode(sVar3.T);
                        q1 q1VarL2 = sVar3.l();
                        z1.o oVar4 = z1.o.f58481a;
                        z1.r rVarC2 = z1.a.c(sVar3, oVar4);
                        y2.k.J.getClass();
                        y2.i iVar2 = y2.j.f56913b;
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar2);
                        } else {
                            sVar3.r0();
                        }
                        y2.h hVar2 = y2.j.f56917f;
                        l1.t.J(hVar2, q0VarD, sVar3);
                        y2.h hVar3 = y2.j.f56916e;
                        l1.t.J(hVar3, q1VarL2, sVar3);
                        y2.h hVar4 = y2.j.f56918g;
                        if (sVar3.S) {
                            success = success2;
                        } else {
                            success = success2;
                            if (!kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                            }
                            y2.h hVar5 = y2.j.f56915d;
                            l1.t.J(hVar5, rVarC2, sVar3);
                            if (iIntValue5 == success.getCurrentEnterIndex()) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            a3.h(courseUnit, z13, (fz.c) this.f25866e, e2.g(oVar4, a3.f57917a), sVar3, 3072);
                            if (iIntValue5 == 0 || !success.getHasAlphabet()) {
                                z14 = true;
                                z15 = false;
                                sVar3.d0(123331274);
                            } else {
                                sVar3.d0(129931050);
                                c3 c3Var = ju.f.f37370d;
                                boolean zV = xt.d.v(((Number) sVar3.j(c3Var)).intValue());
                                w0 w0Var = w2.i.f54517d;
                                l1.g gVar4 = l1.m.f39353a;
                                j0.r rVar = j0.r.f35391a;
                                if (zV) {
                                    sVar3.d0(129931887);
                                    z1.r rVarE = j0.c.E(rVar.a(oVar4, jVar), CropImageView.DEFAULT_ASPECT_RATIO, 24, 16, CropImageView.DEFAULT_ASPECT_RATIO, 9);
                                    a2 a2VarA = z1.a(j0.i.g(8), z1.c.L, sVar3, 6);
                                    int iHashCode3 = Long.hashCode(sVar3.T);
                                    q1 q1VarL3 = sVar3.l();
                                    z1.r rVarC3 = z1.a.c(sVar3, rVarE);
                                    sVar3.h0();
                                    if (sVar3.S) {
                                        sVar3.k(iVar2);
                                    } else {
                                        sVar3.r0();
                                    }
                                    l1.t.J(hVar2, a2VarA, sVar3);
                                    l1.t.J(hVar3, q1VarL3, sVar3);
                                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                                        defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar4);
                                    }
                                    l1.t.J(hVar5, rVarC3, sVar3);
                                    k2.b bVarY = se.k.y(success.getAlphabetRes(), sVar3, 0);
                                    float f5 = 66;
                                    z1.r rVarP2 = e2.p(oVar4, f5, f5);
                                    boolean zF2 = sVar3.f(aVar3);
                                    Object objQ12 = sVar3.Q();
                                    if (zF2 || objQ12 == gVar4) {
                                        objQ12 = new w2(aVar3);
                                        sVar3.o0(objQ12);
                                    }
                                    d0.n.c(bVarY, null, iu.k.q(6, 7, (fz.a) objQ12, sVar3, rVarP2, false), null, w0Var, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 24624, 104);
                                    z1.r rVarP3 = e2.p(oVar4, f5, f5);
                                    w2.q0 q0VarD2 = j0.o.d(jVar2, false);
                                    int iHashCode4 = Long.hashCode(sVar3.T);
                                    q1 q1VarL4 = sVar3.l();
                                    z1.r rVarC4 = z1.a.c(sVar3, rVarP3);
                                    sVar3.h0();
                                    if (sVar3.S) {
                                        sVar3.k(iVar2);
                                    } else {
                                        sVar3.r0();
                                    }
                                    l1.t.J(hVar2, q0VarD2, sVar3);
                                    l1.t.J(hVar3, q1VarL4, sVar3);
                                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode4))) {
                                        defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar4);
                                    }
                                    l1.t.J(hVar5, rVarC4, sVar3);
                                    k2.b bVarY2 = se.k.y(R.drawable.ic_alphabet_tone, sVar3, 0);
                                    z1.r rVarP4 = e2.p(oVar4, f5, f5);
                                    boolean zF3 = sVar3.f(aVar2);
                                    Object objQ13 = sVar3.Q();
                                    if (zF3 || objQ13 == gVar4) {
                                        objQ13 = new ys.x2(aVar2);
                                        sVar3.o0(objQ13);
                                    }
                                    d0.n.c(bVarY2, null, iu.k.q(6, 7, (fz.a) objQ13, sVar3, rVarP4, false), null, w0Var, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 24624, 104);
                                    sVar3 = sVar3;
                                    z14 = true;
                                    z15 = false;
                                    com.google.android.material.datepicker.d.B(sVar3, true, true, false);
                                } else {
                                    sVar3.d0(131844525);
                                    z1.r rVarS = e2.s(j0.c.E(rVar.a(oVar4, jVar), CropImageView.DEFAULT_ASPECT_RATIO, 24, 32, CropImageView.DEFAULT_ASPECT_RATIO, 9), 92);
                                    boolean zF4 = sVar3.f(aVar3);
                                    Object objQ14 = sVar3.Q();
                                    if (zF4 || objQ14 == gVar4) {
                                        objQ14 = new y2(aVar3);
                                        sVar3.o0(objQ14);
                                    }
                                    z1.r rVarQ = iu.k.q(0, 7, (fz.a) objQ14, sVar3, rVarS, false);
                                    j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar3, 48);
                                    int iHashCode5 = Long.hashCode(sVar3.T);
                                    q1 q1VarL5 = sVar3.l();
                                    z1.r rVarC5 = z1.a.c(sVar3, rVarQ);
                                    sVar3.h0();
                                    if (sVar3.S) {
                                        sVar3.k(iVar2);
                                    } else {
                                        sVar3.r0();
                                    }
                                    l1.t.J(hVar2, uVarA2, sVar3);
                                    l1.t.J(hVar3, q1VarL5, sVar3);
                                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode5))) {
                                        defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar4);
                                    }
                                    l1.t.J(hVar5, rVarC5, sVar3);
                                    k2.b bVarY3 = se.k.y(success.getAlphabetRes(), sVar3, 0);
                                    if (xt.d.u(((Number) sVar3.j(c3Var)).intValue())) {
                                        float f11 = 56;
                                        rVarP = e2.p(oVar4, f11, f11);
                                    } else {
                                        rVarP = e2.p(oVar4, 72, 48);
                                    }
                                    d0.n.c(bVarY3, null, rVarP, null, w0Var, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 24624, 104);
                                    iu.k.c(ub.a.e0(sVar3, R.string.alphabet), j0.c.E(oVar4, CropImageView.DEFAULT_ASPECT_RATIO, 2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), y0.a((y0) sVar3.j(ua.f31167a), ((s1) sVar3.j(v1.f31180a)).f31017a, 0L, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777210), 0, false, 1, 0, new s0.g(j3.A(10), j3.A(14), j3.z(0.25d)), sVar3, 1572912, 184);
                                    z14 = true;
                                    sVar3.p(true);
                                    z15 = false;
                                    sVar3.p(false);
                                }
                            }
                            sVar3.p(z15);
                            sVar3.p(z14);
                            sVar3.p(z15);
                        }
                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar4);
                        y2.h hVar6 = y2.j.f56915d;
                        l1.t.J(hVar6, rVarC2, sVar3);
                        if (iIntValue5 == success.getCurrentEnterIndex()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        a3.h(courseUnit, z13, (fz.c) this.f25866e, e2.g(oVar4, a3.f57917a), sVar3, 3072);
                        if (iIntValue5 == 0) {
                            z14 = true;
                            z15 = false;
                            sVar3.d0(123331274);
                        } else {
                            z14 = true;
                            z15 = false;
                            sVar3.d0(123331274);
                        }
                        sVar3.p(z15);
                        sVar3.p(z14);
                        sVar3.p(z15);
                    }
                    sVar3.p(z15);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
        }
    }
}
