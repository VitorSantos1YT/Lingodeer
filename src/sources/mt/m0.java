package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f41640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f41641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41642d;

    public /* synthetic */ m0(int i11, int i12, fz.a aVar, fz.a aVar2) {
        this.f41639a = 1;
        this.f41640b = aVar;
        this.f41641c = aVar2;
        this.f41642d = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f41639a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                g.L(this.f41642d, l1.t.M(49), this.f41640b, this.f41641c, nVar);
                break;
            case 1:
                g.B(l1.t.M(1), this.f41642d, this.f41640b, this.f41641c, nVar);
                break;
            case 2:
                y3.r(this.f41642d, l1.t.M(1), this.f41640b, this.f41641c, nVar);
                break;
            default:
                ys.a.e(this.f41640b, this.f41641c, nVar, l1.t.M(this.f41642d | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ m0(int i11, fz.a aVar, fz.a aVar2) {
        this.f41639a = 3;
        this.f41640b = aVar;
        this.f41641c = aVar2;
        this.f41642d = i11;
    }

    public /* synthetic */ m0(int i11, fz.a aVar, fz.a aVar2, int i12, int i13) {
        this.f41639a = i13;
        this.f41642d = i11;
        this.f41640b = aVar;
        this.f41641c = aVar2;
    }
}
