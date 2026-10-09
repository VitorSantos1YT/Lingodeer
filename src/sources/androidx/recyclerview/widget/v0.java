package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k2 f2640b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(k2 k2Var, Context context, int i11) {
        super(context);
        this.f2639a = i11;
        this.f2640b = k2Var;
    }

    @Override // androidx.recyclerview.widget.r0
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        int i11;
        switch (this.f2639a) {
            case 0:
                i11 = displayMetrics.densityDpi;
                break;
            default:
                i11 = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i11;
    }

    @Override // androidx.recyclerview.widget.r0
    public int calculateTimeForScrolling(int i11) {
        switch (this.f2639a) {
            case 0:
                return Math.min(100, super.calculateTimeForScrolling(i11));
            default:
                return super.calculateTimeForScrolling(i11);
        }
    }

    @Override // androidx.recyclerview.widget.r0, androidx.recyclerview.widget.b2
    public final void onTargetFound(View view, c2 c2Var, z1 z1Var) {
        switch (this.f2639a) {
            case 0:
                w0 w0Var = (w0) this.f2640b;
                int[] iArrCalculateDistanceToFinalSnap = w0Var.calculateDistanceToFinalSnap(w0Var.mRecyclerView.getLayoutManager(), view);
                int i11 = iArrCalculateDistanceToFinalSnap[0];
                int i12 = iArrCalculateDistanceToFinalSnap[1];
                int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i11), Math.abs(i12)));
                if (iCalculateTimeForDeceleration > 0) {
                    z1Var.b(i11, i12, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
                }
                break;
            default:
                k2 k2Var = this.f2640b;
                RecyclerView recyclerView = k2Var.mRecyclerView;
                if (recyclerView != null) {
                    int[] iArrCalculateDistanceToFinalSnap2 = k2Var.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
                    int i13 = iArrCalculateDistanceToFinalSnap2[0];
                    int i14 = iArrCalculateDistanceToFinalSnap2[1];
                    int iCalculateTimeForDeceleration2 = calculateTimeForDeceleration(Math.max(Math.abs(i13), Math.abs(i14)));
                    if (iCalculateTimeForDeceleration2 > 0) {
                        z1Var.b(i13, i14, this.mDecelerateInterpolator, iCalculateTimeForDeceleration2);
                    }
                    break;
                }
                break;
        }
    }
}
