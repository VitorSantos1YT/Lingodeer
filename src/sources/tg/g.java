package tg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.d f52279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f52280c;

    public /* synthetic */ g(t1.d dVar, i0 i0Var, int i11) {
        this.f52278a = i11;
        this.f52279b = dVar;
        this.f52280c = i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f52278a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar = (l1.s) nVar;
                    if (sVar.F()) {
                        sVar.W();
                    } else {
                        this.f52279b.invoke(this.f52280c, nVar, 0);
                    }
                } else {
                    this.f52279b.invoke(this.f52280c, nVar, 0);
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        this.f52279b.invoke(this.f52280c, nVar2, 0);
                    }
                } else {
                    this.f52279b.invoke(this.f52280c, nVar2, 0);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
