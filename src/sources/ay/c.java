package ay;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tx.e f3273c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(w wVar, tx.e eVar, int i11) {
        super(wVar);
        this.f3272b = i11;
        this.f3273c = eVar;
    }

    @Override // qx.h
    public final void j(qx.k kVar) {
        switch (this.f3272b) {
            case 0:
                ((qx.h) this.f3265a).i(new b(kVar, this.f3273c, 0));
                break;
            default:
                ((qx.h) this.f3265a).i(new b(kVar, this.f3273c, 1));
                break;
        }
    }
}
