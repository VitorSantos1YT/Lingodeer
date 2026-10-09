package zx;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qx.o f59636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f59637d;

    public s(qx.d dVar, qx.o oVar) {
        super(dVar);
        this.f59636c = oVar;
        this.f59637d = true;
    }

    @Override // qx.d
    public final void e(n20.b bVar) {
        qx.n nVarA = this.f59636c.a();
        r rVar = new r(bVar, nVarA, this.f59592b, this.f59637d);
        bVar.c(rVar);
        nVarA.d(rVar);
    }
}
