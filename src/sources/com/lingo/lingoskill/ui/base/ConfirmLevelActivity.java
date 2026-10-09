package com.lingo.lingoskill.ui.base;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e1;
import app.rive.runtime.kotlin.core.a;
import at.h;
import b0.a1;
import bp.g1;
import bp.m1;
import com.bumptech.glide.e;
import com.lingo.course.ui.CourseTestActivity;
import com.lingo.course.ui.CourseTestOutActivity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Lesson;
import com.lingo.lingoskill.object.Unit;
import com.lingo.lingoskill.ui.base.ConfirmLevelActivity;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import i.c;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.m;
import l1.g;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import oz.x;
import qy.b0;
import qy.l;
import rz.e0;
import rz.o0;
import xg.d;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmLevelActivity extends d {
    public static final /* synthetic */ int H = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f22040t = registerForActivityResult(new e1(4), new a(this, 3));

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object p(ConfirmLevelActivity confirmLevelActivity, int i11, Env env, xy.c cVar) {
        m1 m1Var;
        c cVar2 = confirmLevelActivity.f22040t;
        if (cVar instanceof m1) {
            m1Var = (m1) cVar;
            int i12 = m1Var.f4707c;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                m1Var.f4707c = i12 - Integer.MIN_VALUE;
            } else {
                m1Var = new m1(confirmLevelActivity, cVar);
            }
        } else {
            m1Var = new m1(confirmLevelActivity, cVar);
        }
        Object objM = m1Var.f4705a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = m1Var.f4707c;
        if (i13 == 0) {
            e.F(objM);
            f fVar = o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            a1 a1Var = new a1(env, i11, null, 4);
            m1Var.f4707c = 1;
            objM = e0.M(eVar, a1Var, m1Var);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.F(objM);
        }
        l lVar = (l) objM;
        Unit unit = (Unit) lVar.f48495a;
        Lesson lesson = (Lesson) lVar.f48496b;
        String unitName = unit.getUnitName();
        m.e(unitName, "getUnitName(...)");
        if (x.s0(unitName, "TESTOUT", false)) {
            long lessonId = lesson.getLessonId();
            List<Long> unitList = unit.getUnitList();
            m.e(unitList, "getUnitList(...)");
            Intent intent = new Intent(confirmLevelActivity, (Class<?>) CourseTestOutActivity.class);
            intent.putExtra(INTENTS.EXTRA_LONG, lessonId);
            intent.putExtra(INTENTS.EXTRA_ARRAY_LIST, (Serializable) unitList);
            intent.putExtra(INTENTS.EXTRA_STRING, "test_out");
            cVar2.a(intent);
        } else {
            long lessonId2 = lesson.getLessonId();
            long unitId = unit.getUnitId();
            int sortIndex = lesson.getSortIndex();
            int sortIndex2 = unit.getSortIndex();
            Intent intent2 = new Intent(confirmLevelActivity, (Class<?>) CourseTestActivity.class);
            intent2.putExtra(INTENTS.EXTRA_LONG, lessonId2);
            intent2.putExtra(INTENTS.EXTRA_LONG_2, unitId);
            intent2.putExtra(INTENTS.EXTRA_INT, sortIndex);
            intent2.putExtra(INTENTS.EXTRA_INT_2, sortIndex2);
            intent2.putExtra(INTENTS.EXTRA_BOOLEAN_2, false);
            intent2.putExtra(INTENTS.EXTRA_STRING, "classic");
            cVar2.a(intent2);
        }
        return b0.f48488a;
    }

    public static final String q(ConfirmLevelActivity confirmLevelActivity) {
        String stringExtra = confirmLevelActivity.getIntent().getStringExtra("source");
        return stringExtra == null ? BuildConfig.VERSION_NAME : stringExtra;
    }

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1939379577);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF = sVar.f(null) | sVar.f(aVarC);
            Object objQ = sVar.Q();
            g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = w4.c.e(Env.class, aVarC, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            final Env env = (Env) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = t.q(sVar);
                sVar.o0(objQ2);
            }
            final rz.b0 b0Var = (rz.b0) objQ2;
            boolean zH = sVar.h(b0Var) | sVar.h(this) | sVar.h(env);
            Object objQ3 = sVar.Q();
            if (zH || objQ3 == gVar) {
                final int i13 = 0;
                objQ3 = new fz.a() { // from class: bp.i1
                    @Override // fz.a
                    public final Object invoke() {
                        int i14 = i13;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        vy.d dVar = null;
                        Env env2 = env;
                        ConfirmLevelActivity confirmLevelActivity = this;
                        rz.b0 b0Var3 = b0Var;
                        switch (i14) {
                            case 0:
                                int i15 = ConfirmLevelActivity.H;
                                rz.e0.B(b0Var3, null, null, new l1(confirmLevelActivity, env2, dVar, 0), 3);
                                break;
                            default:
                                int i16 = ConfirmLevelActivity.H;
                                rz.e0.B(b0Var3, null, null, new l1(confirmLevelActivity, env2, dVar, 1), 3);
                                break;
                        }
                        return b0Var2;
                    }
                };
                sVar.o0(objQ3);
            }
            fz.a aVar = (fz.a) objQ3;
            boolean zH2 = sVar.h(b0Var) | sVar.h(this) | sVar.h(env);
            Object objQ4 = sVar.Q();
            if (zH2 || objQ4 == gVar) {
                final int i14 = 1;
                objQ4 = new fz.a() { // from class: bp.i1
                    @Override // fz.a
                    public final Object invoke() {
                        int i15 = i14;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        vy.d dVar = null;
                        Env env2 = env;
                        ConfirmLevelActivity confirmLevelActivity = this;
                        rz.b0 b0Var3 = b0Var;
                        switch (i15) {
                            case 0:
                                int i16 = ConfirmLevelActivity.H;
                                rz.e0.B(b0Var3, null, null, new l1(confirmLevelActivity, env2, dVar, 0), 3);
                                break;
                            default:
                                int i17 = ConfirmLevelActivity.H;
                                rz.e0.B(b0Var3, null, null, new l1(confirmLevelActivity, env2, dVar, 1), 3);
                                break;
                        }
                        return b0Var2;
                    }
                };
                sVar.o0(objQ4);
            }
            g1.c(aVar, (fz.a) objQ4, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(this, i11, 4, bundle);
        }
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public final void onResume() {
        super.onResume();
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().keyLanguage == 3) {
            m().d("EnSelectLearnerLevel");
        }
    }
}
