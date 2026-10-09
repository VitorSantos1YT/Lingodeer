package h2;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f31492a = new t(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f31493b = new t(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f31494c = new t(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f31495d = new t(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f31496e = {0.964212f, 1.0f, 0.825188f};

    public static c a(c cVar) {
        if (b.a(cVar.f31457b, b.f31451a)) {
            r rVar = (r) cVar;
            t tVar = rVar.f31511d;
            t tVar2 = f31493b;
            if (!d(tVar, tVar2)) {
                return new r(rVar.f31456a, rVar.f31515h, tVar2, g(c(a.f31449b.f31450a, tVar.a(), tVar2.a()), rVar.f31516i), rVar.f31518k, rVar.f31520n, rVar.f31512e, rVar.f31513f, rVar.f31514g, -1);
            }
        }
        return cVar;
    }

    public static float b(float[] fArr) {
        if (fArr.length < 6) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float f5 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = (((((f12 * f15) + ((f11 * f14) + (f5 * f13))) - (f13 * f14)) - (f11 * f12)) - (f5 * f15)) * 0.5f;
        return f16 < CropImageView.DEFAULT_ASPECT_RATIO ? -f16 : f16;
    }

    public static final float[] c(float[] fArr, float[] fArr2, float[] fArr3) {
        h(fArr, fArr2);
        h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrF = f(fArr);
        float f5 = fArr4[0];
        float f11 = fArr[0] * f5;
        float f12 = fArr4[1];
        float f13 = fArr[1] * f12;
        float f14 = fArr4[2];
        return g(fArrF, new float[]{f11, f13, fArr[2] * f14, fArr[3] * f5, fArr[4] * f12, fArr[5] * f14, f5 * fArr[6], f12 * fArr[7], f14 * fArr[8]});
    }

    public static final boolean d(t tVar, t tVar2) {
        if (tVar == tVar2) {
            return true;
        }
        return Math.abs(tVar.f31531a - tVar2.f31531a) < 0.001f && Math.abs(tVar.f31532b - tVar2.f31532b) < 0.001f;
    }

    public static final h e(c cVar, c cVar2) {
        if (cVar == cVar2) {
            return new f(cVar, cVar, 1);
        }
        long j11 = cVar.f31457b;
        long j12 = b.f31451a;
        return (b.a(j11, j12) && b.a(cVar2.f31457b, j12)) ? new g((r) cVar, (r) cVar2) : new h(cVar, cVar2, 0);
    }

    public static final float[] f(float[] fArr) {
        float f5 = fArr[0];
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = fArr[5];
        float f18 = fArr[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f21 = (f15 * f16) - (f13 * f18);
        float f22 = (f13 * f17) - (f14 * f16);
        float f23 = (f12 * f22) + (f11 * f21) + (f5 * f19);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f19 / f23;
        fArr2[1] = f21 / f23;
        fArr2[2] = f22 / f23;
        fArr2[3] = ((f12 * f17) - (f11 * f18)) / f23;
        fArr2[4] = ((f18 * f5) - (f12 * f16)) / f23;
        fArr2[5] = ((f16 * f11) - (f17 * f5)) / f23;
        fArr2[6] = ((f11 * f15) - (f12 * f14)) / f23;
        fArr2[7] = ((f12 * f13) - (f15 * f5)) / f23;
        fArr2[8] = ((f5 * f14) - (f11 * f13)) / f23;
        return fArr2;
    }

    public static final float[] g(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f5 = fArr[0] * fArr2[0];
        float f11 = fArr[3];
        float f12 = fArr2[1];
        float f13 = fArr[6];
        float f14 = fArr2[2];
        fArr3[0] = (f13 * f14) + (f11 * f12) + f5;
        float f15 = fArr[1];
        float f16 = fArr2[0];
        float f17 = fArr[4];
        float f18 = fArr[7];
        float f19 = f18 * f14;
        fArr3[1] = f19 + (f12 * f17) + (f15 * f16);
        float f21 = fArr[2] * f16;
        float f22 = fArr[5];
        float f23 = (fArr2[1] * f22) + f21;
        float f24 = fArr[8];
        fArr3[2] = (f14 * f24) + f23;
        float f25 = fArr[0];
        float f26 = fArr2[3] * f25;
        float f27 = fArr2[4];
        float f28 = (f11 * f27) + f26;
        float f29 = fArr2[5];
        fArr3[3] = (f13 * f29) + f28;
        float f30 = fArr[1];
        float f31 = fArr2[3];
        float f32 = f17 * f27;
        fArr3[4] = (f18 * f29) + f32 + (f30 * f31);
        float f33 = fArr[2];
        float f34 = f29 * f24;
        fArr3[5] = f34 + (f22 * fArr2[4]) + (f31 * f33);
        float f35 = f25 * fArr2[6];
        float f36 = fArr[3];
        float f37 = fArr2[7];
        float f38 = (f36 * f37) + f35;
        float f39 = fArr2[8];
        fArr3[6] = (f13 * f39) + f38;
        float f40 = fArr2[6];
        float f41 = f18 * f39;
        fArr3[7] = f41 + (fArr[4] * f37) + (f30 * f40);
        float f42 = f24 * f39;
        fArr3[8] = f42 + (fArr[5] * fArr2[7]) + (f33 * f40);
        return fArr3;
    }

    public static final float[] h(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f5 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f5);
        fArr2[1] = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f5);
        fArr2[2] = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f5);
        return fArr2;
    }
}
