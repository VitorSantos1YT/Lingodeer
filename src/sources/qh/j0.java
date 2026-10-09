package qh;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewPropertyAnimator;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import hj.x5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f47772b;

    public /* synthetic */ j0(k0 k0Var, int i11) {
        this.f47771a = i11;
        this.f47772b = k0Var;
    }

    @Override // tx.c
    public final void accept(Object obj) {
        switch (this.f47771a) {
            case 0:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                k0 k0Var = this.f47772b;
                ObjectAnimator objectAnimator = k0Var.R;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                ta.a aVar = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ((x5) aVar).f33595f.animate().translationX(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(1200L).start();
                ta.a aVar2 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                ViewPropertyAnimator viewPropertyAnimatorAnimate = ((x5) aVar2).f33592c.animate();
                Context contextRequireContext = k0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                ViewPropertyAnimator viewPropertyAnimatorTranslationXBy = viewPropertyAnimatorAnimate.translationXBy(j3.Z(-56, contextRequireContext));
                Context contextRequireContext2 = k0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                viewPropertyAnimatorTranslationXBy.translationYBy(j3.Z(-84, contextRequireContext2)).setDuration(1200L).start();
                return;
            default:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                k0 k0Var2 = this.f47772b;
                sh.d dVar = k0Var2.T;
                if (dVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (dVar.f51699t == 0) {
                    k0Var2.C();
                    return;
                } else {
                    k0Var2.B();
                    return;
                }
        }
    }
}
