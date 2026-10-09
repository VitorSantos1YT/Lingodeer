package oa;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f44793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f44794c;

    public g(SwipeRefreshLayout swipeRefreshLayout, int i11, int i12) {
        this.f44794c = swipeRefreshLayout;
        this.f44792a = i11;
        this.f44793b = i12;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f5, Transformation transformation) {
        d dVar = this.f44794c.f2709d0;
        int i11 = this.f44792a;
        dVar.setAlpha((int) (((this.f44793b - i11) * f5) + i11));
    }
}
