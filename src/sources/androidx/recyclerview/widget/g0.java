package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2460a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        switch (this.f2460a) {
            case 0:
                return f5 * f5 * f5 * f5 * f5;
            case 1:
            default:
                float f11 = f5 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }
}
