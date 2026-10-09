package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e3 implements fz.e {
    public final /* synthetic */ fz.a H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23778a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0.d2 f23780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f23782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.c f23783f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t1.d f23784t;

    public /* synthetic */ e3(boolean z11, d0.d2 d2Var, int i11, fz.c cVar, fz.c cVar2, t1.d dVar, fz.a aVar) {
        this.f23779b = z11;
        this.f23780c = d2Var;
        this.f23781d = i11;
        this.f23782e = cVar;
        this.f23783f = cVar2;
        this.f23784t = dVar;
        this.H = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23778a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k3.d(this.f23779b, this.f23780c, this.f23781d, this.f23782e, this.f23783f, this.f23784t, this.H, sVar, 0);
                } else {
                    sVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                k3.d(this.f23779b, this.f23780c, this.f23781d, this.f23782e, this.f23783f, this.f23784t, this.H, (l1.n) obj, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ e3(boolean z11, d0.d2 d2Var, int i11, fz.c cVar, fz.c cVar2, t1.d dVar, fz.a aVar, int i12) {
        this.f23779b = z11;
        this.f23780c = d2Var;
        this.f23781d = i11;
        this.f23782e = cVar;
        this.f23783f = cVar2;
        this.f23784t = dVar;
        this.H = aVar;
    }
}
