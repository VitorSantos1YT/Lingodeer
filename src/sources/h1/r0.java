package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f30948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f30952f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f30953t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Object obj, z1.r rVar, boolean z11, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11, int i12, int i13) {
        super(2);
        this.f30947a = i13;
        this.f30952f = obj;
        this.f30948b = rVar;
        this.f30949c = z11;
        this.f30953t = obj2;
        this.H = obj3;
        this.K = obj4;
        this.L = obj5;
        this.M = obj6;
        this.f30950d = i11;
        this.f30951e = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30947a) {
            case 0:
                ((Number) obj2).intValue();
                fz.a aVar = (fz.a) this.f30952f;
                g2.w0 w0Var = (g2.w0) this.f30953t;
                i0 i0Var = (i0) this.H;
                d0.v vVar = (d0.v) this.K;
                j0.t1 t1Var = (j0.t1) this.L;
                t1.d dVar = (t1.d) this.M;
                k7.i(aVar, this.f30948b, this.f30949c, w0Var, i0Var, vVar, t1Var, dVar, (l1.n) obj, l1.t.M(this.f30950d | 1), this.f30951e);
                break;
            default:
                ((Number) obj2).intValue();
                wg.r rVar = (wg.r) this.f30952f;
                wg.q qVar = (wg.q) this.f30953t;
                fz.c cVar = (fz.c) this.H;
                fz.c cVar2 = (fz.c) this.K;
                wg.b bVar = (wg.b) this.L;
                wg.a aVar2 = (wg.a) this.M;
                qx.p.g(rVar, this.f30948b, this.f30949c, qVar, cVar, cVar2, bVar, aVar2, (l1.n) obj, l1.t.M(this.f30950d | 1), this.f30951e);
                break;
        }
        return qy.b0.f48488a;
    }
}
