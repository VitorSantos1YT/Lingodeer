package a0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f17a;

    static {
        float f5;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float[] fArr = new float[101];
        f17a = fArr;
        float[] fArr2 = new float[101];
        float f19 = CropImageView.DEFAULT_ASPECT_RATIO;
        int i11 = 0;
        float f21 = 0.0f;
        while (true) {
            float f22 = 1.0f;
            if (i11 >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f23 = i11 / 100;
            float f24 = 1.0f;
            while (true) {
                f5 = ((f24 - f19) / 2.0f) + f19;
                f11 = f22 - f5;
                f12 = f5 * 3.0f * f11;
                f13 = f5 * f5 * f5;
                float f25 = (((f5 * 0.35000002f) + (f11 * 0.175f)) * f12) + f13;
                f14 = f22;
                if (Math.abs(f25 - f23) < 1.0E-5d) {
                    break;
                }
                if (f25 > f23) {
                    f24 = f5;
                } else {
                    f19 = f5;
                }
                f22 = f14;
            }
            float f26 = 0.5f;
            fArr[i11] = (((f11 * 0.5f) + f5) * f12) + f13;
            float f27 = f14;
            while (true) {
                f15 = ((f27 - f21) / 2.0f) + f21;
                f16 = f14 - f15;
                f17 = f15 * 3.0f * f16;
                f18 = f15 * f15 * f15;
                float f28 = (((f16 * f26) + f15) * f17) + f18;
                float f29 = f27;
                if (Math.abs(f28 - f23) >= 1.0E-5d) {
                    if (f28 > f23) {
                        f27 = f15;
                    } else {
                        f21 = f15;
                        f27 = f29;
                    }
                    f26 = 0.5f;
                }
            }
            fArr2[i11] = (((f15 * 0.35000002f) + (f16 * 0.175f)) * f17) + f18;
            i11++;
        }
    }

    public static a a(float f5) {
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        float f12 = 1.0f;
        float fK = hz.b.k(f5, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        float f13 = 100;
        int i11 = (int) (f13 * fK);
        if (i11 < 100) {
            float f14 = i11 / f13;
            int i12 = i11 + 1;
            float f15 = i12 / f13;
            float[] fArr = f17a;
            float f16 = fArr[i11];
            float f17 = (fArr[i12] - f16) / (f15 - f14);
            float fA = hh.p0.a(fK, f14, f17, f16);
            f11 = f17;
            f12 = fA;
        }
        return new a(f12, f11);
    }
}
