package h2;

import g2.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f31487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f31488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f31489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f31490d;

    public h(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f31487a = cVar;
        this.f31488b = cVar2;
        this.f31489c = cVar3;
        this.f31490d = fArr;
    }

    public long a(long j11) {
        float fI = x.i(j11);
        float fH = x.h(j11);
        float f5 = x.f(j11);
        float fE = x.e(j11);
        c cVar = this.f31488b;
        long jD = cVar.d(fI, fH, f5);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = cVar.e(fI, fH, f5);
        float[] fArr = this.f31490d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f11 = fIntBitsToFloat;
        float f12 = fIntBitsToFloat2;
        return this.f31489c.f(f11, f12, fE2, fE, this.f31487a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Illegal instructions before constructor call */
    public h(c cVar, c cVar2, int i11) {
        float[] fArr;
        long j11 = cVar.f31457b;
        long j12 = b.f31451a;
        c cVarA = b.a(j11, j12) ? k.a(cVar) : cVar;
        c cVarA2 = b.a(cVar2.f31457b, j12) ? k.a(cVar2) : cVar2;
        if (i11 == 3) {
            boolean zA = b.a(cVar.f31457b, j12);
            boolean zA2 = b.a(cVar2.f31457b, j12);
            if (!(zA && zA2) && (zA || zA2)) {
                t tVar = ((r) (zA ? cVar : cVar2)).f31511d;
                float[] fArrA = k.f31496e;
                float[] fArrA2 = zA ? tVar.a() : fArrA;
                fArrA = zA2 ? tVar.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(cVar2, cVarA, cVarA2, fArr);
    }
}
