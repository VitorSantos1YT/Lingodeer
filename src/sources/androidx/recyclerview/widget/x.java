package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ScrollingTabContainerView;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2647b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2648c;

    public /* synthetic */ x(Object obj, int i11) {
        this.f2646a = i11;
        this.f2648c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f2646a) {
            case 0:
                this.f2647b = true;
                break;
            default:
                this.f2647b = true;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2646a) {
            case 0:
                z zVar = (z) this.f2648c;
                if (this.f2647b) {
                    this.f2647b = false;
                } else if (((Float) zVar.f2678z.getAnimatedValue()).floatValue() != CropImageView.DEFAULT_ASPECT_RATIO) {
                    zVar.A = 2;
                    zVar.f2671s.invalidate();
                } else {
                    zVar.A = 0;
                    zVar.d(0);
                }
                break;
            default:
                ScrollingTabContainerView scrollingTabContainerView = (ScrollingTabContainerView) this.f2648c;
                if (!this.f2647b) {
                    scrollingTabContainerView.setVisibility(0);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2646a) {
            case 1:
                ((ScrollingTabContainerView) this.f2648c).setVisibility(0);
                this.f2647b = false;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
