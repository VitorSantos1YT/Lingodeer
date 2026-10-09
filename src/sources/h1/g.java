package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f30258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1.d f30259c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(fz.e eVar, t1.d dVar, int i11) {
        super(2);
        this.f30257a = i11;
        this.f30258b = eVar;
        this.f30259c = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.s sVar;
        int i11 = this.f30257a;
        qy.b0 b0Var = qy.b0.f48488a;
        int i12 = 0;
        t1.d dVar = this.f30259c;
        fz.e eVar = this.f30258b;
        switch (i11) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    sVar = (l1.s) nVar;
                    sVar.d0(1497073862);
                    if (eVar != null) {
                        eVar.invoke(sVar, 0);
                    }
                    sVar.p(false);
                    dVar.invoke(sVar, 0);
                } else {
                    l1.s sVar2 = (l1.s) nVar;
                    if (!sVar2.F()) {
                        sVar = (l1.s) nVar;
                        sVar.d0(1497073862);
                        if (eVar != null) {
                            eVar.invoke(sVar, 0);
                        }
                        sVar.p(false);
                        dVar.invoke(sVar, 0);
                    } else {
                        sVar2.W();
                    }
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    float f5 = k.f30507a;
                    k.b(t1.e.d(1887135077, new g(eVar, dVar, i12), nVar2), nVar2, 438);
                } else {
                    l1.s sVar3 = (l1.s) nVar2;
                    if (!sVar3.F()) {
                        float f11 = k.f30507a;
                        k.b(t1.e.d(1887135077, new g(eVar, dVar, i12), nVar2), nVar2, 438);
                    } else {
                        sVar3.W();
                    }
                }
                break;
        }
        return b0Var;
    }
}
