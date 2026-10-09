package ch;

import android.content.Intent;
import android.graphics.RectF;
import androidx.lifecycle.ViewModelKt;
import com.google.api.Service;
import com.lingo.course.ui.CourseTestExamActivity;
import com.lingo.course.ui.CourseTipsActivity;
import com.lingo.lingoskill.malskill.ui.learn.MALSyllableIntroductionActivity;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.learn.BaseSmartTipsActivity;
import com.lingo.lingoskill.ui.learn.DebugTestActivity;
import com.lingo.splash.SplashIndexActivity;
import com.lingo.story.ui.StoryActivity;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseACK;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.daystreak.DayStreakExplainActivity;
import com.yalantis.ucrop.view.CropImageView;
import dt.n4;
import dt.v2;
import f0.a2;
import f0.b2;
import h1.s1;
import h1.ua;
import h1.v1;
import h1.wb;
import h1.yb;
import h1.za;
import j0.e2;
import java.util.Collection;
import java.util.Set;
import jp.b1;
import l1.c3;
import l1.d2;
import l1.g1;
import l1.g2;
import l1.x1;
import mt.y3;
import uz.i1;
import ys.h2;
import ys.j3;
import ys.p2;
import ys.q2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7010b;

    public /* synthetic */ b0(Object obj, int i11) {
        this.f7009a = i11;
        this.f7010b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:407:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0201 A[Catch: all -> 0x01f3, LOOP:3: B:82:0x01c4->B:99:0x0201, LOOP_END, TryCatch #0 {all -> 0x01f3, blocks: (B:75:0x01a1, B:77:0x01b1, B:79:0x01b7, B:82:0x01c4, B:84:0x01d0, B:86:0x01da, B:88:0x01e0, B:90:0x01e9, B:95:0x01f5, B:96:0x01f8, B:99:0x0201, B:109:0x0227, B:100:0x0205, B:101:0x020b, B:103:0x0211, B:105:0x0219, B:108:0x0223), top: B:393:0x01a1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [int] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r15v17, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        boolean zG;
        Object value;
        kr.i iVarA;
        char c11;
        int i11;
        int i12 = this.f7009a;
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        char c12 = 7;
        rz.l lVarY = null;
        int i13 = 2;
        boolean z11 = false;
        final int i14 = 1;
        switch (i12) {
            case 0:
                final CourseTestExamActivity courseTestExamActivity = (CourseTestExamActivity) this.f7010b;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = CourseTestExamActivity.H;
                l1.g gVar = l1.m.f39353a;
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) courseTestExamActivity.f21618t.getValue()).booleanValue();
                    boolean zH = sVar.h(courseTestExamActivity);
                    Object objQ = sVar.Q();
                    if (zH || objQ == gVar) {
                        objQ = new a0(courseTestExamActivity, i14);
                        sVar.o0(objQ);
                    }
                    fz.a aVar = (fz.a) objQ;
                    boolean zH2 = sVar.h(courseTestExamActivity);
                    Object objQ2 = sVar.Q();
                    if (zH2 || objQ2 == gVar) {
                        objQ2 = new a0(courseTestExamActivity, i13);
                        sVar.o0(objQ2);
                    }
                    fz.a aVar2 = (fz.a) objQ2;
                    boolean zH3 = sVar.h(courseTestExamActivity);
                    Object objQ3 = sVar.Q();
                    if (zH3 || objQ3 == gVar) {
                        final int i16 = 0;
                        objQ3 = new fz.c() { // from class: ch.c0
                            @Override // fz.c
                            public final Object invoke(Object obj3) {
                                int i17 = i16;
                                qy.b0 b0Var = qy.b0.f48488a;
                                CourseTestExamActivity courseTestExamActivity2 = courseTestExamActivity;
                                switch (i17) {
                                    case 0:
                                        int iIntValue2 = ((Integer) obj3).intValue();
                                        int i18 = CourseTestExamActivity.H;
                                        Intent intent = new Intent(courseTestExamActivity2, (Class<?>) LoginActivity.class);
                                        intent.putExtra(INTENTS.EXTRA_INT, iIntValue2);
                                        courseTestExamActivity2.startActivity(intent);
                                        break;
                                    default:
                                        String source = (String) obj3;
                                        int i19 = CourseTestExamActivity.H;
                                        kotlin.jvm.internal.m.f(source, "source");
                                        int[] iArr = bq.r.f4959a;
                                        bq.m.C(courseTestExamActivity2, source);
                                        break;
                                }
                                return b0Var;
                            }
                        };
                        sVar.o0(objQ3);
                    }
                    fz.c cVar = (fz.c) objQ3;
                    boolean zH4 = sVar.h(courseTestExamActivity);
                    Object objQ4 = sVar.Q();
                    if (zH4 || objQ4 == gVar) {
                        objQ4 = new fz.c() { // from class: ch.c0
                            @Override // fz.c
                            public final Object invoke(Object obj3) {
                                int i17 = i14;
                                qy.b0 b0Var = qy.b0.f48488a;
                                CourseTestExamActivity courseTestExamActivity2 = courseTestExamActivity;
                                switch (i17) {
                                    case 0:
                                        int iIntValue2 = ((Integer) obj3).intValue();
                                        int i18 = CourseTestExamActivity.H;
                                        Intent intent = new Intent(courseTestExamActivity2, (Class<?>) LoginActivity.class);
                                        intent.putExtra(INTENTS.EXTRA_INT, iIntValue2);
                                        courseTestExamActivity2.startActivity(intent);
                                        break;
                                    default:
                                        String source = (String) obj3;
                                        int i19 = CourseTestExamActivity.H;
                                        kotlin.jvm.internal.m.f(source, "source");
                                        int[] iArr = bq.r.f4959a;
                                        bq.m.C(courseTestExamActivity2, source);
                                        break;
                                }
                                return b0Var;
                            }
                        };
                        sVar.o0(objQ4);
                    }
                    h2.a(zBooleanValue, null, null, aVar, aVar2, cVar, (fz.c) objQ4, sVar, 0);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                CourseTipsActivity courseTipsActivity = (CourseTipsActivity) this.f7010b;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = CourseTipsActivity.K;
                l1.g gVar2 = l1.m.f39353a;
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    long jLongValue = ((Number) courseTipsActivity.f21621t.getValue()).longValue();
                    boolean zBooleanValue2 = ((Boolean) courseTipsActivity.H.getValue()).booleanValue();
                    boolean zH5 = sVar2.h(courseTipsActivity);
                    Object objQ5 = sVar2.Q();
                    if (zH5 || objQ5 == gVar2) {
                        objQ5 = new t0(courseTipsActivity, 2);
                        sVar2.o0(objQ5);
                    }
                    fz.a aVar3 = (fz.a) objQ5;
                    boolean zH6 = sVar2.h(courseTipsActivity);
                    Object objQ6 = sVar2.Q();
                    if (zH6 || objQ6 == gVar2) {
                        objQ6 = new t0(courseTipsActivity, 3);
                        sVar2.o0(objQ6);
                    }
                    j3.g(jLongValue, zBooleanValue2, aVar3, (fz.a) objQ6, null, sVar2, 0);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 2:
                ((Integer) obj2).getClass();
                dt.a0.p((j3.h) this.f7010b, (l1.n) obj, l1.t.M(1));
                return qy.b0.f48488a;
            case 3:
                ((Integer) obj2).getClass();
                dt.e.h((ns.c0) this.f7010b, z1.o.f58481a, (l1.n) obj, l1.t.M(1));
                return qy.b0.f48488a;
            case 4:
                g1 g1Var = (g1) this.f7010b;
                float fFloatValue = ((Float) obj2).floatValue();
                kotlin.jvm.internal.m.f((s2.t) obj, "<unused var>");
                c3 c3Var = v2.f24275a;
                g1Var.m(g1Var.l() + fFloatValue);
                float fL = g1Var.l();
                if (fL >= CropImageView.DEFAULT_ASPECT_RATIO) {
                    f5 = fL;
                }
                g1Var.m(f5);
                return qy.b0.f48488a;
            case 5:
                n4 n4Var = (n4) this.f7010b;
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    y3.d(n4Var.f24040a, n4Var.f24041b, n4Var.f24042c, n4Var.f24043d, e2.e(j0.c.C(z1.o.f58481a, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), sVar3, 24576);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
            case 6:
                b2 b2Var = (b2) this.f7010b;
                rz.e0.B(b2Var.H0(), null, null, new a2(b2Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 7:
                yb ybVar = (yb) this.f7010b;
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    long jE = g2.f0.e(4294940672L);
                    long j11 = g2.x.f28621h;
                    long j12 = g2.x.f28622i;
                    s1 s1Var = (s1) sVar4.j(v1.f31180a);
                    za zaVar = s1Var.f31020b0;
                    if (zaVar == null) {
                        za zaVar2 = new za(v1.c(s1Var, k1.k0.f37577a), v1.c(s1Var, k1.k0.f37582f), v1.c(s1Var, k1.k0.f37586j), v1.c(s1Var, k1.k0.f37589n), v1.c(s1Var, k1.k0.f37580d), v1.c(s1Var, k1.k0.f37585i), v1.c(s1Var, k1.k0.f37591p), g2.x.f28621h, v1.c(s1Var, k1.k0.f37592q), v1.c(s1Var, k1.k0.f37593r), v1.c(s1Var, k1.k0.f37600y), v1.c(s1Var, k1.k0.A), v1.c(s1Var, k1.k0.f37601z), v1.c(s1Var, k1.k0.B));
                        s1Var.f31020b0 = zaVar2;
                        zaVar = zaVar2;
                    }
                    long j13 = j12 != 16 ? j12 : zaVar.f31429a;
                    if (jE == 16) {
                        jE = zaVar.f31430b;
                    }
                    long j14 = jE;
                    if (j11 == 16) {
                        j11 = zaVar.f31431c;
                    }
                    long j15 = j11;
                    long j16 = j12 != 16 ? j12 : zaVar.f31432d;
                    long j17 = j12 != 16 ? j12 : zaVar.f31433e;
                    long j18 = j12 != 16 ? j12 : zaVar.f31434f;
                    long j19 = j12 != 16 ? j12 : zaVar.f31435g;
                    long j21 = j12 != 16 ? j12 : zaVar.f31436h;
                    long j22 = j12 != 16 ? j12 : zaVar.f31437i;
                    long j23 = j12 != 16 ? j12 : zaVar.f31438j;
                    long j24 = j12 != 16 ? j12 : zaVar.f31439k;
                    long j25 = j12 != 16 ? j12 : zaVar.f31440l;
                    long j26 = j12 != 16 ? j12 : zaVar.m;
                    if (j12 == 16) {
                        j12 = zaVar.f31441n;
                    }
                    wb.g(ybVar, null, new za(j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, j24, j25, j26, j12), 0, sVar4, 0);
                } else {
                    sVar4.W();
                }
                return qy.b0.f48488a;
            case 8:
                DayStreakExplainActivity dayStreakExplainActivity = (DayStreakExplainActivity) this.f7010b;
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i18 = DayStreakExplainActivity.f22387a;
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zH7 = sVar5.h(dayStreakExplainActivity);
                    Object objQ7 = sVar5.Q();
                    if (zH7 || objQ7 == l1.m.f39353a) {
                        objQ7 = new cr.n(dayStreakExplainActivity, 22);
                        sVar5.o0(objQ7);
                    }
                    fu.e0.b(null, (fz.a) objQ7, sVar5, 0);
                } else {
                    sVar5.W();
                }
                return qy.b0.f48488a;
            case 9:
                SplashIndexActivity context = (SplashIndexActivity) this.f7010b;
                LanguageItem languageItem = (LanguageItem) obj;
                int i19 = SplashIndexActivity.M;
                kotlin.jvm.internal.m.f(languageItem, "languageItem");
                kotlin.jvm.internal.m.f(context, "context");
                Intent intent = new Intent(context, (Class<?>) SwitchLanguageActivity.class);
                intent.putExtra(INTENTS.EXTRA_OBJECT, languageItem);
                intent.putExtra(INTENTS.EXTRA_BOOLEAN, true);
                intent.putExtra(INTENTS.EXTRA_STRING, "splash");
                context.startActivity(intent);
                return qy.b0.f48488a;
            case 10:
                MALSyllableIntroductionActivity mALSyllableIntroductionActivity = (MALSyllableIntroductionActivity) this.f7010b;
                l1.n nVar6 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i21 = MALSyllableIntroductionActivity.Q;
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zH8 = sVar6.h(mALSyllableIntroductionActivity);
                    Object objQ8 = sVar6.Q();
                    if (zH8 || objQ8 == l1.m.f39353a) {
                        objQ8 = new hh.o(mALSyllableIntroductionActivity, 9);
                        sVar6.o0(objQ8);
                    }
                    iu.k.j((fz.a) objQ8, sVar6, 0);
                } else {
                    sVar6.W();
                }
                return qy.b0.f48488a;
            case 11:
                mv.u uVar = (mv.u) this.f7010b;
                l1.n nVar7 = (l1.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                l1.s sVar7 = (l1.s) nVar7;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ua.b(ub.a.d0(R.string.group_s, new Object[]{Integer.valueOf(((mv.t) uVar).f42274a.f38749b)}, sVar7), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar7, 0, 0, 131070);
                } else {
                    sVar7.W();
                }
                return qy.b0.f48488a;
            case 12:
                kv.i0 i0Var = (kv.i0) this.f7010b;
                l1.n nVar8 = (l1.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                l1.s sVar8 = (l1.s) nVar8;
                if (sVar8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ua.b(ub.a.d0(R.string.lesson_s, new Object[]{iv.a.I(i0Var)}, sVar8), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar8, 0, 0, 131070);
                } else {
                    sVar8.W();
                }
                return qy.b0.f48488a;
            case 13:
                return new v3.j((((long) ((z1.d) this.f7010b).a(0, (int) (((v3.l) obj).f53498a >> 32), (v3.m) obj2)) << 32) | (((long) 0) & 4294967295L));
            case 14:
                return new v3.j((((long) 0) << 32) | (((long) ((z1.i) this.f7010b).a(0, (int) (((v3.l) obj).f53498a & 4294967295L))) & 4294967295L));
            case 15:
                return new v3.j(((z1.e) this.f7010b).a(0L, ((v3.l) obj).f53498a, (v3.m) obj2));
            case 16:
                h2.d dVar = (h2.d) this.f7010b;
                f2.c cVarG = g2.f0.G((RectF) obj);
                f2.c cVarG2 = g2.f0.G((RectF) obj2);
                switch (dVar.f31459a) {
                    case 8:
                        zG = cVarG.g(cVarG2);
                        break;
                    default:
                        zG = cVarG2.a(cVarG.b());
                        break;
                }
                return Boolean.valueOf(zG);
            case 17:
                BaseSmartTipsActivity baseSmartTipsActivity = (BaseSmartTipsActivity) this.f7010b;
                l1.n nVar9 = (l1.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i22 = BaseSmartTipsActivity.H;
                l1.s sVar9 = (l1.s) nVar9;
                if (sVar9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    baseSmartTipsActivity.f22050t = baseSmartTipsActivity.getIntent().getLongExtra(INTENTS.EXTRA_LONG, -1L);
                    baseSmartTipsActivity.getIntent().getIntExtra(INTENTS.EXTRA_INT, -1);
                    Long lValueOf = Long.valueOf(baseSmartTipsActivity.f22050t);
                    boolean zH9 = sVar9.h(baseSmartTipsActivity);
                    Object objQ9 = sVar9.Q();
                    if (zH9 || objQ9 == l1.m.f39353a) {
                        objQ9 = new hh.o(baseSmartTipsActivity, 14);
                        sVar9.o0(objQ9);
                    }
                    us.b.i(lValueOf, false, null, (fz.a) objQ9, sVar9, 0, 6);
                } else {
                    sVar9.W();
                }
                return qy.b0.f48488a;
            case 18:
                jp.q0 q0Var = (jp.q0) this.f7010b;
                l1.n nVar10 = (l1.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                l1.s sVar10 = (l1.s) nVar10;
                if (sVar10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    Long lValueOf2 = Long.valueOf(q0Var.S);
                    boolean zH10 = sVar10.h(q0Var);
                    Object objQ10 = sVar10.Q();
                    if (zH10 || objQ10 == l1.m.f39353a) {
                        objQ10 = new hh.o(q0Var, 15);
                        sVar10.o0(objQ10);
                    }
                    us.b.i(lValueOf2, false, null, (fz.a) objQ10, sVar10, 0, 6);
                } else {
                    sVar10.W();
                }
                return qy.b0.f48488a;
            case 19:
                final DebugTestActivity debugTestActivity = (DebugTestActivity) this.f7010b;
                l1.n nVar11 = (l1.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i23 = DebugTestActivity.H;
                l1.g gVar3 = l1.m.f39353a;
                l1.s sVar11 = (l1.s) nVar11;
                if (sVar11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    q2 q2Var = new q2(-1L, -1L, CoursePracticeType.COURSE, (String) debugTestActivity.f22051t.getValue(), ry.r.f50854a);
                    boolean zH11 = sVar11.h(debugTestActivity);
                    Object objQ11 = sVar11.Q();
                    if (zH11 || objQ11 == gVar3) {
                        objQ11 = new b1(debugTestActivity, 1);
                        sVar11.o0(objQ11);
                    }
                    fz.a aVar4 = (fz.a) objQ11;
                    boolean zH12 = sVar11.h(debugTestActivity);
                    Object objQ12 = sVar11.Q();
                    if (zH12 || objQ12 == gVar3) {
                        objQ12 = new b1(debugTestActivity, 2);
                        sVar11.o0(objQ12);
                    }
                    fz.a aVar5 = (fz.a) objQ12;
                    boolean zH13 = sVar11.h(debugTestActivity);
                    Object objQ13 = sVar11.Q();
                    if (zH13 || objQ13 == gVar3) {
                        final int i24 = 0;
                        objQ13 = new fz.c() { // from class: jp.c1
                            @Override // fz.c
                            public final Object invoke(Object obj3) {
                                int i25 = i24;
                                qy.b0 b0Var = qy.b0.f48488a;
                                DebugTestActivity debugTestActivity2 = debugTestActivity;
                                switch (i25) {
                                    case 0:
                                        int iIntValue12 = ((Integer) obj3).intValue();
                                        int i26 = DebugTestActivity.H;
                                        Intent intent2 = new Intent(debugTestActivity2, (Class<?>) LoginActivity.class);
                                        intent2.putExtra(INTENTS.EXTRA_INT, iIntValue12);
                                        debugTestActivity2.startActivity(intent2);
                                        break;
                                    default:
                                        String source = (String) obj3;
                                        int i27 = DebugTestActivity.H;
                                        kotlin.jvm.internal.m.f(source, "source");
                                        int[] iArr = bq.r.f4959a;
                                        bq.m.C(debugTestActivity2, source);
                                        break;
                                }
                                return b0Var;
                            }
                        };
                        sVar11.o0(objQ13);
                    }
                    fz.c cVar2 = (fz.c) objQ13;
                    boolean zH14 = sVar11.h(debugTestActivity);
                    Object objQ14 = sVar11.Q();
                    if (zH14 || objQ14 == gVar3) {
                        objQ14 = new fz.c() { // from class: jp.c1
                            @Override // fz.c
                            public final Object invoke(Object obj3) {
                                int i25 = i14;
                                qy.b0 b0Var = qy.b0.f48488a;
                                DebugTestActivity debugTestActivity2 = debugTestActivity;
                                switch (i25) {
                                    case 0:
                                        int iIntValue12 = ((Integer) obj3).intValue();
                                        int i26 = DebugTestActivity.H;
                                        Intent intent2 = new Intent(debugTestActivity2, (Class<?>) LoginActivity.class);
                                        intent2.putExtra(INTENTS.EXTRA_INT, iIntValue12);
                                        debugTestActivity2.startActivity(intent2);
                                        break;
                                    default:
                                        String source = (String) obj3;
                                        int i27 = DebugTestActivity.H;
                                        kotlin.jvm.internal.m.f(source, "source");
                                        int[] iArr = bq.r.f4959a;
                                        bq.m.C(debugTestActivity2, source);
                                        break;
                                }
                                return b0Var;
                            }
                        };
                        sVar11.o0(objQ14);
                    }
                    p2.c(q2Var, null, null, aVar4, null, null, aVar5, cVar2, (fz.c) objQ14, sVar11, 8, 54);
                } else {
                    sVar11.W();
                }
                return qy.b0.f48488a;
            case 20:
                j9.v vVar = (j9.v) this.f7010b;
                ((Integer) obj).getClass();
                ((Long) obj2).getClass();
                int i25 = StoryActivity.N;
                vVar.a(jr.a0.StoryReadingFinish.a(), new j9.a0(18));
                return qy.b0.f48488a;
            case 21:
                ((Integer) obj2).getClass();
                k9.m.a((k9.o) this.f7010b, (l1.n) obj, l1.t.M(1));
                return qy.b0.f48488a;
            case 22:
                ((Integer) obj2).getClass();
                km.b1.k((km.m) this.f7010b, (l1.n) obj, l1.t.M(1));
                return qy.b0.f48488a;
            case 23:
                kr.b0 b0Var = (kr.b0) this.f7010b;
                String str = (String) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                i1 i1Var = b0Var.K;
                do {
                    value = i1Var.getValue();
                    iVarA = (kr.i) value;
                    if (kotlin.jvm.internal.m.a(iVarA != null ? iVarA.f38491a : null, str)) {
                        iVarA = kr.i.a(iVarA, false, fFloatValue2, 0, 11);
                    }
                } while (!i1Var.j(value, iVarA));
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                t1.j jVar = (t1.j) this.f7010b;
                ((Integer) obj).getClass();
                if (obj2 instanceof l1.j) {
                    l1.j jVar2 = (l1.j) obj2;
                    y.j0 j0Var = jVar.f52000h;
                    if (j0Var == null) {
                        y.j0 j0Var2 = y.s0.f56760a;
                        j0Var = new y.j0();
                        jVar.f52000h = j0Var;
                    }
                    j0Var.j(jVar2);
                    jVar.f51998f.c(jVar2);
                }
                if (obj2 instanceof g2) {
                    jVar.e((g2) obj2);
                }
                if (obj2 instanceof x1) {
                    ((x1) obj2).d();
                }
                return qy.b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                d2 d2Var = (d2) this.f7010b;
                Set set = (Set) obj;
                synchronized (d2Var.f39259d) {
                    try {
                        if (((l1.a2) d2Var.f39276v.getValue()).compareTo(l1.a2.Idle) >= 0) {
                            y.j0 j0Var3 = d2Var.f39264i;
                            if (set instanceof n1.h) {
                                y.j0 j0Var4 = ((n1.h) set).f43122a;
                                Object[] objArr = j0Var4.f56721b;
                                long[] jArr = j0Var4.f56720a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i26 = 0;
                                    while (true) {
                                        long j27 = jArr[i26];
                                        if ((((~j27) << 7) & j27 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i27 = 8 - ((~(i26 - length)) >>> 31);
                                            for (?? r14 = z11; r14 < i27; r14++) {
                                                if ((j27 & 255) < 128) {
                                                    Object obj3 = objArr[(i26 << 3) + r14];
                                                    if (!(obj3 instanceof x1.z) || ((x1.z) obj3).j(1)) {
                                                        j0Var3.a(obj3);
                                                    }
                                                }
                                                j27 >>= 8;
                                            }
                                            if (i27 == 8) {
                                                if (i26 != length) {
                                                    i26++;
                                                    z11 = false;
                                                }
                                            }
                                        } else if (i26 != length) {
                                            i26++;
                                            z11 = false;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set) {
                                    if (!(obj4 instanceof x1.z) || ((x1.z) obj4).j(1)) {
                                        j0Var3.a(obj4);
                                    }
                                }
                            }
                            lVarY = d2Var.y();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (lVarY != null) {
                    ((rz.m) lVarY).resumeWith(qy.b0.f48488a);
                }
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                tz.h hVar = (tz.h) this.f7010b;
                Set set2 = (Set) obj;
                if (set2 instanceof n1.h) {
                    y.j0 j0Var5 = ((n1.h) set2).f43122a;
                    Object[] objArr2 = j0Var5.f56721b;
                    long[] jArr2 = j0Var5.f56720a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i28 = 0;
                        while (true) {
                            long j28 = jArr2[i28];
                            if ((((~j28) << c12) & j28 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i29 = 8 - ((~(i28 - length2)) >>> 31);
                                int i30 = 0;
                                while (true) {
                                    if (i30 < i29) {
                                        if ((j28 & 255) < 128) {
                                            Object obj5 = objArr2[(i28 << 3) + i30];
                                            if (!(obj5 instanceof x1.z) || ((x1.z) obj5).j(4)) {
                                            }
                                        }
                                        j28 >>= 8;
                                        i30++;
                                        c12 = c12;
                                    } else {
                                        c11 = c12;
                                        if (i29 == 8) {
                                        }
                                    }
                                }
                            } else {
                                c11 = c12;
                            }
                            if (i28 != length2) {
                                i28++;
                                c12 = c11;
                            }
                        }
                        hVar.i(set2);
                    }
                } else {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj6 : set3) {
                            if (!(obj6 instanceof x1.z) || ((x1.z) obj6).j(4)) {
                                hVar.i(set2);
                            }
                        }
                    }
                }
                return qy.b0.f48488a;
            case 27:
                CourseACK courseACK = (CourseACK) this.f7010b;
                l1.n nVar12 = (l1.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                l1.s sVar12 = (l1.s) nVar12;
                if (sVar12.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    if (courseACK.isFav()) {
                        sVar12.d0(316810131);
                        i11 = R.drawable.ic_ack_faved;
                    } else {
                        sVar12.d0(316811663);
                        i11 = R.drawable.ic_ack_fav;
                    }
                    k2.b bVarY = se.k.y(i11, sVar12, 0);
                    sVar12.p(false);
                    d0.n.c(bVarY, null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar12, 48, 124);
                } else {
                    sVar12.W();
                }
                return qy.b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                rt.y yVar = (rt.y) this.f7010b;
                String id2 = (String) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                kotlin.jvm.internal.m.f(id2, "id");
                rz.e0.B(ViewModelKt.getViewModelScope(yVar), null, null, new ns.j(12, yVar, new rt.u(id2, zBooleanValue3), lVarY), 3);
                return qy.b0.f48488a;
            default:
                mt.c cVar3 = (mt.c) this.f7010b;
                l1.n nVar13 = (l1.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                l1.s sVar13 = (l1.s) nVar13;
                if (sVar13.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar13, cVar3 instanceof mt.a ? R.string.bookmark_folder_create_action : R.string.bookmark_folder_rename_action), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar13, 0, 0, 131070);
                } else {
                    sVar13.W();
                }
                return qy.b0.f48488a;
        }
    }

    public /* synthetic */ b0(Object obj, int i11, int i12) {
        this.f7009a = i12;
        this.f7010b = obj;
    }
}
