package hh;

import android.animation.ValueAnimator;
import hj.j4;
import ko.Zea.ealNNtLp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f32238b;

    public /* synthetic */ h0(j0 j0Var, int i11) {
        this.f32237a = i11;
        this.f32238b = j0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        switch (this.f32237a) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                Object animatedValue = it.getAnimatedValue();
                kotlin.jvm.internal.m.d(animatedValue, ealNNtLp.LUwGGex);
                int iIntValue = ((Integer) animatedValue).intValue();
                j0 j0Var = this.f32238b;
                String str = j0Var.f36397c;
                String.valueOf(iIntValue);
                ta.a aVar = j0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ((j4) aVar).f32775l.scrollTo(0, iIntValue);
                break;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                Object animatedValue2 = it.getAnimatedValue();
                kotlin.jvm.internal.m.d(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) animatedValue2).intValue();
                j0 j0Var2 = this.f32238b;
                String str2 = j0Var2.f36397c;
                String.valueOf(iIntValue2);
                ta.a aVar2 = j0Var2.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                ((j4) aVar2).f32775l.scrollTo(0, iIntValue2);
                break;
        }
    }
}
