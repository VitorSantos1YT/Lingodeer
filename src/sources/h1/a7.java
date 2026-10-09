package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a7 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29983a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f29984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f29985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f29986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f29987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f29988f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f29989t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(z1.r rVar, long j11, float f5, long j12, int i11, int i12, int i13) {
        super(2);
        this.f29984b = rVar;
        this.f29985c = j11;
        this.f29988f = f5;
        this.f29986d = j12;
        this.f29987e = i11;
        this.f29989t = i12;
        this.H = i13;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29983a) {
            case 0:
                ((Number) obj2).intValue();
                int iM = l1.t.M(this.f29989t | 1);
                int i11 = this.H;
                g7.b(this.f29988f, this.f29987e, iM, i11, this.f29985c, this.f29986d, (l1.n) obj, this.f29984b);
                break;
            default:
                ((Number) obj2).intValue();
                int iM2 = l1.t.M(this.f29989t | 1);
                int i12 = this.H;
                g7.d(this.f29988f, this.f29987e, iM2, i12, this.f29985c, this.f29986d, (l1.n) obj, this.f29984b);
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(z1.r rVar, long j11, long j12, int i11, float f5, int i12, int i13) {
        super(2);
        this.f29984b = rVar;
        this.f29985c = j11;
        this.f29986d = j12;
        this.f29987e = i11;
        this.f29988f = f5;
        this.f29989t = i12;
        this.H = i13;
    }
}
