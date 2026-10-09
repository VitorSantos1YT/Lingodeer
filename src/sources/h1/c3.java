package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f30078b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(String str, int i11) {
        super(2);
        this.f30077a = i11;
        this.f30078b = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30077a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar = (l1.s) nVar;
                    if (sVar.F()) {
                        sVar.W();
                    } else {
                        ua.b(this.f30078b, g3.r.a(z1.o.f58481a, o0.f30769f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, nVar, 0, 0, 131068);
                    }
                } else {
                    ua.b(this.f30078b, g3.r.a(z1.o.f58481a, o0.f30769f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, nVar, 0, 0, 131068);
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        ua.b(this.f30078b, g3.r.a(z1.o.f58481a, o0.f30770t), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, nVar2, 0, 0, 131068);
                    }
                } else {
                    ua.b(this.f30078b, g3.r.a(z1.o.f58481a, o0.f30770t), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, nVar2, 0, 0, 131068);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
