package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ long H;
    public final /* synthetic */ fz.e K;
    public final /* synthetic */ t1.d L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fz.e f30308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f30309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g2.w0 f30310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f30312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f30313f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f30314t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(fz.e eVar, fz.e eVar2, g2.w0 w0Var, long j11, float f5, long j12, long j13, long j14, fz.e eVar3, t1.d dVar) {
        super(2);
        this.f30308a = eVar;
        this.f30309b = eVar2;
        this.f30310c = w0Var;
        this.f30311d = j11;
        this.f30312e = f5;
        this.f30313f = j12;
        this.f30314t = j13;
        this.H = j14;
        this.K = eVar3;
        this.L = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar = (l1.s) nVar;
            if (sVar.F()) {
                sVar.W();
            } else {
                k.a(t1.e.d(1163543932, new g(this.K, this.L, 1), nVar), null, this.f30308a, this.f30309b, this.f30310c, this.f30311d, this.f30312e, v1.d(k1.e.f37494a, nVar), this.f30313f, this.f30314t, this.H, nVar, 6);
            }
        } else {
            k.a(t1.e.d(1163543932, new g(this.K, this.L, 1), nVar), null, this.f30308a, this.f30309b, this.f30310c, this.f30311d, this.f30312e, v1.d(k1.e.f37494a, nVar), this.f30313f, this.f30314t, this.H, nVar, 6);
        }
        return qy.b0.f48488a;
    }
}
