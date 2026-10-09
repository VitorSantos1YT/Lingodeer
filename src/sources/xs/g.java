package xs;

import android.view.animation.Animation;
import android.widget.ImageView;
import com.lingodeer.course.stroke_order_view_new.old.HwView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56235a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f56236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f56237c;

    public g(h hVar, ImageView imageView) {
        this.f56237c = hVar;
        this.f56236b = imageView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        h hVar = this.f56237c;
        HwView hwView = hVar.f56242c;
        int i11 = this.f56235a + 1;
        this.f56235a = i11;
        if (i11 == 1) {
            this.f56236b.clearAnimation();
            hwView.removeAllViews();
            hwView.postDelayed(new py.b(this, 13), 100L);
            hVar.N = false;
            hVar.j();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
