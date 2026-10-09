package bp;

import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.preference.CheckBoxPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends p9.v {
    public final Object K;
    public final Object L;
    public final Object M;
    public final f N;
    public CheckBoxPreference O;
    public Preference P;
    public CheckBoxPreference Q;
    public Preference R;
    public Preference S;
    public Preference T;
    public ListPreference U;
    public SwitchPreference V;
    public SwitchPreference W;

    public l() {
        qy.j jVar = qy.j.SYNCHRONIZED;
        this.K = com.bumptech.glide.d.u(jVar, new k(this, 0));
        this.L = com.bumptech.glide.d.u(jVar, new k(this, 1));
        this.M = com.bumptech.glide.d.u(jVar, new k(this, 2));
        this.N = new f(this, 0);
    }

    @Override // androidx.fragment.app.k0
    public final void onResume() {
        super.onResume();
        u().d("AppSettings");
    }

    @Override // p9.v
    public final void r() {
        s();
        this.O = (CheckBoxPreference) b(getString(R.string.cs_sound_effect_key));
        this.P = b(getString(R.string.clear_cache));
        this.R = b(getString(R.string.reminder_us));
        this.Q = (CheckBoxPreference) b(getString(R.string.animation_effect_key));
        this.S = b(getString(R.string.account_manage));
        this.T = b(getString(R.string.account_membership));
        this.U = (ListPreference) b(getString(R.string.theme_key));
        this.V = (SwitchPreference) b(getString(R.string.redo_weak_items_key));
        this.W = (SwitchPreference) b(getString(R.string.enable_audio_auto_play_key));
        ListPreference listPreference = this.U;
        if (listPreference != null) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            w4.c.u(cf.x.n().themeValue, listPreference);
        }
        CheckBoxPreference checkBoxPreference = this.O;
        kotlin.jvm.internal.m.c(checkBoxPreference);
        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
        checkBoxPreference.E(cf.x.n().allowSoundEffect);
        CheckBoxPreference checkBoxPreference2 = this.Q;
        kotlin.jvm.internal.m.c(checkBoxPreference2);
        checkBoxPreference2.E(cf.x.n().showAnim);
        SwitchPreference switchPreference = this.V;
        kotlin.jvm.internal.m.c(switchPreference);
        switchPreference.E(cf.x.n().isTestRepeatWeakItems);
        SwitchPreference switchPreference2 = this.W;
        kotlin.jvm.internal.m.c(switchPreference2);
        switchPreference2.E(cf.x.n().isTestAutoPlayAudio);
        ListPreference listPreference2 = this.U;
        kotlin.jvm.internal.m.c(listPreference2);
        t(listPreference2);
        CheckBoxPreference checkBoxPreference3 = this.O;
        kotlin.jvm.internal.m.c(checkBoxPreference3);
        t(checkBoxPreference3);
        CheckBoxPreference checkBoxPreference4 = this.Q;
        kotlin.jvm.internal.m.c(checkBoxPreference4);
        t(checkBoxPreference4);
        CheckBoxPreference checkBoxPreference5 = this.Q;
        kotlin.jvm.internal.m.c(checkBoxPreference5);
        t(checkBoxPreference5);
        SwitchPreference switchPreference3 = this.V;
        kotlin.jvm.internal.m.c(switchPreference3);
        t(switchPreference3);
        SwitchPreference switchPreference4 = this.W;
        kotlin.jvm.internal.m.c(switchPreference4);
        t(switchPreference4);
        w();
        Preference preference = this.P;
        kotlin.jvm.internal.m.c(preference);
        preference.f2329f = new f(this, 1);
        Preference preference2 = this.R;
        kotlin.jvm.internal.m.c(preference2);
        preference2.f2329f = new f(this, 2);
        Preference preference3 = this.S;
        kotlin.jvm.internal.m.c(preference3);
        preference3.f2329f = new f(this, 3);
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new j(this, (vy.d) null, 0), 3);
    }

    public abstract void s();

    public final void t(Preference preference) {
        kotlin.jvm.internal.m.f(preference, "preference");
        String str = preference.N;
        Context context = preference.f2319a;
        f fVar = this.N;
        preference.f2327e = fVar;
        if (preference instanceof ListPreference) {
            fVar.c(preference, context.getSharedPreferences(context.getPackageName() + "_preferences", 0).getString(str, null));
            return;
        }
        if (preference instanceof CheckBoxPreference) {
            fVar.c(preference, Boolean.valueOf(context.getSharedPreferences(context.getPackageName() + "_preferences", 0).getBoolean(str, false)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final ur.a u() {
        return (ur.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final xt.q v() {
        return (xt.q) this.M.getValue();
    }

    public abstract void w();

    public abstract void x(Preference preference, Object obj);
}
