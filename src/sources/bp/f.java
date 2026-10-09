package bp;

import android.content.Context;
import android.content.Intent;
import androidx.preference.CheckBoxPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.base.RemindIndexActivity;
import com.lingo.me.MeAccountSettingsActivity;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements p9.n, p9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f4559b;

    public /* synthetic */ f(l lVar, int i11) {
        this.f4558a = i11;
        this.f4559b = lVar;
    }

    @Override // p9.n
    public void c(Preference preference, Object obj) {
        kotlin.jvm.internal.m.f(preference, "preference");
        String str = preference.N;
        boolean z11 = preference instanceof ListPreference;
        l lVar = this.f4559b;
        if (z11) {
            if (obj == null) {
                return;
            }
            String string = obj.toString();
            ListPreference listPreference = (ListPreference) preference;
            int iE = listPreference.E(string);
            listPreference.H(iE >= 0 ? listPreference.f2311v0[iE] : null);
            if (kotlin.jvm.internal.m.a(str, lVar.getString(R.string.language_setting_key))) {
                Integer numValueOf = Integer.valueOf(string);
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                int i11 = cf.x.n().locateLanguage;
                if (numValueOf == null || numValueOf.intValue() != i11) {
                    Env envN = cf.x.n();
                    Integer numValueOf2 = Integer.valueOf(string);
                    kotlin.jvm.internal.m.e(numValueOf2, "valueOf(...)");
                    envN.locateLanguage = numValueOf2.intValue();
                    cf.x.n().updateEntry("locateLanguage");
                    int i12 = cf.x.n().keyLanguage;
                    int i13 = cf.x.n().locateLanguage;
                    int[] iArr = bq.r.f4959a;
                    Context contextRequireContext = lVar.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                    LanguageItem languageItem = new LanguageItem(i12, i13, bq.m.s(contextRequireContext, cf.x.n().keyLanguage));
                    int i14 = SwitchLanguageActivity.M;
                    androidx.fragment.app.p0 p0VarRequireActivity = lVar.requireActivity();
                    kotlin.jvm.internal.m.e(p0VarRequireActivity, "requireActivity(...)");
                    lVar.startActivity(tw.c.p(p0VarRequireActivity, languageItem, (8 & 4) != 0, OYAvlbfUyD.xZnwOYMncSkzgRT));
                }
            } else if (kotlin.jvm.internal.m.a(listPreference.N, lVar.getString(R.string.theme_key))) {
                Integer numValueOf3 = Integer.valueOf(string);
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                int i15 = cf.x.n().themeValue;
                if (numValueOf3 == null || numValueOf3.intValue() != i15) {
                    Integer numValueOf4 = Integer.valueOf(string);
                    kotlin.jvm.internal.m.e(numValueOf4, "valueOf(...)");
                    cf.x.n().themeValue = numValueOf4.intValue();
                    cf.x.n().updateEntry("themeValue");
                    int[] iArr2 = bq.r.f4959a;
                    bq.m.K();
                    lVar.u().c("jxz_me_settings_mode", new androidx.lifecycle.j(20));
                }
            }
        } else if (preference instanceof CheckBoxPreference) {
            kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (kotlin.jvm.internal.m.a(str, lVar.getString(R.string.cs_sound_effect_key))) {
                if (zBooleanValue) {
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    cf.x.n().allowSoundEffect = true;
                    cf.x.n().updateEntry("allowSoundEffect");
                } else {
                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                    cf.x.n().allowSoundEffect = false;
                    cf.x.n().updateEntry("allowSoundEffect");
                }
            } else if (kotlin.jvm.internal.m.a(str, lVar.getString(R.string.animation_effect_key))) {
                LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                cf.x.n().showAnim = zBooleanValue;
                cf.x.n().updateEntry("showAnim");
            } else if (kotlin.jvm.internal.m.a(str, lVar.getString(R.string.skin_chris_key))) {
                LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                if (cf.x.n().showSkinNewYear != zBooleanValue) {
                    cf.x.n().showSkinNewYear = zBooleanValue;
                    cf.x.n().updateEntry("showSkinNewYear");
                }
            }
        } else if (preference instanceof SwitchPreference) {
            kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            if (kotlin.jvm.internal.m.a(str, lVar.getString(R.string.enable_audio_auto_play_key))) {
                LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                cf.x.n().isTestAutoPlayAudio = zBooleanValue2;
                cf.x.n().updateEntry("isTestAutoPlayAudio");
            } else if (kotlin.jvm.internal.m.a(str, lVar.getString(R.string.redo_weak_items_key))) {
                LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                cf.x.n().isTestRepeatWeakItems = zBooleanValue2;
                cf.x.n().updateEntry("isTestRepeatWeakItems");
            }
        }
        lVar.x(preference, obj);
    }

    @Override // p9.o
    public boolean i(Preference preference) {
        int i11 = this.f4558a;
        l lVar = this.f4559b;
        switch (i11) {
            case 1:
                Context contextRequireContext = lVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                lc.d dVar = new lc.d(contextRequireContext);
                lc.d.g(dVar, Integer.valueOf(R.string.warnings), null, 2);
                hz.b.t(dVar, Integer.valueOf(R.layout.dialog_lesson_erase), null, false, 62);
                lc.d.e(dVar, Integer.valueOf(R.string.confirm), null, new a00.c(lVar, 6), 2);
                lc.d.d(dVar, null, 6);
                dVar.show();
                b7.e0.A(lVar.u(), "jxz_me_settings_clear_cache");
                break;
            case 2:
                lVar.startActivity(new Intent(lVar.getActivity(), (Class<?>) RemindIndexActivity.class));
                break;
            default:
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (!cf.x.n().isUnloginUser()) {
                    lVar.startActivity(new Intent(lVar.getActivity(), (Class<?>) MeAccountSettingsActivity.class));
                    lVar.u().c("jxz_enter_profile", new androidx.lifecycle.j(21));
                } else {
                    int i12 = LoginActivity.Q;
                    Context contextRequireContext2 = lVar.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                    lVar.startActivity(g1.p(contextRequireContext2, 5));
                }
                break;
        }
        return false;
    }
}
