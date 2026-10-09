package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t3 f30273b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3(t3 t3Var, int i11) {
        super(2);
        this.f30272a = i11;
        this.f30273b = t3Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        t3 t3Var;
        l1.s sVar;
        boolean zF;
        Object objQ;
        switch (this.f30272a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        z1.r rVarZ = j0.c.z(z1.o.f58481a, y2.f31339c);
                        t3Var = this.f30273b;
                        int iA = t3Var.a();
                        sVar = (l1.s) nVar;
                        zF = sVar.f(t3Var);
                        objQ = sVar.Q();
                        if (zF || objQ == l1.m.f39353a) {
                            objQ = new f3(t3Var, 0);
                            sVar.o0(objQ);
                        }
                        y2.d(iA, 6, (fz.c) objQ, sVar, rVarZ);
                    }
                } else {
                    z1.r rVarZ2 = j0.c.z(z1.o.f58481a, y2.f31339c);
                    t3Var = this.f30273b;
                    int iA2 = t3Var.a();
                    sVar = (l1.s) nVar;
                    zF = sVar.f(t3Var);
                    objQ = sVar.Q();
                    if (zF) {
                        objQ = new f3(t3Var, 0);
                        sVar.o0(objQ);
                    } else {
                        objQ = new f3(t3Var, 0);
                        sVar.o0(objQ);
                    }
                    y2.d(iA2, 6, (fz.c) objQ, sVar, rVarZ2);
                }
                break;
            default:
                try {
                    this.f30273b.e((Long) obj, (Long) obj2);
                    break;
                } catch (IllegalArgumentException unused) {
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
