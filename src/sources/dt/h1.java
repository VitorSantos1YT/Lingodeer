package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h1 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23849a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f23850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.f f23852d;

    public /* synthetic */ h1(d dVar, boolean z11, fz.f fVar) {
        this.f23850b = dVar;
        this.f23851c = z11;
        this.f23852d = fVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f23849a) {
            case 0:
                num.getClass();
                e.s(this.f23850b, this.f23851c, this.f23852d, nVar, l1.t.M(1));
                break;
            default:
                int iIntValue = num.intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e.s(this.f23850b, this.f23851c, this.f23852d, sVar, 0);
                } else {
                    sVar.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ h1(d dVar, boolean z11, fz.f fVar, int i11) {
        this.f23850b = dVar;
        this.f23851c = z11;
        this.f23852d = fVar;
    }
}
