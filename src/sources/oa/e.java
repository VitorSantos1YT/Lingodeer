package oa;

import android.view.animation.Animation;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b0.a1;
import bp.r3;
import com.lingo.lingoskill.ui.base.NewsFeedActivity;
import hj.f0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44789b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f44788a = i11;
        this.f44789b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        i iVar;
        int i11 = this.f44788a;
        Object obj = this.f44789b;
        switch (i11) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) obj;
                if (!swipeRefreshLayout.f2706c) {
                    swipeRefreshLayout.f();
                } else {
                    swipeRefreshLayout.f2709d0.setAlpha(255);
                    swipeRefreshLayout.f2709d0.start();
                    if (swipeRefreshLayout.f2716i0 && (iVar = swipeRefreshLayout.f2704b) != null) {
                        NewsFeedActivity newsFeedActivity = ((r3) iVar).f4793a;
                        int i12 = NewsFeedActivity.R;
                        ((f0) newsFeedActivity.j()).f32559d.setRefreshing(true);
                        e0.B(LifecycleOwnerKt.getLifecycleScope(newsFeedActivity), null, null, new a1(newsFeedActivity, null, 7), 3);
                    }
                    swipeRefreshLayout.O = swipeRefreshLayout.U.getTop();
                }
                break;
            default:
                xs.h hVar = (xs.h) obj;
                hVar.N = false;
                hVar.f56244e = true;
                hVar.f56242c.removeAllViews();
                if (!hVar.f56241b0) {
                    hVar.f();
                    break;
                }
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i11 = this.f44788a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i11 = this.f44788a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
