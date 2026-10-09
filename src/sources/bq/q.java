package bq;

import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f4958b;

    public /* synthetic */ q(float f5, int i11, byte b3) {
        this.f4957a = i11;
        this.f4958b = f5;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f4957a) {
            case 0:
                int iIntValue = num.intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ju.f.a(false, t1.e.d(-1570101930, new q(this.f4958b, 1, (byte) 0), sVar), sVar, 48);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tv.a.g(this.f4958b, null, sVar2, 0, 6);
                } else {
                    sVar2.W();
                }
                break;
            default:
                num.getClass();
                jr.a.k(this.f4958b, nVar, l1.t.M(1));
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ q(int i11, float f5) {
        this.f4957a = 2;
        this.f4958b = f5;
    }
}
