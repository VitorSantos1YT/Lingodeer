package rt;

import android.os.Bundle;
import com.google.api.Service;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.course.smarttips.data.model.Element;
import com.lingodeer.course.smarttips.data.model.TableElement;
import com.lingodeer.data.model.speech.NBestResult;
import com.lingodeer.data.model.speech.SpeechRecognitionResult;
import com.lingodeer.data.model.speech.Word;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m9 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50067a;

    public /* synthetic */ m9(int i11) {
        this.f50067a = i11;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f50067a) {
            case 0:
                return new fv.c();
            case 1:
                return b7.e0.e("type", "main_lesson");
            case 2:
                return b7.e0.e("type", "main_lesson");
            case 3:
                return new fv.c();
            case 4:
                l1.c3 c3Var = s0.t.f51192a;
                return null;
            case 5:
                return new v3.j(0L);
            case 6:
                return new v3.j(0L);
            case 7:
                return (wt.q) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, kotlin.jvm.internal.z.a(wt.q.class));
            case 8:
                Bundle bundle = new Bundle();
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (cf.x.n().frMFSwitch == 0) {
                    bundle.putString("type", "male");
                } else {
                    bundle.putString("type", "female");
                }
                return bundle;
            case 9:
                Bundle bundle2 = new Bundle();
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (cf.x.n().ptMFSwitch == 0) {
                    bundle2.putString("type", "male");
                } else {
                    bundle2.putString("type", "female");
                }
                return bundle2;
            case 10:
                st.a aVar = tg.u.f52376d;
                return 0;
            case 11:
                return j3.y0.f35826d;
            case 12:
                l1.d0 d0Var = tg.k0.f52309a;
                return tg.j0.f52298i;
            case 13:
                return new tg.m0();
            case 14:
                return new di.a(4);
            case 15:
                return new di.a(1);
            case 16:
                return new di.a(2);
            case 17:
                return new di.a(3);
            case 18:
                return Element._childSerializers$_anonymous_();
            case 19:
                return Element._childSerializers$_anonymous_$0();
            case 20:
                return Element._childSerializers$_anonymous_$1();
            case 21:
                return TableElement._childSerializers$_anonymous_();
            case 22:
                l1.c3 c3Var2 = u1.b.f52721a;
                return u1.a.f52720a;
            case 23:
                l1.d0 d0Var2 = ug.d.f52966a;
                return Boolean.FALSE;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return b7.e0.e("source", "index");
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Bundle bundle3 = new Bundle();
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                if (cf.x.n().esusMFSwitch == 0) {
                    bundle3.putString("type", "male");
                } else {
                    bundle3.putString("type", "female");
                }
                return bundle3;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new Bundle();
            case 27:
                return NBestResult._childSerializers$_anonymous_();
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return SpeechRecognitionResult._childSerializers$_anonymous_();
            default:
                return Word._childSerializers$_anonymous_();
        }
    }
}
