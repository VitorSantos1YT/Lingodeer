package h9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f32097b;

    public /* synthetic */ u(w wVar, int i11) {
        this.f32096a = i11;
        this.f32097b = wVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f32096a) {
            case 0:
                w wVar = this.f32097b;
                View view = wVar.f32102b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = wVar.f32103c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = wVar.f32105e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                this.f32097b.i(0);
                break;
            case 3:
                this.f32097b.i(0);
                break;
            case 4:
                ViewGroup viewGroup3 = this.f32097b.f32106f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
                break;
            case 5:
                ViewGroup viewGroup4 = this.f32097b.f32108h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i11 = this.f32096a;
        w wVar = this.f32097b;
        switch (i11) {
            case 0:
                View view = wVar.f32110j;
                if ((view instanceof DefaultTimeBar) && !wVar.A) {
                    DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                    ValueAnimator valueAnimator = defaultTimeBar.f2179j0;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(defaultTimeBar.f2180k0, CropImageView.DEFAULT_ASPECT_RATIO);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = wVar.f32102b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = wVar.f32103c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = wVar.f32105e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(wVar.A ? 0 : 4);
                }
                View view3 = wVar.f32110j;
                if ((view3 instanceof DefaultTimeBar) && !wVar.A) {
                    DefaultTimeBar defaultTimeBar2 = (DefaultTimeBar) view3;
                    ValueAnimator valueAnimator2 = defaultTimeBar2.f2179j0;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    defaultTimeBar2.f2181l0 = false;
                    valueAnimator2.setFloatValues(defaultTimeBar2.f2180k0, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                wVar.i(4);
                break;
            case 3:
                wVar.i(4);
                break;
            case 4:
                ViewGroup viewGroup3 = wVar.f32108h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    ViewGroup viewGroup4 = wVar.f32108h;
                    viewGroup4.setTranslationX(viewGroup4.getWidth());
                    ViewGroup viewGroup5 = wVar.f32108h;
                    viewGroup5.scrollTo(viewGroup5.getWidth(), 0);
                }
                break;
            default:
                ViewGroup viewGroup6 = wVar.f32106f;
                if (viewGroup6 != null) {
                    viewGroup6.setVisibility(0);
                }
                break;
        }
    }
}
