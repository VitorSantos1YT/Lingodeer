package ch;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f7028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f7029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1.r f7030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7031e;

    public /* synthetic */ f(fz.a aVar, fz.a aVar2, z1.r rVar, int i11, int i12) {
        this.f7027a = i12;
        this.f7028b = aVar;
        this.f7029c = aVar2;
        this.f7030d = rVar;
        this.f7031e = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f7027a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                h.b(this.f7028b, this.f7029c, this.f7030d, nVar, l1.t.M(this.f7031e | 1));
                break;
            default:
                dt.e.i(this.f7028b, this.f7029c, this.f7030d, nVar, l1.t.M(this.f7031e | 1));
                break;
        }
        return qy.b0.f48488a;
    }
}
