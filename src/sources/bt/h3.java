package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h3 implements fz.e {
    public final /* synthetic */ fz.c H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jt.j0 f5477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ht.o f5478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f5479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.e f5480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.c f5481f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.a f5482t;

    public /* synthetic */ h3(jt.j0 j0Var, ht.o oVar, fz.a aVar, fz.e eVar, fz.c cVar, fz.a aVar2, fz.c cVar2, int i11, int i12) {
        this.f5476a = i12;
        this.f5477b = j0Var;
        this.f5478c = oVar;
        this.f5479d = aVar;
        this.f5480e = eVar;
        this.f5481f = cVar;
        this.f5482t = aVar2;
        this.H = cVar2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5476a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                b.q(this.f5477b, this.f5478c, this.f5479d, this.f5480e, this.f5481f, this.f5482t, this.H, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(1);
                b.E(this.f5477b, this.f5478c, this.f5479d, this.f5480e, this.f5481f, this.f5482t, this.H, (l1.n) obj, iM2);
                break;
        }
        return qy.b0.f48488a;
    }
}
