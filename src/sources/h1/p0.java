package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f30824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy.e f30826d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(long j11, Object obj, qy.e eVar, int i11) {
        super(2);
        this.f30823a = i11;
        this.f30824b = j11;
        this.f30825c = obj;
        this.f30826d = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30823a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar = (l1.s) nVar;
                    if (sVar.F()) {
                        sVar.W();
                    } else {
                        i1.p.a(this.f30824b, ((dc) ((l1.s) nVar).j(fc.f30256a)).m, t1.e.d(1327513942, new b2.h(2, (j0.t1) this.f30825c, (fz.f) this.f30826d), nVar), nVar, 384);
                    }
                } else {
                    i1.p.a(this.f30824b, ((dc) ((l1.s) nVar).j(fc.f30256a)).m, t1.e.d(1327513942, new b2.h(2, (j0.t1) this.f30825c, (fz.f) this.f30826d), nVar), nVar, 384);
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        i1.d1.b(this.f30824b, (j3.y0) this.f30825c, (fz.e) this.f30826d, nVar2, 0);
                    }
                } else {
                    i1.d1.b(this.f30824b, (j3.y0) this.f30825c, (fz.e) this.f30826d, nVar2, 0);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
