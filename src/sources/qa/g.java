package qa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f47626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47627b = false;

    public g(View view) {
        this.f47626a = view;
    }

    @Override // qa.t
    public final void b() {
        View view = this.f47626a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? e0.f47614a.u(view) : CropImageView.DEFAULT_ASPECT_RATIO));
    }

    @Override // qa.t
    public final void e() {
        this.f47626a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        e0.f47614a.I(this.f47626a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f47626a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f47627b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z11) {
        boolean z12 = this.f47627b;
        View view = this.f47626a;
        if (z12) {
            view.setLayerType(0, null);
        }
        if (z11) {
            return;
        }
        f0 f0Var = e0.f47614a;
        f0Var.I(view, 1.0f);
        f0Var.getClass();
    }

    @Override // qa.t
    public final void a(v vVar) {
    }

    @Override // qa.t
    public final void c(v vVar) {
    }

    @Override // qa.t
    public final void d(v vVar) {
    }

    @Override // qa.t
    public final void f(v vVar) {
    }
}
