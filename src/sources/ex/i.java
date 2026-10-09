package ex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.firebase.inappmessaging.internal.m f26022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nx.c f26024e;

    public i(i0 i0Var, com.google.firebase.inappmessaging.internal.m mVar, nx.c cVar) {
        super(i0Var);
        this.f26022c = mVar;
        this.f26023d = 2;
        this.f26024e = cVar;
    }

    @Override // uw.d
    public final void e(n20.b bVar) {
        n20.b dVar;
        uw.d dVar2 = this.f25954b;
        com.google.firebase.inappmessaging.internal.m mVar = this.f26022c;
        if (ob.f.P(dVar2, bVar, mVar)) {
            return;
        }
        int i11 = b.f25960a[this.f26024e.ordinal()];
        int i12 = this.f26023d;
        if (i11 != 1) {
            dVar = i11 != 2 ? new e(bVar, mVar, i12) : new d(bVar, mVar, i12, true);
        } else {
            dVar = new d(bVar, mVar, i12, false);
        }
        dVar2.a(dVar);
    }
}
