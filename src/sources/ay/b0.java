package ay;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends qx.b implements wx.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qx.h f3271e;

    public b0(qx.h hVar) {
        this.f3271e = hVar;
    }

    @Override // qx.b
    public final void L(qx.c cVar) {
        this.f3271e.i(new z(cVar));
    }

    @Override // wx.a
    public final qx.h a() {
        return new a0(this.f3271e);
    }
}
