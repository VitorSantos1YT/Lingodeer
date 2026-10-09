package q4;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k f47450k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f47451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f47452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f47453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f47454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f47455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f47456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f47457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f47458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f47459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f47460j;

    static {
        float[] fArr = a.f47424c;
        float fN = (float) ((((double) a.n()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = a.f47422a;
        float f5 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f5;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f5);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f5 * fArr5[0]);
        float f18 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fN) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d5 = fExp;
        if (d5 > 1.0d) {
            fExp = 1.0f;
        } else if (d5 < 0.0d) {
            fExp = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float[] fArr6 = {(((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp};
        float f19 = 1.0f / ((5.0f * fN) + 1.0f);
        float f21 = f19 * f19 * f19 * f19;
        float f22 = 1.0f - f21;
        float fCbrt = (0.1f * f22 * f22 * ((float) Math.cbrt(((double) fN) * 5.0d))) + (f21 * fN);
        float fN2 = a.n() / fArr[1];
        double d11 = fN2;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f15)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f16)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f17)) / 100.0d, 0.42d)};
        float f23 = fArr7[0];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[1];
        float f26 = (f25 * 400.0f) / (f25 + 27.13f);
        float f27 = fArr7[2];
        float[] fArr8 = {f24, f26, (400.0f * f27) / (f27 + 27.13f)};
        f47450k = new k(fN2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f18, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public k(float f5, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f47456f = f5;
        this.f47451a = f11;
        this.f47452b = f12;
        this.f47453c = f13;
        this.f47454d = f14;
        this.f47455e = f15;
        this.f47457g = fArr;
        this.f47458h = f16;
        this.f47459i = f17;
        this.f47460j = f18;
    }
}
