package hh;

import android.animation.ValueAnimator;
import androidx.core.widget.NestedScrollView;
import hj.i4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f32202b;

    public /* synthetic */ a0(c0 c0Var, int i11) {
        this.f32201a = i11;
        this.f32202b = c0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        switch (this.f32201a) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                c0 c0Var = this.f32202b;
                if (c0Var.getView() != null) {
                    Object animatedValue = it.getAnimatedValue();
                    kotlin.jvm.internal.m.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) animatedValue).intValue();
                    String.valueOf(iIntValue);
                    ta.a aVar = c0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar);
                    NestedScrollView nestedScrollView = ((i4) aVar).f32717p;
                    if (nestedScrollView != null) {
                        nestedScrollView.scrollTo(0, iIntValue);
                    }
                    break;
                }
                break;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                Object animatedValue2 = it.getAnimatedValue();
                kotlin.jvm.internal.m.d(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) animatedValue2).intValue();
                c0 c0Var2 = this.f32202b;
                String str = c0Var2.f36397c;
                String.valueOf(iIntValue2);
                ta.a aVar2 = c0Var2.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                NestedScrollView nestedScrollView2 = ((i4) aVar2).f32717p;
                if (nestedScrollView2 != null) {
                    nestedScrollView2.scrollTo(0, iIntValue2);
                }
                break;
        }
    }
}
