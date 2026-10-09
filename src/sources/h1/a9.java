package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a9 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fz.e f29995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.d f29996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.e f29997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f29998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f29999e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(fz.e eVar, t1.d dVar, fz.e eVar2, long j11, long j12) {
        super(2);
        this.f29995a = eVar;
        this.f29996b = dVar;
        this.f29997c = eVar2;
        this.f29998d = j11;
        this.f29999e = j12;
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
                j3.y0 y0VarA = fc.a(k1.g0.f37534h, nVar);
                j3.y0 y0VarA2 = fc.a(k1.g0.f37528b, nVar);
                l1.t.a(ua.f31167a.a(y0VarA), t1.e.d(835891690, new m4(this.f29995a, this.f29996b, this.f29997c, y0VarA2, this.f29998d, this.f29999e), nVar), nVar, 56);
            }
        } else {
            j3.y0 y0VarA3 = fc.a(k1.g0.f37534h, nVar);
            j3.y0 y0VarA4 = fc.a(k1.g0.f37528b, nVar);
            l1.t.a(ua.f31167a.a(y0VarA3), t1.e.d(835891690, new m4(this.f29995a, this.f29996b, this.f29997c, y0VarA4, this.f29998d, this.f29999e), nVar), nVar, 56);
        }
        return qy.b0.f48488a;
    }
}
