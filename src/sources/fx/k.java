package fx;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yw.c f28251c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(uw.h hVar, yw.c cVar, int i11) {
        super(hVar);
        this.f28250b = i11;
        this.f28251c = cVar;
    }

    @Override // uw.h
    public final void c(uw.i iVar) {
        switch (this.f28250b) {
            case 0:
                this.f28228a.b(new j(iVar, this.f28251c));
                break;
            case 1:
                this.f28228a.b(new dx.e(iVar, this.f28251c, 1));
                break;
            default:
                this.f28228a.b(new r(iVar, this.f28251c));
                break;
        }
    }
}
