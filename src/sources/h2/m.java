package h2;

import com.yalantis.ucrop.view.CropImageView;
import g2.f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f31498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f31499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float[] f31500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f31501g;

    static {
        float[] fArrG = k.g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, k.c(a.f31449b.f31450a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f31498d = fArrG;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f31499e = fArr;
        f31500f = k.f(fArrG);
        f31501g = k.f(fArr);
    }

    @Override // h2.c
    public final float a(int i11) {
        return i11 == 0 ? 1.0f : 0.5f;
    }

    @Override // h2.c
    public final float b(int i11) {
        if (i11 == 0) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        return -0.5f;
    }

    @Override // h2.c
    public final long d(float f5, float f11, float f12) {
        if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f31501g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f5);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f5);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f5);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f31500f;
        return (((long) Float.floatToRawIntBits((fArr2[7] * f19) + (fArr2[4] * f18) + (fArr2[1] * f17))) & 4294967295L) | (((long) Float.floatToRawIntBits((fArr2[6] * f19) + ((fArr2[3] * f18) + (fArr2[0] * f17)))) << 32);
    }

    @Override // h2.c
    public final float e(float f5, float f11, float f12) {
        if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f31501g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f5);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f5);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f5);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f31500f;
        return (fArr2[8] * f19) + (fArr2[5] * f18) + (fArr2[2] * f17);
    }

    @Override // h2.c
    public final long f(float f5, float f11, float f12, float f13, c cVar) {
        float[] fArr = f31498d;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f5);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f5);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f5);
        float fO = android.support.v4.media.session.a.o(f14);
        float fO2 = android.support.v4.media.session.a.o(f15);
        float fO3 = android.support.v4.media.session.a.o(f16);
        float[] fArr2 = f31499e;
        return f0.b((fArr2[6] * fO3) + (fArr2[3] * fO2) + (fArr2[0] * fO), (fArr2[7] * fO3) + (fArr2[4] * fO2) + (fArr2[1] * fO), (fArr2[8] * fO3) + (fArr2[5] * fO2) + (fArr2[2] * fO), f13, cVar);
    }
}
