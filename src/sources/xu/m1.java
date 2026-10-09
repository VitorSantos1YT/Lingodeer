package xu;

import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m1 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f56479b;

    public /* synthetic */ m1(String str, int i11) {
        this.f56478a = i11;
        this.f56479b = str;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56478a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ua.b(this.f56479b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131070);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ua.b(this.f56479b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131070);
                } else {
                    sVar2.W();
                }
                break;
            default:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ua.b(this.f56479b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                } else {
                    sVar3.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
