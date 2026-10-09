package b0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f3687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f3688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f3689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f3692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f3693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f3694l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f3695n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f3696o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f3697p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f3698q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f3699r;

    public u(int i11, float f5, float f11, float f12, float f13, float f14, float f15) {
        boolean z11;
        int i12;
        float f16;
        float f17;
        this.f3683a = f5;
        this.f3684b = f11;
        this.f3685c = f12;
        this.f3686d = f13;
        this.f3687e = f14;
        this.f3688f = f15;
        float f18 = f14 - f12;
        float f19 = f15 - f13;
        float f21 = CropImageView.DEFAULT_ASPECT_RATIO;
        int i13 = 1;
        boolean z12 = i11 == 1 || (i11 == 4 ? f19 > CropImageView.DEFAULT_ASPECT_RATIO : !(i11 != 5 || f19 >= CropImageView.DEFAULT_ASPECT_RATIO));
        float f22 = z12 ? -1.0f : 1.0f;
        this.m = f22;
        float f23 = 1 / (f11 - f5);
        this.f3693k = f23;
        float[] fArr = new float[101];
        this.f3692j = fArr;
        boolean z13 = i11 == 3;
        if (z13 || Math.abs(f18) < 0.001f || Math.abs(f19) < 0.001f) {
            float fHypot = (float) Math.hypot(f19, f18);
            this.f3689g = fHypot;
            this.f3694l = fHypot * f23;
            this.f3698q = f18 * f23;
            this.f3699r = f19 * f23;
            this.f3695n = Float.NaN;
            this.f3696o = Float.NaN;
            z11 = true;
        } else {
            this.f3695n = f18 * f22;
            this.f3696o = f19 * (-f22);
            this.f3698q = z12 ? f14 : f12;
            this.f3699r = z12 ? f13 : f15;
            float f24 = f14 - f12;
            float f25 = f13 - f15;
            float[] fArr2 = e.f3495i;
            int i14 = 90;
            float f26 = 90;
            float f27 = f25;
            float fHypot2 = 0.0f;
            float f28 = 0.0f;
            int i15 = 1;
            while (true) {
                i12 = i13;
                f16 = f21;
                double radians = (float) Math.toRadians((((double) i15) * 90.0d) / ((double) i14));
                float fSin = ((float) Math.sin(radians)) * f24;
                float fCos = ((float) Math.cos(radians)) * f25;
                float f29 = fSin - f28;
                f17 = f26;
                fHypot2 += (float) Math.hypot(f29, fCos - f27);
                fArr2[i15] = fHypot2;
                i14 = 90;
                if (i15 == 90) {
                    break;
                }
                i15++;
                f27 = fCos;
                f26 = f17;
                f21 = f16;
                f28 = fSin;
                i13 = i12;
            }
            this.f3689g = fHypot2;
            int i16 = i12;
            while (true) {
                fArr2[i16] = fArr2[i16] / fHypot2;
                if (i16 == 90) {
                    break;
                } else {
                    i16++;
                }
            }
            int length = fArr.length;
            for (int i17 = 0; i17 < length; i17++) {
                float f30 = i17 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f30);
                if (iBinarySearch >= 0) {
                    fArr[i17] = iBinarySearch / f17;
                } else if (iBinarySearch == -1) {
                    fArr[i17] = f16;
                } else {
                    int i18 = -iBinarySearch;
                    int i19 = i18 - 2;
                    float f31 = i19;
                    float f32 = fArr2[i19];
                    fArr[i17] = (((f30 - f32) / (fArr2[i18 - 1] - f32)) + f31) / f17;
                }
            }
            this.f3694l = this.f3689g * this.f3693k;
            z11 = z13;
        }
        this.f3697p = z11;
    }

    public final float a() {
        float f5 = this.f3695n * this.f3691i;
        return f5 * this.m * (this.f3694l / ((float) Math.hypot(f5, (-this.f3696o) * this.f3690h)));
    }

    public final float b() {
        float f5 = this.f3695n * this.f3691i;
        float f11 = (-this.f3696o) * this.f3690h;
        return f11 * this.m * (this.f3694l / ((float) Math.hypot(f5, f11)));
    }

    public final void c(float f5) {
        float f11 = (this.m == -1.0f ? this.f3684b - f5 : f5 - this.f3683a) * this.f3693k;
        float fA = CropImageView.DEFAULT_ASPECT_RATIO;
        if (f11 > CropImageView.DEFAULT_ASPECT_RATIO) {
            fA = 1.0f;
            if (f11 < 1.0f) {
                float f12 = f11 * 100;
                int i11 = (int) f12;
                float[] fArr = this.f3692j;
                float f13 = fArr[i11];
                fA = hh.p0.a(fArr[i11 + 1], f13, f12 - i11, f13);
            }
        }
        double d5 = fA * 1.5707964f;
        this.f3690h = (float) Math.sin(d5);
        this.f3691i = (float) Math.cos(d5);
    }
}
