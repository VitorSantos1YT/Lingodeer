package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f22818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f22819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22820d;

    public /* synthetic */ w(int i11, fz.c cVar, z1.r rVar, int i12) {
        this.f22817a = i12;
        this.f22819c = rVar;
        this.f22818b = cVar;
        this.f22820d = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f22817a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                n.b(l1.t.M(this.f22820d | 1), this.f22818b, nVar, this.f22819c);
                break;
            case 1:
                km.b1.f(l1.t.M(this.f22820d | 1), this.f22818b, nVar, this.f22819c);
                break;
            default:
                ef.e.c(l1.t.M(this.f22820d | 1), this.f22818b, nVar, this.f22819c);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ w(fz.c cVar, z1.r rVar, int i11) {
        this.f22817a = 1;
        this.f22818b = cVar;
        this.f22819c = rVar;
        this.f22820d = i11;
    }
}
