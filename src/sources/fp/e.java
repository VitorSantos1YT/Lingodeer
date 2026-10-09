package fp;

import androidx.lifecycle.ViewModel;
import at.p;
import av.f0;
import b0.a2;
import b0.f1;
import bp.z1;
import com.google.api.Service;
import com.lingo.lingoskill.malskill.ui.learn.MALSyllableIntroductionActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseACK;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.DayStreakFinishedStatus;
import com.lingodeer.data.model.DayStreakWeeklyItemStatus;
import com.yalantis.ucrop.view.CropImageView;
import fu.e0;
import h1.dc;
import h1.e1;
import h1.fc;
import h1.k7;
import h1.r9;
import h1.s1;
import h1.ua;
import h1.v1;
import iu.k;
import iv.z0;
import j0.e2;
import j0.i;
import j0.i1;
import j0.u;
import j3.y0;
import j9.v;
import java.util.ArrayList;
import java.util.List;
import jr.z;
import kt.l;
import kv.h0;
import kv.i0;
import kv.j0;
import kv.s0;
import l1.a1;
import l1.b1;
import l1.c3;
import l1.h1;
import l1.m;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import mt.l5;
import mt.n1;
import mu.x;
import mv.a0;
import mv.d0;
import mv.g0;
import qy.b0;
import rt.c1;
import rt.d5;
import rt.jf;
import rt.oe;
import rt.r5;
import rt.w4;
import rt.x8;
import rt.y;
import y2.h;
import y2.j;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27375d;

    public /* synthetic */ e(int i11, fz.a aVar, Object obj, Object obj2) {
        this.f27372a = i11;
        this.f27373b = aVar;
        this.f27374c = obj;
        this.f27375d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:183:0x075b A[PHI: r1
      0x075b: PHI (r1v52 kv.s0) = (r1v45 kv.s0), (r1v53 kv.s0) binds: [B:185:0x0761, B:182:0x0759] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:215:0x0842  */
    /* JADX WARN: Code duplicated, block: B:217:0x0855  */
    /* JADX WARN: Code duplicated, block: B:218:0x085b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [vy.d] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        j0 j0Var;
        s0 s0Var;
        boolean z11;
        boolean z12;
        int i11 = this.f27372a;
        int i12 = 27;
        o oVar = o.f58481a;
        int i13 = 29;
        ?? r9 = 0;
        s0Var = null;
        s0Var = null;
        s0 s0Var2 = null;
        l1.g gVar = m.f39353a;
        b0 b0Var = b0.f48488a;
        Object obj3 = this.f27375d;
        Object obj4 = this.f27374c;
        Object obj5 = this.f27373b;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                a.d((String) obj4, (fz.e) obj3, (fz.a) obj5, (n) obj, t.M(385));
                break;
            case 1:
                ur.a aVar = (ur.a) obj4;
                DayStreakFinishedStatus dayStreakFinishedStatus = (DayStreakFinishedStatus) obj3;
                fz.a aVar2 = (fz.a) obj5;
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    boolean zH = sVar.h(aVar) | sVar.h(dayStreakFinishedStatus);
                    Object objQ = sVar.Q();
                    if (zH || objQ == gVar) {
                        objQ = new f0(23, aVar, dayStreakFinishedStatus, r9);
                        sVar.o0(objQ);
                    }
                    t.f((fz.e) objQ, b0Var, sVar);
                    if (!dayStreakFinishedStatus.isMilestone()) {
                        sVar.d0(-187267874);
                        fu.a.r(dayStreakFinishedStatus.getDayStreak(), 0, aVar2, sVar);
                        sVar.p(false);
                    } else {
                        sVar.d0(-187430283);
                        fu.a.p(dayStreakFinishedStatus.getDayStreak(), 0, aVar2, sVar);
                        sVar.p(false);
                    }
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                e0.a((String) obj4, (r) obj3, (DayStreakWeeklyItemStatus) obj5, (n) obj, t.M(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int i14 = MALSyllableIntroductionActivity.Q;
                ((MALSyllableIntroductionActivity) obj3).r((String) obj4, (fz.c) obj5, (n) obj, t.M(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                iv.a.f(t.M(1), (fz.c) obj3, (List) obj4, (n) obj, (r) obj5);
                break;
            case 5:
                d0 d0Var = (d0) obj4;
                g0 g0Var = (g0) obj3;
                v vVar = (v) obj5;
                i0 lesson = (i0) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                kotlin.jvm.internal.m.f(lesson, "lesson");
                String str = lesson.f38748a;
                ArrayList arrayListH0 = ry.m.H0(ry.m.H0(d0Var.f42196b, d0Var.f42197c), d0Var.f42198d);
                int size = arrayListH0.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj6 = arrayListH0.get(i15);
                    i15++;
                    if (((j0) obj6).f38760a.equals(str)) {
                        r9 = obj6;
                        j0Var = (j0) r9;
                        if (j0Var != null) {
                            g0Var.a(new a0(new h0(j0Var, zBooleanValue)));
                            if (j0Var.f38767h == s0.HANDWRITING) {
                                v.b(vVar, "syllable_test");
                            } else {
                                v.b(vVar, "syllable_handwriting_overview");
                            }
                        }
                        break;
                    }
                }
                j0Var = (j0) r9;
                if (j0Var != null) {
                    g0Var.a(new a0(new h0(j0Var, zBooleanValue)));
                    if (j0Var.f38767h == s0.HANDWRITING) {
                        v.b(vVar, "syllable_test");
                    } else {
                        v.b(vVar, "syllable_handwriting_overview");
                    }
                }
                break;
            case 6:
                v vVar2 = (v) obj4;
                kv.g0 g0Var2 = (kv.g0) obj3;
                fz.c cVar = (fz.c) obj5;
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    boolean zH2 = sVar2.h(vVar2);
                    Object objQ2 = sVar2.Q();
                    if (zH2 || objQ2 == gVar) {
                        objQ2 = new z1(vVar2, 28);
                        sVar2.o0(objQ2);
                    }
                    iv.a.D(g0Var2.f38743a, null, null, (fz.a) objQ2, cVar, sVar2, 0);
                }
                break;
            case 7:
                o0.t tVar = (o0.t) obj4;
                iv.f0 f0Var = (iv.f0) obj3;
                fz.c cVar2 = (fz.c) obj5;
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s sVar3 = (s) nVar3;
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sVar3.W();
                } else {
                    int iK = tVar.k();
                    if (iK == 0) {
                        s0Var = s0.HIRAGANA;
                        if (f0Var.f34726g != null) {
                            s0Var2 = s0Var;
                        }
                    } else if (iK == 1) {
                        s0Var = s0.KATAKANA;
                        if (f0Var.f34727h != null) {
                            s0Var2 = s0Var;
                        }
                    }
                    if (s0Var2 != null) {
                        sVar3.d0(193601565);
                        k7.d(null, null, null, null, d0.n.a(((s1) sVar3.j(v1.f31180a)).A, 1), t1.e.d(1227249000, new p(13, cVar2, s0Var2), sVar3), sVar3, 196608, 15);
                        z11 = false;
                    } else {
                        z11 = false;
                        sVar3.d0(176212301);
                    }
                    sVar3.p(z11);
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                iv.a.u((String) obj4, (String) obj3, (t1.d) obj5, (n) obj, t.M(385));
                break;
            case 9:
                ((Integer) obj2).getClass();
                z0.i((kv.d) obj4, (fz.c) obj3, (r) obj5, (n) obj, t.M(385));
                break;
            case 10:
                fz.a aVar3 = (fz.a) obj5;
                b1 b1Var = (b1) obj4;
                kr.m mVar = (kr.m) obj3;
                n nVar4 = (n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                s sVar4 = (s) nVar4;
                if (!sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    sVar4.W();
                } else {
                    boolean zF = sVar4.f(aVar3);
                    Object objQ3 = sVar4.Q();
                    if (zF || objQ3 == gVar) {
                        objQ3 = new et.p(27, aVar3);
                        sVar4.o0(objQ3);
                    }
                    k.g((fz.a) objQ3, null, jr.a.f36565j, null, t1.e.d(-2126478979, new p(15, b1Var, mVar), sVar4), null, null, null, sVar4, 24960, 234);
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                z.a((ir.a) obj4, (fz.c) obj3, (fz.a) obj5, (n) obj, t.M(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                android.support.v4.media.session.a.c((j9.e) obj4, (w1.b) obj3, (t1.d) obj5, (n) obj, t.M(385));
                break;
            case 13:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                rz.e0.B((rz.b0) obj4, null, null, new a2(fFloatValue, (f1) obj3, (j9.e) obj5, (vy.d) null), 3);
                break;
            case 14:
                ((Integer) obj2).getClass();
                l.h((CourseWord) obj3, (String) obj4, (r) obj5, (n) obj, t.M(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ku.a.d((fz.a) obj5, (fz.a) obj4, (x) obj3, (n) obj, t.M(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ku.a.e((mu.l) obj4, (fz.c) obj3, (fz.a) obj5, (n) obj, t.M(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ef.e.e((n9.v) obj3, (r) obj5, (String) obj4, (n) obj, t.M(49));
                break;
            case 18:
                fz.a aVar4 = (fz.a) obj5;
                jf jfVar = (jf) obj4;
                fz.c cVar3 = (fz.c) obj3;
                n nVar5 = (n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                s sVar5 = (s) nVar5;
                if (!sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    sVar5.W();
                } else {
                    h1.e0.c(lt.b.f40305a, null, t1.e.d(934020656, new at.o(i13, aVar4), sVar5), t1.e.d(-2033796839, new p(jfVar, cVar3, 20), sVar5), CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar5, 3462, 242);
                }
                break;
            case 19:
                ((Integer) obj2).getClass();
                mt.g.l((CourseACK) obj4, (fz.a) obj5, (fz.e) obj3, (n) obj, t.M(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                mt.g.n((fz.a) obj5, (fz.a) obj4, (y) obj3, (n) obj, t.M(1));
                break;
            case 21:
                fz.c cVar4 = (fz.c) obj4;
                rt.r rVar = (rt.r) obj3;
                b1 b1Var2 = (b1) obj5;
                n nVar6 = (n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                s sVar6 = (s) nVar6;
                if (!sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    sVar6.W();
                } else {
                    boolean zF2 = sVar6.f(cVar4) | sVar6.f(rVar);
                    Object objQ4 = sVar6.Q();
                    if (zF2 || objQ4 == gVar) {
                        objQ4 = new androidx.lifecycle.compose.a(cVar4, rVar, b1Var2, i12);
                        sVar6.o0(objQ4);
                    }
                    k7.m((fz.a) objQ4, null, false, null, null, null, mt.g.f41439l, sVar6, 805306368, 510);
                }
                break;
            case 22:
                b1 b1Var3 = (b1) obj4;
                rz.b0 b0Var2 = (rz.b0) obj3;
                b1 b1Var4 = (b1) obj5;
                n nVar7 = (n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                s sVar7 = (s) nVar7;
                if (!sVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    sVar7.W();
                } else {
                    u uVarA = j0.t.a(i.f35305c, z1.c.O, sVar7, 0);
                    int iHashCode = Long.hashCode(sVar7.T);
                    q1 q1VarL = sVar7.l();
                    r rVarC = z1.a.c(sVar7, oVar);
                    y2.k.J.getClass();
                    y2.i iVar = j.f56913b;
                    sVar7.h0();
                    if (sVar7.S) {
                        sVar7.k(iVar);
                    } else {
                        sVar7.r0();
                    }
                    h hVar = j.f56917f;
                    t.J(hVar, uVarA, sVar7);
                    h hVar2 = j.f56916e;
                    t.J(hVar2, q1VarL, sVar7);
                    h hVar3 = j.f56918g;
                    if (sVar7.S || !kotlin.jvm.internal.m.a(sVar7.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar7, iHashCode, hVar3);
                    }
                    h hVar4 = j.f56915d;
                    t.J(hVar4, rVarC, sVar7);
                    j0.a2 a2VarA = j0.z1.a(i.f35303a, z1.c.M, sVar7, 48);
                    int iHashCode2 = Long.hashCode(sVar7.T);
                    q1 q1VarL2 = sVar7.l();
                    r rVarC2 = z1.a.c(sVar7, oVar);
                    sVar7.h0();
                    if (sVar7.S) {
                        sVar7.k(iVar);
                    } else {
                        sVar7.r0();
                    }
                    t.J(hVar, a2VarA, sVar7);
                    t.J(hVar2, q1VarL2, sVar7);
                    if (sVar7.S || !kotlin.jvm.internal.m.a(sVar7.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar7, iHashCode2, hVar3);
                    }
                    t.J(hVar4, rVarC2, sVar7);
                    boolean z13 = ((List) b1Var4.getValue()).size() == ((List) b1Var3.getValue()).size();
                    boolean zH3 = sVar7.h(b0Var2) | sVar7.g(z13) | sVar7.f(b1Var3) | sVar7.f(b1Var4);
                    Object objQ5 = sVar7.Q();
                    if (zH3 || objQ5 == gVar) {
                        boolean z14 = z13;
                        objQ5 = new d1.g(1, b0Var2, b1Var3, b1Var4, z14);
                        z12 = z14;
                        sVar7.o0(objQ5);
                    } else {
                        z12 = z13;
                    }
                    e1.a(z12, (fz.c) objQ5, null, false, null, sVar7, 0, 60);
                    ua.b(ub.a.e0(sVar7, R.string.all), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar7.j(fc.f30256a)).f30175h, sVar7, 0, 0, 65534);
                    sVar7.p(true);
                    k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar7, 0, 7);
                    boolean zF3 = sVar7.f(b1Var3) | sVar7.h(b0Var2) | sVar7.f(b1Var4);
                    Object objQ6 = sVar7.Q();
                    if (zF3 || objQ6 == gVar) {
                        objQ6 = new fu.j0(b1Var3, b0Var2, b1Var4);
                        sVar7.o0(objQ6);
                    }
                    ue.f.a(null, null, null, null, null, null, false, null, (fz.c) objQ6, sVar7, 0, 511);
                    sVar7.p(true);
                }
                break;
            case 23:
                ((Integer) obj2).getClass();
                mt.g.F((x8) obj4, (List) obj3, (fz.a) obj5, (n) obj, t.M(1));
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                oe oeVar = (oe) obj4;
                a1 a1Var = (a1) obj3;
                b1 b1Var5 = (b1) obj5;
                n nVar8 = (n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                s sVar8 = (s) nVar8;
                if (!sVar8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    sVar8.W();
                } else {
                    r rVarE = e2.e(oVar, 1.0f);
                    u uVarA2 = j0.t.a(i.g(12), z1.c.O, sVar8, 6);
                    int iHashCode3 = Long.hashCode(sVar8.T);
                    q1 q1VarL3 = sVar8.l();
                    r rVarC3 = z1.a.c(sVar8, rVarE);
                    y2.k.J.getClass();
                    y2.i iVar2 = j.f56913b;
                    sVar8.h0();
                    if (sVar8.S) {
                        sVar8.k(iVar2);
                    } else {
                        sVar8.r0();
                    }
                    h hVar5 = j.f56917f;
                    t.J(hVar5, uVarA2, sVar8);
                    h hVar6 = j.f56916e;
                    t.J(hVar6, q1VarL3, sVar8);
                    h hVar7 = j.f56918g;
                    if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar8, iHashCode3, hVar7);
                    }
                    h hVar8 = j.f56915d;
                    t.J(hVar8, rVarC3, sVar8);
                    c1 c1Var = oeVar.f50221b;
                    mt.b1.c(c1Var.f49556d, c1Var.f49553a.isExcludedFromReview(), e2.e(oVar, 1.0f), sVar8, 384, 0);
                    int iL = ((h1) a1Var).l();
                    boolean zF4 = sVar8.f(a1Var);
                    Object objQ7 = sVar8.Q();
                    if (zF4 || objQ7 == gVar) {
                        objQ7 = new bt.a2(a1Var, 9);
                        sVar8.o0(objQ7);
                    }
                    mt.g.K(iL, (fz.c) objQ7, !((Boolean) b1Var5.getValue()).booleanValue(), d2.h.a(e2.e(oVar, 1.0f), ((Boolean) b1Var5.getValue()).booleanValue() ? 0.5f : 1.0f), 0, sVar8, 0, 16);
                    k7.g(e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar8, 6, 6);
                    r rVarE2 = e2.e(oVar, 1.0f);
                    j0.a2 a2VarA2 = j0.z1.a(i.f35303a, z1.c.M, sVar8, 48);
                    int iHashCode4 = Long.hashCode(sVar8.T);
                    q1 q1VarL4 = sVar8.l();
                    r rVarC4 = z1.a.c(sVar8, rVarE2);
                    sVar8.h0();
                    if (sVar8.S) {
                        sVar8.k(iVar2);
                    } else {
                        sVar8.r0();
                    }
                    t.J(hVar5, a2VarA2, sVar8);
                    t.J(hVar6, q1VarL4, sVar8);
                    if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar8, iHashCode4, hVar7);
                    }
                    t.J(hVar8, rVarC4, sVar8);
                    String strE0 = ub.a.e0(sVar8, R.string.srs_future_reviews_hide_toggle);
                    c3 c3Var = fc.f30256a;
                    y0 y0Var = ((dc) sVar8.j(c3Var)).f30178k;
                    c3 c3Var2 = v1.f31180a;
                    long j11 = ((s1) sVar8.j(c3Var2)).f31036s;
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    ua.b(strE0, new i1(1.0f, true), j11, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var, sVar8, 0, 0, 65528);
                    boolean zBooleanValue2 = ((Boolean) b1Var5.getValue()).booleanValue();
                    boolean zF5 = sVar8.f(b1Var5);
                    Object objQ8 = sVar8.Q();
                    if (zF5 || objQ8 == gVar) {
                        objQ8 = new mt.p(2, b1Var5);
                        sVar8.o0(objQ8);
                    }
                    r9.a(zBooleanValue2, (fz.c) objQ8, null, false, null, sVar8, 0, 124);
                    sVar8.p(true);
                    ua.b(ub.a.e0(sVar8, R.string.srs_future_reviews_hide_desc), null, ((s1) sVar8.j(c3Var2)).f31036s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar8.j(c3Var)).f30179l, sVar8, 0, 0, 65530);
                    sVar8.p(true);
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((Integer) obj2).getClass();
                mt.g.G((oe) obj4, (fz.a) obj5, (fz.e) obj3, (n) obj, t.M(1));
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                fz.e eVar = (fz.e) obj3;
                a1 a1Var2 = (a1) obj4;
                b1 b1Var6 = (b1) obj5;
                n nVar9 = (n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                s sVar9 = (s) nVar9;
                if (!sVar9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    sVar9.W();
                } else {
                    boolean zF6 = sVar9.f(eVar) | sVar9.f(a1Var2) | sVar9.f(b1Var6);
                    Object objQ9 = sVar9.Q();
                    if (zF6 || objQ9 == gVar) {
                        objQ9 = new androidx.lifecycle.compose.a(eVar, a1Var2, b1Var6, i13);
                        sVar9.o0(objQ9);
                    }
                    k7.m((fz.a) objQ9, null, false, null, null, null, mt.g.V, sVar9, 805306368, 510);
                }
                break;
            case 27:
                ((Integer) obj2).getClass();
                n1.a((List) obj4, (fz.a) obj5, (rt.a2) obj3, (n) obj, t.M(1));
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                l5.r((d5) obj4, (w4) obj3, (fz.a) obj5, (n) obj, t.M(1));
                break;
            default:
                ((Integer) obj2).getClass();
                l5.k((fz.a) obj5, (fz.a) obj4, (r5) obj3, (n) obj, t.M(1));
                break;
        }
        return b0Var;
    }

    public /* synthetic */ e(fz.a aVar, fz.a aVar2, ViewModel viewModel, int i11, int i12) {
        this.f27372a = i12;
        this.f27373b = aVar;
        this.f27374c = aVar2;
        this.f27375d = viewModel;
    }

    public /* synthetic */ e(fz.e eVar, a1 a1Var, b1 b1Var) {
        this.f27372a = 26;
        this.f27375d = eVar;
        this.f27374c = a1Var;
        this.f27373b = b1Var;
    }

    public /* synthetic */ e(Object obj, fz.a aVar, Object obj2, int i11, int i12) {
        this.f27372a = i12;
        this.f27374c = obj;
        this.f27373b = aVar;
        this.f27375d = obj2;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i11) {
        this.f27372a = i11;
        this.f27374c = obj;
        this.f27375d = obj2;
        this.f27373b = obj3;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i11, int i12) {
        this.f27372a = i12;
        this.f27374c = obj;
        this.f27375d = obj2;
        this.f27373b = obj3;
    }

    public /* synthetic */ e(Object obj, String str, Object obj2, int i11, int i12) {
        this.f27372a = i12;
        this.f27375d = obj;
        this.f27374c = str;
        this.f27373b = obj2;
    }

    public /* synthetic */ e(n9.v vVar, r rVar, String str, int i11) {
        this.f27372a = 17;
        this.f27375d = vVar;
        this.f27373b = rVar;
        this.f27374c = str;
    }
}
