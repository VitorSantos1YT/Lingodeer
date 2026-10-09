package ex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26083c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(uw.d dVar, int i11) {
        super(dVar);
        this.f26083c = i11;
    }

    @Override // uw.d
    public final void e(n20.b bVar) {
        switch (this.f26083c) {
            case 0:
                this.f25954b.d(new v(bVar));
                break;
            case 1:
                this.f25954b.d(new a1(bVar));
                break;
            default:
                this.f25954b.d(new b1(bVar));
                break;
        }
    }
}
