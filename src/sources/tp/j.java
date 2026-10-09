package tp;

import android.content.Intent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingo.lingoskill.ui.review.FlashCardSettingActivity;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f52469b;

    public /* synthetic */ j(o oVar, int i11) {
        this.f52468a = i11;
        this.f52469b = oVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f52468a;
        qy.b0 b0Var = qy.b0.f48488a;
        o oVar = this.f52469b;
        switch (i11) {
            case 0:
                lc.d it = (lc.d) obj;
                kotlin.jvm.internal.m.f(it, "it");
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(oVar), null, null, new n(oVar, null, 2), 3);
                break;
            case 1:
                View it2 = (View) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                oVar.getClass();
                oVar.T = null;
                oVar.A(oVar.R, oVar.S);
                break;
            case 2:
                View it3 = (View) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                ta.a aVar = oVar.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ((hj.v) aVar).f33430e.setVisibility(0);
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(oVar.f36398d, R.anim.flash_card_txt_enter);
                ta.a aVar2 = oVar.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                ((hj.v) aVar2).f33430e.startAnimation(animationLoadAnimation);
                if (oVar.r().flashCardIsPlayModel == 2) {
                    oVar.A(oVar.R, oVar.S);
                }
                ta.a aVar3 = oVar.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ((hj.v) aVar3).f33429d.setVisibility(8);
                ta.a aVar4 = oVar.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ((hj.v) aVar4).f33438n.setVisibility(0);
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(oVar), null, null, new n(oVar, null, 1), 3);
                break;
            case 3:
                View it4 = (View) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                oVar.requireActivity().finish();
                break;
            case 4:
                View it5 = (View) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                oVar.getClass();
                oVar.T = null;
                oVar.A(oVar.R, oVar.S);
                break;
            default:
                View it6 = (View) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                b7.e0.A(oVar.t(), "jxz_review_flashcard_click_settings");
                i.c cVar = oVar.f52486e0;
                int i12 = FlashCardSettingActivity.P;
                l.m mVar = oVar.f36398d;
                kotlin.jvm.internal.m.c(mVar);
                cVar.a(new Intent(mVar, (Class<?>) FlashCardSettingActivity.class));
                break;
        }
        return b0Var;
    }
}
