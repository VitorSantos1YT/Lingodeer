package g2;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f28579a;

    public static float[] a() {
        return new float[]{1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f};
    }

    public static final long b(long j11, float[] fArr) {
        if (fArr.length < 16) {
            return j11;
        }
        float f5 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        float f19 = 1 / (((f15 * fIntBitsToFloat2) + (f12 * fIntBitsToFloat)) + f18);
        if ((Float.floatToRawIntBits(f19) & Integer.MAX_VALUE) >= 2139095040) {
            f19 = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        return (((long) Float.floatToRawIntBits((((f13 * fIntBitsToFloat2) + (f5 * fIntBitsToFloat)) + f16) * f19)) << 32) | (((long) Float.floatToRawIntBits(((f14 * fIntBitsToFloat2) + (f11 * fIntBitsToFloat) + f17) * f19)) & 4294967295L);
    }

    public static final void c(float[] fArr, f2.a aVar) {
        if (fArr.length < 16) {
            return;
        }
        float f5 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float f19 = aVar.f26566a;
        float f21 = aVar.f26567b;
        float f22 = aVar.f26568c;
        float f23 = aVar.f26569d;
        float f24 = f12 * f19;
        float f25 = f15 * f21;
        float f26 = 1.0f / ((f24 + f25) + f18);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f26) & Integer.MAX_VALUE;
        float f27 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (iFloatToRawIntBits >= 2139095040) {
            f26 = 0.0f;
        }
        float f28 = f5 * f19;
        float f29 = f13 * f21;
        float f30 = (f28 + f29 + f16) * f26;
        float f31 = f19 * f11;
        float f32 = f21 * f14;
        float f33 = (f31 + f32 + f17) * f26;
        float f34 = f15 * f23;
        float f35 = 1.0f / ((f24 + f34) + f18);
        if ((Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) >= 2139095040) {
            f35 = 0.0f;
        }
        float f36 = f13 * f23;
        float f37 = (f28 + f36 + f16) * f35;
        float f38 = f14 * f23;
        float f39 = (f31 + f38 + f17) * f35;
        float f40 = f12 * f22;
        float f41 = 1.0f / ((f25 + f40) + f18);
        if ((Float.floatToRawIntBits(f41) & Integer.MAX_VALUE) >= 2139095040) {
            f41 = 0.0f;
        }
        float f42 = f5 * f22;
        float f43 = (f42 + f29 + f16) * f41;
        float f44 = f22 * f11;
        float f45 = (f32 + f44 + f17) * f41;
        float f46 = 1.0f / ((f40 + f34) + f18);
        if ((Float.floatToRawIntBits(f46) & Integer.MAX_VALUE) < 2139095040) {
            f27 = f46;
        }
        float f47 = (f42 + f36 + f16) * f27;
        float f48 = (f44 + f38 + f17) * f27;
        aVar.f26566a = Math.min(f30, Math.min(f37, Math.min(f43, f47)));
        aVar.f26567b = Math.min(f33, Math.min(f39, Math.min(f45, f48)));
        aVar.f26568c = Math.max(f30, Math.max(f37, Math.max(f43, f47)));
        aVar.f26569d = Math.max(f33, Math.max(f39, Math.max(f45, f48)));
    }

    public static final void d(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void e(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f5 = fArr[0];
            float f11 = fArr2[0];
            float f12 = fArr[1];
            float f13 = fArr2[4];
            float f14 = fArr[2];
            float f15 = fArr2[8];
            float f16 = f14 * f15;
            float f17 = fArr[3];
            float f18 = fArr2[12];
            float f19 = f17 * f18;
            float f21 = f19 + f16 + (f12 * f13) + (f5 * f11);
            float f22 = fArr2[1];
            float f23 = fArr2[5];
            float f24 = fArr2[9];
            float f25 = f14 * f24;
            float f26 = fArr2[13];
            float f27 = f17 * f26;
            float f28 = f27 + f25 + (f12 * f23) + (f5 * f22);
            float f29 = fArr2[2];
            float f30 = fArr2[6];
            float f31 = fArr2[10];
            float f32 = f14 * f31;
            float f33 = fArr2[14];
            float f34 = f17 * f33;
            float f35 = f34 + f32 + (f12 * f30) + (f5 * f29);
            float f36 = fArr2[3];
            float f37 = fArr2[7];
            float f38 = fArr2[11];
            float f39 = f14 * f38;
            float f40 = fArr2[15];
            float f41 = f17 * f40;
            float f42 = f41 + f39 + (f12 * f37) + (f5 * f36);
            float f43 = fArr[4];
            float f44 = fArr[5];
            float f45 = fArr[6];
            float f46 = (f45 * f15) + (f44 * f13) + (f43 * f11);
            float f47 = fArr[7];
            float f48 = (f47 * f18) + f46;
            float f49 = (f47 * f26) + (f45 * f24) + (f44 * f23) + (f43 * f22);
            float f50 = (f47 * f33) + (f45 * f31) + (f44 * f30) + (f43 * f29);
            float f51 = f45 * f38;
            float f52 = f47 * f40;
            float f53 = f52 + f51 + (f44 * f37) + (f43 * f36);
            float f54 = fArr[8];
            float f55 = fArr[9];
            float f56 = fArr[10];
            float f57 = (f56 * f15) + (f55 * f13) + (f54 * f11);
            float f58 = fArr[11];
            float f59 = (f58 * f18) + f57;
            float f60 = (f58 * f26) + (f56 * f24) + (f55 * f23) + (f54 * f22);
            float f61 = (f58 * f33) + (f56 * f31) + (f55 * f30) + (f54 * f29);
            float f62 = f56 * f38;
            float f63 = f58 * f40;
            float f64 = f63 + f62 + (f55 * f37) + (f54 * f36);
            float f65 = fArr[12];
            float f66 = fArr[13];
            float f67 = (f13 * f66) + (f11 * f65);
            float f68 = fArr[14];
            float f69 = (f15 * f68) + f67;
            float f70 = fArr[15];
            float f71 = (f18 * f70) + f69;
            float f72 = f24 * f68;
            float f73 = f26 * f70;
            float f74 = f73 + f72 + (f23 * f66) + (f22 * f65);
            float f75 = f31 * f68;
            float f76 = f33 * f70;
            float f77 = f76 + f75 + (f30 * f66) + (f29 * f65);
            float f78 = f68 * f38;
            float f79 = f70 * f40;
            fArr[0] = f21;
            fArr[1] = f28;
            fArr[2] = f35;
            fArr[3] = f42;
            fArr[4] = f48;
            fArr[5] = f49;
            fArr[6] = f50;
            fArr[7] = f53;
            fArr[8] = f59;
            fArr[9] = f60;
            fArr[10] = f61;
            fArr[11] = f64;
            fArr[12] = f71;
            fArr[13] = f74;
            fArr[14] = f77;
            fArr[15] = f79 + f78 + (f66 * f37) + (f65 * f36);
        }
    }

    public static final void f(float[] fArr, float f5, float f11) {
        if (fArr.length < 16) {
            return;
        }
        float f12 = (fArr[8] * CropImageView.DEFAULT_ASPECT_RATIO) + (fArr[4] * f11) + (fArr[0] * f5) + fArr[12];
        float f13 = (fArr[9] * CropImageView.DEFAULT_ASPECT_RATIO) + (fArr[5] * f11) + (fArr[1] * f5) + fArr[13];
        float f14 = (fArr[10] * CropImageView.DEFAULT_ASPECT_RATIO) + (fArr[6] * f11) + (fArr[2] * f5) + fArr[14];
        float f15 = (fArr[11] * CropImageView.DEFAULT_ASPECT_RATIO) + (fArr[7] * f11) + (fArr[3] * f5) + fArr[15];
        fArr[12] = f12;
        fArr[13] = f13;
        fArr[14] = f14;
        fArr[15] = f15;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            return kotlin.jvm.internal.m.a(this.f28579a, ((k0) obj).f28579a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f28579a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |");
        float[] fArr = this.f28579a;
        sb2.append(fArr[0]);
        sb2.append(' ');
        sb2.append(fArr[1]);
        sb2.append(' ');
        sb2.append(fArr[2]);
        sb2.append(' ');
        sb2.append(fArr[3]);
        sb2.append("|\n            |");
        sb2.append(fArr[4]);
        sb2.append(' ');
        sb2.append(fArr[5]);
        sb2.append(' ');
        sb2.append(fArr[6]);
        sb2.append(' ');
        sb2.append(fArr[7]);
        sb2.append("|\n            |");
        sb2.append(fArr[8]);
        sb2.append(' ');
        sb2.append(fArr[9]);
        sb2.append(' ');
        sb2.append(fArr[10]);
        sb2.append(' ');
        sb2.append(fArr[11]);
        sb2.append("|\n            |");
        sb2.append(fArr[12]);
        sb2.append(' ');
        sb2.append(fArr[13]);
        sb2.append(' ');
        sb2.append(fArr[14]);
        sb2.append(' ');
        sb2.append(fArr[15]);
        sb2.append("|\n        ");
        return oz.r.g0(sb2.toString());
    }
}
