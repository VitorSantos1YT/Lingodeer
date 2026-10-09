package q6;

import com.yalantis.ucrop.view.CropImageView;
import gb.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f47508a = y.h.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f47509b = 3.1415927f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f47510c = 6.2831855f;

    public static final float a(float f5, float f11) {
        float fAtan2 = (float) Math.atan2(f11, f5);
        float f12 = f47510c;
        return (fAtan2 + f12) % f12;
    }

    public static final long b(float f5, float f11) {
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f5 * f5));
        if (fSqrt > CropImageView.DEFAULT_ASPECT_RATIO) {
            return y.h.a(f5 / fSqrt, f11 / fSqrt);
        }
        throw new IllegalArgumentException("Required distance greater than zero");
    }

    public static final float c(float f5, float f11, float f12) {
        return (f12 * f11) + ((1 - f12) * f5);
    }

    public static final float d(float f5, float f11) {
        return ((f5 % f11) + f11) % f11;
    }

    public static long e(float f5, float f11) {
        double d5 = f11;
        return r.K(r.T(y.h.a((float) Math.cos(d5), (float) Math.sin(d5)), f5), f47508a);
    }
}
