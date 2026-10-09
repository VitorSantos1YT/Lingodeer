package oo;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.speak.ui.SpeakLeadBoardActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f45640b;

    public /* synthetic */ c(h hVar, int i11) {
        this.f45639a = i11;
        this.f45640b = hVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f45639a;
        int i12 = 0;
        vy.d dVar = null;
        qy.b0 b0Var = qy.b0.f48488a;
        h hVar = this.f45640b;
        switch (i11) {
            case 0:
                lc.d it = (lc.d) obj;
                kotlin.jvm.internal.m.f(it, "it");
                g gVar = hVar.R;
                if (gVar != null) {
                    cj.c cVar = gVar.f45671q;
                    if (cVar != null) {
                        cVar.e();
                    }
                    if (gVar.f45664i != null) {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        if (!cf.x.n().showStoryTrans) {
                            TextView textView = gVar.f45664i;
                            kotlin.jvm.internal.m.c(textView);
                            textView.setVisibility(4);
                        } else {
                            TextView textView2 = gVar.f45664i;
                            kotlin.jvm.internal.m.c(textView2);
                            textView2.setVisibility(0);
                        }
                    }
                }
                break;
            case 1:
                View it2 = (View) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(hVar), null, null, new e(hVar, dVar, i12), 3);
                break;
            case 2:
                View it3 = (View) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(hVar), null, null, new e(hVar, dVar, 1), 3);
                break;
            default:
                View it4 = (View) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                int i13 = SpeakLeadBoardActivity.H;
                l.m mVar = hVar.f36398d;
                kotlin.jvm.internal.m.c(mVar);
                hVar.startActivity(md.a.p(mVar, hVar.T));
                break;
        }
        return b0Var;
    }
}
