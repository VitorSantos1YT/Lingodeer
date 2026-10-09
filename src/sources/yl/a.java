package yl;

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

    @Override // bp.l
    public final void s() {
        q(R.xml.it_settting_preferences);
    }

    @Override // bp.l
    public final void w() {
        Main mainB;
        PreferenceCategory preferenceCategory;
        Preference preferenceB = b(getString(R.string.it_mf_audio_key));
        this.X = preferenceB;
        m.d(preferenceB, "null cannot be cast to non-null type androidx.preference.ListPreference");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        w4.c.u(x.n().itMFSwitch, (ListPreference) preferenceB);
        Preference preference = this.X;
        m.c(preference);
        t(preference);
        Main mainB2 = v().b();
        if (((mainB2 == null || mainB2.getLesson_m() != 0) && ((mainB = v().b()) == null || mainB.getLesson_f() != 0)) || (preferenceCategory = (PreferenceCategory) b("Learn")) == null) {
            return;
        }
        Preference preference2 = this.X;
        m.c(preference2);
        preferenceCategory.G(preference2);
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
            if (m.a(preference.N, getString(R.string.it_mf_audio_key))) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (x.n().ruMFSwitch != i11) {
                    Context contextRequireContext = requireContext();
                    m.e(contextRequireContext, "requireContext(...)");
                    d dVar = new d(contextRequireContext);
                    d.g(dVar, Integer.valueOf(R.string.warnings), null, 2);
                    d.c(dVar, null, getString(R.string.setting_voice_prompt, i11 == 0 ? getString(R.string.male) : getString(R.string.female)), 5);
                    d.e(dVar, null, null, new r(14), 3);
                    dVar.show();
                    u().c("jxz_me_settings_voice_pack", new f(24));
                }
                x.n().itMFSwitch = i11;
                x.n().updateEntry("itMFSwitch");
            }
        }
    }
}
