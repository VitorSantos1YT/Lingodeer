package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sc implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dd f50388b;

    public /* synthetic */ sc(dd ddVar, int i11) {
        this.f50387a = i11;
        this.f50388b = ddVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f50387a) {
            case 0:
                return this.f50388b.f50720t;
            case 1:
                this.f50388b.t(xb.f50655a);
                return qy.b0.f48488a;
            default:
                this.f50388b.t(yb.f50724a);
                return qy.b0.f48488a;
        }
    }
}
