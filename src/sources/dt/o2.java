package dt;

import android.graphics.DashPathEffect;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f24055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f24056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f24057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f24058e;

    public /* synthetic */ o2(float f5, float f11, float f12, long j11) {
        this.f24054a = 0;
        this.f24055b = f5;
        this.f24057d = j11;
        this.f24056c = f11;
        this.f24058e = f12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f24054a;
        qy.b0 b0Var = qy.b0.f48488a;
        float f5 = this.f24056c;
        float f11 = this.f24055b;
        switch (i11) {
            case 0:
                i2.d drawBehind = (i2.d) obj;
                kotlin.jvm.internal.m.f(drawBehind, "$this$drawBehind");
                float fE0 = drawBehind.e0(2);
                float fE1 = drawBehind.e0(f11);
                float f12 = fE0 / 2.0f;
                i2.d.y(drawBehind, g2.x.c(this.f24057d, 0.7f), (((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (((long) Float.floatToRawIntBits(f12)) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.d() >> 32)) - fE0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)) - fE0)) & 4294967295L), (((long) Float.floatToRawIntBits(fE1)) & 4294967295L) | (((long) Float.floatToRawIntBits(fE1)) << 32), new i2.h(fE0, CropImageView.DEFAULT_ASPECT_RATIO, 1, 0, new g2.l(new DashPathEffect(new float[]{drawBehind.e0(f5), drawBehind.e0(this.f24058e)}, CropImageView.DEFAULT_ASPECT_RATIO)), 10), 224);
                break;
            case 1:
                i2.d onDrawBehind = (i2.d) obj;
                kotlin.jvm.internal.m.f(onDrawBehind, "$this$onDrawBehind");
                float f13 = f11 + f5;
                float fIntBitsToFloat = (((int) ((Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) - onDrawBehind.e0(6)) / f13)) * f13) - f5;
                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) - fIntBitsToFloat) / 2;
                onDrawBehind.f0(this.f24057d, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat + fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)))) & 4294967295L), (480 & 8) != 0 ? 0.0f : this.f24058e, (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : new g2.l(new DashPathEffect(new float[]{f11, f5}, CropImageView.DEFAULT_ASPECT_RATIO)), 3);
                break;
            default:
                i2.d onDrawBehind2 = (i2.d) obj;
                kotlin.jvm.internal.m.f(onDrawBehind2, "$this$onDrawBehind");
                float f14 = f11 + f5;
                float fIntBitsToFloat3 = (((int) (Float.intBitsToFloat((int) (onDrawBehind2.d() >> 32)) / f14)) * f14) - f5;
                float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (onDrawBehind2.d() >> 32)) - fIntBitsToFloat3) / 2;
                onDrawBehind2.f0(this.f24057d, (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (onDrawBehind2.d() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat3 + fIntBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (onDrawBehind2.d() & 4294967295L)))) & 4294967295L), (480 & 8) != 0 ? 0.0f : this.f24058e, (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : new g2.l(new DashPathEffect(new float[]{f11, f5}, CropImageView.DEFAULT_ASPECT_RATIO)), 3);
                break;
        }
        return b0Var;
    }

    public /* synthetic */ o2(float f5, float f11, long j11, float f12, int i11) {
        this.f24054a = i11;
        this.f24055b = f5;
        this.f24056c = f11;
        this.f24057d = j11;
        this.f24058e = f12;
    }
}
