package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41267a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1.t3 f41268b;

    public /* synthetic */ b0(h1.t3 t3Var) {
        this.f41268b = t3Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f41267a) {
            case 0:
                int iIntValue = num.intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f0.b(this.f41268b, sVar, 0);
                } else {
                    sVar.W();
                }
                break;
            default:
                num.getClass();
                f0.b(this.f41268b, nVar, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ b0(h1.t3 t3Var, int i11) {
        this.f41268b = t3Var;
    }
}
