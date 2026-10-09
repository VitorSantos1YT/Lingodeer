package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5503a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f5505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f5506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5507e;

    public /* synthetic */ i(int i11, fz.c cVar, z1.r rVar, int i12) {
        this.f5504b = i11;
        this.f5506d = cVar;
        this.f5505c = rVar;
        this.f5507e = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f5503a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                b.a(this.f5504b, l1.t.M(this.f5507e | 1), this.f5506d, nVar, this.f5505c);
                break;
            default:
                ys.a.y(this.f5504b, l1.t.M(this.f5507e | 1), this.f5506d, nVar, this.f5505c);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ i(int i11, z1.r rVar, fz.c cVar, int i12) {
        this.f5504b = i11;
        this.f5505c = rVar;
        this.f5506d = cVar;
        this.f5507e = i12;
    }
}
