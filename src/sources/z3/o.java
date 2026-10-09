package z3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f58779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f58780c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58781a;

    static {
        int i11 = 2;
        f58779b = new o(i11, 0);
        f58780c = new o(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i11, int i12) {
        super(i11);
        this.f58781a = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58781a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
