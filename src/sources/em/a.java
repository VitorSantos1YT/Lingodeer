package em;

import android.content.Context;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import bp.l;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.lingodeer.data.model.Main;
import dv.e;
import kotlin.jvm.internal.m;
import lc.d;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends l {
    public Preference X;
    public Preference Y;
    public Preference Z;

    @Override // bp.l
    public final void s() {
        q(R.xml.js_settting_preferences);
    }

    @Override // bp.l
    public final void w() {
        int i11;
        StringBuilder sb2;
        Main mainB;
        PreferenceCategory preferenceCategory;
        this.X = b(getString(R.string.js_display_key));
        this.Y = b(getString(R.string.js_luoma_key));
        this.Z = b(getString(R.string.js_mf_audio_key));
        Preference preference = this.X;
        m.d(preference, "null cannot be cast to non-null type androidx.preference.ListPreference");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        c.u(x.n().jsDisPlay, (ListPreference) preference);
        Preference preference2 = this.Y;
        m.d(preference2, "null cannot be cast to non-null type androidx.preference.ListPreference");
        c.u(x.n().jsLuomaDisplay, (ListPreference) preference2);
        Preference preference3 = this.Z;
        m.d(preference3, "null cannot be cast to non-null type androidx.preference.ListPreference");
        ListPreference listPreference = (ListPreference) preference3;
        if (x.n().keyLanguage == 1) {
            i11 = x.n().jpMFSwitch;
            sb2 = new StringBuilder();
        } else {
            i11 = x.n().jpupMFSwitch;
            sb2 = new StringBuilder();
        }
        sb2.append(i11);
        listPreference.J(sb2.toString());
        Preference preference4 = this.X;
        m.c(preference4);
        t(preference4);
        Preference preference5 = this.Y;
        m.c(preference5);
        t(preference5);
        Preference preference6 = this.Z;
        m.c(preference6);
        t(preference6);
        Main mainB2 = v().b();
        if (((mainB2 != null && mainB2.getLesson_m() == 0) || ((mainB = v().b()) != null && mainB.getLesson_f() == 0)) && (preferenceCategory = (PreferenceCategory) b("Learn")) != null) {
            Preference preference7 = this.Z;
            m.c(preference7);
            preferenceCategory.G(preference7);
        }
        if (x.n().scLanguage != -1) {
            PreferenceCategory preferenceCategory2 = (PreferenceCategory) b("Learn");
            if (preferenceCategory2 != null) {
                Preference preference8 = this.Z;
                m.c(preference8);
                preferenceCategory2.G(preference8);
            }
            if (preferenceCategory2 != null) {
                Preference preference9 = this.Y;
                m.c(preference9);
                preferenceCategory2.G(preference9);
            }
        }
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
            if (m.a(str, getString(R.string.js_display_key))) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                x.n().jsDisPlay = i11;
                x.n().updateEntry("jsDisPlay");
            }
            if (m.a(str, getString(R.string.js_luoma_key))) {
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                x.n().jsLuomaDisplay = i11;
                x.n().updateEntry("jsLuomaDisplay");
            }
            if (m.a(str, getString(R.string.js_mf_audio_key))) {
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                if (x.n().keyLanguage == 1) {
                    if (x.n().jpMFSwitch != i11) {
                        Context contextRequireContext = requireContext();
                        m.e(contextRequireContext, "requireContext(...)");
                        d dVar = new d(contextRequireContext);
                        d.g(dVar, numValueOf, null, 2);
                        d.c(dVar, null, getString(R.string.setting_voice_prompt, i11 == 0 ? getString(R.string.male) : getString(R.string.female)), 5);
                        d.e(dVar, null, null, new e(9), 3);
                        dVar.show();
                        u().c("jxz_me_settings_voice_pack", new cr.m(20));
                    }
                    x.n().jpMFSwitch = i11;
                    x.n().updateEntry("jpMFSwitch");
                    return;
                }
                if (x.n().jpupMFSwitch != i11) {
                    Context contextRequireContext2 = requireContext();
                    m.e(contextRequireContext2, "requireContext(...)");
                    d dVar2 = new d(contextRequireContext2);
                    d.g(dVar2, numValueOf, null, 2);
                    d.c(dVar2, null, getString(R.string.setting_voice_prompt, i11 == 0 ? getString(R.string.male) : getString(R.string.female)), 5);
                    d.e(dVar2, null, null, new e(10), 3);
                    dVar2.show();
                    u().c("jxz_me_settings_voice_pack", new cr.m(21));
                }
                x.n().jpupMFSwitch = i11;
                x.n().updateEntry("jpupMFSwitch");
            }
        }
    }
}
