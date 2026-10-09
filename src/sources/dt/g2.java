package dt;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j3.y0 f23834b;

    public /* synthetic */ g2(j3.y0 y0Var, int i11) {
        this.f23833a = i11;
        this.f23834b = y0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f23833a) {
            case 0:
                i2.d drawBehind = (i2.d) obj;
                kotlin.jvm.internal.m.f(drawBehind, "$this$drawBehind");
                long jB = this.f23834b.b();
                float f5 = 2;
                float fE0 = drawBehind.e0(f5) + CropImageView.DEFAULT_ASPECT_RATIO;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fE0) << 32);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.d() >> 32)) - drawBehind.e0(f5);
                drawBehind.f0(jB, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), (480 & 8) != 0 ? 0.0f : drawBehind.e0(1), (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
                break;
            case 1:
                i2.d drawBehind2 = (i2.d) obj;
                kotlin.jvm.internal.m.f(drawBehind2, "$this$drawBehind");
                long jB2 = this.f23834b.b();
                float f11 = 2;
                float fE1 = drawBehind2.e0(f11) + CropImageView.DEFAULT_ASPECT_RATIO;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind2.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fE1) << 32);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind2.d() >> 32)) - drawBehind2.e0(f11);
                drawBehind2.f0(jB2, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind2.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32), (480 & 8) != 0 ? 0.0f : drawBehind2.e0(1), (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
                break;
            case 2:
                i2.d drawBehind3 = (i2.d) obj;
                kotlin.jvm.internal.m.f(drawBehind3, "$this$drawBehind");
                long jB3 = this.f23834b.b();
                float f12 = 2;
                float fE2 = drawBehind3.e0(f12) + CropImageView.DEFAULT_ASPECT_RATIO;
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind3.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fE2) << 32);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawBehind3.d() >> 32)) - drawBehind3.e0(f12);
                drawBehind3.f0(jB3, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind3.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32), (480 & 8) != 0 ? 0.0f : drawBehind3.e0(1), (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
                break;
            case 3:
                i2.d drawBehind4 = (i2.d) obj;
                kotlin.jvm.internal.m.f(drawBehind4, "$this$drawBehind");
                long jB4 = this.f23834b.b();
                float f13 = 2;
                float fE3 = drawBehind4.e0(f13) + CropImageView.DEFAULT_ASPECT_RATIO;
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind4.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fE3) << 32);
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawBehind4.d() >> 32)) - drawBehind4.e0(f13);
                drawBehind4.f0(jB4, jFloatToRawIntBits4, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind4.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat4) << 32), (480 & 8) != 0 ? 0.0f : drawBehind4.e0(1), (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
                break;
            case 4:
                i2.d drawBehind5 = (i2.d) obj;
                kotlin.jvm.internal.m.f(drawBehind5, "$this$drawBehind");
                long jB5 = this.f23834b.b();
                float f14 = 2;
                float fE4 = drawBehind5.e0(f14) + CropImageView.DEFAULT_ASPECT_RATIO;
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind5.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fE4) << 32);
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (drawBehind5.d() >> 32)) - drawBehind5.e0(f14);
                drawBehind5.f0(jB5, jFloatToRawIntBits5, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind5.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat5) << 32), (480 & 8) != 0 ? 0.0f : drawBehind5.e0(1), (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
                break;
            default:
                i2.d drawBehind6 = (i2.d) obj;
                kotlin.jvm.internal.m.f(drawBehind6, "$this$drawBehind");
                long jB6 = this.f23834b.b();
                float f15 = 2;
                float fE5 = drawBehind6.e0(f15) + CropImageView.DEFAULT_ASPECT_RATIO;
                long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind6.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fE5) << 32);
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (drawBehind6.d() >> 32)) - drawBehind6.e0(f15);
                drawBehind6.f0(jB6, jFloatToRawIntBits6, (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind6.d() & 4294967295L))))) | (Float.floatToRawIntBits(fIntBitsToFloat6) << 32), (480 & 8) != 0 ? 0.0f : drawBehind6.e0(1), (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
                break;
        }
        return qy.b0.f48488a;
    }
}
