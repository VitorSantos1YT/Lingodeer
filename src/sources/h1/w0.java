package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ d0.v H;
    public final /* synthetic */ t1.d K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f31218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f31219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f31220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2.w0 f31221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t0 f31222f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u0 f31223t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(fz.a aVar, z1.r rVar, boolean z11, g2.w0 w0Var, t0 t0Var, u0 u0Var, d0.v vVar, t1.d dVar, int i11, int i12, int i13) {
        super(2);
        this.f31217a = i13;
        this.f31218b = aVar;
        this.f31219c = rVar;
        this.f31220d = z11;
        this.f31221e = w0Var;
        this.f31222f = t0Var;
        this.f31223t = u0Var;
        this.H = vVar;
        this.K = dVar;
        this.L = i11;
        this.M = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31217a) {
            case 0:
                ((Number) obj2).intValue();
                k7.c(this.f31218b, this.f31219c, this.f31220d, this.f31221e, this.f31222f, this.f31223t, this.H, this.K, (l1.n) obj, l1.t.M(this.L | 1), this.M);
                break;
            default:
                ((Number) obj2).intValue();
                k7.j(this.f31218b, this.f31219c, this.f31220d, this.f31221e, this.f31222f, this.f31223t, this.H, this.K, (l1.n) obj, l1.t.M(this.L | 1), this.M);
                break;
        }
        return qy.b0.f48488a;
    }
}
