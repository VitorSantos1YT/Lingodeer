package iv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1.r f34833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f34834e;

    public /* synthetic */ t0(int i11, int i12, fz.a aVar, String str, String str2, z1.r rVar) {
        this.f34830a = i12;
        this.f34831b = str;
        this.f34832c = str2;
        this.f34833d = rVar;
        this.f34834e = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34830a) {
            case 0:
                ((Integer) obj2).getClass();
                z0.r(l1.t.M(439), this.f34834e, this.f34831b, this.f34832c, (l1.n) obj, this.f34833d);
                break;
            default:
                ((Integer) obj2).getClass();
                nv.a.n(l1.t.M(7), this.f34834e, this.f34831b, this.f34832c, (l1.n) obj, this.f34833d);
                break;
        }
        return qy.b0.f48488a;
    }
}
