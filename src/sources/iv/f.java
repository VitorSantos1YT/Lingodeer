package iv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f34719d;

    public /* synthetic */ f(int i11, int i12, fz.a aVar, String str, String str2) {
        this.f34716a = i12;
        this.f34717b = str;
        this.f34718c = str2;
        this.f34719d = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f34716a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                o.n(this.f34717b, this.f34718c, this.f34719d, nVar, l1.t.M(7));
                break;
            default:
                km.b1.e(this.f34717b, this.f34718c, this.f34719d, nVar, l1.t.M(7));
                break;
        }
        return qy.b0.f48488a;
    }
}
