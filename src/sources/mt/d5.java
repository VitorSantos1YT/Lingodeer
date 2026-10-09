package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d5 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f41357b;

    public /* synthetic */ d5(int i11, float f5) {
        this.f41356a = i11;
        this.f41357b = f5;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f41356a;
        l0.c item = (l0.c) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i11) {
            case 0:
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    j0.c.g(sVar, j0.e2.g(z1.o.f58481a, this.f41357b));
                } else {
                    sVar.W();
                }
                break;
            case 1:
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    j0.c.g(sVar2, j0.e2.g(z1.o.f58481a, this.f41357b));
                } else {
                    sVar2.W();
                }
                break;
            default:
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar3 = (l1.s) nVar;
                if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    j0.c.g(sVar3, j0.e2.g(z1.o.f58481a, this.f41357b));
                } else {
                    sVar3.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
