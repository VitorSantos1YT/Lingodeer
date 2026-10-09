package c4;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f6581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f6582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f6583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f6584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f6586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f6587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f6588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f6589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f6592l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f6593n;

    @Override // c4.m
    public final boolean a() {
        return b() < 1.0E-5f && Math.abs(this.f6589i - this.m) < 1.0E-5f;
    }

    @Override // c4.m
    public final float b() {
        return this.f6591k ? -c(this.f6593n) : c(this.f6593n);
    }

    public final float c(float f5) {
        float f11;
        float f12;
        float f13 = this.f6584d;
        if (f5 <= f13) {
            f11 = this.f6581a;
            f12 = this.f6582b;
        } else {
            int i11 = this.f6590j;
            if (i11 == 1) {
                return CropImageView.DEFAULT_ASPECT_RATIO;
            }
            f5 -= f13;
            f13 = this.f6585e;
            if (f5 >= f13) {
                if (i11 == 2) {
                    return CropImageView.DEFAULT_ASPECT_RATIO;
                }
                float f14 = f5 - f13;
                float f15 = this.f6586f;
                if (f14 >= f15) {
                    return CropImageView.DEFAULT_ASPECT_RATIO;
                }
                float f16 = this.f6583c;
                return f16 - ((f14 * f16) / f15);
            }
            f11 = this.f6582b;
            f12 = this.f6583c;
        }
        return (((f12 - f11) * f5) / f13) + f11;
    }

    public final void d(float f5, float f11, float f12, float f13, float f14) {
        this.f6589i = f11;
        if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
            f5 = 1.0E-4f;
        }
        float f15 = f5 / f12;
        float f16 = (f15 * f5) / 2.0f;
        if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
            float fSqrt = (float) Math.sqrt((f11 - ((((-f5) / f12) * f5) / 2.0f)) * f12);
            if (fSqrt < f13) {
                this.f6590j = 2;
                this.f6581a = f5;
                this.f6582b = fSqrt;
                this.f6583c = CropImageView.DEFAULT_ASPECT_RATIO;
                float f17 = (fSqrt - f5) / f12;
                this.f6584d = f17;
                this.f6585e = fSqrt / f12;
                this.f6587g = ((f5 + fSqrt) * f17) / 2.0f;
                this.f6588h = f11;
                this.f6589i = f11;
                return;
            }
            this.f6590j = 3;
            this.f6581a = f5;
            this.f6582b = f13;
            this.f6583c = f13;
            float f18 = (f13 - f5) / f12;
            this.f6584d = f18;
            float f19 = f13 / f12;
            this.f6586f = f19;
            float f21 = ((f5 + f13) * f18) / 2.0f;
            float f22 = (f19 * f13) / 2.0f;
            this.f6585e = ((f11 - f21) - f22) / f13;
            this.f6587g = f21;
            this.f6588h = f11 - f22;
            this.f6589i = f11;
            return;
        }
        if (f16 >= f11) {
            this.f6590j = 1;
            this.f6581a = f5;
            this.f6582b = CropImageView.DEFAULT_ASPECT_RATIO;
            this.f6587g = f11;
            this.f6584d = (2.0f * f11) / f5;
            return;
        }
        float f23 = f11 - f16;
        float f24 = f23 / f5;
        if (f24 + f15 < f14) {
            this.f6590j = 2;
            this.f6581a = f5;
            this.f6582b = f5;
            this.f6583c = CropImageView.DEFAULT_ASPECT_RATIO;
            this.f6587g = f23;
            this.f6588h = f11;
            this.f6584d = f24;
            this.f6585e = f15;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f5 * f5) / 2.0f) + (f12 * f11));
        float f25 = (fSqrt2 - f5) / f12;
        this.f6584d = f25;
        float f26 = fSqrt2 / f12;
        this.f6585e = f26;
        if (fSqrt2 < f13) {
            this.f6590j = 2;
            this.f6581a = f5;
            this.f6582b = fSqrt2;
            this.f6583c = CropImageView.DEFAULT_ASPECT_RATIO;
            this.f6584d = f25;
            this.f6585e = f26;
            this.f6587g = ((f5 + fSqrt2) * f25) / 2.0f;
            this.f6588h = f11;
            return;
        }
        this.f6590j = 3;
        this.f6581a = f5;
        this.f6582b = f13;
        this.f6583c = f13;
        float f27 = (f13 - f5) / f12;
        this.f6584d = f27;
        float f28 = f13 / f12;
        this.f6586f = f28;
        float f29 = ((f5 + f13) * f27) / 2.0f;
        float f30 = (f28 * f13) / 2.0f;
        this.f6585e = ((f11 - f29) - f30) / f13;
        this.f6587g = f29;
        this.f6588h = f11 - f30;
        this.f6589i = f11;
    }

    @Override // c4.m
    public final float getInterpolation(float f5) {
        float f11;
        float f12 = this.f6584d;
        if (f5 <= f12) {
            float f13 = this.f6581a;
            f11 = ((((this.f6582b - f13) * f5) * f5) / (f12 * 2.0f)) + (f13 * f5);
        } else {
            int i11 = this.f6590j;
            if (i11 == 1) {
                f11 = this.f6587g;
            } else {
                float f14 = f5 - f12;
                float f15 = this.f6585e;
                if (f14 < f15) {
                    float f16 = this.f6587g;
                    float f17 = this.f6582b;
                    f11 = ((((this.f6583c - f17) * f14) * f14) / (f15 * 2.0f)) + (f17 * f14) + f16;
                } else if (i11 == 2) {
                    f11 = this.f6588h;
                } else {
                    float f18 = f14 - f15;
                    float f19 = this.f6586f;
                    if (f18 <= f19) {
                        float f21 = this.f6588h;
                        float f22 = this.f6583c * f18;
                        f11 = (f21 + f22) - ((f22 * f18) / (f19 * 2.0f));
                    } else {
                        f11 = this.f6589i;
                    }
                }
            }
        }
        this.m = f11;
        this.f6593n = f5;
        return this.f6591k ? this.f6592l - f11 : this.f6592l + f11;
    }
}
