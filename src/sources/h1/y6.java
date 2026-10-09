package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y6 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ int H;
    public final /* synthetic */ int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fz.a f31352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f31353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f31354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f31355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f31356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f31357f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f31358t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(fz.a aVar, z1.r rVar, long j11, float f5, long j12, int i11, float f11, int i12, int i13) {
        super(2);
        this.f31352a = aVar;
        this.f31353b = rVar;
        this.f31354c = j11;
        this.f31355d = f5;
        this.f31356e = j12;
        this.f31357f = i11;
        this.f31358t = f11;
        this.H = i12;
        this.K = i13;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        g7.a(this.f31352a, this.f31353b, this.f31354c, this.f31355d, this.f31356e, this.f31357f, this.f31358t, (l1.n) obj, l1.t.M(this.H | 1), this.K);
        return qy.b0.f48488a;
    }
}
