package jr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ qy.e K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36650a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f36651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f36652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f36653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1.r f36654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f36655f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f36656t;

    public /* synthetic */ j(kr.l lVar, z1.r rVar, boolean z11, fz.a aVar, fz.c cVar, fz.c cVar2, fz.a aVar2, int i11) {
        this.H = lVar;
        this.f36654e = rVar;
        this.f36655f = z11;
        this.f36651b = aVar;
        this.f36652c = cVar;
        this.f36653d = cVar2;
        this.K = aVar2;
        this.f36656t = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36650a) {
            case 0:
                ((Integer) obj2).getClass();
                a.c((kr.l) this.H, this.f36654e, this.f36655f, this.f36651b, this.f36652c, this.f36653d, (fz.a) this.K, (l1.n) obj, l1.t.M(this.f36656t | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                vr.b.b((zr.v) this.H, this.f36651b, this.f36652c, this.f36653d, (fz.c) this.K, this.f36654e, this.f36655f, (l1.n) obj, l1.t.M(this.f36656t | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ j(zr.v vVar, fz.a aVar, fz.c cVar, fz.c cVar2, fz.c cVar3, z1.r rVar, boolean z11, int i11) {
        this.H = vVar;
        this.f36651b = aVar;
        this.f36652c = cVar;
        this.f36653d = cVar2;
        this.K = cVar3;
        this.f36654e = rVar;
        this.f36655f = z11;
        this.f36656t = i11;
    }
}
