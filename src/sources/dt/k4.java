package dt;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;
import h1.w6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f23944a = 240;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f23945b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f23946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z1.r f23947d;

    static {
        float f5 = 10;
        f23946c = f5;
        f23947d = j0.c.C(g3.r.b(w2.a0.k(z1.o.f58481a, new f(10)), true, new d0.y1(27)), CropImageView.DEFAULT_ASPECT_RATIO, f5, 1);
    }

    public static final void a(final fz.a progress, z1.r rVar, final long j11, long j12, final int i11, l1.n nVar, final int i12) {
        z1.r rVar2;
        final long j13;
        long jD;
        int i13;
        Object obj;
        final long j14;
        kotlin.jvm.internal.m.f(progress, "progress");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2098933373);
        int i14 = i12 | (sVar.h(progress) ? 4 : 2) | (sVar.e(j11) ? 256 : 128) | 1024 | (sVar.d(i11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        boolean z11 = true;
        if (sVar.T(i14 & 1, (i14 & 9363) != 9362)) {
            sVar.Y();
            if ((i12 & 1) == 0 || sVar.C()) {
                float f5 = w6.f31234a;
                jD = h1.v1.d(k1.z.f37837d, sVar);
                i13 = i14 & (-7169);
            } else {
                sVar.W();
                i13 = i14 & (-7169);
                jD = j12;
            }
            sVar.q();
            boolean z12 = (i13 & 14) == 4;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z12 || objQ == gVar) {
                objQ = new ch.o0(21, progress);
                sVar.o0(objQ);
            }
            final fz.a aVar = (fz.a) objQ;
            rVar2 = rVar;
            z1.r rVarI = rVar2.i(f23947d);
            boolean zF = sVar.f(aVar);
            Object objQ2 = sVar.Q();
            if (zF || objQ2 == gVar) {
                objQ2 = new bp.r0(3, aVar);
                sVar.o0(objQ2);
            }
            z1.r rVarP = j0.e2.p(g3.r.b(rVarI, true, (fz.c) objQ2), f23944a, f23945b);
            boolean zF2 = sVar.f(aVar) | sVar.e(jD) | ((((57344 & i13) ^ 24576) > 16384 && sVar.d(i11)) || (i13 & 24576) == 16384);
            if ((((i13 & 896) ^ 384) <= 256 || !sVar.e(j11)) && (i13 & 384) != 256) {
                z11 = false;
            }
            boolean z13 = zF2 | z11;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                j14 = jD;
                obj = new fz.c() { // from class: dt.h4
                    @Override // fz.c
                    public final Object invoke(Object obj2) {
                        i2.d Canvas = (i2.d) obj2;
                        kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.d() & 4294967295L));
                        float fFloatValue = ((Number) aVar.invoke()).floatValue();
                        long j15 = j14;
                        int i15 = i11;
                        k4.b(Canvas, 1.0f, j15, fIntBitsToFloat, i15, true);
                        k4.b(Canvas, fFloatValue, j11, fIntBitsToFloat, i15, false);
                        return qy.b0.f48488a;
                    }
                };
                sVar.o0(obj);
            } else {
                obj = objQ3;
                j14 = jD;
            }
            d0.n.b(0, (fz.c) obj, sVar, rVarP);
            j13 = j14;
        } else {
            rVar2 = rVar;
            sVar.W();
            j13 = j12;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            final z1.r rVar3 = rVar2;
            x1VarT.f39502d = new fz.e(rVar3, j11, j13, i11, i12) { // from class: dt.i4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z1.r f23889b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f23890c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f23891d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f23892e;

                @Override // fz.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM = l1.t.M(49);
                    k4.a(this.f23888a, this.f23889b, this.f23890c, this.f23891d, this.f23892e, (l1.n) obj2, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void b(i2.d dVar, float f5, long j11, float f11, int i11, boolean z11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.d() & 4294967295L));
        float f12 = 2;
        float f13 = fIntBitsToFloat2 / f12;
        boolean z12 = dVar.getLayoutDirection() == v3.m.Ltr;
        float f14 = (z12 ? 0.0f : 1.0f - f5) * fIntBitsToFloat;
        float f15 = (z12 ? f5 : 1.0f) * fIntBitsToFloat;
        if (i11 == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            dVar.f0(j11, (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L), (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L), (480 & 8) != 0 ? 0.0f : f11, (480 & 16) != 0 ? 0 : 0, (480 & 32) != 0 ? null : null, 3);
            if (z11) {
                return;
            }
            float f16 = 10;
            dVar.f0(g2.f0.c(1090519039), (((long) Float.floatToRawIntBits(dVar.e0(f16) + f14)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L), (((long) Float.floatToRawIntBits((f11 / f12) + (f15 - dVar.e0(f16)))) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L), (480 & 8) != 0 ? 0.0f : dVar.e0(4), (480 & 16) != 0 ? 0 : 0, (480 & 32) != 0 ? null : null, 3);
            return;
        }
        float f17 = f11 / f12;
        lz.d dVar2 = new lz.d(f17, fIntBitsToFloat - f17);
        float fFloatValue = ((Number) hz.b.o(Float.valueOf(f14), dVar2)).floatValue();
        float fFloatValue2 = ((Number) hz.b.o(Float.valueOf(f15), dVar2)).floatValue();
        if (Math.abs(f5 - CropImageView.DEFAULT_ASPECT_RATIO) > CropImageView.DEFAULT_ASPECT_RATIO) {
            dVar.f0(j11, (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L), (((long) Float.floatToRawIntBits(f13)) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue2)) << 32), (480 & 8) != 0 ? 0.0f : f11, (480 & 16) != 0 ? 0 : i11, (480 & 32) != 0 ? null : null, 3);
            if (z11) {
                return;
            }
            float f18 = 10;
            dVar.f0(g2.f0.c(1090519039), (((long) Float.floatToRawIntBits(dVar.e0(f18) + f14)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L), (((long) Float.floatToRawIntBits((f15 - dVar.e0(f18)) + f17)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L), (480 & 8) != 0 ? 0.0f : dVar.e0(4), (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
        }
    }
}
