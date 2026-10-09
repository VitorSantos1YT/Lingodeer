package jp;

import android.util.DisplayMetrics;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends androidx.recyclerview.widget.r0 {
    @Override // androidx.recyclerview.widget.r0
    public final int calculateDtToFit(int i11, int i12, int i13, int i14, int i15) {
        return (int) (((((i14 - i13) * 1.0f) / 4.0f) + i13) - i11);
    }

    @Override // androidx.recyclerview.widget.r0
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        kotlin.jvm.internal.m.f(displayMetrics, "displayMetrics");
        return 120.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.r0
    public final int getVerticalSnapPreference() {
        return 0;
    }
}
