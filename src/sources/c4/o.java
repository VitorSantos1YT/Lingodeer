package c4;

import android.graphics.Color;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f6594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f6595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f6596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f6597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f6599f;

    public o(float f5, float f11, float f12, float f13, float f14, float f15) {
        this.f6594a = f5;
        this.f6595b = f11;
        this.f6596c = f12;
        this.f6597d = f13;
        this.f6598e = f14;
        this.f6599f = f15;
    }

    public static o b(int i11) {
        q4.k kVar = q4.k.f47450k;
        float fG = q4.a.g(Color.red(i11));
        float fG2 = q4.a.g(Color.green(i11));
        float fG3 = q4.a.g(Color.blue(i11));
        float[][] fArr = q4.a.f47425d;
        float[] fArr2 = fArr[0];
        float f5 = (fArr2[2] * fG3) + (fArr2[1] * fG2) + (fArr2[0] * fG);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * fG3) + (fArr3[1] * fG2) + (fArr3[0] * fG);
        float[] fArr4 = fArr[2];
        float f12 = (fG3 * fArr4[2]) + (fG2 * fArr4[1]) + (fG * fArr4[0]);
        float[][] fArr5 = q4.a.f47422a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f5);
        float[] fArr7 = fArr5[1];
        float f14 = (fArr7[2] * f12) + (fArr7[1] * f11) + (fArr7[0] * f5);
        float[] fArr8 = fArr5[2];
        float f15 = (f12 * fArr8[2]) + (f11 * fArr8[1]) + (f5 * fArr8[0]);
        float[] fArr9 = kVar.f47457g;
        float f16 = kVar.f47459i;
        float f17 = kVar.f47454d;
        float f18 = kVar.f47451a;
        float f19 = fArr9[0] * f13;
        float f21 = fArr9[1] * f14;
        float f22 = fArr9[2] * f15;
        float f23 = kVar.f47458h;
        float fPow = (float) Math.pow(((double) (Math.abs(f19) * f23)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f21) * f23)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f22) * f23)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f19) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f21) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f22) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d5 = fSignum3;
        float f24 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d5)) / 11.0f;
        float f25 = ((float) (((double) (fSignum + fSignum2)) - (d5 * 2.0d))) / 9.0f;
        float f26 = fSignum2 * 20.0f;
        float f27 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f26)) / 20.0f;
        float f28 = (((fSignum * 40.0f) + f26) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f25, f24)) * 180.0f) / 3.1415927f;
        if (fAtan2 < CropImageView.DEFAULT_ASPECT_RATIO) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f29 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f28 * kVar.f47452b) / f18, kVar.f47460j * f17)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f30 = f18 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, kVar.f47456f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * kVar.f47455e) * kVar.f47453c) * ((float) Math.sqrt((f25 * f25) + (f24 * f24)))) / (f27 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((fPow5 * f17) / f30);
        float f31 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f16 * fSqrt * 0.0228f) + 1.0f)) * 43.85965f;
        double d11 = f29;
        return new o(fAtan2, fSqrt, fPow4, f31, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    public static o c(float f5, float f11, float f12) {
        q4.k kVar = q4.k.f47450k;
        float f13 = kVar.f47454d;
        double d5 = ((double) f5) / 100.0d;
        Math.sqrt(d5);
        float f14 = kVar.f47451a + 4.0f;
        float f15 = kVar.f47459i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(d5))) * kVar.f47454d) / f14);
        float f16 = (1.7f * f5) / ((0.007f * f5) + 1.0f);
        float fLog = ((float) Math.log((((double) f15) * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (3.1415927f * f12) / 180.0f;
        return new o(f12, f11, f5, f16, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    public void a(float f5, float f11, int i11, int i12, float[] fArr) {
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = (f5 - 0.5f) * 2.0f;
        float f15 = (f11 - 0.5f) * 2.0f;
        float f16 = f12 + this.f6596c;
        float f17 = f13 + this.f6597d;
        float f18 = (this.f6594a * f14) + f16;
        float f19 = (this.f6595b * f15) + f17;
        float radians = (float) Math.toRadians(this.f6599f);
        float radians2 = (float) Math.toRadians(this.f6598e);
        double d5 = radians;
        double d11 = i12 * f15;
        float fSin = (((float) ((Math.sin(d5) * ((double) ((-i11) * f14))) - (Math.cos(d5) * d11))) * radians2) + f18;
        float fCos = (radians2 * ((float) ((Math.cos(d5) * ((double) (i11 * f14))) - (Math.sin(d5) * d11)))) + f19;
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public int d(q4.k kVar) {
        float fSqrt;
        float f5 = this.f6596c;
        float f11 = this.f6595b;
        if (f11 != 0.0d) {
            double d5 = f5;
            if (d5 == 0.0d) {
                fSqrt = CropImageView.DEFAULT_ASPECT_RATIO;
            } else {
                fSqrt = f11 / ((float) Math.sqrt(d5 / 100.0d));
            }
        } else {
            fSqrt = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float f12 = kVar.f47456f;
        float f13 = kVar.f47458h;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f12), 0.73d), 1.1111111111111112d);
        double d11 = (this.f6594a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f;
        float fPow2 = kVar.f47451a * ((float) Math.pow(((double) f5) / 100.0d, (1.0d / ((double) kVar.f47454d)) / ((double) kVar.f47460j)));
        float f14 = fCos * 3846.1538f * kVar.f47455e * kVar.f47453c;
        float f15 = fPow2 / kVar.f47452b;
        float fSin = (float) Math.sin(d11);
        float fCos2 = (float) Math.cos(d11);
        float f16 = (((0.305f + f15) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f14 * 23.0f)));
        float f17 = fCos2 * f16;
        float f18 = f16 * fSin;
        float f19 = f15 * 460.0f;
        float f21 = ((288.0f * f18) + ((451.0f * f17) + f19)) / 1403.0f;
        float f22 = ((f19 - (891.0f * f17)) - (261.0f * f18)) / 1403.0f;
        float f23 = ((f19 - (f17 * 220.0f)) - (f18 * 6300.0f)) / 1403.0f;
        float f24 = 100.0f / f13;
        float fSignum = Math.signum(f21) * f24 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f21)) * 27.13d) / (400.0d - ((double) Math.abs(f21)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f22) * f24 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f22)) * 27.13d) / (400.0d - ((double) Math.abs(f22)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f23) * f24 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f23)) * 27.13d) / (400.0d - ((double) Math.abs(f23)))), 2.380952380952381d));
        float[] fArr = kVar.f47457g;
        float f25 = fSignum / fArr[0];
        float f26 = fSignum2 / fArr[1];
        float f27 = fSignum3 / fArr[2];
        float[][] fArr2 = q4.a.f47423b;
        float[] fArr3 = fArr2[0];
        float f28 = (fArr3[2] * f27) + (fArr3[1] * f26) + (fArr3[0] * f25);
        float[] fArr4 = fArr2[1];
        float f29 = (fArr4[2] * f27) + (fArr4[1] * f26) + (fArr4[0] * f25);
        float[] fArr5 = fArr2[2];
        return r4.c.a(f28, f29, (f27 * fArr5[2]) + (f26 * fArr5[1]) + (f25 * fArr5[0]));
    }
}
