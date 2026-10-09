package dt;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f23830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f23831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f23832d;

    public /* synthetic */ g1(float f5, long j11, long j12, int i11) {
        this.f23829a = i11;
        this.f23832d = f5;
        this.f23830b = j11;
        this.f23831c = j12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws Throwable {
        long j11;
        switch (this.f23829a) {
            case 0:
                float f5 = this.f23832d;
                long j12 = this.f23830b;
                long j13 = this.f23831c;
                i2.d drawBehind = (i2.d) obj;
                kotlin.jvm.internal.m.f(drawBehind, "$this$drawBehind");
                g2.k kVarA = g2.o.a();
                float fE0 = drawBehind.e0(10);
                float fE1 = drawBehind.e0(c.f23675f);
                float fE2 = drawBehind.e0(c.f23674e);
                kVarA.g(CropImageView.DEFAULT_ASPECT_RATIO, fE2);
                float f11 = fE2 + CropImageView.DEFAULT_ASPECT_RATIO;
                kVarA.i(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO);
                kVarA.f(Float.intBitsToFloat((int) (drawBehind.d() >> 32)) - fE2, CropImageView.DEFAULT_ASPECT_RATIO);
                kVarA.i(Float.intBitsToFloat((int) (drawBehind.d() >> 32)), CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (drawBehind.d() >> 32)), fE2);
                kVarA.f(Float.intBitsToFloat((int) (drawBehind.d() >> 32)), Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)) - fE2);
                kVarA.i(Float.intBitsToFloat((int) (drawBehind.d() >> 32)), Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)), Float.intBitsToFloat((int) (drawBehind.d() >> 32)) - fE2, Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)));
                kVarA.f(f11, Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)));
                kVarA.i(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)), CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)) - fE2);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)) * 0.33333334f;
                kVarA.f(CropImageView.DEFAULT_ASPECT_RATIO, fIntBitsToFloat + fE0);
                kVarA.f(fE1, fIntBitsToFloat);
                kVarA.f(CropImageView.DEFAULT_ASPECT_RATIO, fIntBitsToFloat - fE0);
                kVarA.d();
                long jR0 = drawBehind.r0();
                xq.c cVarJ0 = drawBehind.j0();
                long jH = cVarJ0.H();
                cVarJ0.x().e();
                try {
                    ((a0.b2) cVarJ0.f56174b).n(jR0, f5, 1.0f);
                    i2.d.o0(drawBehind, kVarA, j12, CropImageView.DEFAULT_ASPECT_RATIO, i2.g.f34126a, 52);
                    j11 = jH;
                    try {
                        i2.d.o0(drawBehind, kVarA, j13, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h(drawBehind.e0(c.f23676g), CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 52);
                        com.google.android.material.datepicker.d.C(cVarJ0, j11);
                    } catch (Throwable th2) {
                        th = th2;
                        com.google.android.material.datepicker.d.C(cVarJ0, j11);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    j11 = jH;
                }
                break;
            case 1:
                i2.d Canvas = (i2.d) obj;
                kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) / 2.0f;
                float fE3 = Canvas.e0(5);
                Canvas.f0(this.f23830b, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() >> 32))) << 32), (480 & 8) != 0 ? 0.0f : fE3, (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
                Canvas.f0(this.f23831c, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() >> 32)) * this.f23832d) << 32), (480 & 8) != 0 ? 0.0f : fE3, (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
                break;
            case 2:
                i2.d drawBehind2 = (i2.d) obj;
                kotlin.jvm.internal.m.f(drawBehind2, "$this$drawBehind");
                long jD = drawBehind2.d();
                g2.k kVarA2 = g2.o.a();
                float fE4 = drawBehind2.e0(8);
                float fE5 = drawBehind2.e0(16);
                float fE6 = drawBehind2.e0(4);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jD >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jD & 4294967295L));
                float f12 = fE4 + fE6;
                kVarA2.g(CropImageView.DEFAULT_ASPECT_RATIO, f12);
                kVarA2.i(CropImageView.DEFAULT_ASPECT_RATIO, fE4, fE6, fE4);
                float f13 = fE5 / 2.0f;
                float f14 = this.f23832d;
                kVarA2.f(f14 - f13, fE4);
                kVarA2.f(f14, CropImageView.DEFAULT_ASPECT_RATIO);
                kVarA2.f(f14 + f13, fE4);
                float f15 = fIntBitsToFloat3 - fE6;
                kVarA2.f(f15, fE4);
                kVarA2.i(fIntBitsToFloat3, fE4, fIntBitsToFloat3, f12);
                float f16 = fIntBitsToFloat4 - fE6;
                kVarA2.f(fIntBitsToFloat3, f16);
                kVarA2.i(fIntBitsToFloat3, fIntBitsToFloat4, f15, fIntBitsToFloat4);
                kVarA2.f(fE6, fIntBitsToFloat4);
                kVarA2.i(CropImageView.DEFAULT_ASPECT_RATIO, fIntBitsToFloat4, CropImageView.DEFAULT_ASPECT_RATIO, f16);
                kVarA2.d();
                i2.d.o0(drawBehind2, kVarA2, this.f23830b, CropImageView.DEFAULT_ASPECT_RATIO, i2.g.f34126a, 52);
                i2.d.o0(drawBehind2, kVarA2, this.f23831c, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h(drawBehind2.e0(1), CropImageView.DEFAULT_ASPECT_RATIO, 1, 0, null, 26), 52);
                break;
            default:
                i2.d Canvas2 = (i2.d) obj;
                kotlin.jvm.internal.m.f(Canvas2, "$this$Canvas");
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (Canvas2.d() & 4294967295L)) / 2.0f;
                float fE7 = Canvas2.e0(6);
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (Canvas2.d() >> 32)) * this.f23832d;
                Canvas2.f0(this.f23830b, (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L) | (Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas2.d() >> 32))) << 32), (480 & 8) != 0 ? 0.0f : fE7, (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
                Canvas2.f0(this.f23831c, (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L) | (Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat6) << 32), (480 & 8) != 0 ? 0.0f : fE7, (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ g1(long j11, long j12, float f5, int i11) {
        this.f23829a = i11;
        this.f23830b = j11;
        this.f23831c = j12;
        this.f23832d = f5;
    }
}
