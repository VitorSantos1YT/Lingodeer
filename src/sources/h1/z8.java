package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z8 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31418a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f31419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f31420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.e f31421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t1.d f31422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f31423f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f31424t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(t1.d dVar, fz.e eVar, fz.e eVar2, j3.y0 y0Var, long j11, long j12, int i11) {
        super(2);
        this.f31422e = dVar;
        this.f31421d = eVar;
        this.f31424t = eVar2;
        this.H = y0Var;
        this.f31419b = j11;
        this.f31420c = j12;
        this.f31423f = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31418a) {
            case 0:
                ((Number) obj2).intValue();
                fz.e eVar = (fz.e) this.f31424t;
                j3.y0 y0Var = (j3.y0) this.H;
                d9.c(this.f31422e, this.f31421d, eVar, y0Var, this.f31419b, this.f31420c, (l1.n) obj, l1.t.M(this.f31423f | 1));
                break;
            default:
                ((Number) obj2).intValue();
                z1.r rVar = (z1.r) this.f31424t;
                fz.f fVar = (fz.f) this.H;
                fa.b(rVar, this.f31419b, this.f31420c, fVar, this.f31421d, this.f31422e, (l1.n) obj, l1.t.M(this.f31423f | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(z1.r rVar, long j11, long j12, fz.f fVar, fz.e eVar, t1.d dVar, int i11) {
        super(2);
        this.f31424t = rVar;
        this.f31419b = j11;
        this.f31420c = j12;
        this.H = fVar;
        this.f31421d = eVar;
        this.f31422e = dVar;
        this.f31423f = i11;
    }
}
