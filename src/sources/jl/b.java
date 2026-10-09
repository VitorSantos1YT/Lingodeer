package jl;

import android.content.Context;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import bp.l;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import hh.y;
import j9.a0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends l {
    public Preference X;

    @Override // bp.l
    public final void s() {
        q(R.xml.hi_settting_preferences);
    }

    @Override // bp.l
    public final void w() {
        Preference preferenceB = b(getString(R.string.hindi_display_key));
        this.X = preferenceB;
        m.d(preferenceB, "null cannot be cast to non-null type androidx.preference.ListPreference");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        w4.c.u(x.n().hindiDisPlay, (ListPreference) preferenceB);
        Preference preference = this.X;
        m.c(preference);
        t(preference);
    }

    @Override // bp.l
    public final void x(Preference preference, Object obj) {
        m.f(preference, "preference");
        String str = preference.N;
        if (preference instanceof ListPreference) {
            m.c(obj);
            String string = obj.toString();
            int i11 = Integer.parseInt(string);
            ListPreference listPreference = (ListPreference) preference;
            int iE = listPreference.E(string);
            listPreference.H(iE >= 0 ? listPreference.f2311v0[iE] : null);
            if (m.a(str, getString(R.string.hindi_display_key))) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                x.n().hindiDisPlay = i11;
                x.n().updateEntry("hindiDisPlay");
            }
            if (m.a(str, getString(R.string.tur_mf_audio_key))) {
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (x.n().hiMFSwitch != i11) {
                    Context contextRequireContext = requireContext();
                    m.e(contextRequireContext, "requireContext(...)");
                    lc.d dVar = new lc.d(contextRequireContext);
                    lc.d.g(dVar, Integer.valueOf(R.string.warnings), null, 2);
                    lc.d.c(dVar, null, getString(R.string.setting_voice_prompt, i11 == 0 ? getString(R.string.male) : getString(R.string.female)), 5);
                    lc.d.e(dVar, null, null, new a0(3), 3);
                    dVar.show();
                    u().c("jxz_me_settings_voice_pack", new y(14));
                }
                x.n().hiMFSwitch = i11;
                x.n().updateEntry("hiMFSwitch");
            }
        }
    }
}
