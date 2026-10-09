package tg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52308b;

    public /* synthetic */ k(Object obj, int i11) {
        this.f52307a = i11;
        this.f52308b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f52307a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar = (l1.s) nVar;
                    if (sVar.F()) {
                        sVar.W();
                    } else {
                        ((fz.e) this.f52308b).invoke(nVar, 0);
                    }
                } else {
                    ((fz.e) this.f52308b).invoke(nVar, 0);
                }
                return qy.b0.f48488a;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        ((fz.e) this.f52308b).invoke(nVar2, 0);
                    }
                } else {
                    ((fz.e) this.f52308b).invoke(nVar2, 0);
                }
                return qy.b0.f48488a;
            case 2:
                l1.n nVar3 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar3 = (l1.s) nVar3;
                    if (sVar3.F()) {
                        sVar3.W();
                    } else {
                        ((fz.e) this.f52308b).invoke(nVar3, 0);
                    }
                } else {
                    ((fz.e) this.f52308b).invoke(nVar3, 0);
                }
                return qy.b0.f48488a;
            default:
                ((Number) obj2).intValue();
                l1.s sVar4 = (l1.s) ((l1.n) obj);
                sVar4.d0(666084174);
                String str = ((v0.d) this.f52308b).f53454b;
                sVar4.p(false);
                return str;
        }
    }
}
