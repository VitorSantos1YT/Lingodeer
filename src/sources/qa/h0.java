package qa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends AnimatorListenerAdapter implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f47628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f47630c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47633f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f47631d = true;

    public h0(View view, int i11) {
        this.f47628a = view;
        this.f47629b = i11;
        this.f47630c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // qa.t
    public final void b() {
        g(false);
        if (this.f47633f) {
            return;
        }
        e0.b(this.f47628a, this.f47629b);
    }

    @Override // qa.t
    public final void c(v vVar) {
        vVar.E(this);
    }

    @Override // qa.t
    public final void e() {
        g(true);
        if (this.f47633f) {
            return;
        }
        e0.b(this.f47628a, 0);
    }

    public final void g(boolean z11) {
        ViewGroup viewGroup;
        if (!this.f47631d || this.f47632e == z11 || (viewGroup = this.f47630c) == null) {
            return;
        }
        this.f47632e = z11;
        ob.f.N(viewGroup, z11);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f47633f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f47633f) {
            e0.b(this.f47628a, this.f47629b);
            ViewGroup viewGroup = this.f47630c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z11) {
        if (z11) {
            e0.b(this.f47628a, 0);
            ViewGroup viewGroup = this.f47630c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z11) {
        if (z11) {
            return;
        }
        if (!this.f47633f) {
            e0.b(this.f47628a, this.f47629b);
            ViewGroup viewGroup = this.f47630c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // qa.t
    public final void a(v vVar) {
    }

    @Override // qa.t
    public final void f(v vVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
