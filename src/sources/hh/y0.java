package hh;

import android.os.Bundle;
import android.webkit.WebSettings;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdTips;
import com.lingo.lingoskill.object.PdTipsFav;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends ji.e {
    public long N;
    public int O;
    public int P;

    public y0() {
        super(v0.f32302a, BuildConfig.VERSION_NAME);
        this.N = -1L;
        this.O = -1;
        this.P = -1;
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        Bundle arguments = getArguments();
        vy.d dVar = null;
        PdTips pdTips = arguments != null ? (PdTips) arguments.getParcelable(INTENTS.EXTRA_OBJECT) : null;
        kotlin.jvm.internal.m.c(pdTips);
        Bundle arguments2 = getArguments();
        Long lValueOf = arguments2 != null ? Long.valueOf(arguments2.getLong(INTENTS.EXTRA_LONG, -1L)) : null;
        kotlin.jvm.internal.m.c(lValueOf);
        this.N = lValueOf.longValue();
        Bundle arguments3 = getArguments();
        Integer numValueOf = arguments3 != null ? Integer.valueOf(arguments3.getInt(INTENTS.EXTRA_INT, -1)) : null;
        kotlin.jvm.internal.m.c(numValueOf);
        this.O = numValueOf.intValue();
        Bundle arguments4 = getArguments();
        Integer numValueOf2 = arguments4 != null ? Integer.valueOf(arguments4.getInt(INTENTS.EXTRA_INT_2, -1)) : null;
        kotlin.jvm.internal.m.c(numValueOf2);
        this.P = numValueOf2.intValue();
        StringBuilder sb2 = new StringBuilder("<html>\n<body>\n");
        String tips = pdTips.getTips();
        kotlin.jvm.internal.m.e(tips, "getTips(...)");
        sb2.append(oz.x.q0(tips, "background-color:#ffffff;", BuildConfig.VERSION_NAME));
        sb2.append("</body>\n</html>");
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        WebSettings settings = ((m4) aVar).f32935h.getSettings();
        kotlin.jvm.internal.m.e(settings, "getSettings(...)");
        if ((getResources().getConfiguration().uiMode & 48) != 16) {
            if (se.k.s("ALGORITHMIC_DARKENING")) {
                va.a.b(settings);
            }
            if (se.k.s("FORCE_DARK")) {
                va.a.c(settings);
            }
        }
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((m4) aVar2).f32935h.loadDataWithBaseURL(null, sb2.toString(), "text/html", "utf-8", null);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((m4) aVar3).f32934g.setText(pdTips.getTipsName());
        int[] iArr = bq.r.f4959a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        String id2 = bq.m.k(cf.x.n().keyLanguage) + "_" + pdTips.getCardId();
        if (gh.c.f29196a == null) {
            synchronized (gh.c.class) {
                if (gh.c.f29196a == null) {
                    gh.c.f29196a = new gh.c();
                }
            }
        }
        kotlin.jvm.internal.m.c(gh.c.f29196a);
        kotlin.jvm.internal.m.f(id2, "id");
        PdTipsFav pdTipsFav = (PdTipsFav) PdLessonDbHelper.INSTANCE.pdTipsFavDao().load(id2);
        if (pdTipsFav == null || pdTipsFav.getFav() != 1) {
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            ((m4) aVar4).f32930c.setImageResource(R.drawable.ic_pd_word_tag_un_fav);
        } else {
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            ((m4) aVar5).f32930c.setImageResource(R.drawable.ic_pd_word_tag_fav);
        }
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new gu.b(10, this, id2, dVar), 3);
    }
}
