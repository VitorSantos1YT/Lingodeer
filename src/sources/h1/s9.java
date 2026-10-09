package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s9 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ int H;
    public final /* synthetic */ int K;
    public final /* synthetic */ fz.e L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31066a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f31067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f31068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1.r f31069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f31070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f31071f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f31072t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(boolean z11, fz.a aVar, z1.r rVar, boolean z12, long j11, long j12, t1.d dVar, int i11, int i12) {
        super(2);
        this.f31067b = z11;
        this.f31068c = aVar;
        this.f31069d = rVar;
        this.f31070e = z12;
        this.f31071f = j11;
        this.f31072t = j12;
        this.L = dVar;
        this.H = i11;
        this.K = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31066a) {
            case 0:
                ((Number) obj2).intValue();
                x9.b(this.f31067b, this.f31068c, this.f31069d, this.f31070e, this.L, this.f31071f, this.f31072t, (l1.n) obj, l1.t.M(this.H | 1), this.K);
                break;
            default:
                ((Number) obj2).intValue();
                t1.d dVar = (t1.d) this.L;
                x9.a(this.f31067b, this.f31068c, this.f31069d, this.f31070e, this.f31071f, this.f31072t, dVar, (l1.n) obj, l1.t.M(this.H | 1), this.K);
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(boolean z11, fz.a aVar, z1.r rVar, boolean z12, fz.e eVar, long j11, long j12, int i11, int i12) {
        super(2);
        this.f31067b = z11;
        this.f31068c = aVar;
        this.f31069d = rVar;
        this.f31070e = z12;
        this.L = eVar;
        this.f31071f = j11;
        this.f31072t = j12;
        this.H = i11;
        this.K = i12;
    }
}
