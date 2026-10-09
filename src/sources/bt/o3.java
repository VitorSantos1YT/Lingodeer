package bt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o3 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f5797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jt.k0 f5798e;

    public /* synthetic */ o3(l1.b1 b1Var, boolean z11, rz.b0 b0Var, jt.k0 k0Var, int i11) {
        this.f5794a = i11;
        this.f5795b = b1Var;
        this.f5796c = z11;
        this.f5797d = b0Var;
        this.f5798e = k0Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f5794a;
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List list = (List) this.f5795b.getValue();
                    boolean z11 = this.f5796c;
                    boolean zG = sVar.g(z11);
                    rz.b0 b0Var = this.f5797d;
                    boolean zH = zG | sVar.h(b0Var);
                    jt.k0 k0Var = this.f5798e;
                    boolean zH2 = zH | sVar.h(k0Var);
                    Object objQ = sVar.Q();
                    if (zH2 || objQ == l1.m.f39353a) {
                        objQ = new n1(z11, b0Var, k0Var, 1);
                        sVar.o0(objQ);
                    }
                    b.h(list, (fz.c) objQ, sVar, 0);
                } else {
                    sVar.W();
                }
                break;
            default:
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z1.o oVar = z1.o.f58481a;
                    j0.c.g(sVar2, j0.e2.g(oVar, 52));
                    l1.t.a(z2.g1.f58552n.a(dt.d4.g(sVar2)), t1.e.d(-811681674, new o3(this.f5795b, this.f5796c, this.f5797d, this.f5798e, 0), sVar2), sVar2, 56);
                    j0.c.g(sVar2, j0.e2.g(oVar, 78));
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
