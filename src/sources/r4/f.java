package r4;

import android.graphics.Path;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char f48798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f48799b;

    public f(char c11, float[] fArr) {
        this.f48798a = c11;
        this.f48799b = fArr;
    }

    public static void a(Path path, float f5, float f11, float f12, float f13, float f14, float f15, float f16, boolean z11, boolean z12) {
        double d5;
        double d11;
        double radians = Math.toRadians(f16);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d12 = f5;
        double d13 = f11;
        double d14 = f14;
        double d15 = ((d13 * dSin) + (d12 * dCos)) / d14;
        double d16 = f15;
        double d17 = ((d13 * dCos) + (((double) (-f5)) * dSin)) / d16;
        double d18 = f13;
        double d19 = ((d18 * dSin) + (((double) f12) * dCos)) / d14;
        double d20 = ((d18 * dCos) + (((double) (-f12)) * dSin)) / d16;
        double d21 = d15 - d19;
        double d22 = d17 - d20;
        double d23 = (d15 + d19) / 2.0d;
        double d24 = (d17 + d20) / 2.0d;
        double d25 = (d22 * d22) + (d21 * d21);
        if (d25 == 0.0d) {
            return;
        }
        double d26 = (1.0d / d25) - 0.25d;
        if (d26 < 0.0d) {
            float fSqrt = (float) (Math.sqrt(d25) / 1.99999d);
            a(path, f5, f11, f12, f13, f14 * fSqrt, fSqrt * f15, f16, z11, z12);
            return;
        }
        double dSqrt = Math.sqrt(d26);
        double d27 = d21 * dSqrt;
        double d28 = dSqrt * d22;
        if (z11 == z12) {
            d5 = d23 - d28;
            d11 = d24 + d27;
        } else {
            d5 = d23 + d28;
            d11 = d24 - d27;
        }
        double dAtan2 = Math.atan2(d17 - d11, d15 - d5);
        double dAtan3 = Math.atan2(d20 - d11, d19 - d5) - dAtan2;
        if (z12 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d29 = d5 * d14;
        double d30 = d11 * d16;
        double d31 = (d29 * dCos) - (d30 * dSin);
        double d32 = (d30 * dCos) + (d29 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d33 = -d14;
        double d34 = d33 * dCos2;
        double d35 = d16 * dSin2;
        double d36 = (d34 * dSin3) - (d35 * dCos3);
        double d37 = d33 * dSin2;
        double d38 = d16 * dCos2;
        double d39 = dAtan3 / ((double) iCeil);
        double d40 = (dCos3 * d38) + (dSin3 * d37);
        int i11 = 0;
        double d41 = d12;
        double d42 = d13;
        double d43 = dAtan2;
        while (i11 < iCeil) {
            double d44 = d43 + d39;
            double dSin4 = Math.sin(d44);
            double dCos4 = Math.cos(d44);
            double d45 = d39;
            double d46 = (((d14 * dCos2) * dCos4) + d31) - (d35 * dSin4);
            double d47 = d31;
            double d48 = (d38 * dSin4) + (d14 * dSin2 * dCos4) + d32;
            double d49 = (d34 * dSin4) - (d35 * dCos4);
            double d50 = (dCos4 * d38) + (dSin4 * d37);
            double d51 = d44 - d43;
            double dTan = Math.tan(d51 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d51)) / 3.0d;
            path.rLineTo(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            path.cubicTo((float) ((d36 * dSqrt2) + d41), (float) ((d40 * dSqrt2) + d42), (float) (d46 - (dSqrt2 * d49)), (float) (d48 - (dSqrt2 * d50)), (float) d46, (float) d48);
            i11++;
            d42 = d48;
            iCeil = iCeil;
            d37 = d37;
            dCos2 = dCos2;
            d43 = d44;
            d40 = d50;
            d36 = d49;
            d31 = d47;
            d41 = d46;
            d39 = d45;
        }
    }

    public f(f fVar) {
        this.f48798a = fVar.f48798a;
        float[] fArr = fVar.f48799b;
        this.f48799b = j3.k(fArr, fArr.length);
    }
}
