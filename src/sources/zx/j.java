package zx;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qx.o f59608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59609d;

    public j(qx.d dVar, qx.o oVar, int i11) {
        super(dVar);
        this.f59608c = oVar;
        this.f59609d = i11;
    }

    @Override // qx.d
    public final void e(n20.b bVar) {
        this.f59592b.d(new i(bVar, this.f59608c.a(), this.f59609d));
    }
}
