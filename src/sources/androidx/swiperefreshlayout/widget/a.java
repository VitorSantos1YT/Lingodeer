package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import oa.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f2722a;

    public a(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2722a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        SwipeRefreshLayout swipeRefreshLayout = this.f2722a;
        f fVar = new f(swipeRefreshLayout, 1);
        swipeRefreshLayout.f2713f0 = fVar;
        fVar.setDuration(150L);
        CircleImageView circleImageView = swipeRefreshLayout.U;
        circleImageView.f2700a = null;
        circleImageView.clearAnimation();
        swipeRefreshLayout.U.startAnimation(swipeRefreshLayout.f2713f0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
