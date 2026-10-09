package bt;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nu.e f5368b;

    public /* synthetic */ f(nu.e eVar, int i11) {
        this.f5367a = i11;
        this.f5368b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:58:0x023b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0299  */
    /* JADX WARN: Type inference failed for: r3v81, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    @Override // fz.a
    public final Object invoke() {
        nu.e eVar;
        rz.b0 b0Var;
        float fAbs;
        double d5;
        switch (this.f5367a) {
            case 0:
                nu.e eVar2 = this.f5368b;
                rz.e0.B(eVar2.f44064c, null, null, new nu.d(eVar2, null), 3);
                break;
            case 1:
                nu.e eVar3 = this.f5368b;
                pu.b bVar = eVar3.f44062a;
                if (bVar.c() == ou.f.Writer && bVar.b() < eVar3.f44063b.f46072e.size()) {
                    eVar3.e();
                    bVar.C.setValue(Boolean.TRUE);
                    eVar3.c();
                }
                break;
            case 2:
                nu.e eVar4 = this.f5368b;
                pu.b bVar2 = eVar4.f44062a;
                rz.b0 b0Var2 = eVar4.f44064c;
                int iB = bVar2.b();
                l1.h1 h1Var = bVar2.f47179v;
                l1.k1 k1Var = bVar2.A;
                g2.k kVar = bVar2.f47163e;
                ou.c cVar = eVar4.f44063b;
                if (iB < cVar.f46072e.size()) {
                    bVar2.f47180w.setValue(Boolean.FALSE);
                    g2.p0 p0Var = (g2.p0) cVar.f46074g.get(bVar2.b());
                    if (((Boolean) bVar2.f47165g.getValue()).booleanValue()) {
                        g2.m mVarI = g2.f0.i();
                        mVarI.c(kVar);
                        float length = mVarI.f28582a.getLength();
                        g2.m mVarI2 = g2.f0.i();
                        mVarI2.c(p0Var);
                        float length2 = mVarI2.f28582a.getLength();
                        if (length2 != CropImageView.DEFAULT_ASPECT_RATIO) {
                            boolean z11 = length2 < 100.0f;
                            float f5 = z11 ? 15.0f : 50.0f;
                            float f11 = z11 ? 3.0f : 1.0f;
                            float f12 = z11 ? 2.094f : 1.047f;
                            if (length >= f5 && Math.max(length, length2) / Math.min(length, length2) <= 1 + f11) {
                                long jA = mVarI.a(CropImageView.DEFAULT_ASPECT_RATIO);
                                long jA2 = mVarI.a(length);
                                long jA3 = mVarI2.a(CropImageView.DEFAULT_ASPECT_RATIO);
                                long jA4 = mVarI2.a(length2);
                                b0Var = b0Var2;
                                if (!f2.b.c(jA, 9205357640488583168L) && !f2.b.c(jA2, 9205357640488583168L) && !f2.b.c(jA3, 9205357640488583168L) && !f2.b.c(jA4, 9205357640488583168L)) {
                                    if (z11) {
                                        float f13 = 2;
                                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (jA2 >> 32)) + Float.intBitsToFloat((int) (jA >> 32))) / f13)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (jA2 & 4294967295L)) + Float.intBitsToFloat((int) (jA & 4294967295L))) / f13)) & 4294967295L);
                                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (jA4 >> 32)) + Float.intBitsToFloat((int) (jA3 >> 32))) / f13)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (jA4 & 4294967295L)) + Float.intBitsToFloat((int) (jA3 & 4294967295L))) / f13)) & 4294967295L);
                                        int i11 = (int) (jFloatToRawIntBits >> 32);
                                        float fIntBitsToFloat = Float.intBitsToFloat(i11);
                                        int i12 = (int) (jFloatToRawIntBits2 >> 32);
                                        float fIntBitsToFloat2 = (Float.intBitsToFloat(i11) - Float.intBitsToFloat(i12)) * (fIntBitsToFloat - Float.intBitsToFloat(i12));
                                        int i13 = (int) (jFloatToRawIntBits & 4294967295L);
                                        float fIntBitsToFloat3 = Float.intBitsToFloat(i13);
                                        int i14 = (int) (jFloatToRawIntBits2 & 4294967295L);
                                        if (((float) Math.sqrt(((Float.intBitsToFloat(i13) - Float.intBitsToFloat(i14)) * (fIntBitsToFloat3 - Float.intBitsToFloat(i14))) + fIntBitsToFloat2)) > 80.0f) {
                                            long jG = f2.b.g(jA2, jA);
                                            long jG2 = f2.b.g(jA4, jA3);
                                            fAbs = Math.abs(((float) Math.atan2(Float.intBitsToFloat((int) (jG & 4294967295L)), Float.intBitsToFloat((int) (jG >> 32)))) - ((float) Math.atan2(Float.intBitsToFloat((int) (jG2 & 4294967295L)), Float.intBitsToFloat((int) (jG2 >> 32)))));
                                            d5 = fAbs;
                                            if (d5 > 3.141592653589793d) {
                                                fAbs = (float) (6.283185307179586d - d5);
                                            }
                                            if (fAbs <= f12) {
                                            }
                                        }
                                    } else {
                                        long jG3 = f2.b.g(jA2, jA);
                                        long jG4 = f2.b.g(jA4, jA3);
                                        fAbs = Math.abs(((float) Math.atan2(Float.intBitsToFloat((int) (jG3 & 4294967295L)), Float.intBitsToFloat((int) (jG3 >> 32)))) - ((float) Math.atan2(Float.intBitsToFloat((int) (jG4 & 4294967295L)), Float.intBitsToFloat((int) (jG4 >> 32)))));
                                        d5 = fAbs;
                                        if (d5 > 3.141592653589793d) {
                                            fAbs = (float) (6.283185307179586d - d5);
                                        }
                                        if (fAbs <= f12) {
                                        }
                                    }
                                    g2.k kVarA = g2.o.a();
                                    g2.p0.b(kVarA, kVar);
                                    kVar.j();
                                    rz.g1 g1Var = (rz.g1) k1Var.getValue();
                                    if (g1Var != null) {
                                        g1Var.cancel(null);
                                    }
                                    if (h1Var.l() != -1) {
                                        bVar2.l(Math.max(bVar2.e(), h1Var.l() + 1));
                                    }
                                    bVar2.f47182y.setValue(null);
                                    bVar2.g(0L);
                                    h1Var.m(-1);
                                    k1Var.setValue(null);
                                    k1Var.setValue(rz.e0.B(b0Var, null, null, new bh.z(eVar4, bVar2.b(), kVarA, (vy.d) null), 3));
                                }
                                eVar = eVar4;
                            } else {
                                eVar = eVar4;
                                b0Var = b0Var2;
                            }
                            rz.e0.B(b0Var, null, null, new nu.b(eVar, null, 0), 3);
                        } else {
                            eVar = eVar4;
                            b0Var = b0Var2;
                            rz.e0.B(b0Var, null, null, new nu.b(eVar, null, 0), 3);
                        }
                    } else {
                        eVar = eVar4;
                        b0Var = b0Var2;
                        rz.e0.B(b0Var, null, null, new nu.b(eVar, null, 0), 3);
                    }
                    bVar2.i(bVar2.d() + 1);
                }
                break;
            default:
                nu.e eVar5 = this.f5368b;
                pu.b bVar3 = eVar5.f44062a;
                int iE = bVar3.e();
                ou.c cVar2 = eVar5.f44063b;
                if (iE < cVar2.f46072e.size()) {
                    if (((Number) bVar3.f47169k.d()).floatValue() > 0.9f) {
                        bVar3.l(bVar3.e() + 1);
                        if (bVar3.e() >= cVar2.f46072e.size()) {
                            eVar5.f44066e.invoke();
                        }
                    }
                    rz.e0.B(eVar5.f44064c, null, null, new nu.a(eVar5, null, 0), 3);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
