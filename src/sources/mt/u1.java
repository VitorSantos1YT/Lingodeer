package mt;

import rt.me;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u1 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f41938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41939c;

    public /* synthetic */ u1(fz.c cVar, l1.b1 b1Var, int i11) {
        this.f41937a = i11;
        this.f41938b = cVar;
        this.f41939c = b1Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f41937a;
        j0.v DropdownMenu = (j0.v) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i11) {
            case 0:
                kotlin.jvm.internal.m.f(DropdownMenu, "$this$DropdownMenu");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (me meVar : me.a()) {
                        t1.d dVarD = t1.e.d(-982254757, new r(meVar, 3), sVar);
                        fz.c cVar = this.f41938b;
                        boolean zF = sVar.f(cVar) | sVar.d(meVar.ordinal());
                        Object objQ = sVar.Q();
                        if (zF || objQ == l1.m.f39353a) {
                            objQ = new l0(cVar, meVar, this.f41939c, 1);
                            sVar.o0(objQ);
                        }
                        h1.s.b(dVarD, (fz.a) objQ, null, false, null, null, sVar, 6);
                    }
                } else {
                    sVar.W();
                }
                break;
            default:
                kotlin.jvm.internal.m.f(DropdownMenu, "$this$ModalBottomSheet");
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    fz.c cVar2 = this.f41938b;
                    boolean zF2 = sVar2.f(cVar2);
                    Object objQ2 = sVar2.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF2 || objQ2 == gVar) {
                        objQ2 = new km.x0(cVar2, 9);
                        sVar2.o0(objQ2);
                    }
                    fz.a aVar = (fz.a) objQ2;
                    Object objQ3 = sVar2.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new w1(5, this.f41939c);
                        sVar2.o0(objQ3);
                    }
                    ys.a.e(aVar, (fz.a) objQ3, sVar2, 390);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
