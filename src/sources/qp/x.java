package qp;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f48254b;

    public /* synthetic */ x(FrameLayout frameLayout, int i11) {
        this.f48253a = i11;
        this.f48254b = frameLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        switch (this.f48253a) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                Object animatedValue = it.getAnimatedValue();
                Drawable background = this.f48254b.getBackground();
                kotlin.jvm.internal.m.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                background.setTint(((Integer) animatedValue).intValue());
                break;
            case 1:
                kotlin.jvm.internal.m.f(it, "it");
                Object animatedValue2 = it.getAnimatedValue();
                TextView textView = (TextView) this.f48254b.findViewById(R.id.tv_char);
                if (textView != null) {
                    kotlin.jvm.internal.m.d(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                    textView.setTextColor(((Integer) animatedValue2).intValue());
                }
                break;
            case 2:
                kotlin.jvm.internal.m.f(it, "it");
                Object animatedValue3 = it.getAnimatedValue();
                Drawable background2 = this.f48254b.getBackground();
                kotlin.jvm.internal.m.d(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                background2.setTint(((Integer) animatedValue3).intValue());
                break;
            case 3:
                kotlin.jvm.internal.m.f(it, "it");
                Object animatedValue4 = it.getAnimatedValue();
                TextView textView2 = (TextView) this.f48254b.findViewById(R.id.tv_char);
                if (textView2 != null) {
                    kotlin.jvm.internal.m.d(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
                    textView2.setTextColor(((Integer) animatedValue4).intValue());
                }
                break;
            case 4:
                kotlin.jvm.internal.m.f(it, "it");
                Object animatedValue5 = it.getAnimatedValue();
                TextView textView3 = (TextView) this.f48254b.findViewById(R.id.tv_char);
                if (textView3 != null) {
                    kotlin.jvm.internal.m.d(animatedValue5, "null cannot be cast to non-null type kotlin.Int");
                    textView3.setTextColor(((Integer) animatedValue5).intValue());
                }
                break;
            case 5:
                kotlin.jvm.internal.m.f(it, "it");
                Object animatedValue6 = it.getAnimatedValue();
                Drawable background3 = this.f48254b.getBackground();
                kotlin.jvm.internal.m.d(animatedValue6, "null cannot be cast to non-null type kotlin.Int");
                background3.setTint(((Integer) animatedValue6).intValue());
                break;
            case 6:
                kotlin.jvm.internal.m.f(it, "it");
                Object animatedValue7 = it.getAnimatedValue();
                TextView textView4 = (TextView) this.f48254b.findViewById(R.id.tv_char);
                if (textView4 != null) {
                    kotlin.jvm.internal.m.d(animatedValue7, "null cannot be cast to non-null type kotlin.Int");
                    textView4.setTextColor(((Integer) animatedValue7).intValue());
                }
                break;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                Object animatedValue8 = it.getAnimatedValue();
                Drawable background4 = this.f48254b.getBackground();
                kotlin.jvm.internal.m.d(animatedValue8, "null cannot be cast to non-null type kotlin.Int");
                background4.setTint(((Integer) animatedValue8).intValue());
                break;
        }
    }
}
