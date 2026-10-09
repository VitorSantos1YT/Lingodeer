package tp;

import android.widget.ImageView;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements bq.d, i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f52471a;

    public /* synthetic */ k(o oVar) {
        this.f52471a = oVar;
    }

    @Override // i.b
    public void f(Object obj) {
        i.a it = (i.a) obj;
        kotlin.jvm.internal.m.f(it, "it");
        o oVar = this.f52471a;
        int i11 = oVar.f52484c0;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (i11 != cf.x.n().flashCardDisplayIn) {
            oVar.f52484c0 = cf.x.n().flashCardDisplayIn;
            oVar.C();
        }
    }

    @Override // bq.d
    public void k(int i11) {
        o oVar = this.f52471a;
        ta.a aVar = oVar.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ta.a aVar2 = oVar.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        android.support.v4.media.session.a.H(((ImageView) ((hj.v) aVar2).f33436k.f32408d).getBackground());
        ta.a aVar3 = oVar.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((ImageView) ((hj.v) aVar3).f33436k.f32408d).setBackgroundResource(R.drawable.srs_audio_1);
    }
}
