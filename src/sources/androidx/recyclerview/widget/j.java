package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f2486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f2488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f2489e;

    public /* synthetic */ j(m mVar, k kVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i11) {
        this.f2485a = i11;
        this.f2489e = mVar;
        this.f2486b = kVar;
        this.f2487c = viewPropertyAnimator;
        this.f2488d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2485a) {
            case 0:
                this.f2487c.setListener(null);
                View view = this.f2488d;
                view.setAlpha(1.0f);
                view.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                k kVar = this.f2486b;
                g2 g2Var = kVar.f2492a;
                m mVar = this.f2489e;
                mVar.c(g2Var);
                mVar.f2533r.remove(kVar.f2492a);
                mVar.i();
                break;
            default:
                this.f2487c.setListener(null);
                View view2 = this.f2488d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                view2.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                k kVar2 = this.f2486b;
                g2 g2Var2 = kVar2.f2493b;
                m mVar2 = this.f2489e;
                mVar2.c(g2Var2);
                mVar2.f2533r.remove(kVar2.f2493b);
                mVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2485a) {
            case 0:
                g2 g2Var = this.f2486b.f2492a;
                this.f2489e.getClass();
                break;
            default:
                g2 g2Var2 = this.f2486b.f2493b;
                this.f2489e.getClass();
                break;
        }
    }
}
