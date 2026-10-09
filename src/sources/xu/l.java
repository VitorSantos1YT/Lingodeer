package xu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f56444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f56445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f56446d;

    public /* synthetic */ l(fz.a aVar, fz.a aVar2, fz.a aVar3, int i11, int i12) {
        this.f56443a = i12;
        this.f56444b = aVar;
        this.f56445c = aVar2;
        this.f56446d = aVar3;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f56443a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                c.e(this.f56444b, this.f56445c, this.f56446d, nVar, l1.t.M(391));
                break;
            case 1:
                r.c(this.f56444b, this.f56445c, this.f56446d, nVar, l1.t.M(391));
                break;
            default:
                r.d(this.f56444b, this.f56445c, this.f56446d, nVar, l1.t.M(391));
                break;
        }
        return qy.b0.f48488a;
    }
}
