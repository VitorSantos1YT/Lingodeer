package h2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f31509b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i11) {
        super(1);
        this.f31508a = i11;
        this.f31509b = rVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f31508a) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                r rVar = this.f31509b;
                return Double.valueOf(rVar.f31520n.a(hz.b.j(dDoubleValue, rVar.f31512e, rVar.f31513f)));
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                r rVar2 = this.f31509b;
                return Double.valueOf(hz.b.j(rVar2.f31518k.a(dDoubleValue2), rVar2.f31512e, rVar2.f31513f));
        }
    }
}
