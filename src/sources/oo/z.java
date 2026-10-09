package oo;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.speak.object.PodQuestion;
import com.lingo.lingoskill.speak.object.PodSentence;
import com.lingo.lingoskill.speak.ui.SpeakTestFinishActivity;
import com.lingodeer.data.model.INTENTS;
import hj.b5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import lf.x0;
import r.x2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f45711b;

    public /* synthetic */ z(d0 d0Var, int i11) {
        this.f45710a = i11;
        this.f45711b = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [vy.d] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f45710a;
        PodQuestion questions = 0;
        questions = 0;
        int i12 = 4;
        qy.b0 b0Var = qy.b0.f48488a;
        d0 d0Var = this.f45711b;
        switch (i11) {
            case 0:
                lc.d it = (lc.d) obj;
                kotlin.jvm.internal.m.f(it, "it");
                l.m mVar = d0Var.f36398d;
                if (mVar != null) {
                    mVar.finish();
                }
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(d0Var), null, null, new mv.f0(d0Var, questions, i12), 3);
                break;
            case 1:
                View it2 = (View) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                int i13 = d0Var.T;
                List list = d0Var.X;
                kotlin.jvm.internal.m.c(list);
                if (i13 < list.size()) {
                    th.e eVar = d0Var.O;
                    if (eVar != null) {
                        eVar.f52416c = new x0(d0Var, 10);
                    }
                    List list2 = d0Var.X;
                    kotlin.jvm.internal.m.c(list2);
                    PodSentence podSentence = (PodSentence) list2.get(d0Var.T);
                    String strO = xt.b.a().o();
                    String strM = md.a.m(d0Var.r(), d0Var.Y, podSentence.getSid());
                    kotlin.jvm.internal.m.c(strM);
                    String strM2 = defpackage.e.m(strO, strM);
                    th.e eVar2 = d0Var.O;
                    if (eVar2 != null) {
                        eVar2.m(d0Var.r().audioSpeed / 100.0f, false);
                    }
                    th.e eVar3 = d0Var.O;
                    kotlin.jvm.internal.m.c(eVar3);
                    eVar3.h(strM2);
                    d0Var.y();
                    ta.a aVar = d0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar);
                    android.support.v4.media.session.a.K(((b5) aVar).f32401g.getBackground());
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    dy.j jVar = ky.e.f38937b;
                    d0Var.S = qx.h.d(150L, 150L, timeUnit, jVar).k(jVar).g(px.b.a()).h(new ob.e(25, d0Var, podSentence), f.f45652f);
                }
                break;
            case 2:
                View it3 = (View) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                int i14 = d0Var.T;
                if (i14 >= 0) {
                    List list3 = d0Var.X;
                    kotlin.jvm.internal.m.c(list3);
                    if (i14 < list3.size()) {
                        List list4 = d0Var.X;
                        kotlin.jvm.internal.m.c(list4);
                        questions = ((PodSentence) list4.get(d0Var.T)).getQuestions();
                    }
                }
                int i15 = d0Var.T + 1;
                d0Var.T = i15;
                if (questions == 0) {
                    List list5 = d0Var.X;
                    kotlin.jvm.internal.m.c(list5);
                    if (i15 == list5.size()) {
                        l.m mVar2 = d0Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        int i16 = SpeakTestFinishActivity.Q;
                        l.m mVar3 = d0Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar3);
                        int i17 = d0Var.Y;
                        long j11 = d0Var.Z;
                        Intent intent = new Intent(mVar3, (Class<?>) SpeakTestFinishActivity.class);
                        intent.putExtra(INTENTS.EXTRA_INT, i17);
                        intent.putExtra(INTENTS.EXTRA_LONG, j11);
                        d0Var.startActivity(intent);
                    } else {
                        d0Var.z();
                    }
                } else {
                    ArrayList arrayList = d0Var.Q;
                    arrayList.clear();
                    d0Var.R = 0;
                    if (questions.getDetermine() != null) {
                        arrayList.addAll(questions.getDetermine());
                    }
                    if (questions.getSelect() != null) {
                        arrayList.addAll(questions.getSelect());
                    }
                    if (arrayList.size() <= 0) {
                        d0Var.z();
                    } else {
                        d0Var.B();
                    }
                }
                break;
            case 3:
                lc.d it4 = (lc.d) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                cj.c cVar = d0Var.P;
                if (cVar != null) {
                    cVar.e();
                }
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (cf.x.n().showStoryTrans) {
                    ta.a aVar2 = d0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar2);
                    ((b5) aVar2).f32404j.setVisibility(0);
                } else {
                    ta.a aVar3 = d0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar3);
                    ((b5) aVar3).f32404j.setVisibility(4);
                }
                x2 x2Var = d0Var.U;
                if (x2Var != null) {
                    x2Var.k();
                }
                break;
            default:
                View it5 = (View) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                int i18 = d0Var.T;
                if (i18 > 0) {
                    d0Var.T = i18 - 1;
                    d0Var.z();
                }
                break;
        }
        return b0Var;
    }
}
