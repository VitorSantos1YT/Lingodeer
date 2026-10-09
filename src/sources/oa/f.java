package oa;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f44791b;

    public /* synthetic */ f(SwipeRefreshLayout swipeRefreshLayout, int i11) {
        this.f44790a = i11;
        this.f44791b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f5, Transformation transformation) {
        switch (this.f44790a) {
            case 0:
                this.f44791b.setAnimationProgress(f5);
                break;
            case 1:
                this.f44791b.setAnimationProgress(1.0f - f5);
                break;
            case 2:
                SwipeRefreshLayout swipeRefreshLayout = this.f44791b;
                int iAbs = swipeRefreshLayout.f2705b0 - Math.abs(swipeRefreshLayout.f2703a0);
                int i11 = swipeRefreshLayout.W;
                swipeRefreshLayout.setTargetOffsetTopAndBottom((i11 + ((int) ((iAbs - i11) * f5))) - swipeRefreshLayout.U.getTop());
                d dVar = swipeRefreshLayout.f2709d0;
                float f11 = 1.0f - f5;
                c cVar = dVar.f44782a;
                if (f11 != cVar.f44775p) {
                    cVar.f44775p = f11;
                }
                dVar.invalidateSelf();
                break;
            default:
                this.f44791b.e(f5);
                break;
        }
    }
}
