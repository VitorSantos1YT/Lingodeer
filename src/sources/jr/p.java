package jr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f36691d;

    public /* synthetic */ p(int i11, int i12, fz.a aVar, int i13) {
        this.f36688a = 1;
        this.f36689b = i11;
        this.f36690c = i12;
        this.f36691d = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f36688a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.j(this.f36689b, l1.t.M(this.f36690c | 1), this.f36691d, nVar);
                break;
            case 1:
                mt.g.j(this.f36689b, this.f36690c, l1.t.M(391), this.f36691d, nVar);
                break;
            default:
                ys.a.s(this.f36689b, l1.t.M(this.f36690c | 1), this.f36691d, nVar);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ p(int i11, fz.a aVar, int i12, int i13) {
        this.f36688a = i13;
        this.f36689b = i11;
        this.f36691d = aVar;
        this.f36690c = i12;
    }
}
