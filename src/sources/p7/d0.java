package p7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements b7.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k7.c f46346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f46347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f46348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46349d;

    public /* synthetic */ d0(k7.c cVar, s sVar, x xVar, int i11) {
        this.f46346a = cVar;
        this.f46347b = sVar;
        this.f46348c = xVar;
        this.f46349d = i11;
    }

    @Override // b7.g
    public final void accept(Object obj) {
        h0 h0Var = (h0) obj;
        k7.c cVar = this.f46346a;
        h0Var.G(cVar.f37956a, cVar.f37957b, this.f46347b, this.f46348c, this.f46349d);
    }
}
