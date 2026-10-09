package qa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.lingodeer.R;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends AnimatorListenerAdapter implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f47634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f47635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f47636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47637d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0 f47638e;

    public i0(j0 j0Var, ViewGroup viewGroup, View view, View view2) {
        this.f47638e = j0Var;
        this.f47634a = viewGroup;
        this.f47635b = view;
        this.f47636c = view2;
    }

    @Override // qa.t
    public final void c(v vVar) {
        vVar.E(this);
    }

    @Override // qa.t
    public final void f(v vVar) {
        if (this.f47637d) {
            g();
        }
    }

    public final void g() {
        this.f47636c.setTag(R.id.save_overlay_view, null);
        this.f47634a.getOverlay().remove(this.f47635b);
        this.f47637d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f47634a.getOverlay().remove(this.f47635b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f47635b;
        if (view.getParent() == null) {
            s0.a(view, this.f47634a);
        } else {
            this.f47638e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z11) {
        if (z11) {
            View view = this.f47636c;
            View view2 = this.f47635b;
            view.setTag(R.id.save_overlay_view, view2);
            s0.a(view2, this.f47634a);
            this.f47637d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z11) {
        if (z11) {
            return;
        }
        g();
    }

    @Override // qa.t
    public final void b() {
    }

    @Override // qa.t
    public final void e() {
    }

    @Override // qa.t
    public final void a(v vVar) {
    }
}
