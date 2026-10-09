package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f53301a;

    public h(i iVar) {
        this.f53301a = iVar;
    }

    @Override // uz.i
    public final Object collect(j jVar, vy.d dVar) {
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.f38361a = vz.b.f54329b;
        Object objCollect = this.f53301a.collect(new g(this, yVar, jVar), dVar);
        return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : qy.b0.f48488a;
    }
}
