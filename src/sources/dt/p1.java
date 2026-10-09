package dt;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f24079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24081d;

    public /* synthetic */ p1(float f5, Object obj, Object obj2, int i11) {
        this.f24078a = i11;
        this.f24079b = f5;
        this.f24080c = obj;
        this.f24081d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0065 A[PHI: r3
      0x0065: PHI (r3v7 float) = (r3v4 float), (r3v11 float) binds: [B:22:0x007a, B:15:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        float fFloatValue;
        switch (this.f24078a) {
            case 0:
                l1.b3 b3Var = (l1.b3) this.f24080c;
                l1.b3 b3Var2 = (l1.b3) this.f24081d;
                g2.t0 graphicsLayer = (g2.t0) obj;
                kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.b(((Number) b3Var.getValue()).floatValue());
                graphicsLayer.q((1.0f - ((Number) b3Var2.getValue()).floatValue()) * this.f24079b * 0.18f);
                break;
            case 1:
                f0.v2 v2Var = (f0.v2) this.f24080c;
                fz.c cVar = (fz.c) this.f24081d;
                long jLongValue = ((Long) obj).longValue();
                if (v2Var.f26472b == Long.MIN_VALUE) {
                    v2Var.f26472b = jLongValue;
                }
                float f5 = v2Var.f26475e;
                b0.o oVar = new b0.o(f5);
                float f11 = this.f24079b;
                b0.o oVar2 = f0.v2.f26470f;
                long jE = f11 == CropImageView.DEFAULT_ASPECT_RATIO ? v2Var.f26471a.e(new b0.o(f5), oVar2, v2Var.f26473c) : hz.b.R((jLongValue - v2Var.f26472b) / f11);
                float f12 = ((b0.o) v2Var.f26471a.i(jE, oVar, oVar2, v2Var.f26473c)).f3626a;
                v2Var.f26473c = (b0.o) v2Var.f26471a.m(jE, oVar, oVar2, v2Var.f26473c);
                v2Var.f26472b = jLongValue;
                float f13 = v2Var.f26475e - f12;
                v2Var.f26475e = f12;
                cVar.invoke(Float.valueOf(f13));
                break;
            case 2:
                fz.c cVar2 = (fz.c) this.f24080c;
                lz.d dVar = (lz.d) this.f24081d;
                float fFloatValue2 = ((Float) obj).floatValue();
                float f14 = this.f24079b;
                cVar2.invoke(Float.valueOf(hz.b.k(hz.b.Q(fFloatValue2 / f14) * f14, dVar.f40530a, dVar.f40531b)));
                break;
            case 3:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.f24080c;
                l0.s sVar = (l0.s) this.f24081d;
                b0.l lVar = (b0.l) obj;
                float f15 = this.f24079b;
                float f16 = CropImageView.DEFAULT_ASPECT_RATIO;
                if (f15 > CropImageView.DEFAULT_ASPECT_RATIO) {
                    fFloatValue = ((Number) lVar.f3591e.getValue()).floatValue();
                    if (fFloatValue <= f15) {
                        f15 = fFloatValue;
                    }
                    f16 = f15;
                } else if (f15 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    fFloatValue = ((Number) lVar.f3591e.getValue()).floatValue();
                    if (fFloatValue >= f15) {
                        f15 = fFloatValue;
                    }
                    f16 = f15;
                }
                float f17 = f16 - vVar.f38358a;
                if (f17 != sVar.a(f17) || f16 != ((Number) lVar.f3591e.getValue()).floatValue()) {
                    lVar.a();
                }
                vVar.f38358a += f17;
                break;
            default:
                float f18 = this.f24079b;
                g2.h hVar = (g2.h) this.f24080c;
                g2.p pVar = (g2.p) this.f24081d;
                y2.k0 k0Var = (y2.k0) obj;
                k0Var.a();
                xq.c cVar3 = k0Var.f56937a.f34121b;
                long jH = cVar3.H();
                cVar3.x().e();
                try {
                    a0.b2 b2Var = (a0.b2) cVar3.f56174b;
                    b2Var.r(f18, CropImageView.DEFAULT_ASPECT_RATIO);
                    b2Var.m(0L, 45.0f);
                    i2.d.A(k0Var, hVar, pVar, 46);
                } finally {
                    com.google.android.material.datepicker.d.C(cVar3, jH);
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ p1(f0.v2 v2Var, float f5, fz.c cVar) {
        this.f24078a = 1;
        this.f24080c = v2Var;
        this.f24079b = f5;
        this.f24081d = cVar;
    }
}
