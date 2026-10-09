package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f31096b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2(fz.c cVar, int i11) {
        super(0);
        this.f31095a = i11;
        this.f31096b = cVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f31095a) {
            case 0:
                this.f31096b.invoke(new x3(1));
                break;
            default:
                this.f31096b.invoke(new x3(0));
                break;
        }
        return qy.b0.f48488a;
    }
}
