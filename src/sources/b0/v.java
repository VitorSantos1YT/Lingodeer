package b0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f3708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f3709f;

    public v(float f5, float f11, float f12, float f13) {
        int iK;
        this.f3704a = f5;
        this.f3705b = f11;
        this.f3706c = f12;
        this.f3707d = f13;
        if (!((Float.isNaN(f5) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) ? false : true)) {
            t0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f5 + ", " + f11 + ", " + f12 + ", " + f13 + '.');
        }
        float[] fArr = new float[5];
        float f14 = (f11 - CropImageView.DEFAULT_ASPECT_RATIO) * 3.0f;
        float f15 = (f13 - f11) * 3.0f;
        float f16 = (1.0f - f13) * 3.0f;
        double d5 = f14;
        double d11 = f15;
        double d12 = f16;
        double d13 = d11 * 2.0d;
        double d14 = (d5 - d13) + d12;
        if (d14 == 0.0d) {
            iK = d11 == d12 ? 0 : g2.f0.K((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, 0);
        } else {
            double d15 = -Math.sqrt((d11 * d11) - (d12 * d5));
            double d16 = (-d5) + d11;
            int iK2 = g2.f0.K((float) ((-(d15 + d16)) / d14), fArr, 0);
            int iK3 = g2.f0.K((float) ((d15 - d16) / d14), fArr, iK2) + iK2;
            if (iK3 > 1) {
                float f17 = fArr[0];
                float f18 = fArr[1];
                if (f17 > f18) {
                    fArr[0] = f18;
                    fArr[1] = f17;
                } else if (f17 == f18) {
                    iK = iK3 - 1;
                }
                iK = iK3;
            } else {
                iK = iK3;
            }
        }
        float f19 = (f15 - f14) * 2.0f;
        int iK4 = g2.f0.K((-f19) / (((f16 - f15) * 2.0f) - f19), fArr, iK) + iK;
        float fMin = Math.min(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        float fMax = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        for (int i11 = 0; i11 < iK4; i11++) {
            float f21 = fArr[i11];
            float f22 = (((((((((f11 - f13) * 3.0f) + 1.0f) - CropImageView.DEFAULT_ASPECT_RATIO) * f21) + (((f13 - (f11 * 2.0f)) + CropImageView.DEFAULT_ASPECT_RATIO) * 3.0f)) * f21) + f14) * f21) + CropImageView.DEFAULT_ASPECT_RATIO;
            fMin = Math.min(fMin, f22);
            fMax = Math.max(fMax, f22);
        }
        long jA = y.h.a(fMin, fMax);
        this.f3708e = Float.intBitsToFloat((int) (jA >> 32));
        this.f3709f = Float.intBitsToFloat((int) (jA & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0092 A[PHI: r3
      0x0092: PHI (r3v28 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v32 float), (r3v37 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0162 A[PHI: r12
      0x0162: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // b0.z
    public final float a(float f5) {
        float f11;
        if (f5 <= CropImageView.DEFAULT_ASPECT_RATIO || f5 >= 1.0f) {
            return f5;
        }
        float fMax = Math.max(f5, 1.1920929E-7f);
        float f12 = CropImageView.DEFAULT_ASPECT_RATIO - fMax;
        float f13 = this.f3704a;
        float f14 = f13 - fMax;
        float f15 = this.f3706c;
        float f16 = f15 - fMax;
        double d5 = f12;
        float f17 = 0.0f;
        double d11 = ((d5 - (((double) f14) * 2.0d)) + ((double) f16)) * 3.0d;
        double d12 = ((double) (f14 - f12)) * 3.0d;
        double d13 = (((double) (f14 - f16)) * 3.0d) + ((double) (-f12)) + ((double) (1.0f - fMax));
        float f18 = Float.NaN;
        if (Math.abs(d13 - 0.0d) >= 1.0E-7d) {
            double d14 = d11 / d13;
            double d15 = d12 / d13;
            double d16 = d5 / d13;
            double d17 = ((d15 * 3.0d) - (d14 * d14)) / 9.0d;
            double d18 = ((d16 * 27.0d) + ((((2.0d * d14) * d14) * d14) - ((9.0d * d14) * d15))) / 54.0d;
            double d19 = d17 * d17 * d17;
            double d20 = (d18 * d18) + d19;
            double d21 = d14 / 3.0d;
            if (d20 < 0.0d) {
                double dSqrt = Math.sqrt(-d19);
                double d22 = (-d18) / dSqrt;
                if (d22 < -1.0d) {
                    d22 = -1.0d;
                }
                if (d22 > 1.0d) {
                    d22 = 1.0d;
                }
                double dAcos = Math.acos(d22);
                double dO = android.support.v4.media.session.a.o((float) dSqrt) * 2.0f;
                float fCos = (float) ((Math.cos(dAcos / 3.0d) * dO) - d21);
                float f19 = fCos < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : fCos;
                if (f19 > 1.0f) {
                    f19 = 1.0f;
                }
                if (Math.abs(f19 - fCos) > 1.05E-6f) {
                    f19 = Float.NaN;
                }
                if (Float.isNaN(f19)) {
                    float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dO) - d21);
                    f19 = fCos2 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : fCos2;
                    if (f19 > 1.0f) {
                        f19 = 1.0f;
                    }
                    if (Math.abs(f19 - fCos2) > 1.05E-6f) {
                        f19 = Float.NaN;
                    }
                    if (Float.isNaN(f19)) {
                        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dO) - d21);
                        if (fCos3 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                            f17 = fCos3;
                        }
                        f11 = f17 > 1.0f ? 1.0f : f17;
                        if (Math.abs(f11 - fCos3) <= 1.05E-6f) {
                            f18 = f11;
                        }
                    } else {
                        f18 = f19;
                    }
                } else {
                    f18 = f19;
                }
            } else if (d20 == 0.0d) {
                float f21 = -android.support.v4.media.session.a.o((float) d18);
                float f22 = (float) d21;
                float f23 = (f21 * 2.0f) - f22;
                float f24 = f23 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : f23;
                if (f24 > 1.0f) {
                    f24 = 1.0f;
                }
                if (Math.abs(f24 - f23) > 1.05E-6f) {
                    f24 = Float.NaN;
                }
                if (Float.isNaN(f24)) {
                    float f25 = (-f21) - f22;
                    if (f25 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                        f17 = f25;
                    }
                    f11 = f17 > 1.0f ? 1.0f : f17;
                    if (Math.abs(f11 - f25) <= 1.05E-6f) {
                        f18 = f11;
                    }
                } else {
                    f18 = f24;
                }
            } else {
                double dSqrt2 = Math.sqrt(d20);
                float fO = (float) (((double) (android.support.v4.media.session.a.o((float) ((-d18) + dSqrt2)) - android.support.v4.media.session.a.o((float) (d18 + dSqrt2)))) - d21);
                if (fO >= CropImageView.DEFAULT_ASPECT_RATIO) {
                    f17 = fO;
                }
                f11 = f17 > 1.0f ? 1.0f : f17;
                if (Math.abs(f11 - fO) <= 1.05E-6f) {
                    f18 = f11;
                }
            }
        } else if (Math.abs(d11 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d12 * d12) - ((4.0d * d11) * d5));
            double d23 = d11 * 2.0d;
            float f26 = (float) ((dSqrt3 - d12) / d23);
            float f27 = f26 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : f26;
            if (f27 > 1.0f) {
                f27 = 1.0f;
            }
            if (Math.abs(f27 - f26) > 1.05E-6f) {
                f27 = Float.NaN;
            }
            if (Float.isNaN(f27)) {
                float f28 = (float) (((-d12) - dSqrt3) / d23);
                if (f28 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                    f17 = f28;
                }
                f11 = f17 > 1.0f ? 1.0f : f17;
                if (Math.abs(f11 - f28) <= 1.05E-6f) {
                    f18 = f11;
                }
            } else {
                f18 = f27;
            }
        } else if (Math.abs(d12 - 0.0d) >= 1.0E-7d) {
            float f29 = (float) ((-d5) / d12);
            if (f29 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                f17 = f29;
            }
            f11 = f17 > 1.0f ? 1.0f : f17;
            if (Math.abs(f11 - f29) <= 1.05E-6f) {
                f18 = f11;
            }
        }
        boolean zIsNaN = Float.isNaN(f18);
        float f30 = this.f3707d;
        float f31 = this.f3705b;
        if (!zIsNaN) {
            float f32 = ((((((f31 - f30) + 0.33333334f) * f18) + (f30 - (2.0f * f31))) * f18) + f31) * 3.0f * f18;
            float f33 = this.f3708e;
            if (f32 < f33) {
                f32 = f33;
            }
            float f34 = this.f3709f;
            return f32 > f34 ? f34 : f32;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f13 + ", " + f31 + ", " + f15 + ", " + f30 + ") has no solution at " + f5);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f3704a == vVar.f3704a && this.f3705b == vVar.f3705b && this.f3706c == vVar.f3706c && this.f3707d == vVar.f3707d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3707d) + defpackage.e.a(defpackage.e.a(Float.hashCode(this.f3704a) * 31, this.f3705b, 31), this.f3706c, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CubicBezierEasing(a=");
        sb2.append(this.f3704a);
        sb2.append(", b=");
        sb2.append(this.f3705b);
        sb2.append(", c=");
        sb2.append(this.f3706c);
        sb2.append(", d=");
        return defpackage.e.o(sb2, this.f3707d, ')');
    }
}
