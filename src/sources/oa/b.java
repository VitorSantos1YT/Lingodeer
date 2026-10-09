package oa;

import android.animation.Animator;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f44759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f44760b;

    public b(d dVar, c cVar) {
        this.f44760b = dVar;
        this.f44759a = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        d dVar = this.f44760b;
        c cVar = this.f44759a;
        dVar.a(1.0f, cVar, true);
        cVar.f44771k = cVar.f44765e;
        cVar.f44772l = cVar.f44766f;
        cVar.m = cVar.f44767g;
        cVar.a((cVar.f44770j + 1) % cVar.f44769i.length);
        if (!dVar.f44787f) {
            dVar.f44786e += 1.0f;
            return;
        }
        dVar.f44787f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (cVar.f44773n) {
            cVar.f44773n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f44760b.f44786e = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
