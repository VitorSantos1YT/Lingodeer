package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31225a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(int i11) {
        super(2);
        this.f31225a = i11;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar = (l1.s) nVar;
            if (sVar.F()) {
                sVar.W();
            } else {
                ua.b(s0.a(this.f31225a + 1, 7), g3.r.a(z1.o.f58481a, o0.f30768e), 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, nVar, 0, 0, 130556);
            }
        } else {
            ua.b(s0.a(this.f31225a + 1, 7), g3.r.a(z1.o.f58481a, o0.f30768e), 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, nVar, 0, 0, 130556);
        }
        return qy.b0.f48488a;
    }
}
