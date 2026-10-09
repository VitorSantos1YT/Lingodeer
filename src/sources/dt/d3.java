package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d3 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23739a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0.d2 f23741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f23742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f23743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t1.d f23744f;

    public /* synthetic */ d3(boolean z11, d0.d2 d2Var, fz.a aVar, fz.c cVar, t1.d dVar) {
        this.f23740b = z11;
        this.f23741c = d2Var;
        this.f23742d = aVar;
        this.f23743e = cVar;
        this.f23744f = dVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23739a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k3.f(this.f23740b, this.f23741c, this.f23742d, this.f23743e, this.f23744f, sVar, 0);
                } else {
                    sVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                k3.f(this.f23740b, this.f23741c, this.f23742d, this.f23743e, this.f23744f, (l1.n) obj, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ d3(boolean z11, d0.d2 d2Var, fz.a aVar, fz.c cVar, t1.d dVar, int i11) {
        this.f23740b = z11;
        this.f23741c = d2Var;
        this.f23742d = aVar;
        this.f23743e = cVar;
        this.f23744f = dVar;
    }
}
