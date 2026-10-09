package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s8 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u8 f31065b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(u8 u8Var, int i11) {
        super(2);
        this.f31064a = i11;
        switch (i11) {
            case 1:
                this.f31065b = u8Var;
                super(2);
                break;
            default:
                t1.d dVar = e2.f30192a;
                this.f31065b = u8Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31064a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar = (l1.s) nVar;
                    if (sVar.F()) {
                        sVar.W();
                    } else {
                        t1.d dVar = e2.f30192a;
                        u8 u8Var = this.f31065b;
                        kotlin.jvm.internal.m.c(u8Var);
                        dVar.invoke(u8Var, nVar, 0);
                    }
                } else {
                    t1.d dVar2 = e2.f30192a;
                    u8 u8Var2 = this.f31065b;
                    kotlin.jvm.internal.m.c(u8Var2);
                    dVar2.invoke(u8Var2, nVar, 0);
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        ua.b(this.f31065b.f31158a.f31201a, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, nVar2, 0, 0, 131070);
                    }
                } else {
                    ua.b(this.f31065b.f31158a.f31201a, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, nVar2, 0, 0, 131070);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
