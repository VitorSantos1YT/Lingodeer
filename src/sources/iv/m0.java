package iv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kv.e0 f34785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f34786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f34787d;

    public /* synthetic */ m0(kv.e0 e0Var, fz.a aVar, int i11, int i12) {
        this.f34784a = i12;
        this.f34785b = e0Var;
        this.f34786c = aVar;
        this.f34787d = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f34784a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                a.F(this.f34785b, this.f34786c, nVar, l1.t.M(this.f34787d | 1));
                break;
            default:
                a.b(this.f34785b, this.f34786c, nVar, l1.t.M(this.f34787d | 1));
                break;
        }
        return qy.b0.f48488a;
    }
}
