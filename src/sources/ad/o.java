package ad;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f623b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i11) {
        super(0);
        this.f622a = i11;
        this.f623b = pVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f622a) {
            case 0:
                p pVar = this.f623b;
                return Boolean.valueOf((((wc.h) pVar.f625b.getValue()) == null && ((Throwable) pVar.f626c.getValue()) == null) ? false : true);
            case 1:
                return Boolean.valueOf(((Throwable) this.f623b.f626c.getValue()) != null);
            case 2:
                p pVar2 = this.f623b;
                return Boolean.valueOf(((wc.h) pVar2.f625b.getValue()) == null && ((Throwable) pVar2.f626c.getValue()) == null);
            default:
                return Boolean.valueOf(((wc.h) this.f623b.f625b.getValue()) != null);
        }
    }
}
