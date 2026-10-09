package h2;

import com.yalantis.ucrop.view.CropImageView;
import g2.f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i11, int i12, long j11, String str) {
        super(str, j11, i11);
        this.f31497d = i12;
    }

    @Override // h2.c
    public final float a(int i11) {
        switch (this.f31497d) {
            case 0:
                return i11 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // h2.c
    public final float b(int i11) {
        switch (this.f31497d) {
            case 0:
                if (i11 == 0) {
                    return CropImageView.DEFAULT_ASPECT_RATIO;
                }
                return -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // h2.c
    public final long d(float f5, float f11, float f12) {
        switch (this.f31497d) {
            case 0:
                if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    f5 = 0.0f;
                }
                if (f5 > 100.0f) {
                    f5 = 100.0f;
                }
                if (f11 < -128.0f) {
                    f11 = -128.0f;
                }
                if (f11 > 128.0f) {
                    f11 = 128.0f;
                }
                float f13 = (f5 + 16.0f) / 116.0f;
                float f14 = (f11 * 0.002f) + f13;
                float f15 = f14 > 0.20689656f ? f14 * f14 * f14 : (f14 - 0.13793103f) * 0.12841855f;
                float f16 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
                float[] fArr = k.f31496e;
                return (((long) Float.floatToRawIntBits(f16 * fArr[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f15 * fArr[0])) << 32);
            default:
                if (f5 < -2.0f) {
                    f5 = -2.0f;
                }
                if (f5 > 2.0f) {
                    f5 = 2.0f;
                }
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                return (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f11 <= 2.0f ? f11 : 2.0f)) & 4294967295L);
        }
    }

    @Override // h2.c
    public final float e(float f5, float f11, float f12) {
        switch (this.f31497d) {
            case 0:
                if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    f5 = 0.0f;
                }
                if (f5 > 100.0f) {
                    f5 = 100.0f;
                }
                if (f12 < -128.0f) {
                    f12 = -128.0f;
                }
                if (f12 > 128.0f) {
                    f12 = 128.0f;
                }
                float f13 = ((f5 + 16.0f) / 116.0f) - (f12 * 0.005f);
                return (f13 > 0.20689656f ? f13 * f13 * f13 : 0.12841855f * (f13 - 0.13793103f)) * k.f31496e[2];
            default:
                if (f12 < -2.0f) {
                    f12 = -2.0f;
                }
                if (f12 > 2.0f) {
                    return 2.0f;
                }
                return f12;
        }
    }

    @Override // h2.c
    public final long f(float f5, float f11, float f12, float f13, c cVar) {
        switch (this.f31497d) {
            case 0:
                float[] fArr = k.f31496e;
                float f14 = f5 / fArr[0];
                float f15 = f11 / fArr[1];
                float f16 = f12 / fArr[2];
                float fCbrt = f14 > 0.008856452f ? (float) Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f;
                float f17 = (116.0f * fCbrt2) - 16.0f;
                float f18 = (fCbrt - fCbrt2) * 500.0f;
                float fCbrt3 = (fCbrt2 - (f16 > 0.008856452f ? (float) Math.cbrt(f16) : (f16 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f17 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    f17 = 0.0f;
                }
                if (f17 > 100.0f) {
                    f17 = 100.0f;
                }
                if (f18 < -128.0f) {
                    f18 = -128.0f;
                }
                if (f18 > 128.0f) {
                    f18 = 128.0f;
                }
                if (fCbrt3 < -128.0f) {
                    fCbrt3 = -128.0f;
                }
                return f0.b(f17, f18, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f13, cVar);
            default:
                if (f5 < -2.0f) {
                    f5 = -2.0f;
                }
                if (f5 > 2.0f) {
                    f5 = 2.0f;
                }
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                if (f11 > 2.0f) {
                    f11 = 2.0f;
                }
                if (f12 < -2.0f) {
                    f12 = -2.0f;
                }
                return f0.b(f5, f11, f12 <= 2.0f ? f12 : 2.0f, f13, cVar);
        }
    }
}
