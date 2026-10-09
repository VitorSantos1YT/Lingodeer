package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l4 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f30595a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(long j11) {
        super(2);
        this.f30595a = j11;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar = (l1.s) nVar;
            if (sVar.F()) {
                sVar.W();
            } else {
                i1.p.a(this.f30595a, fc.a(k1.i.f37564a, nVar), t1.e.d(-1771489750, new x1(2, 26), nVar), nVar, 384);
            }
        } else {
            i1.p.a(this.f30595a, fc.a(k1.i.f37564a, nVar), t1.e.d(-1771489750, new x1(2, 26), nVar), nVar, 384);
        }
        return qy.b0.f48488a;
    }
}
