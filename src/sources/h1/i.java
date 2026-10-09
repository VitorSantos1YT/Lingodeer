package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ g2.w0 H;
    public final /* synthetic */ long K;
    public final /* synthetic */ long L;
    public final /* synthetic */ long M;
    public final /* synthetic */ long N;
    public final /* synthetic */ float O;
    public final /* synthetic */ z3.r P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f30380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1.d f30381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1.r f30382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.e f30383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.e f30384f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.e f30385t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(fz.a aVar, t1.d dVar, z1.r rVar, fz.e eVar, fz.e eVar2, fz.e eVar3, g2.w0 w0Var, long j11, long j12, long j13, long j14, float f5, z3.r rVar2, int i11, int i12, int i13) {
        super(2);
        this.f30379a = i13;
        this.f30380b = aVar;
        this.f30381c = dVar;
        this.f30382d = rVar;
        this.f30383e = eVar;
        this.f30384f = eVar2;
        this.f30385t = eVar3;
        this.H = w0Var;
        this.K = j11;
        this.L = j12;
        this.M = j13;
        this.N = j14;
        this.O = f5;
        this.P = rVar2;
        this.Q = i11;
        this.R = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        switch (this.f30379a) {
            case 0:
                ((Number) obj2).intValue();
                k.c(this.f30380b, this.f30381c, this.f30382d, this.f30383e, this.f30384f, this.f30385t, this.H, this.K, this.L, this.M, this.N, this.O, this.P, nVar, l1.t.M(this.Q | 1), l1.t.M(this.R));
                break;
            default:
                ((Number) obj2).intValue();
                k7.a(this.f30380b, this.f30381c, this.f30382d, this.f30383e, this.f30384f, this.f30385t, this.H, this.K, this.L, this.M, this.N, this.O, this.P, nVar, l1.t.M(this.Q | 1), this.R);
                break;
        }
        return qy.b0.f48488a;
    }
}
