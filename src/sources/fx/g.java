package fx;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f28241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(uw.h hVar, Object obj, int i11) {
        super(hVar);
        this.f28240b = i11;
        this.f28241c = obj;
    }

    @Override // uw.h
    public final void c(uw.i iVar) {
        switch (this.f28240b) {
            case 0:
                this.f28228a.b(new f(iVar, (yw.d) this.f28241c, 0));
                break;
            case 1:
                this.f28228a.b(new q(iVar, (uw.n) this.f28241c));
                break;
            default:
                this.f28228a.b(new u(iVar, (uw.h) this.f28241c));
                break;
        }
    }
}
