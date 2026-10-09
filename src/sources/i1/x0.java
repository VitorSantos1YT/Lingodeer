package i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f34097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.e f34098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(long j11, fz.e eVar, int i11) {
        super(2);
        this.f34096a = i11;
        this.f34097b = j11;
        this.f34098c = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34096a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar = (l1.s) nVar;
                    if (sVar.F()) {
                        sVar.W();
                    } else {
                        d1.c(this.f34097b, this.f34098c, nVar, 0);
                    }
                } else {
                    d1.c(this.f34097b, this.f34098c, nVar, 0);
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        d1.c(this.f34097b, this.f34098c, nVar2, 0);
                    }
                } else {
                    d1.c(this.f34097b, this.f34098c, nVar2, 0);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
