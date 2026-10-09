package at;

import android.content.Context;
import android.os.Bundle;
import bp.g1;
import bt.k0;
import bt.t3;
import com.google.api.Service;
import com.lingo.course.ui.CourseACKActivity;
import com.lingo.course.ui.CourseFlashCardIndexActivity;
import com.lingo.course.ui.CourseListenAlongActivity;
import com.lingo.course.ui.CourseReviewListActivity;
import com.lingo.course.ui.CourseReviewTestActivity;
import com.lingo.course.ui.CourseTestActivity;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.lingoskill.ui.base.AboutLingodeerActivity;
import com.lingo.lingoskill.ui.base.BackupDownloadActivity;
import com.lingo.lingoskill.ui.base.ConfirmLevelActivity;
import com.lingo.lingoskill.ui.base.FindPasswordActivity;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.base.LoginCheckLocateAgeActivity;
import com.lingo.lingoskill.ui.base.LoginCheckParentInfoActivity;
import com.lingo.lingoskill.ui.base.RemindIndexActivity;
import com.lingo.lingoskill.ui.base.SignUpActivity;
import com.lingo.main.ui.MainComposeActivity;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseWord;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dt.d4;
import fr.j3;
import g2.f0;
import h1.k7;
import h1.s1;
import h1.v1;
import j0.e2;
import j3.y0;
import java.util.List;
import jt.h0;
import jt.h2;
import jt.l0;
import jt.u;
import l1.b1;
import l1.c3;
import l1.q1;
import l1.t;
import qy.b0;
import rt.sf;
import w2.q0;
import ys.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2883c;

    public /* synthetic */ h(int i11, Object obj, Object obj2) {
        this.f2881a = i11;
        this.f2883c = obj;
        this.f2882b = obj2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        y0 y0VarA;
        z1.o oVar;
        int i11 = this.f2881a;
        int i12 = 17;
        l1.g gVar = l1.m.f39353a;
        b0 b0Var = b0.f48488a;
        Object obj3 = this.f2882b;
        Object obj4 = this.f2883c;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                b.b((CourseLesson) obj4, (fz.c) obj3, (l1.n) obj, t.M(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                b.f((sf) obj4, (fz.c) obj3, (l1.n) obj, t.M(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int i13 = AboutLingodeerActivity.f22038t;
                ((AboutLingodeerActivity) obj4).j((Bundle) obj3, (l1.n) obj, t.M(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int i14 = BackupDownloadActivity.K;
                ((BackupDownloadActivity) obj4).j((Bundle) obj3, (l1.n) obj, t.M(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int i15 = ConfirmLevelActivity.H;
                ((ConfirmLevelActivity) obj4).j((Bundle) obj3, (l1.n) obj, t.M(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                int i16 = FindPasswordActivity.K;
                ((FindPasswordActivity) obj4).j((Bundle) obj3, (l1.n) obj, t.M(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                int i17 = LoginActivity.Q;
                ((LoginActivity) obj4).p((wu.o) obj3, (l1.n) obj, t.M(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                int i18 = LoginCheckLocateAgeActivity.L;
                ((LoginCheckLocateAgeActivity) obj4).j((Bundle) obj3, (l1.n) obj, t.M(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                g1.l((fz.a) obj4, (fz.c) obj3, (l1.n) obj, t.M(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                int i19 = LoginCheckParentInfoActivity.L;
                ((LoginCheckParentInfoActivity) obj4).j((Bundle) obj3, (l1.n) obj, t.M(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                int i21 = RemindIndexActivity.f22045t;
                ((RemindIndexActivity) obj4).j((Bundle) obj3, (l1.n) obj, t.M(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                int i22 = SignUpActivity.L;
                ((SignUpActivity) obj4).j((Bundle) obj3, (l1.n) obj, t.M(1));
                break;
            case 12:
                LanguageItem languageItem = (LanguageItem) obj;
                String source = (String) obj2;
                kotlin.jvm.internal.m.f(languageItem, "languageItem");
                kotlin.jvm.internal.m.f(source, "source");
                int i23 = SwitchLanguageActivity.M;
                ((MainComposeActivity) obj4).startActivity(tw.c.p((Context) obj3, languageItem, true, source));
                break;
            case 13:
                ((Integer) obj2).getClass();
                int i24 = MainComposeActivity.U;
                ((MainComposeActivity) obj4).j((Bundle) obj3, (l1.n) obj, t.M(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                br.e.g((MainComposeActivity) obj4, (fz.a) obj3, (l1.n) obj, t.M(1));
                break;
            case 15:
                d0 d0Var = (d0) obj4;
                u uVar = (u) obj3;
                List audioPath = (List) obj;
                ht.l audioPlayingState = (ht.l) obj2;
                kotlin.jvm.internal.m.f(audioPath, "audioPath");
                kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
                if (d0Var != null) {
                    jh.h.m(d0Var, audioPath, audioPlayingState, new k0(uVar, 0));
                }
                break;
            case 16:
                d0 d0Var2 = (d0) obj4;
                h0 h0Var = (h0) obj3;
                List audioPath2 = (List) obj;
                ht.l audioPlayingState2 = (ht.l) obj2;
                kotlin.jvm.internal.m.f(audioPath2, "audioPath");
                kotlin.jvm.internal.m.f(audioPlayingState2, "audioPlayingState");
                if (d0Var2 != null) {
                    jh.h.m(d0Var2, audioPath2, audioPlayingState2, new a00.c(h0Var, 14));
                }
                break;
            case 17:
                d0 d0Var3 = (d0) obj4;
                jt.k0 k0Var = (jt.k0) obj3;
                String audioPath3 = (String) obj;
                ht.l audioPlayingState3 = (ht.l) obj2;
                kotlin.jvm.internal.m.f(audioPath3, "audioPath");
                kotlin.jvm.internal.m.f(audioPlayingState3, "audioPlayingState");
                if (d0Var3 != null) {
                    jh.h.m(d0Var3, ns.o.K(audioPath3), audioPlayingState3, new t3(k0Var, 0));
                }
                break;
            case 18:
                d0 d0Var4 = (d0) obj4;
                l0 l0Var = (l0) obj3;
                List audioPath4 = (List) obj;
                ht.l audioPlayingState4 = (ht.l) obj2;
                kotlin.jvm.internal.m.f(audioPath4, "audioPath");
                kotlin.jvm.internal.m.f(audioPlayingState4, "audioPlayingState");
                if (d0Var4 != null) {
                    jh.h.m(d0Var4, audioPath4, audioPlayingState4, new a00.c(l0Var, 15));
                }
                break;
            case 19:
                h2 h2Var = (h2) obj4;
                b1 b1Var = (b1) obj3;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarD = e2.d(oVar2, 1.0f);
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarD);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    t.J(y2.j.f56917f, q0VarD, sVar);
                    t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    t.J(y2.j.f56915d, rVarC, sVar);
                    z1.r rVarX = j0.c.x(z1.a.d(oVar2, 1.0f), -iu.k.s(Float.intBitsToFloat((int) (((f2.b) b1Var.getValue()).f26570a >> 32)), sVar), -iu.k.s(Float.intBitsToFloat((int) (((f2.b) b1Var.getValue()).f26570a & 4294967295L)), sVar));
                    boolean zH = sVar.h(h2Var);
                    Object objQ = sVar.Q();
                    if (zH || objQ == gVar) {
                        objQ = new a00.c(h2Var, 16);
                        sVar.o0(objQ);
                    }
                    z1.r rVarQ = f0.q(rVarX, (fz.c) objQ);
                    c3 c3Var = v1.f31180a;
                    k7.d(rVarQ, null, k7.p(((s1) sVar.j(c3Var)).f31033p, sVar, 0), null, d0.n.a(((s1) sVar.j(c3Var)).A, 2), t1.e.d(-1400151289, new a00.b(h2Var, 4), sVar), sVar, 196608, 10);
                    sVar.p(true);
                }
                break;
            case 20:
                d0 d0Var5 = (d0) obj4;
                jt.q1 q1Var = (jt.q1) obj3;
                String audioPath5 = (String) obj;
                ht.l audioPlayingState5 = (ht.l) obj2;
                kotlin.jvm.internal.m.f(audioPath5, "audioPath");
                kotlin.jvm.internal.m.f(audioPlayingState5, "audioPlayingState");
                if (d0Var5 != null) {
                    jh.h.m(d0Var5, ns.o.K(audioPath5), audioPlayingState5, new a00.c(q1Var, i12));
                }
                break;
            case 21:
                ((Integer) obj2).getClass();
                bt.b.i((ht.o) obj4, (d0) obj3, (l1.n) obj, t.M(1));
                break;
            case 22:
                ht.o oVar3 = (ht.o) obj4;
                CourseWord courseWordCopy$default = (CourseWord) obj3;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    boolean z11 = oVar3.f33760h;
                    boolean z12 = oVar3.f33759g;
                    z1.o oVar4 = z1.o.f58481a;
                    if (z11 && oVar3.f33755c == 3) {
                        sVar2.d0(795942236);
                        sVar2.p(false);
                        oVar = oVar4;
                    } else {
                        sVar2.d0(804479915);
                        j0.c.g(sVar2, e2.g(oVar4, 26));
                        if (z12 || oVar3.f33760h) {
                            sVar2.d0(804607263);
                            y0 y0VarF = d4.f(sVar2);
                            long jE = ct.c.e(sVar2);
                            j3.i(jE);
                            y0VarA = y0.a(y0VarF, 0L, j3.L(1095216660480L & jE, (float) (((double) v3.o.c(jE)) * 2.3d)), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744441);
                            sVar2.p(false);
                        } else {
                            sVar2.d0(804889673);
                            y0VarA = d4.f(sVar2);
                            sVar2.p(false);
                        }
                        if (z12) {
                            courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -13, 63, null);
                        }
                        List listK = ns.o.K(courseWordCopy$default);
                        Object objQ2 = sVar2.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new br.b(i12);
                            sVar2.o0(objQ2);
                        }
                        oVar = oVar4;
                        d4.a(listK, oVar, null, false, false, y0VarA, null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, (fz.c) objQ2, sVar2, 3120, 0, 48, 2097108);
                        sVar2.p(false);
                    }
                    j0.c.g(sVar2, e2.g(oVar, 26));
                }
                break;
            case 23:
                d0 d0Var6 = (d0) obj4;
                b1 b1Var2 = (b1) obj3;
                String audioPath6 = (String) obj;
                ht.l state = (ht.l) obj2;
                kotlin.jvm.internal.m.f(audioPath6, "audioPath");
                kotlin.jvm.internal.m.f(state, "state");
                if (d0Var6 != null) {
                    jh.h.m(d0Var6, ns.o.K(audioPath6), state, new bp.h0(8, b1Var2));
                }
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((Integer) obj2).getClass();
                int i25 = CourseACKActivity.f21611t;
                ((CourseACKActivity) obj4).j((Bundle) obj3, (l1.n) obj, t.M(1));
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((Integer) obj2).getClass();
                int i26 = CourseFlashCardIndexActivity.f21612t;
                ((CourseFlashCardIndexActivity) obj4).j((Bundle) obj3, (l1.n) obj, t.M(1));
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ((Integer) obj2).getClass();
                int i27 = CourseListenAlongActivity.f21613t;
                ((CourseListenAlongActivity) obj4).j((Bundle) obj3, (l1.n) obj, t.M(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                int i28 = CourseReviewListActivity.L;
                ((CourseReviewListActivity) obj4).j((Bundle) obj3, (l1.n) obj, t.M(1));
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                int i29 = CourseReviewTestActivity.M;
                ((CourseReviewTestActivity) obj4).j((Bundle) obj3, (l1.n) obj, t.M(1));
                break;
            default:
                ((Integer) obj2).getClass();
                int i30 = CourseTestActivity.R;
                ((CourseTestActivity) obj4).j((Bundle) obj3, (l1.n) obj, t.M(1));
                break;
        }
        return b0Var;
    }

    public /* synthetic */ h(Object obj, int i11, int i12, Object obj2) {
        this.f2881a = i12;
        this.f2883c = obj;
        this.f2882b = obj2;
    }
}
