package ns;

import android.os.Bundle;
import com.google.api.Service;
import com.lingo.lingoskill.LingoSkillApplication;
import g00.d1;
import g00.t1;
import j$.time.Instant;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43965a;

    public /* synthetic */ d(int i11) {
        this.f43965a = i11;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f43965a) {
            case 0:
                return b.Companion.serializer();
            case 1:
                return s.Companion.serializer();
            case 2:
                return d1.e("com.lingodeer.course.ai.CourseAnswerJudgment", q.values(), new String[]{"CORRECT", "RETRY", "WRONG"}, new Annotation[][]{null, null, null});
            case 3:
                return d1.e("com.lingodeer.course.ai.CourseAnswerRetryReason", s.values(), new String[]{"NONE", "SPELLING", "MISSING_ELEMENT", "EXTRA_ELEMENT", "ORDER", "FORM", "REPLACE_ELEMENT", "OTHER_LOCAL"}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case 4:
                return new g00.d(t1.f28468a, 0);
            case 5:
                return new g00.d(new g00.d(t1.f28468a, 0), 0);
            case 6:
                return new g00.d(u0.f44025a, 0);
            case 7:
                return new g00.d(a0.f43961a, 0);
            case 8:
                return Long.valueOf(Instant.now().getEpochSecond());
            case 9:
                return new g00.d(t1.f28468a, 0);
            case 10:
                return new g00.d(new g00.d(new g00.d(g00.m0.f28434a, 0), 0), 0);
            case 11:
                return new g00.d(g00.m0.f28434a, 0);
            case 12:
                Bundle bundle = new Bundle();
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (cf.x.n().cnMFSwitch == 0) {
                    bundle.putString("type", "male");
                } else {
                    bundle.putString("type", "female");
                }
                return bundle;
            case 13:
                Bundle bundle2 = new Bundle();
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (cf.x.n().cnupMFSwitch == 0) {
                    bundle2.putString("type", "male");
                } else {
                    bundle2.putString("type", "female");
                }
                return bundle2;
            case 14:
                a9.i iVar = t10.a.f52009b;
                if (iVar != null) {
                    return new q10.a(iVar, new d(17));
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 15:
                a9.i iVar2 = t10.a.f52009b;
                if (iVar2 != null) {
                    return new q10.a(((c20.b) iVar2.f519c).f6515d, new d(16));
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 16:
                a9.i iVar3 = t10.a.f52009b;
                if (iVar3 != null) {
                    return ((c20.b) iVar3.f519c).f6515d;
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 17:
                a9.i iVar4 = t10.a.f52009b;
                if (iVar4 != null) {
                    return iVar4;
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 18:
                return b7.e0.e("type", "word_translation");
            case 19:
                return b7.e0.e("type", "spelling_bee");
            case 20:
                return b7.e0.e("type", "word_translation");
            case 21:
                return b7.e0.e("type", "listen_and_match");
            case 22:
                return b7.e0.e("type", "listen_and_match");
            case 23:
                return b7.e0.e("type", "spelling_bee");
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return (av.i) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, kotlin.jvm.internal.z.a(av.i.class));
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return (av.i) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, kotlin.jvm.internal.z.a(av.i.class));
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return (av.i) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, kotlin.jvm.internal.z.a(av.i.class));
            case 27:
                return b7.e0.e("source", "leaderboard_detail");
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                fr.o0 o0Var = (fr.o0) xt.b.c();
                o0Var.getClass();
                int[] iArr = bq.r.f4959a;
                return new hv.a(bq.m.o(o0Var.f27734b));
            default:
                Bundle bundle3 = new Bundle();
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                if (cf.x.n().thaiMFSwitch == 0) {
                    bundle3.putString("type", "male");
                } else {
                    bundle3.putString("type", "female");
                }
                return bundle3;
        }
    }
}
