package k2;

import a0.b2;
import com.bumptech.glide.e;
import com.yalantis.ucrop.view.CropImageView;
import f2.c;
import g2.f0;
import g2.p;
import g2.v;
import i2.d;
import v3.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.a f37864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f37866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f37867d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f37868e = m.Ltr;

    public boolean b(float f5) {
        return false;
    }

    public boolean c(p pVar) {
        return false;
    }

    public final void g(d dVar, long j11, float f5, p pVar) {
        if (this.f37867d != f5) {
            if (!b(f5)) {
                if (f5 == 1.0f) {
                    a.a aVar = this.f37864a;
                    if (aVar != null) {
                        aVar.L(f5);
                    }
                    this.f37865b = false;
                } else {
                    a.a aVarH = this.f37864a;
                    if (aVarH == null) {
                        aVarH = f0.h();
                        this.f37864a = aVarH;
                    }
                    aVarH.L(f5);
                    this.f37865b = true;
                }
            }
            this.f37867d = f5;
        }
        if (!kotlin.jvm.internal.m.a(this.f37866c, pVar)) {
            if (!c(pVar)) {
                if (pVar == null) {
                    a.a aVar2 = this.f37864a;
                    if (aVar2 != null) {
                        aVar2.O(null);
                    }
                    this.f37865b = false;
                } else {
                    a.a aVarH2 = this.f37864a;
                    if (aVarH2 == null) {
                        aVarH2 = f0.h();
                        this.f37864a = aVarH2;
                    }
                    aVarH2.O(pVar);
                    this.f37865b = true;
                }
            }
            this.f37866c = pVar;
        }
        m layoutDirection = dVar.getLayoutDirection();
        if (this.f37868e != layoutDirection) {
            e(layoutDirection);
            this.f37868e = layoutDirection;
        }
        int i11 = (int) (j11 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d() >> 32)) - Float.intBitsToFloat(i11);
        int i12 = (int) (j11 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) - Float.intBitsToFloat(i12);
        ((b2) dVar.j0().f56174b).i(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, fIntBitsToFloat, fIntBitsToFloat2);
        if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
            try {
                if (Float.intBitsToFloat(i11) > CropImageView.DEFAULT_ASPECT_RATIO && Float.intBitsToFloat(i12) > CropImageView.DEFAULT_ASPECT_RATIO) {
                    if (this.f37865b) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i11);
                        c cVarE = e.e(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i12))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        v vVarX = dVar.j0().x();
                        a.a aVarH3 = this.f37864a;
                        if (aVarH3 == null) {
                            aVarH3 = f0.h();
                            this.f37864a = aVarH3;
                        }
                        try {
                            vVarX.l(cVarE, aVarH3);
                            i(dVar);
                            vVarX.p();
                        } catch (Throwable th2) {
                            vVarX.p();
                            throw th2;
                        }
                    } else {
                        i(dVar);
                    }
                }
            } catch (Throwable th3) {
                ((b2) dVar.j0().f56174b).i(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th3;
            }
        }
        ((b2) dVar.j0().f56174b).i(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(d dVar);

    public void e(m mVar) {
    }
}
