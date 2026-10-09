package w9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends c7.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f54824c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, int i11) {
        super(i11, 2);
        this.f54824c = pVar;
    }

    @Override // c7.f
    public final void h(la.b bVar) {
        this.f54824c.d(new z9.a(bVar));
    }

    @Override // c7.f
    public final void k(la.b bVar, int i11, int i12) {
        m(bVar, i11, i12);
    }

    @Override // c7.f
    public final void l(la.b bVar) throws Throwable {
        z9.a aVar = new z9.a(bVar);
        p pVar = this.f54824c;
        pVar.f(aVar);
        pVar.f54831g = bVar;
    }

    @Override // c7.f
    public final void m(la.b bVar, int i11, int i12) {
        this.f54824c.e(new z9.a(bVar), i11, i12);
    }
}
