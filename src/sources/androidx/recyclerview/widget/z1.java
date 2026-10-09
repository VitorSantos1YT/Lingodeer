package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Interpolator f2684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2685f;

    public final void a(RecyclerView recyclerView) {
        int i11 = this.f2683d;
        if (i11 >= 0) {
            this.f2683d = -1;
            recyclerView.jumpToPositionForSmoothScroller(i11);
            this.f2685f = false;
        } else if (this.f2685f) {
            Interpolator interpolator = this.f2684e;
            if (interpolator != null && this.f2682c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i12 = this.f2682c;
            if (i12 < 1) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            recyclerView.mViewFlinger.c(this.f2680a, this.f2681b, interpolator, i12);
            this.f2685f = false;
        }
    }

    public final void b(int i11, int i12, Interpolator interpolator, int i13) {
        this.f2680a = i11;
        this.f2681b = i12;
        this.f2682c = i13;
        this.f2684e = interpolator;
        this.f2685f = true;
    }
}
