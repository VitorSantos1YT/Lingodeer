package gs;

import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bs.f f29792b;

    public /* synthetic */ g(bs.f fVar, int i11) {
        this.f29791a = i11;
        this.f29792b = fVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f29791a;
        l0.c item = (l0.c) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i11) {
            case 0:
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    bs.f fVar = this.f29792b;
                    a.l(fVar.f5128c, fVar.f5129d, 0, 2, sVar, null);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    bs.f fVar2 = this.f29792b;
                    a.l(fVar2.f5128c, fVar2.f5129d, 0, 2, sVar2, null);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar3 = (l1.s) nVar;
                if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    bs.f fVar3 = this.f29792b;
                    a.l(fVar3.f5128c, fVar3.f5129d, 0, 2, sVar3, null);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar4 = (l1.s) nVar;
                if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    bs.f fVar4 = this.f29792b;
                    a.l(fVar4.f5128c, fVar4.f5129d, 0, 2, sVar4, null);
                } else {
                    sVar4.W();
                }
                break;
            case 4:
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar5 = (l1.s) nVar;
                if (sVar5.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    bs.f fVar5 = this.f29792b;
                    a.l(fVar5.f5128c, fVar5.f5129d, 0, 2, sVar5, null);
                } else {
                    sVar5.W();
                }
                break;
            default:
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar6 = (l1.s) nVar;
                if (sVar6.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    bs.f fVar6 = this.f29792b;
                    a.l(fVar6.f5128c, fVar6.f5129d, 0, 2, sVar6, null);
                } else {
                    sVar6.W();
                }
                break;
        }
        return b0.f48488a;
    }
}
