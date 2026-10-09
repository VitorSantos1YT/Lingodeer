package bp;

import h1.k7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f4528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4529c;

    public /* synthetic */ d0(fz.a aVar, String str, int i11) {
        this.f4527a = i11;
        this.f4528b = aVar;
        this.f4529c = str;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f4527a) {
            case 0:
                int iIntValue = num.intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fz.a aVar = this.f4528b;
                    boolean zF = sVar.f(aVar);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new at.r(3, aVar);
                        sVar.o0(objQ);
                    }
                    k7.m((fz.a) objQ, null, false, null, null, null, t1.e.d(-1691902833, new a0(this.f4529c, 1), sVar), sVar, 805306368, 510);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fz.a aVar2 = this.f4528b;
                    boolean zF2 = sVar2.f(aVar2);
                    Object objQ2 = sVar2.Q();
                    if (zF2 || objQ2 == l1.m.f39353a) {
                        objQ2 = new okhttp3.b(28, aVar2);
                        sVar2.o0(objQ2);
                    }
                    iu.k.g((fz.a) objQ2, null, t1.e.d(-356806869, new e0(this.f4529c, 26), sVar2), null, null, null, null, null, sVar2, 384, 250);
                } else {
                    sVar2.W();
                }
                break;
            default:
                num.getClass();
                ys.a.j(this.f4529c, this.f4528b, nVar, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ d0(String str, fz.a aVar, int i11) {
        this.f4527a = 2;
        this.f4529c = str;
        this.f4528b = aVar;
    }
}
