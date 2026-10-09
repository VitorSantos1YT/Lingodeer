package zx;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f59629c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(qx.d dVar, int i11) {
        super(dVar);
        this.f59629c = i11;
    }

    @Override // qx.d
    public final void e(n20.b bVar) {
        switch (this.f59629c) {
            case 0:
                this.f59592b.d(new o(bVar));
                break;
            default:
                this.f59592b.d(new q(bVar));
                break;
        }
    }
}
