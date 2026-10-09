package ch;

import a0.f1;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import bt.z7;
import com.google.accompanist.permissions.MutablePermissionState;
import com.google.accompanist.permissions.PermissionsUtilKt;
import com.google.api.Service;
import com.lingo.course.ui.CourseTestDialogueActivity;
import com.lingo.course.ui.CourseTestExamActivity;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingo.course.ui.CourseTipsActivity;
import com.lingo.lingoskill.ar.ui.syllable.ARSyllableTableActivity;
import com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity;
import com.lingo.lingoskill.koreanskill.ui.syllable.ui.KOYinTuActivity;
import com.lingo.me.MeAccountSettingsActivity;
import com.lingo.me.MeAchievementAllLanguageActivity;
import com.lingo.me.MeAchievementLanguageDetailActivity;
import com.lingo.me.MeAchievementLeaderBoardDetailActivity;
import com.lingo.me.MeAchievementLevelDetailActivity;
import com.lingo.me.MeAchievementRecordDetailActivity;
import com.lingo.me.MeFollowingFollowerActivity;
import com.lingo.me.MeSettingsActivity;
import com.lingo.me.MeSetupDailyGoalActivity;
import com.lingo.me.OfflineAllActivity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import d1.z0;
import f0.n1;
import h1.k7;
import h1.ua;
import h1.yb;
import j0.a2;
import j0.e2;
import j0.z1;
import j3.x0;
import j3.y0;
import l1.a1;
import l1.b1;
import l1.c3;
import l1.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7120c;

    public /* synthetic */ z(int i11, Object obj, Object obj2) {
        this.f7118a = i11;
        this.f7120c = obj;
        this.f7119b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f7118a;
        l1.g gVar = l1.m.f39353a;
        x0 x0Var = null;
        int i12 = 2;
        int i13 = 1;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj3 = this.f7119b;
        Object obj4 = this.f7120c;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                int i14 = CourseTestDialogueActivity.L;
                ((CourseTestDialogueActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int i15 = CourseTestExamActivity.H;
                ((CourseTestExamActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int i16 = CourseTestIndexActivity.N;
                ((CourseTestIndexActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int i17 = CourseTipsActivity.K;
                ((CourseTipsActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int i18 = ARSyllableTableActivity.H;
                ((ARSyllableTableActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                PermissionsUtilKt.a((MutablePermissionState) obj4, (Lifecycle.Event) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                int i19 = MeAccountSettingsActivity.R;
                ((MeAccountSettingsActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                int i21 = MeAchievementAllLanguageActivity.H;
                ((MeAchievementAllLanguageActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                int i22 = MeAchievementLanguageDetailActivity.H;
                ((MeAchievementLanguageDetailActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                int i23 = MeAchievementLeaderBoardDetailActivity.H;
                ((MeAchievementLeaderBoardDetailActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                int i24 = MeAchievementLevelDetailActivity.H;
                ((MeAchievementLevelDetailActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                int i25 = MeAchievementRecordDetailActivity.H;
                ((MeAchievementRecordDetailActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                int i26 = MeFollowingFollowerActivity.H;
                ((MeFollowingFollowerActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                int i27 = MeSettingsActivity.f22221t;
                ((MeSettingsActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                int i28 = MeSetupDailyGoalActivity.f22222t;
                ((MeSetupDailyGoalActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                int i29 = OfflineAllActivity.f22223t;
                ((OfflineAllActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ct.c.a((vt.n0) obj4, (t1.d) obj3, (l1.n) obj, l1.t.M(49));
                break;
            case 17:
                z0 z0Var = (z0) obj4;
                rz.b0 b0Var2 = (rz.b0) obj3;
                u0.a aVar = (u0.a) obj;
                Context context = (Context) obj2;
                boolean zBooleanValue = ((Boolean) z0Var.m.getValue()).booleanValue();
                j3.h hVarL = z0Var.l();
                String str = hVarL != null ? hVarL.f35700b : null;
                x0 x0Var2 = z0Var.f23058w;
                if (x0Var2 != null) {
                    long j11 = x0Var2.f35823a;
                    o3.p pVar = z0Var.f23038b;
                    x0Var = new x0(j3.t.b(pVar.s((int) (j11 >> 32)), pVar.s((int) (j11 & 4294967295L))));
                }
                d1.m mVar = z0Var.f23046j;
                aj.c cVar = new aj.c(z0Var, b0Var2, context, 22);
                c3 c3Var = d1.s.f22986a;
                if (Build.VERSION.SDK_INT < 28 || str == null || x0Var == null || mVar == null || !(mVar instanceof d1.r)) {
                    cVar.invoke(aVar);
                    if (str != null && x0Var != null) {
                        t0.a.a(aVar, context, zBooleanValue, str, x0Var.f35823a);
                    }
                } else {
                    String str2 = str;
                    ((d1.r) mVar).b(aVar, str2, x0Var.f35823a, cVar);
                    t0.a.a(aVar, context, zBooleanValue, str2, x0Var.f35823a);
                }
                break;
            case 18:
                ((Integer) obj2).getClass();
                int i30 = GRKSyllableIntroductionActivity.H;
                ((GRKSyllableIntroductionActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                dt.e.d((ns.v) obj4, (z1.r) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                dt.e.h((ns.c0) obj4, (z1.r) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 21:
                y0 y0Var = (y0) obj4;
                t1.d dVar = (t1.d) obj3;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    l1.t.a(ua.f31167a.a(y0Var), t1.e.d(-1874915834, new br.m(dVar, 4), sVar), sVar, 56);
                }
                break;
            case 22:
                fz.a aVar2 = (fz.a) obj4;
                t1.d dVar2 = (t1.d) obj3;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarV = j0.c.v(e2.e(oVar, 1.0f));
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, rVarV);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    y2.h hVar = y2.j.f56917f;
                    l1.t.J(hVar, uVarA, sVar2);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar2);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar2);
                    a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar2, 0);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    q1 q1VarL2 = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, oVar);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar, a2VarA, sVar2);
                    l1.t.J(hVar2, q1VarL2, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC2, sVar2);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    w4.c.r(1.0f, true, sVar2);
                    k7.h(aVar2, null, false, null, dt.e.m, sVar2, 196608, 30);
                    sVar2.p(true);
                    z1.r rVarE = e2.e(oVar, 1.0f);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    q1 q1VarL3 = sVar2.l();
                    z1.r rVarC3 = z1.a.c(sVar2, rVarE);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar, q0VarD, sVar2);
                    l1.t.J(hVar2, q1VarL3, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
                    }
                    l1.t.J(hVar4, rVarC3, sVar2);
                    dVar2.invoke(sVar2, 0);
                    sVar2.p(true);
                    sVar2.p(true);
                }
                break;
            case 23:
                ((Integer) obj2).getClass();
                ((e0.e) obj4).a((e0.c) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                float f5 = vVar.f38358a;
                vVar.f38358a = ((n1) obj3).a(fFloatValue - f5) + f5;
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((Integer) obj2).getClass();
                int i31 = KOYinTuActivity.H;
                ((KOYinTuActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                fz.e eVar = (fz.e) obj4;
                yb ybVar = (yb) obj3;
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sVar3.W();
                } else {
                    boolean zF = sVar3.f(eVar) | sVar3.h(ybVar);
                    Object objQ = sVar3.Q();
                    if (zF || objQ == gVar) {
                        objQ = new fp.f((int) (null == true ? 1 : 0), (Object) eVar, (Object) ybVar);
                        sVar3.o0(objQ);
                    }
                    k7.m((fz.a) objQ, null, false, null, null, null, fp.a.f27352b, sVar3, 805306368, 510);
                }
                break;
            case 27:
                ((Integer) obj2).getClass();
                fp.a.a((fz.a) obj4, (gp.n0) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                b1 b1Var = (b1) obj4;
                a1 a1Var = (a1) obj3;
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (!sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    sVar4.W();
                } else {
                    Object objQ2 = sVar4.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new z7(b1Var, null == true ? 1 : 0, i12);
                        sVar4.o0(objQ2);
                    }
                    l1.t.f((fz.e) objQ2, b0Var, sVar4);
                    a0.j0.d(((Boolean) b1Var.getValue()).booleanValue(), null, f1.e(null, 3).a(f1.g(null, 0.8f, 5)), f1.f(null, 3).a(f1.h(null, 0.8f, 5)), BuildConfig.VERSION_NAME, t1.e.d(-1132774569, new w(a1Var, i13), sVar4), sVar4, 224640, 2);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                fu.a.e((hu.b) obj4, (z1.r) obj3, (l1.n) obj, l1.t.M(1));
                break;
        }
        return b0Var;
    }

    public /* synthetic */ z(Object obj, int i11, int i12, Object obj2) {
        this.f7118a = i12;
        this.f7120c = obj;
        this.f7119b = obj2;
    }
}
