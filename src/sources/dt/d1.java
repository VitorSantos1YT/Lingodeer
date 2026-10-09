package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d1 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1.d f23735c;

    public /* synthetic */ d1(boolean z11, t1.d dVar) {
        this.f23733a = 0;
        this.f23734b = z11;
        this.f23735c = dVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f23733a) {
            case 0:
                int iIntValue = num.intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e.r(this.f23734b, this.f23735c, sVar, 0);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                num.getClass();
                e.r(this.f23734b, this.f23735c, nVar, l1.t.M(1));
                break;
            default:
                num.getClass();
                ju.f.a(this.f23734b, this.f23735c, nVar, l1.t.M(49));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ d1(boolean z11, t1.d dVar, int i11, int i12) {
        this.f23733a = i12;
        this.f23734b = z11;
        this.f23735c = dVar;
    }
}
