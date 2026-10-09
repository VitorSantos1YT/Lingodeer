package et;

import h1.x9;
import java.util.List;
import mt.h0;
import rt.ke;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f25839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f25841d;

    public /* synthetic */ c(int i11, int i12, fz.c cVar, List list) {
        this.f25838a = i12;
        this.f25839b = list;
        this.f25840c = i11;
        this.f25841d = cVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25838a) {
            case 0:
                ((Integer) obj2).getClass();
                a.d(this.f25839b, this.f25840c, this.f25841d, (l1.n) obj, l1.t.M(1));
                break;
            case 1:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int i11 = 0;
                    for (Object obj3 : this.f25839b) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        ke keVar = (ke) obj3;
                        boolean z11 = this.f25840c == i11;
                        fz.c cVar = this.f25841d;
                        boolean zF = sVar.f(cVar) | sVar.d(i11);
                        Object objQ = sVar.Q();
                        if (zF || objQ == l1.m.f39353a) {
                            objQ = new h0(cVar, i11, 2);
                            sVar.o0(objQ);
                        }
                        x9.b(z11, (fz.a) objQ, null, false, t1.e.d(-947610734, new mt.r(keVar, 2), sVar), 0L, 0L, sVar, 24576, 492);
                        i11 = i12;
                    }
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 2:
                ((Integer) obj2).getClass();
                mt.g.I(this.f25839b, this.f25840c, this.f25841d, (l1.n) obj, l1.t.M(1));
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int i13 = 0;
                    for (Object obj4 : this.f25839b) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        String str = (String) obj4;
                        int i15 = this.f25840c;
                        boolean z12 = i15 == i13;
                        fz.c cVar2 = this.f25841d;
                        boolean zF2 = sVar2.f(cVar2) | sVar2.d(i13);
                        Object objQ2 = sVar2.Q();
                        if (zF2 || objQ2 == l1.m.f39353a) {
                            objQ2 = new h0(cVar2, i13, 5);
                            sVar2.o0(objQ2);
                        }
                        x9.a(z12, (fz.a) objQ2, null, false, 0L, 0L, t1.e.d(1600874511, new uu.k(i15, i13, str), sVar2), sVar2, 12582912, 124);
                        i13 = i14;
                    }
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ c(List list, int i11, fz.c cVar, int i12, int i13) {
        this.f25838a = i13;
        this.f25839b = list;
        this.f25840c = i11;
        this.f25841d = cVar;
    }
}
