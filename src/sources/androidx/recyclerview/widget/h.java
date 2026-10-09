package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2461a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2 f2462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f2465e;

    public h(m mVar, g2 g2Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2465e = mVar;
        this.f2462b = g2Var;
        this.f2464d = viewPropertyAnimator;
        this.f2463c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2461a) {
            case 1:
                this.f2463c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2461a) {
            case 0:
                this.f2464d.setListener(null);
                this.f2463c.setAlpha(1.0f);
                m mVar = this.f2465e;
                g2 g2Var = this.f2462b;
                mVar.c(g2Var);
                mVar.f2532q.remove(g2Var);
                mVar.i();
                break;
            default:
                this.f2464d.setListener(null);
                m mVar2 = this.f2465e;
                g2 g2Var2 = this.f2462b;
                mVar2.c(g2Var2);
                mVar2.f2530o.remove(g2Var2);
                mVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2461a) {
            case 0:
                this.f2465e.getClass();
                break;
            default:
                this.f2465e.getClass();
                break;
        }
    }

    public h(m mVar, g2 g2Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2465e = mVar;
        this.f2462b = g2Var;
        this.f2463c = view;
        this.f2464d = viewPropertyAnimator;
    }
}
