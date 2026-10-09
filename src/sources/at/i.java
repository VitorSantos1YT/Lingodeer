package at;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.media3.exoplayer.ExoPlayer;
import au.d1;
import b0.p1;
import bp.g1;
import bt.d3;
import bt.e8;
import bt.j0;
import com.google.api.Service;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingo.course.ui.CourseTestOutActivity;
import com.lingo.fluent.ui.compose.PdFeedDifficultyActivity;
import com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity;
import com.lingo.main.ui.MainComposeActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseUiState;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.UnitState;
import com.lingodeer.database.model.LanguageHistoryEntity;
import com.yalantis.ucrop.view.CropImageView;
import dt.a0;
import dt.d4;
import dt.y4;
import ei.z;
import f0.g2;
import f0.i2;
import f0.n0;
import fb.g0;
import fr.o0;
import h1.k7;
import j0.e2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jt.h2;
import jt.l0;
import jt.u;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x;
import l1.a1;
import l1.b1;
import l1.q1;
import l1.t;
import ot.t1;
import ot.w;
import ot.x1;
import ot.z1;
import qy.b0;
import rt.ed;
import rt.sd;
import w2.q0;
import ys.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2887d;

    public /* synthetic */ i(int i11, int i12, fz.a aVar, fz.c cVar, Object obj) {
        this.f2884a = i12;
        this.f2885b = cVar;
        this.f2886c = aVar;
        this.f2887d = obj;
    }

    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, qy.h] */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f2884a;
        z1.o oVar = z1.o.f58481a;
        l1.g gVar = l1.m.f39353a;
        final int i12 = 2;
        b0 b0Var = b0.f48488a;
        Object obj3 = this.f2885b;
        Object obj4 = this.f2887d;
        Object obj5 = this.f2886c;
        final int i13 = 1;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                b.c((CourseLesson) obj5, (ed) obj4, (fz.c) obj3, (l1.n) obj, t.M(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                g1.i((fz.c) obj3, (fz.a) obj5, (z1.r) obj4, (l1.n) obj, t.M(49));
                break;
            case 2:
                gp.m mVar = (gp.m) obj5;
                LanguageHistoryEntity languageHistoryEntity = (LanguageHistoryEntity) obj4;
                b1 b1Var = (b1) obj3;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    boolean zH = sVar.h(mVar) | sVar.h(languageHistoryEntity);
                    Object objQ = sVar.Q();
                    if (zH || objQ == gVar) {
                        objQ = new androidx.lifecycle.compose.a(mVar, languageHistoryEntity, b1Var, i13);
                        sVar.o0(objQ);
                    }
                    k7.m((fz.a) objQ, null, false, null, null, null, g1.f4586b, sVar, 805306368, 510);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                g1.k((ArrayList) obj5, (String) obj4, (fz.c) obj3, (l1.n) obj, t.M(1));
                break;
            case 4:
                final MainComposeActivity mainComposeActivity = (MainComposeActivity) obj5;
                final Context context = (Context) obj4;
                a1 a1Var = (a1) obj3;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else if (((o0) mainComposeActivity.l()).f27733a.fluentLanguage != -1) {
                    sVar2.d0(580717846);
                    boolean zH2 = sVar2.h(mainComposeActivity) | sVar2.h(context);
                    Object objQ2 = sVar2.Q();
                    if (zH2 || objQ2 == gVar) {
                        final int i14 = false ? 1 : 0;
                        objQ2 = new fz.c() { // from class: br.g
                            @Override // fz.c
                            public final Object invoke(Object obj6) {
                                int i15 = i14;
                                qy.b0 b0Var2 = qy.b0.f48488a;
                                Context context2 = context;
                                MainComposeActivity mainComposeActivity2 = mainComposeActivity;
                                switch (i15) {
                                    case 0:
                                        mh.b difficultyLevel = (mh.b) obj6;
                                        kotlin.jvm.internal.m.f(difficultyLevel, "difficultyLevel");
                                        int i16 = PdFeedDifficultyActivity.H;
                                        String difficulty = difficultyLevel.b();
                                        kotlin.jvm.internal.m.f(difficulty, "difficulty");
                                        kotlin.jvm.internal.m.f(context2, "context");
                                        Intent intent = new Intent(context2, (Class<?>) PdFeedDifficultyActivity.class);
                                        intent.putExtra(INTENTS.EXTRA_STRING, difficulty);
                                        mainComposeActivity2.startActivity(intent);
                                        break;
                                    case 1:
                                        CourseUnit courseUnit = (CourseUnit) obj6;
                                        kotlin.jvm.internal.m.f(courseUnit, "courseUnit");
                                        if (courseUnit.getUnitState() == UnitState.StateLocked) {
                                            Toast.makeText(context2, R.string.please_complete_previous_units_first, 0).show();
                                        } else {
                                            int i17 = CourseTestIndexActivity.N;
                                            long unitId = courseUnit.getUnitId();
                                            int testOutIndex = courseUnit.getTestOutIndex();
                                            kotlin.jvm.internal.m.f(context2, "context");
                                            Intent intent2 = new Intent(context2, (Class<?>) CourseTestIndexActivity.class);
                                            intent2.putExtra(INTENTS.EXTRA_LONG, unitId);
                                            intent2.putExtra(INTENTS.EXTRA_INT, testOutIndex);
                                            mainComposeActivity2.startActivity(intent2);
                                        }
                                        break;
                                    default:
                                        CourseUnit courseUnit2 = (CourseUnit) obj6;
                                        kotlin.jvm.internal.m.f(courseUnit2, "courseUnit");
                                        int i18 = CourseTestOutActivity.L;
                                        long jLongValue = ((Number) ry.m.q0(ks.b.n(courseUnit2.getLessonList()))).longValue();
                                        List<Long> unitIdList = courseUnit2.getUnitList();
                                        String str = courseUnit2.isTestOutReview() ? "COURSE_TEST_OUT_REVIEW" : "COURSE_TEST_OUT";
                                        kotlin.jvm.internal.m.f(context2, "context");
                                        kotlin.jvm.internal.m.f(unitIdList, "unitIdList");
                                        Intent intent3 = new Intent(context2, (Class<?>) CourseTestOutActivity.class);
                                        intent3.putExtra(INTENTS.EXTRA_LONG, jLongValue);
                                        intent3.putExtra(INTENTS.EXTRA_ARRAY_LIST, (Serializable) unitIdList);
                                        intent3.putExtra(INTENTS.EXTRA_STRING, str);
                                        mainComposeActivity2.startActivity(intent3);
                                        break;
                                }
                                return b0Var2;
                            }
                        };
                        sVar2.o0(objQ2);
                    }
                    fz.c cVar = (fz.c) objQ2;
                    boolean zH3 = sVar2.h(mainComposeActivity);
                    Object objQ3 = sVar2.Q();
                    if (zH3 || objQ3 == gVar) {
                        objQ3 = new br.h(mainComposeActivity, false ? 1 : 0);
                        sVar2.o0(objQ3);
                    }
                    nh.d.c(cVar, (fz.c) objQ3, null, null, sVar2, 0);
                    sVar2.p(false);
                } else if (((o0) mainComposeActivity.l()).f27733a.scLanguage != -1) {
                    sVar2.d0(581280806);
                    z1.r rVarD = e2.d(oVar, 1.0f);
                    Bundle EMPTY = Bundle.EMPTY;
                    kotlin.jvm.internal.m.e(EMPTY, "EMPTY");
                    Object objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new br.b(i13);
                        sVar2.o0(objQ4);
                    }
                    ub.a.H(ej.l.class, rVarD, null, EMPTY, (fz.c) objQ4, sVar2, 24624, 4);
                    sVar2.p(false);
                } else if (((o0) mainComposeActivity.l()).f27733a.handWriteLanguage == -1) {
                    sVar2.d0(582345501);
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar2.T);
                    q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, oVar);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    t.J(y2.j.f56917f, q0VarD, sVar2);
                    t.J(y2.j.f56916e, q1VarL, sVar2);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    t.J(y2.j.f56915d, rVarC, sVar2);
                    CourseUiState courseUiState = (CourseUiState) FlowExtKt.collectAsStateWithLifecycle(((sd) mainComposeActivity.M.getValue()).f50389a, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7).getValue();
                    boolean zH4 = sVar2.h(mainComposeActivity);
                    Object objQ5 = sVar2.Q();
                    if (zH4 || objQ5 == gVar) {
                        objQ5 = new d1(15, mainComposeActivity, a1Var);
                        sVar2.o0(objQ5);
                    }
                    fz.c cVar2 = (fz.c) objQ5;
                    boolean zH5 = sVar2.h(mainComposeActivity);
                    Object objQ6 = sVar2.Q();
                    if (zH5 || objQ6 == gVar) {
                        objQ6 = new br.f(mainComposeActivity, i12);
                        sVar2.o0(objQ6);
                    }
                    fz.a aVar = (fz.a) objQ6;
                    boolean zH6 = sVar2.h(mainComposeActivity);
                    Object objQ7 = sVar2.Q();
                    if (zH6 || objQ7 == gVar) {
                        objQ7 = new br.f(mainComposeActivity, 3);
                        sVar2.o0(objQ7);
                    }
                    fz.a aVar2 = (fz.a) objQ7;
                    boolean zH7 = sVar2.h(mainComposeActivity) | sVar2.h(context);
                    Object objQ8 = sVar2.Q();
                    if (zH7 || objQ8 == gVar) {
                        objQ8 = new fz.c() { // from class: br.g
                            @Override // fz.c
                            public final Object invoke(Object obj6) {
                                int i15 = i13;
                                qy.b0 b0Var2 = qy.b0.f48488a;
                                Context context2 = context;
                                MainComposeActivity mainComposeActivity2 = mainComposeActivity;
                                switch (i15) {
                                    case 0:
                                        mh.b difficultyLevel = (mh.b) obj6;
                                        kotlin.jvm.internal.m.f(difficultyLevel, "difficultyLevel");
                                        int i16 = PdFeedDifficultyActivity.H;
                                        String difficulty = difficultyLevel.b();
                                        kotlin.jvm.internal.m.f(difficulty, "difficulty");
                                        kotlin.jvm.internal.m.f(context2, "context");
                                        Intent intent = new Intent(context2, (Class<?>) PdFeedDifficultyActivity.class);
                                        intent.putExtra(INTENTS.EXTRA_STRING, difficulty);
                                        mainComposeActivity2.startActivity(intent);
                                        break;
                                    case 1:
                                        CourseUnit courseUnit = (CourseUnit) obj6;
                                        kotlin.jvm.internal.m.f(courseUnit, "courseUnit");
                                        if (courseUnit.getUnitState() == UnitState.StateLocked) {
                                            Toast.makeText(context2, R.string.please_complete_previous_units_first, 0).show();
                                        } else {
                                            int i17 = CourseTestIndexActivity.N;
                                            long unitId = courseUnit.getUnitId();
                                            int testOutIndex = courseUnit.getTestOutIndex();
                                            kotlin.jvm.internal.m.f(context2, "context");
                                            Intent intent2 = new Intent(context2, (Class<?>) CourseTestIndexActivity.class);
                                            intent2.putExtra(INTENTS.EXTRA_LONG, unitId);
                                            intent2.putExtra(INTENTS.EXTRA_INT, testOutIndex);
                                            mainComposeActivity2.startActivity(intent2);
                                        }
                                        break;
                                    default:
                                        CourseUnit courseUnit2 = (CourseUnit) obj6;
                                        kotlin.jvm.internal.m.f(courseUnit2, "courseUnit");
                                        int i18 = CourseTestOutActivity.L;
                                        long jLongValue = ((Number) ry.m.q0(ks.b.n(courseUnit2.getLessonList()))).longValue();
                                        List<Long> unitIdList = courseUnit2.getUnitList();
                                        String str = courseUnit2.isTestOutReview() ? "COURSE_TEST_OUT_REVIEW" : "COURSE_TEST_OUT";
                                        kotlin.jvm.internal.m.f(context2, "context");
                                        kotlin.jvm.internal.m.f(unitIdList, "unitIdList");
                                        Intent intent3 = new Intent(context2, (Class<?>) CourseTestOutActivity.class);
                                        intent3.putExtra(INTENTS.EXTRA_LONG, jLongValue);
                                        intent3.putExtra(INTENTS.EXTRA_ARRAY_LIST, (Serializable) unitIdList);
                                        intent3.putExtra(INTENTS.EXTRA_STRING, str);
                                        mainComposeActivity2.startActivity(intent3);
                                        break;
                                }
                                return b0Var2;
                            }
                        };
                        sVar2.o0(objQ8);
                    }
                    fz.c cVar3 = (fz.c) objQ8;
                    boolean zH8 = sVar2.h(mainComposeActivity) | sVar2.h(context);
                    Object objQ9 = sVar2.Q();
                    if (zH8 || objQ9 == gVar) {
                        objQ9 = new fz.c() { // from class: br.g
                            @Override // fz.c
                            public final Object invoke(Object obj6) {
                                int i15 = i12;
                                qy.b0 b0Var2 = qy.b0.f48488a;
                                Context context2 = context;
                                MainComposeActivity mainComposeActivity2 = mainComposeActivity;
                                switch (i15) {
                                    case 0:
                                        mh.b difficultyLevel = (mh.b) obj6;
                                        kotlin.jvm.internal.m.f(difficultyLevel, "difficultyLevel");
                                        int i16 = PdFeedDifficultyActivity.H;
                                        String difficulty = difficultyLevel.b();
                                        kotlin.jvm.internal.m.f(difficulty, "difficulty");
                                        kotlin.jvm.internal.m.f(context2, "context");
                                        Intent intent = new Intent(context2, (Class<?>) PdFeedDifficultyActivity.class);
                                        intent.putExtra(INTENTS.EXTRA_STRING, difficulty);
                                        mainComposeActivity2.startActivity(intent);
                                        break;
                                    case 1:
                                        CourseUnit courseUnit = (CourseUnit) obj6;
                                        kotlin.jvm.internal.m.f(courseUnit, "courseUnit");
                                        if (courseUnit.getUnitState() == UnitState.StateLocked) {
                                            Toast.makeText(context2, R.string.please_complete_previous_units_first, 0).show();
                                        } else {
                                            int i17 = CourseTestIndexActivity.N;
                                            long unitId = courseUnit.getUnitId();
                                            int testOutIndex = courseUnit.getTestOutIndex();
                                            kotlin.jvm.internal.m.f(context2, "context");
                                            Intent intent2 = new Intent(context2, (Class<?>) CourseTestIndexActivity.class);
                                            intent2.putExtra(INTENTS.EXTRA_LONG, unitId);
                                            intent2.putExtra(INTENTS.EXTRA_INT, testOutIndex);
                                            mainComposeActivity2.startActivity(intent2);
                                        }
                                        break;
                                    default:
                                        CourseUnit courseUnit2 = (CourseUnit) obj6;
                                        kotlin.jvm.internal.m.f(courseUnit2, "courseUnit");
                                        int i18 = CourseTestOutActivity.L;
                                        long jLongValue = ((Number) ry.m.q0(ks.b.n(courseUnit2.getLessonList()))).longValue();
                                        List<Long> unitIdList = courseUnit2.getUnitList();
                                        String str = courseUnit2.isTestOutReview() ? "COURSE_TEST_OUT_REVIEW" : "COURSE_TEST_OUT";
                                        kotlin.jvm.internal.m.f(context2, "context");
                                        kotlin.jvm.internal.m.f(unitIdList, "unitIdList");
                                        Intent intent3 = new Intent(context2, (Class<?>) CourseTestOutActivity.class);
                                        intent3.putExtra(INTENTS.EXTRA_LONG, jLongValue);
                                        intent3.putExtra(INTENTS.EXTRA_ARRAY_LIST, (Serializable) unitIdList);
                                        intent3.putExtra(INTENTS.EXTRA_STRING, str);
                                        mainComposeActivity2.startActivity(intent3);
                                        break;
                                }
                                return b0Var2;
                            }
                        };
                        sVar2.o0(objQ9);
                    }
                    fz.c cVar4 = (fz.c) objQ9;
                    boolean zH9 = sVar2.h(mainComposeActivity);
                    Object objQ10 = sVar2.Q();
                    if (zH9 || objQ10 == gVar) {
                        objQ10 = new br.f(mainComposeActivity, i13);
                        sVar2.o0(objQ10);
                    }
                    ch.l.b(courseUiState, cVar2, aVar, aVar2, cVar3, cVar4, (fz.a) objQ10, sVar2, 0);
                    sVar2.p(true);
                    sVar2.p(false);
                } else {
                    sVar2.d0(581573787);
                    if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(((o0) mainComposeActivity.l()).f27733a.keyLanguage))) {
                        sVar2.d0(581621465);
                        boolean zH10 = sVar2.h(mainComposeActivity);
                        Object objQ11 = sVar2.Q();
                        if (zH10 || objQ11 == gVar) {
                            objQ11 = new br.h(mainComposeActivity, i13);
                            sVar2.o0(objQ11);
                        }
                        vr.i.c(null, (fz.c) objQ11, null, sVar2, 0);
                        sVar2.p(false);
                    } else {
                        sVar2.d0(581993310);
                        z1.r rVarD2 = e2.d(oVar, 1.0f);
                        Bundle EMPTY2 = Bundle.EMPTY;
                        kotlin.jvm.internal.m.e(EMPTY2, "EMPTY");
                        Object objQ12 = sVar2.Q();
                        if (objQ12 == gVar) {
                            objQ12 = new br.b(i12);
                            sVar2.o0(objQ12);
                        }
                        ub.a.H(hp.d.class, rVarD2, null, EMPTY2, (fz.c) objQ12, sVar2, 24624, 4);
                        sVar2.p(false);
                    }
                    sVar2.p(false);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                bt.b.b((CourseCharacter) obj5, (ht.o) obj4, (d0) obj3, (l1.n) obj, t.M(1));
                break;
            case 6:
                u uVar = (u) obj5;
                d0 d0Var = (d0) obj4;
                ot.a aVar3 = (ot.a) obj3;
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sVar3.W();
                } else if (!((Boolean) sVar3.j(ju.f.f37373g)).booleanValue()) {
                    sVar3.d0(975793015);
                    j0.c.g(sVar3, e2.g(oVar, 12));
                    z1.r rVarN = e2.n(oVar, 72);
                    boolean z11 = uVar.f37192d.getValue() instanceof ht.c;
                    boolean zH11 = sVar3.h(d0Var) | sVar3.h(aVar3) | sVar3.h(uVar);
                    Object objQ13 = sVar3.Q();
                    if (zH11 || objQ13 == gVar) {
                        objQ13 = new j0(d0Var, aVar3, uVar, 1);
                        sVar3.o0(objQ13);
                    }
                    a0.f(rVarN, CropImageView.DEFAULT_ASPECT_RATIO, z11, (fz.a) objQ13, sVar3, 6, 2);
                    ep.a.C(oVar, 26, sVar3, false);
                } else {
                    sVar3.d0(974905981);
                    ht.q qVar = (ht.q) uVar.f37191c.getValue();
                    ht.l lVar = (ht.l) uVar.f37192d.getValue();
                    boolean zH12 = sVar3.h(d0Var);
                    Object objQ14 = sVar3.Q();
                    if (zH12 || objQ14 == gVar) {
                        objQ14 = new bt.l(d0Var, 6);
                        sVar3.o0(objQ14);
                    }
                    fz.a aVar4 = (fz.a) objQ14;
                    boolean zH13 = sVar3.h(d0Var) | sVar3.h(aVar3) | sVar3.h(uVar);
                    Object objQ15 = sVar3.Q();
                    if (zH13 || objQ15 == gVar) {
                        objQ15 = new j0(d0Var, aVar3, uVar, 0);
                        sVar3.o0(objQ15);
                    }
                    dt.e.o(qVar, lVar, aVar4, (fz.a) objQ15, sVar3, 0);
                    sVar3.p(false);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                bt.b.e((ot.a) obj5, (ht.o) obj4, (d0) obj3, (l1.n) obj, t.M(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                bt.b.m((ot.c) obj5, (ht.o) obj4, (d0) obj3, (l1.n) obj, t.M(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                d3.c((ot.f) obj5, (ht.o) obj4, (d0) obj3, (l1.n) obj, t.M(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                bt.b.p((ot.h) obj5, (ht.o) obj4, (d0) obj3, (l1.n) obj, t.M(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                bt.b.u((ot.l) obj5, (ht.o) obj4, (d0) obj3, (l1.n) obj, t.M(1));
                break;
            case 12:
                b1 b1Var2 = (b1) obj5;
                ht.o oVar2 = (ht.o) obj4;
                fz.e eVar = (fz.e) obj3;
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (!sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    sVar4.W();
                } else {
                    float f5 = 26;
                    j0.c.g(sVar4, e2.g(oVar, f5));
                    List list = (List) b1Var2.getValue();
                    boolean z12 = !oVar2.f33757e;
                    boolean zF = sVar4.f(eVar);
                    Object objQ16 = sVar4.Q();
                    if (zF || objQ16 == gVar) {
                        objQ16 = new p1(6, eVar);
                        sVar4.o0(objQ16);
                    }
                    d4.a(list, null, null, z12, false, null, null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, (fz.c) objQ16, sVar4, 0, 0, 0, 2097142);
                    j0.c.g(sVar4, e2.g(oVar, f5));
                }
                break;
            case 13:
                b1 b1Var3 = (b1) obj5;
                l0 l0Var = (l0) obj4;
                rz.b0 b0Var2 = (rz.b0) obj3;
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar5;
                if (!sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    sVar5.W();
                } else {
                    List list2 = (List) b1Var3.getValue();
                    boolean z13 = l0Var.f37025c;
                    boolean zH14 = sVar5.h(b0Var2) | sVar5.h(l0Var);
                    Object objQ17 = sVar5.Q();
                    if (zH14 || objQ17 == gVar) {
                        objQ17 = new d1(17, b0Var2, l0Var);
                        sVar5.o0(objQ17);
                    }
                    bt.b.t(list2, z13, (fz.c) objQ17, sVar5, 0);
                }
                break;
            case 14:
                b1 b1Var4 = (b1) obj5;
                l1.g1 g1Var = (l1.g1) obj4;
                l1.g1 g1Var2 = (l1.g1) obj3;
                s2.t change = (s2.t) obj;
                f2.b bVar = (f2.b) obj2;
                kotlin.jvm.internal.m.f(change, "change");
                change.a();
                g1Var.m(Float.intBitsToFloat((int) (bVar.f26570a >> 32)) + g1Var.l());
                g1Var2.m(Float.intBitsToFloat((int) (bVar.f26570a & 4294967295L)) + g1Var2.l());
                h2 h2Var = (h2) b1Var4.getValue();
                b1Var4.setValue(h2Var != null ? h2.a(h2Var, (((long) Float.floatToRawIntBits(g1Var.l())) << 32) | (((long) Float.floatToRawIntBits(g1Var2.l())) & 4294967295L), 0L, 13) : null);
                break;
            case 15:
                ((Integer) obj2).getClass();
                bt.b.D((ot.s) obj5, (ht.o) obj4, (d0) obj3, (l1.n) obj, t.M(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                bt.b.F((ot.u) obj5, (ht.o) obj4, (d0) obj3, (l1.n) obj, t.M(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                bt.b.H((w) obj5, (ht.o) obj4, (d0) obj3, (l1.n) obj, t.M(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                bt.b.J((t1) obj5, (ht.o) obj4, (d0) obj3, (l1.n) obj, t.M(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                bt.b.a0((x1) obj5, (ht.o) obj4, (d0) obj3, (l1.n) obj, t.M(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                e8.a((z1) obj5, (ht.o) obj4, (d0) obj3, (l1.n) obj, t.M(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                int i15 = GRKSyllableIntroductionActivity.H;
                ((GRKSyllableIntroductionActivity) obj5).t((List) obj4, (fz.c) obj3, (l1.n) obj, t.M(7));
                break;
            case 22:
                ((Integer) obj2).getClass();
                y4.e((ExoPlayer) obj5, (fz.c) obj3, (fz.a) obj4, (l1.n) obj, t.M(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                z.a((z1.r) obj5, (ei.h) obj4, (fz.c) obj3, (l1.n) obj, t.M(7));
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((Integer) obj2).getClass();
                ei.s.a((fz.a) obj5, (z1.r) obj4, (gi.d) obj3, (l1.n) obj, t.M(1));
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((Integer) obj2).getClass();
                en.e.a((fz.a) obj5, (z1.r) obj4, (gn.e) obj3, (l1.n) obj, t.M(1));
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ((Integer) obj2).getClass();
                es.j.c((fz.c) obj3, (fz.a) obj5, (js.g) obj4, (l1.n) obj, t.M(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                es.j.b((js.c) obj5, (fz.c) obj3, (z1.r) obj4, (l1.n) obj, t.M(1));
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                n0 n0Var = (n0) obj5;
                x xVar = (x) obj4;
                n9.q qVar2 = (n9.q) obj3;
                s2.t tVar = (s2.t) obj;
                f2.b bVar2 = (f2.b) obj2;
                long jX = y2.f.w(n0Var).x(0L);
                if (!f2.b.c(jX, xVar.f38360a)) {
                    n0Var.Z = f2.b.h(n0Var.Z, f2.b.g(jX, xVar.f38360a));
                }
                xVar.f38360a = jX;
                g0.f(qVar2, tVar, n0Var.Z);
                tz.h hVar2 = n0Var.W;
                if (hVar2 != null) {
                    hVar2.i(new f0.p(bVar2.f26570a));
                }
                break;
            default:
                v vVar = (v) obj5;
                i2 i2Var = (i2) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jH = i2Var.h(i2Var.d(fFloatValue - vVar.f38358a));
                i2 i2Var2 = ((g2) obj3).f26286a;
                vVar.f38358a += i2Var.d(i2Var.g(i2Var2.c(i2Var2.f26315k, jH, 1)));
                break;
        }
        return b0Var;
    }

    public /* synthetic */ i(Object obj, fz.c cVar, Object obj2, int i11, int i12) {
        this.f2884a = i12;
        this.f2886c = obj;
        this.f2885b = cVar;
        this.f2887d = obj2;
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i11) {
        this.f2884a = i11;
        this.f2886c = obj;
        this.f2887d = obj2;
        this.f2885b = obj3;
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i11, int i12) {
        this.f2884a = i12;
        this.f2886c = obj;
        this.f2887d = obj2;
        this.f2885b = obj3;
    }
}
