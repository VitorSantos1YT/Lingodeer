package ch;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f7074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f7075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f7076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7077e;

    public /* synthetic */ n0(int i11, fz.a aVar, fz.a aVar2, fz.a aVar3, int i12) {
        this.f7073a = 3;
        this.f7077e = i11;
        this.f7074b = aVar;
        this.f7075c = aVar2;
        this.f7076d = aVar3;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7073a) {
            case 0:
                ((Integer) obj2).getClass();
                a.b(this.f7074b, this.f7075c, this.f7076d, (l1.n) obj, l1.t.M(this.f7077e | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                et.a.c(this.f7074b, this.f7075c, this.f7076d, (l1.n) obj, l1.t.M(this.f7077e | 1));
                break;
            case 2:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    iu.k.g(this.f7074b, null, jr.a.f36574t, null, t1.e.d(-365235449, new jr.h0(this.f7077e, this.f7075c, this.f7076d), sVar), null, null, null, sVar, 24960, 234);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 3:
                ((Integer) obj2).getClass();
                ku.a.g(this.f7077e, this.f7074b, this.f7075c, this.f7076d, (l1.n) obj, l1.t.M(1));
                break;
            default:
                ((Integer) obj2).getClass();
                xu.c.i(this.f7074b, this.f7075c, this.f7076d, (l1.n) obj, l1.t.M(this.f7077e | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ n0(fz.a aVar, fz.a aVar2, int i11, fz.a aVar3) {
        this.f7073a = 2;
        this.f7074b = aVar;
        this.f7075c = aVar2;
        this.f7077e = i11;
        this.f7076d = aVar3;
    }

    public /* synthetic */ n0(fz.a aVar, fz.a aVar2, fz.a aVar3, int i11, int i12) {
        this.f7073a = i12;
        this.f7074b = aVar;
        this.f7075c = aVar2;
        this.f7076d = aVar3;
        this.f7077e = i11;
    }
}
