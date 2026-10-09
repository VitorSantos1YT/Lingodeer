package a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ int H;
    public final /* synthetic */ fz.f K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f72b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f73c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f74d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m1 f75e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f76f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f77t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(boolean z11, z1.r rVar, l1 l1Var, m1 m1Var, String str, fz.f fVar, int i11, int i12, int i13) {
        super(2);
        this.f71a = i13;
        this.f72b = z11;
        this.f73c = rVar;
        this.f74d = l1Var;
        this.f75e = m1Var;
        this.f76f = str;
        this.K = fVar;
        this.f77t = i11;
        this.H = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f71a) {
            case 0:
                ((Number) obj2).intValue();
                t1.d dVar = (t1.d) this.K;
                j0.d(this.f72b, this.f73c, this.f74d, this.f75e, this.f76f, dVar, (l1.n) obj, l1.t.M(this.f77t | 1), this.H);
                break;
            default:
                ((Number) obj2).intValue();
                j0.c(this.f72b, this.f73c, this.f74d, this.f75e, this.f76f, this.K, (l1.n) obj, l1.t.M(this.f77t | 1), this.H);
                break;
        }
        return qy.b0.f48488a;
    }
}
