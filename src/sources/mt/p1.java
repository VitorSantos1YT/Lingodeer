package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p1 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f41751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f41752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f41753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f41754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.a f41755f;

    public /* synthetic */ p1(boolean z11, String str, fz.c cVar, fz.a aVar, fz.a aVar2, int i11) {
        this.f41750a = i11;
        this.f41751b = z11;
        this.f41752c = str;
        this.f41753d = cVar;
        this.f41754e = aVar;
        this.f41755f = aVar2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f41750a;
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z1.o oVar = z1.o.f58481a;
                    if (this.f41751b) {
                        sVar.d0(922416791);
                        v1.h(this.f41752c, this.f41753d, this.f41754e, j0.e2.e(oVar, 1.0f), sVar, 3072);
                        sVar.p(false);
                    } else {
                        sVar.d0(922677098);
                        v1.i(48, this.f41755f, sVar, j0.e2.e(oVar, 1.0f));
                        sVar.p(false);
                    }
                } else {
                    sVar.W();
                }
                break;
            default:
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z1.o oVar2 = z1.o.f58481a;
                    if (this.f41751b) {
                        sVar2.d0(-930333874);
                        v1.h(this.f41752c, this.f41753d, this.f41754e, j0.e2.e(oVar2, 1.0f), sVar2, 3072);
                        sVar2.p(false);
                    } else {
                        sVar2.d0(-929990983);
                        v1.i(48, this.f41755f, sVar2, j0.e2.e(oVar2, 1.0f));
                        sVar2.p(false);
                    }
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
