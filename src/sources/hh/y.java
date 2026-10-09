package hh;

import android.os.Bundle;
import com.google.api.Service;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.ui.learn.AdVideoPromptActivity;
import com.lingo.lingoskill.ui.learn.BaseAudioLessonActivity;
import com.lingo.lingoskill.ui.learn.BaseAudioLessonIndexActivity;
import l1.c3;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32310a;

    public /* synthetic */ y(int i11) {
        this.f32310a = i11;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f32310a) {
            case 0:
                return b7.e0.e("type", "word_for_word");
            case 1:
                return b7.e0.e("type", "quick");
            case 2:
                return b7.e0.e("type", iFLeRCXvYCGdPW.dbtiHpbsZheXIdu);
            case 3:
                return b7.e0.e("type", "hiragana");
            case 4:
                return b7.e0.e("type", "kanji");
            case 5:
                return b7.e0.e("source", "review_flashcards");
            case 6:
                c3 c3Var = ht.p.f33771a;
                return Boolean.TRUE;
            case 7:
                return b7.e0.e("source", "review_flashcards");
            case 8:
                Bundle bundle = new Bundle();
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (cf.x.n().vtMFSwitch == 0) {
                    bundle.putString("type", "male");
                } else {
                    bundle.putString("type", "female");
                }
                return bundle;
            case 9:
                int i11 = iv.o.f34795d;
                return 3;
            case 10:
                return 3;
            case 11:
                return new j0.g0();
            case 12:
                return b7.e0.e("source", "web");
            case 13:
                return b7.e0.e("source", "web");
            case 14:
                Bundle bundle2 = new Bundle();
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (cf.x.n().hiMFSwitch == 0) {
                    bundle2.putString("type", "male");
                } else {
                    bundle2.putString("type", "female");
                }
                return bundle2;
            case 15:
                int i12 = AdVideoPromptActivity.V;
                return new jp.m();
            case 16:
                int i13 = BaseAudioLessonActivity.Q;
                return new jp.s();
            case 17:
                return new jp.w();
            case 18:
                int i14 = BaseAudioLessonIndexActivity.Q;
                return new jp.b0();
            case 19:
                return new jp.f0();
            case 20:
                return l1.t.B(Boolean.FALSE);
            case 21:
                return l1.t.B(Boolean.FALSE);
            case 22:
                return l1.t.B(Boolean.FALSE);
            case 23:
                return new v3.f(0);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                throw new IllegalStateException("CompositionLocal LocalActivity not present");
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                throw new IllegalStateException("CompositionLocal LocalKeyLanguage not present");
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                throw new IllegalStateException("CompositionLocal LocalKeyLanguage not present");
            case 27:
                throw new IllegalStateException("CompositionLocal LocalKeyLanguage not present");
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                throw new IllegalStateException("CompositionLocal LocalKeyLanguage not present");
            default:
                throw new IllegalStateException("CompositionLocal LocalEnableOptionTapAudio not present");
        }
    }
}
