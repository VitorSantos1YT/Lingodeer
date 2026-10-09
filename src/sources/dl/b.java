package dl;

import androidx.preference.ListPreference;
import androidx.preference.Preference;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends bp.l {
    public Preference X;

    @Override // bp.l
    public final void s() {
        q(R.xml.grk_settting_preferences);
    }

    @Override // bp.l
    public final void w() {
        Preference preferenceB = b(getString(R.string.grk_display_key));
        this.X = preferenceB;
        kotlin.jvm.internal.m.d(preferenceB, "null cannot be cast to non-null type androidx.preference.ListPreference");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        w4.c.u(x.n().grkDisPlay, (ListPreference) preferenceB);
        Preference preference = this.X;
        kotlin.jvm.internal.m.c(preference);
        t(preference);
    }

    @Override // bp.l
    public final void x(Preference preference, Object obj) {
        kotlin.jvm.internal.m.f(preference, "preference");
        if (preference instanceof ListPreference) {
            kotlin.jvm.internal.m.c(obj);
            String string = obj.toString();
            int i11 = Integer.parseInt(string);
            ListPreference listPreference = (ListPreference) preference;
            int iE = listPreference.E(string);
            listPreference.H(iE >= 0 ? listPreference.f2311v0[iE] : null);
            if (kotlin.jvm.internal.m.a(preference.N, getString(R.string.grk_display_key))) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                x.n().grkDisPlay = i11;
                x.n().updateEntry("grkDisPlay");
            }
        }
    }
}
