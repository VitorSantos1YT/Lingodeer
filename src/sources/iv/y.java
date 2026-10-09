package iv;

import h1.k7;
import mt.l5;
import xu.a2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f34867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f34869d;

    public /* synthetic */ y(fz.a aVar, String str, boolean z11) {
        this.f34866a = 1;
        this.f34867b = aVar;
        this.f34868c = str;
        this.f34869d = z11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f34866a) {
            case 0:
                num.getClass();
                a.C(l1.t.M(1), this.f34867b, this.f34868c, nVar, this.f34869d);
                break;
            case 1:
                int iIntValue = num.intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k7.m(this.f34867b, null, false, null, null, null, t1.e.d(1540366636, new kt.i(this.f34868c, this.f34869d), sVar), sVar, 805306368, 510);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 2:
                num.getClass();
                l5.j(l1.t.M(24583), this.f34867b, this.f34868c, nVar, this.f34869d);
                break;
            case 3:
                num.getClass();
                vr.b.d(l1.t.M(1), this.f34867b, this.f34868c, nVar, this.f34869d);
                break;
            default:
                num.getClass();
                a2.a(l1.t.M(391), this.f34867b, this.f34868c, nVar, this.f34869d);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ y(String str, boolean z11, fz.a aVar, int i11, int i12) {
        this.f34866a = i12;
        this.f34868c = str;
        this.f34869d = z11;
        this.f34867b = aVar;
    }

    public /* synthetic */ y(boolean z11, String str, fz.a aVar, int i11) {
        this.f34866a = 0;
        this.f34869d = z11;
        this.f34868c = str;
        this.f34867b = aVar;
    }
}
