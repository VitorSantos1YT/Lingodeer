package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f22931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1.d f22932c;

    public /* synthetic */ k0(z1.r rVar, t1.d dVar, int i11, int i12) {
        this.f22930a = i12;
        this.f22931b = rVar;
        this.f22932c = dVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f22930a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                vc.a.e(this.f22931b, this.f22932c, nVar, l1.t.M(49));
                break;
            default:
                ug.d.a(this.f22931b, this.f22932c, nVar, l1.t.M(385));
                break;
        }
        return qy.b0.f48488a;
    }
}
