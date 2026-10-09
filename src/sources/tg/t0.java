package tg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f52371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.f f52372c;

    public /* synthetic */ t0(z1.r rVar, fz.f fVar, int i11) {
        this.f52370a = i11;
        this.f52371b = rVar;
        this.f52372c = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f52370a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar = (l1.s) nVar;
                    if (sVar.F()) {
                        sVar.W();
                    } else {
                        v.a(this.f52371b, null, this.f52372c, nVar, 0, 2);
                    }
                } else {
                    v.a(this.f52371b, null, this.f52372c, nVar, 0, 2);
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        v.a(this.f52371b, null, this.f52372c, nVar2, 0, 2);
                    }
                } else {
                    v.a(this.f52371b, null, this.f52372c, nVar2, 0, 2);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
