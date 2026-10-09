package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j2 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.d f23914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23915c;

    public /* synthetic */ j2(t1.d dVar, int i11, int i12) {
        this.f23913a = i12;
        this.f23914b = dVar;
        this.f23915c = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f23913a) {
            case 0:
                int iIntValue = num.intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.f23914b.f(Integer.valueOf(this.f23915c), Boolean.FALSE, sVar, 0);
                } else {
                    sVar.W();
                }
                break;
            default:
                num.getClass();
                kt.l.f(this.f23914b, nVar, l1.t.M(this.f23915c | 1));
                break;
        }
        return qy.b0.f48488a;
    }
}
