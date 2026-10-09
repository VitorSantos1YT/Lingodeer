package pi;

import android.content.Context;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import bp.l;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.lingodeer.data.model.Main;
import hh.p0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends l {
    public Preference X;
    public Preference Y;
    public Preference Z;

    @Override // bp.l
    public final void s() {
        q(R.xml.cs_settting_preferences);
    }

    @Override // bp.l
    public final void w() {
        int i11;
        StringBuilder sb2;
        Main mainB;
        PreferenceCategory preferenceCategory;
        this.X = b(getString(R.string.cs_display_key));
        this.Y = b(getString(R.string.cs_character_key));
        this.Z = b(getString(R.string.cn_mf_audio_key));
        Preference preference = this.X;
        m.d(preference, "null cannot be cast to non-null type androidx.preference.ListPreference");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        w4.c.u(x.n().csDisplay, (ListPreference) preference);
        Preference preference2 = this.Z;
        m.d(preference2, "null cannot be cast to non-null type androidx.preference.ListPreference");
        ListPreference listPreference = (ListPreference) preference2;
        if (x.n().keyLanguage == 0) {
            i11 = x.n().cnMFSwitch;
            sb2 = new StringBuilder();
        } else {
            i11 = x.n().cnupMFSwitch;
            sb2 = new StringBuilder();
        }
        sb2.append(i11);
        listPreference.J(sb2.toString());
        Preference preference3 = this.X;
        m.c(preference3);
        t(preference3);
        Preference preference4 = this.Y;
        m.c(preference4);
        t(preference4);
        Preference preference5 = this.Z;
        m.c(preference5);
        t(preference5);
        Main mainB2 = v().b();
        if (((mainB2 == null || mainB2.getLesson_m() != 0) && ((mainB = v().b()) == null || mainB.getLesson_f() != 0)) || (preferenceCategory = (PreferenceCategory) b("Learn")) == null) {
            return;
        }
        Preference preference6 = this.Z;
        m.c(preference6);
        preferenceCategory.G(preference6);
    }

    @Override // bp.l
    public final void x(Preference preference, Object obj) {
        Integer numValueOf = Integer.valueOf(R.string.confirm);
        Integer numValueOf2 = Integer.valueOf(R.string.warnings);
        m.f(preference, "preference");
        String str = preference.N;
        if (preference instanceof ListPreference) {
            m.c(obj);
            ListPreference listPreference = (ListPreference) preference;
            int iE = listPreference.E(obj.toString());
            listPreference.H(iE >= 0 ? listPreference.f2311v0[iE] : null);
            if (m.a(str, getString(R.string.cs_display_key))) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                x.n().csDisplay = iE;
                x.n().updateEntry("csDisplay");
            }
            if (m.a(str, getString(R.string.cs_character_key))) {
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                x.n().isSChinese = iE == 0;
                x.n().updateEntry("isSChinese");
                p0.w(23, f10.e.b());
            }
            if (m.a(str, getString(R.string.cn_mf_audio_key))) {
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                if (x.n().keyLanguage == 0) {
                    if (x.n().cnMFSwitch != iE) {
                        Context contextRequireContext = requireContext();
                        m.e(contextRequireContext, "requireContext(...)");
                        lc.d dVar = new lc.d(contextRequireContext);
                        lc.d.g(dVar, numValueOf2, null, 2);
                        lc.d.c(dVar, null, getString(R.string.setting_voice_prompt, iE == 0 ? getString(R.string.male) : getString(R.string.female)), 5);
                        lc.d.e(dVar, numValueOf, null, null, 6);
                        dVar.show();
                        u().c("jxz_me_settings_voice_pack", new ns.d(12));
                    }
                    x.n().cnMFSwitch = iE;
                    x.n().updateEntry("cnMFSwitch");
                    return;
                }
                if (x.n().cnupMFSwitch != iE) {
                    Context contextRequireContext2 = requireContext();
                    m.e(contextRequireContext2, "requireContext(...)");
                    lc.d dVar2 = new lc.d(contextRequireContext2);
                    lc.d.g(dVar2, numValueOf2, null, 2);
                    lc.d.c(dVar2, null, getString(R.string.setting_voice_prompt, iE == 0 ? getString(R.string.male) : getString(R.string.female)), 5);
                    lc.d.e(dVar2, numValueOf, null, null, 6);
                    dVar2.show();
                    u().c("jxz_me_settings_voice_pack", new ns.d(13));
                }
                x.n().cnupMFSwitch = iE;
                x.n().updateEntry("cnupMFSwitch");
            }
        }
    }
}
