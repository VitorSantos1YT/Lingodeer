package ay;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends qx.p implements wx.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f3286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tx.e f3287d;

    public /* synthetic */ e(w wVar, tx.e eVar, int i11) {
        this.f3285b = i11;
        this.f3286c = wVar;
        this.f3287d = eVar;
    }

    @Override // qx.p
    public final void I(qx.q qVar) {
        switch (this.f3285b) {
            case 0:
                this.f3286c.i(new d(qVar, this.f3287d, 0));
                break;
            default:
                this.f3286c.i(new d(qVar, this.f3287d, 1));
                break;
        }
    }

    @Override // wx.a
    public final qx.h a() {
        switch (this.f3285b) {
            case 0:
                return new c(this.f3286c, this.f3287d, 0);
            default:
                return new c(this.f3286c, this.f3287d, 1);
        }
    }
}
