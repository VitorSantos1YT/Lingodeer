package eg;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathInterpolator f25530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f25531b;

    public a(PathInterpolator pathInterpolator, float... fArr) {
        this.f25530a = pathInterpolator;
        this.f25531b = fArr;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        int length = this.f25531b.length;
        PathInterpolator pathInterpolator = this.f25530a;
        if (length > 1) {
            int i11 = 0;
            while (true) {
                float[] fArr = this.f25531b;
                if (i11 >= fArr.length - 1) {
                    break;
                }
                float f11 = fArr[i11];
                i11++;
                float f12 = fArr[i11];
                float f13 = f12 - f11;
                if (f5 >= f11 && f5 <= f12) {
                    return (pathInterpolator.getInterpolation((f5 - f11) / f13) * f13) + f11;
                }
            }
        }
        return pathInterpolator.getInterpolation(f5);
    }
}
