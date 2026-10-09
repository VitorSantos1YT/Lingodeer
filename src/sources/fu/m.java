package fu;

import dt.t0;
import ys.j3;
import ys.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f28135c;

    public /* synthetic */ m(int i11, int i12, fz.a aVar) {
        this.f28133a = 6;
        this.f28135c = aVar;
        this.f28134b = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f28133a) {
            case 0:
                num.getClass();
                a.p(this.f28134b, l1.t.M(1), this.f28135c, nVar);
                break;
            case 1:
                num.getClass();
                a.l(this.f28134b, l1.t.M(1), this.f28135c, nVar);
                break;
            case 2:
                int iIntValue = num.intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    a.l(this.f28134b, 0, this.f28135c, sVar);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 3:
                num.getClass();
                a.k(this.f28134b, l1.t.M(49), this.f28135c, nVar);
                break;
            case 4:
                num.getClass();
                a.r(this.f28134b, l1.t.M(1), this.f28135c, nVar);
                break;
            case 5:
                int iIntValue2 = num.intValue();
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    iu.k.g(this.f28135c, null, t1.e.d(-94292701, new t0(this.f28134b, 1, (byte) 0), sVar2), null, null, null, null, null, sVar2, 384, 250);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 6:
                num.getClass();
                mt.g.v(l1.t.M(1), this.f28134b, this.f28135c, nVar);
                break;
            case 7:
                num.getClass();
                mt.g.x(this.f28134b, l1.t.M(1), this.f28135c, nVar);
                break;
            case 8:
                num.getClass();
                nv.r.u(this.f28135c, nVar, l1.t.M(this.f28134b | 1));
                break;
            case 9:
                num.getClass();
                p2.a(this.f28134b, l1.t.M(1), this.f28135c, nVar);
                break;
            case 10:
                num.getClass();
                ys.a.t(this.f28135c, nVar, l1.t.M(this.f28134b | 1));
                break;
            default:
                num.intValue();
                j3.b(this.f28135c, nVar, l1.t.M(this.f28134b | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ m(int i11, fz.a aVar) {
        this.f28133a = 2;
        this.f28134b = i11;
        this.f28135c = aVar;
    }

    public /* synthetic */ m(int i11, fz.a aVar, int i12, int i13) {
        this.f28133a = i13;
        this.f28134b = i11;
        this.f28135c = aVar;
    }

    public /* synthetic */ m(fz.a aVar, int i11, int i12, byte b3) {
        this.f28133a = i12;
        this.f28135c = aVar;
        this.f28134b = i11;
    }
}
