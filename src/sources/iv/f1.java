package iv;

import h1.k7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f1 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f34729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f34730c;

    public /* synthetic */ f1(fz.c cVar, l1.b1 b1Var, int i11) {
        this.f34728a = i11;
        this.f34729b = cVar;
        this.f34730c = b1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34728a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((Boolean) obj2).getClass();
                this.f34729b.invoke(bool);
                this.f34730c.setValue(Boolean.TRUE);
                break;
            case 1:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fz.c cVar = this.f34729b;
                    boolean zF = sVar.f(cVar);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new bp.q(cVar, this.f34730c, 6);
                        sVar.o0(objQ);
                    }
                    k7.m((fz.a) objQ, null, false, null, null, null, mt.g.f41423d, sVar, 805306368, 510);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 2:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fz.c cVar2 = this.f34729b;
                    boolean zF2 = sVar2.f(cVar2);
                    l1.b1 b1Var = this.f34730c;
                    boolean zF3 = zF2 | sVar2.f(b1Var);
                    Object objQ2 = sVar2.Q();
                    if (zF3 || objQ2 == l1.m.f39353a) {
                        objQ2 = new bp.q(cVar2, b1Var, 8);
                        sVar2.o0(objQ2);
                    }
                    k7.m((fz.a) objQ2, null, false, null, null, null, mt.g.f41452s, sVar2, 805306368, 510);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                ((Boolean) obj2).getClass();
                this.f34729b.invoke(bool2);
                this.f34730c.setValue(Boolean.TRUE);
                break;
            default:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    fz.c cVar3 = this.f34729b;
                    boolean zF4 = sVar3.f(cVar3);
                    l1.b1 b1Var2 = this.f34730c;
                    boolean zF5 = zF4 | sVar3.f(b1Var2);
                    Object objQ3 = sVar3.Q();
                    if (zF5 || objQ3 == l1.m.f39353a) {
                        objQ3 = new bp.q(cVar3, b1Var2, 9);
                        sVar3.o0(objQ3);
                    }
                    k7.m((fz.a) objQ3, null, false, null, null, null, xu.c.N, sVar3, 805306368, 510);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }
}
