package j1;

import a0.b2;
import a0.p1;
import com.yalantis.ucrop.view.CropImageView;
import g2.p0;
import l1.b3;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b3 f35470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f35471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f35472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f35473e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, b3 b3Var, long j11, p0 p0Var, int i11) {
        super(1);
        this.f35469a = i11;
        this.f35473e = obj;
        this.f35470b = b3Var;
        this.f35471c = j11;
        this.f35472d = p0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws Throwable {
        long j11;
        switch (this.f35469a) {
            case 0:
                i2.d dVar = (i2.d) obj;
                float fFloatValue = ((Number) ((fz.a) this.f35473e).invoke()).floatValue();
                float fMax = (Math.max(Math.min(1.0f, fFloatValue) - 0.4f, CropImageView.DEFAULT_ASPECT_RATIO) * 5) / 3;
                float fK = hz.b.k(Math.abs(fFloatValue) - 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f);
                float fPow = (((0.4f * fMax) - 0.25f) + (fK - (((float) Math.pow(fK, 2)) / 4))) * 0.5f;
                float f5 = 360;
                float f11 = fPow * f5;
                float f12 = ((0.8f * fMax) + fPow) * f5;
                float fMin = Math.min(1.0f, fMax);
                p1 p1Var = new p1();
                p1Var.f166a = f12;
                p1Var.f167b = fMin;
                float fFloatValue2 = ((Number) this.f35470b.getValue()).floatValue();
                long j12 = this.f35471c;
                p0 p0Var = this.f35472d;
                long jR0 = dVar.r0();
                xq.c cVarJ0 = dVar.j0();
                long jH = cVarJ0.H();
                cVarJ0.x().e();
                try {
                    ((b2) cVarJ0.f56174b).m(jR0, fPow);
                    float fE0 = dVar.e0(j.f35486b);
                    float f13 = j.f35485a;
                    float fE1 = (dVar.e0(f13) / 2.0f) + fE0;
                    long jL = com.bumptech.glide.g.l(dVar.d());
                    int i11 = (int) (jL >> 32);
                    int i12 = (int) (jL & 4294967295L);
                    f2.c cVar = new f2.c(Float.intBitsToFloat(i11) - fE1, Float.intBitsToFloat(i12) - fE1, Float.intBitsToFloat(i11) + fE1, Float.intBitsToFloat(i12) + fE1);
                    try {
                        dVar.D0(j12, f11, f12 - f11, cVar.d(), cVar.c(), (832 & 64) != 0 ? 1.0f : fFloatValue2, new i2.h(dVar.e0(f13), CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 26));
                        j.c(dVar, p0Var, cVar, j12, fFloatValue2, p1Var);
                        com.google.android.material.datepicker.d.C(cVarJ0, jH);
                        return b0.f48488a;
                    } catch (Throwable th2) {
                        th = th2;
                        j11 = jH;
                        com.google.android.material.datepicker.d.C(cVarJ0, j11);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    j11 = jH;
                }
                break;
            default:
                i2.d Canvas = (i2.d) obj;
                kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
                kw.h hVar = (kw.h) this.f35473e;
                float fA = hVar.a() / hVar.f38870g.l();
                float fMax2 = (Math.max(Math.min(1.0f, fA) - 0.4f, CropImageView.DEFAULT_ASPECT_RATIO) * 5) / 3;
                float fK2 = hz.b.k(Math.abs(fA) - 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f);
                float fPow2 = (((0.4f * fMax2) - 0.25f) + (fK2 - (((float) Math.pow(fK2, 2)) / 4))) * 0.5f;
                float f14 = 360;
                float f15 = fPow2 * f14;
                float f16 = ((0.8f * fMax2) + fPow2) * f14;
                float fMin2 = Math.min(1.0f, fMax2);
                float fFloatValue3 = ((Number) this.f35470b.getValue()).floatValue();
                long jR1 = Canvas.r0();
                xq.c cVarJ1 = Canvas.j0();
                long jH2 = cVarJ1.H();
                cVarJ1.x().e();
                ((b2) cVarJ1.f56174b).m(jR1, fPow2);
                float fE2 = Canvas.e0(kw.c.f38848c);
                float f17 = kw.c.f38849d;
                float fE3 = (Canvas.e0(f17) / 2.0f) + fE2;
                float fE = f2.b.e(com.bumptech.glide.g.l(Canvas.d())) - fE3;
                float f18 = f2.b.f(com.bumptech.glide.g.l(Canvas.d())) - fE3;
                float fE4 = f2.b.e(com.bumptech.glide.g.l(Canvas.d())) + fE3;
                float f19 = f2.b.f(com.bumptech.glide.g.l(Canvas.d())) + fE3;
                f2.c cVar2 = new f2.c(fE, f18, fE4, f19);
                float f21 = f16 - f15;
                long jD = cVar2.d();
                long jC = cVar2.c();
                i2.h hVar2 = new i2.h(Canvas.e0(f17), CropImageView.DEFAULT_ASPECT_RATIO, 2, 0, null, 26);
                long j13 = this.f35471c;
                Canvas.D0(j13, f15, f21, jD, jC, (832 & 64) != 0 ? 1.0f : fFloatValue3, hVar2);
                g2.k kVar = (g2.k) this.f35472d;
                kVar.j();
                kVar.g(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                float f22 = kw.c.f38850e;
                kVar.f(Canvas.e0(f22) * fMin2, CropImageView.DEFAULT_ASPECT_RATIO);
                kVar.f((Canvas.e0(f22) * fMin2) / 2, Canvas.e0(kw.c.f38851f) * fMin2);
                kVar.m(com.bumptech.glide.d.c((f2.b.e(cVar2.b()) + (Math.min(fE4 - fE, f19 - f18) / 2.0f)) - ((Canvas.e0(f22) * fMin2) / 2.0f), (Canvas.e0(f17) / 2.0f) + f2.b.f(cVar2.b())));
                kVar.d();
                long jR2 = Canvas.r0();
                xq.c cVarJ2 = Canvas.j0();
                long jH3 = cVarJ2.H();
                cVarJ2.x().e();
                ((b2) cVarJ2.f56174b).m(jR2, f16);
                i2.d.o0(Canvas, kVar, j13, fFloatValue3, null, 56);
                cVarJ2.x().p();
                cVarJ2.T(jH3);
                cVarJ1.x().p();
                cVarJ1.T(jH2);
                return b0.f48488a;
        }
    }
}
