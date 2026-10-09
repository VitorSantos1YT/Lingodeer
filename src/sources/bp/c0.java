package bp;

import h1.k7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4509a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f4511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f4512d;

    public /* synthetic */ c0(fz.a aVar, fz.a aVar2, String str) {
        this.f4511c = aVar;
        this.f4512d = aVar2;
        this.f4510b = str;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f4509a) {
            case 0:
                int iIntValue = num.intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fz.a aVar = this.f4511c;
                    boolean zF = sVar.f(aVar);
                    fz.a aVar2 = this.f4512d;
                    boolean zF2 = zF | sVar.f(aVar2);
                    Object objQ = sVar.Q();
                    if (zF2 || objQ == l1.m.f39353a) {
                        objQ = new defpackage.a(1, aVar, aVar2);
                        sVar.o0(objQ);
                    }
                    k7.m((fz.a) objQ, null, false, null, null, null, t1.e.d(1954471693, new a0(this.f4510b, 0), sVar), sVar, 805306368, 510);
                } else {
                    sVar.W();
                }
                break;
            default:
                num.getClass();
                ys.p2.b(this.f4510b, this.f4511c, this.f4512d, nVar, l1.t.M(49));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ c0(String str, fz.a aVar, fz.a aVar2, int i11) {
        this.f4510b = str;
        this.f4511c = aVar;
        this.f4512d = aVar2;
    }
}
