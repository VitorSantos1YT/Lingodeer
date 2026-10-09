package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f30221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f30222b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(float f5, float f11) {
        super(2);
        this.f30221a = f5;
        this.f30222b = f11;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar = (l1.s) nVar;
            if (sVar.F()) {
                sVar.W();
            } else {
                j0.o.a(j0.e2.p(z1.o.f58481a, this.f30221a, this.f30222b), nVar, 0);
            }
        } else {
            j0.o.a(j0.e2.p(z1.o.f58481a, this.f30221a, this.f30222b), nVar, 0);
        }
        return qy.b0.f48488a;
    }
}
