package o0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f0.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f44375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0.d f44376c;

    public h(t tVar, f0.d dVar) {
        this.f44375b = tVar;
        this.f44376c = dVar;
    }

    @Override // f0.d
    public final float a(float f5, float f11, float f12) {
        float fA = this.f44376c.a(f5, f11, f12);
        boolean z11 = false;
        if (f5 <= CropImageView.DEFAULT_ASPECT_RATIO ? f5 + f11 <= CropImageView.DEFAULT_ASPECT_RATIO : f5 + f11 > f12) {
            z11 = true;
        }
        float fAbs = Math.abs(fA);
        t tVar = this.f44375b;
        if (fAbs == CropImageView.DEFAULT_ASPECT_RATIO || !z11) {
            if (Math.abs(tVar.f44437f) < 1.0E-6d) {
                return CropImageView.DEFAULT_ASPECT_RATIO;
            }
            float fO = tVar.f44437f * (-1.0f);
            if (((Boolean) tVar.F.getValue()).booleanValue()) {
                fO += tVar.o();
            }
            return hz.b.k(fO, -f12, f12);
        }
        float fO2 = tVar.f44437f * (-1);
        while (fA > CropImageView.DEFAULT_ASPECT_RATIO && fO2 < fA) {
            fO2 += tVar.o();
        }
        while (fA < CropImageView.DEFAULT_ASPECT_RATIO && fO2 > fA) {
            fO2 -= tVar.o();
        }
        return fO2;
    }
}
