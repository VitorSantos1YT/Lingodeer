package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23895a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f23897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f23898d;

    public /* synthetic */ j(z1.r rVar, boolean z11, fz.a aVar, int i11) {
        this.f23897c = rVar;
        this.f23896b = z11;
        this.f23898d = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f23895a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a0.i(l1.t.M(7), this.f23898d, nVar, this.f23897c, this.f23896b);
                break;
            default:
                ys.p1.e(l1.t.M(1), this.f23898d, nVar, this.f23897c, this.f23896b);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ j(boolean z11, z1.r rVar, fz.a aVar, int i11) {
        this.f23896b = z11;
        this.f23897c = rVar;
        this.f23898d = aVar;
    }
}
