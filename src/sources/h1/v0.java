package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ int H;
    public final /* synthetic */ int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f31177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f31178f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t1.d f31179t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(int i11, fz.e eVar, t1.d dVar, fz.e eVar2, fz.e eVar3, j0.n2 n2Var, fz.e eVar4, int i12) {
        super(2);
        this.f31173a = 2;
        this.H = i11;
        this.f31174b = eVar;
        this.f31179t = dVar;
        this.f31175c = eVar2;
        this.f31176d = eVar3;
        this.f31177e = n2Var;
        this.f31178f = eVar4;
        this.K = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31173a) {
            case 0:
                ((Number) obj2).intValue();
                z1.r rVar = (z1.r) this.f31174b;
                g2.w0 w0Var = (g2.w0) this.f31175c;
                t0 t0Var = (t0) this.f31176d;
                u0 u0Var = (u0) this.f31177e;
                d0.v vVar = (d0.v) this.f31178f;
                k7.d(rVar, w0Var, t0Var, u0Var, vVar, this.f31179t, (l1.n) obj, l1.t.M(this.H | 1), this.K);
                break;
            case 1:
                ((Number) obj2).intValue();
                z1.r rVar2 = (z1.r) this.f31174b;
                g2.w0 w0Var2 = (g2.w0) this.f31175c;
                t0 t0Var2 = (t0) this.f31176d;
                u0 u0Var2 = (u0) this.f31177e;
                d0.v vVar2 = (d0.v) this.f31178f;
                k7.k(rVar2, w0Var2, t0Var2, u0Var2, vVar2, this.f31179t, (l1.n) obj, l1.t.M(this.H | 1), this.K);
                break;
            default:
                ((Number) obj2).intValue();
                fz.e eVar = (fz.e) this.f31174b;
                fz.e eVar2 = (fz.e) this.f31175c;
                fz.e eVar3 = (fz.e) this.f31176d;
                j0.n2 n2Var = (j0.n2) this.f31177e;
                fz.e eVar4 = (fz.e) this.f31178f;
                p7.b(this.H, eVar, this.f31179t, eVar2, eVar3, n2Var, eVar4, (l1.n) obj, l1.t.M(this.K | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(z1.r rVar, g2.w0 w0Var, t0 t0Var, u0 u0Var, d0.v vVar, t1.d dVar, int i11, int i12, int i13) {
        super(2);
        this.f31173a = i13;
        this.f31174b = rVar;
        this.f31175c = w0Var;
        this.f31176d = t0Var;
        this.f31177e = u0Var;
        this.f31178f = vVar;
        this.f31179t = dVar;
        this.H = i11;
        this.K = i12;
    }
}
