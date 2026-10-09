package sh;

import androidx.lifecycle.ViewModel;
import bq.r;
import cf.x;
import com.lingo.fluent.object.WordOptions;
import com.lingo.lingoskill.LingoSkillApplication;
import defpackage.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import n9.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends ViewModel {
    public boolean H;
    public boolean K;
    public boolean L;
    public WordOptions M;
    public List N;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f51691f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f51692t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51686a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f51687b = new ArrayList();
    public final boolean O = true;
    public final q P = new q(29, false);

    public c() {
        d();
    }

    public final String a() {
        if (b().getWord().getWordStruct() == 1) {
            String strF = xt.b.a().f();
            Long wordId = b().getWord().getWordId();
            m.e(wordId, "getWordId(...)");
            long jLongValue = wordId.longValue();
            int[] iArr = r.f4959a;
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            StringBuilder sbM = com.google.android.material.datepicker.d.m(jLongValue, "pod-", bq.m.g(x.n().keyLanguage), "-w-yx-");
            sbM.append(".mp3");
            return e.m(strF, sbM.toString());
        }
        String strF2 = xt.b.a().f();
        Long wordId2 = b().getWord().getWordId();
        m.e(wordId2, "getWordId(...)");
        long jLongValue2 = wordId2.longValue();
        int[] iArr2 = r.f4959a;
        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
        StringBuilder sbM2 = com.google.android.material.datepicker.d.m(jLongValue2, "pod-", bq.m.g(x.n().keyLanguage), "-w-");
        sbM2.append(".mp3");
        return e.m(strF2, sbM2.toString());
    }

    public final WordOptions b() {
        WordOptions wordOptions = this.M;
        if (wordOptions != null) {
            return wordOptions;
        }
        m.n("curWordOptions");
        throw null;
    }

    public final List c() {
        List list = this.N;
        if (list != null) {
            return list;
        }
        m.n("words");
        throw null;
    }

    public final void d() {
        this.f51691f = false;
        this.f51692t = false;
        this.H = false;
        this.K = false;
        this.L = false;
        this.f51689d = 0;
        this.f51690e = 0;
        this.f51688c = 0;
        this.f51687b.clear();
        this.f51686a = -1;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.P.f();
    }
}
