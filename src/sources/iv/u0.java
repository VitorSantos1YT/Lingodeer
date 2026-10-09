package iv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f34841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f34842d;

    public /* synthetic */ u0(int i11, String str, z1.r rVar, int i12) {
        this.f34839a = 3;
        this.f34842d = i11;
        this.f34840b = str;
        this.f34841c = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f34839a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                z0.b(l1.t.M(this.f34842d | 1), this.f34840b, nVar, this.f34841c);
                break;
            case 1:
                ef.e.b(l1.t.M(this.f34842d | 1), this.f34840b, nVar, this.f34841c);
                break;
            case 2:
                mt.b1.b(l1.t.M(this.f34842d | 1), this.f34840b, nVar, this.f34841c);
                break;
            default:
                qu.b.f(this.f34842d, l1.t.M(1), this.f34840b, nVar, this.f34841c);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ u0(String str, z1.r rVar, int i11, int i12) {
        this.f34839a = i12;
        this.f34840b = str;
        this.f34841c = rVar;
        this.f34842d = i11;
    }
}
