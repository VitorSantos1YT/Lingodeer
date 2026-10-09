package ay;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3310b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f3313e;

    public h(qx.h hVar, int i11, int i12, gy.b bVar) {
        super(hVar);
        this.f3311c = i11;
        this.f3312d = i12;
        this.f3313e = bVar;
    }

    @Override // qx.h
    public final void j(qx.k kVar) {
        switch (this.f3310b) {
            case 0:
                tx.f fVar = (tx.f) this.f3313e;
                qx.i iVar = this.f3265a;
                int i11 = this.f3312d;
                int i12 = this.f3311c;
                if (i11 != i12) {
                    ((qx.h) iVar).i(new g(kVar, i12, i11, fVar));
                } else {
                    f fVar2 = new f(kVar, i12, fVar);
                    if (fVar2.a()) {
                        ((qx.h) iVar).i(fVar2);
                    }
                }
                break;
            default:
                tx.d dVar = (tx.d) this.f3313e;
                qx.i iVar2 = this.f3265a;
                if (!se.k.E(iVar2, kVar, dVar)) {
                    ((qx.h) iVar2).i(new u(kVar, dVar, this.f3311c, this.f3312d));
                    break;
                }
                break;
        }
    }

    public h(qx.h hVar, tx.d dVar, int i11, int i12) {
        super(hVar);
        this.f3313e = dVar;
        this.f3311c = i11;
        this.f3312d = i12;
    }
}
