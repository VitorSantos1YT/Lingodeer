package h2;

import g2.f0;
import g2.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f31484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f31485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f31486g;

    public g(r rVar, r rVar2) {
        float[] fArrG;
        super(rVar2, rVar, rVar2, null);
        this.f31484e = rVar;
        this.f31485f = rVar2;
        float[] fArr = a.f31449b.f31450a;
        t tVar = rVar.f31511d;
        float[] fArr2 = rVar.f31516i;
        t tVar2 = rVar2.f31511d;
        float[] fArr3 = rVar2.f31517j;
        if (k.d(tVar, tVar2)) {
            fArrG = k.g(fArr3, fArr2);
        } else {
            float[] fArrA = tVar.a();
            float[] fArrA2 = tVar2.a();
            t tVar3 = k.f31493b;
            fArrG = k.g(k.d(tVar2, tVar3) ? fArr3 : k.f(k.g(k.c(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), rVar2.f31516i)), k.d(tVar, tVar3) ? fArr2 : k.g(k.c(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f31486g = fArrG;
    }

    @Override // h2.h
    public final long a(long j11) {
        float fI = x.i(j11);
        float fH = x.h(j11);
        float f5 = x.f(j11);
        float fE = x.e(j11);
        n nVar = this.f31484e.f31522p;
        float fA = (float) nVar.a(fI);
        float fA2 = (float) nVar.a(fH);
        float fA3 = (float) nVar.a(f5);
        float[] fArr = this.f31486g;
        float f11 = (fArr[6] * fA3) + (fArr[3] * fA2) + (fArr[0] * fA);
        float f12 = (fArr[7] * fA3) + (fArr[4] * fA2) + (fArr[1] * fA);
        float f13 = (fArr[8] * fA3) + (fArr[5] * fA2) + (fArr[2] * fA);
        r rVar = this.f31485f;
        float fA4 = (float) rVar.m.a(f11);
        n nVar2 = rVar.m;
        return f0.b(fA4, (float) nVar2.a(f12), (float) nVar2.a(f13), fE, rVar);
    }
}
