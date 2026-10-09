package l5;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39746a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        switch (this.f39746a) {
            case 0:
            case 1:
                float f11 = f5 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            default:
                float f12 = f5 - 1.0f;
                return (((2.6f * f12) + 1.6f) * f12 * f12) + 1.0f;
        }
    }
}
