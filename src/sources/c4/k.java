package c4;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f6571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f6572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f6573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f6574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f6576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f6577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f6578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6579i;

    @Override // c4.m
    public final boolean a() {
        double d5 = ((double) this.f6575e) - this.f6573c;
        double d11 = this.f6572b;
        double d12 = this.f6576f;
        return Math.sqrt((((d11 * d5) * d5) + ((d12 * d12) * ((double) this.f6577g))) / d11) <= ((double) this.f6578h);
    }

    @Override // c4.m
    public final float b() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // c4.m
    public final float getInterpolation(float f5) {
        double d5 = f5 - this.f6574d;
        if (d5 > 0.0d) {
            double d11 = this.f6572b;
            double d12 = this.f6571a;
            int iSqrt = (int) ((9.0d / ((Math.sqrt(d11 / ((double) this.f6577g)) * d5) * 4.0d)) + 1.0d);
            double d13 = d5 / ((double) iSqrt);
            int i11 = 0;
            while (i11 < iSqrt) {
                float f11 = this.f6575e;
                double d14 = f11;
                double d15 = this.f6573c;
                double d16 = d13;
                float f12 = this.f6576f;
                double d17 = f12;
                double d18 = ((-d11) * (d14 - d15)) - (d12 * d17);
                double d19 = this.f6577g;
                double d20 = (((d18 / d19) * d16) / 2.0d) + d17;
                double d21 = ((((-((((d16 * d20) / 2.0d) + d14) - d15)) * d11) - (d20 * d12)) / d19) * d16;
                float f13 = f12 + ((float) d21);
                this.f6576f = f13;
                float f14 = f11 + ((float) (((d21 / 2.0d) + d17) * d16));
                this.f6575e = f14;
                int i12 = this.f6579i;
                if (i12 > 0) {
                    if (f14 < CropImageView.DEFAULT_ASPECT_RATIO && (i12 & 1) == 1) {
                        this.f6575e = -f14;
                        this.f6576f = -f13;
                    }
                    float f15 = this.f6575e;
                    if (f15 > 1.0f && (i12 & 2) == 2) {
                        this.f6575e = 2.0f - f15;
                        this.f6576f = -this.f6576f;
                    }
                }
                i11++;
                d13 = d16;
            }
        }
        this.f6574d = f5;
        if (a()) {
            this.f6575e = (float) this.f6573c;
        }
        return this.f6575e;
    }
}
