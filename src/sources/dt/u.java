package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f24232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f24233c;

    public /* synthetic */ u(int i11, int i12, fz.a aVar, z1.r rVar) {
        this.f24231a = i12;
        this.f24232b = rVar;
        this.f24233c = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f24231a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a0.n(l1.t.M(7), this.f24233c, nVar, this.f24232b);
                break;
            case 1:
                e.L(l1.t.M(7), this.f24233c, nVar, this.f24232b);
                break;
            case 2:
                mt.v1.i(l1.t.M(49), this.f24233c, nVar, this.f24232b);
                break;
            case 3:
                tv.a.a(l1.t.M(391), this.f24233c, nVar, this.f24232b);
                break;
            default:
                ys.a3.d(l1.t.M(7), this.f24233c, nVar, this.f24232b);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ u(int i11, fz.a aVar, z1.r rVar) {
        this.f24231a = 2;
        this.f24233c = aVar;
        this.f24232b = rVar;
    }
}
