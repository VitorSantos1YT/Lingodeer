package sk;

import android.content.Context;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import bp.l;
import cf.x;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.lingodeer.data.model.Main;
import kotlin.jvm.internal.m;
import rt.m9;
import rt.v7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends l {
    public Preference X;

    @Override // bp.l
    public final void s() {
        q(R.xml.fr_settting_preferences);
    }

    @Override // bp.l
    public final void x(Preference preference, Object obj) {
        m.f(preference, "preference");
        if (preference instanceof ListPreference) {
            m.c(obj);
            String string = obj.toString();
            int i11 = Integer.parseInt(string);
            ListPreference listPreference = (ListPreference) preference;
            int iE = listPreference.E(string);
            listPreference.H(iE >= 0 ? listPreference.f2311v0[iE] : null);
            if (m.a(preference.N, getString(R.string.fr_mf_audio_key))) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (x.n().frMFSwitch != i11) {
                    Context contextRequireContext = requireContext();
                    m.e(contextRequireContext, "requireContext(...)");
                    lc.d dVar = new lc.d(contextRequireContext);
                    lc.d.g(dVar, Integer.valueOf(R.string.warnings), null, 2);
                    lc.d.c(dVar, null, getString(R.string.setting_voice_prompt, i11 == 0 ? getString(R.string.male) : getString(R.string.female)), 5);
                    lc.d.e(dVar, null, null, new v7(26), 3);
                    dVar.show();
                    u().c("jxz_me_settings_voice_pack", new m9(8));
                }
                x.n().frMFSwitch = i11;
                x.n().updateEntry("frMFSwitch");
            }
        }
    }

    @Override // bp.l
    public final void w() {
        Main mainB;
        PreferenceCategory preferenceCategory;
        Preference preferenceB = b(getString(R.string.fr_mf_audio_key));
        this.X = preferenceB;
        m.d(preferenceB, ualZoVVCQs.fbBaAuwyhlsx);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        w4.c.u(x.n().frMFSwitch, (ListPreference) preferenceB);
        Preference preference = this.X;
        m.c(preference);
        t(preference);
        Main mainB2 = v().b();
        if (((mainB2 != null && mainB2.getLesson_m() == 0) || ((mainB = v().b()) != null && mainB.getLesson_f() == 0)) && (preferenceCategory = (PreferenceCategory) b("Learn")) != null) {
            Preference preference2 = this.X;
            m.c(preference2);
            preferenceCategory.G(preference2);
        }
    }
}
