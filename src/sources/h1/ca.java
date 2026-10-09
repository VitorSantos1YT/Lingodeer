package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ca extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ int H;
    public final /* synthetic */ int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f30099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f30100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.f f30102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.e f30103f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t1.d f30104t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(int i11, z1.r rVar, long j11, long j12, fz.f fVar, fz.e eVar, t1.d dVar, int i12, int i13) {
        super(2);
        this.f30098a = i11;
        this.f30099b = rVar;
        this.f30100c = j11;
        this.f30101d = j12;
        this.f30102e = fVar;
        this.f30103f = eVar;
        this.f30104t = dVar;
        this.H = i12;
        this.K = i13;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fa.a(this.f30098a, this.f30099b, this.f30100c, this.f30101d, this.f30102e, this.f30103f, this.f30104t, (l1.n) obj, l1.t.M(this.H | 1), this.K);
        return qy.b0.f48488a;
    }
}
