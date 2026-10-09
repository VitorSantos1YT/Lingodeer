package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements fz.e {
    public final /* synthetic */ fz.a H;
    public final /* synthetic */ fz.a K;
    public final /* synthetic */ fz.c L;
    public final /* synthetic */ fz.a M;
    public final /* synthetic */ fz.a N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;
    public final /* synthetic */ rt.y0 Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f41966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f41967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f41968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.a f41969f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.a f41970t;

    public /* synthetic */ v(rt.y0 y0Var, int i11, fz.c cVar, fz.c cVar2, fz.c cVar3, fz.a aVar, fz.a aVar2, fz.a aVar3, fz.a aVar4, fz.c cVar4, fz.a aVar5, fz.a aVar6, int i12, int i13, int i14) {
        this.f41964a = i14;
        this.Q = y0Var;
        this.f41965b = i11;
        this.f41966c = cVar;
        this.f41967d = cVar2;
        this.f41968e = cVar3;
        this.f41969f = aVar;
        this.f41970t = aVar2;
        this.H = aVar3;
        this.K = aVar4;
        this.L = cVar4;
        this.M = aVar5;
        this.N = aVar6;
        this.O = i12;
        this.P = i13;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41964a) {
            case 0:
                ((Integer) obj2).intValue();
                int iM = l1.t.M(this.O | 1);
                int iM2 = l1.t.M(this.P);
                g.y((rt.x0) this.Q, this.f41965b, this.f41966c, this.f41967d, this.f41968e, this.f41969f, this.f41970t, this.H, this.K, this.L, this.M, this.N, (l1.n) obj, iM, iM2);
                break;
            default:
                ((Integer) obj2).intValue();
                int iM3 = l1.t.M(this.O | 1);
                int iM4 = l1.t.M(this.P);
                g.u(this.Q, this.f41965b, this.f41966c, this.f41967d, this.f41968e, this.f41969f, this.f41970t, this.H, this.K, this.L, this.M, this.N, (l1.n) obj, iM3, iM4);
                break;
        }
        return qy.b0.f48488a;
    }
}
