package ay;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends qx.h implements iy.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3288a;

    public e0(Object obj) {
        this.f3288a = obj;
    }

    @Override // tx.f
    public final Object get() {
        return this.f3288a;
    }

    @Override // qx.h
    public final void j(qx.k kVar) {
        i0 i0Var = new i0(kVar, this.f3288a);
        kVar.c(i0Var);
        i0Var.run();
    }
}
