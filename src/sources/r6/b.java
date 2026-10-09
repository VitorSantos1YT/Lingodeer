package r6;

import android.view.animation.Interpolator;
import com.yalantis.ucrop.view.CropImageView;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f48828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f48829b;

    public b(float[] fArr) {
        this.f48828a = fArr;
        this.f48829b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        if (f5 >= 1.0f) {
            return 1.0f;
        }
        if (f5 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float[] fArr = this.f48828a;
        int iMin = Math.min((int) ((fArr.length - 1) * f5), fArr.length - 2);
        float f11 = this.f48829b;
        float f12 = (f5 - (iMin * f11)) / f11;
        float f13 = fArr[iMin];
        return p0.a(fArr[iMin + 1], f13, f12, f13);
    }
}
