package p7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements b7.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k7.c f46361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f46362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f46363d;

    public /* synthetic */ e0(k7.c cVar, s sVar, x xVar, int i11) {
        this.f46360a = i11;
        this.f46361b = cVar;
        this.f46362c = sVar;
        this.f46363d = xVar;
    }

    @Override // b7.g
    public final void accept(Object obj) {
        h0 h0Var = (h0) obj;
        switch (this.f46360a) {
            case 0:
                k7.c cVar = this.f46361b;
                h0Var.o(cVar.f37956a, cVar.f37957b, this.f46362c, this.f46363d);
                break;
            default:
                k7.c cVar2 = this.f46361b;
                h0Var.c(cVar2.f37956a, cVar2.f37957b, this.f46362c, this.f46363d);
                break;
        }
    }
}
