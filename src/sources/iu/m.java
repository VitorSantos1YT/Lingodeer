package iu;

import a0.b2;
import android.graphics.DashPathEffect;
import com.yalantis.ucrop.view.CropImageView;
import g2.q0;
import g2.x;
import java.util.List;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f34631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f34632c;

    public /* synthetic */ m(float f5, int i11, long j11) {
        this.f34630a = i11;
        this.f34631b = f5;
        this.f34632c = j11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f34630a;
        b0 b0Var = b0.f48488a;
        float f5 = this.f34631b;
        switch (i11) {
            case 0:
                i2.d drawBehind = (i2.d) obj;
                kotlin.jvm.internal.m.f(drawBehind, "$this$drawBehind");
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)))) & 4294967295L);
                float fE0 = drawBehind.e0(f5);
                i2.d.y(drawBehind, this.f34632c, 0L, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fE0)) << 32) | (((long) Float.floatToRawIntBits(fE0)) & 4294967295L), null, 240);
                return b0Var;
            case 1:
                i2.d drawBehind2 = (i2.d) obj;
                kotlin.jvm.internal.m.f(drawBehind2, "$this$drawBehind");
                if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
                    float fE1 = drawBehind2.e0(24);
                    long j11 = this.f34632c;
                    List listL = ns.o.L(new x(x.c(j11, 0.16f * f5)), new x(x.c(j11, 0.07f * f5)), new x(x.c(j11, 0.02f * f5)));
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind2.d() & 4294967295L)) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind2.d() >> 32)) / 2.0f)) << 32);
                    long jD = drawBehind2.d();
                    i2.d.B0(drawBehind2, new q0(listL, jFloatToRawIntBits2, Math.max(Float.intBitsToFloat((int) ((jD >> 32) & 2147483647L)), Float.intBitsToFloat((int) (jD & 2147483647L))) * 0.72f), 0L, drawBehind2.d(), (((long) Float.floatToRawIntBits(fE1)) << 32) | (((long) Float.floatToRawIntBits(fE1)) & 4294967295L), null, 242);
                    i2.d.y(drawBehind2, x.c(j11, f5 * 0.46f), 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind2.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind2.d() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(fE1)) << 32) | (((long) Float.floatToRawIntBits(fE1)) & 4294967295L), new i2.h(drawBehind2.e0(1), CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 226);
                }
                return b0Var;
            default:
                long j12 = this.f34632c;
                i2.d Canvas = (i2.d) obj;
                kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
                long jR0 = Canvas.r0();
                xq.c cVarJ0 = Canvas.j0();
                long jH = cVarJ0.H();
                cVarJ0.x().e();
                try {
                    ((b2) cVarJ0.f56174b).n(jR0, f5, 1.0f);
                    g2.k kVarA = g2.o.a();
                    kVarA.g(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                    kVarA.i(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) / 2.0f, Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) / 2.0f, Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) / 2.0f);
                    kVarA.f(Float.intBitsToFloat((int) (Canvas.d() >> 32)) - (Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) / 2.0f), Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) / 2.0f);
                    kVarA.i(Float.intBitsToFloat((int) (Canvas.d() >> 32)), Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) / 2.0f, Float.intBitsToFloat((int) (Canvas.d() >> 32)), Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)));
                    float f11 = 6;
                    i2.d.o0(Canvas, kVarA, j12, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h(Canvas.e0(3), CropImageView.DEFAULT_ASPECT_RATIO, 1, 0, new g2.l(new DashPathEffect(new float[]{Canvas.e0(f11), Canvas.e0(f11)}, CropImageView.DEFAULT_ASPECT_RATIO)), 10), 52);
                    return b0Var;
                } finally {
                    com.google.android.material.datepicker.d.C(cVarJ0, jH);
                }
        }
    }

    public /* synthetic */ m(long j11, float f5) {
        this.f34630a = 0;
        this.f34632c = j11;
        this.f34631b = f5;
    }
}
