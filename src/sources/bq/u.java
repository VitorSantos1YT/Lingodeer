package bq;

import b7.e0;
import bt.d3;
import bt.s5;
import bv.a0;
import bv.m0;
import bv.t0;
import com.google.api.Service;
import com.google.firebase.sessions.ProcessData$$serializer;
import com.google.firebase.sessions.SessionData;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingo.lingoskill.ar.ui.syllable.ARSyllableIntroductionActivity;
import com.lingo.lingoskill.ar.ui.syllable.ARSyllableTestIndexActivity;
import com.lingo.main.ui.MainComposeActivity;
import com.lingo.me.MeSettingsActivity;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.ConstantVowels;
import com.lingodeer.data.model.SerializableTimingResult;
import g00.g0;
import g00.t1;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4986a;

    public /* synthetic */ u(int i11) {
        this.f4986a = i11;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f4986a;
        b0 b0Var = b0.f48488a;
        switch (i11) {
            case 0:
                return e0.e("source", "lesson_billing_popup");
            case 1:
                return e0.e("source", "learn_ad_top");
            case 2:
                return e0.e("type", "learn_topbar_ldicon");
            case 3:
                int i12 = MainComposeActivity.U;
                return l1.t.B("learn");
            case 4:
                return Float.valueOf(1.0f);
            case 5:
                float f5 = d3.f5309a;
                return b0Var;
            case 6:
                return l1.t.B(Boolean.FALSE);
            case 7:
                return l1.t.B(Boolean.FALSE);
            case 8:
                int i13 = s5.f5993u;
                return b0Var;
            case 9:
                int i14 = s5.f5993u;
                return 0;
            case 10:
                return 0L;
            case 11:
                return new g00.d(t0.f6356a, 0);
            case 12:
                return new g00.d(m0.f6330a, 0);
            case 13:
                return new g00.d(a0.f6279a, 0);
            case 14:
                return new g00.d(bv.r.f6345a, 0);
            case 15:
                return new g00.d(bv.m.f6329a, 0);
            case 16:
                int i15 = CourseTestIndexActivity.N;
                return b0Var;
            case 17:
                return new ci.e();
            case 18:
                int i16 = ARSyllableIntroductionActivity.Q;
                return new ci.j();
            case 19:
                int i17 = ARSyllableTestIndexActivity.Q;
                return new ci.x();
            case 20:
                SessionData.Companion companion = SessionData.Companion;
                return new g0(t1.f28468a, ProcessData$$serializer.f20914a, 1);
            case 21:
                return AchievementLanguage._childSerializers$_anonymous_();
            case 22:
                return ConstantVowels._childSerializers$_anonymous_();
            case 23:
                return ConstantVowels._childSerializers$_anonymous_$0();
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return SerializableTimingResult._childSerializers$_anonymous_();
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return SerializableTimingResult._childSerializers$_anonymous_$0();
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return e0.e("status", "success");
            case 27:
                return e0.e("status", "fail");
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                int i18 = MeSettingsActivity.f22221t;
                return e0.e("source", "me");
            default:
                int i19 = MeSettingsActivity.f22221t;
                return e0.e("source", "manage_account");
        }
    }
}
