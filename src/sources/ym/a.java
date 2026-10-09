package ym;

import android.content.Context;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import bp.l;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.lingodeer.data.model.Main;
import kotlin.jvm.internal.m;
import lc.d;
import uu.f;
import xt.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends l {
    public Preference X;
    public Preference Y;

    @Override // bp.l
    public final void s() {
        q(R.xml.ko_settting_preferences);
    }

    @Override // bp.l
    public final void w() {
        int i11;
        StringBuilder sb2;
        Main mainB;
        PreferenceCategory preferenceCategory;
        Preference preferenceB = b(getString(R.string.ko_display_key));
        this.X = preferenceB;
        m.d(preferenceB, "null cannot be cast to non-null type androidx.preference.ListPreference");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i12 = x.n().koDisPlay;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i12);
        ((ListPreference) preferenceB).J(sb3.toString());
        Preference preferenceB2 = b(getString(R.string.ko_mf_audio_key));
        this.Y = preferenceB2;
        m.d(preferenceB2, "null cannot be cast to non-null type androidx.preference.ListPreference");
        ListPreference listPreference = (ListPreference) preferenceB2;
        if (x.n().keyLanguage == 2) {
            i11 = x.n().krMFSwitch;
            sb2 = new StringBuilder();
        } else {
            i11 = x.n().krupMFSwitch;
            sb2 = new StringBuilder();
        }
        sb2.append(i11);
        listPreference.J(sb2.toString());
        Preference preference = this.X;
        m.c(preference);
        t(preference);
        Preference preference2 = this.Y;
        m.c(preference2);
        t(preference2);
        Main mainB2 = v().b();
        if (((mainB2 == null || mainB2.getLesson_m() != 0) && ((mainB = v().b()) == null || mainB.getLesson_f() != 0)) || (preferenceCategory = (PreferenceCategory) b("Learn")) == null) {
            return;
        }
        Preference preference3 = this.Y;
        m.c(preference3);
        preferenceCategory.G(preference3);
    }

    @Override // bp.l
    public final void x(Preference preference, Object obj) {
        Integer numValueOf = Integer.valueOf(R.string.warnings);
        m.f(preference, "preference");
        String str = preference.N;
        if (preference instanceof ListPreference) {
            m.c(obj);
            String string = obj.toString();
            int i11 = Integer.parseInt(string);
            ListPreference listPreference = (ListPreference) preference;
            int iE = listPreference.E(string);
            listPreference.H(iE >= 0 ? listPreference.f2311v0[iE] : null);
            if (m.a(str, getString(R.string.ko_display_key))) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                x.n().koDisPlay = i11;
                x.n().updateEntry("koDisPlay");
            }
            if (m.a(str, getString(R.string.ko_mf_audio_key))) {
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (x.n().keyLanguage == 2) {
                    if (x.n().krMFSwitch != i11) {
                        Context contextRequireContext = requireContext();
                        m.e(contextRequireContext, "requireContext(...)");
                        d dVar = new d(contextRequireContext);
                        d.g(dVar, numValueOf, null, 2);
                        d.c(dVar, null, getString(R.string.setting_voice_prompt, i11 == 0 ? getString(R.string.male) : getString(R.string.female)), 5);
                        d.e(dVar, null, null, new r(15), 3);
                        dVar.show();
                        u().c("jxz_me_settings_voice_pack", new f(25));
                    }
                    x.n().krMFSwitch = i11;
                    x.n().updateEntry("krMFSwitch");
                    return;
                }
                if (x.n().krupMFSwitch != i11) {
                    Context contextRequireContext2 = requireContext();
                    m.e(contextRequireContext2, "requireContext(...)");
                    d dVar2 = new d(contextRequireContext2);
                    d.g(dVar2, numValueOf, null, 2);
                    d.c(dVar2, null, getString(R.string.setting_voice_prompt, i11 == 0 ? getString(R.string.male) : getString(R.string.female)), 5);
                    d.e(dVar2, null, null, new r(16), 3);
                    dVar2.show();
                    u().c("jxz_me_settings_voice_pack", new f(26));
                }
                x.n().krupMFSwitch = i11;
                x.n().updateEntry("krupMFSwitch");
            }
        }
    }
}
